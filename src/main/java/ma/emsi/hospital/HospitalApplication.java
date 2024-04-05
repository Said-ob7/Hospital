package ma.emsi.hospital;

import ma.emsi.hospital.entities.Patient;
import ma.emsi.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"said",new Date(),true,99));
        patientRepository.save(new Patient(null,"rayan",new Date(),false,56));
        patientRepository.save(new Patient(null,"imrane",new Date(),false,43));

    }
}
