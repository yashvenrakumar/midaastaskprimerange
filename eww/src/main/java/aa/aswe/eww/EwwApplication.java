package aa.aswe.eww;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
@RestController
public class EwwApplication {

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}

		if (n == 2) {
			return true;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	static ArrayList<user> listofuser = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(EwwApplication.class, args);
		System.out.println("Yesvendra");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of User : ");
		int tuser = sc.nextInt();

		for (int us = 1; us <= tuser; us++) {
			LocalDateTime DateandTime = LocalDateTime.now(); // Date
			long startTime = System.currentTimeMillis(); // calculate millis
			System.out.print(" User @: " + us + " Enter the Number A : ");
			int a = sc.nextInt();
			System.out.print(" User @: " + us + " Enter the Number B : ");
			int b = sc.nextInt();
			String StartDateAndTime = DateandTime + "  Stating MilliSecond  " + startTime;
			String EndDateandTime = DateandTime + "  :";
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = a; i <= b; i++) {
				if (isPrime(i)) {
					list.add(i);
				}
			}
			EndDateandTime += "  Ending Millisecond =  " + startTime + " And Difference of Millis = "
					+ (System.currentTimeMillis()-startTime ) ;
			listofuser.add(new user(a, b, list.size(), list, StartDateAndTime, EndDateandTime));

		}

		sc.close();
	}
     
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ArrayList<user> hello() {
 

		return listofuser;

	}

 

}