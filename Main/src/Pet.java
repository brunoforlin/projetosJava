public class Pet {

    private String name;
    private boolean clean;

    //construtor
    public Pet(String name, boolean clean) {
        this.name = name;
        this.clean = false;
    }
    //get e set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClear(boolean clean) {
        this.clean = clean;
    }



    
    

}
