package gcu.rsoemo.cst391.milestone.dataaccesslayer;

import gcu.rsoemo.cst391.milestone.referencearchitecturelayer.UserMapper;
import gcu.rsoemo.cst391.milestone.referencearchitecturelayer.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Component("UserTableAccess")
@Repository
public class UserTableAccess implements DatabaseTableInterface<UserModel>
{
    @Autowired
    DataSource dataSource;

    JdbcTemplate jdbcTemplate;

    /**
     * Class Constructor
     * @param dataSource Input of the datasource that we will use to connect to the MySQL database
     */
    public UserTableAccess(DataSource dataSource)
    {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void createObject(UserModel createdObject)
    {
        jdbcTemplate.update
        (
            "insert into users (user_name, user_password) value (?, ?)",
                createdObject.getUser_name(),
                createdObject.getPassword()
        );

    }

    @Override
    public List<UserModel> readObjects()
    {
        return jdbcTemplate.query("select * from users", new UserMapper());
    }

    @Override
    public UserModel readObject(int id)
    {
        return (UserModel) jdbcTemplate.query("select * from users where user_id="+id, new UserMapper());
    }

    @Override
    public void updateObject(UserModel updatedObject)
    {
        jdbcTemplate.update
                (
                        "update users set user_name=?, user_password=? where user_id=?",
                        updatedObject.getUser_name(),
                        updatedObject.getPassword(),
                        updatedObject.getUser_id()
                );
    }

    @Override
    public void deleteObject(UserModel deleteObject)
    {
        jdbcTemplate.update
                (
                        "delete from users where user_id=?",
                        deleteObject.getUser_id()
                );
    }
}
