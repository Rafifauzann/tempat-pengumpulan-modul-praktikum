// Main Class

public class MainClass {
    public static void main(String [] args) {
        

        // hitung luas, keliling, dan simetri dari suatu lingkaran A dg r= 19 satuan

        Lingkaran A = new Lingkaran();
        A.jejari = 19;
        A.tampilHasil();

        // hitung luas, keliling, dan simetri dari suatu persegi panjang B dg panjang = 10 & lebar = 5 satuan

        PersegiPanjang B = new PersegiPanjang();
        B.panjang = 10;
        B.lebar = 5 ;
        B.tampilHasil();

        // hitung luas dari segitiga C dg alas= 12 & tinggi = 8 satuan

        Segitiga C = new Segitiga();
        C.alas = 12;
        C.tinggi = 8;
        C.tampilHasil();

        Trapesium D = new Trapesium();
        D.sisi1 = 4;
        D.sisi2 = 7;
        D.tinggi = 9;
        D.tampilHasil();
    }
}