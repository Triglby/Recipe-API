package com.qa.business.service;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.repository.RecipeRepository;

public class RecipeServiceImpl implements RecipeService{

	@Inject
	private RecipeRepository repo;
	
	public String getAllRecipes() {
		return repo.getAllRecipes();
	}
	
	@Override
	public String addRecipe(String recipe) {
		return repo.createRecipe(recipe);
	}
	
	@Override
	public String deleteRecipe(Long id) {
		return repo.deleteRecipe(id);
	}
	
	public void setRepo(RecipeRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public int cycleRecipes(String recipe) {
		return repo.cycleRecipes(recipe);
	}
	
	@Override
	public String getARecipe(Long id) {
		return repo.getARecipe(id);
	}
	
	@Override
	public String updateRecipe(String recipe, Long id) {
		return repo.updateRecipe(recipe, id);
	}

}
