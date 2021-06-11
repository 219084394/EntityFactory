package za.ac.cput.Entity;

/* Wajedien Samuels
    216287820
 */

public class Building {

    private String BuildCode, BuildName;

    private Building (Builder builder){
        this.BuildCode = builder.BuildCode;
        this.BuildName = builder.BuildName;
    }

    @Override
    public String toString() {
        return "Building{" +
                "BuildCode='" + BuildCode + '\'' +
                ", BuildName='" + BuildName + '\'' +
                '}';
    }

    public static class Builder{

        private String BuildCode, BuildName;

        public Builder setBuildCode(String buildCode) {
            this.BuildCode = buildCode;

            return this;
        }

        public Builder setBuildName(String buildName) {
            this.BuildName = buildName;

            return this;
        }

        public Building build() {

            return new Building(this);
        }

        public Builder copy(Building building) {
            this.BuildCode = building.BuildCode;
            this.BuildName = building.BuildName;

            return this;
        }
    }
}