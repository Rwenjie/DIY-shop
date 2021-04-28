package nuc.rwenjie.modules.sys.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Data
@TableName(value = "tb_permission")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class PermissionDO implements Serializable {

    static final long serialVersionUID = 1L;

    private Integer id;

    private String url;

    private Integer roleId;

    private String permission;

    private List permissions;

    public List getPermissions() {
        return Arrays.asList(this.permission.trim().split(","));
    }
}
