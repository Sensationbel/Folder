package by.bulavkin.searchEngine.repositoties;

import by.bulavkin.searchEngine.entity.LemmaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LemmaRepository extends JpaRepository<LemmaEntity, Integer> {

    LemmaEntity findByLemma(String lemma);
}
