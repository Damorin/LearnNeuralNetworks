package network;

import neuron.Neuron;
import neuron.NeuronImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by njb11150 on 22/10/2015.
 */
public class Network {

    private Neuron neuronA;
    private Neuron neuronB;
    private Neuron neuronC;
    private Neuron neuronD;

    public Network() {
        neuronA = new NeuronImpl();
        neuronB = new NeuronImpl();
        neuronC = new NeuronImpl();
        neuronD = new NeuronImpl();

        List<Neuron> aOutputs = new ArrayList<>();
        aOutputs.add(neuronC);
        aOutputs.add(neuronD);

        List<Neuron> bOutputs = new ArrayList<>();
        bOutputs.add(neuronC);
        bOutputs.add(neuronD);

        neuronA.setActivationThreshold(15);
        neuronA.setWeight(1);
        neuronA.setOutputDestinations(aOutputs);

        neuronB.setActivationThreshold(1);
        neuronB.setWeight(2);
        neuronB.setOutputDestinations(bOutputs);

        neuronC.setActivationThreshold(1);
        neuronC.setWeight(1);

        neuronD.setActivationThreshold(1);
        neuronD.setWeight(1);
    }

    public void sendInputs(float a, float b) {
        this.neuronA.receive(a);
        this.neuronB.receive(b);
    }
}
