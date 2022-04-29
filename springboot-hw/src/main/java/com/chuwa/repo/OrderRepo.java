package com.chuwa.repo;

import com.chuwa.Pojo.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;

public interface OrderRepo extends PagingAndSortingRepository<Order,Long> {
    Page<Order> findAllBy(Pageable pageable);

    Page<Order> findByAmount(Double amount);

    Slice<Order> findByProduct_nameAndUnit_price(String productName, Double unitPrice);







}
