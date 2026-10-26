/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.movement.Spider;
import celestial.rrAo_1;
import celestial.rrTF;
import celestial.rrfj_3;
import celestial.rrfw_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlO_2
extends rrTF<Spider> {
    private static short[] id_break;
    public Object[] id_class;
    private static double[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        short[] sArray = new short[6];
        sArray[1] = 57;
        sArray[2] = 23;
        sArray[4] = 57;
        id_break = sArray;
    }

    public rrlO_2(Spider spider) {
        super(spider);
        this.id_break();
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_class[rrlO_2.id_break[0]] = rrfw_32;
    }

    static {
        rrlO_2.ntfClinit();
    }

    @EventTarget
    public void id_class(rrAo_1 rrAo_12) {
        this.id_break();
        if (((Boolean)((cb_3)rrlO_2.id_import.id_class[rrlO_2.id_break[1]]).id_throws[id_break[2]]).booleanValue() && rrfj_3.id_catch() && ((rrfw_3)this.id_class[id_break[3]]).id_class(id_byte[0])) {
            rrAo_12.id_break(id_protected[0]);
            ((cb_3)rrlO_2.id_import.id_class[id_break[4]]).sl();
            ((rrfw_3)this.id_class[id_break[5]]).id_class();
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4E3E12E2BF2C5E42L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6FD1D247;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{102, 96, -106, -111, -76, 60, -93, -81}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_byte = new double[]{150.0};
    }

    private void id_break() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrlO_2.id_protected();
        rrlO_2.id_byte();
        rrlO_2.id_class();
    }

    private static void id_protected() {
        id_protected = new boolean[]{true, true};
    }
}

