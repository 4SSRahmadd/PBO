public class User {
    private String username;
    private String password;
    
    //Metod setter username
    public void setUsername(String username){
        this.username = username;
    }

    //Metod setter password 
    public void setPassword(String password){
        this.password = password;
    }
    //Metod getter username
    public String getUsername(){
        return username;
    }
    //Metod getter password
    public String getPassword(){
        return password;
    }

    public static void main(String[] args){
    User user1 = new User();
    user1.setUsername("Yaasir");
    user1.setPassword("mad123");

    System.out.println("Username : " + user1.getUsername());
    System.out.println("Password : " + user1.getPassword());
}
}
