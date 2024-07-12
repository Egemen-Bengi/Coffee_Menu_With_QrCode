package com.example.firstWebJava;

import com.example.firstWebJava.dao.ProductDao;
import com.example.firstWebJava.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchDataSourceScriptDatabaseInitializer;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class FirstWebJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstWebJavaApplication.class, args);
	}

	@RestController
	class HelloController {
		@GetMapping("/")
		public ResponseEntity<String> hello(){
			try {
				String html = new String(Files.readAllBytes(Paths.get("src/main/resources/static/index.html")));
				return ResponseEntity.ok().contentType(MediaType.TEXT_HTML).body(html);
			}
			catch (IOException e){
				System.out.println(e.getMessage());
				return ResponseEntity.internalServerError().build();
			}
		}
	}

	@RestController
	class ColdProductControllerNames {
		@GetMapping("/productsSogukUrunlerNames")
		public ResponseEntity<List<String>> getColdProductsNames() {
			List<String> productsName = ProductDao.getProductsName("Soğuk içecek");
			return ResponseEntity.ok().body(productsName);
		}
	}

	@RestController
	class ColdProductControllerPrice {
		@GetMapping("/productsSogukUrunlerPrices")
		public ResponseEntity<List<Integer>> getColdProductsPrices() {
			List<Integer> productsPrice = ProductDao.getProductsPrice("Soğuk içecek");
			return ResponseEntity.ok().body(productsPrice);
		}
	}

	@RestController
	class HotProductControllerNames {
		@GetMapping("/productsSicakUrunlerNames")
		public ResponseEntity<List<String>> getHotProductsNames() {
			List<String> productsName = ProductDao.getProductsName("Sıcak içecek");
			return ResponseEntity.ok().body(productsName);
		}
	}

	@RestController
	class HotProductControllerPrice {
		@GetMapping("/productsSicakUrunlerPrices")
		public ResponseEntity<List<Integer>> getHotProductsPrices() {
			List<Integer> productsPrice = ProductDao.getProductsPrice("Sıcak içecek");
			return ResponseEntity.ok().body(productsPrice);
		}
	}

	@RestController
	class SnacksProductControllerNames {
		@GetMapping("/productsAtistirmaliklarNames")
		public ResponseEntity<List<String>> getColdProductsNames() {
			List<String> productsName = ProductDao.getProductsName("Atıştırmalık");
			return ResponseEntity.ok().body(productsName);
		}
	}

	@RestController
	class SnacksProductControllerPrice {
		@GetMapping("/productsAtistirmalikPrices")
		public ResponseEntity<List<Integer>> getColdProductsPrices() {
			List<Integer> productsPrice = ProductDao.getProductsPrice("Atıştırmalık");
			return ResponseEntity.ok().body(productsPrice);
		}
	}
}
