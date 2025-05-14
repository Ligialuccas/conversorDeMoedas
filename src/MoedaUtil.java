public class MoedaUtil {
    public static String getSiglaMoeda(int codigo) {
        switch (codigo) {
            case 1: return "AUD"; // Dólar Australiano
            case 2: return "BRL"; // Real
            case 3: return "CAD"; // Dólar Canadense
            case 4: return "CHF"; // Franco Suíço
            case 5: return "EUR"; // Euro
            case 6: return "GBP"; // Libra Esterlina
            case 7: return "HKD"; // Dólar de Hong Kong
            case 8: return "JPY"; // Iene Japonês
            case 9: return "USD"; // Dólar Americano
            default: return "Código inválido";
        }
    }
}
