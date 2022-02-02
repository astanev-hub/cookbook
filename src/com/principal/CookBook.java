package com.principal;

public class CookBook {

	public static void main(String[] args) {
		Rendimento rendimento1 = new Rendimento(4, Tipo.COPOS);
		
		Ingredientes[] ingredientes1 = new Ingredientes[2];
		ingredientes1[0] = new Ingredientes("Laranjas", 12, Tipo.UNIDADES);
		ingredientes1[1] = new Ingredientes("Açúcar", 3, Tipo.COLHERES);
		
		Preparo[] preparo1 = new Preparo[5];
		preparo1[0] = new Preparo("1 - Cortar as 12 laranjas");
		preparo1[1] = new Preparo("2 - Expremer as 12 laranjas");
		preparo1[2] = new Preparo("3 - Colocar o suco na jarra");
		preparo1[3] = new Preparo("4 - Adicionar o açúcar");
		preparo1[4] = new Preparo("5 - Servir");

		Receita receita1 = new Receita(1, "Suco de Laranja", Categoria.DOCE, 10, rendimento1);
		receita1.setPreparo(preparo1);
		receita1.setIngrediente(ingredientes1);
		
		System.out.println(receita1.toString());
		
	}

}
