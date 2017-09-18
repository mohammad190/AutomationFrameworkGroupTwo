package excelReader;

import base.CommonAPI;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;

public class UsingExcel extends CommonAPI {

    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;

    public static void setExcelFile(String path, String sheetName) throws IOException {
        FileInputStream excelFile = new FileInputStream(path);
        workbook = new XSSFWorkbook(excelFile);
        sheet = workbook.getSheet(sheetName);
    }

    public static String[][] getTestData(String tableName) {
        String[][] testData = null;

        XSSFCell[] boundaryCells = findCells(tableName);
        XSSFCell startCell = boundaryCells[0];
        XSSFCell endCell = boundaryCells[1];

        int startRow = startCell.getRowIndex() + 1;
        int endRow = endCell.getRowIndex() - 1;
        int startColumn = startCell.getColumnIndex() + 1;
        int endColumn = endCell.getColumnIndex() - 1;

        testData = new String[endRow - startRow + 1][endColumn - startColumn + 1];

        for(int i = startRow; i < endRow; i++) {
            for(int j = startColumn; j < endColumn; j++) {
                testData[i - startRow][j - startColumn] = sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }
        return testData;
    }

    public static XSSFCell[] findCells(String tableName) {
        String pos = "begin";
        XSSFCell[] cells = new XSSFCell[2];
        for(Row row : sheet) {
            for(Cell cell : row) {
                if(tableName.equals(cell.getStringCellValue())) {
                    if(pos.equalsIgnoreCase("Begin")) {
                        cells[0] = (XSSFCell) cell;
                        pos = "end";
                    } else {
                        cells[1] = (XSSFCell) cell;
                    }
                }
            }
        }
        return cells;
    }

    @BeforeClass
    public void setUp(String Browser_Name, String URL, String File_Path, String sheetName) throws IOException {
        if(Browser_Name.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (Browser_Name.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (Browser_Name.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.IE.driver", "../Generic/driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (Browser_Name.equalsIgnoreCase("Opera")) {
            System.setProperty("webdriver.opera.driver", "../Generic/driver/operadriver.exe");
            driver = new OperaDriver();
        } else {
            System.err.println("ERROR: Choose from: Firefox/Chrome/IE/Opera.");
        }
    }

    public Object[][] dataProvider(String tableName) {
        Object[][] testData = getTestData(tableName);
        return testData;
    }
}

