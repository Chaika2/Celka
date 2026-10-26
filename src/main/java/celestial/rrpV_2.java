/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpV_2
extends Enum<rrpV_2> {
    private static short[] shorts649a111ee07f3ad0a4df26e70aad6781;
    public static Object[] staticFields649a111ee07f3ad0a4df26e70aad6781;
    private static boolean[] booleans649a111ee07f3ad0a4df26e70aad6781;
    private static String[] strings649a111ee07f3ad0a4df26e70aad6781;
    private static byte[] bytes649a111ee07f3ad0a4df26e70aad6781;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts649a111ee07f3ad0a4df26e70aad6781 = sArray;
    }

    static {
        rrpV_2.ntfClinit();
    }

    public static rrpV_2[] values() {
        return (rrpV_2[])((rrpV_2[])staticFields649a111ee07f3ad0a4df26e70aad6781[shorts649a111ee07f3ad0a4df26e70aad6781[0]]).clone();
    }

    public static rrpV_2 valueOf(String string) {
        return Enum.valueOf(rrpV_2.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-10, -95, -107, 25, 77, -54, 96, 69}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5C6299A2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x25F215D099FBB497L;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans649a111ee07f3ad0a4df26e70aad6781 = blArray;
    }

    private static void id_break() {
        strings649a111ee07f3ad0a4df26e70aad6781 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    private static void id_throws() {
        bytes649a111ee07f3ad0a4df26e70aad6781 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static /* synthetic */ void ntfClinit() {
        rrpV_2.id_class();
        rrpV_2.id_break();
        rrpV_2.id_byte();
        rrpV_2.id_throws();
        rrpV_2.id_protected();
    }

    private static /* synthetic */ rrpV_2[] id_case() {
        rrpV_2[] rrpV_2Array = new rrpV_2[bytes649a111ee07f3ad0a4df26e70aad6781[0]];
        rrpV_2Array[rrpV_2.booleans649a111ee07f3ad0a4df26e70aad6781[0]] = (rrpV_2)((Object)staticFields649a111ee07f3ad0a4df26e70aad6781[shorts649a111ee07f3ad0a4df26e70aad6781[1]]);
        rrpV_2Array[rrpV_2.booleans649a111ee07f3ad0a4df26e70aad6781[1]] = (rrpV_2)((Object)staticFields649a111ee07f3ad0a4df26e70aad6781[shorts649a111ee07f3ad0a4df26e70aad6781[2]]);
        rrpV_2Array[rrpV_2.bytes649a111ee07f3ad0a4df26e70aad6781[1]] = (rrpV_2)((Object)staticFields649a111ee07f3ad0a4df26e70aad6781[shorts649a111ee07f3ad0a4df26e70aad6781[3]]);
        return rrpV_2Array;
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpV_2(), new rrpV_2(), new rrpV_2(), new rrpV_2[]{(rrpV_2)((Object)objectArray[0]), (rrpV_2)((Object)objectArray[1]), (rrpV_2)((Object)objectArray[2])}};
        staticFields649a111ee07f3ad0a4df26e70aad6781 = objectArray;
    }
}

