package nuc.rwenjie.modules.sys.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Rwenjie
 * @since 2021-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_spu_detail")
public class SpuDetailDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long spuId;

    private String description;

    private String specifications;

    private String specTemplate;

    private String packingList;

    private String afterService;

    private Long articleId;


}
