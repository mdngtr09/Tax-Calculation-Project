/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oneide
 */
public class IPI implements Taxes {
    private double productValue;
    private double freight;
    private double insurance;
    private double otherExpenses;
    private double rate;

    public IPI(double productValue, double freight, double insurance, double otherExpenses, double rate) {
        this.productValue = productValue;
        this.freight = freight;
        this.insurance = insurance;
        this.otherExpenses = otherExpenses;
        this.rate = rate;
    }

    @Override
    public double calculateTax() {
        double calculationBase = productValue + freight + insurance + otherExpenses;
        return calculationBase * rate / 100;
    }

    @Override
    public String getDescription() {
        return "IPI";
    }

    // Getters and setters
    public double getProductValue() {
        return productValue;
    }

    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }

    public double getFreight() {
        return freight;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public double getOtherExpenses() {
        return otherExpenses;
    }

    public void setOtherExpenses(double otherExpenses) {
        this.otherExpenses = otherExpenses;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
