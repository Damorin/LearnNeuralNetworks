package weight;

import neuron.Neuron;

/**
 * Created by njb11150 on 22/10/2015.
 */
public class WeightImpl implements Weight {
    private float weightValue;
    private Neuron neuronA;
    private Neuron neuronB;

    public WeightImpl(Neuron neuronA, Neuron neuronB) {
        this.neuronA = neuronA;
        this.neuronB = neuronB;
    }

    public void setWeightValue(float value) {
        this.weightValue = value;
    }
}
