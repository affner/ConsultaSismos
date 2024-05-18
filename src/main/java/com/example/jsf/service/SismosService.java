package com.example.jsf.service;

import com.example.jsf.domain.DominioCount;
import com.example.jsf.domain.DominioRequest;
import com.example.jsf.domain.DominioSismos;


public interface SismosService {


    DominioSismos consultaSismosByQuery(DominioRequest request) throws Exception;

    DominioCount countSismosByQuery(DominioRequest request) throws Exception;
}
