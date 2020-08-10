package br.com.rdevs.springfilial.service.bo;

import br.com.rdevs.springfilial.model.dto.FilialDTO;
import br.com.rdevs.springfilial.model.entity.FilialEntity;
import org.springframework.stereotype.Component;

@Component
public class FilialBO {

    public FilialDTO parseToDTO(FilialEntity entity) {
        FilialDTO dto = new FilialDTO();
        dto.setCdFilial(entity.getCdFilial());
        dto.setNmFilial(entity.getNmFilial());
        dto.setNrCnpj(entity.getNrCnpj());

        return dto;
    }
}
