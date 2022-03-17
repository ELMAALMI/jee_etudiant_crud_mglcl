package com.app.web_demo.services;


import com.app.web_demo.models.Etudiant;

import java.util.List;

public interface EtudiantService {
    void save(Etudiant etudiant);
    void update(Etudiant etudiant);
    void delete(Etudiant etudiant);
    List<Etudiant> findAll();
    Etudiant findOne(long id);
}
