/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import celestial.Ph_1;
import celestial.Pr_1;
import celestial.Y;
import celestial.an_3;
import celestial.cb_3;
import celestial.iB_2;
import celestial.module.combat.AttackAura;
import celestial.q_1;
import celestial.rrTI;
import celestial.rrTT;
import celestial.rrTf_1;
import celestial.rrTj_1;
import celestial.rrfQ_2;
import celestial.rrnD_2;
import celestial.rrnK_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCr_1
extends rrnK_2 {
    private static float[] id_protected;
    private static double[] id_case;
    private static short[] id_catch;
    private static boolean[] id_private;
    private static byte[] id_implements;
    public Object[] id_byte;

    @Override
    public float id_byte() {
        return id_protected[0];
    }

    @Override
    public float id_int() {
        AttackAura attackAura = (AttackAura)this.id_continue();
        if (this.id_extends() == (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_catch[6]])) {
            iB_2 iB_22 = attackAura.id_continue();
            PX pX = this.id_private();
            if (iB_22 != null && pX != null) {
                float f = attackAura.id_try();
                an_3 an_32 = Ph_1.id_class((an_3)iB_22, ((cb_3)rrCr_1.id_import.id_class[id_catch[7]]).id_new(id_protected[1]), new PX(pX.id_throws(), pX.id_protected()), f, id_private[2]);
                if (an_32 != iB_22) {
                    return id_protected[2];
                }
            }
        }
        return id_protected[3];
    }

    public rrCr_1(AttackAura attackAura) {
        super(attackAura, new rrTT(attackAura));
        this.id_goto();
        rrTf_1 rrTf_12 = (pX, pX2) -> {
            this.id_goto();
            float f = pX2.id_throws();
            float f2 = pX2.id_protected();
            if (!((Boolean)this.id_byte[id_catch[10]]).booleanValue()) {
                Pr_1 pr_1 = this.id_implements().id_protected();
                f += (float)(Math.sin(((Integer)((cb_3)rrCr_1.id_import.id_class[rrCr_1.id_catch[11]]).id_throws[id_catch[12]]).intValue()) * id_case[0]);
                f2 += (float)Math.cos(((Integer)((cb_3)rrCr_1.id_import.id_class[rrCr_1.id_catch[13]]).id_throws[id_catch[14]]).intValue()) * id_protected[4];
                f += (float)rrfQ_2.id_class(pr_1, id_case[1], id_case[2]);
                f2 += (float)rrfQ_2.id_class(pr_1, id_case[3], id_case[4]);
            }
            return new PX(f, f2);
        };
        this.id_byte[rrCr_1.id_catch[0]] = rrTf_12;
    }

    static {
        rrCr_1.ntfClinit();
    }

    private static void id_this() {
        id_case = new double[]{3.0, -0.5, 0.5, -0.5, 0.5};
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_goto();
        super.id_class(q_12);
        AttackAura attackAura = (AttackAura)this.id_continue();
        rrnD_2 rrnD_22 = attackAura.id_long();
        iB_2 iB_22 = attackAura.id_continue();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[1]])) {
            this.id_class((rrTj_1)iB_22, (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_catch[2]]));
            if (rrnD_22.id_class(attackAura)) {
                Boolean bl = id_private[0];
                this.id_byte[rrCr_1.id_catch[3]] = bl;
                this.id_class((rrTj_1)iB_22, (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_catch[4]]));
                this.id_class(iB_22);
            } else {
                Boolean bl = id_private[1];
                this.id_byte[rrCr_1.id_catch[5]] = bl;
            }
        }
        rrnD_22.id_class(attackAura, q_12);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAEB6B96D829C1004L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA5A103A7;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{53, -88, 83, -47, -10, 55, -95, 88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrCr_1.id_return();
        rrCr_1.id_else();
        rrCr_1.id_synchronized();
        rrCr_1.id_this();
        rrCr_1.id_public();
    }

    private void id_goto() {
        if (this.id_byte == null) {
            this.id_byte = new Object[2];
            this.id_byte[0] = false;
        }
    }

    private static void id_else() {
        short[] sArray = new short[15];
        sArray[0] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 57;
        sArray[8] = 1;
        sArray[11] = 57;
        sArray[12] = 41;
        sArray[13] = 57;
        sArray[14] = 41;
        id_catch = sArray;
    }

    private static void id_return() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        id_private = blArray;
    }

    private static void id_public() {
        id_implements = new byte[]{2};
    }

    @Override
    public rrTf_1 id_protected() {
        this.id_goto();
        return (rrTf_1)this.id_byte[id_catch[8]];
    }

    @Override
    public void id_volatile() {
        this.id_goto();
        super.id_volatile();
        Boolean bl = id_private[3];
        this.id_byte[rrCr_1.id_catch[9]] = bl;
    }

    private static void id_synchronized() {
        id_protected = new float[]{52.0f, 1.0f, -1.0f, 5.0f, 0.5f};
    }
}

