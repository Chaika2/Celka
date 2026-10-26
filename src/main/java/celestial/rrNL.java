/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNL
extends Enum<rrNL> {
    private static boolean[] booleans3858487aa6f43a4fb3e2f43fe4958927;
    private static byte[] bytes3858487aa6f43a4fb3e2f43fe4958927;
    public static Object[] staticFields3858487aa6f43a4fb3e2f43fe4958927;
    private static String[] strings3858487aa6f43a4fb3e2f43fe4958927;
    private static short[] shorts3858487aa6f43a4fb3e2f43fe4958927;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrNL(), new rrNL(), new rrNL(), new rrNL[]{(rrNL)((Object)objectArray[0]), (rrNL)((Object)objectArray[1]), (rrNL)((Object)objectArray[2])}};
        staticFields3858487aa6f43a4fb3e2f43fe4958927 = objectArray;
    }

    static {
        rrNL.ntfClinit();
    }

    public static rrNL[] values() {
        return (rrNL[])((rrNL[])staticFields3858487aa6f43a4fb3e2f43fe4958927[shorts3858487aa6f43a4fb3e2f43fe4958927[0]]).clone();
    }

    public static rrNL valueOf(String string) {
        return Enum.valueOf(rrNL.class, string);
    }

    private static void id_class() {
        bytes3858487aa6f43a4fb3e2f43fe4958927 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x59ADCA5768C35D76L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-54, -88, -97, 39, -69, -92, -58, -57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x388EFEC5;
    }

    private static void id_break() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts3858487aa6f43a4fb3e2f43fe4958927 = sArray;
    }

    private static void id_throws() {
        strings3858487aa6f43a4fb3e2f43fe4958927 = new String[]{new String("WAITING"), new String("SUCCESSFULLY_PURCHASED"), new String("ALREADY_PURCHASED")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrNL.id_case();
        rrNL.id_throws();
        rrNL.id_break();
        rrNL.id_class();
        rrNL.id_byte();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans3858487aa6f43a4fb3e2f43fe4958927 = blArray;
    }

    private static /* synthetic */ rrNL[] id_protected() {
        rrNL[] rrNLArray = new rrNL[bytes3858487aa6f43a4fb3e2f43fe4958927[0]];
        rrNLArray[rrNL.booleans3858487aa6f43a4fb3e2f43fe4958927[0]] = (rrNL)((Object)staticFields3858487aa6f43a4fb3e2f43fe4958927[shorts3858487aa6f43a4fb3e2f43fe4958927[1]]);
        rrNLArray[rrNL.booleans3858487aa6f43a4fb3e2f43fe4958927[1]] = (rrNL)((Object)staticFields3858487aa6f43a4fb3e2f43fe4958927[shorts3858487aa6f43a4fb3e2f43fe4958927[2]]);
        rrNLArray[rrNL.bytes3858487aa6f43a4fb3e2f43fe4958927[1]] = (rrNL)((Object)staticFields3858487aa6f43a4fb3e2f43fe4958927[shorts3858487aa6f43a4fb3e2f43fe4958927[3]]);
        return rrNLArray;
    }
}

