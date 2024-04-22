package cn.tju.sse.spring_backend.repository.pub.modify;

import cn.tju.sse.spring_backend.model.StoreimageEntity;
import cn.tju.sse.spring_backend.model.StoreimageEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description
 */
public interface StoreImageModifyRepository extends JpaRepository<StoreimageEntity, StoreimageEntityPK> {
    boolean existsDistinctByStoId(int id);
    StoreimageEntity findDistinctByStoId(int id);
}
