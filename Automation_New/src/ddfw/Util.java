package ddfw;

import java.util.ArrayList;

import org.jxls.reader.ReaderBuilder;

import com.excel.utility.Xls_Reader;

public class Util {
Xls_Reader reader;
	public static ArrayList<Object[]> getdataFromExcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
	
		try {
			reader = new Xls_Reader("F:\\Selenium\\Workspace\\Automation_New\\src\\ddfw\\dataprovider_TestData.xls");
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	for (int rowNum =2 ; rowName <= reader.getRowCount(""); rowNum++ ) {
		String currentReatMethod = reader.getCellData("","",rowCnt);
		if (currentTestMethod)	
	}
}}
 // noe complite code plase see video