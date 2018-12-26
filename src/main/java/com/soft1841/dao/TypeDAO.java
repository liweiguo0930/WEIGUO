package com.soft1841.dao;

import com.soft1841.entity.Type;
import com.sun.xml.internal.stream.Entity;

import java.sql.SQLException;
import java.util.List;

/**
 * @parm id
 * @return
 * @throwa SQLException
 */
public interface TypeDAO {

/**
 * 新增一个类，返回自增主键(Long)
 * @param type
 * @throws SQLException
 */
Long insertType (Type type) throws  SQLException;
/**
 * 根据id删除类别
 * @param
 * @return
 */
int deleteTypeById (long id) throws  SQLException;
/**
 * 查询所有类别
 * @return
 */
List<Entity> selectAllTypes() throws SQLException;
}
