package HomeWork.Programming.Practice2.JUNIT_Calculator2;

/**
 * Created by lapte on 14.08.2016.
 */
public class ArraySum {
    double[] numbersField;

    public ArraySum(double[] newArray) {
        numbersField = newArray;
    }
    public double sum(){
        double result = 0;
        for (int i = 0; i < numbersField.length; i++) {
            result += numbersField[i];
        }
        return result;

    }

    static double sum(double[] numbersArray)throws MyNewException{
        double result = 0;
        if (numbersArray == null){
            throw new MyNewException();
        }else {

            for (int i = 0; i < numbersArray.length; i++) {
                result += numbersArray[i];
            }
        }
        return result;
    }
}
