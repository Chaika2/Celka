/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.ao_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnb_3
extends Om_1 {
    private static short[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    public static Object[] id_break;

    public rrnb_3() {
        this.id_break();
    }

    static {
        rrnb_3.ntfClinit();
    }

    public ao_3 id_class() {
        this.id_break();
        return (ao_3)this.id_class[id_byte[4]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{34, 73, -23, 20, 40, -47, -126, 19}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5D04A28C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x47AB64F1CC04829FL;
    }

    public static rrnb_3 id_class(ao_3 ao_32) {
        ((rrnb_3)id_break[id_byte[0]]).id_class(id_protected[0]);
        ao_3 ao_33 = ao_32;
        ((rrnb_3)rrnb_3.id_break[rrnb_3.id_byte[1]]).id_class[rrnb_3.id_byte[2]] = ao_33;
        return (rrnb_3)id_break[id_byte[3]];
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[2]];
        }
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrnb_3()};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrnb_3.id_case();
        rrnb_3.id_protected();
        rrnb_3.id_throws();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        id_byte = new short[5];
    }
}

