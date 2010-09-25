package teste

class PessoaService {

    static transactional = true

    def buscaPessoa(id) {
       return new Pessoa(nome:"teste")
    }
}

