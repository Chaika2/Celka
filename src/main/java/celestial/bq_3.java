/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.PP;
import celestial.Ps_1;
import celestial.rz_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class bq_3
implements PP,
rz_3 {
    private static short[] id_break;
    private static boolean[] id_throws;
    private static byte[] id_catch;
    public Object[] id_case;

    public bq_3(C_class c_class) {
        this.id_finally();
        C_class c_class2 = c_class;
        this.id_case[bq_3.id_break[0]] = c_class2;
        Ps_1 ps_1 = c_class.id_throw();
        this.id_case[bq_3.id_break[1]] = ps_1;
    }

    static {
        bq_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6E02813694F8A0A4L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{122, 2, -58, 54, -48, -2, 7, 61}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB3BB5DDE;
    }

    private static /* synthetic */ void ntfClinit() {
        bq_3.id_extends();
        bq_3.id_implements();
        bq_3.id_final();
    }

    private void id_finally() {
        if (this.id_case == null) {
            Object[] objectArray = this.id_case = new Object[id_catch[0]];
        }
    }

    @Override
    public boolean id_catch() {
        return id_throws[0];
    }

    private static void id_extends() {
        id_throws = new boolean[1];
    }

    private static void id_implements() {
        short[] sArray = new short[3];
        sArray[1] = 1;
        id_break = sArray;
    }

    @Override
    public void id_protected() {
        ((C_class)this.id_case[id_break[2]]).s().id_native();
    }

    private static void id_final() {
        id_catch = new byte[]{2};
    }
}

