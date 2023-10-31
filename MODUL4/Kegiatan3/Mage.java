public class Mage extends Hero {
    String role = "Mage";
    Mage(int level){
    this.setHealthPoint(role);
    this.getHealthPoint();
    this.setattackDamage();
        
    }
    @Override
    void spawnIntro() {
        // TODO Auto-generated method stub
        System.out.println("You Die");
    }
}
