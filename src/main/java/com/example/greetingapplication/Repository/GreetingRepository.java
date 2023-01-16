package com.example.greetingapplication.Repository;

import com.example.greetingapplication.Model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
