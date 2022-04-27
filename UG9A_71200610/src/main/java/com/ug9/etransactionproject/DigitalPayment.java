package com.ug9.etransactionproject;

public class DigitalPayment {
    private String nama;
    private long saldo;

    public DigitalPayment(String nama, long saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public void transfer(DigitalPayment metode, long bayar){
    }

    public void printBuktiTransfer(DigitalPayment metode, long bayar){
    }

    public String getNama() {
        return nama;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
}


