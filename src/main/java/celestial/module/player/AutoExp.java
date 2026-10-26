/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.player;

import celestial.Ax_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rjG_2;
import celestial.rpm_3;
import celestial.rqR_2;
import celestial.rrIF;
import celestial.rrIm_1;
import celestial.rrLu_1;
import celestial.rrTI;
import celestial.rrTT;
import celestial.rrTg_1;
import celestial.rrTj_1;
import celestial.rrTp_1;
import celestial.rrTq_1;
import celestial.rrfP_2;
import celestial.rrfY_2;
import celestial.rrfo_3;
import celestial.rrfw_3;
import celestial.rrnF_2;
import celestial.setting.KeyBind;

public class AutoExp
extends Module
implements rrnF_2 {
    public Object[] id_break;

    public AutoExp() {
        super("Auto Exp", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043a\u0438\u0434\u0430\u0435\u0442 \u043f\u0443\u0437\u044b\u0440\u044c\u043a\u0438\n\u0441 \u043e\u043f\u044b\u0442\u043e\u043c \u043f\u043e\u0434 \u043d\u043e\u0433\u0438", Category.PLAYER);
        this.id_return();
        rrIF var5 = new rrIF("\u041a\u0438\u0434\u0430\u0442\u044c \u043d\u0430", KeyBind.NONE);
        this.id_break[0] = var5;
        rrIm_1 var6 = new rrIm_1("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(100.0f), Float.valueOf(10.0f));
        this.id_break[1] = var6;
        rrfP_2 var7 = new rrfP_2();
        this.id_break[2] = var7;
        rrTT var8 = new rrTT(this);
        this.id_break[3] = var8;
        rrfw_3 var9 = new rrfw_3();
        this.id_break[4] = var9;
        this.id_break[6] = -1;
        this.id_break[7] = -1;
        this.id_class((rrIF)this.id_break[0], (rrIm_1)this.id_break[1]);
    }

    @EventTarget(id_class=-100)
    public void id_class(q_1 var1) {
        this.id_return();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            ((rrfP_2)this.id_break[2]).id_class((Integer)this.id_break[7] == -1 && rqR_2.id_break() - (Long)this.id_break[5] > 200L);
            if (((rrIF)this.id_break[0]).id_break()) {
                int var2 = rrfY_2.id_class(rdy_3.xe, false, true);
                if (var2 == -1) {
                    this.id_new();
                    return;
                }
                rrTg_1 var3 = () -> ((cb_3)AutoExp.id_import.id_class[57]).id_goto().id_case(90.0f);
                ((rrTT)this.id_break[3]).id_class((rrTj_1)var3, (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]));
                if (!((cb_3)AutoExp.id_import.id_class[57]).z().id_break(var3.getNeedRotation(), 3.0f)) {
                    return;
                }
                if (((rrfw_3)this.id_break[4]).id_class(((Float)((rrIm_1)this.id_break[1]).id_byte()).floatValue())) {
                    int var4 = this.id_class(var2);
                    if (var4 > 8 && (Integer)this.id_break[7] == -1) {
                        this.id_break[7] = var4;
                    }
                    ((rrfw_3)this.id_break[4]).id_class();
                }
            } else {
                this.id_new();
            }
        }
    }

    @EventTarget
    public void id_class(rrLu_1 var1) {
        this.id_return();
        ((rrfP_2)this.id_break[2]).id_class(var1);
    }

    private int id_class(int var1) {
        this.id_return();
        if (var1 == -2) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return var1;
        }
        if (var1 == -3) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return var1;
        }
        if (var1 >= 0 && var1 < 9) {
            this.id_break[6] = ((rhz_3)((cb_3)AutoExp.id_import.id_class[57]).id_implements[1]).id_protected;
            rrfo_3.id_class(var1);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            ((Ax_1)AutoExp.id_import.id_class[55]).id_break = (Integer)this.id_break[6];
            return var1;
        }
        if (var1 >= 9 && var1 <= 36 && rqR_2.id_break() - (Long)this.id_break[5] > 300L) {
            ((rrfP_2)this.id_break[2]).id_class(((rhz_3)((cb_3)AutoExp.id_import.id_class[57]).id_implements[1]).id_protected);
            ((Ax_1)AutoExp.id_import.id_class[55]).id_class(var1);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            this.id_break[5] = rqR_2.id_break();
            return var1;
        }
        return -1;
    }

    @Override
    public float id_break() {
        return -1.0f;
    }

    private static int id_break(int var0) {
        return Integer.rotateLeft(var0, 16) ^ 0x22360E51;
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_new();
    }

    @Override
    public rrTp_1 id_catch() {
        return (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0]);
    }

    public void id_new() {
        this.id_return();
        ((rrTT)this.id_break[3]).id_final();
        ((rrTT)this.id_break[3]).id_finally();
        ((rrfw_3)this.id_break[4]).id_class();
        if ((Integer)this.id_break[7] != -1) {
            ((Ax_1)AutoExp.id_import.id_class[55]).id_class((Integer)this.id_break[7]);
            this.id_break[5] = rqR_2.id_break();
            this.id_break[7] = -1;
        }
        if ((Integer)this.id_break[6] != -1) {
            rrfo_3.id_class((Integer)this.id_break[6]);
            this.id_break[6] = -1;
        }
    }

    private void id_return() {
        if (this.id_break == null) {
            this.id_break = new Object[8];
            this.id_break[5] = 0L;
            this.id_break[6] = 0;
            this.id_break[7] = 0;
        }
    }

    @Override
    public float id_private() {
        return -1.0f;
    }

    @Override
    public rrTq_1 aB_() {
        return new rrTq_1(rjG_2.id_catch(), ((cb_3)AutoExp.id_import.id_class[57]).id_goto());
    }
}

