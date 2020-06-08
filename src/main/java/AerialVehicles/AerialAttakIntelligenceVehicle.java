package AerialVehicles;

import Missions.Mission;

public abstract class AerialAttakIntelligenceVehicle extends AerialVehicle implements AerialAttackVehicle,
        AerialIntelligenceVehicle{
    private int rocketAmount;
    private String rocketType, sensorType;

    public AerialAttakIntelligenceVehicle(String sensorType, int rocketAmount, String rocketType, String pilotName, Mission mission,
                                   int hoursFromLastRepair, Boolean isReadyForFlight){
        super(pilotName, mission, hoursFromLastRepair, isReadyForFlight);
        this.rocketAmount = rocketAmount;
        this.rocketType = rocketType;
        this.sensorType = sensorType;
    }

    public int getRocketAmount() {
        return rocketAmount;
    }

    public void setRocketAmount(int rocketAmount) {
        this.rocketAmount = rocketAmount;
    }

    public String getRocketType() {
        return rocketType;
    }

    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }
}
