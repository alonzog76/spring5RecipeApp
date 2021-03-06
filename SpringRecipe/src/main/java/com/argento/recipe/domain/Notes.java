package com.argento.recipe.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

public class Notes {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	Long id;
	
	@OneToOne
	Recipe recipe;
	
	@Lob
	String recipeNotes;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Recipe getRecipe() {
		return recipe;
	}
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	public String getRecipeNotes() {
		return recipeNotes;
	}
	public void setRecipeNotes(String recipeNotes) {
		this.recipeNotes = recipeNotes;
	}
	
}
