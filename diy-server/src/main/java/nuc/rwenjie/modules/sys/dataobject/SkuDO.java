package nuc.rwenjie.modules.sys.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * sku表,该表表示具体的商品实体,如黑色的64GB的iphone 8
 * </p>
 *
 * @author Rwenjie
 * @since 2021-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_sku")
@ApiModel(value="Sku对象", description="sku表,该表表示具体的商品实体,如黑色的64GB的iphone 8")
public class SkuDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "sku id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "spu id")
    private Long spuId;

    @ApiModelProperty(value = "规格名称")
    private String name;

    @ApiModelProperty(value = "商品标题")
    private String title;

    @ApiModelProperty(value = "绑定商品图片")
    private String images;

    @ApiModelProperty(value = "单价,单位-元保留两位小数")
    private BigDecimal price;

    @ApiModelProperty(value = "库存数量")
    private Integer stock;

    @ApiModelProperty(value = "sku的特有规格参数，json格式，反序列化时应使用linkedHashMap，保证有序，等价于spu的spec_templat字段")
    private String ownSpec;

    @ApiModelProperty(value = "是否有效，0无效，1有效")
    private Integer enable;

    @ApiModelProperty(value = "添加时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime updateTime;


}
