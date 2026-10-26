/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rruE;
import celestial.rruG;
import celestial.rruJ;
import celestial.rruO;
import celestial.rruS;
import celestial.rruX;
import celestial.rrub_1;
import celestial.rrux_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruh_1
implements rruO {
    private static double[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static float[] id_throws;
    private static byte[] id_case;

    @Override
    public void id_byte() {
        Object object;
        int n;
        float f = id_throws[4];
        rrux_1 rrux_12 = ((rrux_1)this.id_class[id_protected[18]]).id_break().id_break(((Float)this.id_class[id_protected[19]]).floatValue() * id_throws[5]);
        rrux_1 rrux_13 = new rrux_1(id_throws[6], id_throws[7]);
        for (Object object2 : (List)this.id_class[id_protected[20]]) {
            if (((Boolean)((rruX)object2).id_class[id_protected[21]]).booleanValue()) continue;
            rrux_13.id_byte((rrux_1)((rruX)object2).id_class[id_protected[22]]);
            ((rrux_1)((rruX)object2).id_class[id_protected[23]]).id_class(rrux_12);
            ((rrux_1)((rruX)object2).id_class[id_protected[24]]).id_byte(rrux_13);
        }
        rruX rruX2 = (rruX)((List)this.id_class[id_protected[25]]).get(id_byte[7]);
        for (rruX rruX3 : (List)this.id_class[id_protected[26]]) {
            if (rruX3 == rruX2 || !(((Float)((rrux_1)rruX3.id_class[rruh_1.id_protected[27]]).id_class[id_protected[28]]).floatValue() - ((Float)((rrux_1)rruX2.id_class[rruh_1.id_protected[29]]).id_class[id_protected[30]]).floatValue() > id_throws[8])) continue;
            Float f2 = Float.valueOf(((Float)((rrux_1)rruX2.id_class[rruh_1.id_protected[32]]).id_class[id_protected[33]]).floatValue());
            ((rrux_1)rruX3.id_class[rruh_1.id_protected[31]]).id_class[rruh_1.id_protected[34]] = f2;
        }
        for (n = ((List)this.id_class[id_protected[35]]).size() - id_case[1]; n >= id_byte[8]; --n) {
            rrux_1 rrux_14;
            double d;
            double d2 = this.id_class((rrux_1)((rruX)((List)this.id_class[rruh_1.id_protected[36]]).get((int)n)).id_class[id_protected[37]], (rrux_1)((rruX)((List)this.id_class[rruh_1.id_protected[38]]).get((int)(n - rruh_1.id_byte[9]))).id_class[id_protected[39]], (rrux_1)((rruX)((List)this.id_class[rruh_1.id_protected[40]]).get((int)(n + rruh_1.id_byte[10]))).id_class[id_protected[41]]);
            if ((d2 *= id_break[0]) > id_break[1]) {
                d2 -= id_break[2];
            }
            if (d2 < id_break[3]) {
                d2 += id_break[4];
            }
            if ((d = Math.abs(d2)) < (double)(id_throws[9] - ((Float)this.id_class[id_protected[42]]).floatValue())) {
                rrux_1 rrux_15 = rrux_14 = this.id_class((rrux_1)((rruX)((List)this.id_class[rruh_1.id_protected[43]]).get((int)n)).id_class[id_protected[44]], (rrux_1)((rruX)((List)this.id_class[rruh_1.id_protected[45]]).get((int)(n - rruh_1.id_byte[11]))).id_class[id_protected[46]], d2, id_throws[10] - ((Float)this.id_class[id_protected[47]]).floatValue() + id_throws[11]);
                ((rruX)((List)this.id_class[rruh_1.id_protected[48]]).get((int)(n + rruh_1.id_byte[12]))).id_class[rruh_1.id_protected[49]] = rrux_15;
            }
            if (!(d > (double)(id_throws[12] + ((Float)this.id_class[id_protected[50]]).floatValue()))) continue;
            rrux_1 rrux_16 = rrux_14 = this.id_class((rrux_1)((rruX)((List)this.id_class[rruh_1.id_protected[51]]).get((int)n)).id_class[id_protected[52]], (rrux_1)((rruX)((List)this.id_class[rruh_1.id_protected[53]]).get((int)(n - rruh_1.id_byte[13]))).id_class[id_protected[54]], d2, id_throws[13] + ((Float)this.id_class[id_protected[55]]).floatValue() - id_throws[14]);
            ((rruX)((List)this.id_class[rruh_1.id_protected[56]]).get((int)(n + rruh_1.id_byte[14]))).id_class[rruh_1.id_protected[57]] = rrux_16;
        }
        for (n = id_byte[15]; n < (Integer)this.id_class[id_protected[58]]; ++n) {
            for (int i = ((List)this.id_class[id_protected[59]]).size() - id_byte[16]; i >= 0; --i) {
                object = (rruJ)((List)this.id_class[id_protected[60]]).get(i);
                rrux_1 rrux_17 = ((rrux_1)((rruX)((rruJ)object).id_class[rruh_1.id_protected[61]]).id_class[id_protected[62]]).id_break().id_class((rrux_1)((rruX)((rruJ)object).id_class[rruh_1.id_protected[63]]).id_class[id_protected[64]]).id_class(id_throws[15]);
                rrux_1 rrux_18 = ((rrux_1)((rruX)((rruJ)object).id_class[rruh_1.id_protected[65]]).id_class[id_protected[66]]).id_break().id_break((rrux_1)((rruX)((rruJ)object).id_class[rruh_1.id_protected[67]]).id_class[id_protected[68]]).id_class();
                if (!((Boolean)((rruX)((rruJ)object).id_class[rruh_1.id_protected[69]]).id_class[id_protected[70]]).booleanValue()) {
                    rrux_1 rrux_19 = rrux_17.id_break().id_class(rrux_18.id_break().id_break(((Float)((rruJ)object).id_class[id_protected[72]]).floatValue() / id_throws[16]));
                    ((rruX)((rruJ)object).id_class[rruh_1.id_protected[71]]).id_class[rruh_1.id_protected[73]] = rrux_19;
                }
                if (((Boolean)((rruX)((rruJ)object).id_class[rruh_1.id_protected[74]]).id_class[id_protected[75]]).booleanValue()) continue;
                rrux_1 rrux_110 = rrux_17.id_break().id_break(rrux_18.id_break().id_break(((Float)((rruJ)object).id_class[id_protected[77]]).floatValue() / id_throws[17]));
                ((rruX)((rruJ)object).id_class[rruh_1.id_protected[76]]).id_class[rruh_1.id_protected[78]] = rrux_110;
            }
        }
        for (n = id_byte[17]; n < ((List)this.id_class[id_protected[79]]).size(); ++n) {
            rruJ rruJ2 = (rruJ)((List)this.id_class[id_protected[80]]).get(n);
            object = ((rrux_1)((rruX)rruJ2.id_class[rruh_1.id_protected[81]]).id_class[id_protected[82]]).id_break().id_break((rrux_1)((rruX)rruJ2.id_class[rruh_1.id_protected[83]]).id_class[id_protected[84]]).id_class();
            if (((Boolean)((rruX)rruJ2.id_class[rruh_1.id_protected[85]]).id_class[id_protected[86]]).booleanValue()) continue;
            rrux_1 rrux_111 = ((rrux_1)((rruX)rruJ2.id_class[rruh_1.id_protected[88]]).id_class[id_protected[89]]).id_break().id_break(((rrux_1)object).id_break(((Float)rruJ2.id_class[id_protected[90]]).floatValue()));
            ((rruX)rruJ2.id_class[rruh_1.id_protected[87]]).id_class[rruh_1.id_protected[91]] = rrux_111;
        }
    }

    public rruh_1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.id_case();
        this.id_class[rruh_1.id_protected[0]] = arrayList2 = new ArrayList();
        this.id_class[rruh_1.id_protected[1]] = arrayList = new ArrayList();
        rrux_1 rrux_12 = new rrux_1(id_throws[0], id_throws[1]);
        this.id_class[rruh_1.id_protected[2]] = rrux_12;
        Float f = Float.valueOf(((Integer)((rruE)rruS.id_class[rruh_1.id_protected[3]]).id_class[id_protected[4]]).intValue());
        this.id_class[rruh_1.id_protected[5]] = f;
        Integer n = id_case[0];
        this.id_class[rruh_1.id_protected[6]] = n;
        Float f2 = Float.valueOf(id_throws[2]);
        this.id_class[rruh_1.id_protected[7]] = f2;
        Boolean bl = id_byte[0];
        this.id_class[rruh_1.id_protected[8]] = bl;
    }

    static {
        rruh_1.ntfClinit();
    }

    private rrux_1 id_class(rrux_1 rrux_12, rrux_1 rrux_13, double d, double d2) {
        double d3 = d2 / id_break[5];
        float f = ((Float)rrux_13.id_class[id_protected[92]]).floatValue() - ((Float)rrux_12.id_class[id_protected[93]]).floatValue();
        float f2 = ((Float)rrux_13.id_class[id_protected[94]]).floatValue() - ((Float)rrux_12.id_class[id_protected[95]]).floatValue();
        if (d < id_break[6]) {
            d3 *= id_break[7];
        }
        double d4 = Math.cos(d3);
        double d5 = Math.sin(d3);
        return new rrux_1((float)((double)f * d4 - (double)f2 * d5 + (double)((Float)rrux_12.id_class[id_protected[96]]).floatValue()), (float)((double)f * d5 + (double)f2 * d4 + (double)((Float)rrux_12.id_class[id_protected[97]]).floatValue()));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA240E92D10075E23L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{39, 40, 54, 15, 40, -68, -121, 71}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private double id_class(rrux_1 rrux_12, rrux_1 rrux_13, rrux_1 rrux_14) {
        return Math.atan2(((Float)rrux_14.id_class[id_protected[98]]).floatValue() - ((Float)rrux_12.id_class[id_protected[99]]).floatValue(), ((Float)rrux_14.id_class[id_protected[100]]).floatValue() - ((Float)rrux_12.id_class[id_protected[101]]).floatValue()) - Math.atan2(((Float)rrux_13.id_class[id_protected[102]]).floatValue() - ((Float)rrux_12.id_class[id_protected[103]]).floatValue(), ((Float)rrux_13.id_class[id_protected[104]]).floatValue() - ((Float)rrux_12.id_class[id_protected[105]]).floatValue());
    }

    @Override
    public void id_class(rrub_1 rrub_12) {
        ((rrux_1)((rruX)((List)this.id_class[rruh_1.id_protected[116]]).get((int)rruh_1.id_byte[18])).id_class[id_protected[117]]).id_byte((rrux_1)((rruX)((List)this.id_class[rruh_1.id_protected[118]]).get((int)rruh_1.id_byte[19])).id_class[id_protected[119]]);
        ((rrux_1)((rruX)((List)this.id_class[rruh_1.id_protected[120]]).get((int)rruh_1.id_byte[20])).id_class[id_protected[121]]).id_class(new rrux_1(((Float)rrub_12.id_class[id_protected[122]]).floatValue(), ((Float)rrub_12.id_class[id_protected[123]]).floatValue()));
    }

    @Override
    public float id_class() {
        return ((Float)this.id_class[id_protected[112]]).floatValue();
    }

    @Override
    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rruh_1.id_protected[113]] = f2;
    }

    @Override
    public boolean id_class(int n) {
        if (((List)this.id_class[id_protected[9]]).size() != n) {
            ((List)this.id_class[id_protected[10]]).clear();
            ((List)this.id_class[id_protected[11]]).clear();
            for (int i = id_byte[1]; i < n; ++i) {
                rruX rruX2 = new rruX();
                Float f = Float.valueOf(-i);
                ((rrux_1)rruX2.id_class[rruh_1.id_protected[12]]).id_class[rruh_1.id_protected[13]] = f;
                Boolean bl = i == 0 ? id_byte[2] : id_byte[3];
                rruX2.id_class[rruh_1.id_protected[14]] = bl;
                ((List)this.id_class[id_protected[15]]).add(rruX2);
                if (i <= 0) continue;
                ((List)this.id_class[id_protected[16]]).add(new rruJ((rruX)((List)this.id_class[id_protected[17]]).get(i - id_byte[4]), rruX2, id_throws[3]));
            }
            return id_byte[5];
        }
        return id_byte[6];
    }

    @Override
    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rruh_1.id_protected[115]] = bl2;
    }

    @Override
    public boolean id_break() {
        return ((List)this.id_class[id_protected[124]]).isEmpty();
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6986DCEF;
    }

    @Override
    public void id_break(rrub_1 rrub_12) {
        Float f = Float.valueOf(((Float)rrub_12.id_class[id_protected[107]]).floatValue());
        ((rrux_1)this.id_class[rruh_1.id_protected[106]]).id_class[rruh_1.id_protected[108]] = f;
        Float f2 = Float.valueOf(((Float)rrub_12.id_class[id_protected[110]]).floatValue());
        ((rrux_1)this.id_class[rruh_1.id_protected[109]]).id_class[rruh_1.id_protected[111]] = f2;
    }

    @Override
    public boolean id_throws() {
        return (Boolean)this.id_class[id_protected[114]];
    }

    private static /* synthetic */ void ntfClinit() {
        rruh_1.id_implements();
        rruh_1.id_extends();
        rruh_1.id_catch();
        rruh_1.id_finally();
        rruh_1.id_private();
    }

    private static void id_finally() {
        double[] dArray = new double[8];
        dArray[0] = 57.2958;
        dArray[1] = 360.0;
        dArray[2] = 360.0;
        dArray[3] = -360.0;
        dArray[4] = 360.0;
        dArray[5] = 57.2958;
        dArray[7] = -1.0;
        id_break = dArray;
    }

    private static void id_catch() {
        float[] fArray = new float[20];
        fArray[1] = -1.0f;
        fArray[2] = 5.0f;
        fArray[3] = 1.0f;
        fArray[4] = 0.05f;
        fArray[5] = 0.05f;
        fArray[9] = 180.0f;
        fArray[10] = 180.0f;
        fArray[11] = 1.0f;
        fArray[12] = 180.0f;
        fArray[13] = 180.0f;
        fArray[14] = 1.0f;
        fArray[15] = 2.0f;
        fArray[16] = 2.0f;
        fArray[17] = 2.0f;
        id_throws = fArray;
    }

    private static void id_extends() {
        short[] sArray = new short[126];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 4;
        sArray[5] = 3;
        sArray[6] = 4;
        sArray[7] = 5;
        sArray[8] = 6;
        sArray[11] = 1;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[16] = 1;
        sArray[18] = 2;
        sArray[19] = 3;
        sArray[21] = 2;
        sArray[24] = 1;
        sArray[42] = 5;
        sArray[47] = 5;
        sArray[50] = 5;
        sArray[55] = 5;
        sArray[58] = 4;
        sArray[59] = 1;
        sArray[60] = 1;
        sArray[63] = 1;
        sArray[67] = 1;
        sArray[70] = 2;
        sArray[72] = 2;
        sArray[74] = 1;
        sArray[75] = 2;
        sArray[76] = 1;
        sArray[77] = 2;
        sArray[79] = 1;
        sArray[80] = 1;
        sArray[83] = 1;
        sArray[85] = 1;
        sArray[86] = 2;
        sArray[87] = 1;
        sArray[90] = 2;
        sArray[94] = 1;
        sArray[95] = 1;
        sArray[97] = 1;
        sArray[98] = 1;
        sArray[99] = 1;
        sArray[102] = 1;
        sArray[103] = 1;
        sArray[106] = 2;
        sArray[109] = 2;
        sArray[110] = 1;
        sArray[111] = 1;
        sArray[112] = 3;
        sArray[113] = 3;
        sArray[114] = 6;
        sArray[115] = 6;
        sArray[117] = 1;
        sArray[123] = 1;
        sArray[124] = 1;
        id_protected = sArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[2]];
            objectArray[rruh_1.id_case[3]] = Float.valueOf(id_throws[18]);
            objectArray[rruh_1.id_case[4]] = id_byte[21];
            objectArray[rruh_1.id_case[5]] = Float.valueOf(id_throws[19]);
            objectArray[rruh_1.id_case[6]] = id_byte[22];
        }
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[23];
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        id_byte = blArray;
    }

    @Override
    public List<rruG> id_protected() {
        return (List)this.id_class[id_protected[125]];
    }

    private static void id_private() {
        id_case = new byte[]{30, 2, 7, 3, 4, 5, 6};
    }
}

