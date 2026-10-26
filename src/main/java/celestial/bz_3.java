/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.bC_2;
import celestial.bZ_2;
import celestial.bc_3;
import celestial.bn_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.EnumMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bz_3
extends EnumMap<bc_3, bZ_2> {
    private static short[] id_class;

    public bz_3(Class clazz) {
        super(clazz);
        this.put((bc_3)((Object)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_class[0]]), new bC_2());
        this.put((bc_3)((Object)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_class[1]]), new bn_3());
    }

    static {
        bz_3.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x491F5672;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2FD3C38F21340CE8L;
    }

    private static void id_class() {
        short[] sArray = new short[2];
        sArray[1] = 1;
        id_class = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-14, 126, -22, 14, -54, 14, 45, 7}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

