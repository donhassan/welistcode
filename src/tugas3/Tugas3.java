/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author USER
 * Nama  : Donny Hassan Hasibuan
 * Nim   : 10116507
 * Kelas : PBO 11
 */

        class Mahasiswa {
    double quiz;
    double uts;
    double uas;
    double nilaiAkhir;
    char index;
    String keterangan;
    String nim, nama;

    public double nilaiAkhir(double quiz, double uts, double uas)
       {nilaiAkhir = 0.2*quiz + 0.3*uts + 0.5*uas;
       return nilaiAkhir;}

    public void getIndex(double nilaiAkhir){
        if(nilaiAkhir<=45){
            index='E';
            keterangan="Sangat Kurang";
        }else if(nilaiAkhir<=56){
            index='D';
            keterangan="Kurang";
        }else if(nilaiAkhir<=68){
            index='C';
            keterangan="Cukup";
        }else if(nilaiAkhir<=80){
            index='B';
            keterangan="Baik";
        }else if(nilaiAkhir<=100){
            index='A';
            keterangan="Sangat Baik";
        }else
        {index='-';
            keterangan="Nilai Eror";
        }
    }
}
public class Tugas3 {

    
    public static void main(String[] args) {
    Mahasiswa mHs = new Mahasiswa();
        mHs.quiz = 75;
        mHs.uts  = 80;
        mHs.uas  = 85;
        mHs.nama = "Donny Hassan Hasibuan";
        mHs.nim  = "7.51.15.036.";
        mHs.nilaiAkhir(mHs.quiz, mHs.uts, mHs.uas);
        mHs.getIndex(mHs.nilaiAkhir);
        
        int noNama;
        int noNim;
        for (noNama  = 1; noNama <= 4; noNama++) 
            {System.out.println("Nama ke " +noNama+ "\t\t = "+mHs.nama);}
        for (noNim = 8; noNim >= 1; noNim--) 
            {System.out.println("NIM ke " + noNim + "\t\t = "+mHs.nim+ +noNim);}
        
        System.out.println("\nQUIZ = "+mHs.quiz);
        System.out.println("UTS  = "+mHs.uts);
        System.out.println("UAS  = "+mHs.uas);
        
        System.out.println("\nNilai Akhir = "+mHs.nilaiAkhir);
        
        System.out.println("\nIndex = "+mHs.index);
        System.out.println("Keterangan = "+mHs.keterangan);
            
       
            }
 }
    
