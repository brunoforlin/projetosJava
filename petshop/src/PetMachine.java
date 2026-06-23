public class PetMachine {

    private boolean clean;
    private int water;
    private int shampoo;
    private pet pet;

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void takeAShower(){
        if (this.pet == null) {
            System.out.println("Coloque o pet na maquina para iniciar o banho.");
            
        }

        pet.setClean(true);
        System.out.println("o pet " + pet.getName() + "esta limpo.");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("a capacidade de agua da maquina esta no maximo.");
            return;
          }

        water += 12;
    }

     public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("a capacidade de agua da maquina esta no maximo.");
            return;
        }
        shampoo += 2;
    }

     public boolean hasPet(){
        return pet != null;
        }

        public void setPet (pet pet) {
            if (!this.clean) {
                System.out.println("a maquina esta suja, necessario limpa-la");
                return;
            }   

        

           
} }
