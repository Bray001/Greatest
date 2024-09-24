public class Main {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDenominator(25, 15));
        System.out.println(getGreatestCommonDenominator(12, 30));
        System.out.println(getGreatestCommonDenominator(9, 18));
        System.out.println(getGreatestCommonDenominator(81, 153));

    }

    private static int getGreatestCommonDenominator(int first, int second) {
        //Check if first, second are negative. If so return -1

        //create a variable of type int called gcd.  Initialize it to 1.
        //Every two numbers have a gcd of at least 1.  Maybe more

        //Create a variable called smallest that is the smaller of the two numbers.
        //Initialize to 0;

        if(first <= second) {
            smallest = first;
        }else{
            smallest = second;
        }

        for(int i = 1; i <= smallest; i++){
            //check if first mod i is 0 and if second mod i is 0
            //If so set gcd to i
        }

        //When done return gcd.

    }

}
