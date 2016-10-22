package com.paz1c.dao;

public enum OsobaDaoFactory {
    
    INSTANCE;
    
    private OsobaDao osobaDao;

    private OsobaDaoFactory() {
        osobaDao = new MySQLOsobaDao();
    }
    
    public OsobaDao getOsobaDao(){
        return osobaDao;
    }
    
}
