/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.Om_1;
import celestial.PX;
import celestial.cb_3;
import celestial.rrQX;
import celestial.w_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class t_1
extends Om_1 {
    private static byte[] id_byte;
    public static Object[] id_class;
    public Object[] id_break;
    private static short[] id_protected;
    private static boolean[] id_throws;

    public t_1() {
        this.id_private();
    }

    static {
        t_1.ntfClinit();
    }

    public void id_class(w_1 w_12) {
        this.id_private();
        w_1 w_13 = w_12;
        this.id_break[t_1.id_protected[12]] = w_13;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2A0409126E26D6E4L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2789FFA4;
    }

    public void id_class(PX pX) {
        this.id_private();
        PX pX2 = pX;
        this.id_break[t_1.id_protected[13]] = pX2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-127, 125, 44, -8, 59, 96, -70, 89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public PX id_class() {
        this.id_private();
        return (PX)this.id_break[id_protected[11]];
    }

    public static t_1 id_class(w_1 w_12, PX pX) {
        w_1 w_13 = w_12;
        ((t_1)t_1.id_class[t_1.id_protected[0]]).id_break[t_1.id_protected[1]] = w_13;
        PX pX2 = pX;
        ((t_1)t_1.id_class[t_1.id_protected[2]]).id_break[t_1.id_protected[3]] = pX2;
        ((t_1)id_class[id_protected[4]]).id_class(id_throws[0]);
        return (t_1)id_class[id_protected[5]];
    }

    public t_1 id_break(w_1 w_12) {
        PX pX = this.id_byte() ? ((cb_3)t_1.id_import.id_class[id_protected[6]]).id_goto() : ((cb_3)t_1.id_import.id_class[id_protected[7]]).rO();
        t_1 t_12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[8]]).id_finally().id_class(t_1.id_class(w_12, pX));
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[9]]).id_class(t_12);
        return t_12;
    }

    public w_1 id_break() {
        this.id_private();
        return (w_1)((Object)this.id_break[id_protected[10]]);
    }

    private static void id_throws() {
        id_byte = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        t_1.id_case();
        t_1.id_protected();
        t_1.id_throws();
        t_1.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new t_1()};
        id_class = objectArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_throws = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[14];
        sArray[3] = 1;
        sArray[6] = 57;
        sArray[7] = 57;
        sArray[11] = 1;
        sArray[13] = 1;
        id_protected = sArray;
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }
}

