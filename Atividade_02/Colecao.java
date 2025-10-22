package Atividade_02;



    public class Colecao implements ItemEmprestado{
        private String proprietario;
        private Integer quantidadeItens;

        public Colecao(String proprietario, Integer quantidadeItens) {
            this.proprietario = proprietario;
            this.quantidadeItens = quantidadeItens;
        }

        public String getProprietario() {
            return proprietario;
        }

        public void setProprietario(String proprietario) {
            this.proprietario = proprietario;
        }

        public Integer getQuantidadeItens() {
            return quantidadeItens;
        }

        public void setQuantidadeItens(Integer quantidadeItens) {
            this.quantidadeItens = quantidadeItens;
        }

        @Override
        public void descricao(){
            System.out.println("Proprietario: " + this.proprietario);
            System.out.println("Quantidade de itens: " + this.quantidadeItens);

    }

    }


