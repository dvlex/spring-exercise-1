package com.lexdrel.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lexdrel.com.dao.IPaymentDAO;

@Service
public class PaymentServiceImpl implements IPaymentService{

    @Autowired
    private IPaymentDAO dao;

    public IPaymentDAO getDao() {
        return dao;
    }

    public void setDao(IPaymentDAO dao) {
        this.dao = dao;
    }
}
