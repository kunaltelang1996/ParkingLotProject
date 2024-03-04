package Controller;

import Models.ParkingLot;
import Service.InitialisationService;

public class InitController{
    private InitialisationService initialisationService;

    public InitController(InitialisationService initialisationService) {
        this.initialisationService = initialisationService;
    }

    public ParkingLot init()
    {
        return initialisationService.init();
    }
}
