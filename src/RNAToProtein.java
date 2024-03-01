//#6
//   cannot get it to print .GREAT

//import java.util.*;
//
//public class RNAToProtein {
//    public static String rnaToProtein(String rna) {
//        // define the codons and corresponding amino acids
//        String[] codons = {"UUU", "CUU", "AUU", "GUU", "UUC", "CUC", "AUC", "GUC", "UUA", "CUA", "AUA", "GUA", "UUG", "CUG", "AUG", "GUG", "UCU", "CCU", "ACU", "GCU", "UCC", "CCC", "ACC", "GCC", "UCA", "CCA", "ACA", "GCA", "UCG", "CCG", "ACG", "GCG", "UAU", "CAU", "AAU", "GAU", "UAC", "CAC", "AAC", "GAC", "UAA", "CAA", "AAA", "GAA", "UAG", "CAG", "AAG", "GAG", "UGU", "CGU", "AGU", "GGU", "UGC", "CGC", "AGC", "GGC", "UGA", "CGA", "AGA", "GGA", "UGG", "CGG", "AGG", "GGG"};
//        char[] aminoAcids = {'F', 'L', 'I', 'V', 'F', 'L', 'I', 'V', 'L', 'L', 'I', 'V', 'L', 'L', 'M', 'V', 'S', 'P', 'T', 'A', 'S', 'P', 'T', 'A', 'S', 'P', 'T', 'A', 'S', 'P', 'T', 'A', 'Y', 'H', 'N', 'D', 'Y', 'H', 'N', 'D', '.', 'Q', 'K', 'E', '.', 'Q', 'K', 'E', 'C', 'R', 'S', 'G', 'C', 'R', 'S', 'G', '.', 'R', 'R', 'G', 'W', 'R', 'R', 'G'};
//
//        // create a map from codons to amino acids
//        Map<String, Character> codonMap = new HashMap<>();
//        for (int i = 0; i < codons.length; i++) {
//            codonMap.put(codons[i], aminoAcids[i]);
//        }
//
//        // convert the RNA sequence to the protein sequence
//        String protein = "";
//        for (int i = 0; i < rna.length(); i += 3) {
//            if (i + 3 <= rna.length()) {
//                String codon = rna.substring(i, i + 3);
//                protein += codonMap.get(codon);
//            } else {
//                protein += ".";
//            }
//        }
//
//        return protein;
//    }
//
//    public static void main(String[] args) {
//        // example testing
//        System.out.println(rnaToProtein("AGCUGGGAAACGUAGGCCUA"));  // Output: SWET.A.
//        System.out.println(rnaToProtein("UAAAGAGAAGCCAGC"));  // Output: .GREAT
//    }
//}
