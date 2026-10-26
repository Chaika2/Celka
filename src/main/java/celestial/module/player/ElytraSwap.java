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
import celestial.rJr_1;
import celestial.rXQ;
import celestial.rXa_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rqR_2;
import celestial.rrAK;
import celestial.rrAL;
import celestial.rrAg_1;
import celestial.rrFj_1;
import celestial.rrIF;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrLB;
import celestial.rrLY;
import celestial.rrLu_1;
import celestial.rrQX;
import celestial.rrfP_2;
import celestial.rrfY_2;
import celestial.rrfZ_2;
import celestial.rrfg_3;
import celestial.rrfo_3;
import celestial.rrmi_3;
import celestial.rrnh_3;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.rrvT;
import celestial.setting.KeyBind;

public class ElytraSwap
extends Module {
    public Object[] id_break;
    private static int[] id_catch = new int[]{Integer.MAX_VALUE};

    private void id_char() {
        int var3;
        this.id_super();
        boolean var1 = rrfY_2.id_class(rdy_3.kc);
        rdn_3 var2 = ((cb_3)ElytraSwap.id_import.id_class[57]).id_class(rXQ.CHEST);
        if ((var2.id_break() != rdy_3.kc || var1) && (var3 = rrfY_2.id_break(rrfY_2.id_class(false, false))) != -1) {
            if (((rrIk_1)this.id_break[7]).id_class().booleanValue() && rrfZ_2.id_byte()) {
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), "\u0412\u044b \u043d\u0430\u0445\u043e\u0434\u0438\u0442\u0435\u0441\u044c \u0432 \u041f\u0412\u041f \u0440\u0435\u0436\u0438\u043c\u0435", 2000));
            } else {
                ((rrmi_3)this.id_break[10]).id_class(var2, var3);
                this.id_class(var3, 6);
                this.id_break[13] = true;
            }
        }
    }

    public ElytraSwap() {
        super("Elytra Swap", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0441\u043b\u043e\u0442\n\u0441 \u043d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a\u043e\u043c \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0443", Category.UTIL);
        this.id_super();
        rrIF var5 = new rrIF("\u041a\u043b\u0430\u0432\u0438\u0448\u0430 \u0441\u0432\u0430\u043f\u0430", KeyBind.NONE);
        this.id_break[0] = var5;
        rrIF var6 = new rrIF("\u041a\u043b\u0430\u0432\u0438\u0448\u0430\n\u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a\u0430", KeyBind.NONE);
        this.id_break[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u041f\u043e\u043b\u0443\u0447\u0438\u043b \u0443\u0440\u043e\u043d", false);
        this.id_break[2] = var7;
        rrIk_1 var8 = new rrIk_1("\u041f\u0440\u0438\u0437\u0435\u043c\u043b\u0438\u043b\u0441\u044f", false);
        this.id_break[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u041d\u0430\u043d\u0451\u0441 \u0443\u0440\u043e\u043d", false);
        this.id_break[4] = var9;
        rrIk_1 var10 = new rrIk_1("\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u043f\u043e\u043b\u0451\u0442", true);
        this.id_break[5] = var10;
        rrIk_1 var11 = new rrIk_1("\u0417\u0430\u043f\u0443\u0441\u043a\u0430\u0442\u044c 1 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a", false);
        this.id_break[6] = var11;
        rrIk_1 var12 = new rrIk_1("\u041d\u0435 \u0440\u0430\u0431\u043e\u0442\u0430\u0442\u044c \u0432 \u041f\u0412\u041f", false);
        this.id_break[7] = var12;
        rrfP_2 var13 = new rrfP_2();
        this.id_break[8] = var13;
        rrmi_3 var14 = new rrmi_3();
        this.id_break[10] = var14;
        rrfg_3 var15 = new rrfg_3();
        this.id_break[11] = var15;
        this.id_class(new rrIc_1("\u041f\u0435\u0440\u0435\u043a\u043b. \u0435\u0441\u043b\u0438", (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[3]), (rrIF)this.id_break[0], (rrIF)this.id_break[1], (rrIk_1)this.id_break[5], (rrIk_1)this.id_break[6], (rrIk_1)this.id_break[7]);
    }

    private boolean id_interface() {
        this.id_super();
        if (!((Boolean)this.id_break[13]).booleanValue()) {
            return false;
        }
        if (((rrIk_1)this.id_break[2]).id_class().booleanValue() && ((rrfg_3)this.id_break[11]).id_class()) {
            return true;
        }
        return ((rrIk_1)this.id_break[3]).id_class() != false && ((cb_3)ElytraSwap.id_import.id_class[57]).BL() && (Boolean)((cb_3)ElytraSwap.id_import.id_class[57]).id_break[40] != false;
    }

    private void id_class(int var1, int var2) {
        int var3 = ((rJr_1)((cb_3)ElytraSwap.id_import.id_class[57]).id_implements[4]).id_case;
        if (var1 > 36) {
            ((Ax_1)ElytraSwap.id_import.id_class[55]).id_class(var3, var2, var1 - 36, rXa_1.SWAP, false);
        } else {
            int var4 = ((rhz_3)((cb_3)ElytraSwap.id_import.id_class[57]).id_implements[1]).id_protected % 8 + 1;
            ((Ax_1)ElytraSwap.id_import.id_class[55]).id_class(var3, var1, var4, rXa_1.SWAP, true);
            ((Ax_1)ElytraSwap.id_import.id_class[55]).id_class(var3, var2, var4, rXa_1.SWAP, true);
            ((Ax_1)ElytraSwap.id_import.id_class[55]).id_class(var3, var1, var4, rXa_1.SWAP, false);
        }
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLY.id_class());
    }

    @EventTarget
    public void id_class(rrAg_1 var1) {
        this.id_super();
        rdn_3 var2 = var1.id_byte();
        if ((rdn_3)this.id_break[12] != null && rdn_3.id_break(var2, (rdn_3)this.id_break[12])) {
            if (var2.id_break() == rdy_3.kc) {
                this.id_break[13] = false;
            } else {
                ((rrmi_3)this.id_break[10]).id_class(var2, var1.id_class());
                this.id_break[13] = true;
            }
        }
    }

    @EventTarget
    public void id_class(rrAK var1) {
        this.id_super();
        rdn_3 var6 = ((cb_3)ElytraSwap.id_import.id_class[57]).id_class(rXQ.CHEST);
        this.id_break[12] = var6;
    }

    @EventTarget
    public void id_class(rrFj_1 var1) {
        this.id_super();
        if (var1.id_class() instanceof rhd_3 && ((rrIk_1)this.id_break[4]).id_class().booleanValue() && ((Boolean)this.id_break[13]).booleanValue()) {
            this.id_continue();
        }
    }

    @EventTarget
    public void id_class(rrnh_3 var1) {
        this.id_super();
        ((rrfg_3)this.id_break[11]).id_class(var1);
    }

    @EventTarget
    public void id_class(rrLu_1 var1) {
        this.id_super();
        ((rrfP_2)this.id_break[8]).id_class(var1);
        ((rrfg_3)this.id_break[11]).id_class(var1);
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_super();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            ((rrfP_2)this.id_break[8]).id_class(rqR_2.id_break() - (Long)this.id_break[9] > 200L);
            if (this.id_interface()) {
                this.id_continue();
            }
            if (((cb_3)ElytraSwap.id_import.id_class[57]).Sy()) {
                rdn_3 var2 = ((cb_3)ElytraSwap.id_import.id_class[57]).id_class(rXQ.CHEST);
                if (var2.id_break() == rdy_3.kc) {
                    this.id_break[15] = (Integer)this.id_break[15] + 1;
                    if (((rrIk_1)this.id_break[6]).id_class().booleanValue() && (Integer)this.id_break[15] < 2) {
                        this.id_try();
                    }
                } else {
                    this.id_break[15] = 0;
                }
                if (((Boolean)this.id_break[14]).booleanValue()) {
                    this.id_try();
                    this.id_break[14] = false;
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrLB var1) {
        this.id_super();
        if (var1.id_break() == ((rrIF)this.id_break[0]).id_finally().id_byte()) {
            this.id_goto();
        } else if (var1.id_break() == ((rrIF)this.id_break[1]).id_finally().id_byte() && ((cb_3)ElytraSwap.id_import.id_class[57]).Sy()) {
            this.id_break[14] = true;
        }
    }

    @EventTarget
    public void id_class(rrAL var1) {
        this.id_return();
    }

    private int id_break(int var1) {
        this.id_super();
        if (var1 == -2) {
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            return var1;
        }
        if (var1 == -3) {
            rrfo_3.id_class(rpm_3.OFF_HAND);
            return var1;
        }
        if (var1 >= 0 && var1 < 9) {
            rrfo_3.id_class(var1);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            rrfo_3.id_class(((rhz_3)((cb_3)ElytraSwap.id_import.id_class[57]).id_implements[1]).id_protected);
            return var1;
        }
        if (var1 >= 9 && var1 <= 36) {
            ((rrfP_2)this.id_break[8]).id_class(((rhz_3)((cb_3)ElytraSwap.id_import.id_class[57]).id_implements[1]).id_protected);
            ((Ax_1)ElytraSwap.id_import.id_class[55]).id_class(var1);
            rrfo_3.id_class(rpm_3.MAIN_HAND);
            this.id_break[9] = rqR_2.id_break();
            return var1;
        }
        return -1;
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_super();
        super.id_throws(var1);
        this.id_while();
        ((rrmi_3)this.id_break[10]).id_throws();
        this.id_break[14] = false;
        this.id_break[15] = 0;
    }

    private void id_goto() {
        rdn_3 var1 = ((cb_3)ElytraSwap.id_import.id_class[57]).id_class(rXQ.CHEST);
        if (var1.id_break() == rdy_3.kc) {
            this.id_continue();
        } else {
            this.id_char();
        }
    }

    private void id_continue() {
        int var1;
        this.id_super();
        if (((rrmi_3)this.id_break[10]).id_class() && (var1 = ((rrmi_3)this.id_break[10]).id_class(true, new String[0])) != -1) {
            this.id_class(var1, 6);
            this.id_while();
        }
    }

    private void id_return() {
        this.id_super();
        rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private();
        if (((rrIk_1)this.id_break[5]).id_class().booleanValue() && var1.P().id_super()) {
            cb_3 var10000 = (cb_3)ElytraSwap.id_import.id_class[57];
            Boolean var6 = true;
            var10000.id_break[38] = var6;
        }
    }

    private void id_super() {
        if (this.id_break == null) {
            this.id_break = new Object[16];
            this.id_break[9] = 0L;
            this.id_break[13] = false;
            this.id_break[14] = false;
            this.id_break[15] = 0;
        }
    }

    private void id_try() {
        int var1 = this.id_public();
        int var2 = this.id_break(var1);
        if (var2 > 8) {
            ((Ax_1)ElytraSwap.id_import.id_class[55]).id_class(var2);
        }
    }

    private void id_while() {
        this.id_super();
        ((rrfg_3)this.id_break[11]).id_break();
        this.id_break[15] = 0;
        this.id_break[13] = false;
    }

    private int id_public() {
        if (((cb_3)ElytraSwap.id_import.id_class[57]).ss().id_break() == rdy_3.dc) {
            return -2;
        }
        if (((cb_3)ElytraSwap.id_import.id_class[57]).Sn().id_break() == rdy_3.dc) {
            return -3;
        }
        int var1 = id_catch[0];
        int var2 = -1;
        for (int var3 = 0; var3 < 45; ++var3) {
            int var5;
            rdn_3 var4 = ((rhz_3)((cb_3)ElytraSwap.id_import.id_class[57]).id_implements[1]).id_extends(var3);
            if (var4.id_break() != rdy_3.dc || (var5 = var4.id_char()) >= var1) continue;
            var2 = var3;
            var1 = var5;
        }
        return var2;
    }
}

