package Service.SpotAllocationStrategy;

public class SpotAllocationStrategyFactory {
    public static SpotAllocationStrategy getSpotAllocationStrategy()
    {
        return new LinearSpotAllocationStrategy();
    }
}
