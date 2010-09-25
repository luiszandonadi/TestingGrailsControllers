package teste

class PessoaController {
    
	def pessoaService

	def buscar = {
	   def pessoa = pessoaService.buscarPessoa(params.id)	
	   [pessoa:pessoa] 
	}
    
	
}
