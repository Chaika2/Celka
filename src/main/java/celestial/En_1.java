/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class En_1 {
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        id_break = new byte[]{2};
    }

    public En_1() {
        this(null, id_protected[0]);
    }

    public En_1(PX pX, boolean bl) {
        this.id_case();
        PX pX2 = pX;
        this.id_class[En_1.id_byte[0]] = pX2;
        Boolean bl2 = bl;
        this.id_class[En_1.id_byte[1]] = bl2;
    }

    static {
        En_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF4C94F8032D6CC6BL;
    }

    public En_1 id_class(PX pX) {
        PX pX2 = pX;
        this.id_class[En_1.id_byte[3]] = pX2;
        return this;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{94, -45, -72, 44, 4, -82, -36, 9}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF3F69761;
    }

    public boolean id_class() {
        return (Boolean)this.id_class[id_byte[4]];
    }

    public Optional<PX> id_break() {
        return Optional.ofNullable((PX)this.id_class[id_byte[2]]);
    }

    private static void id_throws() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[4] = 1;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        En_1.id_protected();
        En_1.id_throws();
        En_1.id_byte();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[En_1.id_protected[1]] = id_protected[2];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        id_protected = blArray;
    }
}

