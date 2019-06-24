public class ProjectTest {
    public static void main(String[] args){
        Project p = new Project();
        Project p2 = new Project("Second Project", "This is project 2 description...");
        Project p3 = new Project("Third Project");

        //Setting the name and description of new project
        p.setName("First Project");
        p.setDescription("This would be the description...");
        System.out.print(p.elevatorPitch()+"\n");
        //Printing project 2 pitch
        System.out.println(p2.elevatorPitch());
        //Printing out project 3's name
        System.out.println(p3.getName());

    }
}