package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button eda;

    @FXML
    private Label edaL;

    @FXML
    private Button jile;

    @FXML
    private Label jileL;

    @FXML
    private Label gigienaL;

    @FXML
    private Button gigiena;

    @FXML
    private Button mashina;

    @FXML
    private Label mashinaL;

    @FXML
    private Button odejda;

    @FXML
    private Label odejdaL;

    @FXML
    private Button kafe;

    @FXML
    private Label kafeL;

    @FXML
    private Button scheta;

    @FXML
    private Label schetaL;

    @FXML
    private Button zdorovie;

    @FXML
    private Label zdorovieL;

    @FXML
    private Button taxi;

    @FXML
    private Label taxiL;

    @FXML
    private Button razvlecheniya;

    @FXML
    private Label razvlecheniyaL;

    @FXML
    private Button pitomsy;

    @FXML
    private Label pitomsyL;

    @FXML
    private Button svyaz;

    @FXML
    private Label svyazL;

    @FXML
    private Button sport;

    @FXML
    private Label sportL;

    @FXML
    private Button transport;

    @FXML
    private Label transportL;

    @FXML
    private Button podarki;

    @FXML
    private Label podarkiL;

    @FXML
    private TextField add;

    @FXML
    private Button zarplata;

    @FXML
    private Label zarplataL;

    @FXML
    private Button sberejeniya;

    @FXML
    private Label sberejeniyaL;

    @FXML
    private Button depoziti;

    @FXML
    private Label depozitiL;

    @FXML
    private Label rashody;

    @FXML
    private Label schet;

    static int gigenaInt;
    static int edaInt;
    static int jileInt;
    static int mashinaInt;
    static int odejdaInt;
    static int zdorovieInt;
    static int kafeInt;
    static int schetaInt;
    static int taxiInt;
    static int razvlecheniyaInt;
    static int sportInt;
    static int pitomsyInt;
    static int svyazInt;
    static int transportInt;
    static int podarkiInt;
    static int schetInt;
    static int rashodyInt;
    static int depozitiInt;
    static int zarplataInt;
    static int sberejeniyaInt;


    @FXML
    void initialize() {

        // Гигиена
        gigiena.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Гигиена
            gigenaInt += addsint;
            gigienaL.setText(String.valueOf(gigenaInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

            // Проверка
            System.out.println("worked");
            System.out.println(rashodyInt);
            System.out.println(schetInt);

        });

        // Еда
        eda.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Еда
            edaInt += addsint;
            edaL.setText(String.valueOf(edaInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Жилье
        jile.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Жилье
            jileInt += addsint;
            jileL.setText(String.valueOf(jileInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Машина
        mashina.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Машина
            mashinaInt += addsint;
            mashinaL.setText(String.valueOf(mashinaInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Одежда
        odejda.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Одежда
            odejdaInt += addsint;
            odejdaL.setText(String.valueOf(odejdaInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Здоровье
        zdorovie.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Здоровье
            zdorovieInt += addsint;
            zdorovieL.setText(String.valueOf(zdorovieInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Кафе
        kafe.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Кафе
            kafeInt += addsint;
            kafeL.setText(String.valueOf(kafeInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Счета
        scheta.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Счета
            schetaInt += addsint;
            schetaL.setText(String.valueOf(schetaInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Такси
        taxi.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Такси
            taxiInt += addsint;
            taxiL.setText(String.valueOf(taxiInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Развлечения
        razvlecheniya.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Развлечения
            razvlecheniyaInt += addsint;
            razvlecheniyaL.setText(String.valueOf(razvlecheniyaInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Спорт
        sport.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Спорт
            sportInt += addsint;
            sportL.setText(String.valueOf(sportInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Питомцы
        pitomsy.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Питомцы
            pitomsyInt += addsint;
            pitomsyL.setText(String.valueOf(pitomsyInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Связь
        svyaz.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Связь
            svyazInt += addsint;
            svyazL.setText(String.valueOf(svyazInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Транспорт
        transport.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Транспорт
            transportInt += addsint;

            transportL.setText(String.valueOf(transportInt));
            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Подарки
        podarki.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Подарки
            podarkiInt += addsint;
            podarkiL.setText(String.valueOf(podarkiInt));

            // Расходы
            rashodyInt += addsint;
            rashody.setText("Расходы: "+ rashodyInt);

            // Счёт
            schetInt -= addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Депозиты
        depoziti.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Депозиты
            depozitiInt += addsint;
            depozitiL.setText(String.valueOf(depozitiInt));

            // Счёт
            schetInt += addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Зарплата
        zarplata.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Зарплата
            zarplataInt += addsint;
            zarplataL.setText(String.valueOf(zarplataInt));

            // Счёт
            schetInt += addsint;
            schet.setText("Счёт: "+ schetInt);

        });

        // Сбережения
        sberejeniya.setOnAction(event -> {
            String adds = add.getText();
            int addsint = Integer.parseInt(adds);
            add.setText("");

            // Сбережения
            sberejeniyaInt += addsint;
            sberejeniyaL.setText(String.valueOf(sberejeniyaInt));

            // Счёт
            schetInt += addsint;
            schet.setText("Счёт: "+ schetInt);

        });



    }

}







//        assert eda != null : "fx:id=\"eda\" was not injected: check your FXML file 'sample.fxml'.";
//        assert edaL != null : "fx:id=\"edaL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert jile != null : "fx:id=\"jile\" was not injected: check your FXML file 'sample.fxml'.";
//        assert jileL != null : "fx:id=\"jileL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert gigienaL != null : "fx:id=\"gigienaL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert gigiena != null : "fx:id=\"gigiena\" was not injected: check your FXML file 'sample.fxml'.";
//        assert mashina != null : "fx:id=\"mashina\" was not injected: check your FXML file 'sample.fxml'.";
//        assert mashinaL != null : "fx:id=\"mashinaL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert odejda != null : "fx:id=\"odejda\" was not injected: check your FXML file 'sample.fxml'.";
//        assert odejdaL != null : "fx:id=\"odejdaL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert kafe != null : "fx:id=\"kafe\" was not injected: check your FXML file 'sample.fxml'.";
//        assert kafeL != null : "fx:id=\"kafeL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert scheta != null : "fx:id=\"scheta\" was not injected: check your FXML file 'sample.fxml'.";
//        assert schetaL != null : "fx:id=\"schetaL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert zdorovie != null : "fx:id=\"zdorovie\" was not injected: check your FXML file 'sample.fxml'.";
//        assert zdorovieL != null : "fx:id=\"zdorovieL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert taxi != null : "fx:id=\"taxi\" was not injected: check your FXML file 'sample.fxml'.";
//        assert taxiL != null : "fx:id=\"taxiL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert razvlecheniya != null : "fx:id=\"razvlecheniya\" was not injected: check your FXML file 'sample.fxml'.";
//        assert razvlecheniyaL != null : "fx:id=\"razvlecheniyaL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert pitomsy != null : "fx:id=\"pitomsy\" was not injected: check your FXML file 'sample.fxml'.";
//        assert pitomsyL != null : "fx:id=\"pitomsyL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert svyaz != null : "fx:id=\"svyaz\" was not injected: check your FXML file 'sample.fxml'.";
//        assert svyazL != null : "fx:id=\"svyazL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert sport != null : "fx:id=\"sport\" was not injected: check your FXML file 'sample.fxml'.";
//        assert sportL != null : "fx:id=\"sportL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert transport != null : "fx:id=\"transport\" was not injected: check your FXML file 'sample.fxml'.";
//        assert transportL != null : "fx:id=\"transportL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert podarki != null : "fx:id=\"podarki\" was not injected: check your FXML file 'sample.fxml'.";
//        assert podarkiL != null : "fx:id=\"podarkiL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert add != null : "fx:id=\"add\" was not injected: check your FXML file 'sample.fxml'.";
//        assert zarplata != null : "fx:id=\"zarplata\" was not injected: check your FXML file 'sample.fxml'.";
//        assert zarplataL != null : "fx:id=\"zarplataL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert sberejeniya != null : "fx:id=\"sberejeniya\" was not injected: check your FXML file 'sample.fxml'.";
//        assert sberejeniyaL != null : "fx:id=\"sberejeniyaL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert depoziti != null : "fx:id=\"depoziti\" was not injected: check your FXML file 'sample.fxml'.";
//        assert depozitiL != null : "fx:id=\"depozitiL\" was not injected: check your FXML file 'sample.fxml'.";
//        assert rashody != null : "fx:id=\"rashody\" was not injected: check your FXML file 'sample.fxml'.";
//        assert schet != null : "fx:id=\"schet\" was not injected: check your FXML file 'sample.fxml'.";





