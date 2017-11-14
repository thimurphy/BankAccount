public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }//end of empty constructor

    public BankAccount(int accountNumber, double balance,
                       String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }//end of constructor

    //Setters
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }//end of setAccountNumber method

    public void setBalance(double balance){
        this.balance = balance;
    }//end of setBalance method

    public void setCustomerName (String customerName){
        this.customerName = customerName;
    }//end of setCustomerName method

    public void setEmail(String email){
        this.email = email;
    }//end of setEmail method

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }//end of setPhoneNumber method

    //Getters
    public int getAccountNumber(){
        return this.accountNumber;
    }//end of getAccountNumber method

    public double getBalance(){
        return this.balance;
    }//end of getBalance method

    public String getCustomerName(){
        return this.customerName;
    }//end of getCustomerName method

    public String getEmail(){
        return this.email;
    }//end of getEmail method

    public String getPhoneNumber(){
        return this.phoneNumber;
    }//end of getPhoneNumber method

    public void depositFunds(double balance){
        if(balance >= 1){
            balance = getBalance() + balance;
            setBalance(balance);
        }else{
            System.out.println("Invalid funds. Please try again.");
        }

        myAccount();
    }//end of deposit method

    public void withdrawalFunds(double balance){

        if(getBalance()< balance){
            System.out.println("You are trying to withdrawal: " + balance + " \n.. Not enough funds!");
        }else{
            balance = getBalance() - balance;
            setBalance(balance);
        }

        myAccount();
    }//end of withdrawal method

    private void myAccount(){
        System.out.println("Account number: " + getAccountNumber() + "\tCustomer name: " + getCustomerName()
                + "\nEmail: " + getEmail() + "\tPhone number: " + getPhoneNumber() + "\nBalance: " + getBalance());
    }


}//end of BankAccount class
