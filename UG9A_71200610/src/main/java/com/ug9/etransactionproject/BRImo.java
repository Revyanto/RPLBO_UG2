package com.ug9.etransactionproject;

public class BRImo {
    public class BRImo extends MobileBanking{
        public BRImo(String nama, long saldo, String noRekening) {
            super(nama, saldo, noRekening);
        }

        public void transfer(DigitalPayment metode, long bayar) {
        }

}
