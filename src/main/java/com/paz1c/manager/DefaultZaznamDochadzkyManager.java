package com.paz1c.manager;

import com.paz1c.dao.DaoFactory;
import com.paz1c.dao.ZaznamDochadzkyDao;
import com.paz1c.other.ZaznamDochadzky;


public class DefaultZaznamDochadzkyManager implements ZaznamDochadzkyManager{

    private final ZaznamDochadzkyDao zaznamDochadzkyDao;
    
    public DefaultZaznamDochadzkyManager() {
        zaznamDochadzkyDao = DaoFactory.INSTANCE.getZaznamDochadzkyDao();
    }
    
    

    @Override
    public boolean vlozZaznam(ZaznamDochadzky zaznam) {
       return zaznamDochadzkyDao.vlozZaznam(zaznam);
    }

    @Override
    public boolean upravZaznam(ZaznamDochadzky zaznam) {
        return zaznamDochadzkyDao.upravZaznam(zaznam);
    }

    @Override
    public boolean zmazZaznam(ZaznamDochadzky zaznam) {
        return zaznamDochadzkyDao.zmazZaznam(zaznam);
    }

    @Override
    public ZaznamDochadzky getPoslednyZaznam(Long idOsoba) {
        return zaznamDochadzkyDao.getPoslednyZaznam(idOsoba);
    }
    
}
