/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_private;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bs_1
extends Enum<Bs_1> {
    public static Object[] staticFieldsab676614e82b32e79a1e1e0ca1d59f08;
    private static short[] shortsab676614e82b32e79a1e1e0ca1d59f08;
    private static boolean[] booleansab676614e82b32e79a1e1e0ca1d59f08;
    private static byte[] bytesab676614e82b32e79a1e1e0ca1d59f08;
    private static String[] stringsab676614e82b32e79a1e1e0ca1d59f08;

    private static void id_byte() {
        short[] sArray = new short[11];
        sArray[0] = 3;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        shortsab676614e82b32e79a1e1e0ca1d59f08 = sArray;
    }

    static {
        Bs_1.ntfClinit();
    }

    public static Bs_1[] values() {
        return (Bs_1[])((Bs_1[])staticFieldsab676614e82b32e79a1e1e0ca1d59f08[shortsab676614e82b32e79a1e1e0ca1d59f08[0]]).clone();
    }

    public static Bs_1 valueOf(String string) {
        return Enum.valueOf(Bs_1.class, string);
    }

    private static void id_class() {
        bytesab676614e82b32e79a1e1e0ca1d59f08 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xABDB74EE6F4F3CC5L;
    }

    public static Bs_1 id_class(boolean bl) {
        C_private c_private = C_class.id_instanceof();
        boolean bl2 = (Boolean)c_private.F.id_class[shortsab676614e82b32e79a1e1e0ca1d59f08[1]];
        boolean bl3 = (Boolean)c_private.id_private.id_class[shortsab676614e82b32e79a1e1e0ca1d59f08[2]];
        boolean bl4 = (Boolean)c_private.n.id_class[shortsab676614e82b32e79a1e1e0ca1d59f08[3]];
        if (!bl4) {
            return (Bs_1)((Object)staticFieldsab676614e82b32e79a1e1e0ca1d59f08[shortsab676614e82b32e79a1e1e0ca1d59f08[4]]);
        }
        if (!bl3 && bl) {
            return (Bs_1)((Object)staticFieldsab676614e82b32e79a1e1e0ca1d59f08[shortsab676614e82b32e79a1e1e0ca1d59f08[5]]);
        }
        if (bl2 || bl) {
            return (Bs_1)((Object)staticFieldsab676614e82b32e79a1e1e0ca1d59f08[shortsab676614e82b32e79a1e1e0ca1d59f08[6]]);
        }
        return (Bs_1)((Object)staticFieldsab676614e82b32e79a1e1e0ca1d59f08[shortsab676614e82b32e79a1e1e0ca1d59f08[7]]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-118, 52, -27, -63, -8, 108, 110, 65}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x671693F5;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansab676614e82b32e79a1e1e0ca1d59f08 = blArray;
    }

    private static void id_throws() {
        stringsab676614e82b32e79a1e1e0ca1d59f08 = new String[]{new String("CLIENT"), new String("SERVER"), new String("NONE")};
    }

    private static /* synthetic */ void ntfClinit() {
        Bs_1.id_break();
        Bs_1.id_throws();
        Bs_1.id_byte();
        Bs_1.id_class();
        Bs_1.id_protected();
    }

    private static /* synthetic */ Bs_1[] id_case() {
        Bs_1[] bs_1Array = new Bs_1[bytesab676614e82b32e79a1e1e0ca1d59f08[0]];
        bs_1Array[Bs_1.booleansab676614e82b32e79a1e1e0ca1d59f08[0]] = (Bs_1)((Object)staticFieldsab676614e82b32e79a1e1e0ca1d59f08[shortsab676614e82b32e79a1e1e0ca1d59f08[8]]);
        bs_1Array[Bs_1.booleansab676614e82b32e79a1e1e0ca1d59f08[1]] = (Bs_1)((Object)staticFieldsab676614e82b32e79a1e1e0ca1d59f08[shortsab676614e82b32e79a1e1e0ca1d59f08[9]]);
        bs_1Array[Bs_1.bytesab676614e82b32e79a1e1e0ca1d59f08[1]] = (Bs_1)((Object)staticFieldsab676614e82b32e79a1e1e0ca1d59f08[shortsab676614e82b32e79a1e1e0ca1d59f08[10]]);
        return bs_1Array;
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new Bs_1(), new Bs_1(), new Bs_1(), new Bs_1[]{(Bs_1)((Object)objectArray[0]), (Bs_1)((Object)objectArray[1]), (Bs_1)((Object)objectArray[2])}};
        staticFieldsab676614e82b32e79a1e1e0ca1d59f08 = objectArray;
    }
}

