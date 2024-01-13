package cz.pcu.network.builder;
import cz.pcu.network.builder.factories.connection.IConnectionFactory;
import cz.pcu.network.builder.factories.device.IDeviceFactory;
import cz.pcu.network.builder.filereader.IFileReader;
import jdk.jshell.spi.ExecutionControl;

import java.util.Dictionary;
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
