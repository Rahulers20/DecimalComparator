public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double valueOne,double valueTwo) {

        if((int)(valueOne * 1000) == (int)(valueTwo * 1000)) {
            return true;
        } else {
            return false;
        }
    }
}
