package cn.tju.sse.spring_backend.repository.cus.commodity;

import cn.tju.sse.spring_backend.model.CommodityImageEntity;
import cn.tju.sse.spring_backend.model.CommodityImageEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description
 */
public interface CommodityShoppingCartCommodityImageRepository extends JpaRepository<CommodityImageEntity, CommodityImageEntityPK> {
    CommodityImageEntity findDistinctFirstByComId(int com_id);
}
