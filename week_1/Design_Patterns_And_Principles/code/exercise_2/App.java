package assignemts.cts;

public class App 
{
    public static void main( String[] args )
    {
    	DocumentFactory wf = new WordDocumentFactory();
        Document wd = wf.createDocument();
        wd.open();

        DocumentFactory pf = new PdfDocumentFactory();
        Document pd = pf.createDocument();
        pd.open();

        DocumentFactory ef = new ExcelDocumentFactory();
        Document ed = ef.createDocument();
        ed.open();
    }
}
