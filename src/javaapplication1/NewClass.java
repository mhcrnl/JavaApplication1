/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author mhcrnl
 */
public class NewClass {
  private final int numConta;
  private double saldo;
  private int limiteCartao;
  private String senha;
  private int cont;
  
  public NewClass (double saldo, int limiteCartao, String senha){  
        this.cont = 0;
    numConta =  cont++;
    
    this.saldo = saldo;
    this.limiteCartao = limiteCartao;
    this.senha = senha;
  }
    
  public void imprimir(){
    System.out.println("O número da conta é:" + numConta);
    
    System.out.println("O saldo é:" + saldo);
    System.out.println("O limite do cartão é:" + limiteCartao);
  }  
  
  public void setlimiteCartao(int limiteCartao){
    if (limiteCartao < (3 * saldo))
      this.limiteCartao = limiteCartao;
    else
      System.out.println("O limite do cartão não pode ser tão alto");
  }
  
  public int getlimiteCartao(){
    return limiteCartao;
  }
  
  public void setSenha (String senha){
    if (senha.length() < 6)
      System.out.println ("A senha deve conter no mínimo seis dígitos");
    else
      this.senha = senha;
  }
  
  public String getSenha(){
    return senha;
  }
  
  public double getSaldo() {
    return saldo;
  }
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  
  public int getNumConta(){
    return numConta;
  }
  
}