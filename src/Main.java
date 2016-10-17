import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileWriter;

public class Main extends Application {
    private TextField primary = new TextField();
    private TextField indextext = new TextField();
    private TextField csstext = new TextField();


    FileWriter index = null;
    FileWriter index = new FileWriter(File index.html, true);

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("WYSIWYG");
        Pane layout = new Pane();
        Text welcome = new Text(500, 500, "Welcome to the WYSIWYG EDITOR. Click START or RETRIEVE STARTED PROJECT");
        welcome.setFont(new Font(50));
        layout.getChildren().addAll(welcome);
        layout.setCenterShape(true);

        Scene editor = new Scene(layout, 1024, 768);
        primaryStage.show();

    }
}

