package com.fpt.shopping.seeder;

import com.fpt.shopping.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;

public class ApplicationSeeder extends CommandLineRunner {

    boolean createSeedData = false;
    /*final OrderRepository orderRepository;*/

    @Override
    public void run(String... args) throws Exception {
        if(createSeedData){
        }
    }
}
