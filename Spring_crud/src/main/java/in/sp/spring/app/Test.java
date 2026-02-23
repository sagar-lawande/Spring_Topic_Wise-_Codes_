package in.sp.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




import in.sp.spring.repository.StudentRepository;
import in.sp.spring.resources.ConfigurationFile;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigurationFile.class);
        System.out.println("Spring Container start");

        StudentRepository repo =
                context.getBean(StudentRepository.class);

        //INSERT
        repo.save(101,"Girish",100);

        // UPDATE
       repo.updateName(1, "Nikhil");

        // READ
       

        // DELETE
       repo.deleteById(101);
    }
}