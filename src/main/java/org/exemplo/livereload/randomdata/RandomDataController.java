package org.exemplo.livereload.randomdata;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RandomDataController {

    enum Status {
        OK, NAO_RESPONDE
    }

    @RequestMapping("/status")
    public List<Maquina> statusComputadores() {
        List<Maquina> maquinas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            maquinas.add(criarMaquinaAleatoria(i));
        }

        return maquinas;
    }

    private Maquina criarMaquinaAleatoria(int i) {
        return new Maquina(i, statusAleatorio());
    }

    private String statusAleatorio() {
        int random = (int) (Math.random() * Status.values().length);
        return Status.values()[random].name();
    }
}
