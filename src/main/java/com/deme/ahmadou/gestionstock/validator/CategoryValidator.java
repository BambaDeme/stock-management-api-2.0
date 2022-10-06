package com.deme.ahmadou.gestionstock.validator;

import com.deme.ahmadou.gestionstock.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {

    public static List<String> validate(CategoryDto categoryDto){
        List<String> errors = new ArrayList<String>();

        if(categoryDto == null || !StringUtils.hasLength(categoryDto.getCode())){
            errors.add("Veuillez renseigner un code pour la categorie");
        }
        return errors;
    }
}
