class Mahasiswa {
    //kelas private
    private String nama;
    private int umur;

    //Construct
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    //getter
    public String getNama() {
        return nama;
    }
    public int getUmur() {
        return umur;
    }

}
public class PrivateModifier {
    public static void main(String[] args) {
        Mahasiswa mhs =  new Mahasiswa ("Elvira", 18);
// masukin get nya
        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("Umur Mahasiswa " + mhs.getUmur());
        
    
    }
}
