public class pet {

    private final String name;
    private boolean clean;

    public pet(String name, boolean clean) {
        this.name = name;
        this.clean = clean;
    }
    
    public String getName() {
        return name;
    }



    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
    
    

}
