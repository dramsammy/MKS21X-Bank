public class BankAccount{
  private int accountID;
  private double balance;
  private String password;
/*Sole constructor requires all field's values*/
  public BankAccount(double balance, int accountID ,String password){
    this.balance = balance;
    this.accountID = accountID;
    this.password = password;
  }

/*Return a String to be used to display the account data. "ACCOUNT\tBALANCE" */
  public String toString(){
    return "" + accountID + "\t" + balance;
  }

/*standard accessor methods*/
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }

/*Change the value of password to the specified value
 *@param newPass The value to replace the old password with*/
  public void setPassword(String newPass){
    this.password = password;
  }

/*Only when amount is positive: Increase balance by amount and return true.
 *@return When amount is positive: Return true, otherwise return false.
 *@param amount The amount is how much to change the balance by.
 */
  public boolean deposit(double amount){
    if (amount > 0){
      balance += amount;
      return true;
    }
      return false;
    }


/*Only when amount is positive and the amount does not exceed the balance:
 *Decrease balance by amount and return true, return false otherwise.
 *Make no change if the amount is too large to withdraw
 *@param amount The amount is how much to change the balance by.
 *@return true when the balance is large enough, false otherwise.
 */
  public boolean withdraw(double amount){
    if (amount > balance){
      return false;
    }
      balance = balance - amount;
      return true;
  }
  private boolean authenticate(String password){
     return (this.password.equals(password));
}
  public boolean transferTo(BankAccount other, double amount, String password){
    return other.authenticate || (this.withdraw(amount) && other.deposit(amount));

    }
  }
