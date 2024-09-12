package edu.sm.service;

import edu.sm.dao.CustDao;
import edu.sm.dto.Cust;
import edu.sm.frame.ConnectionPool;
import edu.sm.frame.Dao;
import edu.sm.frame.MService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustService implements MService<String, Cust> {

    CustDao dao;
    ConnectionPool cp;

    public CustService() {
        dao = new CustDao();
        try {
            cp = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Cust add(Cust cust) throws Exception {
        Connection con = cp.getConnection();
        try {
            dao.insert(cust, con);
            System.out.println("Send SMS to:" + cust.getId());
        }catch(Exception e) {
            throw e;
        }finally {
            cp.releaseConnection(con);
        }
        return cust;
    }

    @Override
    public Cust modify(Cust cust) throws Exception {
        return null;
    }

    @Override
    public Boolean remove(Cust cust) throws Exception {
        return null;
    }

    @Override
    public Cust get(String s) throws Exception {
        return null;
    }

    @Override
    public List<Cust> get() throws Exception {
        return List.of();
    }
}
