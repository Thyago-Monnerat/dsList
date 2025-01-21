package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.models.GameListModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameListModel, Long> {
}
