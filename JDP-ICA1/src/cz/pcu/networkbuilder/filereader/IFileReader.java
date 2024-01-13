package cz.pcu.networkbuilder.filereader;

import java.util.Dictionary;
import java.util.List;

public interface IFileReader {
    public List<Dictionary<String, String>> ReadNetworkTopology(String filePath);
}
