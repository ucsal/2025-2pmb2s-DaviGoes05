package br.com.mariojp.solid.srp;

public class TaxCalculator {
    
    private final double taxRate;

    public TaxCalculator() {
        String property = System.getProperty("tax.rate", "0.10");
        this.taxRate = Double.parseDouble(property);
    }

    public double calculate(double subtotal) {
        return subtotal * taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
