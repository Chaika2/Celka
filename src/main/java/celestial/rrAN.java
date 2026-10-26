/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.rLR;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAN {
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    public static Object[] id_break;

    private static void id_byte() {
        id_protected = new short[6];
    }

    public rrAN() {
        this.id_protected();
    }

    static {
        rrAN.ntfClinit();
    }

    public rLR id_class() {
        return (rLR)this.id_class[id_protected[5]];
    }

    public static rrAN id_class(rLR rLR2) {
        rLR rLR3 = rLR2;
        ((rrAN)rrAN.id_break[rrAN.id_protected[0]]).id_class[rrAN.id_protected[1]] = rLR3;
        return (rrAN)id_break[id_protected[2]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{92, 66, -62, 109, -16, 30, 69, -22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA9BA150B;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x61EE66E8A3044A71L;
    }

    public static void id_break(rLR rLR2) {
        rrAN rrAN2 = rrAN.id_class(rLR2);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[3]]).id_finally().id_class(rrAN2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[4]]).id_class(rrAN2);
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rrAN()};
        id_break = objectArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAN.id_throws();
        rrAN.id_byte();
        rrAN.id_break();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }
}

