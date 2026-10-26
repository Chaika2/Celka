/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GI
extends Enum<GI> {
    private static boolean[] booleans7b6dab6bace836ec83a51cd91190c39e;
    public static Object[] staticFields7b6dab6bace836ec83a51cd91190c39e;
    private static String[] strings7b6dab6bace836ec83a51cd91190c39e;
    private static short[] shorts7b6dab6bace836ec83a51cd91190c39e;
    private static byte[] bytes7b6dab6bace836ec83a51cd91190c39e;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans7b6dab6bace836ec83a51cd91190c39e = blArray;
    }

    static {
        GI.ntfClinit();
    }

    public static GI[] values() {
        return (GI[])((GI[])staticFields7b6dab6bace836ec83a51cd91190c39e[shorts7b6dab6bace836ec83a51cd91190c39e[0]]).clone();
    }

    public static GI valueOf(String string) {
        return Enum.valueOf(GI.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-64, 91, 82, 106, -79, -88, 98, -120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x29CA5D614ECF694BL;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new GI(), new GI(), new GI(), new GI[]{(GI)((Object)objectArray[0]), (GI)((Object)objectArray[1]), (GI)((Object)objectArray[2])}};
        staticFields7b6dab6bace836ec83a51cd91190c39e = objectArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB726C3DD;
    }

    private static void id_break() {
        bytes7b6dab6bace836ec83a51cd91190c39e = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static /* synthetic */ GI[] id_throws() {
        GI[] gIArray = new GI[bytes7b6dab6bace836ec83a51cd91190c39e[0]];
        gIArray[GI.booleans7b6dab6bace836ec83a51cd91190c39e[0]] = (GI)((Object)staticFields7b6dab6bace836ec83a51cd91190c39e[shorts7b6dab6bace836ec83a51cd91190c39e[1]]);
        gIArray[GI.booleans7b6dab6bace836ec83a51cd91190c39e[1]] = (GI)((Object)staticFields7b6dab6bace836ec83a51cd91190c39e[shorts7b6dab6bace836ec83a51cd91190c39e[2]]);
        gIArray[GI.bytes7b6dab6bace836ec83a51cd91190c39e[1]] = (GI)((Object)staticFields7b6dab6bace836ec83a51cd91190c39e[shorts7b6dab6bace836ec83a51cd91190c39e[3]]);
        return gIArray;
    }

    private static /* synthetic */ void ntfClinit() {
        GI.id_byte();
        GI.id_case();
        GI.id_protected();
        GI.id_break();
        GI.id_class();
    }

    private static void id_case() {
        strings7b6dab6bace836ec83a51cd91190c39e = new String[]{new String("EXPLORED"), new String("NOT_EXPLORED"), new String("UNKNOWN")};
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts7b6dab6bace836ec83a51cd91190c39e = sArray;
    }
}

