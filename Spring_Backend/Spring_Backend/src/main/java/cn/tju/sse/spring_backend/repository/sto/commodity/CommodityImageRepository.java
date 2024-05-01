package cn.tju.sse.spring_backend.repository.sto.commodity;

import cn.tju.sse.spring_backend.model.CommodityImageEntity;
import cn.tju.sse.spring_backend.model.CommodityImageEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

/**
 * 商品图片
 */
public interface CommodityImageRepository extends JpaRepository<CommodityImageEntity, CommodityImageEntityPK> {
    ArrayList<CommodityImageEntity> findCommodityImageEntitiesByComId(int COM_ID);
    int deleteCommodityImageEntityByComIdAndComImage(int COM_ID,String COM_IMAGE);
}
