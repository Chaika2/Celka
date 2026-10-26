/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EC;
import celestial.EZ;
import celestial.Ev_1;
import celestial.GB;
import celestial.Mr_1;
import celestial.rU_2;
import celestial.rpr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class EI
extends EC {
    private static short[] shortsf9676270e1423956913eb0ad474f0e83;
    private static boolean[] booleansf9676270e1423956913eb0ad474f0e83;

    public EI(int n2, int n3, int n4, boolean bl, boolean bl2) {
    }

    static {
        EI.ntfClinit();
    }

    @Override
    public void id_class(EZ eZ, int n, int n2, int n3, Mr_1 mr_1) {
        GB.id_class(eZ, n, n2, n3, n + booleansf9676270e1423956913eb0ad474f0e83[0], n3 + booleansf9676270e1423956913eb0ad474f0e83[1], mr_1);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBA37159D09B45502L;
    }

    private static void id_class() {
        booleansf9676270e1423956913eb0ad474f0e83 = new boolean[]{true, true};
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        Mr_1 mr_1 = new Mr_1();
        this.id_class(eZ, (Integer)rU_22.id_break[shortsf9676270e1423956913eb0ad474f0e83[0]], (Integer)rU_22.id_break[shortsf9676270e1423956913eb0ad474f0e83[1]], (Integer)rU_22.id_break[shortsf9676270e1423956913eb0ad474f0e83[2]], mr_1);
        return new GB(eZ.id_break(), rU_22, rpr_3.SOUTH, rpr_3.EAST, (Integer)mr_1.id_class[shortsf9676270e1423956913eb0ad474f0e83[3]] - (Integer)rU_22.id_break[shortsf9676270e1423956913eb0ad474f0e83[4]]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x10B58D87;
    }

    private static void id_break() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 1;
        shortsf9676270e1423956913eb0ad474f0e83 = sArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{40, 102, 85, 52, 79, -93, 26, 62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        EI.id_class();
        EI.id_break();
    }
}

