public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        int tempnum;
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                tempnum=Integer.parseInt(number.trim());
                if(tempnum<0){
                    throw new IllegalArgumentException("negatives not allowed");
                }
                if(tempnum<1000) {
                    returnValue += tempnum;
                }
            }
        }
        return returnValue;
    }
}
