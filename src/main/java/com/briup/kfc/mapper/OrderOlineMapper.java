package com.briup.kfc.mapper;

import com.briup.kfc.bean.OrderOnline;
import com.briup.kfc.bean.OrderOnlineExample;
import java.util.List;

import com.briup.kfc.bean.extend.OnlineDetails;
import com.briup.kfc.bean.extend.OrderDetails;
import org.apache.ibatis.annotations.Param;

public interface OrderOlineMapper {
    List<OrderDetails>findById(long id);

    List<OnlineDetails>findAllDetails();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_orderline
     *
     * @mbg.generated Sun May 19 23:28:11 CST 2019
     */
    long countByExample(OrderOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_orderline
     *
     * @mbg.generated Sun May 19 23:28:11 CST 2019
     */
    int deleteByExample(OrderOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_orderline
     *
     * @mbg.generated Sun May 19 23:28:11 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_orderline
     *
     * @mbg.generated Sun May 19 23:28:11 CST 2019
     */
    int insert(OrderOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_orderline
     *
     * @mbg.generated Sun May 19 23:28:11 CST 2019
     */
    int insertSelective(OrderOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_orderline
     *
     * @mbg.generated Sun May 19 23:28:11 CST 2019
     */
    List<OrderOnline> selectByExample(OrderOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_orderline
     *
     * @mbg.generated Sun May 19 23:28:11 CST 2019
     */
    OrderOnline selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_orderline
     *
     * @mbg.generated Sun May 19 23:28:11 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderOnline record, @Param("example") OrderOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_orderline
     *
     * @mbg.generated Sun May 19 23:28:11 CST 2019
     */
    int updateByExample(@Param("record") OrderOnline record, @Param("example") OrderOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_orderline
     *
     * @mbg.generated Sun May 19 23:28:11 CST 2019
     */
    int updateByPrimaryKeySelective(OrderOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_orderline
     *
     * @mbg.generated Sun May 19 23:28:11 CST 2019
     */
    int updateByPrimaryKey(OrderOnline record);
}