/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sr_1
extends Enum<Sr_1> {
    private static short[] shorts14662c0f3f2639faacbab26a5987daba;
    public static Object[] staticFields14662c0f3f2639faacbab26a5987daba;
    private static byte[] bytes14662c0f3f2639faacbab26a5987daba;
    public Object[] fields14662c0f3f2639faacbab26a5987daba;
    private static String[] strings14662c0f3f2639faacbab26a5987daba;
    private static boolean[] booleans14662c0f3f2639faacbab26a5987daba;

    private static /* synthetic */ Sr_1[] id_byte() {
        Sr_1[] sr_1Array = new Sr_1[bytes14662c0f3f2639faacbab26a5987daba[0]];
        sr_1Array[Sr_1.booleans14662c0f3f2639faacbab26a5987daba[1]] = (Sr_1)((Object)staticFields14662c0f3f2639faacbab26a5987daba[shorts14662c0f3f2639faacbab26a5987daba[3]]);
        sr_1Array[Sr_1.booleans14662c0f3f2639faacbab26a5987daba[2]] = (Sr_1)((Object)staticFields14662c0f3f2639faacbab26a5987daba[shorts14662c0f3f2639faacbab26a5987daba[4]]);
        sr_1Array[Sr_1.bytes14662c0f3f2639faacbab26a5987daba[1]] = (Sr_1)((Object)staticFields14662c0f3f2639faacbab26a5987daba[shorts14662c0f3f2639faacbab26a5987daba[5]]);
        sr_1Array[Sr_1.bytes14662c0f3f2639faacbab26a5987daba[2]] = (Sr_1)((Object)staticFields14662c0f3f2639faacbab26a5987daba[shorts14662c0f3f2639faacbab26a5987daba[6]]);
        sr_1Array[Sr_1.bytes14662c0f3f2639faacbab26a5987daba[3]] = (Sr_1)((Object)staticFields14662c0f3f2639faacbab26a5987daba[shorts14662c0f3f2639faacbab26a5987daba[7]]);
        return sr_1Array;
    }

    private Sr_1(String string2) {
        this.id_throws();
        String string3 = string2;
        this.fields14662c0f3f2639faacbab26a5987daba[Sr_1.shorts14662c0f3f2639faacbab26a5987daba[2]] = string3;
    }

    static {
        Sr_1.ntfClinit();
    }

    public static Sr_1[] values() {
        return (Sr_1[])((Sr_1[])staticFields14662c0f3f2639faacbab26a5987daba[shorts14662c0f3f2639faacbab26a5987daba[0]]).clone();
    }

    public static Sr_1 valueOf(String string) {
        return Enum.valueOf(Sr_1.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{119, 4, -109, -118, 111, 115, 114, 59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3543BFE2;
    }

    public String id_class() {
        return (String)this.fields14662c0f3f2639faacbab26a5987daba[shorts14662c0f3f2639faacbab26a5987daba[1]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE24DB55EAD02E5A6L;
    }

    public static Sr_1 id_break(String string) {
        Sr_1[] sr_1Array = Sr_1.values();
        int n = sr_1Array.length;
        for (int i = booleans14662c0f3f2639faacbab26a5987daba[0]; i < n; ++i) {
            Sr_1 sr_1 = sr_1Array[i];
            if (!string.toLowerCase().contains("\u0443\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430: " + sr_1.id_class().toLowerCase())) continue;
            return sr_1;
        }
        return null;
    }

    private static void id_break() {
        bytes14662c0f3f2639faacbab26a5987daba = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private void id_throws() {
        if (this.fields14662c0f3f2639faacbab26a5987daba == null) {
            Object[] objectArray = this.fields14662c0f3f2639faacbab26a5987daba = new Object[booleans14662c0f3f2639faacbab26a5987daba[7]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Sr_1.id_private();
        Sr_1.id_catch();
        Sr_1.id_protected();
        Sr_1.id_break();
        Sr_1.id_case();
    }

    private static void id_catch() {
        strings14662c0f3f2639faacbab26a5987daba = new String[]{new String("LEGENDARY"), new String("\u041b\u0435\u0433\u0435\u043d\u0434\u0430\u0440\u043d\u044b\u0439"), new String("ELITE"), new String("\u042d\u043b\u0438\u0442\u043d\u044b\u0439"), new String("RICH"), new String("\u0411\u043e\u0433\u0430\u0442\u044b\u0439"), new String("SOLID"), new String("\u0421\u043e\u043b\u0438\u0434\u043d\u044b\u0439"), new String("COMMON"), new String("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")};
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new Sr_1(strings14662c0f3f2639faacbab26a5987daba[1]), new Sr_1(strings14662c0f3f2639faacbab26a5987daba[3]), new Sr_1(strings14662c0f3f2639faacbab26a5987daba[5]), new Sr_1(strings14662c0f3f2639faacbab26a5987daba[7]), new Sr_1(strings14662c0f3f2639faacbab26a5987daba[9]), new Sr_1[]{(Sr_1)((Object)objectArray[0]), (Sr_1)((Object)objectArray[1]), (Sr_1)((Object)objectArray[2]), (Sr_1)((Object)objectArray[3]), (Sr_1)((Object)objectArray[4])}};
        staticFields14662c0f3f2639faacbab26a5987daba = objectArray;
    }

    private static void id_protected() {
        short[] sArray = new short[8];
        sArray[0] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        shorts14662c0f3f2639faacbab26a5987daba = sArray;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleans14662c0f3f2639faacbab26a5987daba = blArray;
    }
}

