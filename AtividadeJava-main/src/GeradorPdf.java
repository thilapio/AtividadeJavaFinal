import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;

public class GeradorPdf {

    public static void gerarPdfNota(Notas nota, Fornecedores fornecedor, List<NotaItem> itens) {
        String dest = "C:/Backups/Nota_" + nota.getIdNota() + ".pdf";

        try {
            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // --- CABEÇALHO ---
            document.add(new Paragraph("NOTA FISCAL - ENTRADA DE PRODUTOS").setBold().setFontSize(18));
            document.add(new Paragraph("Número da Nota: " + nota.getIdNota()));
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            document.add(new Paragraph("Data de Emissão: " + nota.getDataNota().format(formatter)));
            
            document.add(new Paragraph("\nDADOS DO FORNECEDOR"));
            document.add(new Paragraph("Empresa: " + fornecedor.getNomeEmpresa()));
            document.add(new Paragraph("CNPJ: " + fornecedor.getCnpj()));
            document.add(new Paragraph("--------------------------------------------------------------------------"));

            // --- TABELA DE ITENS ---
            document.add(new Paragraph("\nITENS DA NOTA\n").setBold());
            
            Table table = new Table(UnitValue.createPercentArray(new float[]{4, 1, 2, 2}));
            table.setWidth(UnitValue.createPercentValue(100));
            
            table.addHeaderCell("Produto");
            table.addHeaderCell("Qtd.");
            table.addHeaderCell("Vlr. Unit.");
            table.addHeaderCell("Subtotal");

            ProdutosDAO pDAO = new ProdutosDAO();
            for (NotaItem item : itens) {
                Produtos produto = pDAO.getProduto(item.getIdProduto());
                
                BigDecimal subtotal = item.getValorUnitario().multiply(new BigDecimal(item.getQuantidade()));

                table.addCell(produto != null ? produto.getNome() : "Produto não encontrado");
                table.addCell(String.valueOf(item.getQuantidade()));
                table.addCell("R$ " + String.format("%.2f", item.getValorUnitario()));
                table.addCell("R$ " + String.format("%.2f", subtotal));
            }
            document.add(table);
            
            // --- RODAPÉ ---
            document.add(new Paragraph("\n\nValor Total da Nota: R$ " + String.format("%.2f", nota.getValorTotal())).setBold().setFontSize(14));

            document.close();
            
            JOptionPane.showMessageDialog(null, "PDF da nota gerado com sucesso em:\n" + dest, "PDF Gerado", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e) {
            System.err.println("Erro ao gerar PDF: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao gerar PDF: Verifique se a pasta C:\\Backups existe.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}