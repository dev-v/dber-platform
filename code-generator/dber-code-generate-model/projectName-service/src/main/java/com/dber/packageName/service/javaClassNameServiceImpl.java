package com.dber.#{packageName}.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dber.platform.mapper.IMapper;
import com.dber.platform.service.AbstractService;
import com.dber.#{packageName}.api.entity.#{javaClassName};
import com.dber.#{packageName}.mapper.#{javaClassName}Mapper;

/**
 * <li>文件名称: #{javaClassName}Service.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Service
public class #{javaClassName}ServiceImpl extends AbstractService<#{javaClassName}> implements #{javaClassName}Service {

	@Autowired
	private #{javaClassName}Mapper mapper;

	@Override
	protected IMapper<#{javaClassName}> getMapper() {
		return this.mapper;
	}

}
