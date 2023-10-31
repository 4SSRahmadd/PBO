public class Tank extends Hero {
    String role = "Tank";
    Tank(int level){
    this.setHealthPoint(role);
    this.getHealthPoint();
        
    }
    @Override
    void spawnIntro() {
        // TODO Auto-generated method stub
        System.out.println("You Die");
    }
}
