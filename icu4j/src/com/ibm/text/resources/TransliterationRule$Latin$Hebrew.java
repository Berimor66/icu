package com.ibm.text.resources;

import java.util.ListResourceBundle;

public class TransliterationRule$Latin$Hebrew extends ListResourceBundle {
    /**
     * Overrides ListResourceBundle
     */
    public Object[][] getContents() {
        return new Object[][] {
            { "Rule",
                //variable names, derived from the Unicode names.

                "POINT_SHEVA=\u05B0;"
                + "POINT_HATAF_SEGOL=\u05B1;"
                + "POINT_HATAF_PATAH=\u05B2;"
                + "POINT_HATAF_QAMATS=\u05B3;"
                + "POINT_HIRIQ=\u05B4;"
                + "POINT_TSERE=\u05B5;"
                + "POINT_SEGOL=\u05B6;"
                + "POINT_PATAH=\u05B7;"
                + "POINT_QAMATS=\u05B8;"
                + "POINT_HOLAM=\u05B9;"
                + "POINT_QUBUTS=\u05BB;"
                + "POINT_DAGESH_OR_MAPIQ=\u05BC;"
                + "POINT_METEG=\u05BD;"
                + "PUNCTUATION_MAQAF=\u05BE;"
                + "POINT_RAFE=\u05BF;"
                + "PUNCTUATION_PASEQ=\u05C0;"
                + "POINT_SHIN_DOT=\u05C1;"
                + "POINT_SIN_DOT=\u05C2;"
                + "PUNCTUATION_SOF_PASUQ=\u05C3;"
                + "ALEF=\u05D0;"
                + "BET=\u05D1;"
                + "GIMEL=\u05D2;"
                + "DALET=\u05D3;"
                + "HE=\u05D4;"
                + "VAV=\u05D5;"
                + "ZAYIN=\u05D6;"
                + "HET=\u05D7;"
                + "TET=\u05D8;"
                + "YOD=\u05D9;"
                + "FINAL_KAF=\u05DA;"
                + "KAF=\u05DB;"
                + "LAMED=\u05DC;"
                + "FINAL_MEM=\u05DD;"
                + "MEM=\u05DE;"
                + "FINAL_NUN=\u05DF;"
                + "NUN=\u05E0;"
                + "SAMEKH=\u05E1;"
                + "AYIN=\u05E2;"
                + "FINAL_PE=\u05E3;"
                + "PE=\u05E4;"
                + "FINAL_TSADI=\u05E5;"
                + "TSADI=\u05E6;"
                + "QOF=\u05E7;"
                + "RESH=\u05E8;"
                + "SHIN=\u05E9;"
                + "TAV=\u05EA;"
                + "YIDDISH_DOUBLE_VAV=\u05F0;"
                + "YIDDISH_VAV_YOD=\u05F1;"
                + "YIDDISH_DOUBLE_YOD=\u05F2;"
                + "PUNCTUATION_GERESH=\u05F3;"
                + "PUNCTUATION_GERSHAYIM=\u05F4;"

                //wildcards
                //The values can be anything we don't use in this file: start at E000.

                + "letter=[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ];"

                + "softvowel=[eiyEIY];"

                + "vowellike=[{ALEF}{AYIN}{YOD}{VAV}];"

                //?>{POINT_SHEVA}
                //?>{POINT_HATAF_SEGOL}
                //?>{POINT_HATAF_PATAH}
                //?>{POINT_HATAF_QAMATS}
                //?>{POINT_HIRIQ}
                //?>{POINT_TSERE}
                //?>{POINT_SEGOL}
                //?>{POINT_PATAH}
                //?>{POINT_QAMATS}
                //?>{POINT_HOLAM}
                //?>{POINT_QUBUTS}
                //?>{POINT_DAGESH_OR_MAPIQ}
                //?>{POINT_METEG}
                //?>{PUNCTUATION_MAQAF}
                //?>{POINT_RAFE}
                //?>{PUNCTUATION_PASEQ}
                //?>{POINT_SHIN_DOT}
                //?>{POINT_SIN_DOT}
                //?>{PUNCTUATION_SOF_PASUQ}

                + "a>{ALEF};"
                + "A>{ALEF};"

                + "b>{BET};"
                + "B>{BET};"

                + "c[{softvowel}>{SAMEKH};"
                + "C[{softvowel}>{SAMEKH};"
                + "c[{letter}>{KAF};"
                + "C[{letter}>{KAF};"
                + "c>{FINAL_KAF};"
                + "C>{FINAL_KAF};"

                + "d>{DALET};"
                + "D>{DALET};"

                + "e>{AYIN};"
                + "E>{AYIN};"

                + "f[{letter}>{PE};"
                + "f>{FINAL_PE};"
                + "F[{letter}>{PE};"
                + "F>{FINAL_PE};"

                + "g>{GIMEL};"
                + "G>{GIMEL};"

                + "h>{HE};"
                + "H>{HE};"

                + "i>{YOD};"
                + "I>{YOD};"

                + "j>{DALET}{SHIN};"
                + "J>{DALET}{SHIN};"

                + "kH>{HET};"
                + "kh>{HET};"
                + "KH>{HET};"
                + "Kh>{HET};"
                + "k[{letter}>{KAF};"
                + "K[{letter}>{KAF};"
                + "k>{FINAL_KAF};"
                + "K>{FINAL_KAF};"

                + "l>{LAMED};"
                + "L>{LAMED};"

                + "m[{letter}>{MEM};"
                + "m>{FINAL_MEM};"
                + "M[{letter}>{MEM};"
                + "M>{FINAL_MEM};"

                + "n[{letter}>{NUN};"
                + "n>{FINAL_NUN};"
                + "N[{letter}>{NUN};"
                + "N>{FINAL_NUN};"

                + "o>{VAV};"
                + "O>{VAV};"

                + "p[{letter}>{PE};"
                + "p>{FINAL_PE};"
                + "P[{letter}>{PE};"
                + "P>{FINAL_PE};"

                + "q>{QOF};"
                + "Q>{QOF};"

                + "r>{RESH};"
                + "R>{RESH};"

                + "sH>{SHIN};"
                + "sh>{SHIN};"
                + "SH>{SHIN};"
                + "Sh>{SHIN};"
                + "s>{SAMEKH};"
                + "S>{SAMEKH};"

                + "th>{TAV};"
                + "tH>{TAV};"
                + "TH>{TAV};"
                + "Th>{TAV};"
                + "tS[{letter}>{TSADI};"
                + "ts[{letter}>{TSADI};"
                + "Ts[{letter}>{TSADI};"
                + "TS[{letter}>{TSADI};"
                + "tS>{FINAL_TSADI};"
                + "ts>{FINAL_TSADI};"
                + "Ts>{FINAL_TSADI};"
                + "TS>{FINAL_TSADI};"
                + "t>{TET};"
                + "T>{TET};"

                + "u>{VAV};"
                + "U>{VAV};"

                + "v>{VAV};"
                + "V>{VAV};"

                + "w>{VAV};"
                + "W>{VAV};"

                + "x>{KAF}{SAMEKH};"
                + "X>{KAF}{SAMEKH};"

                + "y>{YOD};"
                + "Y>{YOD};"

                + "z>{ZAYIN};"
                + "Z>{ZAYIN};"

                //#?>{YIDDISH_DOUBLE_VAV}
                //?>{YIDDISH_VAV_YOD}
                //?>{YIDDISH_DOUBLE_YOD}
                //?>{PUNCTUATION_GERESH}
                //?>{PUNCTUATION_GERSHAYIM}

                + "''>;"

                //{POINT_SHEVA}>@
                //{POINT_HATAF_SEGOL}>@
                //{POINT_HATAF_PATAH}>@
                //{POINT_HATAF_QAMATS}>@
                //{POINT_HIRIQ}>@
                //{POINT_TSERE}>@
                //{POINT_SEGOL}>@
                //{POINT_PATAH}>@
                //{POINT_QAMATS}>@
                //{POINT_HOLAM}>@
                //{POINT_QUBUTS}>@
                //{POINT_DAGESH_OR_MAPIQ}>@
                //{POINT_METEG}>@
                //{PUNCTUATION_MAQAF}>@
                //{POINT_RAFE}>@
                //{PUNCTUATION_PASEQ}>@
                //{POINT_SHIN_DOT}>@
                //{POINT_SIN_DOT}>@
                //{PUNCTUATION_SOF_PASUQ}>@

                + "a<{ALEF};"
                + "e<{AYIN};"
                + "b<{BET};"
                + "d<{DALET};"
                + "k<{FINAL_KAF};"
                + "m<{FINAL_MEM};"
                + "n<{FINAL_NUN};"
                + "p<{FINAL_PE};"
                + "ts<{FINAL_TSADI};"
                + "g<{GIMEL};"
                + "kh<{HET};"
                + "h<{HE};"
                + "k''<{KAF}[{HE};"
                + "k<{KAF};"
                + "l<{LAMED};"
                + "m<{MEM};"
                + "n<{NUN};"
                + "p<{PE};"
                + "q<{QOF};"
                + "r<{RESH};"
                + "s''<{SAMEKH}[{HE};"
                + "s<{SAMEKH};"
                + "sh<{SHIN};"
                + "th<{TAV};"
                + "t''<{TET}[{HE};"
                + "t''<{TET}[{SAMEKH};"
                + "t''<{TET}[{SHIN};"
                + "t<{TET};"
                + "ts<{TSADI};"
                + "v<{VAV}[{vowellike};"
                + "u<{VAV};"
                + "y<{YOD};"
                + "z<{ZAYIN};"

                //{YIDDISH_DOUBLE_VAV}>@
                //{YIDDISH_VAV_YOD}>@
                //{YIDDISH_DOUBLE_YOD}>@
                //{PUNCTUATION_GERESH}>@
                //{PUNCTUATION_GERSHAYIM}>@

                + "<'';"
            }
        };
    }
}
