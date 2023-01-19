public class EnchancePlayer {

    private String fullName;
    private int healthPercentace;
    private String weapon;

    public EnchancePlayer(String fullName) {
        this(fullName, 100,"Sword");
    }

    public EnchancePlayer(String fullName, int healthPercentace, String weapon) {
        this.fullName = fullName;
        if(healthPercentace <= 0){
            this.healthPercentace = 1;
        }else if(healthPercentace > 100){
            this.healthPercentace = 100;
        }else{
            this.healthPercentace = healthPercentace;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage){

        healthPercentace = healthPercentace - damage;
        if(healthPercentace < 0 ){
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining(){
        return healthPercentace;
    }

    public void restoreHealth(int extraHealth){
        healthPercentace = healthPercentace + extraHealth;
        if (healthPercentace > 100){
            System.out.println("Player restored to 100% ");
            healthPercentace = 100;
        }
    }
}
