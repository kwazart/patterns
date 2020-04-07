package com.kwazartArt.patterns.behavioral.visitor;

public class CallToClient implements BuildingPart {
    @Override
    public void beDone(Employee employee) {
        employee.doStage(this);
    }
}
