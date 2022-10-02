package gcu.rsoemo.cst391.milestone.referencearchitecturelayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<UserModel>
{
    @Override
    public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        UserModel userModel = new UserModel
                (
                        rs.getInt("user_id"),
                        rs.getString("user_name"),
                        rs.getString("user_password")
                );
        return userModel;
    }
}