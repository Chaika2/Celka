/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;
import celestial.Ml_1;
import celestial.QY;
import celestial.rfU_2;
import celestial.rrdD;
import celestial.rrkJ;
import celestial.rrkX;
import celestial.vm_3;

public class rrkk_1
extends rrkX {
    private float id_case = 1.0f;
    public boolean id_throws;
    private rrdD id_catch = null;

    public rrkk_1(int n, int n2, int n3, int n4, int n5, rrdD rrdD2, String string) {
        super(n, n2, n3, n4, n5, rrdD2, string);
        this.id_catch = rrdD2;
        this.id_case = rrdD2.id_new();
        this.id_class(rrkJ.id_class(rrdD2, this.id_extends));
    }

    @Override
    protected void id_class(Ml_1 ml_1, QY qY, int n, int n2) {
        if (this.id_new) {
            if (this.id_throws && !vm_3.id_synchronized()) {
                this.id_case = (float)(n - (this.id_volatile + 4)) / (float)(this.id_extends - 8);
                this.id_case = rfU_2.id_class(this.id_case, 0.0f, 1.0f);
                this.id_catch.id_class(this.id_case);
                this.id_case = this.id_catch.id_new();
                this.id_class(rrkJ.id_class(this.id_catch, this.id_extends));
            }
            qY.A().id_class(id_finally);
            MT.id_protected(1.0f, 1.0f, 1.0f, 1.0f);
            int n3 = (this.B_() ? 2 : 1) * 20;
            this.id_break(ml_1, this.id_volatile + (int)(this.id_case * (float)(this.id_extends - 8)), this.id_final, 0, 46 + n3, 4, 20);
            this.id_break(ml_1, this.id_volatile + (int)(this.id_case * (float)(this.id_extends - 8)) + 4, this.id_final, 196, 46 + n3, 4, 20);
        }
    }

    @Override
    public boolean id_class(double d, double d2, int n) {
        this.id_throws = false;
        return true;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (super.id_break(d, d2, n)) {
            this.id_case = (float)(d - (double)(this.id_volatile + 4)) / (float)(this.id_extends - 8);
            this.id_case = rfU_2.id_class(this.id_case, 0.0f, 1.0f);
            this.id_catch.id_class(this.id_case);
            this.id_class(rrkJ.id_class(this.id_catch, this.id_extends));
            this.id_throws = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean id_extends() {
        return false;
    }

    @Override
    public void id_implements() {
        this.id_case = this.id_catch.id_new();
    }

    @Override
    protected int a_(boolean bl) {
        return 0;
    }
}

