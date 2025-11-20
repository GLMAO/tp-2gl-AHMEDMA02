package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {
    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        String base = (coursDecorated != null) ? coursDecorated.getDescription() : "";
        return base + " (En ligne)";
    }

    @Override
    public double getDuree() {
        return (coursDecorated != null) ? coursDecorated.getDuree() : 0;
    }
}
