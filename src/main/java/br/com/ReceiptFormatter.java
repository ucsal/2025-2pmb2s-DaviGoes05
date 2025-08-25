package br.com;

import br.com.mariojp.solid.srp.Item;
import br.com.mariojp.solid.srp.Order;

public class ReceiptFormatter {
    
    public String format(Order order, double subtotal, double tax, double total, double taxRate) {
        StringBuilder sb = new StringBuilder();
        sb.append("Recibo:\n");
        for (Item i : order.getItems()){
            sb.append(i.getName())
              .append(" x ").append(i.getQuantity())
              .append(" = ").append(i.getTotalPrice())
              .append("\n");
        }
        sb.append("Subtotal: ").append(subtotal).append("\n");

        sb.append("Tax (").append((int)(taxRate * 100)).append("%): ").append(tax).append("\n");
        sb.append("Total: ").append(total).append("\n");
        return sb.toString();
    }
}
