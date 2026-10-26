/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.movement;

import celestial.OH;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rfU_2;
import celestial.rqw_3;
import celestial.rrAy_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrQX;
import celestial.rrnZ_2;

public class Timer
extends Module
implements rrnZ_2 {
    public static Object[] id_break;
    private static double[] id_protected;
    public Object[] id_byte;

    public Timer() {
        super("Timer", "\u0423\u0441\u043a\u043e\u0440\u044f\u0435\u0442 \u0432\u0440\u0435\u043c\u044f \u0438\u0433\u0440\u044b", Category.MOVEMENT);
        this.id_goto();
        rrIm_1 var5 = new rrIm_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", Float.valueOf(1.8f), Float.valueOf(1.1f), Float.valueOf(10.0f), Float.valueOf(0.1f));
        this.id_byte[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0423\u043c\u043d\u044b\u0439 \u0440\u0435\u0436\u0438\u043c", true);
        this.id_byte[1] = var6;
        rrIm_1 var7 = (rrIm_1)new rrIm_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0443\u0431\u044b\u0432\u0430\u043d\u0438\u044f", Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(3.0f), Float.valueOf(0.1f)).id_class(() -> ((rrIk_1)this.id_byte[1]).id_class());
        this.id_byte[2] = var7;
        rrIm_1 var8 = (rrIm_1)new rrIm_1("\u0414\u043e\u0431\u0430\u0432\u043b\u044f\u0442\u044c \u0432 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0438", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(0.05f)).id_class(() -> ((rrIk_1)this.id_byte[1]).id_class());
        this.id_byte[3] = var8;
        this.id_class(true, false);
        this.id_class((rrIm_1)this.id_byte[0], (rrIk_1)this.id_byte[1], (rrIm_1)this.id_byte[2], (rrIm_1)this.id_byte[3]);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(new OH<Object>(rrAy_1.class, var1 -> this.id_class((rrAy_1)var1)));
    }

    private static void id_this() {
        id_protected = new double[4];
    }

    public void id_class(rrAy_1 var1) {
        this.id_class(((cb_3)Timer.id_import.id_class[57]).N(), ((cb_3)Timer.id_import.id_class[57]).b(), ((cb_3)Timer.id_import.id_class[57]).id_for(), ((cb_3)Timer.id_import.id_class[57]).O(), ((cb_3)Timer.id_import.id_class[57]).id_static());
    }

    public void id_class(float var1, float var2, double var3, double var5, double var7) {
        this.id_goto();
        if (this.id_continue()) {
            Float var13 = Float.valueOf(((Float)this.id_byte[4]).floatValue() - (((Float)((rrIm_1)this.id_byte[2]).id_byte()).floatValue() + 0.4f));
            this.id_byte[4] = var13;
        } else {
            Float var14 = Float.valueOf(((Float)this.id_byte[4]).floatValue() - ((Float)((rrIm_1)this.id_byte[3]).id_byte()).floatValue() / 10.0f);
            this.id_byte[4] = var14;
        }
        Float var15 = Float.valueOf((float)rfU_2.id_class((double)((Float)this.id_byte[4]).floatValue(), id_protected[0], Math.floor(100.0f / ((rqw_3)Timer.id_import.id_class[6]).id_class())));
        this.id_byte[4] = var15;
        Double var16 = var3;
        this.id_byte[5] = var16;
        Double var17 = var5;
        this.id_byte[6] = var17;
        Double var18 = var7;
        this.id_byte[7] = var18;
        Float var19 = Float.valueOf(var1);
        this.id_byte[8] = var19;
        Float var20 = Float.valueOf(var2);
        this.id_byte[9] = var20;
    }

    @Override
    public void id_class() {
        this.id_byte(false);
    }

    @EventTarget(id_class=-200)
    public void id_class(q_1 var1) {
        this.id_goto();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            ((rqw_3)Timer.id_import.id_class[6]).id_class(((Float)((rrIm_1)this.id_byte[0]).id_byte()).floatValue());
            if (!((rrIk_1)this.id_byte[1]).id_class().booleanValue() || ((rqw_3)Timer.id_import.id_class[6]).id_class() <= 1.0f) {
                return;
            }
            if (((Float)this.id_byte[4]).floatValue() < 90.0f / ((Float)((rrIm_1)this.id_byte[0]).id_byte()).floatValue()) {
                Float var6 = Float.valueOf(((Float)this.id_byte[4]).floatValue() + ((Float)((rrIm_1)this.id_byte[2]).id_byte()).floatValue());
                this.id_byte[4] = var6;
                Float var7 = Float.valueOf(rfU_2.id_class(((Float)this.id_byte[4]).floatValue(), 0.0f, 100.0f / ((Float)((rrIm_1)this.id_byte[0]).id_byte()).floatValue()));
                this.id_byte[4] = var7;
            } else {
                this.aw_();
            }
        }
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        ((rqw_3)Timer.id_import.id_class[6]).id_class(1.0f);
    }

    private void id_goto() {
        if (this.id_byte == null) {
            this.id_byte = new Object[10];
            this.id_byte[4] = Float.valueOf(0.0f);
            this.id_byte[5] = 0.0;
            this.id_byte[6] = 0.0;
            this.id_byte[7] = 0.0;
            this.id_byte[8] = Float.valueOf(0.0f);
            this.id_byte[9] = Float.valueOf(0.0f);
        }
    }

    private boolean id_continue() {
        this.id_goto();
        return ((Double)this.id_byte[5]).doubleValue() == ((cb_3)Timer.id_import.id_class[57]).rx() && ((Double)this.id_byte[6]).doubleValue() == ((cb_3)Timer.id_import.id_class[57]).re() && ((Double)this.id_byte[7]).doubleValue() == ((cb_3)Timer.id_import.id_class[57]).BO() && this.id_byte[8] == ((cb_3)Timer.id_import.id_class[57]).id_throws[15] && this.id_byte[9] == ((cb_3)Timer.id_import.id_class[57]).id_throws[16];
    }

    public float id_new() {
        this.id_goto();
        return 1.0f - ((Float)this.id_byte[4]).floatValue() / (100.0f / ((Float)((rrIm_1)this.id_byte[0]).id_byte()).floatValue());
    }

    static {
        id_protected = new double[4];
        Object[] var0 = new Object[]{Float.valueOf(0.0f)};
        id_break = var0;
    }
}

