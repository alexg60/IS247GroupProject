
public class Financing {
    public static void getFinancing(Vehicle vehicle, int creditScore, int loanYears){
        double interestRate;
        double monthlyPaymentp1;
        double monthlyPaymentp2;
        double monthlyPayment;
        double loanMonths = loanYears * 12;
        double totalPayment;
        double monthlyInterestRate;

        //Assigns a different interest rate based on credit score
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

        //Calculations for Montly Payment and Total Payment over loan.
        monthlyInterestRate = interestRate / 12;
        monthlyPaymentp1 = (vehicle.Price * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanMonths));
        monthlyPaymentp2 = (Math.pow(1+monthlyInterestRate, loanMonths) - 1);
        monthlyPayment = monthlyPaymentp1 / monthlyPaymentp2;
        totalPayment = monthlyPayment * loanMonths;

        //Output statement to display financing information
        System.out.printf("Your interest rate is %.2f%%. For a " + loanYears + "-year loan your monthly payment will be $%.2f and you will" +
                " have a total payment of $%.2f.\n", (interestRate * 100), monthlyPayment, totalPayment);
    }
}
