package cn.tju.sse.spring_backend.repository.sto.commodity;

import cn.tju.sse.spring_backend.model.CommodityEntity;
import cn.tju.sse.spring_backend.model.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 上传商品
 */
public interface CommodityRepository extends JpaRepository<CommodityEntity,Integer>{
    CommodityEntity findCommodityEntityByComId(int COM_ID);
    List<CommodityEntity> findCommodityEntityByComStatusTrue();
}
