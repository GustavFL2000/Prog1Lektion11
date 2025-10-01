package opgave04;

public class Stock {
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    Stock(String name, double p, double c){
        this.name = name;
        this.previousClosingPrice = p;
        this.currentPrice = c;
    }


    public double getChangedProcent(){

       return Math.round(((this.currentPrice - this.previousClosingPrice)
        / this.previousClosingPrice) * 100);
    }

    public static void main(String[] args) {
        Stock stock = new Stock("Gulles aktier", 65, 105);
        System.out.println("Changed PRocent: "+stock.getChangedProcent()+"%" + "\n");
    }
}
