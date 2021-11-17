package com.avanade.aplicacao;

import com.avanade.aplicacao.servicos.ServicoProcessarArquivos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Locale;

public class Programa {

    /*Integer inteiro = 10;
    Long longo = 10L;
    Double decimal =10.10;
    Float decimal2 = 10.10F;
    Boolean boleano = false;
    String texto = null;*/

    private static final Logger LOG = LoggerFactory.getLogger(Programa.class);
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Parâmetro caminho obrigatório");
            System.out.println("Uso: ");
            System.out.println("java com.avanade.com.avanade.aplicacao.Programa [CAMINHO]");
            System.exit(-1);
            return;
        }
        LOG.info("Iniciando aplicação..");
        //System.out.println("Iniciando aplicação..");
        //System.out.println("Caminho identificado " + args[0]);
        //System.out.println("Hello World!");
        //String s = new String("ABC");

        /*boolean continuar = true;

        if(continuar){
            Integer inteiro = 10;
        }
        System.out.println("Concluído");*/
        Programa programa = new Programa();
        programa.iniciar(args[0]);
    }


    public void iniciar(String caminhoDirEntrada) {
        ServicoProcessarArquivos servico = new ServicoProcessarArquivos(caminhoDirEntrada);
        servico.executar();
    }
}
