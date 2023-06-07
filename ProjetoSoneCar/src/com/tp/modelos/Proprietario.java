/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.modelos;
import com.tp.modelos.subClasses.CNH;
/**
 *
 * @author aluno
 */
public class Proprietario {

    String CPF;
    String nomeCompleto;
    int telefone1;
    int telefone2;
    String email_1;
    String email_2;
    CNH DocumentoCNH = new CNH();
    
    // gets e sets maroteiros:

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(int telefone1) {
        this.telefone1 = telefone1;
    }

    public int getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(int telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail_1() {
        return email_1;
    }

    public void setEmail_1(String email_1) {
        this.email_1 = email_1;
    }

    public String getEmail_2() {
        return email_2;
    }

    public void setEmail_2(String email_2) {
        this.email_2 = email_2;
    }

    public CNH getDocumentoCNH() {
        return DocumentoCNH;
    }

    public void setDocumentoCNH(CNH DocumentoCNH) {
        this.DocumentoCNH = DocumentoCNH;
    }
        
    // Construtor feinho e construtor bunitim
    
    public Proprietario(){
    }
    
    public Proprietario(String cpf, String NomeC, int tel_1, int tel_2, String email_1, String email_2, char cat, int numeroCNH){
        this.CPF = cpf;
        this.nomeCompleto = NomeC;
        this.telefone1 = tel_1;
        this.telefone2 = tel_2;
        this.email_1 = email_1;
        this.email_2 = email_2;
        CNH cnh = new CNH(numeroCNH, cat);
        this.DocumentoCNH = cnh;
    }
    
    //toString Sapecagens:

    @Override
    public String toString() {
        return "Proprietario{" + "CPF=" + CPF + ", nomeCompleto=" + nomeCompleto + ", telefone1=" + telefone1 + ", telefone2=" + telefone2 + ", email_1=" + email_1 + ", email_2=" + email_2 + ", DocumentoCNH=" + DocumentoCNH + '}';
    }
    
    public String toStringCPF(){
        return ("" + CPF);
    }
    
    public String toStringNomeCompleto(){
        return ("" + nomeCompleto);
    }
    
    public String toStringTelefone_1(){
        return (""+telefone1);
    }
    
    public String toStringTelefone_2(){
        return ("" + telefone2);
    }
    
    public String toStringEmail_1(){
        return ("" + email_1);
    }
    
    public String toStringEmail_2(){
        return ("" + email_2);
    }
    
    public String toStringCNHCategoria(){
        return ("" + DocumentoCNH.getCategoria());
    }
    
    public String toStringCNHNumero(){
        return ("" + DocumentoCNH.getNumeroDocumentoCNH());
    }
    
    public String toStringCNH(){
        return ("" + DocumentoCNH);
    }
    
    //Veículo tem os seus toStrings, pode usar... eles não mordem.
    // Lembra que o Modelo e Marca tem seus proprios, se for usar nessa classe importa e instancia Marca e Modelo.
}
