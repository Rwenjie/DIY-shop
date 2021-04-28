package nuc.rwenjie.modules.sys.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
@TableName("tb_specification")
@ApiModel(value="Specification对象", description="商品规格参数模板，json格式。")
public class Specification implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "规格模板所属商品分类id")
    private Long categoryId;

    @ApiModelProperty(value = "规格参数模板，json格式 ，其实就是相当于一个分类里比如手机，这个大类别的共有规格属性属性")
    private String specifications;


}
