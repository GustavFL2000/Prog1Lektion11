package opgave03;

public class Rektangel {
    private double width;
    private double height;

    public Rektangel(){
        this.width = 1;
        this.height = 1;
    }

    public Rektangel(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return getWidth() * getHeight();
    }

    public double getParimeter(){
        return (2*getWidth()) + (2*getHeight());
    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

}
