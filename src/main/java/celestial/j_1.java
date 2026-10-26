/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.V;
import celestial.Y;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class j_1 {
    private static boolean[] id_byte;
    public static Object[] id_class;
    public Object[] id_break;
    private static short[] id_protected;
    private static byte[] id_throws;

    public Y id_byte() {
        return (Y)((Object)this.id_break[id_protected[5]]);
    }

    public j_1(Y y, V v, int n) {
        this.id_implements();
        Y y2 = y;
        this.id_break[j_1.id_protected[0]] = y2;
        V v2 = v;
        this.id_break[j_1.id_protected[1]] = v2;
        Integer n2 = n;
        this.id_break[j_1.id_protected[2]] = n2;
    }

    static {
        j_1.ntfClinit();
    }

    public V id_class() {
        return (V)((Object)this.id_break[id_protected[6]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD401FB3E320BFE82L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{103, -57, -47, 62, -113, -77, -17, -10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x767CC3D6;
    }

    public static synchronized BiFunction<Y, V, j_1> id_break() {
        int n = (Integer)id_class[id_protected[3]];
        Integer n2 = n + id_byte[0];
        j_1.id_class[j_1.id_protected[4]] = n2;
        int n3 = n;
        return (y, v) -> new j_1((Y)((Object)y), (V)((Object)v), n3);
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{0};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        j_1.id_catch();
        j_1.id_private();
        j_1.id_case();
        j_1.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private static void id_case() {
        id_throws = new byte[]{3, 2};
    }

    private void id_implements() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[j_1.id_throws[1]] = id_byte[1];
        }
    }

    public int id_protected() {
        return (Integer)this.id_break[id_protected[7]];
    }

    private static void id_private() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[6] = 1;
        sArray[7] = 2;
        id_protected = sArray;
    }
}

