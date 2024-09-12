package edu.sm.dao;

import edu.sm.dto.Cust;
import edu.sm.frame.Dao;
import edu.sm.frame.Sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class CustDao implements Dao<String, Cust> {
    @Override
    public Cust insert(Cust cust, Connection con) throws Exception {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(Sql.insertCust);
            ps.setString(1, cust.getId());
            ps.setString(2, cust.getPwd());
            ps.setString(3, cust.getName());
            ps.executeUpdate();
        }catch(Exception e) {
            throw e;
        }finally {
            if(ps != null){
                ps.close();
            }
        }
        return cust;
    }

    @Override
    public Cust update(Cust cust, Connection con) throws Exception {
        return null;
    }

    @Override
    public Boolean delete(Cust cust, Connection con) throws Exception {
        return null;
    }

    @Override
    public Cust select(String s, Connection con) throws Exception {
        return null;
    }

    @Override
    public List<Cust> select(Connection con) throws Exception {
        return List.of();
    }
}
