/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.PI;
import celestial.Pf_1;
import celestial.SC;
import celestial.SL;
import celestial.Sl_1;
import celestial.Sv_1;
import celestial.Y;
import celestial.cb_3;
import celestial.q_1;
import celestial.rrAM;
import celestial.rrfp_3;
import celestial.rrfq_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SH
extends Sv_1 {
    public Object[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-74, 2, 101, -7, 71, 0, -111, 98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_byte() {
        this.id_finally();
        super.id_byte();
        Boolean bl = id_protected[1];
        this.id_break[SH.id_throws[0]] = bl;
        Integer n = id_protected[2];
        this.id_break[SH.id_throws[1]] = n;
    }

    public SH(SL sL) {
        super(sL);
        this.id_finally();
    }

    static {
        SH.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4B8D795075115AEDL;
    }

    @Override
    public void id_class(rrAM rrAM2) {
        this.id_finally();
        super.id_class(rrAM2);
        SL sL = this.id_case();
        SC sC = sL.id_catch();
        if (sC != null) {
            Boolean bl = id_protected[3];
            this.id_break[SH.id_throws[2]] = bl;
            this.id_case().id_class();
        }
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_finally();
        super.id_class(q_12);
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[3]])) {
            Sl_1 sl_1;
            int n;
            int n2;
            SL sL = this.id_case();
            SC sC = sL.id_catch();
            if (sC == null || !((Boolean)this.id_break[id_throws[4]]).booleanValue()) {
                return;
            }
            int n3 = n2 = (rrfq_3)((Object)rrfp_3.id_class[id_throws[5]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[6]]) ? id_protected[4] : id_byte[0];
            if (sC instanceof Sl_1 && (n = (sl_1 = (Sl_1)sC).id_break()) > 0) {
                n2 = n;
            }
            SH sH = this;
            int n4 = (Integer)sH.id_break[id_throws[7]] + id_protected[5];
            Integer n5 = n4;
            sH.id_break[SH.id_throws[8]] = n5;
            if (n4 >= n2 && !C_throws.id_byte().id_try().id_class(id_protected[6])) {
                ((cb_3)SH.id_import.id_class[id_throws[9]]).id_case("/" + sC.id_byte());
                Integer n6 = id_byte[1];
                this.id_break[SH.id_throws[10]] = n6;
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x56C9799D;
    }

    @Override
    public boolean id_break(String string) {
        Pf_1 pf_1;
        PI pI = PI.id_break(string);
        if (pI != null && (pf_1 = pI.id_class()) != null) {
            return pf_1.id_break();
        }
        return id_protected[0];
    }

    @Override
    public String id_throws() {
        Pf_1 pf_1;
        PI pI = C_throws.id_byte().id_native().id_protected();
        if (pI != null && (pf_1 = pI.id_class()) != null) {
            return pf_1.id_class() + pI.id_break();
        }
        return null;
    }

    private static /* synthetic */ void ntfClinit() {
        SH.id_extends();
        SH.id_implements();
        SH.id_private();
    }

    private void id_finally() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[2]];
            objectArray[SH.id_protected[7]] = id_protected[8];
            objectArray[SH.id_protected[9]] = id_protected[10];
        }
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[11];
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[9] = true;
        id_protected = blArray;
    }

    private static void id_implements() {
        short[] sArray = new short[11];
        sArray[1] = 1;
        sArray[5] = 1;
        sArray[6] = 4;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 57;
        sArray[10] = 1;
        id_throws = sArray;
    }

    private static void id_private() {
        id_byte = new byte[]{17, -10, 2};
    }
}

