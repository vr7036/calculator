import java.awt.*;
import java.awt.event.*;

public class UI extends Frame{
    TextField inputField1;
    TextField inputField2;
    TextField resultField;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    Label resultLabel;
    Label errorLabel;

    private void initializeGUIElements(){
        this.inputField1 = new TextField(15);
        this.inputField2 = new TextField(15);
        this.resultField = new TextField(15);

        this.add = new Button("+");
        this.subtract = new Button("-");
        this.multiply = new Button("*");
        this.divide = new Button("/");

        this.resultLabel = new Label("=");
        //this.errorLabel = new Label("Cannot divide by 0");
    }

    private void addElementsToFrame(){
        setLayout(new FlowLayout());

        add(inputField1);
        add(inputField2);
        add(resultLabel);
        add(resultField);

        add(add);
        add(subtract);
        add(multiply);
        add(divide);


        //add(errorLabel);
    }

    private void addListenerInterfaces(){
        addWindowListener(new WindowClosingAdapter());
        add.addActionListener(new OnClickListener());
        subtract.addActionListener(new OnClickListener());
        multiply.addActionListener(new OnClickListener());
        divide.addActionListener(new OnClickListener());
    }

    CalculatorUI(){
        initializeGUIElements();
        addElementsToFrame();
        addListenerInterfaces();
    }


    public class OnClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Calculator calculator;

            try{
                double operand1 = Double.parseDouble(inputField1.getText());
                double operand2 = Double.parseDouble(inputField2.getText());

                calculator = new Calculator(operand1, operand2);

                if(actionEvent.getSource() == add){
                    resultField.setText(String.valueOf(calculator.add(operand1, operand2)));
                }

                if(actionEvent.getSource() == subtract){
                    resultField.setText(String.valueOf(calculator.subtract(operand1, operand2)));
                }

                if(actionEvent.getSource() == multiply){
                    resultField.setText(String.valueOf(calculator.multiply(operand1, operand2)));
                }

                if(actionEvent.getSource() == divide){
                    if(calculator.divide() == -1){
                        errorLabel = new Label("Cannot divide by 0");
                        add(errorLabel);
                    }
                    else{
                        resultField.setText(String.valueOf(calculator.divide(operand1, operand2)));
                    }
                }
            }catch (Exception e){
                errorLabel = new Label("Input required!");
                add(errorLabel);
            }
        }
    }
}