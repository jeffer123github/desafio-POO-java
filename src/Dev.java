

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConstruidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {

        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
       Optional<Conteudo>  conteudo = this.conteudosInscritos.stream().findFirst();

       if (conteudo.isPresent()){
           this.conteudosConstruidos.add(conteudo.get());
           this.conteudosInscritos.remove(conteudo.get());
       }else {
           System.out.println("você não está inscrito no curso do BOOTCAMP!");
       }
    }
    Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
    public double calculartotalxp(){

       return this.conteudosConstruidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIcritis() {
        return conteudosInscritos;
    }

    public void setConteudosIcritis(Set<Conteudo> conteudosIcritis) {
        this.conteudosInscritos = conteudosIcritis;
    }

    public Set<Conteudo> getConteudosConstruidos() {
        return conteudosConstruidos;
    }

    public void setConteudosConstruidos(Set<Conteudo> conteudosConstruidos) {
        this.conteudosConstruidos = conteudosConstruidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConstruidos, dev.conteudosConstruidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConstruidos);
    }
}
