package cn.tju.sse.spring_backend.repository.cus.search;

import cn.tju.sse.spring_backend.model.CommoditiesCategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description
 */
public interface SearchCategoriesRepository extends JpaRepository<CommoditiesCategoriesEntity, String> {
}
