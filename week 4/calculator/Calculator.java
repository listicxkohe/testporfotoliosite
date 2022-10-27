import calculator;import calculator.TestCalculator;package calculator;


public class Calculator {

    double numberOne, numberTwo;
    String calculatorName;

    TestCalculator lib1 = new TestCalculator();
    

    Calculator(double thisNumberOne, double thisNumberTwo, String thisCalcName){
        numberOne = thisNumberOne;
        numberTwo = thisNumberTwo;
        calculatorName = thisCalcName;
        
    }
 
    
    void displayResults(){
        System.out.println("------------" +calculatorName+ "--------------");
        System.out.println(">>RESULTS FOR " + numberOne + " & " + numberTwo + " ARE: ");
        System.out.println("Addition: " + add(numberOne,numberTwo));
        System.out.println("Subtraction: " +subtract(numberOne,numberTwo));
        System.out.println("Multiply: " +multiply(numberOne,numberTwo));
        System.out.println("Divide: " +divide(numberOne,numberTwo));
    }

    double add(double thisNumberOne, double thisNumberTwo){
        return thisNumberOne + thisNumberTwo;
    }
    
    double subtract(double thisNumberOne, double thisNumberTwo){
        return thisNumberOne - thisNumberTwo;
    }

    double multiply(double thisNumberOne, double thisNumberTwo){
        return thisNumberOne * thisNumberTwo;
    }

    double divide(double thisNumberOne, double thisNumberTwo){
        return thisNumberOne / thisNumberTwo;
    }

    public static void main(String[] args) {
        Calculator calc1 = new Calculator(10, 20, "caclulator 1");
        Calculator calc2 = new Calculator(20, 10, "calculator 2");
        calc1.displayResults();
        calc2.displayResults();

    }
}