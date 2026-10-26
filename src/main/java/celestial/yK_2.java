/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hd_1;
import celestial.Hh_1;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.an_3;
import celestial.cm_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.ly_3;
import celestial.pB_2;
import celestial.pE_2;
import celestial.pJ_2;
import celestial.pM_2;
import celestial.pO_2;
import celestial.pS_2;
import celestial.pX_2;
import celestial.ph_3;
import celestial.pr_3;
import celestial.ps_3;
import celestial.px_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rfo_3;
import celestial.rhj_3;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rjo_3;
import celestial.yD_2;
import celestial.yI_2;
import celestial.yR_2;
import celestial.yU_2;
import celestial.yV_2;
import celestial.yX_2;
import celestial.ya_3;
import celestial.yb_3;
import celestial.yg_3;
import celestial.yo_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Optional;
import java.util.function.Predicate;

public class yK_2 {
    public final ps_3 id_class = new ps_3();
    public final yD_2 id_break;
    public final yD_2 id_byte;
    public final yD_2 id_protected;
    public final yD_2 id_throws;
    public final yD_2 id_case;
    public final yV_2 id_catch;
    public final ph_3 id_private;
    public final yD_2 id_implements;
    public final yD_2 id_finally;
    public final yD_2 id_extends;
    public final yD_2 id_native;
    public final pE_2 id_volatile;
    public final pX_2 id_final;
    public final yI_2 id_package;
    public final pM_2 id_int;
    public final yU_2 id_new;
    public final ya_3 id_continue;
    private boolean id_super;

    public yK_2(QY qY) {
        this.id_break = new pJ_2(qY);
        this.id_byte = new yg_3(qY);
        this.id_protected = new pr_3(qY);
        this.id_throws = new yo_3(qY);
        this.id_case = new pS_2(qY);
        this.id_catch = new yV_2();
        this.id_private = new ph_3(qY);
        this.id_implements = new pB_2(qY);
        this.id_finally = new px_3();
        this.id_extends = new pO_2(qY);
        this.id_native = new yR_2(qY);
        this.id_volatile = new pE_2(qY);
        this.id_final = new pX_2();
        this.id_package = new yI_2(qY);
        this.id_int = new pM_2(qY);
        this.id_new = new yU_2(qY);
        this.id_continue = new ya_3();
    }

    public static void id_class(String string, double d, double d2, double d3, int n) {
        yK_2.id_class(string, d, d2, d3, n, 0.02f);
    }

