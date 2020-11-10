package kr.co.gdu.cashapi.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

@Component("cashListExcel")
public class CashListExcel extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//응답 body의 내용을 파일로 전송(파일이름은 cash_list.xls) 중간에 "''"불가능해서 역슬래시 사용 
		response.setHeader("Content-Disponsition", "attachment; filename=\"cash_list.xls\"");
		//매개변수로 입력받은 Workbook(액셀파일객체)에 첫번째 시트를 접근
		Sheet sheet1 = workbook.createSheet("sheet1");
		sheet1.createRow(0).createCell(0).setCellValue("이름");
		//sheet1.createRow(0).createCell(1).setCellValue("구디아카데미");
	}
	
}
