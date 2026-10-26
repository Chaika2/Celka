/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.rC_2;
import celestial.rn_3;
import celestial.rz_3;
import celestial.sN_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sc_3
implements rz_3 {
    private static short[] id_byte;
    private static String[] id_protected;
    public Object[] id_break;
    private static byte[] id_throws;
    private static boolean[] id_case;
    private static double[] id_catch;

    @Override
    public boolean id_byte() {
        return ((boolean[])this.id_break[id_byte[2]])[id_case[0]];
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public sc_3(sN_2 sN_22, boolean[] blArray, C_case c_case) {
        this.id_extends();
        boolean[] blArray2 = blArray;
        this.id_break[sc_3.id_byte[0]] = blArray2;
        C_case c_case2 = c_case;
        this.id_break[sc_3.id_byte[1]] = c_case2;
    }

    static {
        sc_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-9, -25, -40, -67, -105, 97, -110, 95}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCAB23BF683AA56E9L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF7DC8B78;
    }

    @Override
    public String id_class() {
        return id_protected[0];
    }

    @Override
    public rn_3 id_class(boolean bl, boolean bl2) {
        ((C_case)this.id_break[id_byte[3]]).id_new().id_class();
        return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_byte[4]]));
    }

    private static /* synthetic */ void ntfClinit() {
        sc_3.id_implements();
        sc_3.id_volatile();
        sc_3.id_native();
        sc_3.id_finally();
        sc_3.id_private();
    }

    private static void id_finally() {
        id_catch = new double[1];
    }

    @Override
    public boolean id_catch() {
        return id_case[1];
    }

    private void id_extends() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    @Override
    public double id_case() {
        return id_catch[0];
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_case = blArray;
    }

    @Override
    public void id_protected() {
    }

    private static void id_private() {
        id_throws = new byte[]{2};
    }

    private static void id_volatile() {
        id_protected = new String[]{new String("Pause/Resume Commands")};
    }

    private static void id_native() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        id_byte = sArray;
    }
}

