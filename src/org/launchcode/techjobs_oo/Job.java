package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1; //stays static bc it exists outside of the created Jobs


    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        this.id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location,  PositionType positionType, CoreCompetency coreCompetency){
            this();
            this.name = name;
            this.employer = employer;
            this.location = location;
            this.positionType = positionType;
            this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employer=" + employer +
                ", location=" + location +
                ", positionType=" + positionType +
                ", coreCompetency=" + coreCompetency +
                '}';
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Job job = (Job) object;
        return id == job.id;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
