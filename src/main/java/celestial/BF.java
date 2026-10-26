/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Pv_1;
import celestial.rFp_1;
import celestial.rfU_2;
import celestial.rql_3;
import celestial.y_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BF
extends Pv_1 {
    private static byte[] id_byte;
    private static short[] id_protected;
    private static String[] id_throws;
    private static long[] id_case;
    private static float[] id_catch;
    private static boolean[] id_private;
    public Object[] id_break;

    public String id_byte() {
        this.id_throws();
        return (String)this.id_break[id_protected[21]];
    }

    public BF(C_class c_class) {
        super(c_class);
        this.id_throws();
        float[] fArray = new float[id_byte[0]];
        this.id_break[BF.id_protected[0]] = fArray;
        Long l = id_case[0];
        this.id_break[BF.id_protected[1]] = l;
        String string = id_throws[0];
        this.id_break[BF.id_protected[2]] = string;
        Float f = Float.valueOf(id_catch[0]);
        this.id_break[BF.id_protected[3]] = f;
    }

    static {
        BF.ntfClinit();
    }

    @Override
    public void id_class(y_1 y_12) {
        this.id_throws();
        if (y_12.id_protected() instanceof rFp_1) {
            if ((Long)this.id_break[id_protected[4]] != id_case[1]) {
                float f = (float)(System.currentTimeMillis() - (Long)this.id_break[id_protected[5]]) / id_catch[1];
                ((float[])this.id_break[BF.id_protected[6]])[((Integer)this.id_break[BF.id_protected[7]]).intValue() % ((float[])this.id_break[BF.id_protected[8]]).length] = rfU_2.id_class(id_catch[2] / f, id_catch[3], id_catch[4]);
                BF bF = this;
                Integer n = (Integer)bF.id_break[id_protected[9]] + id_private[0];
                bF.id_break[BF.id_protected[10]] = n;
            }
            Long l = System.currentTimeMillis();
            this.id_break[BF.id_protected[11]] = l;
            Float f = Float.valueOf(this.id_protected());
            this.id_break[BF.id_protected[12]] = f;
            if (((Float)this.id_break[id_protected[13]]).floatValue() <= id_catch[5] || Float.isNaN(((Float)this.id_break[id_protected[14]]).floatValue())) {
                String string = id_throws[1];
                this.id_break[BF.id_protected[15]] = string;
            } else {
                String string = rql_3.id_class(((Float)this.id_break[id_protected[16]]).floatValue());
                this.id_break[BF.id_protected[17]] = string;
            }
        }
    }

    public float id_class() {
        this.id_throws();
        return id_catch[12] / ((Float)this.id_break[id_protected[19]]).floatValue();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBBC2B7F5133E1EEFL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4258BE3C;
    }

    public float id_break() {
        this.id_throws();
        return ((Float)this.id_break[id_protected[20]]).floatValue();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{93, -95, -100, 80, -106, 81, 102, -7}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[1]];
            objectArray[BF.id_private[2]] = id_case[2];
            objectArray[BF.id_byte[2]] = id_private[3];
            objectArray[BF.id_byte[3]] = Float.valueOf(id_catch[13]);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        BF.id_extends();
        BF.id_private();
        BF.id_case();
        BF.id_implements();
        BF.id_catch();
        BF.id_finally();
    }

    private static void id_finally() {
        id_byte = new byte[]{20, 5, 2, 4};
    }

    private static void id_catch() {
        float[] fArray = new float[14];
        fArray[0] = 20.0f;
        fArray[1] = 1000.0f;
        fArray[2] = 20.0f;
        fArray[4] = 20.0f;
        fArray[9] = 1.0f;
        fArray[11] = 20.0f;
        fArray[12] = 20.0f;
        id_catch = fArray;
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_private = blArray;
    }

    private static void id_case() {
        long[] lArray = new long[3];
        lArray[0] = -1L;
        lArray[1] = -1L;
        id_case = lArray;
    }

    private static void id_implements() {
        short[] sArray = new short[22];
        sArray[1] = 1;
        sArray[2] = 3;
        sArray[3] = 4;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[7] = 2;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 1;
        sArray[12] = 4;
        sArray[13] = 4;
        sArray[14] = 4;
        sArray[15] = 3;
        sArray[16] = 4;
        sArray[17] = 3;
        sArray[19] = 4;
        sArray[20] = 4;
        sArray[21] = 3;
        id_protected = sArray;
    }

    private float id_protected() {
        this.id_throws();
        float f = id_catch[6];
        float f2 = id_catch[7];
        float[] fArray = (float[])this.id_break[id_protected[18]];
        int n = fArray.length;
        for (int i = id_private[1]; i < n; ++i) {
            float f3 = fArray[i];
            if (!(f3 > id_catch[8])) continue;
            f2 += f3;
            f += id_catch[9];
        }
        return rfU_2.id_class(f2 / f, id_catch[10], id_catch[11]);
    }

    private static void id_private() {
        id_throws = new String[]{new String("20.0"), new String("0.0")};
    }
}

