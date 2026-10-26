/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.Om_1;
import celestial.cW_2;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLE
extends Om_1 {
    private static short[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    public static Object[] id_break;

    public rrLE() {
        this.id_protected();
    }

    static {
        rrLE.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x748C531C329385ADL;
    }

    public static rrLE id_class(cW_2 cW_22) {
        rrLE rrLE2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[4]]).id_finally().id_class(rrLE.id_break(cW_22));
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[5]]).id_class(rrLE2);
        return rrLE2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-126, -19, 48, 13, 92, -45, 51, 84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x847A1329;
    }

    public cW_2 id_class() {
        this.id_protected();
        return (cW_2)this.id_class[id_byte[6]];
    }

    private static rrLE id_break(cW_2 cW_22) {
        cW_2 cW_23 = cW_22;
        ((rrLE)rrLE.id_break[rrLE.id_byte[0]]).id_class[rrLE.id_byte[1]] = cW_23;
        ((rrLE)id_break[id_byte[2]]).id_class(id_protected[0]);
        return (rrLE)id_break[id_byte[3]];
    }

    private static void id_break() {
        id_byte = new short[7];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLE.id_throws();
        rrLE.id_break();
        rrLE.id_case();
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrLE()};
        id_break = objectArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[2]];
        }
    }
}

