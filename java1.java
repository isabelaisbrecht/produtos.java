package Entidades; 
public class Produto {
private int codigo; 
private String nome; private int estoque; 
private double valorUnitario; 

public Produto(int codigo, String nome) { this.codigo = codigo;
this. nome = nome; 
}
public int getCodigo() { return codigo;
 } 
Nãopublic void setCodigo(int codigo) { this.codigo = codigo;
}

public String getNome () 
{ return nome; 
}
public void setNome (String nome) { this.nome r nome;}
 public int getEstoque() { return estoque;
}

estoque = estoque + quantidade; 
 } 
public void tirarEstoque(int quantidade) { if (quantidade <= estoque) 
{ estoque = estoque - quantidade;
 } 
else {
System.out.println("Estoque indisponivel!!!");
}
}
return estoque;
public double getValorUnitario () {
 return valorUnitario; 
} 
public void setValorUnitario(double valorUnitario)
 {this. valorUnitario = valorUnitario; 
 }
//metodos 
public void incluirEstoque(int quantidade) { estoque = estoque + quantidade;
}
