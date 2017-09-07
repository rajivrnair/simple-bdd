package com.codehackerr.simple.bdd;/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static com.codehackerr.simple.bdd.BDDSteps.given;
import static com.codehackerr.simple.bdd.BDDSteps.then;
import static com.codehackerr.simple.bdd.BDDSteps.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class BDDStepsTest {

    @Mock
    private TestSteps steps;

    @Test
    public void given_step_invocation() {
        given(() -> {
            steps.step1();
        });

        verify(steps).step1();
    }

    @Test
    public void when_step_invocation() {
        when(() -> {
            steps.step1();
        });

        verify(steps).step1();
    }

    @Test
    public void then_step_invocation() {
        then(() -> {
            steps.step1();
        });

        verify(steps).step1();
    }

    interface TestSteps {
        public void step1();
    }
}
