CASOS DE USO

SOFTWARE DE PETSHOP
Stack: Backend Java com Spring, Frontend Javascript, HTML/CSS
link projeto github: https://github.com/diogovsmartins/PetShop

1 Stakeholder -Funcionario

	REQUISITOS:
		MANTER CONSULTAS
		MANTER BANHOS
		MANTER USUARIOS E PETS
		LISTAR CONSULTAS
		
		
	BDDS:
		
		Cadastrar Usuário:
			Sendo: Um funcionário
			Posso: Cadastrar um usuário
			Para que:	Possa cadastrar usuário
			Criterios de aceite:
			Usuário precisa informar:
			Nome completo, telefone, endereço e cpf.
			Mostrar um formulário com os dados que precisam ser preenchidos, ao clicar no botão "salvar" salvar no 				banco de dados e mostra a mensagem 
			"salvo no banco de dados".
		
		Deletar um usuário:
			Sendo: Um funcionário
			Posso: Deletar um usuário
			Para que: Possa excluir o cadastro de um usuário do 				BD
			Critérios de aceite:
			Mostrar um botão na tela com a mensagem:
			"Tem certeza que deseja excluir o usuário?".
		
			
		Alterar um usuário:
			Sendo: Um funcionário
			Posso: Alterar um cadastro de usuário
			Para que:	Possa atualizar os dados do usuário
			Critérios de aceite:
			O usuário informar os dados que serão alterados:
			O software deverá abrir um formulário com os campos
			preenchidos com os dados existentes, que possam ser 				alterados e o ID, CPF não podem ser alterados.
			Mostrar um botão escrito "salvar" que ao ser clicado 				mande os dados pro backend salvar e
			mostrar um botão na tela com a mensagem:
			"Confirme as informações antes de salvar.", 
			caso confirmado mande para o backend, do contrário 				mostrar a mensagem "Não foi possivel alterar os 				dados".
		
		Listar um usuário:
			Sendo: Um funcionário
			Posso: Listar um usuário do banco de dados
			Para que:	Possa visualizar suas informações
			Critérios de aceite:
			Funcionário precisa informar o ID de usuário.
			Nessa tela no frontend é preciso que tenham dois 				botões chamados "alterar" e "excluir" que chamam os 				casos de uso Alterar e excluir respectivamente. 
			
			
	
	
		Marcas consulta
			Sendo: um funcionario
			Posso: marcar consultas
			para que: tratar um pet machucado
			Critérios de aceite:
			O dono do pet precisa estar cadastrado no banco de 				dados.
			É necessário informar o porte do animal, a raça, o 				tipo de pelo.
			
		Marcar banho
			sendo: um funcionário
			posso: marcar banhos
			para que: possa higienizar o pet.
			Critérios de aceite:
			
			