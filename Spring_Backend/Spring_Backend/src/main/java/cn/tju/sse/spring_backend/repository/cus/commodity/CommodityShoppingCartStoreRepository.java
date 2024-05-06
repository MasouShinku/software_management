package cn.tju.sse.spring_backend.repository.cus.commodity;

import cn.tju.sse.spring_backend.model.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description
 */
public interface CommodityShoppingCartStoreRepository extends JpaRepository<StoreEntity, Integer> {
}
