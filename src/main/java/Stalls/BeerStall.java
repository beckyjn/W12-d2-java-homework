package Stalls;

import Interfaces.ISecurity;
import Others.Visitor;

public class BeerStall extends Stall implements ISecurity {
    public BeerStall(String name, String ownerName, int parkingSpot, int rating){
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > 18;
    }
}
