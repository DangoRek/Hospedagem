class Quartos{
    private String nome, email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Quarto Ocupado\nEmail=" + email + "\nNome=" + nome + "\n";
    }

    public Quartos(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }


    
}