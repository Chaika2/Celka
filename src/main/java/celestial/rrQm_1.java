/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQm_1 {
    public Object[] id_class;
    private static String[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;

    private static void id_byte() {
        id_break = new String[]{new String("e16699bb-2aa8-46da-b5e3-45cbcce29091"), new String("https://login.live.com/oauth20_authorize.srf"), new String("https://login.live.com/oauth20_token.srf"), new String("https://user.auth.xboxlive.com/user/authenticate"), new String("https://xsts.auth.xboxlive.com/xsts/authorize"), new String("https://api.minecraftservices.com/authentication/login_with_xbox"), new String("https://api.minecraftservices.com/minecraft/profile")};
    }

    public rrQm_1() {
        this.id_class();
        Integer n = id_protected[0];
        this.id_class[rrQm_1.id_protected[1]] = n;
        String string = id_break[0];
        this.id_class[rrQm_1.id_protected[2]] = string;
        String string2 = id_break[1];
        this.id_class[rrQm_1.id_protected[3]] = string2;
        String string3 = id_break[2];
        this.id_class[rrQm_1.id_protected[4]] = string3;
        String string4 = id_break[3];
        this.id_class[rrQm_1.id_protected[5]] = string4;
        String string5 = id_break[4];
        this.id_class[rrQm_1.id_protected[6]] = string5;
        String string6 = id_break[5];
        this.id_class[rrQm_1.id_protected[7]] = string6;
        String string7 = id_break[6];
        this.id_class[rrQm_1.id_protected[8]] = string7;
    }

    static {
        rrQm_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB281A2168BF6A832L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-27, -88, -74, 0, 26, 106, 87, 32}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE66A0214;
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrQm_1.id_byte[0]] = id_byte[1];
        }
    }

    private static void id_break() {
        id_byte = new boolean[2];
    }

    private static void id_throws() {
        short[] sArray = new short[9];
        sArray[0] = 25585;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[6] = 5;
        sArray[7] = 6;
        sArray[8] = 7;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQm_1.id_break();
        rrQm_1.id_byte();
        rrQm_1.id_throws();
        rrQm_1.id_protected();
    }

    private static void id_protected() {
        id_throws = new byte[]{8};
    }
}

