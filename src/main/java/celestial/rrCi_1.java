/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.movement.NoSlow;
import celestial.q_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rrAB;
import celestial.rrTF;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrjS_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCi_1
extends rrTF<NoSlow> {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
            this.id_class[0] = 0;
        }
    }

    public rrCi_1(NoSlow noSlow) {
        super(noSlow);
        this.id_byte();
    }

    static {
        rrCi_1.ntfClinit();
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_byte();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]])) {
            if (((cb_3)rrCi_1.id_import.id_class[id_byte[1]]).id_return()) {
                rrCi_1 rrCi_12 = this;
                Integer n = (Integer)rrCi_12.id_class[id_byte[2]] + id_break[0];
                rrCi_12.id_class[rrCi_1.id_byte[3]] = n;
            } else {
                Integer n = id_break[1];
                this.id_class[rrCi_1.id_byte[4]] = n;
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA6F176AC;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-68, 37, -60, -5, -61, 34, 56, 62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrAB rrAB2) {
        this.id_byte();
        rdn_3 rdn_32 = rrAB2.id_catch();
        if ((rrfq_3)((Object)rrfp_3.id_class[id_byte[5]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[6]]) && (rrAB2.id_class(rdy_3.hp) || rrAB2.id_class(rdy_3.hy)) && !rrjS_2.id_protected()) {
            return;
        }
        if ((Integer)this.id_class[id_byte[7]] > id_break[2] && ((cb_3)rrCi_1.id_import.id_class[id_byte[8]]).Sw() > id_break[3]) {
            rrAB2.id_class(id_break[4]);
            Integer n = id_break[5];
            this.id_class[rrCi_1.id_byte[9]] = n;
        }
    }

    private static void id_class() {
        short[] sArray = new short[11];
        sArray[1] = 57;
        sArray[5] = 1;
        sArray[6] = 4;
        sArray[8] = 57;
        id_byte = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x346423D4AD682355L;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[10];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[7] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrCi_1.id_break();
        rrCi_1.id_class();
    }

    @Override
    public boolean aK_() {
        this.id_byte();
        Integer n = id_break[6];
        this.id_class[rrCi_1.id_byte[10]] = n;
        return super.aK_();
    }
}

