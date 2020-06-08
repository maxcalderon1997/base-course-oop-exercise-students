package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttakIntelligenceVehicle;
import Missions.Mission;

public class Eitan extends AerialAttakIntelligenceVehicle implements Haron {
    public Eitan(int rocketAmount, String rocketType, String sensorType, String pilotName, Mission mission,
                 int hoursFromLastRepair, Boolean isReadyForFlight){
        super(sensorType, rocketAmount, rocketType, pilotName, mission, hoursFromLastRepair, isReadyForFlight);
    }

    public int getMaxHoursToFlyWithoutRepair() {
        return MAX_HOURS_TO_FLY_WITHOUT_REPAIR;
    }
}
