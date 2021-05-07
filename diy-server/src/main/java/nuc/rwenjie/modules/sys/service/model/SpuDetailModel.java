package nuc.rwenjie.modules.sys.service.model;

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
@ApiModel(value="SpuDetail对象", description="")
public class SpuDetailModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "spu id")
    private Long spuId;

    @ApiModelProperty(value = "商品描述信息")
    private String description;

    @ApiModelProperty(value = "全部规格参数数据")
    private String specifications;

    @ApiModelProperty(value = "特有规格参数及可选值信息，json格式")
    private String specTemplate;

    @ApiModelProperty(value = "包装清单")
    private String packingList;

    @ApiModelProperty(value = "售后服务")
    private String afterService;

    @ApiModelProperty(value = "相关文章id")
    private Long articleId;


}
