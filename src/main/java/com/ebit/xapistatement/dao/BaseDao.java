package com.ebit.xapistatement.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebit.xapistatement.model.BaseModel;

public interface BaseDao<T extends BaseModel> extends JpaRepository<T, Serializable> {

	//void delete(long id);

}
