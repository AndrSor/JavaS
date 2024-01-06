package Lesson_08_Serialization;

import java.io.Serializable;
import java.util.Arrays;

public class SavedGame2 implements Serializable {

    private TerritoriesInfo territoriesInfo;
    private ResourcesInfo resourcesInfo;
    private DiplomacyInfo diplomacyInfo;

    public SavedGame2(TerritoriesInfo territoriesInfo, ResourcesInfo resourcesInfo, DiplomacyInfo diplomacyInfo) {
        this.territoriesInfo = territoriesInfo;
        this.resourcesInfo = resourcesInfo;
        this.diplomacyInfo = diplomacyInfo;
    }

    public TerritoriesInfo getTerritoriesInfo() {
        return territoriesInfo;
    }

    public void setTerritoriesInfo(TerritoriesInfo territoriesInfo) {
        this.territoriesInfo = territoriesInfo;
    }

    public ResourcesInfo getResourcesInfo() {
        return resourcesInfo;
    }

    public void setResourcesInfo(ResourcesInfo resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public DiplomacyInfo getDiplomacyInfo() {
        return diplomacyInfo;
    }

    public void setDiplomacyInfo(DiplomacyInfo diplomacyInfo) {
        this.diplomacyInfo = diplomacyInfo;
    }


}
