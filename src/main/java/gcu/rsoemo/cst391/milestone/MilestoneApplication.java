package gcu.rsoemo.cst391.milestone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({"gcu.rsoemo.*"})
//@EntityScan("gcu.rsoemo.*")
@SpringBootApplication
public class MilestoneApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(MilestoneApplication.class, args);
    }
}