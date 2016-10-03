package HomeWork.Programming.Practice2.JUNIT_Calculator2;

/**
 * Created by lapte on 14.08.2016.
 */
public class ArrayProd {
    static double prod(double[] numbersArray)throws MyNewException{
        double result = 1;
        if (numbersArray == null){
            throw new MyNewException();
        }else {

            for (int i = 0; i < numbersArray.length; i++) {
                result *= numbersArray[i];
            }
        }
        return result;
    }
}
