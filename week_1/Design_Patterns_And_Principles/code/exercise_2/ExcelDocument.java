package assignemts.cts;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}