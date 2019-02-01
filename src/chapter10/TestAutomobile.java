package chapter10;
public class TestAutomobile {
    public static void main(String[] args){
        Automobile auto1 = new Automobile(1451, "Chevrolet", "Camero", "red", 2010, 24.5);
        Automobile auto2 = new Automobile(145188, "Ford", "Focus", "silver", 2019, 75);
        display(auto1, "good declaration");
        display(auto2, "bad declaration");
        auto1.setId(-3);
        display(auto1, "bad ID");
        auto1.setId(2222);
        display(auto1, "good ID");
        auto1.setMake("Toyota");
        auto1.setModel("Corolla");
        display(auto1, "change make and model");
        auto1.setId(8593);
        auto1.setColor("purple");
        auto1.setYear(2005);
        display(auto1, "change id, color, and year");
        auto1.setMpg(78);
        display(auto1, "bad mpg");
        auto1.setMpg(35);
        display(auto1, "good mpg");
        
    }
    public static void display(Automobile auto, String msg){
        System.out.println(msg + "      " + auto.getId() + " " + auto.getMake() + " " + auto.getModel() + " " + auto.getColor() + " " + auto.getYear() + " " + auto.getMpg()
                + " " + "miles per gallon");
    }
}
