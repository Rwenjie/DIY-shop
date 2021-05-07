package nuc.rwenjie.modules.sys.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 商品规格参数模板，json格式。
 * </p>
 *
 * @author Rwenjie
 * @since 2021-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Specification对象", description="商品规格参数模板，json格式。")
public class SpecificationModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "规格模板所属商品分类id")
    private Long categoryId;

    @ApiModelProperty(value = "规格参数模板，json格式 ，其实就是相当于一个分类里比如手机，这个大类别的共有规格属性属性")
    private String specifications;


}
