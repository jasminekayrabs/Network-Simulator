package cz.pcu.network.builder;
import cz.pcu.network.builder.filereader.IFileReader;

public class NetworkBuilder {
    private IFileReader fileReader;
    private List<IDeviceFactory> deviceFactories;
    private List<IConnectionFctory> connectionFctories;
}
