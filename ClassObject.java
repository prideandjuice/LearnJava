class Warung{
    //ini disebut atribut
    String namaBarang;
    int harga;

    void MauBeli(){
        System.out.println("buuuu beli " + namaBarang +" bu" );
        System.out.println("iyaaaaaa ambil aja dek harganya " + harga);
}
}

public class ClassObject{
    public static void main(String [] args){
        //buat object dari class warung
        Warung warung1 = new Warung();

        // mengisi atribut object tadi
        warung1.namaBarang = "chocolatos";
        warung1.harga = 1000;

        //memanggil method 
        warung1.MauBeli();
    }
}