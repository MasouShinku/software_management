package cn.tju.sse.spring_backend.dto.sto.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 价格曲线
 */
@Getter
@Setter
public class CommodityTimePriceDTO {
    @JsonProperty("TIME_POINT")
    private String time_point;
    @JsonProperty("PRICE_PERCENT")
    private int price_percent;
}
