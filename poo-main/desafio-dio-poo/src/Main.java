import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");    
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");    
        curso2.setDescricao("Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("mentoria java");
        mentoria1.setData(LocalDate.now());

        
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria geral");
        mentoria2.setDescricao("mentoria geral");
        mentoria2.setData(LocalDate.now());
        
        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println();
        System.out.println(mentoria1);
        System.out.println(mentoria2);
        
        System.out.println(); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        Dev devDouglas = new Dev();
        devDouglas.setNome("Douglas");
        devDouglas.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscrito" + devDouglas.getConteudosInscritos());
        System.out.println();
        
        Dev devSabrina = new Dev();
        devSabrina.setNome("Sabrina");
        devSabrina.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscrito" + devSabrina.getConteudosInscritos());

        System.out.println(devDouglas.getNome());
        
    }
}
