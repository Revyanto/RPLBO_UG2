package com.ug7.ewallet;

public class ShopeePay extends eWallet{
    private int feeTopUp;
    private int feeTransfer;
    private int feeWithdraw;

    public ShopeePay(User eWallet.user) {
    }

    public void topUP(int jumlah){
    this.feeTopUp = 500;
    saldo=jumlah+feeTopUp;

    }

    public void transfer (int jumlah){
    this.feeTransfer=0;
    saldo=jumlah+feeTransfer;
    }

    public void withdraw(int jumlah){
    this.feeWithdraw=1000;
    saldo=jumlah+feeWithdraw;
    }

    public void getInfo(){

    }
}
}
