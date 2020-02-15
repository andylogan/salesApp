/**
 * @author Riley Logan
 * IT251-2001A-01
 * Intermediate Java Programming I
 * Prof. Anthony Lowe
 */
public class Supplies extends Account {
    private double _officeSuppliesSales;
    private double _bookSales;
    private double _apparelSales;
    
    // constructor
    public Supplies(String accountId, String accountStatus, 
        String accountCreateDate, double officeSuppliesSales, double bookSales,
        double apparelSales){
        
        // explicit call to superclass constructor
        super(accountId, accountStatus, accountCreateDate);
        
    _officeSuppliesSales = officeSuppliesSales;
    _bookSales = bookSales;
    _apparelSales = apparelSales;
    }
    
    // calculation methods
    @Override // indicates that this method overrides a superclass method
    public double calcSales(){
        return getOfficeSuppliesSales()
                + getBookSales()
                + getApparelSales();
    }

    // Setters
    public void setOfficeSuppliesSales(double officeSuppliesSales) {
        _officeSuppliesSales = officeSuppliesSales;
    }

    public void setBookSales(double bookSales) {
        _bookSales = bookSales;
    }

    public void setApparelSales(double apparelSales) {
        _apparelSales = apparelSales;
    }
    
    // Getters
    public double getOfficeSuppliesSales() {
        return _officeSuppliesSales;
    }

    public double getBookSales() {
        return _bookSales;
    }

    public double getApparelSales() {
        return _apparelSales;
    }
    
    // return String representation of class_Paper object
    @Override // indicates that this method overrides a superclass method
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: "
                + "%.2f%n%s: %.2f",
                
                "Accound ID", getAccountId(),
                "Account Status", getAccountStatus(),
                "Account Create Date", getAccountCreateDate(),
                "Office Supplies sales", getOfficeSuppliesSales(),
                "Book sales", getBookSales(),
                "Apparel sales", getApparelSales(),
                "Calculated Sales", calcSales()
        );
    } // end toString method
} // end Supplies class
