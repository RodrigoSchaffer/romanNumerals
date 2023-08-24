public class Functions {
    public static String convertNumber(int i) {
        String convertedNumber = "";
        
        switch (i) {

            case 1:
                convertedNumber = "I"; 
                break;
            case 2:
                convertedNumber = "II"; 
                break;
            case 3:
                convertedNumber = "III"; 
                break;
            case 4:
                convertedNumber = "IV"; 
                break;
            case 5:
                convertedNumber = "V";
                break;
            case 6:
                convertedNumber = "VI";
                break;
            case 7:
                convertedNumber = "VII";
                break;
            case 8:
                convertedNumber = "VIII"; 
                break;
            case 9:
                convertedNumber = "IX"; 
                break;
        }
        return convertedNumber;
    }
}
