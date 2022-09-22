package com.solvd.hospital.dao.jdbs.mysql.doctors;

import com.solvd.hospital.dao.interfaces.ISpecializationDAO;
import com.solvd.hospital.models.doctors.Specialization;
import com.solvd.hospital.settings.ConnectionSettings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.List;

public class SpecializationDAO implements ISpecializationDAO {
    private final Logger logger = LogManager.getLogger(SpecializationDAO.class.getName());
    private static final String INSERT = "INSERT INTO specializations(name) VALUES(?)";
    @Override
    public void create(Specialization model) {
        Connection cn = ConnectionSettings.getConnection();
        PreparedStatement ps = null;
        try{
            ps = cn.prepareStatement(INSERT);
            ps.setString(1, model.getName());
            int rows = ps.executeUpdate();

            if(rows > 0)
                System.out.println("Success!");
        } catch (SQLException e) {
            logger.error(e.getMessage());
        }finally {
            ConnectionSettings.close(cn);
            ConnectionSettings.close(ps);
        }
    }

    @Override
    public void update(Specialization model) {

    }

    @Override
    public void delete(Specialization model) {

    }


    @Override
    public Specialization get(int id) {
        return null;
    }

    @Override
    public List<Specialization> getAll() {
        return null;
    }
}
