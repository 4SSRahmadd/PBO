public class Assassin extends Hero {
    String role = "Assassin";
    Assassin(int level){
    this.setHealthPoint(role);
    this.getHealthPoint();
        
    }
    @Override
    void spawnIntro() {
        // TODO Auto-generated method stub
        System.out.println("You Die");
    }
}
