

public class Financing {
    public static void getFinanacing(Vehicle vehicle, int creditScore){
        double interestRate;
        double monthlyPaymentp1;
        double monthlyPaymentp2;
        double monthlyPayment;
        double loanLength = 60;
        double totalPayment;
        double monthlyInterestRate;

        if(creditScore >= 800){
            interestRate = 0.025;
        } else if (creditScore >= 700) {
            interestRate = 0.035;
        } else if (creditScore >= 600) {
            interestRate = 0.050;
        } else if (creditScore >= 500){
            interestRate = 0.075;
        } else{
            interestRate = 0.10;
        }

        monthlyInterestRate = interestRate / 12;

        monthlyPaymentp1 = (vehicle.Price * monthlyInterestRate * Math.pow(1 + monthlyInterestRate,loanLength));
        monthlyPaymentp2 = (Math.pow(1+monthlyInterestRate, loanLength) - 1);
        monthlyPayment = monthlyPaymentp1 / monthlyPaymentp2;
        totalPayment = monthlyPayment * loanLength;

        System.out.printf("Your interest rate is %.2f%%. For a 5-year loan your monthly payment will be $%.2f and you will" +
                " have a total payment of $%.2f.\n", (interestRate * 100), monthlyPayment, totalPayment);

        //System.out.printf("Your interest rate is " + (interestRate * 100) + "%. For a 5 year loan you will have montly payment " +
         //       "of $" + monthlyPayment + " and a total payment of $" + totalPayment + ".");
    }
}
