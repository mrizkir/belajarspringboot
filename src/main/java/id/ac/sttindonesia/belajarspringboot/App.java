package id.ac.sttindonesia.belajarspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class App implements CommandLineRunner
{
  public static void main (String[] args)
  {
    SpringApplication.run(App.class, args);
  }

  @Override
  public void run(String... args) throws Exception
  {    
    
  }
}