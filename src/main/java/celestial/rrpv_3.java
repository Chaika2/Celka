/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRb_1;
import celestial.rgF_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpv_3
extends Enum<rrpv_3> {
    private static short[] shorts1492bd69e54e3d74a4de8499225965d1;
    private static String[] strings1492bd69e54e3d74a4de8499225965d1;
    public Object[] fields1492bd69e54e3d74a4de8499225965d1;
    private static byte[] bytes1492bd69e54e3d74a4de8499225965d1;
    public static Object[] staticFields1492bd69e54e3d74a4de8499225965d1;
    private static boolean[] booleans1492bd69e54e3d74a4de8499225965d1;

    public rgF_2 id_byte() {
        return (rgF_2)((Object)this.fields1492bd69e54e3d74a4de8499225965d1[shorts1492bd69e54e3d74a4de8499225965d1[3]]);
    }

    private rrpv_3(String string2, rgF_2 rgF_22, rRb_1 rRb_12) {
        this.id_finally();
        String string3 = string2;
        this.fields1492bd69e54e3d74a4de8499225965d1[rrpv_3.shorts1492bd69e54e3d74a4de8499225965d1[5]] = string3;
        rgF_2 rgF_23 = rgF_22;
        this.fields1492bd69e54e3d74a4de8499225965d1[rrpv_3.shorts1492bd69e54e3d74a4de8499225965d1[6]] = rgF_23;
        rRb_1 rRb_13 = rRb_12;
        this.fields1492bd69e54e3d74a4de8499225965d1[rrpv_3.shorts1492bd69e54e3d74a4de8499225965d1[7]] = rRb_13;
    }

    static {
        rrpv_3.ntfClinit();
    }

    public static rrpv_3[] values() {
        return (rrpv_3[])((rrpv_3[])staticFields1492bd69e54e3d74a4de8499225965d1[shorts1492bd69e54e3d74a4de8499225965d1[0]]).clone();
    }

    public static rrpv_3 valueOf(String string) {
        return Enum.valueOf(rrpv_3.class, string);
    }

    public String id_class() {
        return (String)this.fields1492bd69e54e3d74a4de8499225965d1[shorts1492bd69e54e3d74a4de8499225965d1[2]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{109, -30, -102, -65, -55, -118, 112, -97}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCBAD36B3;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xACDDC21827E34357L;
    }

    public static rrpv_3 id_break(String string) {
        rrpv_3[] rrpv_3Array = (rrpv_3[])staticFields1492bd69e54e3d74a4de8499225965d1[shorts1492bd69e54e3d74a4de8499225965d1[1]];
        int n = rrpv_3Array.length;
        for (int i = booleans1492bd69e54e3d74a4de8499225965d1[0]; i < n; ++i) {
            rrpv_3 rrpv_32 = rrpv_3Array[i];
            if (!rrpv_32.id_class().equals(string)) continue;
            return rrpv_32;
        }
        return null;
    }

    public rRb_1 id_break() {
        return (rRb_1)((Object)this.fields1492bd69e54e3d74a4de8499225965d1[shorts1492bd69e54e3d74a4de8499225965d1[4]]);
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpv_3(strings1492bd69e54e3d74a4de8499225965d1[1], rgF_2.AQUA, null), new rrpv_3(strings1492bd69e54e3d74a4de8499225965d1[3], rgF_2.YELLOW, null), new rrpv_3(strings1492bd69e54e3d74a4de8499225965d1[5], rgF_2.GREEN, null), new rrpv_3[]{(rrpv_3)((Object)objectArray[0]), (rrpv_3)((Object)objectArray[1]), (rrpv_3)((Object)objectArray[2])}, new rrpv_3[]{(rrpv_3)((Object)objectArray[0]), (rrpv_3)((Object)objectArray[1]), (rrpv_3)((Object)objectArray[2])}};
        staticFields1492bd69e54e3d74a4de8499225965d1 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpv_3.id_implements();
        rrpv_3.id_catch();
        rrpv_3.id_private();
        rrpv_3.id_protected();
        rrpv_3.id_throws();
    }

    private void id_finally() {
        if (this.fields1492bd69e54e3d74a4de8499225965d1 == null) {
            this.fields1492bd69e54e3d74a4de8499225965d1 = new Object[3];
        }
    }

    private static void id_catch() {
        strings1492bd69e54e3d74a4de8499225965d1 = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u0430\u044f"), new String("MYTHIC"), new String("\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0430\u044f"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u0430\u044f")};
    }

    private static /* synthetic */ rrpv_3[] id_case() {
        rrpv_3[] rrpv_3Array = new rrpv_3[bytes1492bd69e54e3d74a4de8499225965d1[0]];
        rrpv_3Array[rrpv_3.booleans1492bd69e54e3d74a4de8499225965d1[1]] = (rrpv_3)((Object)staticFields1492bd69e54e3d74a4de8499225965d1[shorts1492bd69e54e3d74a4de8499225965d1[8]]);
        rrpv_3Array[rrpv_3.booleans1492bd69e54e3d74a4de8499225965d1[2]] = (rrpv_3)((Object)staticFields1492bd69e54e3d74a4de8499225965d1[shorts1492bd69e54e3d74a4de8499225965d1[9]]);
        rrpv_3Array[rrpv_3.bytes1492bd69e54e3d74a4de8499225965d1[1]] = (rrpv_3)((Object)staticFields1492bd69e54e3d74a4de8499225965d1[shorts1492bd69e54e3d74a4de8499225965d1[10]]);
        return rrpv_3Array;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[7];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleans1492bd69e54e3d74a4de8499225965d1 = blArray;
    }

    private static void id_protected() {
        bytes1492bd69e54e3d74a4de8499225965d1 = new byte[]{3, 2, 2, 2, 4, 3, 3, 5};
    }

    private static void id_private() {
        short[] sArray = new short[11];
        sArray[0] = 4;
        sArray[1] = 3;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        shorts1492bd69e54e3d74a4de8499225965d1 = sArray;
    }
}

