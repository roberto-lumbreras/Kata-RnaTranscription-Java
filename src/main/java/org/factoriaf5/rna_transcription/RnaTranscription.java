package org.factoriaf5.rna_transcription;


public class RnaTranscription {
    
    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        if(dnaStrand.matches("(C|G|T|A)+")){
            for (char c:dnaStrand.toCharArray()){
                rnaStrand+=c=='G'?
                'C':
                c=='C'?
                'G':
                c=='T'?
                'A':
                'U';
            }
        }
        return rnaStrand;
    }

}
