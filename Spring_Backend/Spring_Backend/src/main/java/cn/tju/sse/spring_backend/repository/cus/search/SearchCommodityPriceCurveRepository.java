package cn.tju.sse.spring_backend.repository.cus.search;

import cn.tju.sse.spring_backend.model.CommodityPriceCurveEntity;
import cn.tju.sse.spring_backend.model.CommodityPriceCurveEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description 用于搜索接口
 */
public interface SearchCommodityPriceCurveRepository extends JpaRepository<CommodityPriceCurveEntity, CommodityPriceCurveEntityPK> {
    /**
     * @Description 获取商品价格曲线
     */
    List<CommodityPriceCurveEntity> getCommodityPriceCurveEntitiesByComId(Integer com_id);
}
