/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rrNd_1;
import celestial.rrNh_1;
import celestial.rrNt_1;
import celestial.rrcN_2;
import celestial.rrcT_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfX_2
extends Enum<rrfX_2> {
    private static byte[] bytes802b921f788437d584e63ee707538d8a;
    private static boolean[] booleans802b921f788437d584e63ee707538d8a;
    public static Object[] staticFields802b921f788437d584e63ee707538d8a;
    private static String[] strings802b921f788437d584e63ee707538d8a;
    private static short[] shorts802b921f788437d584e63ee707538d8a;

    private static void id_byte() {
        short[] sArray = new short[9];
        sArray[0] = 2;
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[8] = 1;
        shorts802b921f788437d584e63ee707538d8a = sArray;
    }

    static {
        rrfX_2.ntfClinit();
    }

    public static rrfX_2[] values() {
        return (rrfX_2[])((rrfX_2[])staticFields802b921f788437d584e63ee707538d8a[shorts802b921f788437d584e63ee707538d8a[0]]).clone();
    }

    public static rrfX_2 valueOf(String string) {
        return Enum.valueOf(rrfX_2.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4AFF0FD;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-84, 93, 83, 115, -77, 10, -48, -28}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x59201083C80097F5L;
    }

    public static rrfX_2 id_class(rrNd_1 rrNd_12) {
        if (rrNd_12.id_catch() != rdy_3.kc) {
            return null;
        }
        if (rrNd_12 == ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[shorts802b921f788437d584e63ee707538d8a[4]])).id_break()) {
            return (rrfX_2)((Object)staticFields802b921f788437d584e63ee707538d8a[shorts802b921f788437d584e63ee707538d8a[5]]);
        }
        return (rrfX_2)((Object)staticFields802b921f788437d584e63ee707538d8a[shorts802b921f788437d584e63ee707538d8a[6]]);
    }

    public static rrfX_2 id_class(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.kc) {
            return null;
        }
        rrNd_1 rrNd_12 = ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[shorts802b921f788437d584e63ee707538d8a[1]])).id_break();
        rrNt_1 rrNt_12 = new rrNt_1(rdn_32);
        if (rrNd_12 != null) {
            for (rrcT_2<?> rrcT_22 : rrNd_12.id_instanceof()) {
                rrcN_2 rrcN_22;
                if (!(rrcT_22 instanceof rrcN_2) || !(rrcN_22 = (rrcN_2)rrcT_22).id_class(rrNd_12, rrNt_12).id_byte()) continue;
                return (rrfX_2)((Object)staticFields802b921f788437d584e63ee707538d8a[shorts802b921f788437d584e63ee707538d8a[2]]);
            }
        }
        return (rrfX_2)((Object)staticFields802b921f788437d584e63ee707538d8a[shorts802b921f788437d584e63ee707538d8a[3]]);
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rrfX_2(), new rrfX_2(), new rrfX_2[]{(rrfX_2)((Object)objectArray[0]), (rrfX_2)((Object)objectArray[1])}};
        staticFields802b921f788437d584e63ee707538d8a = objectArray;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans802b921f788437d584e63ee707538d8a = blArray;
    }

    private static void id_throws() {
        bytes802b921f788437d584e63ee707538d8a = new byte[]{2, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrfX_2.id_break();
        rrfX_2.id_case();
        rrfX_2.id_byte();
        rrfX_2.id_throws();
        rrfX_2.id_class();
    }

    private static void id_case() {
        strings802b921f788437d584e63ee707538d8a = new String[]{new String("DESTROYER"), new String("DEFAULT")};
    }

    private static /* synthetic */ rrfX_2[] id_protected() {
        rrfX_2[] rrfX_2Array = new rrfX_2[bytes802b921f788437d584e63ee707538d8a[0]];
        rrfX_2Array[rrfX_2.booleans802b921f788437d584e63ee707538d8a[0]] = (rrfX_2)((Object)staticFields802b921f788437d584e63ee707538d8a[shorts802b921f788437d584e63ee707538d8a[7]]);
        rrfX_2Array[rrfX_2.booleans802b921f788437d584e63ee707538d8a[1]] = (rrfX_2)((Object)staticFields802b921f788437d584e63ee707538d8a[shorts802b921f788437d584e63ee707538d8a[8]]);
        return rrfX_2Array;
    }
}

