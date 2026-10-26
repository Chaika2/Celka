/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.EZ;
import celestial.GW;
import celestial.Ja_1;
import celestial.ba_3;
import celestial.bw_3;
import celestial.rja_3;
import celestial.rq_3;
import celestial.xc_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gm_1
extends EZ {
    public Object[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_throws;
    private static double[] id_case;
    private static byte[] id_catch;

    public xc_3 id_byte(int n, int n2, int n3, xc_3 xc_32) {
        this.id_protected();
        if (((rq_3)this.id_byte[id_protected[13]]).id_class(n - (Integer)this.id_byte[id_protected[14]], n2 - (Integer)this.id_byte[id_protected[15]], n3 - (Integer)this.id_byte[id_protected[16]], xc_32)) {
            return ((rq_3)this.id_byte[id_protected[17]]).id_class(n - (Integer)this.id_byte[id_protected[18]], n2 - (Integer)this.id_byte[id_protected[19]], n3 - (Integer)this.id_byte[id_protected[20]], xc_32, (List)((GW)this.id_byte[Gm_1.id_protected[21]]).id_break[id_protected[22]]);
        }
        return null;
    }

    private static void id_byte() {
        id_catch = new byte[]{9, 6, 2, 3, 4};
    }

    public Gm_1(GW gW) {
        super(GW.id_class(gW), id_throws[0]);
        List<xc_3> list;
        this.id_protected();
        GW gW2 = gW;
        this.id_byte[Gm_1.id_protected[0]] = gW2;
        this.id_byte[Gm_1.id_protected[1]] = list = gW.id_break(id_catch[0]);
        rq_3 rq_32 = (rq_3)gW.id_break[id_protected[2]];
        this.id_byte[Gm_1.id_protected[3]] = rq_32;
        Integer n = ((rja_3)gW.id_break[id_protected[4]]).b_();
        this.id_byte[Gm_1.id_protected[5]] = n;
        Integer n2 = ((rja_3)gW.id_break[id_protected[6]]).c_();
        this.id_byte[Gm_1.id_protected[7]] = n2;
        Integer n3 = ((rja_3)gW.id_break[id_protected[8]]).d_();
        this.id_byte[Gm_1.id_protected[9]] = n3;
        Gm_1 gm_1 = this;
        Double d = (Double)gm_1.id_break[id_protected[10]] + id_case[0];
        gm_1.id_break[Gm_1.id_protected[11]] = d;
        Double d2 = id_case[1];
        this.id_break[Gm_1.id_protected[12]] = d2;
    }

    static {
        Gm_1.ntfClinit();
    }

    @Override
    public double id_class(int n, int n2, int n3, xc_3 xc_32) {
        this.id_protected();
        if (this.id_byte(n, n2, n3) || !((ba_3)this.id_break[id_protected[23]]).id_class(n, n3)) {
            return id_case[2];
        }
        xc_3 xc_33 = this.id_byte(n, n2, n3, xc_32);
        if (xc_33 != null && !((List)C_class.id_instanceof().S.id_class[id_protected[24]]).contains(xc_33.id_break())) {
            if (xc_33.id_break() instanceof Ja_1) {
                return (Double)this.id_break[id_protected[25]] * (Double)C_class.id_instanceof().id_byte.id_class[id_protected[26]];
            }
            if (((List)this.id_byte[id_protected[27]]).contains(xc_33)) {
                return id_case[3];
            }
            if (!((Boolean)this.id_break[id_protected[28]]).booleanValue()) {
                return id_case[4];
            }
            return (Double)this.id_break[id_protected[29]] * id_case[5] * (Double)C_class.id_instanceof().id_byte.id_class[id_protected[30]];
        }
        if (((Boolean)this.id_break[id_protected[31]]).booleanValue()) {
            return (Double)this.id_break[id_protected[32]];
        }
        return id_case[6];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7680BD0BA667543DL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2D564521;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-59, -43, 80, 63, 5, -17, 84, -52}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public double id_break(int n, int n2, int n3, xc_3 xc_32) {
        this.id_protected();
        if (!((Boolean)this.id_break[id_protected[33]]).booleanValue() && !((List)this.id_break[id_protected[34]]).contains(xc_32.id_break()) || this.id_byte(n, n2, n3)) {
            return id_case[7];
        }
        xc_3 xc_33 = this.id_byte(n, n2, n3, xc_32);
        if (xc_33 != null && !((List)C_class.id_instanceof().S.id_class[id_protected[35]]).contains(xc_33.id_break())) {
            if (xc_33.id_break() == xu_3.id_class) {
                return id_case[8];
            }
            if (((GW)this.id_byte[id_protected[36]]).id_class(((bw_3)this.id_break[id_protected[37]]).id_class(n, n2, n3), xc_33, id_throws[1])) {
                return (Double)C_class.id_instanceof().h.id_class[id_protected[38]];
            }
            return id_case[9];
        }
        return id_case[10];
    }

    private static void id_throws() {
        short[] sArray = new short[39];
        sArray[0] = 5;
        sArray[2] = 4;
        sArray[3] = 1;
        sArray[4] = 5;
        sArray[5] = 2;
        sArray[6] = 5;
        sArray[7] = 3;
        sArray[8] = 5;
        sArray[9] = 4;
        sArray[10] = 26;
        sArray[11] = 26;
        sArray[12] = 25;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 3;
        sArray[16] = 4;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[19] = 3;
        sArray[20] = 4;
        sArray[21] = 5;
        sArray[22] = 10;
        sArray[23] = 28;
        sArray[25] = 9;
        sArray[28] = 7;
        sArray[29] = 9;
        sArray[31] = 7;
        sArray[32] = 9;
        sArray[33] = 10;
        sArray[34] = 11;
        sArray[36] = 5;
        sArray[37] = 4;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Gm_1.id_case();
        Gm_1.id_throws();
        Gm_1.id_catch();
        Gm_1.id_byte();
    }

    private static void id_catch() {
        double[] dArray = new double[11];
        dArray[0] = 10.0;
        dArray[1] = 1.0;
        dArray[2] = 1000000.0;
        dArray[4] = 1000000.0;
        dArray[5] = 1.5;
        dArray[6] = 1000000.0;
        dArray[7] = 1000000.0;
        dArray[8] = 1.0;
        dArray[9] = 1.0;
        dArray[10] = 1.0;
        id_case = dArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        id_throws = blArray;
    }

    private void id_protected() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_catch[1]];
            objectArray[Gm_1.id_catch[2]] = id_throws[2];
            objectArray[Gm_1.id_catch[3]] = id_throws[3];
            objectArray[Gm_1.id_catch[4]] = id_throws[4];
        }
    }
}

