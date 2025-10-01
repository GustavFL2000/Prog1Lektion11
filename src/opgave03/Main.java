package opgave03;

public class Main {
    public static void main(String[] args) {
        Rektangel rec1 = new Rektangel();
        Rektangel rec2 = new Rektangel(5,5);

        System.out.println("Første Object: " + "\n" + "Areal af rec1: " + rec1.getArea() + "\n"
        + "Omkreds af rec1: " + rec1.getParimeter() + "\n");
        
        System.out.println("Andet Object: " + "\n" + "Areal af rec2: " + rec2.getArea() + "\n"
        + "Omkreds af rec2: " + rec2.getParimeter() + "\n");
    
    }
}
