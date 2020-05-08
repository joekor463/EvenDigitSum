public class EvenDigitSum {
    public static void main (String[] args ) {
        System.out.println (getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        if (number < 0) return -1;
        int sum = 0;
        int num = number;
        while (num != 0){
            int current = num % 10;
            num = num /10;
            if ((current%2) == 0) {
                sum = sum + current;
            }
        }
        return sum;
    }


}
