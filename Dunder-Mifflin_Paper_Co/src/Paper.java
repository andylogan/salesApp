/**
 * @author Riley Logan
 * IT251-2001A-01
 * Intermediate Java Programming I
 * Prof. Anthony Lowe
 */
public class Paper extends Account {
    private double _poundsSold; // number of pounds sold
    private double _poundPrice; // price per pound
    
    // constructor
    public Paper(String accountId, String accountStatus, 
        String accountCreateDate, double poundsSold,
        double poundPrice){
        
        // explicit call to superclass constructor
        super(accountId, accountStatus, accountCreateDate);
        
    _poundsSold = poundsSold;
    _poundPrice = poundPrice;
    }

    // calculation methods
    @Override // indicates this method overrides a superclass method
    public double calcSales(){
        return getPoundsSold() * getPoundPrice();
    }
    
    // setters
    public void setPoundsSold(double poundsSold){
        _poundsSold = poundsSold;
    }
    
    public void setPoundPrice(double poundPrice){
        _poundPrice = poundPrice;
    }
    
    // getters
    public double getPoundsSold(){
        return _poundsSold;
    }
    
    public double getPoundPrice(){
        return _poundPrice;
    }
    
    // return String representation of class_Paper object
    @Override // indicates this method overrides a superclass method
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "Accound ID", getAccountId(),
                "Account Status", getAccountStatus(),
                "Account Create Date", getAccountCreateDate(),
                "Paper pounds sold", _poundsSold,
                "Paper price per pound", _poundPrice,
                "Calculated Sales", calcSales()
        );
    } // end toString method
} // end Paper class
