/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.Fu_1;
import celestial.Ml_1;
import celestial.Np_1;
import celestial.QY;
import celestial.cb_3;
import celestial.rJD;
import celestial.rWu_1;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rqO_2;
import celestial.rqn_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class Fw_1
extends Fu_1<rJD> {
    private static final rqO_2 id_class = new rqO_2("textures/gui/container/stonecutter.png");
    private float id_throws;
    private boolean id_case;
    private int id_catch;
    private boolean id_private;

    private void id_byte(int n, int n2, int n3) {
        List<rWu_1> list = ((rJD)this.id_instanceof).id_break();
        for (int i = this.id_catch; i < n3 && i < ((rJD)this.id_instanceof).id_byte(); ++i) {
            int n4 = i - this.id_catch;
            int n5 = n + n4 % 4 * 16;
            int n6 = n4 / 4;
            int n7 = n2 + n6 * 18 + 2;
            this.id_volatile.id_float().id_class(list.get(i).id_byte(), n5, n7);
        }
    }

    public Fw_1(rJD rJD2, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(rJD2, rhz_32, rgP_22);
        rJD2.id_class(this::id_final);
        --this.id_goto;
    }

    @Override
    public boolean id_class(double d, double d2, int n, double d3, double d4) {
        if (this.id_case && this.id_native()) {
            int n2 = this.id_abstract + 14;
            int n3 = n2 + 54;
            this.id_throws = ((float)d2 - (float)n2 - 7.5f) / ((float)(n3 - n2) - 15.0f);
            this.id_throws = rfU_2.id_class(this.id_throws, 0.0f, 1.0f);
            this.id_catch = (int)((double)(this.id_throws * (float)this.id_finally()) + 0.5) * 4;
            return true;
        }
        return super.id_class(d, d2, n, d3, d4);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        super.id_class(ml_1, n, n2, f);
        this.id_break(ml_1, n, n2);
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        this.id_class(ml_1);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_class);
        int n3 = this.id_char;
        int n4 = this.id_abstract;
        this.id_break(ml_1, n3, n4, 0, 0, this.id_synchronized, this.id_return);
        int n5 = (int)(41.0f * this.id_throws);
        this.id_break(ml_1, n3 + 119, n4 + 15 + n5, 176 + (this.id_native() ? 0 : 12), 0, 12, 15);
        int n6 = this.id_char + 52;
        int n7 = this.id_abstract + 14;
        int n8 = this.id_catch + 12;
        this.id_break(ml_1, n, n2, n6, n7, n8);
        this.id_byte(n6, n7, n8);
    }

    @Override
    public boolean id_class(double d, double d2, double d3) {
        if (this.id_native()) {
            int n = this.id_finally();
            this.id_throws = (float)((double)this.id_throws - d3 / (double)n);
            this.id_throws = rfU_2.id_class(this.id_throws, 0.0f, 1.0f);
            this.id_catch = (int)((double)(this.id_throws * (float)n) + 0.5) * 4;
        }
        return true;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        this.id_case = false;
        if (this.id_private) {
            int n2 = this.id_char + 52;
            int n3 = this.id_abstract + 14;
            int n4 = this.id_catch + 12;
            for (int i = this.id_catch; i < n4; ++i) {
                int n5 = i - this.id_catch;
                double d3 = d - (double)(n2 + n5 % 4 * 16);
                double d4 = d2 - (double)(n3 + n5 / 4 * 18);
                if (!(d3 >= 0.0) || !(d4 >= 0.0) || !(d3 < 16.0) || !(d4 < 18.0) || !((rJD)this.id_instanceof).id_break((rhd_3)((cb_3)this.id_volatile.id_class[57]), i)) continue;
                QY.id_instanceof().c().id_class(Np_1.id_class(rqn_3.dg, 1.0f));
                ((Ax_1)this.id_volatile.id_class[55]).id_class(((rJD)this.id_instanceof).id_case, i);
                return true;
            }
            n2 = this.id_char + 119;
            n3 = this.id_abstract + 9;
            if (d >= (double)n2 && d < (double)(n2 + 12) && d2 >= (double)n3 && d2 < (double)(n3 + 54)) {
                this.id_case = true;
            }
        }
        return super.id_break(d, d2, n);
    }

    @Override
    protected void id_break(Ml_1 ml_1, int n, int n2) {
        super.id_break(ml_1, n, n2);
        if (this.id_private) {
            int n3 = this.id_char + 52;
            int n4 = this.id_abstract + 14;
            int n5 = this.id_catch + 12;
            List<rWu_1> list = ((rJD)this.id_instanceof).id_break();
            for (int i = this.id_catch; i < n5 && i < ((rJD)this.id_instanceof).id_byte(); ++i) {
                int n6 = i - this.id_catch;
                int n7 = n3 + n6 % 4 * 16;
                int n8 = n4 + n6 / 4 * 18 + 2;
                if (n < n7 || n >= n7 + 16 || n2 < n8 || n2 >= n8 + 18) continue;
                this.id_class(ml_1, list.get(i).id_byte(), n, n2);
            }
        }
    }

    private void id_break(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5) {
        for (int i = this.id_catch; i < n5 && i < ((rJD)this.id_instanceof).id_byte(); ++i) {
            int n6 = i - this.id_catch;
            int n7 = n3 + n6 % 4 * 16;
            int n8 = n6 / 4;
            int n9 = n4 + n8 * 18 + 2;
            int n10 = this.id_return;
            if (i == ((rJD)this.id_instanceof).id_class()) {
                n10 += 18;
            } else if (n >= n7 && n2 >= n9 && n < n7 + 16 && n2 < n9 + 18) {
                n10 += 36;
            }
            this.id_break(ml_1, n7, n9 - 1, 0, n10, 16, 18);
        }
    }

    protected int id_finally() {
        return (((rJD)this.id_instanceof).id_byte() + 4 - 1) / 4 - 3;
    }

    private void id_final() {
        this.id_private = ((rJD)this.id_instanceof).id_protected();
        if (!this.id_private) {
            this.id_throws = 0.0f;
            this.id_catch = 0;
        }
    }

    private boolean id_native() {
        return this.id_private && ((rJD)this.id_instanceof).id_byte() > 12;
    }
}

