package cn.tju.sse.spring_backend.dto.pub.modify;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName StoreModifyResponseDTO
 * @Description 用于返回给前端的 商家信息是否修改成功的 消息
 */
@Getter
@Setter
public class StoreModifyResponseDTO {
    private String message;
}
