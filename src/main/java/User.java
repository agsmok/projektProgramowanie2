public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    public enum Role{
        USER ("USER"), ADMIN ("ADMIN");

        private String fullLogin;

        Role(String e) {
            fullLogin = e;
        }

        public String getFullLogin() {
            return fullLogin;
        }
    }
}
