/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuts5;

/**
 *
 * @author XD
 */
public class JajarGenjang implements BangunDatar {

    private int luas;
    private int keliling;
    private final int sisiAB;
    private final int sisiBC;
    private final int sisiCD;
    private final int sisiDA;
    private final int alas;
    private final int tinggi;

    public JajarGenjang(int ab, int bc, int cd, int da, int alas, int tinggi) {
        this.sisiAB = ab;
        this.sisiBC = bc;
        this.sisiCD = cd;
        this.sisiDA = da;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuas() {
        luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang: " + luas  );
    }

    @Override
    public void hitungKeliling() {
        keliling = 2 * (sisiDA + sisiAB);
        System.out.println("Keliling Jajar Genjang: " + keliling);
    }
}
