package cz.pcu.networkbuilder;
import cz.pcu.networkbuilder.factories.connections.IConnectionFactory;
import cz.pcu.networkbuilder.factories.devices.IDeviceFactory;
import cz.pcu.networkbuilder.filereader.IFileReader;

import java.util.List;

public class NetworkBuilder {
    private IFileReader fileReader;
    private List<IDeviceFactory> deviceFactories;
    private List<IConnectionFactory> connectionFctories;
    public void setFileReader(IFileReader fileReader) {
    }
    public NetworkTopology GetTopology() {
        return null;
    }
}
