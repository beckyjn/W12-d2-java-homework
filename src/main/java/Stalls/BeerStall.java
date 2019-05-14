package Stalls;

import Interfaces.ISecurity;
import Others.Visitor;

public class BeerStall extends Stall implements ISecurity {
    public BeerStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > 18;
    }
}
