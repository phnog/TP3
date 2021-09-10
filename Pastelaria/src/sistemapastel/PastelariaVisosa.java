package sistemapastel;

import java.util.ArrayList;
import java.util.Scanner; 

public class PastelariaVisosa {

	public static void main(String[] args) {
		
		ArrayList <Pastel> pasteis = new ArrayList<Pastel>();
		ArrayList <Bebida> bebidas = new ArrayList<Bebida>();
		ArrayList <Pedido> pedidos = new ArrayList<Pedido>();
		ArrayList <Funcionario> funcionarios = new ArrayList<Funcionario>();
		ArrayList <Venda> vendas = new ArrayList<Venda>();

		Scanner ler = new Scanner(System.in); 
		dataBase(pasteis, bebidas, pedidos, funcionarios, vendas); 
		int option; 
		
		System.out.println("======Bem vindo ao Sistema de Cadastro Visosa======");
		int repeat = 0;
		while (repeat == 0) {
		menuOpcao();
		option = ler.nextInt();
			switch (option) {
			
			case 1 : 
				pastelCRUD(pasteis,funcionarios);
				break; 
			
			case 2 : 
				bebidaCRUD(bebidas); 
				break; 
			
			case 3 : 
				pedidoCRUD(pedidos, funcionarios); 
				break; 
			
			case 4 : 
				funcionarioCRUD(funcionarios); 
				break; 
			
			case 5 : 
				vendaCRUD(vendas);
				break; 
			
			case 6 : 
				repeat = 1;
				System.out.println("\nVoce fechou o programa.");
				break; 
				
			default: 
				System.out.println("Opcao invalida.");
	
			
			}
			
			
			
		} ler.close();
	}
	public static void dataBase(ArrayList<Pastel> pasteis, ArrayList<Bebida> bebidas, ArrayList<Pedido> pedidos, ArrayList<Funcionario> funcionarios, ArrayList <Venda> vendas) {

		 Pastel p1 = new Pastel("pastel de carne", 6, "a4","carne", "Messi");
		    pasteis.add(p1);
		    Pastel p2 = new Pastel("pastel de queijo", 4, "a3","queijo", "Messi");
		    pasteis.add(p2);
		    Pastel p3 = new Pastel("pastel de frango", 5, "P","frango", "Barack Obama");
		    pasteis.add(p3);
		    Pastel p4 = new Pastel("pastel de gato", 2, "GG","recheio secreto", "Paulão rataria");
		    pasteis.add(p4);
		    Pastel p5 = new Pastel("pastel de camarão", 8, "M","recheio de camarão", "Paulão rataria");
		    pasteis.add(p5);
		    Pastel p6 = new Pastel("pastel de vento", 3, "M","sem recheio", "Messi");
		    pasteis.add(p6);
		    Pastel p7 = new Pastel("pastel de calabresa", 4, "G","recheio de calabresa", "Barack Obama");
		    pasteis.add(p7);

		    Bebida b1 = new Bebida("caldo de cana", 5, "500 ml","suco natural", "feito da cana de açucar");
		    bebidas.add(b1);
		    Bebida b2 = new Bebida("coca cola", 4, "350 ml","refrigerante", "refrigerante a base coca");
		    bebidas.add(b2);
		    Bebida b3 = new Bebida("guarana", 4, "310 ml","refrigerante", "refrigerante a base de guarana");
		    bebidas.add(b3);
		    Bebida b4 = new Bebida("dolly guarana", 3, "350 ml","refrigerante", "refrigerante a base de guarana");
		    bebidas.add(b4);
		    Bebida b5 = new Bebida("suco de uva", 4, "450ml","suco de caixinha", "suco de caixa sabor uva");
		    bebidas.add(b5);
		    Bebida b6 = new Bebida("suco de laranja", 4, "500ml","suco natural da fruta", "suco feito na hora sabor de laranja");
		    bebidas.add(b6);
		    Bebida b7 = new Bebida("coca cola zero", 4, "310ml","refrigerante sem açucar", "refrigerante a base de coca, dietetico, sem açucar");
		    bebidas.add(b7);

		    Pedido pd1 = new Pedido("Joao pedro", "Pastel de carne", "caldo de cana", 17, "10:00 horas", 1, "Marta", 2, 1);
		    pedidos.add(pd1);
		    Pedido pd2 = new Pedido("Fernando", "Pastel de gato", "coca cola", 6, "12:00 horas", 2, "Neymar", 1, 1); 
		    pedidos.add(pd2);
		    Pedido pd3 = new Pedido("Lucas", "Pastel de frango", "guarana", 13, "11:30 horas", 3, "Neymar", 1, 2);
		    pedidos.add(pd3);
		    Pedido pd4 = new Pedido("Pedro", "Pastel de vento", "suco de uva", 10, "16:23 horas", 4,  "Zé Goiaba", 2, 1);
		    pedidos.add(pd4);
		    Pedido pd5 = new Pedido("Rafael", "Pastel de carne", "dolly guarana", 9, "16:15 horas", 5, "Zé Goiaba", 1, 1);
		    pedidos.add(pd5);
		    Pedido pd6 = new Pedido("Zé", "Pastel de camarão", "coca cola zero", 20, "18:30 horas", 6,  "Neymar", 2, 1);
		    pedidos.add(pd6);
		    Pedido pd7 = new Pedido("Alice", "Pastel de calabresa", "caldo de cana", 19,  "14:30 horas", 7, "Marta", 1, 3);
		    pedidos.add(pd7);
		    
		    Funcionario f1 = new Funcionario("Messi", 3405851, "079.817.136-11", "17/06/1998", "Asa norte quadra 305", 981526631, "07h as 12h", "Cozinheiro", 1500);
		    funcionarios.add(f1);
		    Funcionario f2 = new Funcionario("Barack Obama", 2405851, "079.817.146-11", "17/06/1998", "Vicente pires rua 3", 981556632, "12h as 18h", "Cozinheiro", 1350);
		    funcionarios.add(f2);
		    Funcionario f3 = new Funcionario("Paulão Rataria", 3619815, "354.933.281-57", "17/06/1998", "Aguas Claras avenida castanheiras", 999556732, "12h as 18h", "Cozinheiro", 45000);
		    funcionarios.add(f3);
		    Funcionario f4 = new Funcionario("Marta", 2527534, "352.573.981-57", "17/06/1998", "Lago norte", 999556732, "12h as 18h", "Garçom", 1500);
		    funcionarios.add(f4);
		    Funcionario f5 = new Funcionario("Neymar", 1267891, "321.517.426-17", "17/06/1998", "Taguatinga", 993586712, "07h as 12h", "Garçom", 1200);
		    funcionarios.add(f5);
		    Funcionario f6 = new Funcionario("Zé Goiaba", 1267891, "321.517.426-17", "17/06/1998", "Ceilandia", 993586712, "07h as 12h", "Garçom", 1200);
		    funcionarios.add(f6);
		    
		    Venda v1 = new Venda(1, "Joao pedro" ,  17);
		    vendas.add(v1);
		    Venda v2 = new Venda(2, "Fernando" ,  6);
		    vendas.add(v2);
		    Venda v3 = new Venda(3, "Lucas" ,  13);
		    vendas.add(v3);
		    Venda v4 = new Venda(4, "Pedro" ,  10);
		    vendas.add(v4);
		    Venda v5 = new Venda(5, "Rafael" ,  9);
		    vendas.add(v5);
		    Venda v6 = new Venda(6, "Zé" ,  20);
		    vendas.add(v6);
		    Venda v7 = new Venda(7, "Alice" ,  19);
		    vendas.add(v7);

  

}
	
