package AerialVehicles;

import Missions.AttackMission;

public interface AerialAttackVehicle extends AerialVehicleService{
    default String attack() {
        return getPilotName() + ": " + getClass().getSimpleName() + " Attacking " + ((AttackMission)getMission()).getTarget() + " with: " +
                getRocketType() + "X" + getRocketAmount();
    }
    int getRocketAmount();
    void setRocketAmount(int rocketAmount);
    String getRocketType();
    void setRocketType(String rocketType);
}
