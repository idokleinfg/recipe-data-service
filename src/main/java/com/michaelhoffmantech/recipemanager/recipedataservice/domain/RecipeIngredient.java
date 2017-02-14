package com.michaelhoffmantech.recipemanager.recipedataservice.domain;
// Generated Feb 13, 2017 4:02:01 PM by Hibernate Tools 5.2.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Recipeingredient generated by hbm2java
 */
@Entity
@Table(name = "recipe_ingredient")
public class RecipeIngredient implements java.io.Serializable {

   private static final long serialVersionUID = -6219355201572086875L;

   private Integer recipeIngredientId;
   private Recipe recipe;
   private String createdBy;
   private Date createdTimestamp;
   private String ingredientAmount;
   private String ingredientMeasurement;
   private String ingredientType;
   private Integer sequenceNumber;

   public RecipeIngredient() {
   }

   public RecipeIngredient(Integer recipeIngredientId, Recipe recipe, String createdBy,
         Date createdTimestamp, String ingredientType, Integer sequenceNumber) {
      this.recipeIngredientId = recipeIngredientId;
      this.recipe = recipe;
      this.createdBy = createdBy;
      this.createdTimestamp = createdTimestamp;
      this.ingredientType = ingredientType;
      this.sequenceNumber = sequenceNumber;
   }

   public RecipeIngredient(Integer recipeIngredientId, Recipe recipe, String createdBy,
         Date createdTimestamp, String ingredientAmount, String ingredientMeasurement,
         String ingredientType, Integer sequenceNumber) {
      this.recipeIngredientId = recipeIngredientId;
      this.recipe = recipe;
      this.createdBy = createdBy;
      this.createdTimestamp = createdTimestamp;
      this.ingredientAmount = ingredientAmount;
      this.ingredientMeasurement = ingredientMeasurement;
      this.ingredientType = ingredientType;
      this.sequenceNumber = sequenceNumber;
   }

   @Id
   @SequenceGenerator(name = "recipe_ingredient_recipe_ingredient_id_seq",
         sequenceName = "recipe_ingredient_recipe_ingredient_id_seq", allocationSize = 1)
   @GeneratedValue(strategy = GenerationType.SEQUENCE,
         generator = "recipe_ingredient_recipe_ingredient_id_seq")
   @Column(name = "recipe_ingredient_id", unique = true, nullable = false)
   public Integer getRecipeIngredientId() {
      return this.recipeIngredientId;
   }

   public void setRecipeIngredientId(Integer recipeIngredientId) {
      this.recipeIngredientId = recipeIngredientId;
   }

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "recipe_id", nullable = false)
   public Recipe getRecipe() {
      return this.recipe;
   }

   public void setRecipe(Recipe recipe) {
      this.recipe = recipe;
   }

   @Column(name = "created_by", nullable = false, length = 100)
   public String getCreatedBy() {
      return this.createdBy;
   }

   public void setCreatedBy(String createdBy) {
      this.createdBy = createdBy;
   }

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name = "created_timestamp", nullable = false, length = 29)
   public Date getCreatedTimestamp() {
      return this.createdTimestamp;
   }

   public void setCreatedTimestamp(Date createdTimestamp) {
      this.createdTimestamp = createdTimestamp;
   }

   @Column(name = "ingredient_amount")
   public String getIngredientAmount() {
      return this.ingredientAmount;
   }

   public void setIngredientAmount(String ingredientAmount) {
      this.ingredientAmount = ingredientAmount;
   }

   @Column(name = "ingredient_measurement")
   public String getIngredientMeasurement() {
      return this.ingredientMeasurement;
   }

   public void setIngredientMeasurement(String ingredientMeasurement) {
      this.ingredientMeasurement = ingredientMeasurement;
   }

   @Column(name = "ingredient_type", nullable = false)
   public String getIngredientType() {
      return this.ingredientType;
   }

   public void setIngredientType(String ingredientType) {
      this.ingredientType = ingredientType;
   }

   @Column(name = "sequence_number", nullable = false)
   public Integer getSequenceNumber() {
      return this.sequenceNumber;
   }

   public void setSequenceNumber(Integer sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
   }

}