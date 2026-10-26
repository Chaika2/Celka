/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.B;
import celestial.C_default;
import celestial.C_double;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sT_2
extends Enum<sT_2> {
    private static byte[] bytesd035b37d0ef43a14a807173dd90a9560;
    private static String[] stringsd035b37d0ef43a14a807173dd90a9560;
    public static Object[] staticFieldsd035b37d0ef43a14a807173dd90a9560;
    private static boolean[] booleansd035b37d0ef43a14a807173dd90a9560;
    private static short[] shortsd035b37d0ef43a14a807173dd90a9560;
    public Object[] fieldsd035b37d0ef43a14a807173dd90a9560;

    private static /* synthetic */ sT_2[] id_byte() {
        sT_2[] sT_2Array = new sT_2[bytesd035b37d0ef43a14a807173dd90a9560[0]];
        sT_2Array[sT_2.booleansd035b37d0ef43a14a807173dd90a9560[0]] = (sT_2)((Object)staticFieldsd035b37d0ef43a14a807173dd90a9560[shortsd035b37d0ef43a14a807173dd90a9560[2]]);
        sT_2Array[sT_2.booleansd035b37d0ef43a14a807173dd90a9560[1]] = (sT_2)((Object)staticFieldsd035b37d0ef43a14a807173dd90a9560[shortsd035b37d0ef43a14a807173dd90a9560[3]]);
        return sT_2Array;
    }

    private sT_2(C_double c_double) {
        this.id_case();
        C_double c_double2 = c_double;
        this.fieldsd035b37d0ef43a14a807173dd90a9560[sT_2.shortsd035b37d0ef43a14a807173dd90a9560[1]] = c_double2;
    }

    static {
        sT_2.ntfClinit();
    }

    public static sT_2[] values() {
        return (sT_2[])((sT_2[])staticFieldsd035b37d0ef43a14a807173dd90a9560[shortsd035b37d0ef43a14a807173dd90a9560[0]]).clone();
    }

    public static sT_2 valueOf(String string) {
        return Enum.valueOf(sT_2.class, string);
    }

    private static void id_class() {
        bytesd035b37d0ef43a14a807173dd90a9560 = new byte[]{2, 2, 3};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE39DB381EEA41442L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-95, 11, 112, 121, -43, 84, -22, -33}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x733866C;
    }

    private static void id_break() {
        short[] sArray = new short[4];
        sArray[0] = 2;
        sArray[3] = 1;
        shortsd035b37d0ef43a14a807173dd90a9560 = sArray;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new sT_2(new C_default()), new sT_2(new B()), new sT_2[]{(sT_2)((Object)objectArray[0]), (sT_2)((Object)objectArray[1])}};
        staticFieldsd035b37d0ef43a14a807173dd90a9560 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sT_2.id_catch();
        sT_2.id_protected();
        sT_2.id_break();
        sT_2.id_class();
        sT_2.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[9];
        blArray[1] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        booleansd035b37d0ef43a14a807173dd90a9560 = blArray;
    }

    private void id_case() {
        if (this.fieldsd035b37d0ef43a14a807173dd90a9560 == null) {
            Object[] objectArray = this.fieldsd035b37d0ef43a14a807173dd90a9560 = new Object[booleansd035b37d0ef43a14a807173dd90a9560[8]];
        }
    }

    private static void id_protected() {
        stringsd035b37d0ef43a14a807173dd90a9560 = new String[]{new String("ENTITY"), new String("PLAYER")};
    }
}

