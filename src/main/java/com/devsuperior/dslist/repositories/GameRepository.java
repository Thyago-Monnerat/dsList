package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.models.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameModel, Long> {

}
