package com.ug6.soal1;

public class Codes {
    private String GOODSCODES="GD";
    private String VENDINGMACHINESCODES="VM";
    private String TYPE="";

    public String generateGoodsCode(String type, String name){
        return GOODSCODES;
    }

    public String generateVendingMachinesCode(int order){
        return VENDINGMACHINESCODES;
    }
}
