package com.soft1841.controller;

import com.soft1841.service.Impl.SellerServiceImpl;
import com.soft1841.service.SellerService;

public class ServiceFactory {
    public static SellerService getSellerServiceInstance() {
        return (SellerService) new SellerServiceImpl();
    }

}
