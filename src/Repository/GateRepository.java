package Repository;

import Models.Gate;
import Exception.GateNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> gateMap;

    public GateRepository() {
        this.gateMap = new HashMap<>();
    }

    public Gate get(int gateId)
    {
        Gate gate = gateMap.get(gateId);
        if(gate == null)
        {
            throw new GateNotFoundException("There is no gate with this gate ID");
        }
        return gate;
    }

    public void put(Gate gate)
    {
        gateMap.put(gate.getId(), gate);
        System.out.println("Gate has been added successfully");
    }
}
