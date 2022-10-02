package gcu.rsoemo.cst391.milestone.referencearchitecturelayer;

public class UserModel
{
    // Class Variables
    private int user_id;
    private String user_name;
    private String password;

    // constructors
    public UserModel(){super();}
    public UserModel(int user_id, String user_name, String password) {
        super();
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
    }

    // getters and setters
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "UserModel: + "
                + "'ID=" + getUser_id() + "', "
                + "'Name=" + getUser_name() + "', "
                + "'Password=" + getPassword() + "' ";
    }
}