package cn.tju.sse.spring_backend.dto.cus.commodity;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName CommodityGetCurveRequestDTO
 * @Description 用于接收前端发来的商品id
 */
@Getter
@Setter
public class CommodityGetCurveRequestDTO {
    private int com_id;
}
