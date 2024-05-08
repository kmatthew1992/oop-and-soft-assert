package data.user;

public class UserFactory {
    public static User getUserWithInvalidPassword(){
        User user = new User();
        user.setPassword("secauce");
        user.setUsername("standard_user");
        return user;
    }

    public static User getUserWithValidCredentials() {
        User user = new User();
        user.setPassword("secret_sauce");
        user.setUsername("standard_user");
        return user;
    }
}
