package list.opercaoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atribute
    private List<Tarefa> tarefaList;

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Total de Tarfeas Atualemnte: "+listaTarefa.obterTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("Total de Tarfeas Atualemnte: "+listaTarefa.obterTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("Total de Tarfeas Atualemnte: "+listaTarefa.obterTotalTarefas());

        listaTarefa.obterDecricoesTarefas();

    }

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasRemover);
    }

    public int obterTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDecricoesTarefas(){
        System.out.println(tarefaList);
    }


}
