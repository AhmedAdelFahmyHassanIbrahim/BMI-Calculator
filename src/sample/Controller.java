package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField tHeight;
    public TextField tWeight;

    public Label Lbmi;
    public Label LResult;

    public void buttonclicked() {
        double height;
        double weight;
        double bmi;

        String result = "";

        //Getting the inputs
        height = Double.parseDouble(tHeight.getText());
        weight = Double.parseDouble(tWeight.getText());

        //the logic of the equation to calculate BMI

        bmi = height*height;
        bmi = weight/bmi;

        Lbmi.setText("BMI is: "+ bmi);

        if (bmi < 18.5){
            result = "Under Weight";
        }
        else if(bmi > 18.5 && bmi < 25){
            result = "Normal";
        }
        else {
            result = "Overweight";
        }
        LResult.setText("You are: " + result);
    }
}
