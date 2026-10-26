/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrye_1
extends Enum<rrye_1> {
    private static boolean[] booleans28f193d459cc3553a812ffe718ee6216;
    private static byte[] bytes28f193d459cc3553a812ffe718ee6216;
    private static String[] strings28f193d459cc3553a812ffe718ee6216;
    private static short[] shorts28f193d459cc3553a812ffe718ee6216;
    public static Object[] staticFields28f193d459cc3553a812ffe718ee6216;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrye_1(), new rrye_1(), new rrye_1(), new rrye_1(), new rrye_1[]{(rrye_1)((Object)objectArray[0]), (rrye_1)((Object)objectArray[1]), (rrye_1)((Object)objectArray[2]), (rrye_1)((Object)objectArray[3])}};
        staticFields28f193d459cc3553a812ffe718ee6216 = objectArray;
    }

    static {
        rrye_1.ntfClinit();
    }

    public static rrye_1[] values() {
        return (rrye_1[])((rrye_1[])staticFields28f193d459cc3553a812ffe718ee6216[shorts28f193d459cc3553a812ffe718ee6216[0]]).clone();
    }

    public static rrye_1 valueOf(String string) {
        return Enum.valueOf(rrye_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC6003703;
    }

    private static void id_class() {
        strings28f193d459cc3553a812ffe718ee6216 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN"), new String("NO_BAD_EFFECTS")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x908ED4C1B15A5BD5L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{101, -56, -24, -70, -125, -56, -25, 75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ rrye_1[] id_break() {
        rrye_1[] rrye_1Array = new rrye_1[bytes28f193d459cc3553a812ffe718ee6216[0]];
        rrye_1Array[rrye_1.booleans28f193d459cc3553a812ffe718ee6216[0]] = (rrye_1)((Object)staticFields28f193d459cc3553a812ffe718ee6216[shorts28f193d459cc3553a812ffe718ee6216[1]]);
        rrye_1Array[rrye_1.booleans28f193d459cc3553a812ffe718ee6216[1]] = (rrye_1)((Object)staticFields28f193d459cc3553a812ffe718ee6216[shorts28f193d459cc3553a812ffe718ee6216[2]]);
        rrye_1Array[rrye_1.bytes28f193d459cc3553a812ffe718ee6216[1]] = (rrye_1)((Object)staticFields28f193d459cc3553a812ffe718ee6216[shorts28f193d459cc3553a812ffe718ee6216[3]]);
        rrye_1Array[rrye_1.bytes28f193d459cc3553a812ffe718ee6216[2]] = (rrye_1)((Object)staticFields28f193d459cc3553a812ffe718ee6216[shorts28f193d459cc3553a812ffe718ee6216[4]]);
        return rrye_1Array;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans28f193d459cc3553a812ffe718ee6216 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrye_1.id_throws();
        rrye_1.id_class();
        rrye_1.id_protected();
        rrye_1.id_case();
        rrye_1.id_byte();
    }

    private static void id_case() {
        bytes28f193d459cc3553a812ffe718ee6216 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
    }

    private static void id_protected() {
        short[] sArray = new short[5];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        shorts28f193d459cc3553a812ffe718ee6216 = sArray;
    }
}

