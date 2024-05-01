package cn.tju.sse.spring_backend.repository.sto.commodity;

import cn.tju.sse.spring_backend.model.CommodityPriceCurveEntity;
import cn.tju.sse.spring_backend.model.CommodityPriceCurveEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

/**
 * 价格曲线
 */
public interface CommodityPriceCurveRepository extends JpaRepository<CommodityPriceCurveEntity, CommodityPriceCurveEntityPK> {
    ArrayList<CommodityPriceCurveEntity> findCommodityPriceCurveEntitiesByComId(int COM_ID);

    void deleteCommodityPriceCurveEntitiesByComId(int COM_ID);
}
