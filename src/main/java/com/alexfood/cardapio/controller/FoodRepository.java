package com.alexfood.cardapio.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alexfood.cardapio.food.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
