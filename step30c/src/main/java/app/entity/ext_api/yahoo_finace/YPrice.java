package app.entity.ext_api.yahoo_finace;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class YPrice {
  private double raw;
}
