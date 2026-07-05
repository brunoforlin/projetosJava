public class PetMachine {

    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    //get

     public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("a maquina esta suja, necessario limpa-la");
            return;
        }
        if (this.pet != null) {
            System.out.println("o pet" + pet.getName() + "esta na maquina neste momento.");
        }

        this.pet = pet;
    }



    public void takeAShower (){

        if (pet == null) {
            System.out.println("coloque o pet na maquina para iniciar o banho.");
            return;
        }
        this.water -= 10;
        this.shampoo -=2;
        pet.setClear(true);
        System.out.println("o pet" + pet.getName() + "esta limpo.");

    }

    public void addWater (){
        if (water == 30) {
            System.out.println("a capacidade de agua na maquina está no maximo.");
        }

        water += 2;
    }

    public void addShampoo (){
        if (shampoo == 10) {
            System.out.println("a capacidade de agua na maquina está no maximo.");
        }

        shampoo += 2;
    }

    public boolean hasPet() {
        return pet != null;
    
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("o pet" + this.pet.getName() + "esta limpo.");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -=2;
        this.clean = true;
        System.out.println("maquina esta limpa.");
    }
    
}
