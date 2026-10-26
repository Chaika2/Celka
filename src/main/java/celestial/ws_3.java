/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.rMR;
import celestial.rfU_2;
import celestial.wG_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class ws_3
extends wN_2<rMR> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_catch;
    private final Iq_1 id_private;
    private final Iq_1 id_implements;
    private final Iq_1 id_finally;
    private final Iq_1 id_extends;

    public ws_3() {
        this.id_return = 32;
        this.id_public = 32;
        this.id_class = new Iq_1(this, 2, 8);
        this.id_class.id_class(-1.5f, 0.0f, -1.5f, 3.0f, 6.0f, 3.0f);
        this.id_class.id_class(0.0f, 16.5f, -3.0f);
        this.id_break = new Iq_1(this, 22, 1);
        this.id_break.id_class(-1.5f, -1.0f, -1.0f, 3.0f, 4.0f, 1.0f);
        this.id_break.id_class(0.0f, 21.07f, 1.16f);
        this.id_byte = new Iq_1(this, 19, 8);
        this.id_byte.id_class(-0.5f, 0.0f, -1.5f, 1.0f, 5.0f, 3.0f);
        this.id_byte.id_class(1.5f, 16.94f, -2.76f);
        this.id_protected = new Iq_1(this, 19, 8);
        this.id_protected.id_class(-0.5f, 0.0f, -1.5f, 1.0f, 5.0f, 3.0f);
        this.id_protected.id_class(-1.5f, 16.94f, -2.76f);
        this.id_throws = new Iq_1(this, 2, 2);
        this.id_throws.id_class(-1.0f, -1.5f, -1.0f, 2.0f, 3.0f, 2.0f);
        this.id_throws.id_class(0.0f, 15.69f, -2.76f);
        this.id_case = new Iq_1(this, 10, 0);
        this.id_case.id_class(-1.0f, -0.5f, -2.0f, 2.0f, 1.0f, 4.0f);
        this.id_case.id_class(0.0f, -2.0f, -1.0f);
        this.id_throws.id_break(this.id_case);
        this.id_catch = new Iq_1(this, 11, 7);
        this.id_catch.id_class(-0.5f, -1.0f, -0.5f, 1.0f, 2.0f, 1.0f);
        this.id_catch.id_class(0.0f, -0.5f, -1.5f);
        this.id_throws.id_break(this.id_catch);
        this.id_private = new Iq_1(this, 16, 7);
        this.id_private.id_class(-0.5f, 0.0f, -0.5f, 1.0f, 2.0f, 1.0f);
        this.id_private.id_class(0.0f, -1.75f, -2.45f);
        this.id_throws.id_break(this.id_private);
        this.id_implements = new Iq_1(this, 2, 18);
        this.id_implements.id_class(0.0f, -4.0f, -2.0f, 0.0f, 5.0f, 4.0f);
        this.id_implements.id_class(0.0f, -2.15f, 0.15f);
        this.id_throws.id_break(this.id_implements);
        this.id_finally = new Iq_1(this, 14, 18);
        this.id_finally.id_class(-0.5f, 0.0f, -0.5f, 1.0f, 2.0f, 1.0f);
        this.id_finally.id_class(1.0f, 22.0f, -1.05f);
        this.id_extends = new Iq_1(this, 14, 18);
        this.id_extends.id_class(-0.5f, 0.0f, -0.5f, 1.0f, 2.0f, 1.0f);
        this.id_extends.id_class(-1.0f, 22.0f, -1.05f);
    }

    private static wG_2 id_class(rMR rMR2) {
        if (rMR2.n()) {
            return wG_2.PARTY;
        }
        if (rMR2.Sc()) {
            return wG_2.SITTING;
        }
        return rMR2.sx() ? wG_2.FLYING : wG_2.STANDING;
    }

    private void id_class(wG_2 wG_22) {
        this.id_implements.id_case = -0.2214f;
        this.id_class.id_case = 0.4937f;
        this.id_byte.id_case = -0.69813174f;
        this.id_byte.id_catch = (float)(-Math.PI);
        this.id_protected.id_case = -0.69813174f;
        this.id_protected.id_catch = (float)(-Math.PI);
        this.id_finally.id_case = -0.0299f;
        this.id_extends.id_case = -0.0299f;
        this.id_finally.id_protected = 22.0f;
        this.id_extends.id_protected = 22.0f;
        this.id_finally.id_private = 0.0f;
        this.id_extends.id_private = 0.0f;
        switch (wG_22) {
            case SITTING: {
                float f = 1.9f;
                this.id_throws.id_protected = 17.59f;
                this.id_break.id_case = 1.5388988f;
                this.id_break.id_protected = 22.97f;
                this.id_class.id_protected = 18.4f;
                this.id_byte.id_private = -0.0873f;
                this.id_byte.id_protected = 18.84f;
                this.id_protected.id_private = 0.0873f;
                this.id_protected.id_protected = 18.84f;
                this.id_finally.id_protected += 1.0f;
                this.id_extends.id_protected += 1.0f;
                this.id_finally.id_case += 1.0f;
                this.id_extends.id_case += 1.0f;
                break;
            }
            case PARTY: {
                this.id_finally.id_private = -0.34906584f;
                this.id_extends.id_private = 0.34906584f;
            }
            default: {
                break;
            }
            case FLYING: {
                this.id_finally.id_case += 0.69813174f;
                this.id_extends.id_case += 0.69813174f;
            }
        }
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_byte, (Object)this.id_protected, (Object)this.id_break, (Object)this.id_throws, (Object)this.id_finally, (Object)this.id_extends);
    }

    @Override
    public void id_class(rMR rMR2, float f, float f2, float f3, float f4, float f5) {
        this.id_class(ws_3.id_class(rMR2), (Integer)rMR2.id_throws[41], f, f2, f3, f4, f5);
    }

    @Override
    public void id_class(rMR rMR2, float f, float f2, float f3) {
        this.id_class(ws_3.id_class(rMR2));
    }

    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4, int n3) {
        this.id_class(wG_2.ON_SHOULDER);
        this.id_class(wG_2.ON_SHOULDER, n3, f, f2, 0.0f, f3, f4);
        this.id_class().forEach(iq_1 -> iq_1.id_class(ml_1, ok_1, n, n2));
    }

    private void id_class(wG_2 wG_22, int n, float f, float f2, float f3, float f4, float f5) {
        this.id_throws.id_case = f5 * ((float)Math.PI / 180);
        this.id_throws.id_catch = f4 * ((float)Math.PI / 180);
        this.id_throws.id_private = 0.0f;
        this.id_throws.id_byte = 0.0f;
        this.id_class.id_byte = 0.0f;
        this.id_break.id_byte = 0.0f;
        this.id_protected.id_byte = -1.5f;
        this.id_byte.id_byte = 1.5f;
        switch (wG_22) {
            case SITTING: {
                break;
            }
            case PARTY: {
                float f6 = rfU_2.id_break((float)n);
                float f7 = rfU_2.id_class((float)n);
                this.id_throws.id_byte = f6;
                this.id_throws.id_protected = 15.69f + f7;
                this.id_throws.id_case = 0.0f;
                this.id_throws.id_catch = 0.0f;
                this.id_throws.id_private = rfU_2.id_class((float)n) * 0.4f;
                this.id_class.id_byte = f6;
                this.id_class.id_protected = 16.5f + f7;
                this.id_byte.id_private = -0.0873f - f3;
                this.id_byte.id_byte = 1.5f + f6;
                this.id_byte.id_protected = 16.94f + f7;
                this.id_protected.id_private = 0.0873f + f3;
                this.id_protected.id_byte = -1.5f + f6;
                this.id_protected.id_protected = 16.94f + f7;
                this.id_break.id_byte = f6;
                this.id_break.id_protected = 21.07f + f7;
                break;
            }
            case STANDING: {
                this.id_finally.id_case += rfU_2.id_break(f * 0.6662f) * 1.4f * f2;
                this.id_extends.id_case += rfU_2.id_break(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
            }
            default: {
                float f8 = f3 * 0.3f;
                this.id_throws.id_protected = 15.69f + f8;
                this.id_break.id_case = 1.015f + rfU_2.id_break(f * 0.6662f) * 0.3f * f2;
                this.id_break.id_protected = 21.07f + f8;
                this.id_class.id_protected = 16.5f + f8;
                this.id_byte.id_private = -0.0873f - f3;
                this.id_byte.id_protected = 16.94f + f8;
                this.id_protected.id_private = 0.0873f + f3;
                this.id_protected.id_protected = 16.94f + f8;
                this.id_finally.id_protected = 22.0f + f8;
                this.id_extends.id_protected = 22.0f + f8;
            }
        }
    }
}

