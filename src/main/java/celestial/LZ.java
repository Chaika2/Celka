/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Nf_1;
import celestial.Np_1;
import celestial.QY;
import celestial.cC_2;
import celestial.ch_3;
import celestial.cm_3;
import celestial.cp_3;
import celestial.rVi_1;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqn_3;
import com.mojang.blaze3d.systems.RenderSystem;

public abstract class LZ
extends ch_3
implements cC_2,
cp_3 {
    public static final rqO_2 id_finally = new rqO_2("textures/gui/widgets.png");
    protected int id_extends;
    protected int id_native;
    public int id_volatile;
    public int id_final;
    private rgP_2 id_class;
    protected boolean id_package;
    public boolean id_int = true;
    public boolean id_new = true;
    protected float id_continue = 1.0f;
    private boolean id_throws;
    private float id_case;
    private boolean id_catch = true;

    public void id_byte(double d, double d2) {
    }

    public void id_int(int n) {
        this.id_extends = n;
    }

    public LZ(int n, int n2, int n3, int n4, rgP_2 rgP_22) {
        this.id_volatile = n;
        this.id_final = n2;
        this.id_extends = n3;
        this.id_native = n4;
        this.id_class = rgP_22;
    }

    @Override
    public boolean id_class(double d, double d2, int n) {
        if (this.id_break(n)) {
            this.id_protected(d, d2);
            return true;
        }
        return false;
    }

    protected void id_class(double d, double d2, double d3, double d4) {
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        if (this.id_new) {
            this.id_package = n >= this.id_volatile && n2 >= this.id_final && n < this.id_volatile + this.id_extends && n2 < this.id_final + this.id_native;
            this.id_break(ml_1, n, n2, f);
        }
    }

    protected void id_class(Ml_1 ml_1, QY qY, int n, int n2) {
    }

    public void id_class(Nf_1 nf_1) {
        nf_1.id_class(Np_1.id_class(rqn_3.dw, 1.0f));
    }

    @Override
    public boolean id_class(double d, double d2, int n, double d3, double d4) {
        if (this.id_break(n)) {
            this.id_class(d, d2, d3, d4);
            return true;
        }
        return false;
    }

    public void id_class(float f) {
        this.id_continue = f;
    }

    public void id_class(Ml_1 ml_1, int n, int n2) {
    }

    public void id_class(Ml_1 ml_1, cm_3 cm_32, int n) {
        this.id_class(ml_1, cm_32, 2, n);
    }

    protected void id_class(Ml_1 ml_1, cm_3 cm_32, rgP_2 rgP_22, int n, int n2, int n3, int n4, int n5) {
        this.id_class(ml_1, cm_32, rgP_22, (n + n3) / 2, n, n2, n3, n4, n5);
    }

    protected void id_class(Ml_1 ml_1, cm_3 cm_32, int n, int n2) {
        int n3 = this.id_volatile + n;
        int n4 = this.id_volatile + this.id_case() - n;
        this.id_class(ml_1, cm_32, this.C_(), n3, this.id_final, n4, this.id_final + this.id_native, n2);
    }

    protected void id_class(Ml_1 ml_1, cm_3 cm_32, rgP_2 rgP_22, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = cm_32.id_class(rgP_22) + 4;
        float f = (float)(n3 + n5 - 9) / 2.0f + 1.0f;
        float f2 = n4 - n2 + 1;
        if ((float)n7 > f2) {
            boolean bl = this.id_package && this.id_public() != 0.0f;
            float f3 = (float)n7 - f2;
            double d = (double)rqR_2.id_break() / 500.0;
            double d2 = Math.max((double)f3 * 0.5, 3.0);
            double d3 = bl ? (double)this.id_public() : Math.sin(1.5707963267948966 * Math.cos(Math.PI * 2 * d / d2)) / 2.0 + 0.5;
            double d4 = rfU_2.id_protected(d3, 0.0, (double)f3);
            this.id_class(n2, n3, n4, n5);
            cm_32.id_break(ml_1, rgP_22, (float)((double)n2 - d4) + 2.0f, f, n6);
            this.y_();
        } else {
            int n8 = rfU_2.id_class(n, n2 + n7 / 2, n4 - n7 / 2);
            cm_32.id_break(ml_1, rgP_22, n8, (int)f, n6);
        }
    }

    @Override
    public boolean id_break(boolean bl) {
        if (this.id_return() && this.id_int && this.id_new) {
            this.id_throws = !this.id_throws;
            this.id_throws(this.id_throws);
            return this.id_throws;
        }
        return false;
    }

    public LZ id_break(float f) {
        this.id_case = f;
        return this;
    }

    @Override
    public boolean id_break(double d, double d2) {
        return this.id_int && this.id_new && d >= (double)this.id_volatile && d2 >= (double)this.id_final && d < (double)(this.id_volatile + this.id_extends) && d2 < (double)(this.id_final + this.id_native);
    }

    public void id_break(rgP_2 rgP_22) {
        this.id_class = rgP_22;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        boolean bl;
        if (this.id_int && this.id_new && this.id_break(n) && (bl = this.id_throws(d, d2))) {
            if (this.id_synchronized()) {
                this.id_class(QY.id_instanceof().c());
            }
            this.id_byte(d, d2);
            return true;
        }
        return false;
    }

    protected boolean id_break(int n) {
        return n == 0;
    }

    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        QY qY = QY.id_instanceof();
        cm_3 cm_32 = (cm_3)qY.id_class[15];
        qY.A().id_class(id_finally);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, this.id_continue);
        int n3 = this.a_(this.B_());
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        this.id_break(ml_1, this.id_volatile, this.id_final, 0, 46 + n3 * 20, this.id_extends / 2, this.id_native);
        this.id_break(ml_1, this.id_volatile + this.id_extends / 2, this.id_final, 200 - this.id_extends / 2, 46 + n3 * 20, this.id_extends / 2, this.id_native);
        this.id_class(ml_1, qY, n, n2);
        int n4 = this.id_int ? 0xFFFFFF : 0xA0A0A0;
        this.id_class(ml_1, cm_32, n4 | rfU_2.id_case(this.id_continue * 255.0f) << 24);
    }

    protected boolean id_throws(double d, double d2) {
        return this.id_int && this.id_new && d >= (double)this.id_volatile && d2 >= (double)this.id_final && d < (double)(this.id_volatile + this.id_extends) && d2 < (double)(this.id_final + this.id_native);
    }

    protected void id_throws(boolean bl) {
    }

    public LZ id_finally(boolean bl) {
        this.id_catch = bl;
        return this;
    }

    public int id_case() {
        return this.id_extends;
    }

    public int id_else() {
        return this.id_native;
    }

    public void id_implements(boolean bl) {
        this.id_throws = bl;
    }

    public boolean id_return() {
        return this.id_catch;
    }

    public float id_public() {
        return this.id_case;
    }

    public void id_protected(double d, double d2) {
    }

    public boolean id_synchronized() {
        return true;
    }

    public boolean aO_() {
        return this.id_throws;
    }

    protected int a_(boolean bl) {
        int n = 1;
        if (!this.id_int) {
            n = 0;
        } else if (bl) {
            n = 2;
        }
        return n;
    }

    public boolean B_() {
        return this.id_package || this.id_throws;
    }

    protected rVi_1 A_() {
        return new rgn_3("gui.narrate.button", this.C_());
    }

    public rgP_2 C_() {
        return this.id_class;
    }
}

