package neuron;

import java.util.List;

/**
 * Created by njb11150 on 22/10/2015.
 */
public interface Neuron {

    void receive(float input);
    void setActivationThreshold(float threshold);
    void setWeight(float weight);
    void setOutputDestinations(List<Neuron> outputDestinations);
}
