package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Paculator");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label lenght = new Label("lenght:");
        grid.add(lenght, 0, 1);
        TextField lenghtTextField = new TextField();
        grid.add(lenghtTextField, 1, 1);

        Label height = new Label("height:");
        grid.add(height, 0, 2);
        TextField heightTextField = new TextField();
        grid.add(heightTextField, 1, 2);

        Label weight = new Label("weight:");
        grid.add(weight, 1, 2 );
        TextField weightTextField = new TextField();
        grid.add(weightTextField, 2, 2);

        Label depth = new Label("depth:");
        grid.add(depth, 0, 3);
        TextField depthTextField = new TextField();
        grid.add(depthTextField, 1, 3);

        Label dedpth = new Label("ddth:");

        Scene scene = new Scene(grid, 500, 400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}