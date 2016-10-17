import java.io.PrintWriter;

// antud klassis hakkavad olema kõik index.html vajalikud meetodid - <body>,
public class index {

    public void htmlstart() {
        PrintWriter html = new PrintWriter("<html>");
    }
    public void htmlend() {
        System.out.println("</html>");
    }


}