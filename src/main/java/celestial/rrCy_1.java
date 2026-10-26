/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfl_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCy_1 {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    public rrCy_1() {
        this.id_byte();
    }

    static {
        rrCy_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_break[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_break[1];
        }
        rrCy_1 rrCy_12 = (rrCy_1)object;
        return Objects.equals((rfl_3)this.id_class[id_byte[0]], (rfl_3)rrCy_12.id_class[id_byte[1]]);
    }

    public int hashCode() {
        return Objects.hashCode((rfl_3)this.id_class[id_byte[2]]);
    }

    public rfl_3 id_class() {
        return (rfl_3)this.id_class[id_byte[3]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{113, -28, 49, -66, 23, 107, -82, 105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rfl_3 rfl_32) {
        rfl_3 rfl_33 = rfl_32;
        this.id_class[rrCy_1.id_byte[4]] = rfl_33;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x578810112B4EDF0DL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD920D158;
    }

    private static void id_break() {
        id_byte = new short[5];
    }

    private static /* synthetic */ void ntfClinit() {
        rrCy_1.id_protected();
        rrCy_1.id_break();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_break = blArray;
    }
}

