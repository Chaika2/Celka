/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sx_1
extends Enum<Sx_1> {
    private static short[] shorts367340c5841f3ba4814e59f96eff4d12;
    private static String[] strings367340c5841f3ba4814e59f96eff4d12;
    public static Object[] staticFields367340c5841f3ba4814e59f96eff4d12;
    private static boolean[] booleans367340c5841f3ba4814e59f96eff4d12;
    public Object[] fields367340c5841f3ba4814e59f96eff4d12;
    private static byte[] bytes367340c5841f3ba4814e59f96eff4d12;

    private void id_byte() {
        if (this.fields367340c5841f3ba4814e59f96eff4d12 == null) {
            Object[] objectArray = this.fields367340c5841f3ba4814e59f96eff4d12 = new Object[booleans367340c5841f3ba4814e59f96eff4d12[7]];
        }
    }

    private Sx_1(String string2) {
        this.id_byte();
        String string3 = string2;
        this.fields367340c5841f3ba4814e59f96eff4d12[Sx_1.shorts367340c5841f3ba4814e59f96eff4d12[2]] = string3;
    }

    static {
        Sx_1.ntfClinit();
    }

    public static Sx_1[] values() {
        return (Sx_1[])((Sx_1[])staticFields367340c5841f3ba4814e59f96eff4d12[shorts367340c5841f3ba4814e59f96eff4d12[0]]).clone();
    }

    public static Sx_1 valueOf(String string) {
        return Enum.valueOf(Sx_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x40246622;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAED5453DB9AB89E8L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{5, 79, -107, -73, -115, 77, -79, -56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_class() {
        return (String)this.fields367340c5841f3ba4814e59f96eff4d12[shorts367340c5841f3ba4814e59f96eff4d12[1]];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleans367340c5841f3ba4814e59f96eff4d12 = blArray;
    }

    public static Sx_1 id_break(String string) {
        Sx_1[] sx_1Array = Sx_1.values();
        int n = sx_1Array.length;
        for (int i = booleans367340c5841f3ba4814e59f96eff4d12[0]; i < n; ++i) {
            Sx_1 sx_1 = sx_1Array[i];
            if (!string.toLowerCase().contains(sx_1.id_class().toLowerCase())) continue;
            return sx_1;
        }
        return null;
    }

    private static /* synthetic */ Sx_1[] id_throws() {
        Sx_1[] sx_1Array = new Sx_1[bytes367340c5841f3ba4814e59f96eff4d12[0]];
        sx_1Array[Sx_1.booleans367340c5841f3ba4814e59f96eff4d12[1]] = (Sx_1)((Object)staticFields367340c5841f3ba4814e59f96eff4d12[shorts367340c5841f3ba4814e59f96eff4d12[3]]);
        sx_1Array[Sx_1.booleans367340c5841f3ba4814e59f96eff4d12[2]] = (Sx_1)((Object)staticFields367340c5841f3ba4814e59f96eff4d12[shorts367340c5841f3ba4814e59f96eff4d12[4]]);
        sx_1Array[Sx_1.bytes367340c5841f3ba4814e59f96eff4d12[1]] = (Sx_1)((Object)staticFields367340c5841f3ba4814e59f96eff4d12[shorts367340c5841f3ba4814e59f96eff4d12[5]]);
        sx_1Array[Sx_1.bytes367340c5841f3ba4814e59f96eff4d12[2]] = (Sx_1)((Object)staticFields367340c5841f3ba4814e59f96eff4d12[shorts367340c5841f3ba4814e59f96eff4d12[6]]);
        sx_1Array[Sx_1.bytes367340c5841f3ba4814e59f96eff4d12[3]] = (Sx_1)((Object)staticFields367340c5841f3ba4814e59f96eff4d12[shorts367340c5841f3ba4814e59f96eff4d12[7]]);
        return sx_1Array;
    }

    private static /* synthetic */ void ntfClinit() {
        Sx_1.id_break();
        Sx_1.id_case();
        Sx_1.id_catch();
        Sx_1.id_protected();
        Sx_1.id_private();
    }

    private static void id_catch() {
        short[] sArray = new short[8];
        sArray[0] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        shorts367340c5841f3ba4814e59f96eff4d12 = sArray;
    }

    private static void id_case() {
        strings367340c5841f3ba4814e59f96eff4d12 = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439"), new String("MYTHIC"), new String("\u041c\u0438\u0444\u0438\u0447\u0435\u0441\u043a\u0438\u0439"), new String("EPIC"), new String("\u042d\u043f\u0438\u0447\u0435\u0441\u043a\u0438\u0439"), new String("RARE"), new String("\u0420\u0435\u0434\u043a\u0438\u0439"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")};
    }

    private static void id_protected() {
        bytes367340c5841f3ba4814e59f96eff4d12 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new Sx_1(strings367340c5841f3ba4814e59f96eff4d12[1]), new Sx_1(strings367340c5841f3ba4814e59f96eff4d12[3]), new Sx_1(strings367340c5841f3ba4814e59f96eff4d12[5]), new Sx_1(strings367340c5841f3ba4814e59f96eff4d12[7]), new Sx_1(strings367340c5841f3ba4814e59f96eff4d12[9]), new Sx_1[]{(Sx_1)((Object)objectArray[0]), (Sx_1)((Object)objectArray[1]), (Sx_1)((Object)objectArray[2]), (Sx_1)((Object)objectArray[3]), (Sx_1)((Object)objectArray[4])}};
        staticFields367340c5841f3ba4814e59f96eff4d12 = objectArray;
    }
}

