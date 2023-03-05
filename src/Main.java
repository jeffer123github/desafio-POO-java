import java.time.LocalDate;


public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescrecao(" Descrição curso Java");
        curso1.setCargaHoraria( 8 );


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescrecao(" Descrição curso JS");
        curso2.setCargaHoraria( 7 );



         Mentoria mentoria1 = new Mentoria();
         mentoria1.setTitulo("Curso Java");
         mentoria1.setDescricao(" Descrição Mentoria Java");
         mentoria1.setData(LocalDate.now());


      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("bootcamp  java" );
      bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);

    Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Iformações de Inscrição Camila " + devCamila.getConteudosIcritis() );
        System.out.println("Iformações de Conclusão Camila " + devCamila.getConteudosConstruidos() );

        Dev devJefferson = new Dev();
        devJefferson.setNome("Jefferson");
        devJefferson.inscreverBootcamp(bootcamp);
        System.out.println("Informações de Inscrição Jefferson " + devJefferson.getConteudosIcritis() );
        System.out.println("Informações de Conclusão Jefferson " + devJefferson.getConteudosConstruidos() );




    }
}
