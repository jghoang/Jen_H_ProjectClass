public class Project {
    private String name;
    private String description;
    // private Double initalCost;

    public String elevatorPitch(){
        return this.getName()+": "+ this.getDescription();
    }
    public Project(){
        this.name = "";
        this.description = "";
        
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    //Getters
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    //Setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
}