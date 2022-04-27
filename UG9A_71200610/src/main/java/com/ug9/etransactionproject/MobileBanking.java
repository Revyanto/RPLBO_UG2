package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment {
    private String noRekening;
    private boolean checkFee;
    private long feeAntarBank;


    public MobileBanking(String nama, long saldo,String noRekening) {
        super(nama, saldo);
        this.noRekening = noRekening;
    }

    public void transfer(DigitalPayment metode, long bayar) {
    }

    public String getNoRekening() {
        return noRekening;
    }

    public boolean isCheckFee() {
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }
}

