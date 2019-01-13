package kr.co.dongi.intellij.chap1.view;

public class EmailSender {
    private Long id;
    private String name;
    private String email;

    public EmailSender(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public static  void receive(String from, String to){
        System.out.println("test receiced");
        System.out.println("test receiced");
        System.out.println("test receiced");
        System.out.println("test receiced");
        System.out.println("test receiced");
        System.out.println("test receiced");
        System.out.println("test receiced");
    }
    public void send(String to ){
        System.out.println("test send");
    }
    public String getEmail(){return email; }
}

interface Parent{
    void buy(Long amount);
    void drive(String name);
    boolean isWishList(String item);

}

class Child implements Parent{

    @Override
    public void buy(Long amount) {

    }

    @Override
    public void drive(String name) {

    }

    @Override
    public boolean isWishList(String item) {
        int i =0;
        if (i == null) {
        }

        return false;
    }

}

