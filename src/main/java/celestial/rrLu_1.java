/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.Om_1;
import celestial.rrQX;
import celestial.ruS_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLu_1
extends Om_1 {
    private static short[] id_byte;
    public static Object[] id_class;
    private static boolean[] id_protected;
    public Object[] id_break;

    public rrLu_1() {
        this.id_protected();
    }

    static {
        rrLu_1.ntfClinit();
    }

    public ruS_2<?> id_class() {
        this.id_protected();
        return (ruS_2)this.id_break[id_byte[6]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-120, 70, -100, -58, 10, -21, -100, -109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA225D2B8;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x29C06B567B1D37B5L;
    }

    public static rrLu_1 id_class(ruS_2<?> ruS_22) {
        rrLu_1 rrLu_12 = rrLu_1.id_break(ruS_22);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[4]]).id_finally().id_class(rrLu_12);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[5]]).id_class(rrLu_12);
        return rrLu_12;
    }

    public static rrLu_1 id_break(ruS_2<?> ruS_22) {
        ruS_2<?> ruS_23;
        ((rrLu_1)rrLu_1.id_class[rrLu_1.id_byte[0]]).id_break[rrLu_1.id_byte[1]] = ruS_23 = ruS_22;
        ((rrLu_1)id_class[id_byte[2]]).id_class(id_protected[0]);
        return (rrLu_1)id_class[id_byte[3]];
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rrLu_1()};
        id_class = objectArray;
    }

    private static void id_throws() {
        id_byte = new short[7];
    }

    private static /* synthetic */ void ntfClinit() {
        rrLu_1.id_case();
        rrLu_1.id_throws();
        rrLu_1.id_break();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[2]];
        }
    }
}

