/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_throw;
import celestial.C_throws;
import celestial.Ml_1;
import celestial.PP;
import celestial.QY;
import celestial.Qi_1;
import celestial.an_3;
import celestial.bg_3;
import celestial.bj_3;
import celestial.cb_3;
import celestial.rS_2;
import celestial.rU_2;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rjB_2;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rji_3;
import celestial.rjs_3;
import celestial.vm_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bf_3
extends vm_3
implements PP {
    private static String[] id_throws;
    private static double[] id_case;
    public Object[] id_class;
    private static short[] id_catch;
    private static boolean[] id_private;
    private static float[] id_implements;
    private static byte[] id_finally;

    private static void id_char() {
        boolean[] blArray = new boolean[13];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        id_private = blArray;
    }

    private static void id_int() {
        id_throws = new String[]{new String("CLICK")};
    }

    public bf_3() {
        super(new rgN_2(id_throws[0]));
        this.id_interface();
    }

    static {
        bf_3.ntfClinit();
    }

    private void id_interface() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_finally[1]];
        }
    }

    public void id_class(Ml_1 ml_1, rjV_2 rjV_22) {
        this.id_interface();
        rjV_2 rjV_23 = rjV_22.id_case();
        this.id_class[bf_3.id_catch[17]] = rjV_23;
        ((rjV_2)this.id_class[id_catch[18]]).id_class(ml_1.id_byte().id_class());
        ((rjV_2)this.id_class[id_catch[19]]).id_throws();
        if ((rfH_2)this.id_class[id_catch[20]] != null) {
            QY qY = QY.id_instanceof();
            an_3 an_32 = qY.id_catch();
            bg_3.id_class(ml_1, an_32, Collections.singletonList((rfH_2)this.id_class[id_catch[21]]), Color.CYAN);
            if ((rfH_2)this.id_class[id_catch[22]] != null && !((rfH_2)this.id_class[id_catch[23]]).equals((rfH_2)this.id_class[id_catch[24]])) {
                RenderSystem.enableBlend();
                RenderSystem.blendFuncSeparate(id_catch[25], id_catch[26], id_private[4], id_private[5]);
                RenderSystem.color4f(Color.RED.getColorComponents(null)[id_private[6]], Color.RED.getColorComponents(null)[id_private[7]], Color.RED.getColorComponents(null)[id_finally[0]], id_implements[0]);
                RenderSystem.lineWidth(((Float)C_class.id_instanceof().id_break.id_class[id_catch[27]]).floatValue());
                RenderSystem.disableTexture();
                RenderSystem.depthMask(id_private[8]);
                RenderSystem.disableDepthTest();
                rU_2 rU_22 = new rU_2((rfH_2)this.id_class[id_catch[28]]);
                rU_2 rU_23 = new rU_2((rfH_2)this.id_class[id_catch[29]]);
                bj_3.id_class(ml_1, new rfl_3(Math.min((Integer)rU_22.id_break[id_catch[30]], (Integer)rU_23.id_break[id_catch[31]]), Math.min((Integer)rU_22.id_break[id_catch[32]], (Integer)rU_23.id_break[id_catch[33]]), Math.min((Integer)rU_22.id_break[id_catch[34]], (Integer)rU_23.id_break[id_catch[35]]), Math.max((Integer)rU_22.id_break[id_catch[36]], (Integer)rU_23.id_break[id_catch[37]]) + id_private[9], Math.max((Integer)rU_22.id_break[id_catch[38]], (Integer)rU_23.id_break[id_catch[39]]) + id_private[10], Math.max((Integer)rU_22.id_break[id_catch[40]], (Integer)rU_23.id_break[id_catch[41]]) + id_private[11]));
                RenderSystem.enableDepthTest();
                RenderSystem.depthMask(id_private[12]);
                RenderSystem.enableTexture();
                RenderSystem.disableBlend();
            }
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, -116, -37, -120, -76, 119, -23, -22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_class(double d, double d2, int n) {
        this.id_interface();
        if ((rfH_2)this.id_class[id_catch[4]] != null) {
            if (n == 0) {
                if ((rfH_2)this.id_class[id_catch[5]] != null && !((rfH_2)this.id_class[id_catch[6]]).equals((rfH_2)this.id_class[id_catch[7]])) {
                    C_throws.id_class().id_break().id_double().id_throws();
                    C_throws.id_class().id_break().id_double().id_class(rU_2.id_class((rfH_2)this.id_class[id_catch[8]]), rU_2.id_class((rfH_2)this.id_class[id_catch[9]]));
                    rVe_1 rVe_12 = new rVe_1("Selection made! For usage: " + (String)C_class.id_instanceof().id_protected.id_class[id_catch[10]] + "help sel");
                    rVe_12.id_class(rVe_12.id_class().id_class(rgF_2.WHITE).id_class(new rgl_3(rgH_2.RUN_COMMAND, C_throw.id_class + "help sel")));
                    rVi_1[] rVi_1Array = new rVi_1[id_private[1]];
                    rVi_1Array[bf_3.id_private[2]] = rVe_12;
                    a_.id_class(rVi_1Array);
                    Object var11_5 = null;
                    this.id_class[bf_3.id_catch[11]] = var11_5;
                } else {
                    C_throws.id_class().id_break().id_import().id_break(new rS_2((rfH_2)this.id_class[id_catch[12]]));
                }
            } else if (n == id_private[3]) {
                C_throws.id_class().id_break().id_import().id_break(new rS_2(((rfH_2)this.id_class[id_catch[13]]).id_final()));
            }
        }
        Object var12_6 = null;
        this.id_class[bf_3.id_catch[14]] = var12_6;
        return super.id_class(d, d2, n);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA03216E526316933L;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_interface();
        QY qY = QY.id_instanceof();
        double d = ((Qi_1)qY.id_class[id_catch[0]]).id_byte();
        double d2 = ((Qi_1)qY.id_class[id_catch[1]]).id_protected();
        d2 = (double)qY.id_else().id_continue() - d2;
        rjU_2 rjU_22 = this.id_break(d *= (double)qY.id_else().id_extends() / (double)qY.id_else().id_new(), d2 *= (double)qY.id_else().id_native() / (double)qY.id_else().id_continue(), id_case[0]);
        rjU_2 rjU_23 = this.id_break(d, d2, id_case[1]);
        if (rjU_22 != null && rjU_23 != null) {
            rjU_2 rjU_24 = new rjU_2(bg_3.id_byte(), bg_3.id_break(), bg_3.id_class());
            cb_3 cb_32 = C_throws.id_class().id_break().id_throw().id_catch();
            rff_3 rff_32 = ((rYB)cb_32.id_throws[id_catch[2]]).id_class(new rjB_2(rjU_22.id_throws(rjU_24), rjU_23.id_throws(rjU_24), rjS_2.OUTLINE, rjs_3.NONE, cb_32));
            if (rff_32 != null && ((rjG_2)rff_32).id_byte() == rjM_2.BLOCK) {
                rfH_2 rfH_22 = rff_32.id_class();
                this.id_class[bf_3.id_catch[3]] = rfH_22;
            }
        }
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        this.id_interface();
        rfH_2 rfH_22 = (rfH_2)this.id_class[id_catch[15]];
        this.id_class[bf_3.id_catch[16]] = rfH_22;
        return super.id_break(d, d2, n);
    }

    private rjU_2 id_break(double d, double d2, double d3) {
        this.id_interface();
        if ((rjV_2)this.id_class[id_catch[42]] == null) {
            return null;
        }
        QY qY = QY.id_instanceof();
        d /= (double)qY.id_else().id_extends();
        d2 /= (double)qY.id_else().id_native();
        d = d * id_case[2] - id_case[3];
        d2 = d2 * id_case[4] - id_case[5];
        rji_3 rji_32 = new rji_3((float)d, (float)d2, (float)d3, id_implements[1]);
        rji_32.id_class((rjV_2)this.id_class[id_catch[43]]);
        if (rji_32.id_protected() == id_implements[2]) {
            return null;
        }
        rji_32.id_case();
        return new rjU_2(rji_32.id_class(), rji_32.id_break(), rji_32.id_byte());
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA5277D17;
    }

    private static /* synthetic */ void ntfClinit() {
        bf_3.id_char();
        bf_3.id_int();
        bf_3.id_native();
        bf_3.id_finally();
        bf_3.id_package();
        bf_3.id_final();
    }

    private static void id_finally() {
        double[] dArray = new double[6];
        dArray[1] = 1.0;
        dArray[2] = 2.0;
        dArray[3] = 1.0;
        dArray[4] = 2.0;
        dArray[5] = 1.0;
        id_case = dArray;
    }

    private static void id_package() {
        float[] fArray = new float[3];
        fArray[0] = 0.4f;
        fArray[1] = 1.0f;
        id_implements = fArray;
    }

    private static void id_final() {
        id_finally = new byte[]{2, 3};
    }

    private static void id_native() {
        short[] sArray = new short[44];
        sArray[0] = 22;
        sArray[1] = 22;
        sArray[2] = 7;
        sArray[3] = 2;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 2;
        sArray[14] = 1;
        sArray[15] = 2;
        sArray[16] = 1;
        sArray[20] = 2;
        sArray[21] = 2;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[24] = 2;
        sArray[25] = 770;
        sArray[26] = 771;
        sArray[28] = 2;
        sArray[29] = 1;
        sArray[32] = 1;
        sArray[33] = 1;
        sArray[34] = 2;
        sArray[35] = 2;
        sArray[38] = 1;
        sArray[39] = 1;
        sArray[40] = 2;
        sArray[41] = 2;
        id_catch = sArray;
    }

    @Override
    public boolean z_() {
        return id_private[0];
    }
}

