package exercicios_o.o_ex_1_2;

public class Invoice {
	
	private int codItem;
    private int qtdItem;
    private float precoItem;
    private String descricaoItem;

    public Invoice (int codItem,int qtdItem,float precoItem,String descricaoItem) {
        this.codItem = codItem;
        this.descricaoItem = descricaoItem;

        if (qtdItem < 0) {
            this.qtdItem = 0;
        }
         else{ 
            this.qtdItem = qtdItem;
         }

        if (precoItem < 0) {
            this.precoItem = 0.0f;
        } else {
            this.precoItem = precoItem;
        }
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        this.precoItem = precoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public double getInvoiceAmount(){
        return getQtdItem() * getPrecoItem();
    }
}
