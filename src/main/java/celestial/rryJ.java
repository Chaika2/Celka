/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.RandomStringUtils
 */
package celestial;

import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.util.AntiAfk;
import celestial.q_1;
import celestial.rrTF;
import celestial.rrfZ_2;
import celestial.rrfj_3;
import celestial.rrfw_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.RandomStringUtils;

public class rryJ
extends rrTF<AntiAfk> {
    private static double[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    public rryJ(AntiAfk antiAfk) {
        super(antiAfk);
        this.id_byte();
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_class[rryJ.id_protected[0]] = rrfw_32;
    }

    static {
        rryJ.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-92, 56, -68, 2, 27, 126, 114, 89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2D2F171FFD7875BEL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDF09C4C;
    }

    private static void id_class() {
        id_byte = new boolean[]{true, true};
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_byte();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[1]])) {
            if (!rrfj_3.id_catch() && !rrfZ_2.id_byte()) {
                if (((rrfw_3)this.id_class[id_protected[2]]).id_class(id_break[0])) {
                    ((cb_3)rryJ.id_import.id_class[id_protected[3]]).id_case("/ho" + RandomStringUtils.randomAlphabetic((int)id_byte[0]).toLowerCase() + "me");
                    ((rrfw_3)this.id_class[id_protected[4]]).id_class();
                }
            } else {
                ((rrfw_3)this.id_class[id_protected[5]]).id_class();
            }
        }
    }

    private static void id_break() {
        id_break = new double[]{10000.0};
    }

    private static /* synthetic */ void ntfClinit() {
        rryJ.id_class();
        rryJ.id_protected();
        rryJ.id_break();
    }

    private static void id_protected() {
        short[] sArray = new short[7];
        sArray[3] = 57;
        id_protected = sArray;
    }

    @Override
    public boolean aK_() {
        this.id_byte();
        ((rrfw_3)this.id_class[id_protected[6]]).id_class();
        return super.aK_();
    }
}

