package com.maxmendes.projetooauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.security.Principal;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class ProjetoOauth2Application {

	@GetMapping("/")
	public ResponseEntity<?> message(Principal principal){


		return ResponseEntity.ok().body(principal);
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoOauth2Application.class, args);
	}

}
