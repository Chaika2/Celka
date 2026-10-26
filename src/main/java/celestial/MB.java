/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MB
extends Enum<MB> {
    private static String[] strings66e4c6f8de393faf832676ed33680249;
    public static Object[] staticFields66e4c6f8de393faf832676ed33680249;
    private static short[] shorts66e4c6f8de393faf832676ed33680249;
    public Object[] fields66e4c6f8de393faf832676ed33680249;
    private static boolean[] booleans66e4c6f8de393faf832676ed33680249;
    private static byte[] bytes66e4c6f8de393faf832676ed33680249;

    private static void id_byte() {
        bytes66e4c6f8de393faf832676ed33680249 = new byte[]{2, 2, 4, 2, 3, 2, 2, 2, 3, 3, 3, 4, 5};
    }

    private MB(int n2) {
        this.id_catch();
        boolean[] blArray = new boolean[bytes66e4c6f8de393faf832676ed33680249[0]];
        blArray[MB.booleans66e4c6f8de393faf832676ed33680249[0]] = (n2 & bytes66e4c6f8de393faf832676ed33680249[1]) != 0 ? booleans66e4c6f8de393faf832676ed33680249[1] : booleans66e4c6f8de393faf832676ed33680249[2];
        blArray[MB.booleans66e4c6f8de393faf832676ed33680249[3]] = (n2 & booleans66e4c6f8de393faf832676ed33680249[4]) != 0 ? booleans66e4c6f8de393faf832676ed33680249[5] : booleans66e4c6f8de393faf832676ed33680249[6];
        boolean[] blArray2 = blArray;
        this.fields66e4c6f8de393faf832676ed33680249[MB.shorts66e4c6f8de393faf832676ed33680249[1]] = blArray2;
    }

    static {
        MB.ntfClinit();
    }

    public static MB[] values() {
        return (MB[])((MB[])staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[0]]).clone();
    }

    public static MB valueOf(String string) {
        return Enum.valueOf(MB.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-56, 60, -41, 54, 9, -117, -21, -13}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6B65B6B9;
    }

    public static MB id_class(boolean bl, boolean bl2) {
        return bl ? (bl2 ? (MB)((Object)staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[3]]) : (MB)((Object)staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[4]])) : (bl2 ? (MB)((Object)staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[5]]) : (MB)((Object)staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[6]]));
    }

    public boolean[] id_class() {
        return (boolean[])this.fields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[2]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x151D0C09555E1708L;
    }

    private static void id_break() {
        strings66e4c6f8de393faf832676ed33680249 = new String[]{new String("AIR"), new String("WATER"), new String("AVOID"), new String("SOLID")};
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[16];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[15] = true;
        booleans66e4c6f8de393faf832676ed33680249 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        MB.id_throws();
        MB.id_break();
        MB.id_case();
        MB.id_byte();
        MB.id_protected();
    }

    private void id_catch() {
        if (this.fields66e4c6f8de393faf832676ed33680249 == null) {
            Object[] objectArray = this.fields66e4c6f8de393faf832676ed33680249 = new Object[booleans66e4c6f8de393faf832676ed33680249[15]];
        }
    }

    private static void id_case() {
        short[] sArray = new short[11];
        sArray[0] = 4;
        sArray[3] = 3;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 3;
        shorts66e4c6f8de393faf832676ed33680249 = sArray;
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new MB(0), new MB(1), new MB(2), new MB(3), new MB[]{(MB)((Object)objectArray[0]), (MB)((Object)objectArray[1]), (MB)((Object)objectArray[2]), (MB)((Object)objectArray[3])}};
        staticFields66e4c6f8de393faf832676ed33680249 = objectArray;
    }

    private static /* synthetic */ MB[] id_private() {
        MB[] mBArray = new MB[bytes66e4c6f8de393faf832676ed33680249[2]];
        mBArray[MB.booleans66e4c6f8de393faf832676ed33680249[7]] = (MB)((Object)staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[7]]);
        mBArray[MB.booleans66e4c6f8de393faf832676ed33680249[8]] = (MB)((Object)staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[8]]);
        mBArray[MB.bytes66e4c6f8de393faf832676ed33680249[3]] = (MB)((Object)staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[9]]);
        mBArray[MB.bytes66e4c6f8de393faf832676ed33680249[4]] = (MB)((Object)staticFields66e4c6f8de393faf832676ed33680249[shorts66e4c6f8de393faf832676ed33680249[10]]);
        return mBArray;
    }
}

