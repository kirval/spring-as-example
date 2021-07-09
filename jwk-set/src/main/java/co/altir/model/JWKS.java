package co.altir.model;

import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class JWKS {

  private List<Map<String, Object>> keys;

}
