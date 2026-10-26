/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rgn_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcB_2
extends Enum<rrcB_2> {
    private static short[] shorts98d16a36ad1c33518cd334d8bca22c4a;
    private static byte[] bytes98d16a36ad1c33518cd334d8bca22c4a;
    public Object[] fields98d16a36ad1c33518cd334d8bca22c4a;
    public static Object[] staticFields98d16a36ad1c33518cd334d8bca22c4a;
    private static boolean[] booleans98d16a36ad1c33518cd334d8bca22c4a;
    private static String[] strings98d16a36ad1c33518cd334d8bca22c4a;

    private static /* synthetic */ rrcB_2[] id_byte(int n) {
        return new rrcB_2[n];
    }

    public String id_byte() {
        return (String)this.fields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[8]];
    }

    private rrcB_2(int n2, String string2) {
        this.id_implements();
        Integer n3 = n2;
        this.fields98d16a36ad1c33518cd334d8bca22c4a[rrcB_2.shorts98d16a36ad1c33518cd334d8bca22c4a[1]] = n3;
        String string3 = string2;
        this.fields98d16a36ad1c33518cd334d8bca22c4a[rrcB_2.shorts98d16a36ad1c33518cd334d8bca22c4a[2]] = string3;
    }

    static {
        rrcB_2.ntfClinit();
    }

    public static rrcB_2[] values() {
        return (rrcB_2[])((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[0]]).clone();
    }

    public static rrcB_2 valueOf(String string) {
        return Enum.valueOf(rrcB_2.class, string);
    }

    public static rrcB_2 id_class(int n) {
        return ((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[4]])[n % ((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[5]]).length];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-64, 85, 76, -117, -95, 105, 87, -35}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rgP_2 id_class() {
        return new rgn_3("autobuy.refreshType." + (String)this.fields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[6]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCBC1FB3E166800CFL;
    }

    public int id_break() {
        return (Integer)this.fields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[3]];
    }

    public static rrcB_2 id_break(String string) {
        rrcB_2[] rrcB_2Array = rrcB_2.values();
        int n = rrcB_2Array.length;
        for (int i = booleans98d16a36ad1c33518cd334d8bca22c4a[0]; i < n; ++i) {
            rrcB_2 rrcB_22 = rrcB_2Array[i];
            if (!((String)rrcB_22.fields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[7]]).equals(string)) continue;
            return rrcB_22;
        }
        return null;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCA495E8D;
    }

    private static void id_throws() {
        short[] sArray = new short[14];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[4] = 2;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[11] = 2;
        sArray[13] = 1;
        shorts98d16a36ad1c33518cd334d8bca22c4a = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrcB_2.id_extends();
        rrcB_2.id_private();
        rrcB_2.id_throws();
        rrcB_2.id_catch();
        rrcB_2.id_case();
    }

    private static /* synthetic */ rrcB_2[] id_finally() {
        rrcB_2[] rrcB_2Array = new rrcB_2[bytes98d16a36ad1c33518cd334d8bca22c4a[0]];
        rrcB_2Array[rrcB_2.booleans98d16a36ad1c33518cd334d8bca22c4a[2]] = (rrcB_2)((Object)staticFields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[12]]);
        rrcB_2Array[rrcB_2.booleans98d16a36ad1c33518cd334d8bca22c4a[3]] = (rrcB_2)((Object)staticFields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[13]]);
        return rrcB_2Array;
    }

    private static void id_catch() {
        bytes98d16a36ad1c33518cd334d8bca22c4a = new byte[]{2, 3, 2, 2, 4};
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[12];
        blArray[1] = true;
        blArray[3] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        booleans98d16a36ad1c33518cd334d8bca22c4a = blArray;
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rrcB_2(0, strings98d16a36ad1c33518cd334d8bca22c4a[1]), new rrcB_2(1, strings98d16a36ad1c33518cd334d8bca22c4a[3]), new rrcB_2[]{(rrcB_2)((Object)objectArray[0]), (rrcB_2)((Object)objectArray[1])}, new rrcB_2[]{(rrcB_2)((Object)objectArray[0]), (rrcB_2)((Object)objectArray[1])}};
        staticFields98d16a36ad1c33518cd334d8bca22c4a = objectArray;
    }

    private void id_implements() {
        if (this.fields98d16a36ad1c33518cd334d8bca22c4a == null) {
            Object[] objectArray = this.fields98d16a36ad1c33518cd334d8bca22c4a = new Object[bytes98d16a36ad1c33518cd334d8bca22c4a[3]];
            objectArray[rrcB_2.booleans98d16a36ad1c33518cd334d8bca22c4a[10]] = booleans98d16a36ad1c33518cd334d8bca22c4a[11];
        }
    }

    public rrcB_2 id_protected() {
        return ((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[9]])[((Integer)this.fields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[10]] + booleans98d16a36ad1c33518cd334d8bca22c4a[1]) % ((rrcB_2[])staticFields98d16a36ad1c33518cd334d8bca22c4a[shorts98d16a36ad1c33518cd334d8bca22c4a[11]]).length];
    }

    private static void id_private() {
        strings98d16a36ad1c33518cd334d8bca22c4a = new String[]{new String("DEFAULT"), new String("default"), new String("SMART"), new String("smart")};
    }
}

