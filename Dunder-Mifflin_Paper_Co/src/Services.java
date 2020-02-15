/**
 * @author Riley Logan
 * IT251-2001A-01
 * Intermediate Java Programming I
 * Prof. Anthony Lowe
 */
public class Services extends Account {
    private double _hours;
    private double _hourlyRate; 
    
    // constructor
    public Services(String accountId, String accountStatus, 
        String accountCreateDate, double hours,
        double hourlyRate){
        
        // explicit call to superclass constructor
        super(accountId, accountStatus, accountCreateDate);
        
    _hours = hours;
    _hourlyRate = hourlyRate;
    }
    
    // calculation methods
    @Override // indicates that this method overrides a superclass method
    public double calcSales(){
        return getHours() * getHourlyRate();
    }
    
    // setters
    public void setHours(double hours){
        _hours = hours;
    }
    
    public void setHourlyRate(double hourlyRate){
        _hourlyRate = hourlyRate;
    }
    
    // getters
    public double getHours(){
        return _hours;
    }
    
    public double getHourlyRate(){
        return _hourlyRate;
    }
    
    // return String representation of class_Paper object
    @Override // indicates that this method overrides a superclass method
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "Accound ID", getAccountId(),
                "Account Status", getAccountStatus(),
                "Account Create Date", getAccountCreateDate(),
                "Service Hours", _hours,
                "Hourly Rate", _hourlyRate,
                "Calculated Sales", calcSales()
        );
    } // end toString method
} // end Services class
