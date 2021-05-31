package com.jinxiu.business.service;

import java.util.List;
import com.jinxiu.business.domain.ClientDetails;

/**
 * 客户端信息Service接口
 * 
 * @author Allen
 * @date 2021-04-12
 */
public interface IClientDetailsService 
{
    /**
     * 查询客户端信息
     * 
     * @param appid 客户端信息ID
     * @return 客户端信息
     */
    public ClientDetails selectClientDetailsById(String appid);

    /**
     * 查询客户端信息列表
     * 
     * @param clientDetails 客户端信息
     * @return 客户端信息集合
     */
    public List<ClientDetails> selectClientDetailsList(ClientDetails clientDetails);

    /**
     * 新增客户端信息
     * 
     * @param clientDetails 客户端信息
     * @return 结果
     */
    public int insertClientDetails(ClientDetails clientDetails);

    /**
     * 修改客户端信息
     * 
     * @param clientDetails 客户端信息
     * @return 结果
     */
    public int updateClientDetails(ClientDetails clientDetails);

    /**
     * 批量删除客户端信息
     * 
     * @param appids 需要删除的客户端信息ID
     * @return 结果
     */
    public int deleteClientDetailsByIds(String[] appids);

    /**
     * 删除客户端信息信息
     * 
     * @param appid 客户端信息ID
     * @return 结果
     */
    public int deleteClientDetailsById(String appid);
}
