package gcu.rsoemo.cst391.milestone.frameworklayer;

import gcu.rsoemo.cst391.milestone.dataaccesslayer.DatabaseTableInterface;
import gcu.rsoemo.cst391.milestone.referencearchitecturelayer.UserModel;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserAPI
{
    @Autowired
    @Qualifier("UserTableAccess")
    private DatabaseTableInterface<UserModel> database;

    /**
     *
     * @param model
     * @return
     */
    @PostMapping("/api/users")
    public UserModel createUser(UserModel model)
    {
        database.createObject(model);
        return database.readObject(1);
    }

    @GetMapping("/api/users")
    public List<UserModel> readUsers()
    {
        return database.readObjects();
    }

    /**
     *
     * @param model
     * @return
     */
    @PostMapping("/api/users/{id}")
    public UserModel updateUser(UserModel model)
    {
        database.updateObject(model);
        return database.readObject(1);
    }

    @DeleteMapping("/api/users/{id}")
    public UserModel deleteUser(int id)
    {
        UserModel nowdeleted = database.readObject(id);
        database.deleteObject(nowdeleted);
        return nowdeleted;
    }


    //https://spring.io/guides/tutorials/rest/
}