package question2.main;
import question2.housing.Apartment;
import question2.housing.Building;
import question2.housing.Landlord;
public class Main {
    public static void main(String[] args) {

        Landlord landlord = new Landlord();
        Building building1= new Building(200);
        landlord.addBuilding(building1);
        building1.addApartment(new Apartment(500));
        building1.addApartment(new Apartment(800));
        System.out.println(landlord.calcTotalProfit());


    }
}