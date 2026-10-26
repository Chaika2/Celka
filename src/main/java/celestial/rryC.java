/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.C_volatile;
import celestial.PX;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.util.ClickPearl;
import celestial.q_1;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rrLB;
import celestial.rrLu_1;
import celestial.rrTF;
import celestial.rrTI;
import celestial.rrTT;
import celestial.rrTp_1;
import celestial.rrfP_2;
import celestial.rrfY_2;
import celestial.rrfo_3;
import celestial.rrfu_3;
import celestial.rrnF_2;
import celestial.rryH;
import celestial.rryl_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryC
extends rrTF<ClickPearl>
implements rrnF_2 {
    private static float[] id_break;
    private static short[] id_byte;
    private static long[] id_protected;
    private static String[] id_case;
    private static boolean[] id_catch;
    private static byte[] id_private;
    public Object[] id_class;

    private int id_byte(int n) {
        this.id_else();
        if (n == id_private[4]) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            ((cb_3)rryC.id_import.id_class[id_byte[29]]).id_class(rpm_3.MAIN_HAND);
            return n;
        }
        if (n == id_private[5]) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            ((cb_3)rryC.id_import.id_class[id_byte[30]]).id_class(rpm_3.OFF_HAND);
            return n;
        }
        if (n >= 0 && n < id_private[6]) {
            Integer n2 = ((rhz_3)((cb_3)rryC.id_import.id_class[rryC.id_byte[31]]).id_implements[rryC.id_byte[32]]).id_protected;
            this.id_class[rryC.id_byte[33]] = n2;
            ((rhz_3)((cb_3)rryC.id_import.id_class[rryC.id_byte[34]]).id_implements[rryC.id_byte[35]]).id_protected = n;
            rryl_1 rryl_12 = (rryl_1)((Object)rryl_1.staticFieldsf4b744ad2cb233a5a56c412114fd18f6[id_byte[36]]);
            this.id_class[rryC.id_byte[37]] = rryl_12;
            return n;
        }
        if (n >= id_private[7] && n <= id_private[8]) {
            ((rrfP_2)this.id_class[id_byte[38]]).id_class(((rhz_3)((cb_3)rryC.id_import.id_class[rryC.id_byte[39]]).id_implements[rryC.id_byte[40]]).id_protected);
            ((Ax_1)rryC.id_import.id_class[id_byte[41]]).id_class(n);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            ((cb_3)rryC.id_import.id_class[id_byte[42]]).id_class(rpm_3.MAIN_HAND);
            Long l = System.currentTimeMillis();
            this.id_class[rryC.id_byte[43]] = l;
            return n;
        }
        return id_private[9];
    }

    private static void id_int() {
        short[] sArray = new short[64];
        sArray[1] = 1;
        sArray[2] = 4;
        sArray[3] = 2;
        sArray[4] = 57;
        sArray[6] = 5;
        sArray[10] = 2;
        sArray[11] = 5;
        sArray[12] = 1;
        sArray[14] = 3;
        sArray[15] = 3;
        sArray[16] = 6;
        sArray[17] = 6;
        sArray[19] = 7;
        sArray[20] = 7;
        sArray[21] = 57;
        sArray[22] = 6;
        sArray[23] = 7;
        sArray[24] = 1;
        sArray[25] = 57;
        sArray[26] = 2;
        sArray[28] = 55;
        sArray[29] = 57;
        sArray[30] = 57;
        sArray[31] = 57;
        sArray[32] = 1;
        sArray[33] = 4;
        sArray[34] = 57;
        sArray[35] = 1;
        sArray[37] = 6;
        sArray[39] = 57;
        sArray[40] = 1;
        sArray[41] = 55;
        sArray[42] = 57;
        sArray[43] = 2;
        sArray[44] = 1;
        sArray[45] = 1;
        sArray[46] = 3;
        sArray[47] = 5;
        sArray[48] = 4;
        sArray[49] = 57;
        sArray[50] = 1;
        sArray[51] = 4;
        sArray[52] = 4;
        sArray[53] = 3;
        sArray[54] = 3;
        sArray[55] = 3;
        sArray[56] = 5;
        sArray[57] = 1;
        sArray[58] = 7;
        sArray[59] = 6;
        sArray[60] = 57;
        sArray[61] = 45;
        sArray[62] = 57;
        sArray[63] = 46;
        id_byte = sArray;
    }

    public rryC(ClickPearl clickPearl) {
        super(clickPearl);
        this.id_else();
        rrfP_2 rrfP_22 = new rrfP_2();
        this.id_class[rryC.id_byte[0]] = rrfP_22;
        rrTT rrTT2 = new rrTT(this);
        this.id_class[rryC.id_byte[1]] = rrTT2;
        Integer n = id_private[0];
        this.id_class[rryC.id_byte[2]] = n;
    }

    static {
        rryC.ntfClinit();
    }

    private static void id_this() {
        id_private = new byte[]{-1, -1, -1, 8, -2, -3, 9, 9, 36, -1, -1, -1, 2, 8, 2, 3, 4, 5, 7};
    }

    @EventTarget(id_class=200)
    public void id_class(q_1 q_12) {
        block8: {
            int n;
            int n2;
            block9: {
                this.id_else();
                if (q_12.id_class() != (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[8]])) break block8;
                ((rrfP_2)this.id_class[id_byte[9]]).id_class(System.currentTimeMillis() - (Long)this.id_class[id_byte[10]] > id_protected[0] ? id_catch[5] : id_catch[6]);
                if (!((Boolean)this.id_class[id_byte[11]]).booleanValue()) break block8;
                n2 = rrfY_2.id_class(rdy_3.Jm, id_catch[7], id_catch[8]);
                n = this.id_package();
                if (n > 0) {
                    ((rrTT)this.id_class[id_byte[12]]).id_class(() -> new PX(((Float)((cb_3)rryC.id_import.id_class[rryC.id_byte[60]]).id_break[id_byte[61]]).floatValue(), ((Float)((cb_3)rryC.id_import.id_class[rryC.id_byte[62]]).id_break[id_byte[63]]).floatValue()), (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_byte[13]]));
                }
                if (n == 0) break block9;
                rryC rryC2 = this;
                int n3 = (Integer)rryC2.id_class[id_byte[14]] + id_catch[9];
                Integer n4 = n3;
                rryC2.id_class[rryC.id_byte[15]] = n4;
                if (n3 < n) break block8;
            }
            if ((rryl_1)((Object)this.id_class[id_byte[16]]) == null) {
                this.id_class(n2);
            }
            if ((rryl_1)((Object)this.id_class[id_byte[17]]) == (rryl_1)((Object)rryl_1.staticFieldsf4b744ad2cb233a5a56c412114fd18f6[id_byte[18]])) {
                rryC rryC3 = this;
                int n5 = (Integer)rryC3.id_class[id_byte[19]] + id_catch[10];
                Integer n6 = n5;
                rryC3.id_class[rryC.id_byte[20]] = n6;
                if (n5 > id_catch[11]) {
                    rrfo_3.id_class(rpm_3.MAIN_HAND);
                    ((cb_3)rryC.id_import.id_class[id_byte[21]]).id_class(rpm_3.MAIN_HAND);
                    this.id_synchronized();
                    this.id_throws(n);
                    Object var10_6 = null;
                    this.id_class[rryC.id_byte[22]] = var10_6;
                    Integer n7 = id_catch[12];
                    this.id_class[rryC.id_byte[23]] = n7;
                }
            } else {
                this.id_throws(n);
            }
        }
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        this.id_else();
        ((rrfP_2)this.id_class[id_byte[7]]).id_class(rrLu_12);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x68A81AE17EC32DBFL;
    }

    public void id_class(int n) {
        int n2;
        if (n != id_private[2] && (n2 = this.id_byte(n)) > id_private[3]) {
            ((Ax_1)rryC.id_import.id_class[id_byte[28]]).id_class(n2);
        }
    }

    @EventTarget
    public void id_class(rrLB rrLB2) {
        boolean bl;
        this.id_else();
        ClickPearl clickPearl = (ClickPearl)this.id_continue();
        boolean bl2 = bl = rrLB2.id_break() == clickPearl.id_continue().id_finally().id_byte() ? id_catch[0] : id_catch[1];
        if (!bl) {
            return;
        }
        int n = rrfY_2.id_class(rdy_3.Jm, id_catch[2], id_catch[3]);
        rryH rryH2 = this.id_break(n);
        if (rryH2 == (rryH)((Object)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[id_byte[3]])) {
            int n2 = ((cb_3)rryC.id_import.id_class[id_byte[4]]).sK().id_protected(rdy_3.Jm);
            float f = (float)n2 / id_break[0];
            rrfu_3.id_class(clickPearl, id_case[0], f);
        } else if (rryH2 == (rryH)((Object)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[id_byte[5]])) {
            Boolean bl3 = id_catch[4];
            this.id_class[rryC.id_byte[6]] = bl3;
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-57, -52, -120, 64, -76, 47, 53, -126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public float id_break() {
        return id_break[1];
    }

    private rryH id_break(int n) {
        if (n == id_private[1]) {
            return (rryH)((Object)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[id_byte[24]]);
        }
        if (((cb_3)rryC.id_import.id_class[id_byte[25]]).sK().id_class(rdy_3.Jm)) {
            return (rryH)((Object)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[id_byte[26]]);
        }
        return (rryH)((Object)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[id_byte[27]]);
    }

    private void id_throws(int n) {
        this.id_else();
        if (n != 0) {
            ((rrTT)this.id_class[id_byte[44]]).id_final();
            ((rrTT)this.id_class[id_byte[45]]).id_finally();
        }
        Integer n2 = id_catch[13];
        this.id_class[rryC.id_byte[46]] = n2;
        Boolean bl = id_catch[14];
        this.id_class[rryC.id_byte[47]] = bl;
    }

    private static /* synthetic */ void ntfClinit() {
        rryC.id_goto();
        rryC.id_return();
        rryC.id_new();
        rryC.id_int();
        rryC.id_public();
        rryC.id_this();
    }

    @Override
    public rrTp_1 id_catch() {
        return (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_byte[55]]);
    }

    private static void id_goto() {
        boolean[] blArray = new boolean[22];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        id_catch = blArray;
    }

    private void id_else() {
        if (this.id_class == null) {
            this.id_class = new Object[8];
            this.id_class[2] = 0L;
            this.id_class[3] = 0;
            this.id_class[4] = 0;
            this.id_class[5] = false;
            this.id_class[7] = 0;
        }
    }

    private static void id_new() {
        long[] lArray = new long[2];
        lArray[0] = 200L;
        id_protected = lArray;
    }

    private int id_package() {
        if ((C_volatile)rrTT.id_break[id_byte[53]] instanceof rrTT && ((C_volatile)rrTT.id_break[id_byte[54]]).id_byte() != null) {
            return id_private[12];
        }
        return id_catch[15];
    }

    private static void id_return() {
        id_case = new String[]{new String("\u044d\u043d\u0434\u0435\u0440 \u0436\u0435\u043c\u0447\u0443\u0433\u0430")};
    }

    private static void id_public() {
        id_break = new float[]{20.0f, -1.0f, -1.0f};
    }

    private static int id_protected(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD5F80786;
    }

    @Override
    public float id_private() {
        return id_break[2];
    }

    private void id_synchronized() {
        this.id_else();
        if ((Integer)this.id_class[id_byte[48]] != id_private[10]) {
            ((rhz_3)((cb_3)rryC.id_import.id_class[rryC.id_byte[49]]).id_implements[rryC.id_byte[50]]).id_protected = (Integer)this.id_class[id_byte[51]];
            Integer n = id_private[11];
            this.id_class[rryC.id_byte[52]] = n;
        }
    }

    @Override
    public boolean aK_() {
        this.id_else();
        Boolean bl = id_catch[16];
        this.id_class[rryC.id_byte[56]] = bl;
        ((rrTT)this.id_class[id_byte[57]]).id_final();
        Integer n = id_catch[17];
        this.id_class[rryC.id_byte[58]] = n;
        Object var7_3 = null;
        this.id_class[rryC.id_byte[59]] = var7_3;
        return super.aK_();
    }
}

