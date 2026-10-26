/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rruE;
import celestial.rruG;
import celestial.rruO;
import celestial.rruS;
import celestial.rruW;
import celestial.rrub_1;
import celestial.rruk_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrud_1
implements rruO {
    private static float[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_throws;
    private static double[] id_case;

    @Override
    public void id_byte() {
        this.id_int();
        this.id_private();
        this.id_implements();
        this.id_final();
        this.id_implements();
        this.id_case();
        this.id_native();
    }

    private void id_int() {
        float f = id_break[5];
        rrub_1 rrub_12 = ((rrub_1)this.id_class[id_byte[20]]).id_byte().id_break(((Float)this.id_class[id_byte[21]]).floatValue() * id_break[6]);
        rrub_1 rrub_13 = new rrub_1(id_break[7], id_break[8], id_break[9]);
        for (rruk_1 rruk_12 : (List)this.id_class[id_byte[22]]) {
            if (((Boolean)rruk_12.id_class[id_byte[23]]).booleanValue()) continue;
            rrub_13.id_byte((rrub_1)rruk_12.id_class[id_byte[24]]);
            ((rrub_1)rruk_12.id_class[id_byte[25]]).id_class(rrub_12);
            ((rrub_1)rruk_12.id_class[id_byte[26]]).id_byte(rrub_13);
        }
    }

    public rrud_1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.id_extends();
        this.id_class[rrud_1.id_byte[0]] = arrayList2 = new ArrayList();
        this.id_class[rrud_1.id_byte[1]] = arrayList = new ArrayList();
        rrub_1 rrub_12 = new rrub_1(id_break[0], id_break[1], id_break[2]);
        this.id_class[rrud_1.id_byte[2]] = rrub_12;
        Float f = Float.valueOf(((Integer)((rruE)rruS.id_class[rrud_1.id_byte[3]]).id_class[id_byte[4]]).intValue());
        this.id_class[rrud_1.id_byte[5]] = f;
        Integer n = id_protected[0];
        this.id_class[rrud_1.id_byte[6]] = n;
        Float f2 = Float.valueOf(id_break[3]);
        this.id_class[rrud_1.id_byte[7]] = f2;
        Boolean bl = id_throws[0];
        this.id_class[rrud_1.id_byte[8]] = bl;
    }

    static {
        rrud_1.ntfClinit();
    }

    @Override
    public boolean id_class(int n) {
        if (((List)this.id_class[id_byte[9]]).size() != n) {
            ((List)this.id_class[id_byte[10]]).clear();
            ((List)this.id_class[id_byte[11]]).clear();
            for (int i = id_throws[1]; i < n; ++i) {
                rruk_1 rruk_12 = new rruk_1();
                Float f = Float.valueOf(-i);
                ((rrub_1)rruk_12.id_class[rrud_1.id_byte[12]]).id_class[rrud_1.id_byte[13]] = f;
                Float f2 = Float.valueOf(-i);
                ((rrub_1)rruk_12.id_class[rrud_1.id_byte[14]]).id_class[rrud_1.id_byte[15]] = f2;
                Boolean bl = i == 0 ? id_throws[2] : id_throws[3];
                rruk_12.id_class[rrud_1.id_byte[16]] = bl;
                ((List)this.id_class[id_byte[17]]).add(rruk_12);
                if (i <= 0) continue;
                ((List)this.id_class[id_byte[18]]).add(new rruW((rruk_1)((List)this.id_class[id_byte[19]]).get(i - id_throws[4]), rruk_12, id_break[4]));
            }
            return id_throws[5];
        }
        return id_throws[6];
    }

    @Override
    public void id_class(rrub_1 rrub_12) {
        ((rrub_1)((rruk_1)((List)this.id_class[rrud_1.id_byte[135]]).get((int)rrud_1.id_throws[25])).id_class[id_byte[136]]).id_byte((rrub_1)((rruk_1)((List)this.id_class[rrud_1.id_byte[137]]).get((int)rrud_1.id_throws[26])).id_class[id_byte[138]]);
        ((rrub_1)((rruk_1)((List)this.id_class[rrud_1.id_byte[139]]).get((int)rrud_1.id_throws[27])).id_class[id_byte[140]]).id_class(rrub_12);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x41FE6098733B3F2FL;
    }

    @Override
    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrud_1.id_byte[131]] = f2;
    }

    private rrub_1 id_class(rrub_1 rrub_12, rrub_1 rrub_13, double d) {
        rrub_1 rrub_14 = rrub_12.id_byte().id_break(rrub_13);
        rrub_14.id_class((float)d).id_class(rrub_12);
        return rrub_14;
    }

    @Override
    public float id_class() {
        return ((Float)this.id_class[id_byte[130]]).floatValue();
    }

    @Override
    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrud_1.id_byte[133]] = bl2;
    }

    private double id_class(rrub_1 rrub_12, rrub_1 rrub_13, rrub_1 rrub_14) {
        float f = ((Float)rrub_13.id_class[id_byte[121]]).floatValue() - ((Float)rrub_12.id_class[id_byte[122]]).floatValue();
        float f2 = ((Float)rrub_13.id_class[id_byte[123]]).floatValue() - ((Float)rrub_12.id_class[id_byte[124]]).floatValue();
        float f3 = ((Float)rrub_13.id_class[id_byte[125]]).floatValue() - ((Float)rrub_14.id_class[id_byte[126]]).floatValue();
        float f4 = ((Float)rrub_13.id_class[id_byte[127]]).floatValue() - ((Float)rrub_14.id_class[id_byte[128]]).floatValue();
        float f5 = f * f3 + f2 * f4;
        float f6 = f * f4 - f2 * f3;
        double d = rfU_2.id_protected((double)f6, (double)f5);
        return d * id_case[1] / id_case[2];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{61, 121, 97, 66, -117, -98, -3, 29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(rrub_1 rrub_12) {
        rrub_1 rrub_13 = rrub_12;
        this.id_class[rrud_1.id_byte[129]] = rrub_13;
    }

    @Override
    public boolean id_break() {
        return ((List)this.id_class[id_byte[134]]).isEmpty();
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x294682B5;
    }

    @Override
    public boolean id_throws() {
        return (Boolean)this.id_class[id_byte[132]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrud_1.id_catch();
        rrud_1.id_package();
        rrud_1.id_finally();
        rrud_1.id_volatile();
        rrud_1.id_new();
    }

    private static void id_finally() {
        float[] fArray = new float[22];
        fArray[1] = -1.0f;
        fArray[3] = 20.0f;
        fArray[4] = 1.0f;
        fArray[5] = 0.05f;
        fArray[6] = 0.05f;
        fArray[10] = 2.0f;
        fArray[11] = 2.0f;
        fArray[12] = 2.0f;
        fArray[13] = 2.0f;
        fArray[14] = 0.5f;
        fArray[15] = 0.5f;
        fArray[16] = 2.0f;
        fArray[17] = 2.0f;
        fArray[19] = 5.0f;
        id_break = fArray;
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[30];
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[24] = true;
        id_throws = blArray;
    }

    private void id_extends() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[3]];
            objectArray[rrud_1.id_protected[4]] = Float.valueOf(id_break[20]);
            objectArray[rrud_1.id_protected[5]] = id_throws[28];
            objectArray[rrud_1.id_protected[6]] = Float.valueOf(id_break[21]);
            objectArray[rrud_1.id_protected[7]] = id_throws[29];
        }
    }

    private void id_case() {
        for (int i = id_throws[16]; i < ((List)this.id_class[id_byte[73]]).size() - id_protected[2]; ++i) {
            rrub_1 rrub_12;
            double d = this.id_class((rrub_1)((rruk_1)((List)this.id_class[rrud_1.id_byte[74]]).get((int)i)).id_class[id_byte[75]], (rrub_1)((rruk_1)((List)this.id_class[rrud_1.id_byte[76]]).get((int)(i - rrud_1.id_throws[17]))).id_class[id_byte[77]], (rrub_1)((rruk_1)((List)this.id_class[rrud_1.id_byte[78]]).get((int)(i + rrud_1.id_throws[18]))).id_class[id_byte[79]]);
            if (d < (double)(-((Float)this.id_class[id_byte[80]]).floatValue())) {
                rrub_1 rrub_13 = rrub_12 = this.id_class((rrub_1)((rruk_1)((List)this.id_class[rrud_1.id_byte[81]]).get((int)i)).id_class[id_byte[82]], (rrub_1)((rruk_1)((List)this.id_class[rrud_1.id_byte[83]]).get((int)(i - rrud_1.id_throws[19]))).id_class[id_byte[84]], -((Float)this.id_class[id_byte[85]]).floatValue() * id_break[16]);
                ((rruk_1)((List)this.id_class[rrud_1.id_byte[86]]).get((int)(i + rrud_1.id_throws[20]))).id_class[rrud_1.id_byte[87]] = rrub_13;
            }
            if (!(d > (double)((Float)this.id_class[id_byte[88]]).floatValue())) continue;
            rrub_1 rrub_14 = rrub_12 = this.id_class((rrub_1)((rruk_1)((List)this.id_class[rrud_1.id_byte[89]]).get((int)i)).id_class[id_byte[90]], (rrub_1)((rruk_1)((List)this.id_class[rrud_1.id_byte[91]]).get((int)(i - rrud_1.id_throws[21]))).id_class[id_byte[92]], ((Float)this.id_class[id_byte[93]]).floatValue() * id_break[17]);
            ((rruk_1)((List)this.id_class[rrud_1.id_byte[94]]).get((int)(i + rrud_1.id_throws[22]))).id_class[rrud_1.id_byte[95]] = rrub_14;
        }
    }

    private void id_implements() {
        boolean bl = id_throws[10];
        int n = id_throws[11];
        do {
            bl = id_throws[12];
            for (int i = id_throws[13]; i < ((List)this.id_class[id_byte[61]]).size(); ++i) {
                for (int j = i + id_throws[14]; j < ((List)this.id_class[id_byte[62]]).size(); ++j) {
                    rruk_1 rruk_12 = (rruk_1)((List)this.id_class[id_byte[63]]).get(i);
                    rruk_1 rruk_13 = (rruk_1)((List)this.id_class[id_byte[64]]).get(j);
                    rrub_1 rrub_12 = ((rrub_1)rruk_12.id_class[id_byte[65]]).id_byte().id_break((rrub_1)rruk_13.id_class[id_byte[66]]);
                    if (!((double)rrub_12.id_class() < id_case[0])) continue;
                    bl = id_throws[15];
                    ++n;
                    rrub_12.id_break();
                    rrub_1 rrub_13 = ((rrub_1)rruk_12.id_class[id_byte[67]]).id_byte().id_class((rrub_1)rruk_13.id_class[id_byte[68]]).id_byte(id_break[13]);
                    if (!((Boolean)rruk_12.id_class[id_byte[69]]).booleanValue()) {
                        rrub_1 rrub_14 = rrub_13.id_byte().id_class(rrub_12.id_byte().id_break(id_break[14]));
                        rruk_12.id_class[rrud_1.id_byte[70]] = rrub_14;
                    }
                    if (((Boolean)rruk_13.id_class[id_byte[71]]).booleanValue()) continue;
                    rrub_1 rrub_15 = rrub_13.id_byte().id_break(rrub_12.id_byte().id_break(id_break[15]));
                    rruk_13.id_class[rrud_1.id_byte[72]] = rrub_15;
                }
            }
        } while (bl && n < id_protected[1]);
    }

    private static void id_new() {
        id_protected = new byte[]{30, 32, 2, 7, 3, 4, 5, 6};
    }

    private static void id_package() {
        short[] sArray = new short[142];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 4;
        sArray[5] = 3;
        sArray[6] = 4;
        sArray[7] = 5;
        sArray[8] = 6;
        sArray[11] = 1;
        sArray[13] = 1;
        sArray[16] = 2;
        sArray[18] = 1;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[23] = 2;
        sArray[26] = 1;
        sArray[27] = 4;
        sArray[28] = 1;
        sArray[29] = 1;
        sArray[32] = 1;
        sArray[36] = 1;
        sArray[39] = 2;
        sArray[41] = 2;
        sArray[43] = 1;
        sArray[44] = 2;
        sArray[45] = 1;
        sArray[46] = 2;
        sArray[48] = 1;
        sArray[49] = 1;
        sArray[52] = 1;
        sArray[54] = 1;
        sArray[55] = 2;
        sArray[56] = 1;
        sArray[59] = 2;
        sArray[69] = 2;
        sArray[71] = 2;
        sArray[80] = 5;
        sArray[85] = 5;
        sArray[88] = 5;
        sArray[93] = 5;
        sArray[110] = 2;
        sArray[112] = 2;
        sArray[115] = 2;
        sArray[116] = 2;
        sArray[119] = 2;
        sArray[120] = 2;
        sArray[123] = 1;
        sArray[124] = 1;
        sArray[127] = 1;
        sArray[128] = 1;
        sArray[129] = 2;
        sArray[130] = 3;
        sArray[131] = 3;
        sArray[132] = 6;
        sArray[133] = 6;
        sArray[134] = 1;
        sArray[136] = 1;
        id_byte = sArray;
    }

    @Override
    public List<rruG> id_protected() {
        return (List)this.id_class[id_byte[141]];
    }

    private void id_private() {
        rruk_1 rruk_12 = (rruk_1)((List)this.id_class[id_byte[96]]).get(id_throws[23]);
        for (int i = id_throws[24]; i < ((List)this.id_class[id_byte[97]]).size(); ++i) {
            rruk_1 rruk_13 = (rruk_1)((List)this.id_class[id_byte[98]]).get(i);
            if (((Float)((rrub_1)rruk_13.id_class[rrud_1.id_byte[99]]).id_class[id_byte[100]]).floatValue() - ((Float)((rrub_1)rruk_12.id_class[rrud_1.id_byte[101]]).id_class[id_byte[102]]).floatValue() > id_break[18]) {
                Float f = Float.valueOf(((Float)((rrub_1)rruk_12.id_class[rrud_1.id_byte[104]]).id_class[id_byte[105]]).floatValue());
                ((rrub_1)rruk_13.id_class[rrud_1.id_byte[103]]).id_class[rrud_1.id_byte[106]] = f;
            }
            float f = (float)i / (float)((List)this.id_class[id_byte[107]]).size() * ((float)i / (float)((List)this.id_class[id_byte[108]]).size()) * id_break[19];
            float f2 = ((Float)((rrub_1)rruk_12.id_class[rrud_1.id_byte[109]]).id_class[id_byte[110]]).floatValue() - ((Float)((rrub_1)rruk_13.id_class[rrud_1.id_byte[111]]).id_class[id_byte[112]]).floatValue();
            if (f2 > f) {
                Float f3 = Float.valueOf(((Float)((rrub_1)rruk_12.id_class[rrud_1.id_byte[114]]).id_class[id_byte[115]]).floatValue() - f);
                ((rrub_1)rruk_13.id_class[rrud_1.id_byte[113]]).id_class[rrud_1.id_byte[116]] = f3;
            }
            if (!(f2 < -f)) continue;
            Float f4 = Float.valueOf(((Float)((rrub_1)rruk_12.id_class[rrud_1.id_byte[118]]).id_class[id_byte[119]]).floatValue() + f);
            ((rrub_1)rruk_13.id_class[rrud_1.id_byte[117]]).id_class[rrud_1.id_byte[120]] = f4;
        }
    }

    private void id_final() {
        for (int i = id_throws[7]; i < (Integer)this.id_class[id_byte[27]]; ++i) {
            for (int j = ((List)this.id_class[id_byte[28]]).size() - id_throws[8]; j >= 0; --j) {
                rruW rruW2 = (rruW)((List)this.id_class[id_byte[29]]).get(j);
                rrub_1 rrub_12 = ((rrub_1)((rruk_1)rruW2.id_class[rrud_1.id_byte[30]]).id_class[id_byte[31]]).id_byte().id_class((rrub_1)((rruk_1)rruW2.id_class[rrud_1.id_byte[32]]).id_class[id_byte[33]]).id_byte(id_break[10]);
                rrub_1 rrub_13 = ((rrub_1)((rruk_1)rruW2.id_class[rrud_1.id_byte[34]]).id_class[id_byte[35]]).id_byte().id_break((rrub_1)((rruk_1)rruW2.id_class[rrud_1.id_byte[36]]).id_class[id_byte[37]]).id_break();
                if (!((Boolean)((rruk_1)rruW2.id_class[rrud_1.id_byte[38]]).id_class[id_byte[39]]).booleanValue()) {
                    rrub_1 rrub_14 = rrub_12.id_byte().id_class(rrub_13.id_byte().id_break(((Float)rruW2.id_class[id_byte[41]]).floatValue() / id_break[11]));
                    ((rruk_1)rruW2.id_class[rrud_1.id_byte[40]]).id_class[rrud_1.id_byte[42]] = rrub_14;
                }
                if (((Boolean)((rruk_1)rruW2.id_class[rrud_1.id_byte[43]]).id_class[id_byte[44]]).booleanValue()) continue;
                rrub_1 rrub_15 = rrub_12.id_byte().id_break(rrub_13.id_byte().id_break(((Float)rruW2.id_class[id_byte[46]]).floatValue() / id_break[12]));
                ((rruk_1)rruW2.id_class[rrud_1.id_byte[45]]).id_class[rrud_1.id_byte[47]] = rrub_15;
            }
        }
    }

    private static void id_volatile() {
        id_case = new double[]{0.99, 180.0, Math.PI};
    }

    private void id_native() {
        for (int i = id_throws[9]; i < ((List)this.id_class[id_byte[48]]).size(); ++i) {
            rruW rruW2 = (rruW)((List)this.id_class[id_byte[49]]).get(i);
            rrub_1 rrub_12 = ((rrub_1)((rruk_1)rruW2.id_class[rrud_1.id_byte[50]]).id_class[id_byte[51]]).id_byte().id_break((rrub_1)((rruk_1)rruW2.id_class[rrud_1.id_byte[52]]).id_class[id_byte[53]]).id_break();
            if (((Boolean)((rruk_1)rruW2.id_class[rrud_1.id_byte[54]]).id_class[id_byte[55]]).booleanValue()) continue;
            rrub_1 rrub_13 = ((rrub_1)((rruk_1)rruW2.id_class[rrud_1.id_byte[57]]).id_class[id_byte[58]]).id_byte().id_break(rrub_12.id_break(((Float)rruW2.id_class[id_byte[59]]).floatValue()));
            ((rruk_1)rruW2.id_class[rrud_1.id_byte[56]]).id_class[rrud_1.id_byte[60]] = rrub_13;
        }
    }
}

