public class Moon {
    private Planet planet;
    private int orbitTime;
    private boolean atmosphere;
    private String designation;

    Moon(Planet planet, int orbitTime, boolean atmosphere, String designation){
        this.planet = planet;
        this.orbitTime = orbitTime;
        this.atmosphere = atmosphere;
        this.designation = designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getDesignation() {
        return designation;
    }
    public Planet getPlanet() {
        return planet;
    }
    public void setPlanet(Planet planet) {
        this.planet = planet;
    }
    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }
    public int getOrbitTime() {
        return orbitTime;
    }
    public boolean isAtmosphere() {
        return atmosphere;
    }
    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public boolean equals(Moon obj) {
        return this.designation.equals(obj.designation);
    }

    @Override
    public String toString() {
        return "Planet: " + planet + "Orbit Time: " + orbitTime + "Atmosphere: " + atmosphere + "Designation: " + designation;
    }
}
