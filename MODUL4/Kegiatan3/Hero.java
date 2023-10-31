abstract class Hero{
    private double healthPoint;
	private double attackDamage;
	private double defence;
	private int level;
	private boolean lifeStatus;

    public void setHealthPoint(String role) {
        if(role == "Tank"){
            healthPoint = 7000;
        }
        else if(role == "Assasin"){
            healthPoint = 3000;
        }
        else if(role == "Mage"){
            healthPoint = 2500;
        }
    }

    public double getHealthPoint() {
        return healthPoint;
    }

    public void attack(Hero target){}
    public void reviewDamage(double damage){}
    abstract void spawnIntro();
    public void checkStatus(){}


}