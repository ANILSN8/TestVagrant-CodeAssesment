package GenericUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * To fetch the data from excel sheet
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 */
	public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws Throwable {
		Workbook workbook= WorkbookFactory.create(new FileInputStream("./src/test/resources/Excel.xlsx"));
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(cell);
		return data;
	}
}
