public class Main {

    public static void main(String args[]){

        BankAccount ba = new BankAccount();
        BankAccount aa = new BankAccount(654321, 0.00,
                "Caomhan Murphy", "cm@gmail.com", "087789777");
        ba.setAccountNumber(123456);
        ba.setCustomerName("Thiago Murphy");
        ba.setEmail("tm@gmail.com");
        ba.setPhoneNumber("0871709739");

        ba.depositFunds(500);
        ba.withdrawalFunds(500);

        System.out.println();//skip line

        aa.depositFunds(154210);
        aa.withdrawalFunds(153654);
    }//end of main method
}//end of Main class
