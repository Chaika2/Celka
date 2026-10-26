/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rxL_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTQ
extends HashMap<rxL_2, float[]> {
    private static boolean[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;
    private static float[] id_protected;

    private static void id_byte() {
        id_protected = new float[]{0.596f, 0.403f, 0.682f, 255.0f, 255.0f, 255.0f};
    }

    public rrTQ() {
        float[] fArray = new float[id_byte[0]];
        fArray[rrTQ.id_class[0]] = id_protected[0];
        fArray[rrTQ.id_class[1]] = id_protected[1];
        fArray[rrTQ.id_byte[1]] = id_protected[2];
        this.put(null, fArray);
        rxL_2[] rxL_2Array = rxL_2.VALUES;
        int n = rxL_2Array.length;
        for (int i = id_class[2]; i < n; ++i) {
            rxL_2 rxL_22 = rxL_2Array[i];
            float[] fArray2 = new float[id_byte[2]];
            fArray2[rrTQ.id_class[3]] = (float)(rxL_22.id_private() >> id_byte[3] & id_break[0]) / id_protected[3];
            fArray2[rrTQ.id_class[4]] = (float)(rxL_22.id_private() >> id_byte[4] & id_break[1]) / id_protected[4];
            fArray2[rrTQ.id_byte[5]] = (float)(rxL_22.id_private() & id_break[2]) / id_protected[5];
            this.put(rxL_22, fArray2);
        }
    }

    static {
        rrTQ.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x49F820DE3F27C9CFL;
    }

    private static void id_class() {
        id_byte = new byte[]{3, 2, 3, 16, 8, 2};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-61, -73, -47, 54, -95, -57, -47, 1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE59EE05C;
    }

    private static void id_break() {
        id_break = new short[]{255, 255, 255};
    }

    private static /* synthetic */ void ntfClinit() {
        rrTQ.id_protected();
        rrTQ.id_byte();
        rrTQ.id_break();
        rrTQ.id_class();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[5];
        blArray[1] = true;
        blArray[4] = true;
        id_class = blArray;
    }
}

