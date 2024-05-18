package org.cgmlti.ciclos2826502;


public class vendedor {
    private Long codigo;
    private Integer unidadesVendidas;

    public vendedor(Long codigo, Integer unidadesVendidas) {
        this.codigo = codigo;
        this.unidadesVendidas = unidadesVendidas;
    }
    public Long getcodigo() {
        return codigo;
    }
    public void setcodigo(Long codigo) {
        this.codigo = codigo;
    }
    public Integer getunidadesVendidas() {
        return unidadesVendidas;
    }
    public void setunidadesVendidas(Integer unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }


}