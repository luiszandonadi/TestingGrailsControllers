package teste
import grails.test.*
import org.gmock.*

@WithGMock
class PessoaControllerTests extends ControllerUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testDeveriaBuscarPessoa() {
        def result = new Pessoa(id:1,nome:"TESTE")
        def service = new PessoaService()
        mock(service).buscarPessoa(1).returns(result)
        mock(controller).pessoaService.returns(service)
        play{
            controller.params.id = 1
            def acao = controller.buscar()
            assertEquals(result.nome,acao.pessoa.nome)
        }
    }
}

