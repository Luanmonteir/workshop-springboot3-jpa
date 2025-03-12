package br.com.luan.course.services;

import br.com.luan.course.entities.Category;
import br.com.luan.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository userRepository;

    public List<Category> findAll(){
        return userRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = userRepository.findById(id);
        return obj.get();
    }
}
