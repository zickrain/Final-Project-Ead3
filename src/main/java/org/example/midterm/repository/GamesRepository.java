package org.example.midterm.repository;


import org.example.midterm.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GamesRepository extends JpaRepository<Game, Long> {

//    @Query(value = "SELECT * FROM Games n WHERE n.id=?1", nativeQuery = true)
//    Game findByIds(Long id);
//
//    @Query(value = "SELECT * FROM Games n WHERE n.user_id=?1 ORDER BY id", nativeQuery = true)
//    List<Game> findAllByUserId(Long user_id);
}
