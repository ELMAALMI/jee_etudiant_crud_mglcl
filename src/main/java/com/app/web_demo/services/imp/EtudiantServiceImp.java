package com.app.web_demo.services.imp;


import com.app.web_demo.dao.EtudiantDao;
import com.app.web_demo.models.Etudiant;
import com.app.web_demo.services.EtudiantService;

import java.util.List;

public class EtudiantServiceImp implements EtudiantService {
    private EtudiantDao etudiantDao = new EtudiantDao();
    @Override
    public void save(Etudiant etudiant) {etudiantDao.save(etudiant);}
    @Override
    public void update(Etudiant etudiant) {
        etudiantDao.update(etudiant);
    }

    @Override
    public void delete(Etudiant etudiant) {
        etudiantDao.delete(etudiant);
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiantDao.findAll();
    }

    @Override
    public Etudiant findOne(long id) {
        return etudiantDao.find(id);
    }

}
