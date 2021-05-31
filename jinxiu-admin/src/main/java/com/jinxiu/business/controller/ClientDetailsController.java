package com.jinxiu.business.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jinxiu.common.annotation.Log;
import com.jinxiu.common.core.controller.BaseController;
import com.jinxiu.common.core.domain.AjaxResult;
import com.jinxiu.common.enums.BusinessType;
import com.jinxiu.business.domain.ClientDetails;
import com.jinxiu.business.service.IClientDetailsService;
import com.jinxiu.common.utils.poi.ExcelUtil;
import com.jinxiu.common.core.page.TableDataInfo;

/**
 * 客户端信息Controller
 * 
 * @author Allen
 * @date 2021-04-12
 */
@RestController
@RequestMapping("/business/clientdetails")
public class ClientDetailsController extends BaseController
{
    @Autowired
    private IClientDetailsService clientDetailsService;

    /**
     * 查询客户端信息列表
     */
    @PreAuthorize("@ss.hasPermi('business:clientdetails:list')")
    @GetMapping("/list")
    public TableDataInfo list(ClientDetails clientDetails)
    {
        startPage();
        List<ClientDetails> list = clientDetailsService.selectClientDetailsList(clientDetails);
        return getDataTable(list);
    }

    /**
     * 导出客户端信息列表
     */
    @PreAuthorize("@ss.hasPermi('business:clientdetails:export')")
    @Log(title = "客户端信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ClientDetails clientDetails)
    {
        List<ClientDetails> list = clientDetailsService.selectClientDetailsList(clientDetails);
        ExcelUtil<ClientDetails> util = new ExcelUtil<ClientDetails>(ClientDetails.class);
        return util.exportExcel(list, "clientdetails");
    }

    /**
     * 获取客户端信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('business:clientdetails:query')")
    @GetMapping(value = "/{appid}")
    public AjaxResult getInfo(@PathVariable("appid") String appid)
    {
        return AjaxResult.success(clientDetailsService.selectClientDetailsById(appid));
    }

    /**
     * 新增客户端信息
     */
    @PreAuthorize("@ss.hasPermi('business:clientdetails:add')")
    @Log(title = "客户端信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ClientDetails clientDetails)
    {
        return toAjax(clientDetailsService.insertClientDetails(clientDetails));
    }

    /**
     * 修改客户端信息
     */
    @PreAuthorize("@ss.hasPermi('business:clientdetails:edit')")
    @Log(title = "客户端信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ClientDetails clientDetails)
    {
        return toAjax(clientDetailsService.updateClientDetails(clientDetails));
    }

    /**
     * 删除客户端信息
     */
    @PreAuthorize("@ss.hasPermi('business:clientdetails:remove')")
    @Log(title = "客户端信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{appids}")
    public AjaxResult remove(@PathVariable String[] appids)
    {
        return toAjax(clientDetailsService.deleteClientDetailsByIds(appids));
    }
}
