package com.wedevol.greetingserver.controller;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Greeting REST Controller
 * 
 * @author charz
 *
 */
@RestController
public class GreetingController {

  protected static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

  @GetMapping("/greeting")
  @ResponseStatus(HttpStatus.OK)
  public String greet() {
    logger.info("Access /greeting");
    final List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
    final Random rand = new Random();
    int randomNum = rand.nextInt(greetings.size());
    return greetings.get(randomNum);
  }

  @GetMapping("/")
  @ResponseStatus(HttpStatus.OK)
  public String home() {
    logger.info("Access /");
    return "Hi!";
  }

}
