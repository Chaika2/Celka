/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.PX;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.movement.Spider;
import celestial.q_1;
import celestial.rdH_2;
import celestial.rdn_3;
import celestial.rff_3;
import celestial.rhz_3;
import celestial.rjG_2;
import celestial.rmD_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rrAO;
import celestial.rrTF;
import celestial.rrTI;
import celestial.rrTT;
import celestial.rrTp_1;
import celestial.rrfY_2;
import celestial.rrfu_3;
import celestial.rrnF_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.ryZ_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlM_2
extends rrTF<Spider>
implements rrnF_2 {
    private static byte[] id_break;
    private static double[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    private static String[] id_case;
    private static boolean[] id_catch;
    private static float[] id_private;

    private static void id_int() {
        id_break = new byte[]{-1, -2, -3, 9, -2, -3, -1, 2};
    }

    public rrlM_2(Spider spider) {
        super(spider);
        this.id_return();
        rrTT rrTT2 = new rrTT(this);
        this.id_class[rrlM_2.id_protected[0]] = rrTT2;
    }

    static {
        rrlM_2.ntfClinit();
    }

    private static void id_this() {
        id_case = new String[]{new String("\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e \u0431\u043b\u043e\u043a\u043e\u0432 \u0432 \u0445\u043e\u0442\u0431\u0430\u0440\u0435!")};
    }

    private void id_class(rff_3 rff_32, rpm_3 rpm_32, int n) {
        rdH_2 rdH_22;
        rdn_3 rdn_32 = n == id_break[4] ? ((cb_3)rrlM_2.id_import.id_class[id_protected[27]]).ss() : (n == id_break[5] ? ((cb_3)rrlM_2.id_import.id_class[id_protected[28]]).Sn() : ((rhz_3)((cb_3)rrlM_2.id_import.id_class[rrlM_2.id_protected[29]]).id_implements[id_protected[30]]).id_extends(n));
        ryZ_2 ryZ_22 = rdn_32.id_class(rdH_22 = new rdH_2((cb_3)rrlM_2.id_import.id_class[id_protected[26]], rpm_32, rff_32));
        if (!ryZ_22.id_break()) {
            return;
        }
        ((Ax_1)rrlM_2.id_import.id_class[id_protected[31]]).id_break((cb_3)rrlM_2.id_import.id_class[id_protected[32]], (gm_3)rrlM_2.id_import.id_class[id_protected[33]], rpm_32, rff_32);
        ((cb_3)rrlM_2.id_import.id_class[id_protected[34]]).id_class(rpm_32);
    }

    private void id_class(rff_3 rff_32, int n) {
        int n2 = ((rhz_3)((cb_3)rrlM_2.id_import.id_class[rrlM_2.id_protected[20]]).id_implements[rrlM_2.id_protected[21]]).id_protected;
        if (n == id_break[1]) {
            this.id_class(rff_32, rpm_3.MAIN_HAND, n);
            return;
        }
        if (n == id_break[2]) {
            this.id_class(rff_32, rpm_3.OFF_HAND, n);
            return;
        }
        if (n >= 0 && n < id_break[3]) {
            ((rhz_3)((cb_3)rrlM_2.id_import.id_class[rrlM_2.id_protected[22]]).id_implements[rrlM_2.id_protected[23]]).id_protected = n;
            this.id_class(rff_32, rpm_3.MAIN_HAND, n);
            ((rhz_3)((cb_3)rrlM_2.id_import.id_class[rrlM_2.id_protected[24]]).id_implements[rrlM_2.id_protected[25]]).id_protected = n2;
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-25, -80, -12, 107, 79, -15, -98, 32}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x670CB3566780B3F3L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x86931ABE;
    }

    @EventTarget
    public void id_class(rrAO rrAO2) {
        this.id_return();
        if (((Boolean)this.id_class[id_protected[18]]).booleanValue()) {
            rrAO2.id_catch(id_catch[3]);
            rrAO2.id_protected(id_catch[4]);
            rrAO2.id_byte(id_catch[5]);
            rrAO2.id_throws(id_catch[6]);
            rrAO2.id_case(id_catch[7]);
            Boolean bl = id_catch[8];
            this.id_class[rrlM_2.id_protected[19]] = bl;
        }
    }

    @EventTarget(id_class=100)
    public void id_class(q_1 q_12) {
        this.id_return();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[1]])) {
            rjG_2 rjG_22;
            PX pX = new PX(((Float)((cb_3)rrlM_2.id_import.id_class[rrlM_2.id_protected[2]]).id_throws[id_protected[3]]).floatValue(), id_private[0]);
            ((rrTT)this.id_class[id_protected[4]]).id_class(() -> pX, (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_protected[5]]));
            if (((cb_3)rrlM_2.id_import.id_class[id_protected[6]]).BL()) {
                ((cb_3)rrlM_2.id_import.id_class[id_protected[7]]).sl();
            }
            if (!((cb_3)rrlM_2.id_import.id_class[id_protected[8]]).z().id_break(pX, id_private[1])) {
                return;
            }
            int n = rrfY_2.id_class(id_catch[0]);
            if (n == id_break[0]) {
                return;
            }
            if (!((gm_3)rrlM_2.id_import.id_class[id_protected[9]]).id_finally(((cb_3)rrlM_2.id_import.id_class[id_protected[10]]).Bs()) && ((Ax_1)rrlM_2.id_import.id_class[id_protected[11]]).id_class(((cb_3)rrlM_2.id_import.id_class[id_protected[12]]).Bs(), rpr_3.UP, id_catch[1])) {
                ((cb_3)rrlM_2.id_import.id_class[id_protected[13]]).id_class(rpm_3.MAIN_HAND);
            }
            if (!((rjG_22 = (rjG_2)rrlM_2.id_import.id_class[id_protected[14]]) instanceof rff_3)) {
                return;
            }
            rff_3 rff_32 = (rff_3)rjG_22;
            if (((gm_3)rrlM_2.id_import.id_class[id_protected[15]]).id_finally(rff_32.id_class())) {
                return;
            }
            if (((cb_3)rrlM_2.id_import.id_class[rrlM_2.id_protected[16]]).rv().id_byte < id_byte[0]) {
                Boolean bl = id_catch[2];
                this.id_class[rrlM_2.id_protected[17]] = bl;
                if (rmD_2.id_byte) {
                    this.id_class(rff_32, n);
                }
            }
        }
    }

    @Override
    public float id_break() {
        return id_private[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrlM_2.id_synchronized();
        rrlM_2.id_this();
        rrlM_2.id_package();
        rrlM_2.id_final();
        rrlM_2.id_else();
        rrlM_2.id_int();
    }

    @Override
    public rrTp_1 id_catch() {
        return (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_protected[41]]);
    }

    private static void id_else() {
        id_byte = new double[1];
    }

    private void id_new() {
        Spider spider = (Spider)this.id_continue();
        String string = id_case[0];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_protected[39]]).id_class(new rrtx_3(spider.id_final(), string, (int)id_protected[40]));
        rrfu_3.id_byte(rrfu_3.id_class(spider) + string);
    }

    private static void id_package() {
        short[] sArray = new short[42];
        sArray[2] = 57;
        sArray[3] = 15;
        sArray[6] = 57;
        sArray[7] = 57;
        sArray[8] = 57;
        sArray[9] = 56;
        sArray[10] = 57;
        sArray[11] = 55;
        sArray[12] = 57;
        sArray[13] = 57;
        sArray[14] = 64;
        sArray[15] = 56;
        sArray[16] = 57;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 57;
        sArray[21] = 1;
        sArray[22] = 57;
        sArray[23] = 1;
        sArray[24] = 57;
        sArray[25] = 1;
        sArray[26] = 57;
        sArray[27] = 57;
        sArray[28] = 57;
        sArray[29] = 57;
        sArray[30] = 1;
        sArray[31] = 55;
        sArray[32] = 57;
        sArray[33] = 56;
        sArray[34] = 57;
        sArray[35] = 57;
        sArray[36] = 56;
        sArray[40] = 2000;
        sArray[41] = 3;
        id_protected = sArray;
    }

    private void id_return() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
            this.id_class[1] = false;
        }
    }

    @Override
    public float id_private() {
        return id_private[3];
    }

    private static void id_final() {
        id_private = new float[]{81.0f, 0.05f, -1.0f, -1.0f};
    }

    private static void id_synchronized() {
        boolean[] blArray = new boolean[14];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[10] = true;
        blArray[12] = true;
        id_catch = blArray;
    }

    @Override
    public boolean aI_() {
        if ((cb_3)rrlM_2.id_import.id_class[id_protected[35]] == null || (gm_3)rrlM_2.id_import.id_class[id_protected[36]] == null) {
            return id_catch[9];
        }
        int n = rrfY_2.id_class(id_catch[10]);
        if (n == id_break[6]) {
            this.id_new();
            ((Spider)this.id_continue()).id_volatile();
            return id_catch[11];
        }
        return super.aI_();
    }

    @Override
    public boolean aK_() {
        this.id_return();
        ((rrTT)this.id_class[id_protected[37]]).id_final();
        ((rrTT)this.id_class[id_protected[38]]).id_finally();
        return super.aK_();
    }
}