	public static void menuOpcao() {
        
		System.out.println("\nDigite o menu que voce gostaira de acessar: ");
        System.out.println("1 - Pastel (Adicionar, visualizar, alterar e remover).");
        System.out.println("2 - Bebida (Adicionar, visualizar, alterar e remover).");
        System.out.println("3 - Pedido (Adicionar, visualizar, alterar e remover).");
        System.out.println("4 - Funcionarios (Adicionar, visualizar, alterar e remover).");
        System.out.println("5 - Venda (Adicionar, visualizar, alterar e remover).");
        System.out.println("6 - Sair.\n");
        
    }
	
	public static void pastelCRUD( ArrayList <Pastel> pasteis, ArrayList <Funcionario> funcionarios) {
		
		int esc, valorPastel, i = 0, repetidor = 0, k = 0; 
		String namePastel, tamanhoPastel, recheioPastel, cozinheiroPastel, cozinheiro = "Cozinheiro"; 
		Scanner ler = new Scanner(System.in);
		while(repetidor == 0) {
			
			System.out.println("\nVoce acessou o menu do Pastel, digite o numero do que voce quer fazer.");
			System.out.println("1 - Adicionar um pastel.");
			System.out.println("2 - Visualizar pasteis.");
			System.out.println("3 - Alterar pastel.");
			System.out.println("4 - Deletar pastel.");
			System.out.println("5 - Voltar ao menu principal.\n");
			
			esc = ler.nextInt();
			ler.nextLine();
			
			switch(esc) {
			
				case 1 : 
					k = 0; 
					System.out.println("\nVoce escolheu (Adicionar um pastel).");
					System.out.println("Digite o nome do novo pastel.");
					namePastel = ler.nextLine();
					System.out.println("Digite o valor do novo pastel.");
					valorPastel = ler.nextInt();
					ler.nextLine();
					System.out.println("Digite o tamanho do novo pastel.");
					tamanhoPastel = ler.nextLine();
					System.out.println("Digite o recheio do novo pastel.");
					recheioPastel = ler.nextLine();
					System.out.println("Digite o cozinheiro que vai fazer o novo pastel.");
					cozinheiroPastel = ler.nextLine();
					for (Funcionario f : funcionarios) {
						if(cozinheiroPastel.equalsIgnoreCase(f.getNomeFuncionario())) {
							if(cozinheiro.equalsIgnoreCase(f.getFuncao())) {
								Pastel novo = new Pastel(namePastel, valorPastel, tamanhoPastel, recheioPastel, cozinheiroPastel);
								pasteis.add(novo);
								System.out.println("O pastel foi adicionado com sucesso.\n");	
							}
							else {
								k++;}
						}else {
							k++; 
						}	
						
					}
					if (funcionarios.size() == k) {
						System.out.println("O funcionario nao esta cadastrado ou nao é um cozinheiro.");
						
					}
					
					
					
					
					break; 
				
				case 2 : 
					
					System.out.println("\nVoce selecionou a opcao (Visualizar pasteis).\n");
					
					for(Pastel p : pasteis) {
						
						System.out.println (p.getNomeProduto() + " - R$"+ p.getValorProduto() + ".00 - " + p.getTamanhoProduto() 
						+ " - " + p.getRecheio() + " - " + p.getCozinheiro());
					
					}
					
					break; 
					
				case 3 : 
					
					System.out.println("\nVoce selecionou a opcao (Alterar pastel).");
					System.out.println("Lista de pasteis cadastrados:");
					System.out.println(); 
					for(Pastel p : pasteis) {
							System.out.println (p.getNomeProduto());
						}
					System.out.println(); 
			
					System.out.println("Digite o nome do pastel que voce gostia de alterar os dados");
					namePastel = ler.nextLine(); 
					for(Pastel p : pasteis) {
						if(namePastel.equalsIgnoreCase(p.getNomeProduto())){
							
							System.out.println("\nO produto : " + p.getNomeProduto() + " foi encontrado. Seus dados são:");
							System.out.println("Nome do produto é " + p.getNomeProduto());
							System.out.println("O valor do produto é R$" + p.getValorProduto() + ".00");
							System.out.println("O tamanho do produto é " + p.getTamanhoProduto());
							System.out.println("O recheio do produto é " + p.getRecheio());
							System.out.println("O cozinheiro que fez o produto foi o(a) " + p.getCozinheiro());
							System.out.println(); 
							System.out.println("O que voce gostaria de mudar (digite o numero): ");
							System.out.println("1 - Nome."); 
							System.out.println("2 - Valor"); 
							System.out.println("3 - Tamanho"); 
							System.out.println("4 - Recheio");
							System.out.println("5 - Cozinheiro \n"); 
							
							esc = ler.nextInt(); 
							ler.nextLine();
							
							switch(esc) {
							
								case 1 : 
									
									System.out.println("\nVoce selecionou a opcao nome.");
									System.out.println("Digite o novo nome para o produto.");
									namePastel = ler.nextLine();
									p.setNomeProduto(namePastel);
									System.out.println("Nome alterado com sucesso.\n");
									break; 
								case 2 : 
									
									System.out.println("\nVoce selecionou a opcao valor.");
									System.out.println("Digite o novo valor para o produto.");
									int valor = ler.nextInt();
									ler.nextLine();
									p.setValorProduto(valor);;
									System.out.println("Valor alterado com sucesso.\n");
									break; 
									
								case 3 : 
									
									System.out.println("\nVoce selecionou a opcao tamanho.");
									System.out.println("Digite o novo tamanho para o produto.");
									tamanhoPastel = ler.nextLine();
									p.setTamanhoProduto(tamanhoPastel);
									System.out.println("Tamanho alterado com sucesso.\n");
									break;
																	
								case 4 : 
									
									System.out.println("\nVoce selecionou a opcao recheio.");
									System.out.println("Digite o novo recheio para o produto.");
									recheioPastel = ler.nextLine();
									p.setRecheio(recheioPastel);;
									System.out.println("Recheio alterado com sucesso.\n");
									break; 
							
								case 5 : 
									k = 0; 
									System.out.println("\nVoce selecionou a opcao cozinheiro.");
									System.out.println("Digite o nome do novo cozinheiro.");
									cozinheiroPastel = ler.nextLine();
									for (Funcionario f : funcionarios) {
										if(cozinheiroPastel.equalsIgnoreCase(f.getNomeFuncionario())) {
											if(cozinheiro.equalsIgnoreCase(f.getFuncao())) {
												p.setCozinheiro(cozinheiroPastel);;
												System.out.println("Cozinheiro alterado com sucesso.\n");
											}else {
												k++; 
											}
											
										} else {
											k++;										
										}
										
									}if (funcionarios.size() == k) {
										System.out.println("Funcionario nao esta cadastrado ou nao exerce a funcao de cozinheiro.");
									}
									
									
									break; 
							}
							
						}
						else {
							i++;
							}
						if(i == pasteis.size()) {
			                System.out.println("\nNenhum produto foi encontrado!");
			            }
	
					} break; 
					
				case 4:
					
					i = 0;
					System.out.println("\nVoce escolheu a opcao (deletar pastel).");
					System.out.println();
					
					for(Pastel p : pasteis) {

						System.out.println (i + " - " + p.getNomeProduto());
						i++; 
						
					}	
					System.out.println();
					System.out.println("Digite o numero do pastel que voce gostaria de deletar."); 
					System.out.println();
					i = ler.nextInt(); 
					ler.nextLine(); 
					pasteis.remove(i);
					
					System.out.println("\n Pastel deletado com sucesso.\n");

					break; 
				case 5 : 
					repetidor = 1; 
					break; 
			}
		}
	}
	
