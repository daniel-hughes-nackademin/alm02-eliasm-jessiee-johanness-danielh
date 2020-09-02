package com.alm2020.alm02eliasmjessieejohannessdanielh.api.controller;

import com.alm2020.alm02eliasmjessieejohannessdanielh.model.PortfolioItem;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class PortfolioItemController {

    @GetMapping("portfolio-items")
    public List<PortfolioItem> getAllPortfolioItems(){
        return null;
    }

    @PostMapping("portfolio-items")
    public PortfolioItem addPortfolioItem(@RequestBody PortfolioItem item){
        return item;
    }

    @DeleteMapping("portfolio-items")
    public PortfolioItem removePortfolioItem(@RequestParam Long id){

        return null;
    }
}
