// Person is the bigger or "outside class" of the composition relationship
public class Person {

    // Can still have normal variables
    private String name;
    private String email;

    // Creating a has-a relationship: Person has-a Job
    private Job job;

    // Person has-a House
    private House house;

    // Second step: Every time you construct a new Person object
    // You want to also construct a new Job, and House object
    // This will say: As soon as I create a person, this person has a job, and has a house
    public Person() {
        job = new Job();
        house = new House();
        //job.setSalary(100000);
        //house.setMortgage(500000);
    }

    // Very important to see the value of this person's job
    public Job getJob() {
        return job;
    }

    // Very important to update the value of this person's job
    public void setJob(Job job) {
        this.job = job;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
