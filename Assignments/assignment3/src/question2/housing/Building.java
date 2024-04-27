package question2.housing;

import java.util.LinkedList;
import java.util.List;

public class Building {

    private double profit;
    private double maintenanceCosts;
    private List<Apartment> apartments;

   public Building(double costs) {
        maintenanceCosts = costs;
        apartments = new LinkedList<Apartment>();
    }

    public void addApartment(Apartment ap) {
        if (ap == null) throw new IllegalArgumentException("question2.housing.Apartment should not be null");
        apartments.add(ap);
    }

    public double getProfit() {

        for (Apartment ap : apartments) {
            profit += ap.getRent();

        }

        return profit - maintenanceCosts;

    }
}
