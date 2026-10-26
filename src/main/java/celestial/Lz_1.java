/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.Nf_1;
import celestial.QY;
import celestial.rVi_1;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rgn_3;
import com.mojang.blaze3d.systems.RenderSystem;

public abstract class Lz_1
extends LZ {
    protected double id_throws;

    @Override
    public void id_byte(double d, double d2) {
        this.id_class(d);
    }

    public Lz_1(int n, int n2, int n3, int n4, rgP_2 rgP_22, double d) {
        super(n, n2, n3, n4, rgP_22);
        this.id_throws = d;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        boolean bl;
        boolean bl2 = bl = n == 263;
        if (bl || n == 262) {
            float f = bl ? -1.0f : 1.0f;
            this.id_break(this.id_throws + (double)(f / (float)(this.id_extends - 8)));
        }
        return false;
    }

    private void id_class(double d) {
        this.id_break((d - (double)(this.id_volatile + 4)) / (double)(this.id_extends - 8));
    }

    @Override
    protected void id_class(double d, double d2, double d3, double d4) {
        this.id_class(d);
        super.id_class(d, d2, d3, d4);
    }

    @Override
    public void id_class(Nf_1 nf_1) {
    }

    @Override
    protected void id_class(Ml_1 ml_1, QY qY, int n, int n2) {
        qY.A().id_class(id_finally);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        int n3 = (this.B_() ? 2 : 1) * 20;
        this.id_break(ml_1, this.id_volatile + (int)(this.id_throws * (double)(this.id_extends - 8)), this.id_final, 0, 46 + n3, 4, 20);
        this.id_break(ml_1, this.id_volatile + (int)(this.id_throws * (double)(this.id_extends - 8)) + 4, this.id_final, 196, 46 + n3, 4, 20);
    }

    private void id_break(double d) {
        double d2 = this.id_throws;
        this.id_throws = rfU_2.id_class(d, 0.0, 1.0);
        if (d2 != this.id_throws) {
            this.id_private();
        }
        this.id_catch();
    }

    protected abstract void id_catch();

    @Override
    public void id_protected(double d, double d2) {
        super.id_class(QY.id_instanceof().c());
    }

    protected abstract void id_private();

    @Override
    protected int a_(boolean bl) {
        return 0;
    }

    @Override
    protected rVi_1 A_() {
        return new rgn_3("gui.narrate.slider", this.C_());
    }
}

