public class PersonApp {

    public static void main(String[] args) {

        // Create a new Person object
        Person p = new Person();

        // Create a new Job object -- THIS IS NOT RELATED TO PERSON AT THE MOMENT
        Job a = new Job();
        a.setId(1);
        a.setRole("Programmer");
        a.setSalary(75000);

        // THIS IS WHERE THE COMPOSITION RELATIONSHIP IS BUILT
        p.setJob(a);

        House h = new House();
        h.setMortgage(475000);
        h.setNumOfRooms(7);

        p.setHouse(h);

        System.out.println("The salary for p person's job is: " + p.getJob().getSalary());
        System.out.println("The mortgage for p person's house is: " + p.getHouse().getMortgage());


    }

}
