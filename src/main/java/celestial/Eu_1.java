/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EQ;
import celestial.Ec_1;
import celestial.Em_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Eu_1
implements Ec_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;

    @Override
    public boolean id_byte() {
        return (Em_1)this.id_class[id_break[1]] == null ? id_byte[0] : id_byte[1];
    }

    public Eu_1() {
        this.id_class();
        Object var5_1 = null;
        this.id_class[Eu_1.id_break[0]] = var5_1;
    }

    static {
        Eu_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAF42E4D862F581F2L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF1E36B23;
    }

    @Override
    public void id_class(EQ eQ) {
        Em_1 em_1 = new Em_1();
        EQ eQ2 = eQ;
        em_1.id_class[Eu_1.id_break[2]] = eQ2;
        Em_1 em_12 = (Em_1)this.id_class[id_break[3]];
        em_1.id_class[Eu_1.id_break[4]] = em_12;
        Em_1 em_13 = em_1;
        this.id_class[Eu_1.id_break[5]] = em_13;
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[2]];
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-21, -50, 1, -125, 9, -44, -126, 50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(EQ eQ) {
    }

    @Override
    public EQ id_break() {
        if ((Em_1)this.id_class[id_break[6]] == null) {
            return null;
        }
        Em_1 em_1 = (Em_1)((Em_1)this.id_class[Eu_1.id_break[7]]).id_class[id_break[8]];
        if (em_1 == null) {
            Em_1 em_12 = (Em_1)this.id_class[id_break[9]];
            Object var13_4 = null;
            this.id_class[Eu_1.id_break[10]] = var13_4;
            return (EQ)em_12.id_class[id_break[11]];
        }
        Em_1 em_13 = (Em_1)this.id_class[id_break[12]];
        double d = (Double)((EQ)((Em_1)this.id_class[Eu_1.id_break[13]]).id_class[Eu_1.id_break[14]]).id_class[id_break[15]];
        Em_1 em_14 = (Em_1)this.id_class[id_break[16]];
        Em_1 em_15 = null;
        while (em_1 != null) {
            double d2 = (Double)((EQ)em_1.id_class[Eu_1.id_break[17]]).id_class[id_break[18]];
            if (d2 < d) {
                d = d2;
                em_14 = em_1;
                em_15 = em_13;
            }
            em_13 = em_1;
            em_1 = (Em_1)em_1.id_class[id_break[19]];
        }
        if (em_15 == null) {
            Em_1 em_16 = (Em_1)((Em_1)this.id_class[Eu_1.id_break[20]]).id_class[id_break[21]];
            this.id_class[Eu_1.id_break[22]] = em_16;
            Object var15_10 = null;
            em_14.id_class[Eu_1.id_break[23]] = var15_10;
            return (EQ)em_14.id_class[id_break[24]];
        }
        Em_1 em_17 = (Em_1)em_14.id_class[id_break[25]];
        em_15.id_class[Eu_1.id_break[26]] = em_17;
        Object var17_12 = null;
        em_14.id_class[Eu_1.id_break[27]] = var17_12;
        return (EQ)em_14.id_class[id_break[28]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Eu_1.id_throws();
        Eu_1.id_protected();
    }

    private static void id_protected() {
        short[] sArray = new short[29];
        sArray[2] = 1;
        sArray[11] = 1;
        sArray[14] = 1;
        sArray[15] = 5;
        sArray[17] = 1;
        sArray[18] = 5;
        sArray[24] = 1;
        sArray[28] = 1;
        id_break = sArray;
    }
}

