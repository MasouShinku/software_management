package cn.tju.sse.spring_backend.dto.pub.modify;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName CustomerModifyResponseDTO
 * @Description 发送给前端的 是否修改顾客成功 的消息
 */
@Getter
@Setter
public class CustomerModifyResponseDTO {
    private String message;
}
