/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LS;
import celestial.LX;
import celestial.Lb_1;
import celestial.Ls_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.ch_3;
import celestial.cm_3;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rqO_2;
import celestial.rqR_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class cY_2
extends ch_3
implements Ls_1 {
    private static final rqO_2 id_throws = new rqO_2("textures/gui/widgets.png");
    public static final rqO_2 id_class = new rqO_2("textures/gui/spectator_widgets.png");
    private final QY id_case;
    private long id_catch;
    private Lb_1 id_private;

    public cY_2(QY qY) {
        this.id_case = qY;
    }

    private void id_class(Ml_1 ml_1, int n, int n2, float f, float f2, LS lS) {
        this.id_case.A().id_class(id_class);
        if (lS != Lb_1.id_class) {
            int n3 = (int)(f2 * 255.0f);
            RenderSystem.pushMatrix();
            RenderSystem.translatef(n2, f, 0.0f);
            float f3 = lS.id_protected() ? 1.0f : 0.25f;
            RenderSystem.color4f(f3, f3, f3, f2);
            lS.id_class(ml_1, f3, n3);
            RenderSystem.popMatrix();
            if (n3 > 3 && lS.id_protected()) {
                rgP_2 rgP_22 = ((Qw_1)this.id_case.id_class[20]).t[n].id_native();
                ((cm_3)this.id_case.id_class[15]).id_break(ml_1, rgP_22, (float)(n2 + 19 - 2 - ((cm_3)this.id_case.id_class[15]).id_class(rgP_22)), f + 6.0f + 3.0f, 0xFFFFFF + (n3 << 24));
            }
        }
    }

    public void id_class(Ml_1 ml_1) {
        int n = (int)(this.id_throws() * 255.0f);
        if (n > 3 && this.id_private != null) {
            rgP_2 rgP_22;
            LS lS = this.id_private.id_break();
            rgP_2 rgP_23 = rgP_22 = lS == Lb_1.id_class ? this.id_private.id_byte().id_break() : lS.id_byte();
            if (rgP_22 != null) {
                int n2 = (this.id_case.id_else().id_super() - ((cm_3)this.id_case.id_class[15]).id_class(rgP_22)) / 2;
                int n3 = this.id_case.id_else().id_this() - 35;
                RenderSystem.pushMatrix();
                RenderSystem.enableBlend();
                RenderSystem.defaultBlendFunc();
                ((cm_3)this.id_case.id_class[15]).id_break(ml_1, rgP_22, (float)n2, (float)n3, 0xFFFFFF + (n << 24));
                RenderSystem.disableBlend();
                RenderSystem.popMatrix();
            }
        }
    }

    public boolean id_class() {
        return this.id_private != null;
    }

    public void id_class(double d) {
        int n = this.id_private.id_throws() + (int)d;
        while (!(n < 0 || n > 8 || this.id_private.id_class(n) != Lb_1.id_class && this.id_private.id_class(n).id_protected())) {
            n = (int)((double)n + d);
        }
        if (n >= 0 && n <= 8) {
            this.id_private.id_break(n);
            this.id_catch = rqR_2.id_break();
        }
    }

    public void id_class(Ml_1 ml_1, float f) {
        if (this.id_private != null) {
            float f2 = this.id_throws();
            if (f2 <= 0.0f) {
                this.id_private.id_protected();
            } else {
                int n = this.id_case.id_else().id_super() / 2;
                int n2 = this.h_();
                this.id_class(-90);
                int n3 = rfU_2.id_protected((float)this.id_case.id_else().id_this() - 22.0f * f2);
                LX lX = this.id_private.id_case();
                this.id_class(ml_1, f2, n, n3, lX);
                this.id_class(n2);
            }
        }
    }

    protected void id_class(Ml_1 ml_1, float f, int n, int n2, LX lX) {
        RenderSystem.enableRescaleNormal();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, f);
        this.id_case.A().id_class(id_throws);
        this.id_break(ml_1, n - 91, n2, 0, 0, 182, 22);
        if (lX.id_class() >= 0) {
            this.id_break(ml_1, n - 91 - 1 + lX.id_class() * 20, n2 - 1, 0, 22, 24, 22);
        }
        for (int i = 0; i < 9; ++i) {
            this.id_class(ml_1, i, this.id_case.id_else().id_super() / 2 - 90 + i * 20 + 2, n2 + 3, f, lX.id_class(i));
        }
        RenderSystem.disableRescaleNormal();
        RenderSystem.disableBlend();
    }

    @Override
    public void id_class(Lb_1 lb_1) {
        this.id_private = null;
        this.id_catch = 0L;
    }

    public void id_break(int n) {
        this.id_catch = rqR_2.id_break();
        if (this.id_private != null) {
            this.id_private.id_break(n);
        } else {
            this.id_private = new Lb_1(this);
        }
    }

    private float id_throws() {
        long l = this.id_catch - rqR_2.id_break() + 5000L;
        return rfU_2.id_class((float)l / 2000.0f, 0.0f, 1.0f);
    }

    public void id_protected() {
        this.id_catch = rqR_2.id_break();
        if (this.id_class()) {
            int n = this.id_private.id_throws();
            if (n != -1) {
                this.id_private.id_break(n);
            }
        } else {
            this.id_private = new Lb_1(this);
        }
    }
}

