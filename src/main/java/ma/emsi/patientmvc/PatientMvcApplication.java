package ma.emsi.patientmvc;

import ma.emsi.patientmvc.entities.Patient;
import ma.emsi.patientmvc.repositories.PatientRepositorie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMvcApplication.class, args);
    }
//@Bean
    CommandLineRunner commandLineRunner(PatientRepositorie patientRepositorie){
        return  args -> {
            patientRepositorie.save(new Patient(null,"hassan",new Date(),false,55));
            patientRepositorie.save(new Patient(null,"amine",new Date(),true,56));
            patientRepositorie.save(new Patient(null,"mehdi",new Date(),true,33));
            patientRepositorie.save(new Patient(null,"yassine",new Date(),false,543));
            patientRepositorie.findAll().forEach(p->{
                System.out.println(p.getNom());
            });

        };
    }
}
