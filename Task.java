public class Task {
    private String description;
    private boolean isComplet;

    public Task(String decription){
        this.description=decription;
        this.isComplet=false;

    }

    public Boolean GetIsComplet(){
       return this.isComplet;
    }

    public String Getdescription(){
        return this.description;
    }
    
    public void MarkAsComplet(){

        this.isComplet=true;

    }
    public void displayTask(){
        String status= this.isComplet == true ? "|done|" :"|pending|" ;

        System.out.println(this.description+":"+status);
    }
    
}
