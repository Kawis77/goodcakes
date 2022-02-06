package com.goodcakes.service.mapper;

import com.goodcakes.dao.entity.CompanyEntity;
import com.goodcakes.web.model.CompanyModel;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper {

    public CompanyEntity companyEntityForm (CompanyModel companyModel){
        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setId(companyModel.getId());
        companyEntity.setCompanyName(companyModel.getCompanyName());
        companyEntity.setArticleEntities(companyModel.getArticleModels());
        companyEntity.setComments(companyModel.getComments());
        companyEntity.setCity(companyModel.getCity());
        companyEntity.setDescription(companyModel.getDescription());
        companyEntity.setDistrict(companyModel.getDistrict());
        companyEntity.setEmail(companyModel.getEmail());
        companyEntity.setLogin(companyModel.getLogin());
        companyEntity.setPassword(companyModel.getPassword());
        companyEntity.setNumberOfStreet(companyModel.getNumberOfStreet());
        companyEntity.setOwnerName(companyModel.getOwnerName());
        companyEntity.setOwnerSurname(companyModel.getOwnerSurname());
        companyEntity.setPhoneNumber(companyModel.getPhoneNumber());
        companyEntity.setRating(companyModel.getRating());
        companyEntity.setRecipeEntities(companyModel.getRecipeEntities());
        companyEntity.setStreet(companyModel.getStreet());
        companyEntity.setZipCode(companyModel.getZipCode());
        return companyEntity;
    }

    public CompanyModel companyModelForm (CompanyEntity companyEntity){
        CompanyModel companyModel = new CompanyModel();
        companyModel.setId(companyEntity.getId());
        companyModel.setCompanyName(companyEntity.getCompanyName());
        companyModel.setArticleModels(companyEntity.getArticleEntities());
        companyModel.setComments(companyEntity.getComments());
        companyModel.setCity(companyEntity.getCity());
        companyModel.setDescription(companyEntity.getDescription());
        companyModel.setDistrict(companyEntity.getDistrict());
        companyModel.setEmail(companyEntity.getEmail());
        companyModel.setLogin(companyEntity.getLogin());
        companyModel.setPassword(companyEntity.getPassword());
        companyModel.setNumberOfStreet(companyEntity.getNumberOfStreet());
        companyModel.setOwnerName(companyEntity.getOwnerName());
        companyModel.setOwnerSurname(companyEntity.getOwnerSurname());
        companyModel.setPhoneNumber(companyEntity.getPhoneNumber());
        companyModel.setRating(companyEntity.getRating());
        companyModel.setRecipeEntities(companyEntity.getRecipeEntities());
        companyModel.setStreet(companyEntity.getStreet());
        companyModel.setZipCode(companyEntity.getZipCode());
        return companyModel;
    }


}