	public static void bebidaCRUD( ArrayList <Bebida> bebidas) {
		int esc, valorBebida, i = 0, repetidor = 0; 
		String nameBebida, tamanhoBebida, tipoBebida, saborBebida; 
		Scanner ler = new Scanner(System.in);
		while(repetidor == 0) {
			
			System.out.println("\nVoce entrou no menu de Bebida, digite o numero do que voce gostaria de fazer.");
			System.out.println("1 - Adicionar uma bebida.");
			System.out.println("2 - Visualizar bebidas.");
			System.out.println("3 - Alterar bebida.");
			System.out.println("4 - Deletar bebida.");
			System.out.println("5 - Voltar ao menu principal.\n");
			
			esc = ler.nextInt();
			ler.nextLine();
			
			switch(esc) {
			
				case 1 : 
					
					System.out.println("\nVoce escolheu (Adicionar uma bebida).");
					System.out.println("Digite o nome da nova bebida.");
					nameBebida = ler.nextLine();
					System.out.println("Digite o valor da nova bebida.");
					valorBebida = ler.nextInt();
					ler.nextLine();
					System.out.println("Digite o tamanho da nova bebida.");
					tamanhoBebida = ler.nextLine();
					System.out.println("Digite o tipo da nova bebida.");
					tipoBebida = ler.nextLine();
					System.out.println("Digite o sabor da nova bebida.");
					saborBebida = ler.nextLine();
					System.out.println("O pastel foi adicionado com sucesso.\n");
					
					Bebida novo = new Bebida(nameBebida, valorBebida, tamanhoBebida, tipoBebida, saborBebida);
					bebidas.add(novo);
					
					break; 
				
				case 2 : 
					
					System.out.println("\nVoce selecionou a opcao (Visualizar bebidas).\n");
					
					for(Bebida b : bebidas) {
						
						System.out.println (b.getNomeProduto() + " - R$"+ b.getValorProduto() + ".00 - " + b.getTamanhoProduto() 
						+ " - " + b.getTipo() + " - " + b.getSabor());
					
					}
					
					break; 
					
				case 3 : 
					
					System.out.println("\nVoce selecionou a opcao (Alterar bebida).");
					System.out.println("Lista de bebidas cadastradas:");
					System.out.println(); 
					for(Bebida b : bebidas) {
							System.out.println (b.getNomeProduto());
						}
					System.out.println(); 
			
					System.out.println("Digite o nome da bebida que voce gostaria de alterar os dados");
					nameBebida = ler.nextLine(); 
					for(Bebida b : bebidas) {
						if(nameBebida.equalsIgnoreCase(b.getNomeProduto())){
							
							System.out.println("\nO produto : " + b.getNomeProduto() + " foi encontrado. Seus dados são:");
							System.out.println("Nome da bebida é " + b.getNomeProduto());
							System.out.println("O valor da bebida é R$" + b.getValorProduto());
							System.out.println("O tamanho da bebida é " + b.getTamanhoProduto());
							System.out.println("O tipo da bebida é " + b.getTipo());
							System.out.println("O sabor da bebida é " + b.getSabor());
							System.out.println(); 
							System.out.println("O que voce gostaria de mudar (digite o numero): ");
							System.out.println("1 - Nome."); 
							System.out.println("2 - Valor"); 
							System.out.println("3 - Tamanho"); 
							System.out.println("4 - Tipo");
							System.out.println("5 - Sabor \n"); 
							
							esc = ler.nextInt(); 
							ler.nextLine();
							
							switch(esc) {
							
								case 1 : 
									
									System.out.println("\nVoce selecionou a opcao nome.");
									System.out.println("Digite o novo nome para a bebida.");
									nameBebida = ler.nextLine();
									b.setNomeProduto(nameBebida);
									System.out.println("Nome alterado com sucesso.\n");
									break; 
								case 2 : 
									
									System.out.println("\nVoce selecionou a opcao valor.");
									System.out.println("Digite o novo valor para a bebida.");
									int valor = ler.nextInt();
									ler.nextLine();
									b.setValorProduto(valor);;
									System.out.println("Valor alterado com sucesso.\n");
									break; 
									
								case 3 : 
									
									System.out.println("\nVoce selecionou a opcao tamanho.");
									System.out.println("Digite o novo tamanho para a bebida.");
									tamanhoBebida = ler.nextLine();
									b.setTamanhoProduto(tamanhoBebida);
									System.out.println("Tamanho alterado com sucesso.\n");
									break;
																	
								case 4 : 
									
									System.out.println("\nVoce selecionou a opcao tipo.");
									System.out.println("Digite o novo tipo para a beboda.");
									tipoBebida = ler.nextLine();
									b.setTipo(tipoBebida);;
									System.out.println("Tipo alterado com sucesso.\n");
									break; 
							
								case 5 : 
									
									System.out.println("\nVoce selecionou a opcao sabor.");
									System.out.println("Digite o nome do novo sabor para a bebida.");
									saborBebida = ler.nextLine();
									b.setSabor(saborBebida);;
									System.out.println("Cozinheiro alterado com sucesso.\n");
									break; 
							}
							
						}
						else {
							i++;
							}
						if(i == bebidas.size()) {
			                System.out.println("\nNenhuma bebida foi encontrada!");
			            }
	
					} break; 
					
				case 4:
					
					i = 0;
					System.out.println("\nVoce escolheu a opcao (deletar bebida).");
					System.out.println();
					
					for(Bebida b : bebidas) {

						System.out.println (i + " - " + b.getNomeProduto());
						i++; 
						
					}	
					System.out.println();
					System.out.println("Digite o numero da bebida que voce gostaria de deletar."); 
					System.out.println();
					i = ler.nextInt(); 
					ler.nextLine(); 
					bebidas.remove(i);
					
					System.out.println("\n Bebida deletado com sucesso.\n");

					break; 
				case 5 : 
					repetidor = 1; 
					break; 
			}
		}
	}	
	
