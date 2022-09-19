package com.solvd.hospital;

import com.solvd.hospital.dao.jdbs.mysql.doctors.SpecializationDAO;
import com.solvd.hospital.models.doctors.Specialization;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    Logger logger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {

        SpecializationDAO sp = new SpecializationDAO();
        Specialization specialization = new Specialization("Surgeon");
        sp.create(specialization);
        sp.get(specialization.getId());
    }
}