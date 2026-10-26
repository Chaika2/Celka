/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.Om_1;
import celestial.cG_2;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnM_2
extends Om_1 {
    private static short[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_class;
    public Object[] id_break;

    public rrnM_2() {
        this.id_case();
    }

    static {
        rrnM_2.ntfClinit();
    }

    public cG_2 id_class() {
        this.id_case();
        return (cG_2)this.id_break[id_byte[6]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFA004B9FED0D2B70L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x831EC877;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{98, 32, -43, 51, 82, 127, -116, -29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrnM_2 id_class(cG_2 cG_22) {
        ((rrnM_2)id_class[id_byte[0]]).id_class(id_protected[0]);
        cG_2 cG_23 = cG_22;
        ((rrnM_2)rrnM_2.id_class[rrnM_2.id_byte[1]]).id_break[rrnM_2.id_byte[2]] = cG_23;
        return (rrnM_2)id_class[id_byte[3]];
    }

    public static void id_break(cG_2 cG_22) {
        rrnM_2 rrnM_22 = rrnM_2.id_class(cG_22);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[4]]).id_class(rrnM_22);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[5]]).id_finally().id_class(rrnM_22);
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rrnM_2()};
        id_class = objectArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrnM_2.id_throws();
        rrnM_2.id_protected();
        rrnM_2.id_break();
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[2]];
        }
    }

    private static void id_protected() {
        id_byte = new short[7];
    }
}

