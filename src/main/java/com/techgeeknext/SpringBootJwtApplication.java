package com.techgeeknext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//https://www.techgeeknext.com/spring/spring-boot-security-token-authentication-jwt
/**
  *使用示例:
 *1. curl -X POST -i -H 'Content-type:application/json' 'http://127.0.0.1:8080/authenticate' --data '{"username":"techgeeknext","password":"password"}'
 *2. curl -X GET -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWNoZ2Vla25leHQiLCJleHAiOjE2MDU1ODMyMjcsImlhdCI6MTYwNTU4MzE2N30.fh5ymTgKAH-2zepwcYW7jdBtCUuXjIenMwiNIFlTP1zfYK3hcutjqjoKgNVhl41oChqOTffJzG23LoiN0UwOaw' -i 'http://127.0.0.1:8080/employees'
 */


@SpringBootApplication
public class SpringBootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtApplication.class, args);
	}

}
