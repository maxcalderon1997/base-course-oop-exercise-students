package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.Mission;

public class Zik  extends AerialVehicle implements AerialIntelligenceVehicle, AerialBdaVehicle, Hermes {
    private String sensorType, cameraType;

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int hoursFromLastRepair,
               Boolean isReadyForFlight){
        super(pilotName, mission, hoursFromLastRepair, isReadyForFlight);
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public int getMaxHoursToFlyWithoutRepair() {
        return MAX_HOURS_TO_FLY_WITHOUT_REPAIR;
    }
}
