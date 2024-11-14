class Warung{
    //masukkan variabe
    String namaBarang;
    int harga;

    void MauBeli(){
        System.out.println("buuuu beli " + namaBarang +" bu" );
        System.out.println("iyaaaaaa ambil aja dek harganya" + harga);
}
}

public class ClassObject{
    public static void main(String [] args){
        Warung warung1 = new Warung();

        warung1.namaBarang = "chocolatos";
        warung1.harga = 1000;

        warung1.MauBeli();
    }
}