package nuc.rwenjie.modules.sys.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * spu表，该表描述的是一个抽象的商品，比如 手机
 * </p>
 *
 * @author Rwenjie
 * @since 2021-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Spu对象", description="spu表，该表描述的是一个抽象的商品，比如 手机")
public class SpuModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "spu id")
    private Long id;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "子标题")
    private String subTitle;

    @ApiModelProperty(value = "1级类目id")
    private Integer cid1;

    @ApiModelProperty(value = "2级类目id")
    private Integer cid2;

    @ApiModelProperty(value = "3级类目id")
    private Integer cid3;

    @ApiModelProperty(value = "产品主图,url相对地址")
    private String mainImage;

    @ApiModelProperty(value = "图片地址,json格式,扩展用")
    private String subImages;

    @ApiModelProperty(value = "产品图片 用,分割")
    private String images;

    @ApiModelProperty(value = "运费模板")
    private Long expreeTemplateId;

    @ApiModelProperty(value = "发货详细地址")
    private String address;

    @ApiModelProperty(value = "商品状态.1-在售 2-下架 3-删除")
    private Integer status;

    @ApiModelProperty(value = "添加时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime updateTime;


}
