package org.learningu.scheduling.optimization;

/**
 * A temperature function that "cools" as more steps are executed.
 * 
 * @author lowasser
 */
public interface TemperatureFunction {
  double temperature(int currentStep, int nSteps);
}
