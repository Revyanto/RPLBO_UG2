package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment{
    private String noHp;
    private long feetransferBank;

    public MobileWallet(String nama, long saldo, String noHp) {
        super(nama, saldo);
        this.noHp = noHp;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setFeetransferBank(long feetransferBank) {
        this.feetransferBank = feetransferBank;
    }

    public void transfer(DigitalPayment metode, long bayar) {
    }
}
