package cz.pcu.network.builder.filereader;

import cz.pcu.network.builder.NetworkTopology;

import java.util.Dictionary;
import java.util.List;

public interface IFileReader {
    public List<Dictionary<String, String>> ReadNetworkTopology(String filePath);
}
