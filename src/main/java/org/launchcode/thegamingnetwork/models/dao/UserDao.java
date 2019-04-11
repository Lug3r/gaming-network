package org.launchcode.thegamingnetwork.models.dao;


import javafx.geometry.Pos;
import org.launchcode.thegamingnetwork.models.Post;
import org.launchcode.thegamingnetwork.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface UserDao extends CrudRepository<User, Integer> {

    User findByUid(int uid);

    List<User> findAll();
}