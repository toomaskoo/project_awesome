import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;

public class Main extends Application {

    Stage window;
    Scene wysiwyg, index, css, wysiwygmain;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)  {
        primaryStage.setTitle("WYSIWYG");


        Label tere = new Label("Welcome to WYSIWYG EDITOR!");
        Button uus = new Button("Start new project");
        uus.setOnAction((event) -> {//nupp uus teeb järgmisi toiminguid ->
            File i = new File("index.html");
            try {
                i.createNewFile();//i on index.html
            } catch (IOException e) {
                e.printStackTrace();
            }
            File s = new File("styles.css");
            try {
                s.createNewFile();//s on Styles.css
            } catch (IOException e) {
                e.printStackTrace();// IO exception vajalik, muidu ei tööta
            }
            primaryStage.setScene(wysiwygmain);//teksti muutmise window avaneb KATKI VEEL
        });

        StackPane layout1 = new StackPane();//paneb keskele nupu
        layout1.getChildren().add(uus);//lisab layout 1 nupu uus
        Scene wysiwyg = new Scene(layout1, 1024, 768);// scene suurus 1024x768
        primaryStage.setScene(wysiwyg);//primary stage setscene
        primaryStage.show();//selfexplaining

        HBox mainlayout = new HBox();// 2. lehekülje joondus
        mainlayout.getChildren().add(tere);//2. lehekülje layout
        Scene wysiwygmain = new Scene(mainlayout);//mis scene kasutusel on 2. leheküljel

    }



}


