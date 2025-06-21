package assignemts.cts;

public class FinancialForecast {
	
	//recursive solution 
    public static double futureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return (1 + rate) * futureValue(principal, rate, years - 1);
    }
    //iterative solution --> more optimal
    public static double futureValueIterative(double principal, double rate, int years) {
        double result = principal;
        for (int i = 0; i < years; i++) {
            result *= (1 + rate);
        }
        return result;
    }


    public static void main(String[] args) {
        double principal = 10000; 
        double rate = 0.05;       
        int years = 10;           

        double futureVal = futureValue(principal, rate, years);
        System.out.printf("Future value after %d years: %.2f\n --> recursive", years, futureVal);
        System.out.println();
        double futureValIter = futureValueIterative(principal, rate, years);
        System.out.printf("Future value after %d years: %.2f\n --> iterative", years, futureValIter);
    }
}