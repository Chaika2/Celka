/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrZF;
import celestial.rrtD_2;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtK_2
extends Enum<rrtK_2> {
    private static boolean[] booleansc4d05dcb6ab834399a1b48042de01686;
    private static short[] shortsc4d05dcb6ab834399a1b48042de01686;
    private static byte[] bytesc4d05dcb6ab834399a1b48042de01686;
    private static String[] stringsc4d05dcb6ab834399a1b48042de01686;
    public static Object[] staticFieldsc4d05dcb6ab834399a1b48042de01686;
    public Object[] fieldsc4d05dcb6ab834399a1b48042de01686;

    private rrtK_2(rrtD_2 rrtD_22) {
        this.id_break();
        rrtD_2 rrtD_23 = rrtD_22;
        this.fieldsc4d05dcb6ab834399a1b48042de01686[rrtK_2.shortsc4d05dcb6ab834399a1b48042de01686[1]] = rrtD_23;
    }

    static {
        rrtK_2.ntfClinit();
    }

    public static rrtK_2[] values() {
        return (rrtK_2[])((rrtK_2[])staticFieldsc4d05dcb6ab834399a1b48042de01686[shortsc4d05dcb6ab834399a1b48042de01686[0]]).clone();
    }

    public static rrtK_2 valueOf(String string) {
        return Enum.valueOf(rrtK_2.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x21DB2D02;
    }

    public rrtD_2 id_class() {
        return (rrtD_2)this.fieldsc4d05dcb6ab834399a1b48042de01686[shortsc4d05dcb6ab834399a1b48042de01686[2]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x56B8B1398496F4D9L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-42, -82, -50, 126, -61, 94, -31, -116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.fieldsc4d05dcb6ab834399a1b48042de01686 == null) {
            Object[] objectArray = this.fieldsc4d05dcb6ab834399a1b48042de01686 = new Object[booleansc4d05dcb6ab834399a1b48042de01686[6]];
        }
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrtK_2(new rrtD_2(() -> rrZF.k_, () -> rrZF.k_, new Color(-65536)::getRGB)), new rrtK_2(new rrtD_2(() -> rrZF.d_, () -> rrZF.d_, () -> rrZF.d_)), new rrtK_2(new rrtD_2(() -> rrZF.d_, () -> rrZF.d_, new Color(-65536)::getRGB)), new rrtK_2[]{(rrtK_2)((Object)objectArray[0]), (rrtK_2)((Object)objectArray[1]), (rrtK_2)((Object)objectArray[2])}};
        staticFieldsc4d05dcb6ab834399a1b48042de01686 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtK_2.id_volatile();
        rrtK_2.id_final();
        rrtK_2.id_extends();
        rrtK_2.id_finally();
        rrtK_2.id_throws();
    }

    private static void id_finally() {
        bytesc4d05dcb6ab834399a1b48042de01686 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_extends() {
        short[] sArray = new short[6];
        sArray[0] = 3;
        sArray[4] = 1;
        sArray[5] = 2;
        shortsc4d05dcb6ab834399a1b48042de01686 = sArray;
    }

    private static /* synthetic */ rrtK_2[] id_private() {
        rrtK_2[] rrtK_2Array = new rrtK_2[bytesc4d05dcb6ab834399a1b48042de01686[0]];
        rrtK_2Array[rrtK_2.booleansc4d05dcb6ab834399a1b48042de01686[0]] = (rrtK_2)((Object)staticFieldsc4d05dcb6ab834399a1b48042de01686[shortsc4d05dcb6ab834399a1b48042de01686[3]]);
        rrtK_2Array[rrtK_2.booleansc4d05dcb6ab834399a1b48042de01686[1]] = (rrtK_2)((Object)staticFieldsc4d05dcb6ab834399a1b48042de01686[shortsc4d05dcb6ab834399a1b48042de01686[4]]);
        rrtK_2Array[rrtK_2.bytesc4d05dcb6ab834399a1b48042de01686[1]] = (rrtK_2)((Object)staticFieldsc4d05dcb6ab834399a1b48042de01686[shortsc4d05dcb6ab834399a1b48042de01686[5]]);
        return rrtK_2Array;
    }

    private static void id_final() {
        stringsc4d05dcb6ab834399a1b48042de01686 = new String[]{new String("OLD"), new String("SIMPLE"), new String("MODERN")};
    }

    private static void id_volatile() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleansc4d05dcb6ab834399a1b48042de01686 = blArray;
    }
}

