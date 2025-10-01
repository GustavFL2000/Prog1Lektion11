package opgave02;

public class Softdrink {

    public static void main(String[] args) {

        //Laver array
        Softdrink[] softdrinks = new Softdrink[3];

        //Laver Objekter
        softdrinks[0] = new Softdrink("Gustav", 10,10);
        softdrinks[1] = new Softdrink();
        softdrinks[2] = new Softdrink();
        softdrinks[2].setName("RedBull");
        softdrinks[2].setEnergy(100);
        softdrinks[2].setPortionSize(5);

        //Printer alle objeketr i arrayet 
        printArray(softdrinks); //printer objekterne i rarrayet der bliver lavet
        System.out.println("Total energi blandt de forskellige drinks: "+ totalEnergi(softdrinks)+ "\n");
        System.out.println("Average størrelse blandt de forskellige drinks: "+ averageSize(softdrinks) + "\n");

    }

    //Private atributter
    private  String name;
    private  int energy;
    private  int portionSize;

    //Default konstrokter
    public Softdrink(){
        this.name = "Noname";
        this.energy = 0;
        this.portionSize = 0;
    }

    //Paramatiseret konstrukter
    public Softdrink(String name, int energy, int portionSize){
        this.name = name;
        this.energy = energy;
        this.portionSize = portionSize;
    }

    //Public metoder for klassen
    public static int totalEnergi(Softdrink[] drinks) {
        int sum = 0;
        for (int i = 0; i < drinks.length; i++) {
            sum = sum + drinks[i].getEnergy();
        }
        return sum;
    }

    public static double averageSize(Softdrink[] drinks){
        int sum = 0;
        for (int i = 0; i < drinks.length; i++) {
            sum = sum + drinks[i].getPortionSize();
        }

        return sum / drinks.length;
    }

    //Getter og setter funktioner
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getEnergy(){
        return this.energy;
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }

    public int getPortionSize(){
        return this.portionSize;
    }

    public void setPortionSize(int portionSize){
        this.portionSize = portionSize;
    }



    //Print hjælpe funktion
    public static void printArray(Softdrink[] softDrinkArray) {
    for (int i = 0; i < softDrinkArray.length; i++) {
        System.out.printf("%-15s %-15s %-15s\n",
            "Name: " + softDrinkArray[i].getName(),
            "Energy: " + softDrinkArray[i].getEnergy(),
            "Portion Size: " + softDrinkArray[i].getPortionSize());
    }
    System.out.println("\n");
}

    

}
 