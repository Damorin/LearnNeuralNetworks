import network.Network;

/**
 * Created by njb11150 on 22/10/2015.
 */
public class RunNetwork {

    public static void main(String[] args) {
        Network network = new Network();
        network.sendInputs(10, 3);
        network.sendInputs(6,9);

    }

}
