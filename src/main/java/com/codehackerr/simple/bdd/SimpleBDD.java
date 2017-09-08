package com.codehackerr.simple.bdd;

import java.util.HashSet;
import java.util.Set;

public class SimpleBDD {
    private static Set<StepLister> listeners = new HashSet<>();

    static Step given(String description, Runnable r) {
        return runStep(description, r);
    }

    static void when(String description, Runnable r) {
        runStep(description, r);
    }

    static void then(String description, Runnable r) {
        runStep(description, r);
    }

    public static void addStepListener(StepLister stepLister) {
        listeners.add(stepLister);
    }

    private static Step runStep(String description, Runnable r) {
        listeners.forEach(l -> l.start(description));
        Step step = new Step(description, r).run();
        listeners.forEach(l -> l.finish(description));
        return step;
    }
}

class Step {
    private String description;
    private final Runnable step;

    public Step(String description, Runnable r) {
        this.description = description;
        this.step = r;
    }

    public Step run() {
        step.run();
        return this;
    }

    public Step when(Runnable r) {
        return new Step(description, r).run();
    }

    public Step then(Runnable r) {
        return new Step(description, r).run();
    }
}


