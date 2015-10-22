package neuron;

/**
 * Created by njb11150 on 22/10/2015.
 */
public class NeuronImpl implements Neuron {
    private float input;
    private float activationThreshold;

    public void receive(float input) {
        this.input += input;
    }

    public void setActivationThreshold(float threshold) {
        this.activationThreshold = threshold;
    }

    public float transmit(float output) {
        return input;
    }
}
