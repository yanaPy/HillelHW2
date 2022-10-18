public class DepositCalculator {
    public static void main(String[] args) {

        int amountOfCashDepositUah = Integer.valueOf(args[0]);
        double percentagePerAnnum = Double.valueOf(args[1]);
        int durationOfDeposit = Integer.valueOf(args[2]);

        System.out.println("Amount of money all period: " + interesCharges(amountOfCashDepositUah, percentagePerAnnum,
                durationOfDeposit));
    }

    public static double interesCharges(int amountOfCashDepositUah, double percentagePerAnnum, int durationOfDeposit) {
        double interesCharges = 0;
        for (int i = 1; i <= durationOfDeposit; i++) {
            interesCharges = (interesCharges + amountOfCashDepositUah) *
                    Math.pow((1 + ((percentagePerAnnum / 100) / 12)), 12 * 1);
            System.out.println("Amount of money for year " + i + ": " + interesCharges);

            double sumOfPercent = interesCharges - percentagePerAnnum;
            System.out.println("Sum of percent for year " + i + ": " + sumOfPercent);

        }
        return interesCharges;
    }
}