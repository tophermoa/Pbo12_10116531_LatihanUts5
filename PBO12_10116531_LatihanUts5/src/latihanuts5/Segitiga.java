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
public class Segitiga implements BangunDatar{
    private int luas;
    private int keliling;
    private final int sisiAB;
    private final int sisiBC;
    private final int sisiCD;
    private final int alas;
    private final int tinggi;

    public Segitiga(int ab, int bc, int cd, int alas, int tinggi) {
        this.sisiAB = ab;
        this.sisiBC = bc;
        this.sisiCD = cd;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuas() {
        luas = (int) (0.5 * alas * tinggi);
        System.out.println("Luas Segitiga: " + luas );
    }

    @Override
    public void hitungKeliling() {
        keliling =(sisiCD + sisiBC + sisiAB);
        System.out.println("Keliling Segitiga: " + keliling);
    }
}