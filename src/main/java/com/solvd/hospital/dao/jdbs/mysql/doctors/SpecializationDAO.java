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

    @Override
    public void create(Specialization model) {
        try {
            Connection cn = ConnectionSettings.getConnection();
            PreparedStatement ps = cn.prepareStatement("INSERT INTO specializations(name) VALUES(?)");
            ps.setString(1, model.getName());
            logger.info(ps.executeUpdate());
        } catch (SQLException e) {
            logger.error(e.getMessage());
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
        Connection cn = ConnectionSettings.getConnection();
        try {
            Statement statement = cn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM specializations WHERE id=" + id);
            logger.info(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Specialization> getAll() {
        return null;
    }
}