	public static void pedidoCRUD( ArrayList <Pedido> pedidos,  ArrayList <Funcionario> funcionarios) {
		
		
		int esc, precoPedido, i = 0, repetidor = 0,  numeroPedido , qntPastel, qntBebida; 
		String clientePedido, escolhaPastel, escolhaBebida, garcomPedido,horarioPedido, garcom = "Garçom" ; 
		Scanner ler = new Scanner(System.in);
		while(repetidor == 0) {
			
			System.out.println("\nVoce escolheu a opcao CRUD Pedido");
			System.out.println("1 - Adicionar pedido.");
			System.out.println("2 - Visualizar pedidos.");
			System.out.println("3 - Alterar pedido.");
			System.out.println("4 - Deletar pedido.");
			System.out.println("5 - Voltar ao menu principal.\n");
			
			esc = ler.nextInt();
			ler.nextLine();
			
			switch(esc) {
			
				case 1 : 
					int k = 0 ;
					System.out.println("\nVoce escolheu (Adicionar Pedido).");
					System.out.println("Digite o nome do cliente que realizou o pedido.");
					clientePedido = ler.nextLine();
					System.out.println("Digite o pastel escolhido pelo cliente.");
					escolhaPastel = ler.nextLine();
					System.out.println("Digite a quantidade de pasteis desejada pelo cliente");
					qntPastel = ler.nextInt();
					ler.nextLine();
					System.out.println("Digite a bebida escolhida pelo cliente");
					escolhaBebida = ler.nextLine(); 
					System.out.println("Digite a quantidade de bebidas desejada pelo cliente");
					qntBebida = ler.nextInt();
					ler.nextLine(); 
					System.out.println("Digite o valor do pedido.");
					precoPedido = ler.nextInt();
					ler.nextLine();
					System.out.println("Digite a hora que o pedido foi realizado.");
					horarioPedido = ler.nextLine();
					System.out.println("Digite o numero do pedido.");
					numeroPedido = ler.nextInt();
					ler.nextLine();
					System.out.println("Digite o nome do garcom que realizou o pedido.");
					garcomPedido = ler.nextLine();
					for(Funcionario f : funcionarios) {
						if(garcomPedido.equalsIgnoreCase(f.getNomeFuncionario())) {
							if(garcom.equalsIgnoreCase(f.getFuncao())) {
								
								System.out.println("O pastel foi adicionado com sucesso.\n");	
								Pedido novo = new Pedido(clientePedido, escolhaPastel, escolhaBebida, precoPedido, horarioPedido, numeroPedido, garcomPedido, qntPastel, qntBebida );
								pedidos.add(novo);
								
							}	else {
								k++;
							}																
						}else {
							k++;
						}
					}if (funcionarios.size() == k) {
						System.out.println("Funcionario nao cadastrado ou nao exerce o papel de garcom.");
					}
					
					
					break; 
				
				case 2 : 
					int conta = 0;
					System.out.println("\nVoce selecionou a opcao (Visualizar pedidos).\n");
					
					for(Pedido pe : pedidos) {
						
						System.out.println (pe.getNomeCliente() + " - " + pe.getQntPastel() + "x " + pe.getEscPastel()+" - "+ pe.getQntBebida() + "x " + pe.getEscBebida() + " - R$"+ pe.getValorPedido() + 
						".00 - " + pe.getTimeCompra() + " - " + pe.getNumPedido() + " - " + pe.getNomeGarcom());
						conta++;
					}
					if(conta == 0) {System.out.println("Nao ha pedidos cadastrados.");}
					
					break; 
					
				case 3 : 
					
					System.out.println("\nVoce selecionou a opcao (Alterar pedido).");
					System.out.println("Lista de clientes com pedidos cadastradas:");
					System.out.println(); 
					for(Pedido pe : pedidos) {
							System.out.println (pe.getNomeCliente());
						}
					System.out.println(); 
			
					System.out.println("Digite o nome do cliente que voce gostaria de alterar os dados do pedido");
					clientePedido = ler.nextLine(); 
					for(Pedido pe : pedidos) {
						if(clientePedido.equalsIgnoreCase(pe.getNomeCliente())){
							
							System.out.println("\nO cliente " + pe.getNomeCliente() + " possui o seguinte pedido cadastrado :");
							System.out.println(pe.getQntPastel() + "x " + pe.getEscPastel() +"\n"+ pe.getQntBebida() + "x "+ pe.getEscBebida());
							System.out.println("O valor do pedido  é  de R$" + pe.getValorPedido());
							System.out.println("O pedido foi realizado as " + pe.getTimeCompra());
							System.out.println("O pedido é o numero " + pe.getNumPedido());
							System.out.println("O(a) garcom responsavel pelo pedido é o(a) " + pe.getNomeGarcom());
							System.out.println(); 
							System.out.println("O que voce gostaria de mudar (digite o numero): ");
							System.out.println("1 - Nome do cliente."); 
							System.out.println("2 - Escolha do pastel e a quantidade."); 
							System.out.println("3 - Escolha da bebida e a quantidade.");
							System.out.println("4 - Valor do pedido."); 
							System.out.println("5 - Horario do pedido. ");
							System.out.println("6 - Numero do pedido."); 
							System.out.println("7 - Garcom responsavel.\n"); 
							
							esc = ler.nextInt(); 
							ler.nextLine();
							
							switch(esc) {
							
								case 1 : 
									
									System.out.println("\nVoce selecionou a opcao nome do cliente.");
									System.out.println("Digite o novo nome para o cliente.");
									clientePedido = ler.nextLine();
									pe.setNomeCliente(clientePedido);;
									System.out.println("Nome alterado com sucesso.\n");
									break; 
								case 2 : 
									
									System.out.println("\nVoce selecionou a escolha do pastel e a quantidade.");
									System.out.println("Digite o novo pastel para o pedido.");
									escolhaPastel = ler.nextLine();
									pe.setEscPastel(escolhaPastel);
									System.out.println("Digite a nova quantidade.");
									qntPastel = ler.nextInt(); 
									ler.nextLine();
									pe.setQntPastel(qntPastel);
									System.out.println("Produtos alterados com sucesso.\n");
									break; 
								
								case 3 : 
									
									System.out.println("\nVoce selecionou a escolha da bebida e quantidade.");
									System.out.println("Digite a nova bebida para o pedido.");
									escolhaBebida = ler.nextLine();
									pe.setEscBebida(escolhaBebida);
									System.out.println("Digite a nova quantidade.");
									qntBebida = ler.nextInt(); 
									ler.nextLine();
									pe.setQntBebida(qntBebida);
									System.out.println("Produtos alterados com sucesso.\n");
									break; 	
									
								case 4 : 
									
									System.out.println("\nVoce selecionou a opcao valor do pedido.");
									System.out.println("Digite o novo valor para o pedido.");
									precoPedido = ler.nextInt();
									ler.nextLine(); 
									pe.setValorPedido(precoPedido);
									System.out.println("Valor do pedido alterado com sucesso.\n");
									break;
																	
								case 5 : 
									
									System.out.println("\nVoce selecionou a opcao horario do pedido.");
									System.out.println("Digite o novo horario para o pedido.");
									horarioPedido = ler.nextLine();
									pe.setTimeCompra(horarioPedido);;
									System.out.println("Horario alterado com sucesso.\n");
									break; 
							
								case 6 : 
									
									System.out.println("\nVoce selecionou a opcao numero do pedido.");
									System.out.println("Digite o novo numero para o pedido.");
									numeroPedido = ler.nextInt();
									ler.nextLine();
									pe.setNumPedido(numeroPedido);
									System.out.println("Cozinheiro alterado com sucesso.\n");
									break; 
								
								case 7 : 
									int l = 0;
									System.out.println("\nVoce selecionou a opcao garcom responsavel.");
									System.out.println("Digite o nome do novo garcom.");
									garcomPedido = ler.nextLine(); 
									for(Funcionario f : funcionarios) {
										if(garcomPedido.equalsIgnoreCase(f.getNomeFuncionario())) {
											if(garcom.equalsIgnoreCase(f.getFuncao())) {
												pe.setNomeGarcom(garcomPedido);
												System.out.println("Garcom alterado com sucesso");
												
											}else {
												l++;
											}
										}else {
											l++;
										}
										
									}if(funcionarios.size() == l ) {
										
										System.out.println("Funcionario nao cadastrado ou nao exerce a funcao de garcom.");
									}
									
									
									break ; 
							}
							
						}
						else {
							i++;
							}
						if(i == pedidos.size()) {
			                System.out.println("\nNenhuma pedido foi encontrada!");
			            }
	
					} break; 
					
				case 4:
					
					i = 0;
					System.out.println("\nVoce escolheu a opcao (deletar pedido).");
					System.out.println();
					
					for(Pedido pe : pedidos) {

						System.out.println (i + " - " + pe.getNomeCliente());
						i++; 
						
					}	
					System.out.println();
					System.out.println("Digite o numero do cliente que voce gostaria deletar o pedido."); 
					System.out.println();
					i = ler.nextInt(); 
					ler.nextLine(); 
					pedidos.remove(i);
					
					System.out.println("\n Pedido deletado com sucesso.\n");

					break; 
				case 5 : 
					repetidor = 1; 
					break; 
			} 
		}
	}		
		
