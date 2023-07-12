package com.samuel.animalservice.repository;

import com.samuel.animalservice.dto.FuncionarioDTO;
import com.samuel.animalservice.entity.Animal;
import com.samuel.animalservice.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdopted();

    @Query("SELECT NEW com.samuel.animalservice.dto.FuncionarioDTO(F.nome, COUNT(A.id)) " +
            "FROM Funcionario F " +
            "JOIN F.animais A " +
            "WHERE A.dataEntrada BETWEEN current_date() - 365 AND current_date() " +
            "GROUP BY F.nome")
    List<FuncionarioDTO> obterFuncionariosComQuantidadeDeAnimais();
}
