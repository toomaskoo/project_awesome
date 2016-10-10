import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;

public class Main extends Application {

    Stage window;
    Scene wysiwyg, index, css;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)  {
        primaryStage.setTitle("WYSIWYG");


        Label label1 = new Label("Welcome to WYSIWYG EDITOR");
        Button uus = new Button("Start new project");
        uus.setOnAction((event) -> {//nupp uus teeb järgmisi toiminguid ->
            File i = new File("index.html");
            try {
                i.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            File s = new File("styles.css");
            try {
                s.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();// IO exception vajalik, muidu ei tööta
            }

        });

        HBox layout1 = new HBox();//horisontaalne layout
        layout1.getChildren().add(uus);//lisab layout 1 nupu uus
        layout1.getChildren().add(label1);//tervitus 
        Scene wysiwyg = new Scene(layout1, 1024, 768);// scene suurus 1024x768
        primaryStage.setScene(wysiwyg);//primary stage setscene
        primaryStage.show();//selfexplaining

    }




}


