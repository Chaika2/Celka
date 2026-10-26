/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PO;
import celestial.a_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PM {
    private static byte[] id_break;
    public Object[] id_class;
    private static short[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public PM(PO pO, a_1 a_12) {
        this.id_byte();
        Objects.requireNonNull(pO);
        a_1 a_13 = a_12;
        this.id_class[PM.id_byte[0]] = a_13;
        PO pO2 = pO;
        this.id_class[PM.id_byte[1]] = pO2;
    }

    public PM(PO pO) {
        this(pO, null);
    }

    static {
        PM.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-67, -78, -8, -50, 31, 127, 98, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB6178FD17839BB04L;
    }

    public Optional<a_1> id_class() {
        return Optional.ofNullable((a_1)this.id_class[id_byte[2]]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA5DD4A7E;
    }

    public PO id_break() {
        return (PO)((Object)this.id_class[id_byte[3]]);
    }

    private static void id_throws() {
        id_break = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        PM.id_protected();
        PM.id_throws();
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_byte = sArray;
    }
}

