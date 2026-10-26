/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.R;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C
extends R {
    private static short[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;

    public C(String string) {
        this.id_protected();
        String string2 = string;
        this.id_class[C.id_byte[0]] = string2;
    }

    static {
        C.ntfClinit();
    }

    public String id_class() {
        this.id_protected();
        return (String)this.id_class[id_byte[1]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1BF5294FD3CF3DC2L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCAA3DB1C;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{116, -102, -15, 68, -107, -81, 4, 66}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_byte = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        C.id_case();
        C.id_throws();
    }

    private static void id_case() {
        id_protected = new boolean[]{true};
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }
}

