package Attractions;

import Interfaces.ISecurity;
import Others.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name){
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 12 && visitor.getHeight() >= 145;
    }
}
