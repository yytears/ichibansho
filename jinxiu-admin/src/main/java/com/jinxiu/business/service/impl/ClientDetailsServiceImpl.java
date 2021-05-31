package com.jinxiu.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jinxiu.business.mapper.ClientDetailsMapper;
import com.jinxiu.business.domain.ClientDetails;
import com.jinxiu.business.service.IClientDetailsService;

/**
 * 客户端信息Service业务层处理
 * 
 * @author Allen
 * @date 2021-04-12
 */
@Service
public class ClientDetailsServiceImpl implements IClientDetailsService 
{
    @Autowired
    private ClientDetailsMapper clientDetailsMapper;

    /**
     * 查询客户端信息
     * 
     * @param appid 客户端信息ID
     * @return 客户端信息
     */
    @Override
    public ClientDetails selectClientDetailsById(String appid)
    {
        return clientDetailsMapper.selectClientDetailsById(appid);
    }

    /**
     * 查询客户端信息列表
     * 
     * @param clientDetails 客户端信息
     * @return 客户端信息
     */
    @Override
    public List<ClientDetails> selectClientDetailsList(ClientDetails clientDetails)
    {
        return clientDetailsMapper.selectClientDetailsList(clientDetails);
    }

    /**
     * 新增客户端信息
     * 
     * @param clientDetails 客户端信息
     * @return 结果
     */
    @Override
    public int insertClientDetails(ClientDetails clientDetails)
    {
        return clientDetailsMapper.insertClientDetails(clientDetails);
    }

    /**
     * 修改客户端信息
     * 
     * @param clientDetails 客户端信息
     * @return 结果
     */
    @Override
    public int updateClientDetails(ClientDetails clientDetails)
    {
        return clientDetailsMapper.updateClientDetails(clientDetails);
    }

    /**
     * 批量删除客户端信息
     * 
     * @param appids 需要删除的客户端信息ID
     * @return 结果
     */
    @Override
    public int deleteClientDetailsByIds(String[] appids)
    {
        return clientDetailsMapper.deleteClientDetailsByIds(appids);
    }

    /**
     * 删除客户端信息信息
     * 
     * @param appid 客户端信息ID
     * @return 结果
     */
    @Override
    public int deleteClientDetailsById(String appid)
    {
        return clientDetailsMapper.deleteClientDetailsById(appid);
    }
}
