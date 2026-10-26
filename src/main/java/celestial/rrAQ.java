/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.an_3;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAQ {
    private static short[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    public static Object[] id_break;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
        }
    }

    public rrAQ() {
        this.id_byte();
    }

    static {
        rrAQ.ntfClinit();
    }

    public static void id_class(an_3 an_32) {
        rrAQ rrAQ2 = rrAQ.id_break(an_32);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[3]]).id_finally().id_class(rrAQ2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[4]]).id_class(rrAQ2);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-69, -69, 32, -80, -114, 38, -59, 101}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public an_3 id_class() {
        return (an_3)this.id_class[id_byte[5]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x617FA16C7BC5594EL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9480FF1B;
    }

    private static void id_break() {
        id_byte = new short[6];
    }

    public static rrAQ id_break(an_3 an_32) {
        an_3 an_33 = an_32;
        ((rrAQ)rrAQ.id_break[rrAQ.id_byte[0]]).id_class[rrAQ.id_byte[1]] = an_33;
        return (rrAQ)id_break[id_byte[2]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAQ.id_throws();
        rrAQ.id_break();
        rrAQ.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrAQ()};
        id_break = objectArray;
    }
}

