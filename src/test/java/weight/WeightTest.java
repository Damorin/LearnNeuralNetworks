package weight;

import neuron.Neuron;
import org.junit.Before;
import org.mockito.Mockito;

/**
 * Created by njb11150 on 22/10/2015.
 */
public class WeightTest {

    private Weight weight;
    private Neuron neuronA;
    private Neuron neuronB;

    @Before
    public void setUp() throws Exception {
        this.weight = Mockito.mock(Weight.class);
        this.neuronA = Mockito.mock(Neuron.class);
        this.neuronB = Mockito.mock(Neuron.class);
    }



}