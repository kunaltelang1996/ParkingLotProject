package Exception;

public class ParkingSpotNotFpundForVehicleException extends RuntimeException{

    public ParkingSpotNotFpundForVehicleException() {
    }

    public ParkingSpotNotFpundForVehicleException(String message) {
        super(message);
    }

    public ParkingSpotNotFpundForVehicleException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingSpotNotFpundForVehicleException(Throwable cause) {
        super(cause);
    }

    public ParkingSpotNotFpundForVehicleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
