package cn.tju.sse.spring_backend.dto.cus.search;

import lombok.Getter;
import lombok.Setter;
/**
 * @Description 用于获取地理位置远近排序的接口
 */
@Getter
@Setter
public class SendLocationRepositoryDTO {
    Integer sto_id;
    String sto_address;
}
