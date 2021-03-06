package com.app.web_demo.dao;


import com.app.web_demo.models.Etudiant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EtudiantDao implements DataAccess<Etudiant> {

    @Override
    public void save(Etudiant o) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO etudiants VALUES (NULL,?,?,?)");
            statement.setString(1,o.getNom());
            statement.setString(2,o.getPrenom());
            statement.setDouble(3,o.getNote());
            statement.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Etudiant o) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE etudiants SET nom=?,prenom=?,note=? WHERE id=?");
            statement.setString(1,o.getNom());
            statement.setString(2,o.getPrenom());
            statement.setDouble(3,o.getNote());
            statement.setLong(4,o.getId());
            statement.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Etudiant o) {
        try {
            System.out.println(o+"from doa");
            PreparedStatement statement = connection.prepareStatement("DELETE FROM etudiants WHERE id = ?");
            statement.setLong(1,o.getId());
            statement.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Etudiant> findAll() {
        List<Etudiant> etudiants = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM etudiants");
            ResultSet set = statement.executeQuery();
            while (set.next()){
                etudiants.add(
                        new Etudiant(
                                set.getInt(1),
                                set.getString(2),
                                set.getString(3),
                                set.getDouble(4)
                        )
                );
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return etudiants;
    }

    @Override
    public Etudiant find(long id) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM etudiants WHERE id = ?");
            statement.setLong(1,id);
            ResultSet set = statement.executeQuery();
            if(set.next()){
                return new Etudiant(
                        set.getInt(1),
                        set.getString(2),
                        set.getString(3),
                        set.getDouble(4)
                );
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
