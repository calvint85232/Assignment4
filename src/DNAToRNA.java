//#5
public class DNAToRNA {
    public static String DNAToRNA(String dna) {
        // replace all 'T's in the DNA sequence with 'U's to get the RNA sequence
        String rna = dna.replace('T', 'U');
        return rna;
    }

    public static void main(String[] args) {
        // test examples
        System.out.println(DNAToRNA("AGCTGGGAAACGTAGGCCTA"));  // Output: AGCUGGGAAACGUAGGCCUA
        System.out.println(DNAToRNA("TTTTTTTTTTGGCGCG"));  // Output: UUUUUUUUUUGGCGCG
        System.out.println(DNAToRNA("CTTTGGGACTAGTAACCCATTTCGGCT"));  // Output: CUUUGGGACUAGUAACCCAUUUCGGCU
    }
}