    public static void id_class(String string, int n, int n2, int n3, int n4) {
        yK_2.id_class(string, (double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, n4);
    }

    public static void id_class(double d, double d2, double d3, double d4, double d5, double d6, float f, float f2, float f3, float f4) {
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        lD_22.id_class(5, ju_3.id_this);
        yX_2.id_class(lD_22, d, d2, d3, d4, d5, d6, f, f2, f3, f4);
        yb_32.id_break();
    }

    public static void id_class(rfl_3 rfl_32, float f, float f2, float f3, float f4) {
        yK_2.id_class(rfl_32.id_class, rfl_32.id_break, rfl_32.id_byte, rfl_32.id_protected, rfl_32.id_throws, rfl_32.id_case, f, f2, f3, f4);
    }

    public static void id_class(String string, double d, double d2, double d3, int n, float f) {
        yK_2.id_class(string, d, d2, d3, n, f, true, 0.0f, false);
    }

    public static void id_class(String string, double d, double d2, double d3, int n, float f, boolean bl, float f2, boolean bl2) {
        QY qY = QY.id_instanceof();
        ly_3 ly_32 = ((Hh_1)qY.id_class[16]).id_finally();
        if (ly_32.id_private() && qY.id_case().id_protected != null) {
            cm_3 cm_32 = (cm_3)qY.id_class[15];
            double d4 = ly_32.id_break().id_break;
            double d5 = ly_32.id_break().id_byte;
            double d6 = ly_32.id_break().id_protected;
            RenderSystem.pushMatrix();
            RenderSystem.translatef((float)(d - d4), (float)(d2 - d5) + 0.07f, (float)(d3 - d6));
            RenderSystem.normal3f(0.0f, 1.0f, 0.0f);
            RenderSystem.multMatrix(new rjV_2(ly_32.id_case()));
            RenderSystem.scalef(f, -f, f);
            RenderSystem.enableTexture();
            if (bl2) {
                RenderSystem.disableDepthTest();
            } else {
                RenderSystem.enableDepthTest();
            }
            RenderSystem.depthMask(true);
            RenderSystem.scalef(-1.0f, 1.0f, 1.0f);
            float f3 = bl ? (float)(-cm_32.id_break(string)) / 2.0f : 0.0f;
            RenderSystem.enableAlphaTest();
            Hd_1 hd_1 = Hx_1.id_class(yb_3.id_class().id_byte());
            cm_32.id_class(string, f3 -= f2 / f, 0.0f, n, false, rjo_3.id_class().id_byte(), (Hx_1)hd_1, bl2, 0, 0xF000F0);
            hd_1.id_break();
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            RenderSystem.enableDepthTest();
            RenderSystem.popMatrix();
        }
    }

    public void id_class() {
        this.id_class.id_class();
        this.id_break.id_class();
        this.id_byte.id_class();
        this.id_protected.id_class();
        this.id_throws.id_class();
        this.id_case.id_class();
        this.id_catch.id_class();
        this.id_private.id_class();
        this.id_implements.id_class();
        this.id_finally.id_class();
        this.id_extends.id_class();
        this.id_native.id_class();
        this.id_volatile.id_class();
        this.id_final.id_class();
        this.id_package.id_class();
        this.id_int.id_class();
        this.id_new.id_class();
        this.id_continue.id_class();
    }

    public void id_class(Ml_1 ml_1, Hd_1 hd_1, double d, double d2, double d3) {
        if (this.id_super && !QY.id_instanceof().E()) {
            this.id_byte.id_class(ml_1, hd_1, d, d2, d3);
        }
    }

    public static Optional<an_3> id_class(an_3 an_33, int n) {
        int n2;
        Predicate<an_3> predicate;
        rfl_3 rfl_32;
        rjU_2 rjU_22;
        rjU_2 rjU_23;
        if (an_33 == null) {
            return Optional.empty();
        }
        rjU_2 rjU_24 = an_33.id_new(1.0f);
        rfo_3 rfo_32 = rhj_3.id_class(an_33, rjU_24, rjU_23 = rjU_24.id_throws(rjU_22 = an_33.id_break(1.0f).id_class((double)n)), rfl_32 = an_33.rN().id_break(rjU_22).id_class(1.0), predicate = an_32 -> !an_32.id_native() && an_32.rY(), n2 = n * n);
        if (rfo_32 == null) {
            return Optional.empty();
        }
        return rjU_24.id_implements(rfo_32.id_case()) > (double)n2 ? Optional.empty() : Optional.of(rfo_32.id_class());
    }

    public static void id_class(rfH_2 rfH_22, rfH_2 rfH_23, float f, float f2, float f3, float f4) {
        ly_3 ly_32 = ((Hh_1)QY.id_instanceof().id_class[16]).id_finally();
        if (ly_32.id_private()) {
            rjU_2 rjU_22 = ly_32.id_break().id_throws();
            rfl_3 rfl_32 = new rfl_3(rfH_22, rfH_23).id_protected(rjU_22);
            yK_2.id_class(rfl_32, f, f2, f3, f4);
        }
    }

    public static void id_class(rfH_2 rfH_22, float f, float f2, float f3, float f4, float f5) {
        ly_3 ly_32 = ((Hh_1)QY.id_instanceof().id_class[16]).id_finally();
        if (ly_32.id_private()) {
            rjU_2 rjU_22 = ly_32.id_break().id_throws();
            rfl_3 rfl_32 = new rfl_3(rfH_22).id_protected(rjU_22).id_class(f);
            yK_2.id_class(rfl_32, f2, f3, f4, f5);
        }
    }

    public boolean id_break() {
        this.id_super = !this.id_super;
        return this.id_super;
    }
}

