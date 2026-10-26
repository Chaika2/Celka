/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQc_1;
import celestial.rrQu_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQN
extends Enum<rrQN> {
    private static String[] strings065bd3322daf3178a8bd0d03c4b20e54;
    private static byte[] bytes065bd3322daf3178a8bd0d03c4b20e54;
    private static short[] shorts065bd3322daf3178a8bd0d03c4b20e54;
    public Object[] fields065bd3322daf3178a8bd0d03c4b20e54;
    private static boolean[] booleans065bd3322daf3178a8bd0d03c4b20e54;
    public static Object[] staticFields065bd3322daf3178a8bd0d03c4b20e54;

    private static void id_byte() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans065bd3322daf3178a8bd0d03c4b20e54 = blArray;
    }

    private rrQN() {
        this.id_case();
        rrQc_1 rrQc_12 = new rrQc_1();
        this.fields065bd3322daf3178a8bd0d03c4b20e54[rrQN.shorts065bd3322daf3178a8bd0d03c4b20e54[1]] = rrQc_12;
        rrQu_1 rrQu_12 = new rrQu_1();
        this.fields065bd3322daf3178a8bd0d03c4b20e54[rrQN.shorts065bd3322daf3178a8bd0d03c4b20e54[2]] = rrQu_12;
    }

    static {
        rrQN.ntfClinit();
    }

    public static rrQN[] values() {
        return (rrQN[])((rrQN[])staticFields065bd3322daf3178a8bd0d03c4b20e54[shorts065bd3322daf3178a8bd0d03c4b20e54[0]]).clone();
    }

    public static rrQN valueOf(String string) {
        return Enum.valueOf(rrQN.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-120, 14, 111, 57, -35, -85, -74, -80}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x19572919;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x374F449B67CBF8A8L;
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[0] = 1;
        sArray[2] = 1;
        shorts065bd3322daf3178a8bd0d03c4b20e54 = sArray;
    }

    private static void id_break() {
        bytes065bd3322daf3178a8bd0d03c4b20e54 = new byte[]{2, 2};
    }

    private static void id_throws() {
        strings065bd3322daf3178a8bd0d03c4b20e54 = new String[]{new String("INSTANCE")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrQN.id_byte();
        rrQN.id_throws();
        rrQN.id_class();
        rrQN.id_break();
        rrQN.id_protected();
    }

    private static /* synthetic */ rrQN[] id_catch() {
        rrQN[] rrQNArray = new rrQN[booleans065bd3322daf3178a8bd0d03c4b20e54[0]];
        rrQNArray[rrQN.booleans065bd3322daf3178a8bd0d03c4b20e54[1]] = (rrQN)((Object)staticFields065bd3322daf3178a8bd0d03c4b20e54[shorts065bd3322daf3178a8bd0d03c4b20e54[3]]);
        return rrQNArray;
    }

    private void id_case() {
        if (this.fields065bd3322daf3178a8bd0d03c4b20e54 == null) {
            Object[] objectArray = this.fields065bd3322daf3178a8bd0d03c4b20e54 = new Object[bytes065bd3322daf3178a8bd0d03c4b20e54[0]];
        }
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rrQN(), new rrQN[]{(rrQN)((Object)objectArray[0])}};
        staticFields065bd3322daf3178a8bd0d03c4b20e54 = objectArray;
    }
}

