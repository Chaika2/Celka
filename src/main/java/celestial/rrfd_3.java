/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfd_3
extends Enum<rrfd_3> {
    private static byte[] bytes910c98266de533b4bd870045b610162a;
    public static Object[] staticFields910c98266de533b4bd870045b610162a;
    private static boolean[] booleans910c98266de533b4bd870045b610162a;
    private static short[] shorts910c98266de533b4bd870045b610162a;
    private static String[] strings910c98266de533b4bd870045b610162a;

    private static void id_byte() {
        strings910c98266de533b4bd870045b610162a = new String[]{new String("OTHER"), new String("TALISMAN"), new String("SPHERE"), new String("SWORD"), new String("PICKAXE"), new String("ELYTRA"), new String("TRIDENT"), new String("ARMOR"), new String("CROSSBOW"), new String("POTION"), new String("ARROW"), new String("LOCKPICK"), new String("SIGNAL_FIRE"), new String("TRAP_SKINS"), new String("TEST")};
    }

    static {
        rrfd_3.ntfClinit();
    }

    public static rrfd_3[] values() {
        return (rrfd_3[])((rrfd_3[])staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[0]]).clone();
    }

    public static rrfd_3 valueOf(String string) {
        return Enum.valueOf(rrfd_3.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-85, 28, -35, 78, -93, -73, -19, 57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF997D5E;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3(), new rrfd_3[]{(rrfd_3)((Object)objectArray[0]), (rrfd_3)((Object)objectArray[1]), (rrfd_3)((Object)objectArray[2]), (rrfd_3)((Object)objectArray[3]), (rrfd_3)((Object)objectArray[4]), (rrfd_3)((Object)objectArray[5]), (rrfd_3)((Object)objectArray[6]), (rrfd_3)((Object)objectArray[7]), (rrfd_3)((Object)objectArray[8]), (rrfd_3)((Object)objectArray[9]), (rrfd_3)((Object)objectArray[10]), (rrfd_3)((Object)objectArray[11]), (rrfd_3)((Object)objectArray[12]), (rrfd_3)((Object)objectArray[13]), (rrfd_3)((Object)objectArray[14])}};
        staticFields910c98266de533b4bd870045b610162a = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x316AB511495594FL;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans910c98266de533b4bd870045b610162a = blArray;
    }

    private static /* synthetic */ rrfd_3[] id_throws() {
        rrfd_3[] rrfd_3Array = new rrfd_3[bytes910c98266de533b4bd870045b610162a[0]];
        rrfd_3Array[rrfd_3.booleans910c98266de533b4bd870045b610162a[0]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[1]]);
        rrfd_3Array[rrfd_3.booleans910c98266de533b4bd870045b610162a[1]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[2]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[1]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[3]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[2]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[4]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[3]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[5]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[4]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[6]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[5]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[7]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[6]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[8]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[7]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[9]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[8]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[10]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[9]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[11]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[10]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[12]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[11]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[13]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[12]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[14]]);
        rrfd_3Array[rrfd_3.bytes910c98266de533b4bd870045b610162a[13]] = (rrfd_3)((Object)staticFields910c98266de533b4bd870045b610162a[shorts910c98266de533b4bd870045b610162a[15]]);
        return rrfd_3Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfd_3.id_break();
        rrfd_3.id_byte();
        rrfd_3.id_case();
        rrfd_3.id_protected();
        rrfd_3.id_class();
    }

    private static void id_case() {
        short[] sArray = new short[16];
        sArray[0] = 15;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[6] = 5;
        sArray[7] = 6;
        sArray[8] = 7;
        sArray[9] = 8;
        sArray[10] = 9;
        sArray[11] = 10;
        sArray[12] = 11;
        sArray[13] = 12;
        sArray[14] = 13;
        sArray[15] = 14;
        shorts910c98266de533b4bd870045b610162a = sArray;
    }

    private static void id_protected() {
        bytes910c98266de533b4bd870045b610162a = new byte[]{15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 16};
    }
}

