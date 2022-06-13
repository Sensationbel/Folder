package by.bulavkin.searchEngine.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "lemmas", indexes = @Index(name = "lemma" ,columnList = "lemma"))
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class LemmaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String lemma;

    @Column(nullable = false)
    private Integer frequency;

    @Transient
    private Integer pageId;

    public boolean isEmpty(){
        return lemma == null && frequency == null;
    }

}
