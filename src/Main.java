public class Main {
    public static void main(String[] args) {

        /*Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;

        player.loseHealth(damage);

        System.out.println("remaining health = " + player.healthRemaining());

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());*/


    EnchancePlayer tim = new EnchancePlayer("tim",200,"sword");
        System.out.println("Initial health is = " + tim.healthRemaining());


}
}
