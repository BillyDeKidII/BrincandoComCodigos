    {
        File arquivo = new File("C:/geraArquivo/teste.txt");//instancia um objeto
        boolean existe = arquivo.exists();//verifica se existe
        arquivo.mkdir();//cria o diretorio
        arquivo.createNewFile();//cria o arquivo
        File [] arquivos = arquivo.listFiles();//lista os arquivos do diretorio
        arquivo.delete();//deleta o arquivo
        FileWriter fw = new FileWriter(arquivo);//recebe o objeto do tipo arquivo
        FileWriter fw2 = new FileWriter(arquivo, true);//altera o objeto para ser adicionado ao inves de excluido(append)
        BufferedWriter bw = new BufferedWriter(fw);//recebe como argumento o objeto do tipo File Writer
        bw.write("Informa��o a ser adicionada ao arquivo");//escreve o que vai pro arquivo
        bw.newLine();//quebra de linha
        bw.close();//fecha o argumento 
        fw.close();//fecha o argumento
        FileReader fr = new FileReader(arquivo);//recebe o objeto do tipo arquivo
        BufferedReader br = new BufferedReader(fr);//recebe o objeto do tipo FileReader
        while (br.ready())//l� enquanto tiver linhas
        {
            String linha = br.readLine();
        }
        br.close();//fecha os recursos
        fr.close();//fecha os recursos
    }
}