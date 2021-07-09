package co.altir.service;

import co.altir.model.JWKS;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class JWKSService {

  private final List<Map<String, Object>> publicKeys = new ArrayList<>();

  public JWKS getKeys() {
    return new JWKS().setKeys(publicKeys);
  }

  public void addKey(Map<String, Object> key) {
    publicKeys.add(key);
  }

}
