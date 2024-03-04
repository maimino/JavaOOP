package tinhdahinh;

public class NapChong {
    public void clickElement(){
        System.out.println("Click element");
    }

    public void clickElement(String name) {
        System.out.println("Click: " + name) ;
    }

    public static void main(String[] args) {
        NapChong napchong = new NapChong();

        napchong.clickElement();
    }
}
