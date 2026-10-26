/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.an_3;
import celestial.rfU_2;
import celestial.wI_2;

public class wf_3<T extends an_3>
extends wI_2<T> {
    private boolean id_finally;
    private final Iq_1 id_extends = new Iq_1(this).id_break(64, 128);

    public wf_3(float f) {
        super(f, 64, 128);
        this.id_extends.id_class(0.0f, -2.0f, 0.0f);
        this.id_extends.id_class(0, 0).id_class(0.0f, 3.0f, -6.75f, 1.0f, 1.0f, 1.0f, -0.25f);
        this.id_implements.id_break(this.id_extends);
        this.id_class = new Iq_1(this).id_break(64, 128);
        this.id_class.id_class(0.0f, 0.0f, 0.0f);
        this.id_class.id_class(0, 0).id_class(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, f);
        this.id_break = new Iq_1(this).id_break(64, 128);
        this.id_break.id_class(-5.0f, -10.03125f, -5.0f);
        this.id_break.id_class(0, 64).id_class(0.0f, 0.0f, 0.0f, 10.0f, 2.0f, 10.0f);
        this.id_class.id_break(this.id_break);
        this.id_class.id_break(this.id_implements);
        Iq_1 iq_1 = new Iq_1(this).id_break(64, 128);
        iq_1.id_class(1.75f, -4.0f, 2.0f);
        iq_1.id_class(0, 76).id_class(0.0f, 0.0f, 0.0f, 7.0f, 4.0f, 7.0f);
        iq_1.id_case = -0.05235988f;
        iq_1.id_private = 0.02617994f;
        this.id_break.id_break(iq_1);
        Iq_1 iq_12 = new Iq_1(this).id_break(64, 128);
        iq_12.id_class(1.75f, -4.0f, 2.0f);
        iq_12.id_class(0, 87).id_class(0.0f, 0.0f, 0.0f, 4.0f, 4.0f, 4.0f);
        iq_12.id_case = -0.10471976f;
        iq_12.id_private = 0.05235988f;
        iq_1.id_break(iq_12);
        Iq_1 iq_13 = new Iq_1(this).id_break(64, 128);
        iq_13.id_class(1.75f, -2.0f, 2.0f);
        iq_13.id_class(0, 95).id_class(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f, 0.25f);
        iq_13.id_case = -0.20943952f;
        iq_13.id_private = 0.10471976f;
        iq_12.id_break(iq_13);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        super.id_class(t, f, f2, f3, f4, f5);
        this.id_implements.id_class(0.0f, -2.0f, 0.0f);
        float f6 = 0.01f * (float)(((an_3)t).V() % 10);
        this.id_implements.id_case = rfU_2.id_class((float)((Integer)((an_3)t).id_throws[41]).intValue() * f6) * 4.5f * ((float)Math.PI / 180);
        this.id_implements.id_catch = 0.0f;
        this.id_implements.id_private = rfU_2.id_break((float)((Integer)((an_3)t).id_throws[41]).intValue() * f6) * 2.5f * ((float)Math.PI / 180);
        if (this.id_finally) {
            this.id_implements.id_class(0.0f, 1.0f, -1.5f);
            this.id_implements.id_case = -0.9f;
        }
    }

    public void id_break(boolean bl) {
        this.id_finally = bl;
    }

    public Iq_1 id_break() {
        return this.id_implements;
    }
}

