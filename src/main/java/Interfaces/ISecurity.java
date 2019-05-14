package Interfaces;

import Others.Visitor;

public interface ISecurity {
    public boolean isAllowedTo(Visitor visitor);
}
