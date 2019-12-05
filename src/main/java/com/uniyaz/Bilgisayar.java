package com.uniyaz;

public abstract class Bilgisayar extends ElektronikEsya {
    @Override
    public void TusaBasCihazAc() {
        System.out.println("Bilgisayar Açıldı.");
    }

    @Override
    public void TusaBasCihazKapa() {
        System.out.println("Bilgisayar Kapandı.");
    }
}
