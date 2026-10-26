/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.iB_2;
import celestial.rpm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLe_1
extends Om_1 {
    private static boolean[] id_byte;
    private static byte[] id_protected;
    public Object[] id_class;
    private static short[] id_throws;
    public static Object[] id_break;

    public rrLe_1() {
        this.id_case();
    }

    static {
        rrLe_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, -104, -114, 31, 74, -84, -126, -64}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x306170849B9E2E5AL;
    }

    public rpm_3 id_class() {
        this.id_case();
        return (rpm_3)((Object)this.id_class[id_throws[7]]);
    }

    public static rrLe_1 id_class(iB_2 iB_22, rpm_3 rpm_32) {
        iB_2 iB_23 = iB_22;
        ((rrLe_1)rrLe_1.id_break[rrLe_1.id_throws[0]]).id_class[rrLe_1.id_throws[1]] = iB_23;
        rpm_3 rpm_33 = rpm_32;
        ((rrLe_1)rrLe_1.id_break[rrLe_1.id_throws[2]]).id_class[rrLe_1.id_throws[3]] = rpm_33;
        ((rrLe_1)id_break[id_throws[4]]).id_class(id_byte[0]);
        return (rrLe_1)id_break[id_throws[5]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3B824967;
    }

    public iB_2 id_break() {
        this.id_case();
        return (iB_2)this.id_class[id_throws[6]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLe_1.id_throws();
        rrLe_1.id_catch();
        rrLe_1.id_protected();
        rrLe_1.id_private();
    }

    private static void id_catch() {
        short[] sArray = new short[8];
        sArray[3] = 1;
        sArray[7] = 1;
        id_throws = sArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    private static void id_protected() {
        id_protected = new byte[]{2};
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrLe_1()};
        id_break = objectArray;
    }
}

