package com.spring_boot.projectEx.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_boot.projectEx.dao.IProductDAO;
import com.spring_boot.projectEx.model.ProductVO;

@Service
public class ProductService implements IProductService {

   //My batis 사용하는ㄱ ㅕㅇ우
   @Autowired
   @Qualifier("IProductDAO")
   private IProductDAO dao;
   
   @Override
   public ArrayList<ProductVO> ctgListProduct(String ctgId) {
      return dao.ctgListProduct(ctgId);
   }

   @Override
   public ArrayList<ProductVO> listAllProduct() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void insertProduct(ProductVO prd) {
      // TODO Auto-generated method stub

   }

   @Override
   public void updateProduct(ProductVO prd) {
      // TODO Auto-generated method stub

   }

   @Override
   public void deleteProduct(String prdNo) {
      // TODO Auto-generated method stub

   }

   @Override
   public ProductVO detailViewProduct(String prdNo) {
      return dao.detailViewProduct(prdNo);
    
   }

   @Override
   public String prdNoCheck(String prdNo) {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public ArrayList<ProductVO> productSearch(HashMap<String, Object> map) {
      // TODO Auto-generated method stub
      return null;
   }

} 