package map.ordenacao;

import com.sun.security.jgss.GSSUtil;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
//        Evento evento = new Evento(nome,atracao);
//        eventoMap.put(data,evento);
//        or
        eventoMap.put(data,new Evento(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
//        Set<LocalDate> datSet eventoMap.keySet();
//        Collection<Evento> values = eventoMap.values();
//        eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximadata = null;
        Evento proximoEvento = null;

        Map<LocalDate,Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry: eventoMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximadata = entry.getKey();
                proximoEvento = entry.getValue();

                System.out.println("O próximo evento: "+proximoEvento+" ocorrerá na data "+proximadata);

                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY,15),"Evento 1","Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 8,9),"Evento 2","Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY,10),"Evento 3","Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE,25),"Evento 4","Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE,26),"Evento 5","Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JUNE,26),"Evento 6","Atração 6");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
