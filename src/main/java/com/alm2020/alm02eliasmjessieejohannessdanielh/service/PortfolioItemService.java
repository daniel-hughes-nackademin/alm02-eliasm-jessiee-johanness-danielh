package com.alm2020.alm02eliasmjessieejohannessdanielh.service;

import com.alm2020.alm02eliasmjessieejohannessdanielh.api.repository.PortfolioItemRepository;
import com.alm2020.alm02eliasmjessieejohannessdanielh.model.PortfolioItem;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Service
public class PortfolioItemService {

    private final PortfolioItemRepository repository;

    public PortfolioItemService(PortfolioItemRepository repository) {
        this.repository = repository;
    }

    public List<PortfolioItem> getPortfolioItems(){
        return repository.findAll();
    }

    @Transactional
    public PortfolioItem addPortfolioItem(PortfolioItem portfolioItem){
        return repository.save(portfolioItem);
    }

    @Transactional
    public void deletePortfolioItem(Long id){
       repository.findById(id)
               .ifPresentOrElse(repository::delete,
                       ()-> {throw new ResponseStatusException(BAD_REQUEST, "Cannot delete item with non-present id");
        });
    }
}
