package cn.will;

import cn.will.dao.CustomerRepository;
import cn.will.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Desc:
 * Author: will
 * Date: 19:03 2017/10/11
 */
@SpringBootApplication
public class SpringBootApplicationStart implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationStart.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        repository.deleteAll();

        repository.save(new Customer("will", "kevin"));
        repository.save(new Customer("Bob", "kevin"));

        System.out.println("Customer found with findAll():");
        System.out.println("------------------------------");

        for (Customer customer : repository.findAll()
                ) {
            System.out.println(customer);
        }

        System.out.println();

        System.out.println("Customer found with findByFirstName('will')");
        System.out.println("-------------------------------------------");
        System.out.println(repository.findByFirstName("will"));

        System.out.println("Customers found with findByLastName('kevin')");
        System.out.println("--------------------------------------------");
        for (Customer customer : repository.findByLastName("kevin")
                ) {
            System.out.println(customer);
        }

    }
}
