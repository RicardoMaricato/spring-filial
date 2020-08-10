package br.com.rdevs.springfilial.service;

import br.com.rdevs.springfilial.model.dto.FilialDTO;
import br.com.rdevs.springfilial.model.entity.FilialEntity;
import br.com.rdevs.springfilial.repository.FilialRepository;
import br.com.rdevs.springfilial.service.bo.FilialBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FilialService {

    @Autowired
    private FilialRepository repository;

    @Autowired
    private FilialBO filialBO;

    public List<FilialDTO> buscarTodas() {
        List<FilialEntity> listEntity = repository.findAll();
        List<FilialDTO> listDTO = new ArrayList<>();

        for (FilialEntity entity : listEntity) {
            FilialDTO dto = filialBO.parseToDTO(entity);
            listDTO.add(dto);
        }
        return listDTO;
    }

    public FilialDTO buscarPorId(Integer cdFilial) {
        return filialBO.parseToDTO(repository.getOne(cdFilial));
    }
}
