package AerialVehicles;

import Missions.IntelligenceMission;

public interface AerialIntelligenceVehicle extends AerialVehicleService{
    default String collectIntelligence() {
        return getPilotName() + ": " + getClass().getSimpleName() + " Collecting Data in " +
                ((IntelligenceMission)getMission()).getRegion() + " with sensor type: " + getSensorType();
    }

    String getSensorType();

    void setSensorType(String sensorType);
}
