/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.SC;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SF
extends SC {
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    private static float[] id_throws;
    private static short[] id_case;
    private static long[] id_catch;

    public SF(String string, long l) {
        super(string);
        this.id_private();
        Long l2 = l;
        this.id_class[SF.id_case[0]] = l2;
    }

    public SF(String string) {
        this(string, id_catch[0]);
    }

    static {
        SF.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFD36064E;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA371696953898C93L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-124, -120, -83, 4, 34, 113, 7, -33}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public long id_class() {
        this.id_private();
        return (Long)this.id_class[id_case[3]];
    }

    @Override
    public int id_break() {
        this.id_private();
        return (Long)this.id_class[id_case[1]] < id_catch[1] ? id_byte[0] : (int)Math.ceil((float)((Long)this.id_class[id_case[2]]).longValue() / id_throws[0]);
    }

    private static void id_throws() {
        id_case = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        SF.id_catch();
        SF.id_case();
        SF.id_throws();
        SF.id_protected();
        SF.id_implements();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_protected = blArray;
    }

    private static void id_case() {
        long[] lArray = new long[3];
        lArray[0] = -1L;
        id_catch = lArray;
    }

    private static void id_implements() {
        id_byte = new byte[]{-1};
    }

    private static void id_protected() {
        id_throws = new float[]{50.0f};
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[SF.id_protected[1]] = id_catch[2];
        }
    }
}

