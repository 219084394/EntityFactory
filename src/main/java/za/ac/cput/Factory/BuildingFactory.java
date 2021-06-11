package za.ac.cput.Factory;

import za.ac.cput.Entity.Building;

/* Wajedien Samuels
    216287820
 */

public class BuildingFactory {

    public static Building createBuilding(String BuildCode, String BuildName) {

        Building building = new Building.Builder().
                setBuildCode(BuildCode).
                setBuildName(BuildName).
                build();

        return building;
    }
}