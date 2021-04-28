package nuc.rwenjie.modules.sys.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@TableName(value = "tb_role")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class RoleDO implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;
}
