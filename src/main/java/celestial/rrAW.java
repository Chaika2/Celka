/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rfo_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAW
extends Om_1 {
    private static boolean[] id_byte;
    private static short[] id_protected;
    public static Object[] id_class;
    public Object[] id_break;

    public rrAW() {
        this.id_protected();
    }

    static {
        rrAW.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x113013E2;
    }

    public static rrAW id_class(rfo_3 rfo_32) {
        rfo_3 rfo_33 = rfo_32;
        ((rrAW)rrAW.id_class[rrAW.id_protected[0]]).id_break[rrAW.id_protected[1]] = rfo_33;
        ((rrAW)id_class[id_protected[2]]).id_class(id_byte[0]);
        return (rrAW)id_class[id_protected[3]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{51, 43, -20, 64, 45, 92, 113, -121}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rfo_3 id_class() {
        this.id_protected();
        return (rfo_3)this.id_break[id_protected[4]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x25668171ED60D114L;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_byte = blArray;
    }

    private static void id_throws() {
        id_protected = new short[5];
    }

    private static /* synthetic */ void ntfClinit() {
        rrAW.id_break();
        rrAW.id_throws();
        rrAW.id_case();
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrAW()};
        id_class = objectArray;
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[2]];
        }
    }
}

