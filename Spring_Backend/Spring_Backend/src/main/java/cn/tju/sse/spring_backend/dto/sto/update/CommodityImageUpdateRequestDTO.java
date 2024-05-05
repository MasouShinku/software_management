package cn.tju.sse.spring_backend.dto.sto.update;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

/**
 * 更新图片
 */
@Getter
@Setter
public class CommodityImageUpdateRequestDTO {
    private MultipartFile file;
    private String IMAGE_KEY;
    private String key;
    private int COM_ID;
}
