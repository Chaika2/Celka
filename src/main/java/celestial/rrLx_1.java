/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLx_1 {
    private static short[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    public static Object[] id_break;

    private static void id_byte() {
        boolean[] blArray = new boolean[5];
        blArray[1] = true;
        blArray[4] = true;
        id_protected = blArray;
    }

    private static rrLx_1 id_byte(boolean bl) {
        Boolean bl2 = bl;
        ((rrLx_1)rrLx_1.id_break[rrLx_1.id_byte[0]]).id_class[rrLx_1.id_byte[1]] = bl2;
        return (rrLx_1)id_break[id_byte[2]];
    }

    public rrLx_1() {
        this.id_break();
    }

    static {
        rrLx_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x710265E0;
    }

    public boolean id_class() {
        return (Boolean)this.id_class[id_byte[5]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBA0529B9DB6DCB7FL;
    }

    public static rrLx_1 id_class(boolean bl) {
        rrLx_1 rrLx_12 = rrLx_1.id_byte(bl);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[3]]).id_finally().id_class(rrLx_12);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[4]]).id_class(rrLx_12);
        return rrLx_12;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{120, -23, -35, -121, 112, 102, 0, -14}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_break(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrLx_1.id_byte[6]] = bl2;
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
            objectArray[rrLx_1.id_protected[2]] = id_protected[3];
        }
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLx_1()};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLx_1.id_byte();
        rrLx_1.id_protected();
        rrLx_1.id_throws();
    }

    private static void id_protected() {
        id_byte = new short[7];
    }
}

