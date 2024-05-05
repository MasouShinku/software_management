package cn.tju.sse.spring_backend.dto.sto.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 上传商品Response
 */
@Getter
@Setter
public class CommodityUploadResponseDTO {
    private int com_id;
    private String message;
}
