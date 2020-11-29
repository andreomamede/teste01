package com.teste01.controller;

import com.teste01.model.Veiculo;
import com.teste01.repository.VeiculoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Classe responsável pelos endpoints da entidade Veículo.
 */
@RestController
@RequestMapping({"/"})
public class VeiculosController {

    private VeiculoRepository repository;

    VeiculosController(VeiculoRepository veiculoRepository) {
        this.repository = veiculoRepository;
    }

    /**
     * Obtém veículo por id.
     * @param id
     * @return @{@link Veiculo}
     */
    @GetMapping(path = {"/veiculos/{id}"})
    public ResponseEntity<Veiculo> findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Obtém todos veículos
     * @return @{@link List}
     */
    @GetMapping(path = {"/veiculos"})
    public ResponseEntity<List<Veiculo>> findById(){
        return ResponseEntity.ok().body(repository.findAll());
    }

    /**
     * Cria novos veículos.
     * @param veiculo
     * @return @{@link Veiculo}
     */
    @PostMapping(path = {"/veiculos"})
    public ResponseEntity<Veiculo> insertVeiculo(@RequestBody Veiculo veiculo) {
        veiculo.setDataDeCriacao(new Date());
        return ResponseEntity.ok().body(repository.save(veiculo));
    }

    /**
     * Atualiza veículos.
     * @param veiculo
     * @param id
     * @return @{@link Veiculo}
     */
    @PutMapping(path = {"/veiculos/{id}"})
    public ResponseEntity<Veiculo> updateVeiculo(@RequestBody Veiculo veiculo, @PathVariable Long id) {
        veiculo.setDataDeAtualizacao(new Date());
        veiculo.setId(id);
       return ResponseEntity.ok().body(repository.save(veiculo));
    }

    /**
     * Exclui veículos.
     * @param id
     */
    @DeleteMapping(path = {"/veiculos/{id}"})
    public void deleteVeiculo(@PathVariable Long id) {
        repository.deleteById(id);
    }
}