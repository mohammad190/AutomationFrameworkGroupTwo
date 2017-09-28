package pages.homepage;

import utility.DataReader;

public class SearchReceiptNumber {

    DataReader dataReader = new DataReader();
    public String [] getDataFromExcelFile(String filePath, int sheetNumber)throws Exception {
        String path = System.getProperty("user.dir")+ filePath;
        String [] st = dataReader.readExcel(path, sheetNumber);
        return st;
    }
}
