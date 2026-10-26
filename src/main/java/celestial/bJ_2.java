/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.bX_2;
import celestial.rS_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bJ_2
extends rS_2 {
    private static boolean[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        short[] sArray = new short[2];
        sArray[1] = 2;
        id_byte = sArray;
    }

    public bJ_2(bX_2 bX_22, rfH_2 rfH_22) {
        super(rfH_22);
    }

    static {
        bJ_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x10803766134B89C0L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBDD6FCF7;
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return (Integer)this.id_class[id_byte[0]] == n && (Integer)this.id_class[id_byte[1]] == n3 ? id_break[0] : id_break[1];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{54, -70, -24, -59, -59, -113, -69, -52}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        bJ_2.id_protected();
        bJ_2.id_byte();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_break = blArray;
    }
}

