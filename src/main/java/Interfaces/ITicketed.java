package Interfaces;

import Others.Visitor;

public interface ITicketed {
    public double defaultPrice();
    public double priceFor(Visitor visitor);
}
