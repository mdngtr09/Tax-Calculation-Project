/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oneide
 */
import java.util.ArrayList;
import java.util.List;

public class Payments {
    private String companyName;
    private final List<Taxes> taxes;

    public Payments(String companyName) {
        this.companyName = companyName;
        this.taxes = new ArrayList<>();
    }

    public void addTax(Taxes tax) {
        taxes.add(tax);
    }

    public void displayTaxes() {
        for (Taxes tax : taxes) {
            System.out.println(tax.getDescription() + ": $" + tax.calculateTax());
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
