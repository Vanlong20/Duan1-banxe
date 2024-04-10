/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan.uitil;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ACER
 */
public class PrintReport {
    public static void printExcel(JTable table, File file) {
        try {
            Workbook wb = new XSSFWorkbook();
            Sheet sheet = wb.createSheet("Report");
//            tạo header của cột
            Row r = sheet.createRow(0);
            TableModel model = table.getModel();
            for (int i = 0; i < model.getColumnCount(); i++) {
                Cell cell = r.createCell(i);
                cell.setCellValue(model.getColumnName(i));
            }

//            tạo dữ liẹt của bảng
            for (int i = 0; i < model.getRowCount(); i++) {
                Row row = sheet.createRow(i + 1);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Cell cell = row.createCell(j);
                    cell.setCellValue(model.getValueAt(i, j).toString());
                }
            }
            FileOutputStream fos = new FileOutputStream(file + ".xlsx");
            wb.write(fos);
            fos.close();
            wb.close();

            if (MsgBox.confirm(null, "Lưu thàng công. Bạn có muốn mở file lên không?")) {
                Desktop.getDesktop().open(new File(file + ".xlsx"));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

 
    
}
