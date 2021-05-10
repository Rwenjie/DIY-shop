package nuc.rwenjie.modules.sys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import nuc.rwenjie.common.utils.RespBean;
import nuc.rwenjie.modules.sys.service.model.GoodsModel;
import nuc.rwenjie.modules.sys.service.model.SkuModel;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Rwenjie
 * @ClassName GoodsController
 * @Description TODO 商品
 * @Date 2021/5/9 15:39
 **/

@Api(tags = "GoodsController")
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @ApiOperation("提交商品 商品发布")
    @PostMapping("/submit")
    public RespBean submit (@RequestBody GoodsModel goods) {

        System.out.println(goods.toString());

        return RespBean.success("发布成功");
//        return RespBean.success("发布成功", goods);
    }
}
