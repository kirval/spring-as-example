package co.altir.controller;

import co.altir.model.JWKS;
import co.altir.service.JWKSService;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jwks")
public class JWKSController {

  private final JWKSService jwksService;

  public JWKSController(JWKSService jwksService) {
    this.jwksService = jwksService;
  }

  @GetMapping
  public ResponseEntity<JWKS> getJWKS() {
    return new ResponseEntity<>(jwksService.getKeys(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Void> addJWK(@RequestBody Map<String, Object> publicKey) {
    jwksService.addKey(publicKey);
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
