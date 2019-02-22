package Hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookApplication {

    private static final Logger log = LoggerFactory.getLogger(BookApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class);
    }

    @Bean
    public CommandLineRunner demo(BuddyRepo repository) {
        return (args) -> {
            // save a couple of BuddyInfos
            repository.save(new BuddyInfo("Jack", "123"));
            repository.save(new BuddyInfo("Chloe", "321"));
            repository.save(new BuddyInfo("Kim", "456"));
            repository.save(new BuddyInfo("David", "987"));
            repository.save(new BuddyInfo("Michelle", "148"));

            // fetch all buddyInfos
            log.info("BuddyInfos found with findAll():");
            log.info("-------------------------------");
            for (BuddyInfo buddy : repository.findAll()) {
                log.info(buddy.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            repository.findById(1L)
                    .ifPresent(buddy -> {
                        log.info("BuddyInfo found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(buddy.toString());
                        log.info("");
                    });

            // fetch BuddyInfo by last name
            log.info("BuddyInfo found with findByName('Chloe'):");
            log.info("--------------------------------------------");
            repository.findByName("Chloe").forEach(chloe -> {
                log.info(chloe.toString());
            });
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            // 	log.info(bauer.toString());
            // }
            log.info("");
        };
    }
}