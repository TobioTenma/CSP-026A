public class BankAccountTest
{
     
         private   double balance;
         private   double anualIR;
         private   double monthSC;
         private   double deposit;
         private   double withdraw;

            public void deposit(double total)
            {
                balance += total;
                deposit += total;
            }
            
            public void withdraw(double total)
            {
                balance -= total;
                withdraw += total;
            }
            
            public void monthlyProcess(double monthlyInterest)
            {
                balance += (monthSC - balance)-(withdraw)+(deposit);
            }
            
            //Intrest Rate
            public void setInterest(double x)
            
            {
                monthSC = x;
            }
            
            //returns balance
            public double getBalance()
            {
                return balance;
            }
            
            //returns anual interest
            public double getanualIR()
            {
                return anualIR;
            }
}
