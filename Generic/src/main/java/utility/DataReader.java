package utility;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataReader {

    Workbook workbook = null;
    Sheet sheet = null;
    int numberOfRows, numberOfCols;

    public String[] readExcel(String path, int sheetNumber) throws IOException, InvalidFormatException {
        String[] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        workbook = WorkbookFactory.create(fis);
        sheet = workbook.getSheetAt(sheetNumber);
        numberOfRows = sheet.getLastRowNum();
        numberOfCols = sheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1];

        for(int i = 1; i < data.length; i++) {
            Row rows = sheet.getRow(i);
            for(int j = 0; j < numberOfCols; j++) {
                Cell cell = rows.getCell(j);
                String cellData = getCellValue(cell);
                data[i] = cellData;
            }
        }
        return data;
    }

    public String[][] readExcel2D(String path, int sheetNumber) throws IOException, InvalidFormatException {
        String[][] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        workbook = WorkbookFactory.create(fis);
        sheet = workbook.getSheetAt(sheetNumber);
        numberOfRows = sheet.getLastRowNum();
        numberOfCols = sheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1][numberOfCols + 1];

        for(int i = 1; i < data.length; i++) {
            Row rows = sheet.getRow(i);
            for(int j = 0; j < numberOfCols; j++) {
                Cell cell = rows.getCell(j);
                String cellData = getCellValue(cell);
                data[i][j] = cellData;
            }
        }
        return data;
    }

    public String getCellValue(Cell cell) {
        Object value = null;

        int dataType = cell.getCellType();
        switch (dataType) {
            case Cell.CELL_TYPE_NUMERIC:
                value = cell.getNumericCellValue();
                break;
            case Cell.CELL_TYPE_STRING:
                value = cell.getStringCellValue();
                break;
            case Cell.CELL_TYPE_BOOLEAN:
                value = cell.getBooleanCellValue();
                break;
        }
        return value.toString();
    }
}
