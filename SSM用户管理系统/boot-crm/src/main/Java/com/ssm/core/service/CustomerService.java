package com.ssm.core.service;
import com.ssm.common.utils.Page;
import com.ssm.core.po.Customer;


public interface CustomerService {
    // 查询客户列表
    Page<Customer> findCustomerList(Integer page, Integer rows,
                                    String custName, String custSource,
                                    String custIndustry, String custLevel);
    int createCustomer(Customer customer);
    // 通过id查询客户
    Customer getCustomerById(Integer id);
    // 更新客户
    int updateCustomer(Customer customer);

    // 删除客户
    int deleteCustomer(Integer id);
}