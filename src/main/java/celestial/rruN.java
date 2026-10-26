/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruN
extends Enum<rruN> {
    private static short[] shorts36ebb780c771397e903bfcb65c8ed147;
    private static String[] strings36ebb780c771397e903bfcb65c8ed147;
    public Object[] fields36ebb780c771397e903bfcb65c8ed147;
    private static boolean[] booleans36ebb780c771397e903bfcb65c8ed147;
    private static byte[] bytes36ebb780c771397e903bfcb65c8ed147;
    public static Object[] staticFields36ebb780c771397e903bfcb65c8ed147;

    private static void id_byte() {
        short[] sArray = new short[8];
        sArray[0] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        shorts36ebb780c771397e903bfcb65c8ed147 = sArray;
    }

    private rruN(String string2) {
        this.id_break();
        String string3 = string2;
        this.fields36ebb780c771397e903bfcb65c8ed147[rruN.shorts36ebb780c771397e903bfcb65c8ed147[2]] = string3;
    }

    static {
        rruN.ntfClinit();
    }

    public static rruN[] values() {
        return (rruN[])((rruN[])staticFields36ebb780c771397e903bfcb65c8ed147[shorts36ebb780c771397e903bfcb65c8ed147[0]]).clone();
    }

    public static rruN valueOf(String string) {
        return Enum.valueOf(rruN.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCA86643A61B3BE36L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-103, 52, -37, -4, -59, 86, 45, -125}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x34756D72;
    }

    public String id_class() {
        return (String)this.fields36ebb780c771397e903bfcb65c8ed147[shorts36ebb780c771397e903bfcb65c8ed147[1]];
    }

    private void id_break() {
        if (this.fields36ebb780c771397e903bfcb65c8ed147 == null) {
            Object[] objectArray = this.fields36ebb780c771397e903bfcb65c8ed147 = new Object[booleans36ebb780c771397e903bfcb65c8ed147[6]];
        }
    }

    private static void id_throws() {
        strings36ebb780c771397e903bfcb65c8ed147 = new String[]{new String("ADDITION"), new String("[+]"), new String("IMPROVEMENT"), new String("[*]"), new String("RENAME"), new String("[~]"), new String("FIX"), new String("[/]"), new String("REMOVAL"), new String("[-]")};
    }

    private static /* synthetic */ void ntfClinit() {
        rruN.id_protected();
        rruN.id_throws();
        rruN.id_byte();
        rruN.id_catch();
        rruN.id_private();
    }

    private static void id_catch() {
        bytes36ebb780c771397e903bfcb65c8ed147 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private static /* synthetic */ rruN[] id_case() {
        rruN[] rruNArray = new rruN[bytes36ebb780c771397e903bfcb65c8ed147[0]];
        rruNArray[rruN.booleans36ebb780c771397e903bfcb65c8ed147[0]] = (rruN)((Object)staticFields36ebb780c771397e903bfcb65c8ed147[shorts36ebb780c771397e903bfcb65c8ed147[3]]);
        rruNArray[rruN.booleans36ebb780c771397e903bfcb65c8ed147[1]] = (rruN)((Object)staticFields36ebb780c771397e903bfcb65c8ed147[shorts36ebb780c771397e903bfcb65c8ed147[4]]);
        rruNArray[rruN.bytes36ebb780c771397e903bfcb65c8ed147[1]] = (rruN)((Object)staticFields36ebb780c771397e903bfcb65c8ed147[shorts36ebb780c771397e903bfcb65c8ed147[5]]);
        rruNArray[rruN.bytes36ebb780c771397e903bfcb65c8ed147[2]] = (rruN)((Object)staticFields36ebb780c771397e903bfcb65c8ed147[shorts36ebb780c771397e903bfcb65c8ed147[6]]);
        rruNArray[rruN.bytes36ebb780c771397e903bfcb65c8ed147[3]] = (rruN)((Object)staticFields36ebb780c771397e903bfcb65c8ed147[shorts36ebb780c771397e903bfcb65c8ed147[7]]);
        return rruNArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleans36ebb780c771397e903bfcb65c8ed147 = blArray;
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new rruN(strings36ebb780c771397e903bfcb65c8ed147[1]), new rruN(strings36ebb780c771397e903bfcb65c8ed147[3]), new rruN(strings36ebb780c771397e903bfcb65c8ed147[5]), new rruN(strings36ebb780c771397e903bfcb65c8ed147[7]), new rruN(strings36ebb780c771397e903bfcb65c8ed147[9]), new rruN[]{(rruN)((Object)objectArray[0]), (rruN)((Object)objectArray[1]), (rruN)((Object)objectArray[2]), (rruN)((Object)objectArray[3]), (rruN)((Object)objectArray[4])}};
        staticFields36ebb780c771397e903bfcb65c8ed147 = objectArray;
    }
}

