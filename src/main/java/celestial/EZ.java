/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.GJ;
import celestial.SR;
import celestial.bU_2;
import celestial.ba_3;
import celestial.bw_3;
import celestial.cb_3;
import celestial.eA_2;
import celestial.eY_2;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhz_3;
import celestial.xc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EZ {
    private static boolean[] id_byte;
    public static Object[] id_class;
    public Object[] id_break;
    private static short[] id_protected;
    private static byte[] id_throws;
    private static double[] id_case;
    private static float[] id_catch;

    public boolean id_byte(int n, int n2, int n3) {
        return id_byte[7];
    }

    private static void id_byte() {
        double[] dArray = new double[14];
        dArray[0] = 9.09090909090909;
        dArray[1] = 4.63284688441047;
        dArray[2] = 1000000.0;
        dArray[3] = 1000000.0;
        dArray[4] = 1000000.0;
        dArray[5] = 1000000.0;
        dArray[6] = 1000000.0;
        dArray[7] = 1.0;
        id_case = dArray;
    }

    public EZ(C_case c_case) {
        this(c_case, id_byte[0]);
    }

    public EZ(C_case c_case, boolean bl) {
        ArrayList arrayList;
        this.id_implements();
        GJ gJ = new GJ();
        this.id_break[EZ.id_protected[0]] = gJ;
        Boolean bl2 = bl;
        this.id_break[EZ.id_protected[1]] = bl2;
        C_case c_case2 = c_case;
        this.id_break[EZ.id_protected[2]] = c_case2;
        cb_3 cb_32 = c_case.id_throw().id_catch();
        rYB rYB2 = c_case.id_throw().id_case();
        this.id_break[EZ.id_protected[3]] = rYB2;
        SR sR = (SR)c_case.id_implements().id_class();
        this.id_break[EZ.id_protected[4]] = sR;
        bw_3 bw_32 = new bw_3((rYB)this.id_break[id_protected[5]], (SR)this.id_break[id_protected[6]], bl);
        this.id_break[EZ.id_protected[7]] = bw_32;
        bU_2 bU_22 = new bU_2(cb_32);
        this.id_break[EZ.id_protected[8]] = bU_22;
        Boolean bl3 = C_class.id_instanceof().id_byte() && ((C_class)c_case).id_static().id_class() ? id_byte[1] : id_byte[2];
        this.id_break[EZ.id_protected[9]] = bl3;
        Boolean bl4 = (Boolean)C_class.id_instanceof().rJ.id_class[id_protected[10]] != false && rhz_3.id_break(((rhz_3)cb_32.id_implements[id_protected[11]]).id_break((rdn_3)id_class[id_protected[12]])) && ((rYB)this.id_break[id_protected[13]]).E() != rYB.id_protected ? id_byte[3] : id_byte[4];
        this.id_break[EZ.id_protected[14]] = bl4;
        Boolean bl5 = (Boolean)C_class.id_instanceof().Pc.id_class[id_protected[15]] != false && cb_32.sk().id_class() > id_throws[0] ? id_byte[5] : id_byte[6];
        this.id_break[EZ.id_protected[16]] = bl5;
        Double d = (double)((Double)C_class.id_instanceof().Pe.id_class[id_protected[17]]);
        this.id_break[EZ.id_protected[18]] = d;
        Boolean bl6 = C_class.id_instanceof().id_throws();
        this.id_break[EZ.id_protected[19]] = bl6;
        this.id_break[EZ.id_protected[21]] = arrayList = new ArrayList((Collection)C_class.id_instanceof().I.id_class[id_protected[20]]);
        Boolean bl7 = (boolean)((Boolean)C_class.id_instanceof().id_double.id_class[id_protected[22]]);
        this.id_break[EZ.id_protected[23]] = bl7;
        Boolean bl8 = C_class.id_instanceof().id_class();
        this.id_break[EZ.id_protected[24]] = bl8;
        Boolean bl9 = (boolean)((Boolean)C_class.id_instanceof().o.id_class[id_protected[25]]);
        this.id_break[EZ.id_protected[26]] = bl9;
        Boolean bl10 = (boolean)((Boolean)C_class.id_instanceof().id_else.id_class[id_protected[27]]);
        this.id_break[EZ.id_protected[28]] = bl10;
        Boolean bl11 = (boolean)((Boolean)C_class.id_instanceof().rZ.id_class[id_protected[29]]);
        this.id_break[EZ.id_protected[30]] = bl11;
        Integer n = eA_2.id_class(eY_2.id_finally, c_case.id_throw().id_catch());
        this.id_break[EZ.id_protected[31]] = n;
        Boolean bl12 = (boolean)((Boolean)C_class.id_instanceof().Y.id_class[id_protected[32]]);
        this.id_break[EZ.id_protected[33]] = bl12;
        Boolean bl13 = (boolean)((Boolean)C_class.id_instanceof().rA.id_class[id_protected[34]]);
        this.id_break[EZ.id_protected[35]] = bl13;
        Boolean bl14 = (boolean)((Boolean)C_class.id_instanceof().PR.id_class[id_protected[36]]);
        this.id_break[EZ.id_protected[37]] = bl14;
        Integer n2 = (int)((Integer)C_class.id_instanceof().rb.id_class[id_protected[38]]);
        this.id_break[EZ.id_protected[39]] = n2;
        Integer n3 = (int)((Integer)C_class.id_instanceof().id_extends.id_class[id_protected[40]]);
        this.id_break[EZ.id_protected[41]] = n3;
        int n4 = eA_2.id_throws(cb_32);
        if (n4 > id_throws[1]) {
            n4 = id_throws[2];
        }
        float f = (float)n4 / id_catch[0];
        Double d2 = id_case[0] * (double)(id_catch[1] - f) + id_case[1] * (double)f;
        this.id_break[EZ.id_protected[42]] = d2;
        Double d3 = (double)((Double)C_class.id_instanceof().rs.id_class[id_protected[43]]);
        this.id_break[EZ.id_protected[44]] = d3;
        Double d4 = (double)((Double)C_class.id_instanceof().rm.id_class[id_protected[45]]);
        this.id_break[EZ.id_protected[46]] = d4;
        Double d5 = (double)((Double)C_class.id_instanceof().Pz.id_class[id_protected[47]]);
        this.id_break[EZ.id_protected[48]] = d5;
        Double d6 = (double)((Double)C_class.id_instanceof().id_int.id_class[id_protected[49]]);
        this.id_break[EZ.id_protected[50]] = d6;
        ba_3 ba_32 = new ba_3(((rYB)this.id_break[id_protected[51]]).id_instanceof());
        this.id_break[EZ.id_protected[52]] = ba_32;
    }

    static {
        EZ.ntfClinit();
    }

    public xc_3 id_class(rfH_2 rfH_22) {
        return this.id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public boolean id_class(int n, int n2) {
        return ((bw_3)this.id_break[id_protected[55]]).id_break(n, n2);
    }

    public double id_class(int n, int n2, int n3, xc_3 xc_32) {
        if (!((Boolean)this.id_break[id_protected[56]]).booleanValue()) {
            return id_case[2];
        }
        if (this.id_byte(n, n2, n3)) {
            return id_case[3];
        }
        if (!((ba_3)this.id_break[id_protected[57]]).id_class(n, n3)) {
            return id_case[4];
        }
        return (Double)this.id_break[id_protected[58]];
    }

    public double id_class() {
        return (Double)this.id_break[id_protected[61]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-80, 34, 110, 37, 41, -79, -9, -113}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2B89A81B;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBD31E2161C6FEBB3L;
    }

    public xc_3 id_class(int n, int n2, int n3) {
        return ((bw_3)this.id_break[id_protected[54]]).id_class(n, n2, n3);
    }

    public C_case id_break() {
        return (C_case)this.id_break[id_protected[53]];
    }

    public double id_break(int n, int n2, int n3, xc_3 xc_32) {
        if (!((Boolean)this.id_break[id_protected[59]]).booleanValue() && !((List)this.id_break[id_protected[60]]).contains(xc_32.id_break())) {
            return id_case[5];
        }
        if (this.id_byte(n, n2, n3)) {
            return id_case[6];
        }
        return id_case[7];
    }

    public xd_3 id_break(int n, int n2, int n3) {
        return this.id_class(n, n2, n3).id_break();
    }

    private static void id_throws() {
        short[] sArray = new short[62];
        sArray[0] = 29;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        sArray[8] = 5;
        sArray[9] = 7;
        sArray[11] = 1;
        sArray[13] = 2;
        sArray[14] = 6;
        sArray[16] = 8;
        sArray[18] = 9;
        sArray[19] = 10;
        sArray[21] = 11;
        sArray[23] = 12;
        sArray[24] = 13;
        sArray[26] = 14;
        sArray[28] = 15;
        sArray[30] = 16;
        sArray[31] = 17;
        sArray[33] = 18;
        sArray[35] = 19;
        sArray[37] = 20;
        sArray[39] = 21;
        sArray[41] = 22;
        sArray[42] = 23;
        sArray[44] = 24;
        sArray[46] = 25;
        sArray[48] = 26;
        sArray[50] = 27;
        sArray[51] = 2;
        sArray[52] = 28;
        sArray[53] = 1;
        sArray[54] = 4;
        sArray[55] = 4;
        sArray[56] = 7;
        sArray[57] = 28;
        sArray[58] = 9;
        sArray[59] = 10;
        sArray[60] = 11;
        sArray[61] = 9;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        EZ.id_protected();
        EZ.id_throws();
        EZ.id_catch();
        EZ.id_byte();
        EZ.id_private();
        EZ.id_case();
    }

    private static void id_catch() {
        id_catch = new float[]{3.0f, 1.0f};
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rdn_3(rdy_3.hR, 1)};
        id_class = objectArray;
    }

    private void id_implements() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[3]];
            objectArray[EZ.id_byte[9]] = id_byte[10];
            objectArray[EZ.id_throws[4]] = id_byte[11];
            objectArray[EZ.id_throws[5]] = id_byte[12];
            objectArray[EZ.id_throws[6]] = id_byte[13];
            objectArray[EZ.id_throws[7]] = id_case[8];
            objectArray[EZ.id_throws[8]] = id_byte[14];
            objectArray[EZ.id_throws[9]] = id_byte[15];
            objectArray[EZ.id_throws[10]] = id_byte[16];
            objectArray[EZ.id_throws[11]] = id_byte[17];
            objectArray[EZ.id_throws[12]] = id_byte[18];
            objectArray[EZ.id_throws[13]] = id_byte[19];
            objectArray[EZ.id_throws[14]] = id_byte[20];
            objectArray[EZ.id_throws[15]] = id_byte[21];
            objectArray[EZ.id_throws[16]] = id_byte[22];
            objectArray[EZ.id_throws[17]] = id_byte[23];
            objectArray[EZ.id_throws[18]] = id_byte[24];
            objectArray[EZ.id_throws[19]] = id_byte[25];
            objectArray[EZ.id_throws[20]] = id_case[9];
            objectArray[EZ.id_throws[21]] = id_case[10];
            objectArray[EZ.id_throws[22]] = id_case[11];
            objectArray[EZ.id_throws[23]] = id_case[12];
            objectArray[EZ.id_throws[24]] = id_case[13];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[27];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[26] = true;
        id_byte = blArray;
    }

    private static void id_private() {
        id_throws = new byte[]{6, 3, 3, 30, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
    }
}

