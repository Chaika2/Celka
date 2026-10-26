/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rI_2;
import celestial.ra_3;
import celestial.rq_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rf_3
extends rI_2 {
    private static byte[] id_protected;
    private static boolean[] id_throws;
    public Object[] id_byte;
    private static short[] id_case;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-84, -27, 14, -94, 124, -69, -92, -3}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rf_3(rq_3 rq_32, ra_3 ra_32) {
        super(rq_32);
        Boolean[][][] booleanArray;
        this.id_case();
        ra_3 ra_33 = ra_32;
        this.id_byte[rf_3.id_case[0]] = ra_33;
        this.id_byte[rf_3.id_case[1]] = booleanArray = new Boolean[this.id_break()][this.id_class()][this.id_byte()];
    }

    static {
        rf_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFBF5D75F;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE56968A3DF314043L;
    }

    @Override
    public boolean id_break(int n, int n2, int n3, xc_3 xc_32) {
        this.id_case();
        if (((Boolean[][][])this.id_byte[id_case[6]])[n][n2][n3] == null) {
            ((Boolean[][][])this.id_byte[rf_3.id_case[7]])[n][n2][n3] = ((ra_3)this.id_byte[id_case[8]]).id_class(xc_32);
        }
        return ((Boolean[][][])this.id_byte[id_case[9]])[n][n2][n3];
    }

    private static void id_throws() {
        short[] sArray = new short[10];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        id_case = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rf_3.id_private();
        rf_3.id_throws();
        rf_3.id_catch();
    }

    private static void id_catch() {
        id_protected = new byte[]{2};
    }

    private void id_case() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[0]];
        }
    }

    @Override
    public void id_protected() {
        this.id_case();
        for (int i = id_throws[0]; i < ((Boolean[][][])this.id_byte[id_case[2]]).length; ++i) {
            for (int j = id_throws[1]; j < ((Boolean[][][])this.id_byte[id_case[3]])[id_throws[2]].length; ++j) {
                for (int k = id_throws[3]; k < ((Boolean[][][])this.id_byte[id_case[4]])[id_throws[4]][id_throws[5]].length; ++k) {
                    ((Boolean[][][])this.id_byte[rf_3.id_case[5]])[i][j][k] = null;
                }
            }
        }
    }

    private static void id_private() {
        id_throws = new boolean[6];
    }
}

