/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rrQK;
import celestial.rrfD_2;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFL {
    public static Object[] id_class;
    private static boolean[] id_byte;
    private static float[] id_protected;
    private static byte[] id_throws;
    private static short[] id_case;
    public Object[] id_break;

    public boolean id_byte() {
        return (Boolean)this.id_break[id_case[27]];
    }

    public rrFL(float f, float f2, float f3) {
        this.id_implements();
        rdn_3 rdn_32 = rdn_3.id_break;
        this.id_break[rrFL.id_case[0]] = rdn_32;
        rdn_3 rdn_33 = rdn_3.id_break;
        this.id_break[rrFL.id_case[1]] = rdn_33;
        Boolean bl = id_byte[0];
        this.id_break[rrFL.id_case[2]] = bl;
        Boolean bl2 = id_byte[1];
        this.id_break[rrFL.id_case[3]] = bl2;
        AnimValue animValue = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_case[4]]), f, id_byte[2]).id_package();
        this.id_break[rrFL.id_case[5]] = animValue;
        AnimValue animValue2 = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_case[6]]), f2, id_byte[3]);
        this.id_break[rrFL.id_case[7]] = animValue2;
        AnimValue animValue3 = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_case[8]]), f3, id_byte[4]);
        this.id_break[rrFL.id_case[9]] = animValue3;
    }

    static {
        rrFL.ntfClinit();
    }

    public void id_class(rdn_3 rdn_32) {
        if (!rdn_3.id_byte(rdn_32, (rdn_3)this.id_break[id_case[12]])) {
            if (!rdn_32.id_class() && !((rdn_3)this.id_break[id_case[13]]).id_class()) {
                ((AnimValue)this.id_break[id_case[14]]).id_extends();
            }
            rdn_3 rdn_33 = rdn_32.id_implements();
            this.id_break[rrFL.id_case[15]] = rdn_33;
        }
        ((AnimValue)this.id_break[id_case[16]]).id_class(!rdn_32.id_class() ? id_byte[6] : id_byte[7]);
        if (!rdn_32.id_class()) {
            rdn_3 rdn_34 = rdn_32;
            this.id_break[rrFL.id_case[17]] = rdn_34;
            Boolean bl = id_byte[8];
            this.id_break[rrFL.id_case[18]] = bl;
        } else if (((AnimValue)this.id_break[id_case[19]]).id_byte() < id_protected[0]) {
            Boolean bl = id_byte[9];
            this.id_break[rrFL.id_case[20]] = bl;
            Boolean bl2 = id_byte[10];
            this.id_break[rrFL.id_case[21]] = bl2;
        }
        ((AnimValue)this.id_break[id_case[22]]).id_class(id_byte[11]);
    }

    public void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5) {
        float f6 = ((AnimValue)this.id_break[id_case[30]]).id_byte();
        if (f6 <= id_protected[1] || ((rdn_3)this.id_break[id_case[31]]).id_class()) {
            return;
        }
        float f7 = rfU_2.id_class(f3 * f6, id_protected[2], id_protected[3]);
        if (f7 <= id_protected[4]) {
            return;
        }
        float f8 = id_protected[5] + id_protected[6] * ((AnimValue)this.id_break[id_case[32]]).id_byte();
        float f9 = f4 * (id_protected[7] - f8) / id_protected[8];
        float f10 = (id_protected[9] - f6) * id_protected[10];
        rrfD_2.id_class(ml_1, (rdn_3)this.id_break[id_case[33]], f + f9, f2 + f9 + f10, f7, f8 * f5, id_protected[11], id_protected[12], (int)id_throws[0], id_byte[13], id_byte[14]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x11FADC23;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{92, 99, 89, 56, -60, -52, 46, -23}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(float f) {
        if (!((Boolean)this.id_break[id_case[23]]).booleanValue()) {
            ((AnimValue)this.id_break[id_case[24]]).id_class(f);
            Boolean bl = id_byte[12];
            this.id_break[rrFL.id_case[25]] = bl;
        }
        ((AnimValue)this.id_break[id_case[26]]).id_break(f);
    }

    public float id_class() {
        return ((AnimValue)this.id_break[id_case[28]]).id_byte();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8F6978642E04F1EBL;
    }

    public void id_break() {
        ((AnimValue)this.id_break[id_case[10]]).id_package();
        Boolean bl = id_byte[5];
        this.id_break[rrFL.id_case[11]] = bl;
    }

    private static void id_throws() {
        short[] sArray = new short[34];
        sArray[0] = 3;
        sArray[1] = 4;
        sArray[2] = 5;
        sArray[3] = 6;
        sArray[7] = 1;
        sArray[9] = 2;
        sArray[11] = 6;
        sArray[12] = 3;
        sArray[13] = 3;
        sArray[14] = 1;
        sArray[15] = 3;
        sArray[17] = 4;
        sArray[18] = 5;
        sArray[20] = 5;
        sArray[21] = 6;
        sArray[22] = 1;
        sArray[23] = 6;
        sArray[24] = 2;
        sArray[25] = 6;
        sArray[26] = 2;
        sArray[27] = 5;
        sArray[28] = 2;
        sArray[31] = 4;
        sArray[32] = 1;
        sArray[33] = 4;
        id_case = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFL.id_private();
        rrFL.id_throws();
        rrFL.id_catch();
        rrFL.id_case();
        rrFL.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{Float.valueOf(-1.0842022E-19f), Float.valueOf(-1.0842022E-19f), Float.valueOf(0.0f)};
        id_class = objectArray;
    }

    private static void id_catch() {
        float[] fArray = new float[16];
        fArray[0] = 0.05f;
        fArray[1] = 0.001f;
        fArray[3] = 1.0f;
        fArray[4] = 0.001f;
        fArray[5] = 0.1f;
        fArray[6] = 0.9f;
        fArray[7] = 1.0f;
        fArray[8] = 2.0f;
        fArray[9] = 1.0f;
        fArray[10] = 5.0f;
        fArray[11] = 2.0f;
        fArray[12] = 13.0f;
        fArray[13] = 0.05f;
        fArray[14] = 0.1f;
        fArray[15] = 5.0f;
        id_protected = fArray;
    }

    private static void id_case() {
        id_throws = new byte[]{13, 7, 5, 6, 3, 2};
    }

    private void id_implements() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[1]];
            objectArray[rrFL.id_throws[2]] = id_byte[15];
            objectArray[rrFL.id_throws[3]] = id_byte[16];
        }
    }

    public float id_protected() {
        return ((AnimValue)this.id_break[id_case[29]]).id_byte();
    }

    private static void id_private() {
        boolean[] blArray = new boolean[19];
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[18] = true;
        id_byte = blArray;
    }
}

