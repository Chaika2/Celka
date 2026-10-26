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

public class rhW_2
extends Enum<rhW_2> {
    public static Object[] staticFields4c1a1e3ca1b33044b12dba3caf94435e;
    private static byte[] bytes4c1a1e3ca1b33044b12dba3caf94435e;
    private static short[] shorts4c1a1e3ca1b33044b12dba3caf94435e;
    private static String[] strings4c1a1e3ca1b33044b12dba3caf94435e;
    public Object[] fields4c1a1e3ca1b33044b12dba3caf94435e;
    private static boolean[] booleans4c1a1e3ca1b33044b12dba3caf94435e;

    private static /* synthetic */ rhW_2[] id_byte() {
        rhW_2[] rhW_2Array = new rhW_2[bytes4c1a1e3ca1b33044b12dba3caf94435e[0]];
        rhW_2Array[rhW_2.booleans4c1a1e3ca1b33044b12dba3caf94435e[0]] = (rhW_2)((Object)staticFields4c1a1e3ca1b33044b12dba3caf94435e[shorts4c1a1e3ca1b33044b12dba3caf94435e[4]]);
        rhW_2Array[rhW_2.booleans4c1a1e3ca1b33044b12dba3caf94435e[1]] = (rhW_2)((Object)staticFields4c1a1e3ca1b33044b12dba3caf94435e[shorts4c1a1e3ca1b33044b12dba3caf94435e[5]]);
        rhW_2Array[rhW_2.bytes4c1a1e3ca1b33044b12dba3caf94435e[1]] = (rhW_2)((Object)staticFields4c1a1e3ca1b33044b12dba3caf94435e[shorts4c1a1e3ca1b33044b12dba3caf94435e[6]]);
        rhW_2Array[rhW_2.bytes4c1a1e3ca1b33044b12dba3caf94435e[2]] = (rhW_2)((Object)staticFields4c1a1e3ca1b33044b12dba3caf94435e[shorts4c1a1e3ca1b33044b12dba3caf94435e[7]]);
        rhW_2Array[rhW_2.bytes4c1a1e3ca1b33044b12dba3caf94435e[3]] = (rhW_2)((Object)staticFields4c1a1e3ca1b33044b12dba3caf94435e[shorts4c1a1e3ca1b33044b12dba3caf94435e[8]]);
        rhW_2Array[rhW_2.bytes4c1a1e3ca1b33044b12dba3caf94435e[4]] = (rhW_2)((Object)staticFields4c1a1e3ca1b33044b12dba3caf94435e[shorts4c1a1e3ca1b33044b12dba3caf94435e[9]]);
        return rhW_2Array;
    }

    private rhW_2() {
        this.id_break();
        Object var7_3 = null;
        this.fields4c1a1e3ca1b33044b12dba3caf94435e[rhW_2.shorts4c1a1e3ca1b33044b12dba3caf94435e[1]] = var7_3;
    }

    private rhW_2(rgP_2 rgP_22) {
        this.id_break();
        rgP_2 rgP_23 = rgP_22;
        this.fields4c1a1e3ca1b33044b12dba3caf94435e[rhW_2.shorts4c1a1e3ca1b33044b12dba3caf94435e[2]] = rgP_23;
    }

    static {
        rhW_2.ntfClinit();
    }

    public static rhW_2[] values() {
        return (rhW_2[])((rhW_2[])staticFields4c1a1e3ca1b33044b12dba3caf94435e[shorts4c1a1e3ca1b33044b12dba3caf94435e[0]]).clone();
    }

    public static rhW_2 valueOf(String string) {
        return Enum.valueOf(rhW_2.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x39489574;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{88, -52, -107, -57, -120, -86, 65, 123}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rgP_2 id_class() {
        return (rgP_2)this.fields4c1a1e3ca1b33044b12dba3caf94435e[shorts4c1a1e3ca1b33044b12dba3caf94435e[3]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x318546F87A49A469L;
    }

    private void id_break() {
        if (this.fields4c1a1e3ca1b33044b12dba3caf94435e == null) {
            Object[] objectArray = this.fields4c1a1e3ca1b33044b12dba3caf94435e = new Object[booleans4c1a1e3ca1b33044b12dba3caf94435e[6]];
        }
    }

    private static void id_throws() {
        strings4c1a1e3ca1b33044b12dba3caf94435e = new String[]{new String("NOT_POSSIBLE_HERE"), new String("NOT_POSSIBLE_NOW"), new String("block.minecraft.bed.no_sleep"), new String("TOO_FAR_AWAY"), new String("block.minecraft.bed.too_far_away"), new String("OBSTRUCTED"), new String("block.minecraft.bed.obstructed"), new String("OTHER_PROBLEM"), new String("NOT_SAFE"), new String("block.minecraft.bed.not_safe")};
    }

    private static /* synthetic */ void ntfClinit() {
        rhW_2.id_protected();
        rhW_2.id_throws();
        rhW_2.id_case();
        rhW_2.id_private();
        rhW_2.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray;
        objectArray = new Object[]{new rhW_2(), new rhW_2(new rgn_3(strings4c1a1e3ca1b33044b12dba3caf94435e[2])), new rhW_2(new rgn_3(strings4c1a1e3ca1b33044b12dba3caf94435e[4])), new rhW_2(new rgn_3(strings4c1a1e3ca1b33044b12dba3caf94435e[6])), new rhW_2(), new rhW_2(new rgn_3(strings4c1a1e3ca1b33044b12dba3caf94435e[9])), new rhW_2[]{(rhW_2)((Object)objectArray[0]), (rhW_2)((Object)objectArray[1]), (rhW_2)((Object)objectArray[2]), (rhW_2)((Object)objectArray[3]), (rhW_2)((Object)objectArray[4]), (rhW_2)((Object)objectArray[5])}};
        staticFields4c1a1e3ca1b33044b12dba3caf94435e = objectArray;
    }

    private static void id_case() {
        short[] sArray = new short[10];
        sArray[0] = 6;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[8] = 4;
        sArray[9] = 5;
        shorts4c1a1e3ca1b33044b12dba3caf94435e = sArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleans4c1a1e3ca1b33044b12dba3caf94435e = blArray;
    }

    private static void id_private() {
        bytes4c1a1e3ca1b33044b12dba3caf94435e = new byte[]{6, 2, 3, 4, 5, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7};
    }
}

