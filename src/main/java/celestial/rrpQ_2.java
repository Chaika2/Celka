/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNt_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpQ_2 {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static byte[] id_protected;

    public rrNt_1 id_byte() {
        return (rrNt_1)this.id_class[id_byte[6]];
    }

    public rrpQ_2 id_byte(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrpQ_2.id_byte[0]] = bl2;
        return this;
    }

    public rrpQ_2(rrNt_1 rrNt_12) {
        this.id_throws();
        rrNt_1 rrNt_13 = rrNt_12;
        this.id_class[rrpQ_2.id_byte[10]] = rrNt_13;
    }

    static {
        rrpQ_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_break[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_break[1];
        }
        rrpQ_2 rrpQ_22 = (rrpQ_2)object;
        return Objects.equals((rrNt_1)this.id_class[id_byte[3]], (rrNt_1)rrpQ_22.id_class[id_byte[4]]);
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_break[2]];
        objectArray[rrpQ_2.id_break[3]] = (rrNt_1)this.id_class[id_byte[5]];
        return Objects.hash(objectArray);
    }

    public boolean id_class() {
        return (Boolean)this.id_class[id_byte[9]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCD181228;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2192FEAE810437B9L;
    }

    public rrpQ_2 id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrpQ_2.id_byte[1]] = bl2;
        return this;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{114, 106, -41, -110, -44, -111, 38, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrpQ_2 id_break(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrpQ_2.id_byte[2]] = bl2;
        return this;
    }

    public boolean id_break() {
        return (Boolean)this.id_class[id_byte[7]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
            this.id_class[1] = false;
            this.id_class[2] = false;
            this.id_class[3] = false;
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrpQ_2.id_case();
        rrpQ_2.id_catch();
        rrpQ_2.id_private();
    }

    private static void id_catch() {
        short[] sArray = new short[11];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[2] = 3;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 3;
        id_byte = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_break = blArray;
    }

    public boolean id_protected() {
        return (Boolean)this.id_class[id_byte[8]];
    }

    private static void id_private() {
        id_protected = new byte[]{4, 2, 3};
    }
}

