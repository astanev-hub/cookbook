package com.principal;

public class CookBook {

	public static void main(String[] args) {

//		RECEITA 1		
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

//		RECEITA 2	
		Rendimento rendimento2 = new Rendimento(4, Tipo.PORÇÕES);
		
		Ingredientes[] ingredientes2 = new Ingredientes[2];
		ingredientes2[0] = new Ingredientes("Milho de Pipoca", 4, Tipo.COLHERES);
		ingredientes2[1] = new Ingredientes("Sal", 2, Tipo.COLHERES);
		
		Preparo[] preparo2 = new Preparo[5];
		preparo2[0] = new Preparo("1 - Colocar o milho na panela");
		preparo2[1] = new Preparo("2 - Ligar o fogo");
		preparo2[2] = new Preparo("3 - Mexer a panela");
		preparo2[3] = new Preparo("4 - Deixar ligado o fogo até parar de estourar os milhos");
		preparo2[4] = new Preparo("5 - Colocar sal e servir");

		Receita receita2 = new Receita(2, "Pipoca", Categoria.SALGADO, 5, rendimento2);
		receita2.setPreparo(preparo2);
		receita2.setIngrediente(ingredientes2);

		
		System.out.println("========= NOVA RECEITA ============");
		System.out.println(receita1.toString());
		System.out.println("======== FIM DA RECEITA ===========\n");
		System.out.println("========= NOVA RECEITA ============");
		System.out.println(receita2.toString());
		System.out.println("======== FIM DA RECEITA ===========\n");
		
	}

}
