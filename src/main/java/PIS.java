/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oneide
 */
public class PIS implements Taxes {
    private double debit;
    private double credit;

    public PIS(double debit, double credit) {
        this.debit = debit;
        this.credit = credit;
    }

    @Override
    public double calculateTax() {
        return (debit - credit) * 0.0165;
    }

    @Override
    public String getDescription() {
        return "PIS";
    }

    // Getters and setters
    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
