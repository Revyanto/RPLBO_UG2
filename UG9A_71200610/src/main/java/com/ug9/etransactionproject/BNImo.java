package com.ug9.etransactionproject;

public class BNImo extends MobileBanking{
    public BNImo(String nama, long saldo, String noRekening) {
        super(nama, saldo, noRekening);
    }

    public void transfer(DigitalPayment metode, long bayar) {
    }
}
