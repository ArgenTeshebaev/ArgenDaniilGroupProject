package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main extends Application {
    public static ArrayList<String> arr=new ArrayList<String >();
    public Main() {
    }



    public static void main(String[] args) throws SQLException {
        DBworker worker = new DBworker();
        String query ="SELECT TOP (1000) [title]\n" +
                "  FROM [Argen].[dbo].[Table_3]"
                ;
        try{
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet =statement.executeQuery(query);

            while (resultSet.next()){
                arr.add(resultSet.getString(1).replaceAll("\s+",""));
            }}
        catch (SQLException e){
            e.printStackTrace(); }

        launch(args);
    }
    public void start(Stage primaryStage) throws Exception {

        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("sample.fxml"));
        primaryStage.setTitle(String.valueOf(arr.get(0)));
        primaryStage.setScene(new Scene(root, 600.0D, 700.0D));
        primaryStage.show();
    }
}