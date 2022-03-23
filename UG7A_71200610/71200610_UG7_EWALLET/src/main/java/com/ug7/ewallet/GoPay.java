package com.ug7.ewallet;

public class GoPay extends eWallet{
    private int feeTopUp;
    private int feeTransfer;
    private int feeWithdraw;

    public GoPay(User user) {
        super(user);
    }

    public void topUP(int jumlah){
        this.feeTopUp = 1000;
        saldo=jumlah;
        user.topup(jumlah+feeTopUp);
    }

    public void transfer (int jumlah){
        this.feeTransfer=500;
        saldo=jumlah;
        user.topup(jumlah+feeTransfer);
    }

    public void withdraw(int jumlah){
        this.feeWithdraw=2500;
        saldo=jumlah;
        user.topup(jumlah+feeWithdraw);
    }

    public void getInfo(){
        System.out.println("[ShopeePay e-Wallet]");
        System.out.println("Nama: "+user.getNama());
        System.out.println("Email: "+user.getEmail());
        System.out.println("Uang Cash: Rp."+user.getUang());
        System.out.println("Saldo e-Wallet: Rp."+saldo);
    }
}

