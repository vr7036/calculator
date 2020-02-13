
public class Calculator extends Exception{
    private double operand1;
    private double operand2;

    Calculator(double operand1, double operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void setOperand1(double operand1){
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2){
        this.operand2 = operand2;
    }

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public double add(){
        return this.operand1 + this.operand2;
    }

    public double add(double operand1,double operand2){
        setOperand1(operand1);
        setOperand2(operand2);
        return this.operand1 + this.operand2;
    }

    public double subtract(){
        return this.operand1 - this.operand2;
    }

    public double subtract(double operand1,double operand2){
        setOperand1(operand1);
        setOperand2(operand2);
        return this.operand1 - this.operand2;
    }

    public double multiply(){
        return this.operand1 * this.operand2;
    }

    public double multiply(double operand1,double operand2){
        setOperand1(operand1);
        setOperand2(operand2);
        return this.operand1 * this.operand2;
    }

    public double divide(){
        try {
            return this.operand1 / this. operand2;
        }catch (Exception e){
            return -1;
        }
    }

    public double divide(double operand1, double operand2){
        setOperand1(operand1);
        setOperand2(operand2);
        try {
            return this.operand1 / this. operand2;
        }catch (Exception e){
            return -1;
        }
    }

}