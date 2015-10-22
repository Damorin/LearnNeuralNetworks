package neuron;

/**
 * Created by njb11150 on 22/10/2015.
 */
public interface Neuron {

    void receive(float input);
    void setActivationThreshold(float threshold);
    float transmit(float output);
}
