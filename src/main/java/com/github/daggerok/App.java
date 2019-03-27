package com.github.daggerok;

import org.apache.meecrowave.Meecrowave;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.concurrent.TimeUnit;

@Path("kitchen")
@ApplicationScoped
public class App {

  @GET
  public String getMenu() {
    return "good things";
  }

  public static void main(String[] args) throws InterruptedException {
    try (final Meecrowave meecrowave = new Meecrowave().bake()) {
      System.out.println("waiting forever...");
      while (true) TimeUnit.MINUTES.sleep(5);
    }
  }
}
