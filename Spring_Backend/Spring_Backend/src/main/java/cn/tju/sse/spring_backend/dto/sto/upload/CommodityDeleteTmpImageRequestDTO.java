package cn.tju.sse.spring_backend.dto.sto.upload;

import lombok.Getter;
import lombok.Setter;

/**
 * 删除临时文件夹Request
 */
@Getter
@Setter
public class CommodityDeleteTmpImageRequestDTO {
    private String fileName;
    private String IMAGE_KEY;
}
