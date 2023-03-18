package exercicios_o.o_ex_1_2;

import java.text.DecimalFormat;

public class InvoiceTeste {

	public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
    
        Invoice invoice = new Invoice(050, 50, 4500f,"Apple Iphone x");
    
        System.out.println("Descrição do Produto: " + invoice.getDescricaoItem());
        System.out.println("Quantidade comprada: " + invoice.getQtdItem());
        System.out.println("Preço item: " + df.format(invoice.getPrecoItem()));
        System.out.println("Valor da Nota: " + df.format(invoice.getInvoiceAmount()));

	}
}
