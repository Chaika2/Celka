/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.Ok_1;
import celestial.gm_3;
import celestial.ly_3;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rjY_2;
import celestial.rje_3;

public abstract class lN_2
extends CH {
    protected float id_throw;

    protected abstract float id_byte();

    protected lN_2(gm_3 gm_32, double d, double d2, double d3) {
        super(gm_32, d, d2, d3);
        this.id_throw = 0.1f * (this.id_continue.nextFloat() * 0.5f + 0.5f) * 2.0f;
    }

    protected lN_2(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        super(gm_32, d, d2, d3, d4, d5, d6);
        this.id_throw = 0.1f * (this.id_continue.nextFloat() * 0.5f + 0.5f) * 2.0f;
    }

    public float id_class(float f) {
        return this.id_throw;
    }

    @Override
    public void id_class(Ok_1 ok_1, ly_3 ly_32, float f) {
        rjY_2 rjY_22;
        rjU_2 rjU_22 = ly_32.id_break();
        float f2 = (float)(rfU_2.id_protected((double)f, this.id_protected, this.id_catch) - rjU_22.id_class());
        float f3 = (float)(rfU_2.id_protected((double)f, this.id_throws, this.id_private) - rjU_22.id_break());
        float f4 = (float)(rfU_2.id_protected((double)f, this.id_case, this.id_implements) - rjU_22.id_byte());
        if (this.id_while == 0.0f) {
            rjY_22 = ly_32.id_case();
        } else {
            rjY_22 = new rjY_2(ly_32.id_case());
            float f5 = rfU_2.id_catch(f, this.id_try, this.id_while);
            rjY_22.id_class(rje_3.id_case.id_break(f5));
        }
        rje_3 rje_32 = new rje_3(-1.0f, -1.0f, 0.0f);
        rje_32.id_class(rjY_22);
        rje_3[] rje_3Array = new rje_3[]{new rje_3(-1.0f, -1.0f, 0.0f), new rje_3(-1.0f, 1.0f, 0.0f), new rje_3(1.0f, 1.0f, 0.0f), new rje_3(1.0f, -1.0f, 0.0f)};
        float f6 = this.id_class(f);
        for (int i = 0; i < 4; ++i) {
            rje_3 rje_33 = rje_3Array[i];
            rje_33.id_class(rjY_22);
            rje_33.id_class(f6);
            rje_33.id_byte(f2, f3, f4);
        }
        float f7 = this.id_break();
        float f8 = this.id_byte();
        float f9 = this.id_protected();
        float f10 = this.id_throws();
        int n = this.id_break(f);
        ok_1.id_class((double)rje_3Array[0].id_class(), (double)rje_3Array[0].id_break(), (double)rje_3Array[0].id_byte()).id_class(f8, f10).id_class(this.id_synchronized, this.id_return, this.id_public, this.id_goto).id_break(n).id_class();
        ok_1.id_class((double)rje_3Array[1].id_class(), (double)rje_3Array[1].id_break(), (double)rje_3Array[1].id_byte()).id_class(f8, f9).id_class(this.id_synchronized, this.id_return, this.id_public, this.id_goto).id_break(n).id_class();
        ok_1.id_class((double)rje_3Array[2].id_class(), (double)rje_3Array[2].id_break(), (double)rje_3Array[2].id_byte()).id_class(f7, f9).id_class(this.id_synchronized, this.id_return, this.id_public, this.id_goto).id_break(n).id_class();
        ok_1.id_class((double)rje_3Array[3].id_class(), (double)rje_3Array[3].id_break(), (double)rje_3Array[3].id_byte()).id_class(f7, f10).id_class(this.id_synchronized, this.id_return, this.id_public, this.id_goto).id_break(n).id_class();
    }

    protected abstract float id_break();

    protected abstract float id_throws();

    protected abstract float id_protected();

    @Override
    public CH id_protected(float f) {
        this.id_throw *= f;
        return super.id_protected(f);
    }
}

