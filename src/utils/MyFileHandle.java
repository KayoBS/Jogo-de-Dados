package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

public class MyFileHandle
{
  public MyFileHandle() {}

  public static boolean write(String path, String texto, boolean replace)
  {
    try
    {
      FileWriter fw = new FileWriter(path, replace);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(texto);
      fw.close();
      bw.close();
      System.out.println(Colors.ANSI_GREEN + "WRITING PROCESS WAS SUCCESSFUL" + Colors.ANSI_RESET);

      return true;
    }
    catch (IOException e)
    {
      System.out.println(Colors.ANSI_RED + "! WRITING PROCESS FAILURE !" + Colors.ANSI_RESET);
      System.out.println(Colors.ANSI_RED + "! ERROR: " + e.getMessage() + " !" + Colors.ANSI_RESET);
    }
    return false;
  }

  public static boolean write(String path, Integer num, boolean replace)
  {
    FileWriter fw = null;
    //gerencia memoria alocada para a leitura do arquivo
    BufferedWriter bw = null;
    try
    {
      fw = new FileWriter(path, replace);
      bw = new BufferedWriter(fw);
      bw.write(num.toString());
      fw.close();
      bw.close();
      System.out.println(Colors.ANSI_GREEN + "WRITING PROCESS WAS SUCCESSFUL" + Colors.ANSI_RESET);
      return true;
    }
    catch (IOException e)
    {
      System.out.println(Colors.ANSI_RED + "! WRITING PROCESS FAILURE !" + Colors.ANSI_RESET);
      System.out.println(Colors.ANSI_RED + "! ERROR: " + e.getMessage() + " !" + Colors.ANSI_RESET);
    }
    return false;
  }

  public static boolean show(String path)
  {
    FileReader fr = null;
    //gerencia memoria alocada para a leitura do arquivo
    BufferedReader br = null;
    try
    {
      fr = new FileReader(path);
      br = new BufferedReader(fr);
      //ler linha a linha
      String line = br.readLine();

      //equivale ao EOF do Scanner
      while (line != null)
      {
        System.out.println(line);
        line = br.readLine();
      }
      return true;
    }
    catch(IOException e)
    {
      System.out.println(Colors.ANSI_RED + "! ERROR: " + e.getMessage() + " !" + Colors.ANSI_RESET);
    }
    finally
    {
      try
      {
        //o ato de fechar pode gerar excessão, então precisa tratar
        br.close();
        fr.close();
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
    }
    return false;
  }
  public static ArrayList<String> read(String path)
  {
    FileReader fr = null;
    //gerencia memoria alocada para a leitura do arquivo
    BufferedReader br = null;
    ArrayList<String> archive = new ArrayList<String>();

    try
    {
      fr = new FileReader(path);
      br = new BufferedReader(fr);
      //ler linha a linha
      String line = br.readLine();

      //equivale ao EOF do Scanner
      while (line != null)
      {
        archive.add(line);
        line = br.readLine();
      }
      System.out.println(Colors.ANSI_GREEN + "FILE READING PROCESS WAS SUCCESSFUL" + Colors.ANSI_RESET);
      System.out.println(Colors.ANSI_GREEN + "ARCHIVE SIZE: " + archive.size() + Colors.ANSI_RESET);
      return archive;
    }
    catch(IOException e)
    {
      System.out.println(Colors.ANSI_RED + "! READING PROCESS FAILURE !" + Colors.ANSI_RESET);
      System.out.println(Colors.ANSI_RED + "! ERROR: " + e.getMessage() + " !" + Colors.ANSI_RESET);
    }
    finally
    {
      try
      {
        //o ato de fechar pode gerar excessão, então precisa tratar
        br.close();
        fr.close();
      }
      catch(IOException e)
      {
        System.out.println(Colors.ANSI_RED + "! CLOSING PROCESS FAILURE !" + Colors.ANSI_RESET);
        e.printStackTrace();
      }
    }
    ArrayList<String> returned_value = new ArrayList<String>();
    returned_value.add("-1");
    return returned_value;
  }
}
