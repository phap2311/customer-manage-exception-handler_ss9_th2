package com.example.customermanageexceptionhandler.service;

import com.example.customermanageexceptionhandler.Exception.DuplicateEmailException;
import com.example.customermanageexceptionhandler.model.Customer;

public interface ICustomerService extends IGenerateService<Customer>{
    void save(Customer customer) throws DuplicateEmailException;
}
