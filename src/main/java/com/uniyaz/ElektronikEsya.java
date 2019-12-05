package com.uniyaz;

public abstract class ElektronikEsya {

    private enumMalzeme malzeme;
    private int watt;
    private enumMarka marka;

    public enumMalzeme getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(enumMalzeme malzeme) {
        this.malzeme = malzeme;
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public void TusaBasCihazAc (){
        System.out.println("Tuşa basıldı ve cihaz açıldı");
    }

    public void TusaBasCihazKapa(){
        System.out.println("Tuşa basıldı cihaz kapandı.");
    }
}