package neuron;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by njb11150 on 22/10/2015.
 */
public class NeuronImpl implements Neuron {

    private List<Neuron> outputDestinations;

    private float input;
    private float activationThreshold;
    private float weight;

    public NeuronImpl() {
        this.outputDestinations = new ArrayList<>();
    }

    public void receive(float input) {
        this.input += input;
        System.out.println("Input is: " + input);
        transmit();
    }

    public void setActivationThreshold(float threshold) {
        this.activationThreshold = threshold;
    }

    private void transmit() {
        if (this.input >= activationThreshold) {
            sendSignal();
        }
    }

    private void sendSignal() {
        if (!this.outputDestinations.isEmpty()) {
            for (Neuron neuron : this.outputDestinations) {
                neuron.receive(modifySignal());
            }
        }
        else {
            System.out.println("Output is: " + modifySignal());
        }
    }

    private float modifySignal() {
        return input * weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOutputDestinations(List<Neuron> outputDestinations) {
        this.outputDestinations = outputDestinations;
    }
}
