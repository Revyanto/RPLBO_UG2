package com.ug7.ewallet;

public class GoPay extends eWallet{
    private int feeTopUp;
    private int feeTransfer;
    private int feeWithdraw;

    public GoPay(User user) {
        this.user = user;
    }

    public void topUP(int jumlah){
        this.feeTopUp = 1000;
        saldo=jumlah+feeTopUp;

    }

    public void transfer (int jumlah){
        this.feeTransfer=500;
        saldo=jumlah+feeTransfer;
    }

    public void withdraw(int jumlah){
        this.feeWithdraw=2500;
        saldo=jumlah+feeWithdraw;
    }

    public void getInfo(){

    }
}
}
