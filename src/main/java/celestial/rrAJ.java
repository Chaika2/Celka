/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iM_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAJ {
    public Object[] id_class;
    private static boolean[] id_byte;
    public static Object[] id_break;
    private static short[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    public rrAJ() {
        this.id_byte();
    }

    static {
        rrAJ.ntfClinit();
    }

    public void id_class(iM_2 iM_22) {
        iM_2 iM_23 = iM_22;
        this.id_class[rrAJ.id_protected[4]] = iM_23;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-104, 124, -36, -120, -72, 57, 97, -52}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public iM_2 id_class() {
        return (iM_2)((Object)this.id_class[id_protected[3]]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x36AECD0B;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBA309F8F20F1ED41L;
    }

    public static rrAJ id_break(iM_2 iM_22) {
        iM_2 iM_23 = iM_22;
        ((rrAJ)rrAJ.id_break[rrAJ.id_protected[0]]).id_class[rrAJ.id_protected[1]] = iM_23;
        return (rrAJ)id_break[id_protected[2]];
    }

    private static void id_break() {
        id_protected = new short[5];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAJ.id_throws();
        rrAJ.id_break();
        rrAJ.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrAJ()};
        id_break = objectArray;
    }
}

