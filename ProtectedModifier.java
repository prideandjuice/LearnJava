class SocMed {
    protected String username;
    
    //construct
    protected SocMed(String username) {
        this.username = username;
    }
    //method
    protected void tampilkanUsername() {
        System.out.println("Username :" + username);
    }
}
//manggil induk
class Instagram extends SocMed {
    private String status;

    public Instagram(String username, String status) {
        super(username); //karena da pake this.username = username di atas
        this.status = status ;
    }
    public void tampilkanProfile() { //method yg da digabung sama yg tadi
        tampilkanUsername();
        System.out.println("Status: " + status);
    }
}
public class ProtectedModifier {
    public static void main(String[] args) {
        Instagram userig = new Instagram("elviraaraaa", "offline");

        userig.tampilkanProfile(); //pake yg digabung
    }
}
