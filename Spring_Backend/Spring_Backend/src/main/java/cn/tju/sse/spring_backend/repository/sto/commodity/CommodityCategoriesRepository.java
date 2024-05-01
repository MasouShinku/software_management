package cn.tju.sse.spring_backend.repository.sto.commodity;

import cn.tju.sse.spring_backend.model.CommodityCategoriesEntity;
import cn.tju.sse.spring_backend.model.CommodityCategoriesEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

/**
 * 商品类别
 */
public interface CommodityCategoriesRepository extends JpaRepository<CommodityCategoriesEntity,CommodityCategoriesEntityPK> {
    ArrayList<CommodityCategoriesEntity> findCommodityCategoriesEntitiesByComId(int COM_ID);
    int deleteCommodityCategoriesEntitiesByComId(int COM_ID);
}
