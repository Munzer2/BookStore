package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.service.MyBookListService;

@Controller
public class MyBookListController {
    @Autowired
    private MyBookListService m_service;
    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id) {
        m_service.deleteById(id);
        return "redirect:/my_books";
    }
}
