package cz.pcu.devices;

import java.util.ArrayList;
        import java.util.List;

public class RoutingTable {
    private List<RoutingTableRecord> records;

    public RoutingTable() {
        this.records = new ArrayList<>();
    }

    public List<RoutingTableRecord> getRecords() {
        return records;
    }

    public NetworkInterface lookup(String ipAddr) {
        for (RoutingTableRecord record : records) {
            if (record.getNetworkDestination().equals(ipAddr)) {
                return record.getPort();
            }
        }
        return null; // Return null if not found
    }

    public void add(String ipAddr, NetworkInterface port) {
        records.add(new RoutingTableRecord(ipAddr, port));
    }
}