	public static void funcionarioCRUD ( ArrayList <Funcionario> funcionarios) {
		
		int repetidor = 0, esc, i = 0, idFuncionario, telefoneFuncionario;
		double salario; 
		String nomeFuncionario, dataNascimento, endFuncionario, horarioFuncionario, funFuncionario, cpfFuncionario; 
		
		Scanner ler = new Scanner(System.in);
		while(repetidor == 0) {
			
			System.out.println("\nVoce entrou no menu do Funcionario, digite o numero do que voce gostaria de fazer.");
			System.out.println("1 - Contratar um funcionario.");
			System.out.println("2 - Visualizar funcionarios.");
			System.out.println("3 - Alterar funcionario.");
			System.out.println("4 - Demitir funcionario. :) ");
			System.out.println("5 - Voltar ao menu principal.\n");
			
			esc = ler.nextInt();
			ler.nextLine();
			
			switch(esc) {
			
					case 1 : 
						
						System.out.println("Voce escolheu a opcao de contratar um funcionario.\n");
						System.out.println("Digite o completo do funcionario.\n"); 
						nomeFuncionario = ler.nextLine(); 
						System.out.println("Digite o numero de identidade do funcionario.\n");
						idFuncionario = ler.nextInt(); 
						ler.nextLine(); 
						System.out.println("Digite o CPF do funcionario.\n");
						cpfFuncionario = ler.nextLine(); 
						
						System.out.println("Digite a data de nascimento do funcionario.\n"); 
						dataNascimento = ler.nextLine(); 
						System.out.println("Digite o endereco do funcionario.\n");
						endFuncionario = ler.nextLine(); 
						System.out.println("Digite o telefone de contato do fucnionario.\n");
						telefoneFuncionario = ler.nextInt(); 
						ler.nextLine();
						System.out.println("Digite o horario de trbalho do funcionario.\n");
						horarioFuncionario = ler.nextLine();
						System.out.println("Digite a funcao que o funcionario vai exercer.\n");
						funFuncionario = ler.nextLine();
						System.out.println("Digite o salario que o funcionario vai receber.\n");
						salario = ler.nextDouble(); 
						ler.nextLine(); 
						System.out.println("Funcionario contratado com sucesso.");		
						Funcionario novo = new Funcionario (nomeFuncionario, idFuncionario, cpfFuncionario, dataNascimento, endFuncionario, telefoneFuncionario, horarioFuncionario, funFuncionario, salario); 
						funcionarios.add(novo);
						break; 
						
					case 2 : 
						int conta = 0 ;
						System.out.println("\nVoce escolheu a opcao para visualizar os funcionarios cadastrados.\n");
						for( Funcionario f : funcionarios) {
							
							System.out.println(f.getNomeFuncionario() + " - " + f.getNumeroID() + " - " + f.getCpfFuncionario() + " - " + f.getDataNascimento() + " - " + f.getEndFuncionario() + " - " + f.getTelefoneFuncionario() + " - " + f.getTimeTrab() + " - " + f.getFuncao() + " - " + f.getSalario());
							
							conta++;
						}
						if ( conta == 0) {System.out.println( "\nNenhum funcionario cadastrado.\n");}
						break; 
						
					case 3 : 
						
						System.out.println("Voce escolheu a opcao de alterar dados do funcionario.\n");
						
						System.out.println("Lista de funcionarios cadastrados:");
						
						System.out.println(); 
						for(Funcionario f : funcionarios) {
								System.out.println (f.getNomeFuncionario());
							}
						System.out.println(); 
				
						System.out.println("Digite o nome do funcionario que voce gostaria. \n");
						nomeFuncionario = ler.nextLine(); 
						for(Funcionario f : funcionarios)  {
							if(nomeFuncionario.equalsIgnoreCase(f.getNomeFuncionario())){
								
								System.out.println("O funcionario " + f.getNomeFuncionario() + " possui os seguintes dados."); 
								System.out.println("Numero de identidade - " + f.getNumeroID()); 
								System.out.println("CPF - " + f.getCpfFuncionario());
								System.out.println("Data de Nascimento" + f.getDataNascimento());
								System.out.println("Endereco - " + f.getEndFuncionario());
								System.out.println("Telefode - " + f.getTelefoneFuncionario());
								System.out.println("Horario de trabalho - " + f.getTimeTrab());
								System.out.println("Funcao - " + f.getFuncao());
								System.out.println("Salario - R$" + f.getSalario());
								System.out.println("\nO que voce gostaria de mudar (digite o numero): \n");
								System.out.println("1 - Nome do funcionario."); 
								System.out.println("2 - Numero de identidade."); 
								System.out.println("3 - CPF.");
								System.out.println("4 - Data de Nascimento."); 
								System.out.println("5 - Endereco. ");
								System.out.println("6 - Telefone."); 
								System.out.println("7 - Horario de trabalho."); 
								System.out.println("8 - Funcao."); 
								System.out.println("9 - Salario.\n"); 
								
								esc = ler.nextInt();
								ler.nextLine();
								
								switch(esc) {
								
										case 1 : 
											System.out.println("Voce escolheu alterar o nome do funcionario."); 
											System.out.println("Digite o novo nome para o funcionario.");
											nomeFuncionario = ler.nextLine();
											f.setNomeFuncionario(nomeFuncionario);
											System.out.println("Nome alterado com sucesso.\n");
											break; 
										case 2 : 
											System.out.println("Voce escolheu alterar o numero de indentidade do funcionario.");
											System.out.println("Digite o novo numero de identidade do funcionario.");
											idFuncionario = ler.nextInt();
											ler.nextLine();
											f.setNumeroID(idFuncionario);
											System.out.println("Numero de identidade alterado com sucesso.\n");
											break; 
										case 3 : 
											System.out.println("Voce escolheu alterar o CPF do funcionario.");
											System.out.println("Digite o novo CPF do funcionario.");
											cpfFuncionario = ler.nextLine();
											f.setCpfFuncionario(cpfFuncionario);
											System.out.println("CPF alterado com sucesso.\n");
											break; 
										case 4 : 
											System.out.println("Voce escolheu alterar a data de nascimento do funcionario.");
											System.out.println("Digite a nova data de nascimento para o funcionario.");
											dataNascimento = ler.nextLine();
											f.setDataNascimento(dataNascimento);;
											System.out.println("Data de nascimento alterado com sucesso.\n");
											break; 
										case 5 : 
											System.out.println("Voce escolheu alterar o endereco do funcionario.");
											System.out.println("Digite o novo endereco para o funcionario.");
											endFuncionario = ler.nextLine();
											f.setEndFuncionario(endFuncionario);
											System.out.println("Endereco alterado com sucesso.\n");
											break; 
										case 6 : 
											System.out.println("Voce escolheu alterar o telefone do funcionario.");
											System.out.println("Digite o novo telefone para o funcionario.");
											telefoneFuncionario = ler.nextInt();
											ler.nextLine();
											f.setTelefoneFuncionario(telefoneFuncionario);
											System.out.println("Telefone alterado com sucesso.\n");
											break; 
										case 7 : 
											System.out.println("Voce escolheu alterar o horario do funcionario.");
											System.out.println("Digite o horario de trabalho para o funcionario.");
											horarioFuncionario = ler.nextLine();
											f.setTimeTrab(horarioFuncionario);
											System.out.println("Horario de trabalho alterado com sucesso.\n");
											break; 
										case 8 : 
											System.out.println("Voce escolheu alterar a funcao do funcionario.");
											System.out.println("Digite a nova funcao para o Funcionario.");
											funFuncionario = ler.nextLine();
											f.setFuncao(funFuncionario);;
											System.out.println("Funcao alterado com sucesso.\n");
											break; 
										case 9 : 
											System.out.println("Voce escolheu alterar o salario do funcionario.");
											System.out.println("Digite o novo salario para o funcionario.");
											salario = ler.nextInt();
											ler.nextLine(); 
											f.setSalario(salario);
											System.out.println("Salario alterado com sucesso.\n");
											break; 
								
								}
	
							}
										else {
											i++;
											}
										if(i == funcionarios.size()) {
							                System.out.println("\nNenhum funcionario foi encontrado!");
				            }
							
						} 

						break ; 
						
					case 4:
						System.out.println("Voce escolheu a opcao de demitir funcionario.\n");
						i = 0;
						
						for(Funcionario f : funcionarios) {

							System.out.println (i + " - " + f.getNomeFuncionario());
							i++; 
							
						}	
						System.out.println();
						System.out.println("Digite o numero do funcionario que voce quer demitir."); 
						System.out.println();
						i = ler.nextInt(); 
						ler.nextLine(); 
						funcionarios.remove(i);
						
						System.out.println("\n Funcionario demitido com sucesso. :) \n");

						break; 
					case 5 : 
						repetidor = 1; 
						break; 
			
			}
		
		
		
	}}

