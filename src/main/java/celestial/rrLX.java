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

public class rrLX {
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    public static Object[] id_break;

    private static rrLX id_byte(boolean bl) {
        Boolean bl2 = bl;
        ((rrLX)rrLX.id_break[rrLX.id_protected[0]]).id_class[rrLX.id_protected[1]] = bl2;
        return (rrLX)id_break[id_protected[2]];
    }

    private static void id_byte() {
        Object[] objectArray = new Object[]{new rrLX()};
        id_break = objectArray;
    }

    public rrLX() {
        this.id_protected();
    }

    static {
        rrLX.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9513039E;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x547AA0314766984EL;
    }

    public boolean id_class() {
        return (Boolean)this.id_class[id_protected[5]];
    }

    public static rrLX id_class(boolean bl) {
        rrLX rrLX2 = rrLX.id_byte(bl);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[3]]).id_finally().id_class(rrLX2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[4]]).id_class(rrLX2);
        return rrLX2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{4, -15, -108, -14, 3, -44, 114, 47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[1] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    public void id_break(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrLX.id_protected[6]] = bl2;
    }

    private static void id_throws() {
        id_protected = new short[7];
    }

    private static /* synthetic */ void ntfClinit() {
        rrLX.id_break();
        rrLX.id_throws();
        rrLX.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
            objectArray[rrLX.id_byte[2]] = id_byte[3];
        }
    }
}

