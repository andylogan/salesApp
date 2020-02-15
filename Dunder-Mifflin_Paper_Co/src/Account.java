/**
 * @author Riley Logan
 * IT251-2001A-01
 * Intermediate Java Programming I
 * Prof. Anthony Lowe
 */
public abstract class Account extends Object {
    private final String _accountId;
    private final String _accountStatus;
    private final String _accountCreateDate;
    
    // constructor
    public Account(String accountId, String accountStatus, 
            String accountCreateDate){
        _accountId = accountId;
        _accountStatus = accountStatus;
        _accountCreateDate = accountCreateDate;
    }
    
    // abstract methods
    public abstract double calcSales();
    
    // setters
    public void setAccountId(String accountId){
        accountId = _accountId;
    }
    
    public void setAccountStatus(String accountStatus){
        accountStatus = _accountStatus;
    }
    
    public void setAccountCreateDate(String accountCreateDate){
        accountCreateDate = _accountCreateDate;
    }

    // getters
    public String getAccountId(){
        return _accountId;
    }
    public String getAccountStatus(){
        return _accountStatus;
    }
    
    public String getAccountCreateDate(){
        return _accountCreateDate;
    }
    
    // return String representation of class_Account object
    @Override // indicates this method overrides a superclass method
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s",
                "Accound ID", _accountId,
                "Account Status", _accountStatus,
                "Account Create Date", _accountCreateDate
        );
    } // end toString method
} // end class Account
