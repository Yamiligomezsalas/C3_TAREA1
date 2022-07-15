package biblioteca;


public class Revistas{
    String codigo, titulo,año;
    int numero;

    public Revistas(String codigo, String titulo, String año, int numero)
    {
        this.titulo = titulo;
        this.codigo = codigo;
        this.numero = numero;
        this.año = año;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revistas{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", año='" + año + '\'' +
                ", numero=" + numero +
                '}';
    }
}
