package cz.pcu.network.builder.filereader;

import cz.pcu.network.builder.NetworkTopology;

public interface IFileReader {
    public NetworkTopology ReadNetworkTopology(String filePath);
}
