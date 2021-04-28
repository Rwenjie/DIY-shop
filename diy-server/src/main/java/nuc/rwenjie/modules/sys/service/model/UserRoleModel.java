package nuc.rwenjie.modules.sys.service.model;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "SysMemberRole对象", description = "用户角色关联表")
public class UserRoleModel implements Serializable {
    static final long serialVersionUID = 1L;

    private String userId;

    private Integer roleId;
}
