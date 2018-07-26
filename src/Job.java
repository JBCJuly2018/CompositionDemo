// Created this class first because of composition relationship
// Best practice to create the smaller or the "inside class" first
// If you declare that a Person has a Job, but the "Job" doesn't exist yet, you cant.
public class Job {

    // Variables specific to the Job class
    private String role;
    private long salary;
    private int id;

    // Getters allow readability bc our variables are private
    public String getRole() {
        return role;
    }

    // Setters allow updatability bc our variables are private
    public void setRole(String role) {
        this.role = role;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
