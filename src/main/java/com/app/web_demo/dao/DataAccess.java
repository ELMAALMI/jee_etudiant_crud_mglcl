package com.app.web_demo.dao;


import com.app.web_demo.config.DbConnection;
import com.app.web_demo.models.Etudiant;

import java.sql.Connection;
import java.util.List;

public interface DataAccess <T>{
    Connection connection = DbConnection.getConnection();
    void save(T o);
    void update(T o);
    void delete(T o);
    List<T> findAll();
    Etudiant find(long id);
}