	public static void vendaCRUD( ArrayList <Venda> vendas) {
		
		int esc, repetidor = 0, numVenda, valorVenda; 
		String nomeCliente; 
		Scanner ler = new Scanner(System.in);
		while(repetidor == 0) {
			
			System.out.println("\nVoce escolheu a opcao CRUD Venda");
			System.out.println("1 - Cadastrar uma venda.");
			System.out.println("2 - Visualizar vendas.");
			System.out.println("3 - Alterar venda.");
			System.out.println("4 - Apagar venda.");
			System.out.println("5 - Total.");
			System.out.println("6 - Voltar ao menu principal.\n");
			
			esc = ler.nextInt();
			ler.nextLine();
			
			switch(esc) {
			
					case 1 : 
						
						System.out.println("Voce escolheu a opcao de cadastro de venda.\n");
						System.out.println("Digite o numero da venda.\n");
						numVenda = ler.nextInt(); 
						ler.nextLine(); 
						System.out.println("Digite o nome do cliente.\n");
						nomeCliente = ler.nextLine();
						System.out.println("Digite o valor pago da venda.\n");
						valorVenda = ler.nextInt(); 
						ler.nextLine(); 
						
						Venda novo = new Venda (numVenda, nomeCliente, valorVenda);
						vendas.add(novo);
						
						System.out.println("Venda realizada com sucesso, volte sempre!!");
						
						break;
						
					case 2 : 
						int conta = 0;
						System.out.println("Voce escolheu a opcao de visualizar vendas."); 
						
						for(Venda v : vendas) {
							
							System.out.println(v.getNumVenda() +" - "+ v.getNomeCliente() + " - R$" + v.getValorVenda() + ".00"); 
							conta++; 
						}
						
						if(conta == 0) {
							System.out.println("Nenhuma venda foi cadastrada ainda.");
							
						}
						
						break; 
						
					case 3 : 
						int i = 0; 
						System.out.println("Voce escolheu a opcao de alterar venda. \n Lista de vendas cadastradas : \n"); 
						
						for(Venda v : vendas) {
							System.out.println(" " + v.getNumVenda() + " - " + v.getNomeCliente() + " - R$" + v.getValorVenda() + ".00");							
						}
						
						System.out.println("Digite o numero da venda que voce deseja alterar.");
						
						numVenda = ler.nextInt(); 
						ler.nextLine();
						
						for(Venda v : vendas) {
							
							if (numVenda == (v.getNumVenda())) {
								
								System.out.println("Voce selecionou a venda de numero " + v.getNumVenda() + " do cliente " + v.getNomeCliente() + " com o valor de R$"+ v.getValorVenda() + ".\n");
								System.out.println("1 - Numero do pedido.");
								System.out.println("2 - Nome do cliente.");
								System.out.println("3 - Valor da venda.");
								System.out.println("Digite o numero da opcao que voce gostaria de alterar.");
								
								esc = ler.nextInt();
								ler.nextLine(); 
								
								switch(esc) {
										
										case 1 : 
											
											System.out.println("\n Voce escolheu alterar o numero do pedido.");
											System.out.println("Digite o novo numero da venda.");
											numVenda = ler.nextInt(); 
											ler.nextLine();
											v.setNumVenda(numVenda);
											System.out.println("Alteracao feita com sucesso.");
											break; 
										case 2 : 
											
											System.out.println("\n Voce escolheu alterar o nome do cliente.");
											System.out.println("Digite o novo nome do cliente.");
											nomeCliente = ler.nextLine() ;
											v.setNomeCliente(nomeCliente);
											System.out.println("Alteracao feita com sucesso. \n");
											break; 
										case 3 : 
											
											System.out.println("\n Voce escolheu alterar o valor da venda.");
											System.out.println("Digite o novo valor para a venda.");
											valorVenda = ler.nextInt();
											ler.nextLine();
											v.setValorVenda(valorVenda);
											System.out.println("Alteracao feita com sucesso. \n");
											break; 
								
								}																
							}

							else {
							i++;
							}
						if(i == vendas.size()) {
			                System.out.println("\nNenhuma venda foi encontrado!");
            }
			
		}					break;
						
					case 4 : 
						
						System.out.println("Voce escolheu a opcao de deletar venda.");
						i = 0;
						
						for(Venda v : vendas) {

							System.out.println ("Digite o numero (" + i + ") para deletar a seguinte venda - Numero de pedido - "+ v.getNumVenda() + " - Nome do cliente - " + v.getNomeCliente());
							i++; 
							
						}	
						System.out.println();
						i = ler.nextInt(); 
						ler.nextLine(); 
						vendas.remove(i);
						
						System.out.println("\n Venda deletada com sucesso. \n");

						break; 
					
					case 5 :
						int total = 0;
						for(Venda v : vendas) {
							
							total = v.getValorVenda() + total;
							
							
						}
						System.out.println("\n O valor total das vendas é de R$" + total + ".00"); 
						break; 
						
					case 6 : 
						repetidor = 1;
						break; 
			
			}
			
			}		
		}
		

	}
		
	
	
		
		
		
	


	
