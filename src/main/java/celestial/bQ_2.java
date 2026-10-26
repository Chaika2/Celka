/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.bW_2;
import celestial.rS_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bQ_2
extends rS_2 {
    private static short[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        short[] sArray = new short[2];
        sArray[1] = 2;
        id_break = sArray;
    }

    public bQ_2(bW_2 bW_22, rfH_2 rfH_22) {
        super(rfH_22);
    }

    static {
        bQ_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x814558C2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF360DE4BCF75638FL;
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return (Integer)this.id_class[id_break[0]] == n && (Integer)this.id_class[id_break[1]] == n3 ? id_byte[0] : id_byte[1];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-36, -63, -58, 88, 34, -100, 68, 33}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        bQ_2.id_protected();
        bQ_2.id_byte();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_byte = blArray;
    }
}

