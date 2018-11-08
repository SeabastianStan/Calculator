package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.embed.swing.JFXPanel;
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
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn3PlusMinus;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnDevide;

    @FXML
    private Button btnDot;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnPercent;

    @FXML
    private Button btnPlus;

    @FXML
    private TextField textInput;

    public Label pron;


    private long fnumber;
    private long snumber;
    private String operation;


    @FXML
    void initialize() {
        assert btn0 != null : "fx:id=\"btn0\" was not injected: check your FXML file 'View.fxml'.";
        assert btn0 != null : "fx:id=\"btn0\" was not injected: check your FXML file 'View.fxml'.";
        assert btn1 != null : "fx:id=\"btn1\" was not injected: check your FXML file 'View.fxml'.";
        assert btn2 != null : "fx:id=\"btn2\" was not injected: check your FXML file 'View.fxml'.";
        assert btn3 != null : "fx:id=\"btn3\" was not injected: check your FXML file 'View.fxml'.";
        assert btn3PlusMinus != null : "fx:id=\"btn3PlusMinus\" was not injected: check your FXML file 'View.fxml'.";
        assert btn4 != null : "fx:id=\"btn4\" was not injected: check your FXML file 'View.fxml'.";
        assert btn5 != null : "fx:id=\"btn5\" was not injected: check your FXML file 'View.fxml'.";
        assert btn6 != null : "fx:id=\"btn6\" was not injected: check your FXML file 'View.fxml'.";
        assert btn7 != null : "fx:id=\"btn7\" was not injected: check your FXML file 'View.fxml'.";
        assert btn8 != null : "fx:id=\"btn8\" was not injected: check your FXML file 'View.fxml'.";
        assert btn9 != null : "fx:id=\"btn9\" was not injected: check your FXML file 'View.fxml'.";
        assert btnBack != null : "fx:id=\"btnBack\" was not injected: check your FXML file 'View.fxml'.";
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'View.fxml'.";
        assert btnDevide != null : "fx:id=\"btnDevide\" was not injected: check your FXML file 'View.fxml'.";
        assert btnDot != null : "fx:id=\"btnDot\" was not injected: check your FXML file 'View.fxml'.";
        assert btnEqual != null : "fx:id=\"btnEqual\" was not injected: check your FXML file 'View.fxml'.";
        assert btnMinus != null : "fx:id=\"btnMinus\" was not injected: check your FXML file 'View.fxml'.";
        assert btnMultiply != null : "fx:id=\"btnMultiply\" was not injected: check your FXML file 'View.fxml'.";
        assert btnPercent != null : "fx:id=\"btnPercent\" was not injected: check your FXML file 'View.fxml'.";
        assert btnPlus != null : "fx:id=\"btnPlus\" was not injected: check your FXML file 'View.fxml'.";


    }

    public void setBtn0() {
        String oldvalue = textInput.getText();
        String set = "0";
        textInput.setText(oldvalue + set);
    }

    public void setBtn1() {
        String oldvalue = textInput.getText();
        String set = "1";
        textInput.setText(oldvalue + set);
    }

    public void setBtn2() {
        String oldvalue = textInput.getText();
        String set = "2";
        textInput.setText(oldvalue + set);
    }

    public void setBtn3() {
        String oldvalue = textInput.getText();
        String set = "3";
        textInput.setText(oldvalue + set);
    }

    public void setBtn4() {
        String oldvalue = textInput.getText();
        String set = "4";
        textInput.setText(oldvalue + set);
    }

    public void setBtn5() {
        String oldvalue = textInput.getText();
        String set = "5";
        textInput.setText(oldvalue + set);
    }

    public void setBtn6() {
        String oldvalue = textInput.getText();
        String set = "6";
        textInput.setText(oldvalue + set);
    }

    public void setBtn7() {
        String oldvalue = textInput.getText();
        String set = "7";
        textInput.setText(oldvalue + set);
    }

    public void setBtn8() {
        String oldvalue = textInput.getText();
        String set = "8";
        textInput.setText(oldvalue + set);
    }

    public void setBtn9() {
        String oldvalue = textInput.getText();
        String set = "9";
        textInput.setText(oldvalue + set);
    }

    public void btnCancel_click() {
        textInput.setText("");
        this.fnumber = 0;
        this.snumber = 0;
    }

    public void btnDevide_click() {
        String value = textInput.getText();
        long valueNumber = Integer.parseInt(value);
        this.fnumber = valueNumber;
        textInput.setText("");
        //pron.setText(value + "+");
        operation = "/";
    }

    public void btnPlus_click() {
        String value = textInput.getText();
        long valueNumber = Integer.parseInt(value);
        this.fnumber = valueNumber;
        textInput.setText("");
        //pron.setText(value + "+");
        operation = "+";
    }

    public void btnMinus_click() {
        String value = textInput.getText();
        long valueNumber = Integer.parseInt(value);
        this.fnumber = valueNumber;
        textInput.setText("");
        //pron.setText(value + "+");
        operation = "-";
    }

    public void btnMultiply_click() {
        String value = textInput.getText();
        long valueNumber = Integer.parseInt(value);
        this.fnumber = valueNumber;
        textInput.setText("");
        //pron.setText(value + "+");
        operation = "*";
    }

    public void btnEqual_click() {
        switch(operation) {
            case "/":
                String value = textInput.getText();
                this.snumber = Integer.parseInt(value);
                long system = this.fnumber / this.snumber;
                textInput.setText(String.valueOf(system));
                break;
            case "-":
                String valueMin = textInput.getText();
                this.snumber = Integer.parseInt(valueMin);
                long systemMin = this.fnumber - this.snumber;
                textInput.setText(String.valueOf(systemMin));
                break;
            case "+":
                String valueP = textInput.getText();
                this.snumber = Integer.parseInt(valueP);
                long systemP = this.fnumber + this.snumber;
                textInput.setText(String.valueOf(systemP));
                break;
            case "*":
                String valueM = textInput.getText();
                this.snumber = Integer.parseInt(valueM);
                long systemM = this.fnumber * this.snumber;
                textInput.setText(String.valueOf(systemM));
                break;

        }
    }



}
