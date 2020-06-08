package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttakIntelligenceVehicle;
import Missions.Mission;

public class F15 extends AerialAttakIntelligenceVehicle implements FighterJet {
    public F15(String sensorType, int rocketAmount, String rocketType, String pilotName, Mission mission,
               int hoursFromLastRepair, Boolean isReadyForFlight){
        super(sensorType, rocketAmount, rocketType, pilotName, mission, hoursFromLastRepair, isReadyForFlight);
    }

    public int getMaxHoursToFlyWithoutRepair() {
        return MAX_HOURS_TO_FLY_WITHOUT_REPAIR;
    }
}