/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.combat;

import celestial.Ax_1;
import celestial.Y;
import celestial.an_3;
import celestial.cb_3;
import celestial.cq_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rJr_1;
import celestial.rSa_1;
import celestial.rVa_1;
import celestial.rVi_1;
import celestial.rXa_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rrAM;
import celestial.rrAP;
import celestial.rrAr_1;
import celestial.rrCJ;
import celestial.rrCM;
import celestial.rrCX;
import celestial.rrCb_1;
import celestial.rrCd_1;
import celestial.rrCh_1;
import celestial.rrCx_1;
import celestial.rrFK;
import celestial.rrIF;
import celestial.rrIQ;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrLB;
import celestial.rrLY;
import celestial.rrLa_1;
import celestial.rrLi_1;
import celestial.rrQX;
import celestial.rrZF;
import celestial.rrfY_2;
import celestial.rrfu_3;
import celestial.rrmi_3;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.Pair;

public class AutoSwap
extends Module {
    public Object[] id_break;
    public static Object[] id_byte;

    private rrCh_1 id_boolean() {
        this.B();
        if (this.id_instanceof()) {
            return (rrCh_1)this.id_break[4];
        }
        if (this.id_new()) {
            return (rrCh_1)this.id_break[1];
        }
        if (this.id_continue()) {
            return (rrCh_1)this.id_break[2];
        }
        if (this.id_else()) {
            return (rrCh_1)this.id_break[3];
        }
        if (this.id_this()) {
            return (rrCh_1)this.id_break[5];
        }
        return this.id_throw() ? (rrCd_1)this.id_break[6] : (rrCh_1)this.id_break[4];
    }

    public boolean id_char() {
        this.B();
        return ((String)((rrIQ)this.id_break[9]).id_byte()).equals("\u0423\u043c\u043d\u044b\u0439");
    }

    private static void id_byte(String var0) {
    }

    private boolean id_byte(rrCh_1 var1) {
        return ((cb_3)AutoSwap.id_import.id_class[57]).sK().id_class(var1.id_class());
    }

    public AutoSwap() {
        super("Auto Swap", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043c\u0435\u043d\u044f\u0435\u0442 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\n\u0432 \u043f\u0440\u0430\u0432\u043e\u0439 \u0440\u0443\u043a\u0435", Category.COMBAT);
        this.B();
        rrmi_3 var5 = new rrmi_3();
        this.id_break[0] = var5;
        rrCM var6 = new rrCM();
        this.id_break[1] = var6;
        rrCb_1 var7 = new rrCb_1();
        this.id_break[2] = var7;
        rrCx_1 var8 = new rrCx_1();
        this.id_break[3] = var8;
        rrCJ var9 = new rrCJ();
        this.id_break[4] = var9;
        rrCX var10 = new rrCX();
        this.id_break[5] = var10;
        rrCd_1 var11 = new rrCd_1();
        this.id_break[6] = var11;
        rrIQ var12 = (rrIQ)new rrIQ("\u0420\u0435\u0436\u0438\u043c", "\u0423\u043c\u043d\u044b\u0439", "\u0423\u043c\u043d\u044b\u0439", "\u0411\u0438\u043d\u0434").id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> this.id_strictfp());
        this.id_break[9] = var12;
        rrIQ var13 = (rrIQ)new rrIQ("\u041c\u0435\u043d\u044f\u0442\u044c \u0441", "\u0429\u0438\u0442", "\u0429\u0438\u0442", "\u0413\u0435\u043f\u043b", "\u0428\u0430\u0440", "\u0420\u0443\u043d\u0430", "\u0421\u0444\u0435\u0440\u0430", "\u0422\u043e\u0442\u0435\u043c").id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> this.id_strictfp());
        this.id_break[10] = var13;
        rrIQ var14 = (rrIQ)new rrIQ("\u041c\u0435\u043d\u044f\u0442\u044c \u043d\u0430", "\u0413\u0435\u043f\u043b", "\u0413\u0435\u043f\u043b", "\u0429\u0438\u0442", "\u0428\u0430\u0440", "\u0420\u0443\u043d\u0430", "\u0421\u0444\u0435\u0440\u0430", "\u0422\u043e\u0442\u0435\u043c").id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> this.id_strictfp());
        this.id_break[11] = var14;
        rrIF var15 = (rrIF)new rrIF("\u041a\u043b\u0430\u0432\u0438\u0448\u0430 \u0441\u0432\u0430\u043f\u0430", KeyBind.get(3)).id_class(() -> this.id_try());
        this.id_break[12] = var15;
        rrIm_1 var16 = (rrIm_1)new rrIm_1("\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435", Float.valueOf(16.5f), Float.valueOf(1.0f), Float.valueOf(19.5f), Float.valueOf(0.5f)).id_class(() -> this.id_char());
        this.id_break[13] = var16;
        rrIk_1 var17 = (rrIk_1)new rrIk_1("\u041f\u0440\u043e\u0432\u0435\u0440\u044f\u0442\u044c \u043a\u0440\u0438\u0441\u0442\u0430\u043b\u043b", true).id_class(() -> this.id_char() && this.id_continue());
        this.id_break[14] = var17;
        this.id_class((rrIQ)this.id_break[9], (rrIQ)this.id_break[10], (rrIQ)this.id_break[11], (rrIF)this.id_break[12], (rrIm_1)this.id_break[13], (rrIk_1)this.id_break[14]);
    }

    private void B() {
        if (this.id_break == null) {
            this.id_break = new Object[15];
            this.id_break[7] = 0L;
            this.id_break[8] = 0;
        }
    }

    public boolean id_this() {
        this.B();
        return ((String)((rrIQ)this.id_break[10]).id_byte()).equals("\u0420\u0443\u043d\u0430");
    }

    public boolean id_interface() {
        this.B();
        return ((String)((rrIQ)this.id_break[11]).id_byte()).equals("\u0428\u0430\u0440");
    }

    @EventTarget
    public void id_class(rrLa_1 var1) {
        if (this.id_char()) {
            rdn_3 var2 = var1.id_class();
            rrLi_1 var3 = var1.id_break();
            if (this.P()) {
                int var4 = ((rJr_1)((cb_3)AutoSwap.id_import.id_class[57]).id_implements[4]).id_case;
                rdn_3 var5 = ((cb_3)AutoSwap.id_import.id_class[57]).Sn();
                rrCh_1 var6 = this.id_switch();
                rrCh_1 var7 = this.id_boolean();
                Pair<rdn_3, Integer> var8 = this.id_class(var6);
                Pair<rdn_3, Integer> var9 = this.id_class(var7);
                Predicate<rdn_3> var10 = var6.id_break(this);
                Predicate<rdn_3> var11 = var7.id_break(this);
                if (this.id_class(var2, var3)) {
                    this.id_class(var8, var10, var9, var5, var4);
                } else if (this.id_class(var10, var2, var3) && this.id_static()) {
                    this.id_class(var7, var9, var11, var5, var4, false);
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrAM var1) {
        this.id_strictfp();
    }

    private boolean id_class(Predicate<rdn_3> var1, rdn_3 var2, rrLi_1 var3) {
        if (var3 instanceof rrAP && this.id_instanceof() && var2.id_break() == rdy_3.kN) {
            return true;
        }
        return var3 instanceof rrAr_1 && var1.test(var2);
    }

    @EventTarget
    public void id_class(rrLB var1) {
        this.B();
        if (var1.id_break() == ((rrIF)this.id_break[12]).id_finally().id_byte() && this.id_try()) {
            int var2 = ((rJr_1)((cb_3)AutoSwap.id_import.id_class[57]).id_implements[4]).id_case;
            rdn_3 var3 = ((cb_3)AutoSwap.id_import.id_class[57]).Sn();
            rrCh_1 var4 = this.id_switch();
            rrCh_1 var5 = this.id_boolean();
            Pair<rdn_3, Integer> var6 = this.id_class(var4);
            Pair<rdn_3, Integer> var7 = this.id_class(var5);
            if (!this.P()) {
                return;
            }
            Predicate<rdn_3> var8 = var4.id_break(this);
            Predicate<rdn_3> var9 = var5.id_break(this);
            if (this.id_class(var8, var3)) {
                this.id_class(var5, var7, var9, var3, var2, true);
            } else {
                this.id_class(var6, var8, var7, var3, var2);
            }
        }
    }

    private boolean id_class(rdn_3 var1, rrLi_1 var2) {
        if (!(var2 instanceof rrAr_1)) {
            return false;
        }
        return this.id_instanceof() && var1.id_break() == rdy_3.kN;
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.B();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) && this.id_char()) {
            int var2 = ((rJr_1)((cb_3)AutoSwap.id_import.id_class[57]).id_implements[4]).id_case;
            rdn_3 var3 = ((cb_3)AutoSwap.id_import.id_class[57]).Sn();
            rrCh_1 var4 = this.id_switch();
            rrCh_1 var5 = this.id_boolean();
            Predicate<rdn_3> var6 = var4.id_break(this);
            Predicate<rdn_3> var7 = var5.id_break(this);
            this.id_break[8] = this.id_break(var7, var3) ? Integer.valueOf((Integer)this.id_break[8] + 1) : Integer.valueOf(0);
            if (((cb_3)AutoSwap.id_import.id_class[57]).P() == rpm_3.OFF_HAND && this.id_class(var6, ((cb_3)AutoSwap.id_import.id_class[57]).sX())) {
                this.id_break[7] = System.currentTimeMillis();
            }
            if (!this.P()) {
                return;
            }
            Pair<rdn_3, Integer> var8 = this.id_class(var4);
            Pair<rdn_3, Integer> var9 = this.id_class(var5);
            if (this.id_break(var4)) {
                this.id_class(var8, var6, var9, var3, var2);
            } else if (this.id_static()) {
                this.id_class(var5, var9, var7, var3, var2, false);
            }
        }
    }

    private Pair<rdn_3, Integer> id_class(rrCh_1 var1) {
        Predicate<rdn_3> var2 = var1.id_break(this);
        ArrayList<Object> var3 = new ArrayList<Object>();
        for (int var4 = 0; var4 < 36; ++var4) {
            rdn_3 var5 = ((rhz_3)((cb_3)AutoSwap.id_import.id_class[57]).id_implements[1]).id_extends(var4);
            if (var5.id_class() || !var2.test(var5)) continue;
            var3.add(Pair.of((Object)var5, (Object)var4));
        }
        Comparator<Pair<rdn_3, Integer>> var6 = var1.id_byte(this);
        if (var6 != null) {
            var3.sort(var6);
        }
        return var3.isEmpty() ? null : (Pair)var3.get(0);
    }

    private void id_class(Pair<rdn_3, Integer> var1, Predicate<rdn_3> var2, Pair<rdn_3, Integer> var3, rdn_3 var4, int var5) {
        int var6;
        this.B();
        if (var1 != null && !this.id_class(var2, var4) && (var6 = ((Integer)var1.getRight()).intValue()) != -1) {
            int var7 = rrfY_2.id_break(var6);
            if (var3 != null) {
                rdn_3 var8 = (rdn_3)var3.getLeft();
                ((rrmi_3)this.id_break[0]).id_class(var8, var7);
                AutoSwap.id_byte("saved swap back item " + var7);
            }
            this.id_class(var5, var7, 40);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLY.id_class());
            rVi_1 var9 = rrfu_3.id_class().id_class("\u0421\u0432\u0430\u043f\u043d\u0443\u043b ").id_break(rVa_1.id_class(rrZF.d_), rVa_1.id_class(rrZF.d_)).id_break().id_class(((cb_3)AutoSwap.id_import.id_class[57]).Sn().id_continue());
            ((cq_3)AutoSwap.id_import.id_class[19]).id_class(var9, false, true);
        }
    }

    private boolean id_class(rdb_3 var1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < 36; ++var3) {
            if (((rhz_3)((cb_3)AutoSwap.id_import.id_class[57]).id_implements[1]).id_extends(var3).id_break() != var1) continue;
            var2 = true;
            break;
        }
        return var2;
    }

    private int id_class(Pair<rdn_3, Integer> var1) {
        this.B();
        if (this.id_try()) {
            return var1 != null ? (Integer)var1.getValue() : -1;
        }
        return ((rrmi_3)this.id_break[0]).id_class(true, new String[0]);
    }

    private void id_class(int var1, int var2, int var3) {
        ((Ax_1)AutoSwap.id_import.id_class[55]).id_class(var1, var2, var3, rXa_1.SWAP, false);
    }

    private void id_class(rrCh_1 var1, Pair<rdn_3, Integer> var2, Predicate<rdn_3> var3, rdn_3 var4, int var5, boolean var6) {
        this.B();
        int var7 = this.id_class(var2);
        if (var7 >= 0) {
            int var8 = rrfY_2.id_break(var7);
            if (!(!this.id_break(var3, var4) || var1.id_class(this) && this.id_class(var4.id_break()))) {
                if (!var6 && (Integer)this.id_break[8] > 5) {
                    ((rrmi_3)this.id_break[0]).id_throws();
                    AutoSwap.id_byte("reset swap back item");
                }
            } else {
                this.id_class(var5, var8, 40);
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLY.id_class());
                rVi_1 var9 = rrfu_3.id_class().id_class("\u0421\u0432\u0430\u043f\u043d\u0443\u043b ").id_break(rVa_1.id_class(rrZF.d_), rVa_1.id_class(rrZF.d_)).id_break().id_class(((cb_3)AutoSwap.id_import.id_class[57]).Sn().id_continue());
                ((cq_3)AutoSwap.id_import.id_class[19]).id_class(var9, false, true);
            }
            if (var6) {
                ((rrmi_3)this.id_break[0]).id_throws();
                AutoSwap.id_byte("reset swap back item");
            }
        }
    }

    @EventTarget
    public void id_class(rrFK var1) {
        this.id_strictfp();
    }

    private boolean id_class(Predicate<rdn_3> var1, rdn_3 var2) {
        return var1.test(var2);
    }

    private boolean id_break(rrCh_1 var1) {
        if (this.id_byte(var1)) {
            return false;
        }
        return this.id_const() ? false : this.id_abstract();
    }

    private boolean id_break(Predicate<rdn_3> var1, rdn_3 var2) {
        return var1.test(var2);
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_strictfp();
    }

    private boolean P() {
        if (((cb_3)AutoSwap.id_import.id_class[57]).id_native()) {
            return false;
        }
        return !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_this().id_new().id_break();
    }

    public boolean id_goto() {
        this.B();
        return ((String)((rrIQ)this.id_break[11]).id_byte()).equals("\u0421\u0444\u0435\u0440\u0430");
    }

    private boolean id_const() {
        this.B();
        return ((rrIk_1)this.id_break[14]).id_class() != false && this.id_continue() ? ((gm_3)AutoSwap.id_import.id_class[56]).id_return().int2ObjectEntrySet().stream().filter(var0 -> var0.getValue() instanceof rSa_1).anyMatch(var0 -> ((an_3)var0.getValue()).id_implements((cb_3)AutoSwap.id_import.id_class[57]) <= 6.0f) : false;
    }

    public boolean id_continue() {
        this.B();
        return ((String)((rrIQ)this.id_break[10]).id_byte()).equals("\u0428\u0430\u0440");
    }

    public boolean id_else() {
        this.B();
        return ((String)((rrIQ)this.id_break[10]).id_byte()).equals("\u0421\u0444\u0435\u0440\u0430");
    }

    public boolean id_instanceof() {
        this.B();
        return ((String)((rrIQ)this.id_break[10]).id_byte()).equals("\u0429\u0438\u0442");
    }

    public boolean id_new() {
        this.B();
        return ((String)((rrIQ)this.id_break[10]).id_byte()).equals("\u0413\u0435\u043f\u043b");
    }

    public boolean id_return() {
        this.B();
        return ((String)((rrIQ)this.id_break[11]).id_byte()).equals("\u0413\u0435\u043f\u043b");
    }

    public boolean id_super() {
        this.B();
        return ((String)((rrIQ)this.id_break[11]).id_byte()).equals("\u0420\u0443\u043d\u0430");
    }

    private rrCh_1 id_switch() {
        this.B();
        if (this.id_return()) {
            return (rrCh_1)this.id_break[1];
        }
        if (this.id_while()) {
            return (rrCh_1)this.id_break[4];
        }
        if (this.id_interface()) {
            return (rrCh_1)this.id_break[2];
        }
        if (this.id_goto()) {
            return (rrCh_1)this.id_break[3];
        }
        if (this.id_super()) {
            return (rrCh_1)this.id_break[5];
        }
        return this.id_public() ? (rrCd_1)this.id_break[6] : (rrCh_1)this.id_break[1];
    }

    public boolean id_throw() {
        this.B();
        return ((String)((rrIQ)this.id_break[10]).id_byte()).equals("\u0422\u043e\u0442\u0435\u043c");
    }

    public boolean id_try() {
        this.B();
        return ((String)((rrIQ)this.id_break[9]).id_byte()).equals("\u0411\u0438\u043d\u0434");
    }

    public boolean id_while() {
        this.B();
        return ((String)((rrIQ)this.id_break[11]).id_byte()).equals("\u0429\u0438\u0442");
    }

    private boolean id_static() {
        this.B();
        if (((cb_3)AutoSwap.id_import.id_class[57]).sK().id_class(((rrmi_3)this.id_break[0]).id_protected())) {
            return false;
        }
        return System.currentTimeMillis() - (Long)this.id_break[7] >= 400L;
    }

    public boolean id_public() {
        this.B();
        return ((String)((rrIQ)this.id_break[11]).id_byte()).equals("\u0422\u043e\u0442\u0435\u043c");
    }

    private boolean id_abstract() {
        this.B();
        float var1 = ((cb_3)AutoSwap.id_import.id_class[57]).Ss() + ((cb_3)AutoSwap.id_import.id_class[57]).Sd();
        return var1 <= ((Float)((rrIm_1)this.id_break[13]).id_byte()).floatValue();
    }

    private void id_strictfp() {
        this.B();
        ((rrmi_3)this.id_break[0]).id_throws();
    }

    static {
        Object[] var0 = new Object[]{40, -1, false};
        id_byte = var0;
    }
}

