/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.player;

import celestial.C_class;
import celestial.C_throws;
import celestial.PI;
import celestial.PK;
import celestial.Pf_1;
import celestial.Po_1;
import celestial.SF;
import celestial.SL;
import celestial.Sl_1;
import celestial.Y;
import celestial.cG_2;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rVi_1;
import celestial.rYB;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rrFH;
import celestial.rrIQ;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrIv_1;
import celestial.rrQX;
import celestial.rrfZ_2;
import celestial.rrff_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import celestial.rrjv_3;
import celestial.rrqP_2;
import celestial.rrqS_2;
import celestial.rrqr_3;
import celestial.rrtR_2;
import celestial.rrte_3;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.rrwg_3;
import celestial.setting.Setting;
import celestial.util.MinecraftAccessor;
import java.util.regex.Pattern;
import org.apache.commons.lang3.tuple.Pair;

public class AutoLeave
extends Module {
    public Object[] id_break;

    private Pair<rVi_1, rVi_1> id_byte(cb_3 var1) {
        this.id_else();
        rrIm_1 var2 = (rrIm_1)((Pair)this.id_break[1]).getRight();
        boolean var3 = var2.id_int();
        double var4 = ((Float)var2.id_byte()).floatValue();
        for (cG_2 var7 : ((gm_3)AutoLeave.id_import.id_class[56]).id_continue()) {
            if (!rrff_3.id_class(var7)) continue;
            double var8 = var1.id_implements(var7);
            if (!var3 && var8 > var4) continue;
            rVi_1 var10 = new rgN_2("\u0420\u044f\u0434\u043e\u043c \u0431\u044b\u043b \u0438\u0433\u0440\u043e\u043a ").id_class(var7.L_());
            rVi_1 var11 = var10.id_case();
            rVi_1 var12 = new rgN_2((int)var8 + "\u043c").id_class(rgF_2.RED);
            var10.id_break("\n\n\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0434\u043e \u0438\u0433\u0440\u043e\u043a\u0430: ").id_class(var12);
            var11.id_break("\n \u2022 \u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0434\u043e \u0438\u0433\u0440\u043e\u043a\u0430: ").id_class(var12);
            if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_new()) {
                String var13 = (int)var7.rx() + " " + (int)var7.re() + " " + (int)var7.BO();
                rVi_1 var14 = new rgN_2(var13).id_class(rgF_2.RED);
                var10.id_break("\n\n\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b \u0438\u0433\u0440\u043e\u043a\u0430: ").id_class(var14);
                var11.id_break("\n \u2022 \u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b \u0438\u0433\u0440\u043e\u043a\u0430: ").id_class(var14);
            }
            return Pair.of((Object)var10, (Object)var11);
        }
        return null;
    }

    public AutoLeave() {
        super("Auto Leave", "\u0418\u0437\u0431\u0435\u0433\u0430\u0435\u0442 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043d\u044b\u0445 \u0443\u0441\u043b\u043e\u0432\u0438\u0439", Category.PLAYER);
        Pair var6;
        Pair var5;
        this.id_else();
        this.id_break[0] = var5 = rrwg_3.id_class(new rrIk_1("\u041c\u0430\u043b\u043e \u0425\u041f", true), new rrIm_1("\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u0425\u041f", Float.valueOf(10.0f), Float.valueOf(5.0f), Float.valueOf(19.0f), Float.valueOf(1.0f)));
        this.id_break[1] = var6 = rrwg_3.id_class(new rrIk_1("\u0420\u044f\u0434\u043e\u043c \u0438\u0433\u0440\u043e\u043a", false), new rrIm_1("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0434\u043e \u0438\u0433\u0440\u043e\u043a\u0430", Float.valueOf(128.0f), Float.valueOf(10.0f), Float.valueOf(128.0f), Float.valueOf(5.0f)).id_class((rrIm_1 var0, Float var1) -> "MAX").id_break((rrIm_1 var0, Float var1) -> var1.floatValue() == var0.id_native() ? "MAX" : null));
        rrIk_1 var7 = new rrIk_1("Staff \u0432 \u0441\u0435\u0442\u0438", false);
        this.id_break[2] = var7;
        rrIk_1 var8 = (rrIk_1)new rrIk_1("Staff \u0432 \u0441\u043f\u0435\u043a\u0435", false).id_class(() -> {
            this.id_else();
            return ((rrIk_1)this.id_break[2]).id_class() == false;
        });
        this.id_break[3] = var8;
        rrIk_1 var9 = (rrIk_1)new rrIk_1("\u0411\u0430\u043d \u0432 \u0447\u0430\u0442\u0435", false).id_class("banInChat", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_else();
            Boolean var7x = false;
            this.id_break[9] = var7x;
        });
        this.id_break[4] = var9;
        rrIQ var10 = new rrIQ("\u041c\u0435\u0442\u043e\u0434 \u043b\u0438\u0432\u0430", "\u041e\u0442\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435", "\u041e\u0442\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435", "\u041f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434", "\u0421\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435");
        this.id_break[5] = var10;
        rrIm_1 var11 = (rrIm_1)new rrIm_1("\u041c\u0438\u043d\u0443\u0442 \u0434\u043b\u044f \u043f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434\u0430", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(30.0f), Float.valueOf(0.1f)).id_class(() -> {
            this.id_else();
            return ((String)((rrIQ)this.id_break[5]).id_byte()).equals("\u041f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434");
        });
        this.id_break[6] = var11;
        rrIv_1 var12 = (rrIv_1)new rrIv_1("\u0421\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435 \u0434\u043b\u044f \u043b\u0438\u0432\u0430 (home/rtp)", rrte_3.id_class((Pattern)rrtR_2.id_class[5])).id_package().id_class(120.0f).id_class(() -> {
            this.id_else();
            return ((String)((rrIQ)this.id_break[5]).id_byte()).equals("\u0421\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435");
        });
        this.id_break[7] = var12;
        this.id_class(new rrIc_1("\u041b\u0438\u0432\u0430\u0442\u044c \u0435\u0441\u043b\u0438", (rrIk_1)((Pair)this.id_break[0]).getLeft(), (rrIk_1)((Pair)this.id_break[1]).getLeft(), (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[4]), (rrIQ)this.id_break[5], (rrIm_1)this.id_break[6], (Setting)((Pair)this.id_break[0]).getRight(), (Setting)((Pair)this.id_break[1]).getRight(), (rrIv_1)this.id_break[7]);
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_else();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            Pair<rVi_1, rVi_1> var18;
            Pair<rVi_1, rVi_1> var17;
            Pair<rVi_1, rVi_1> var16;
            Pair<rVi_1, rVi_1> var15;
            Pair<rVi_1, rVi_1> var14;
            if (!this.id_instanceof() || C_throws.id_byte().id_default().id_throws()) {
                this.id_break[8] = false;
                return;
            }
            if (rrfZ_2.id_byte()) {
                return;
            }
            boolean var2 = false;
            if ((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) || (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4])) {
                PI var3 = C_throws.id_byte().id_native().id_protected();
                if (var3 != null && !var3.id_class().id_break()) {
                    return;
                }
                rqM_2<rYB> var4 = ((gm_3)AutoLeave.id_import.id_class[56]).E();
                rqO_2 var5 = var4.id_class();
                String var6 = var5.id_break();
                if (var4 != null && var6 != null && (var6.equals("lobby") || var6.equals("spawn"))) {
                    var2 = true;
                }
            }
            C_class var13 = C_throws.id_byte();
            if (((rrIk_1)((Pair)this.id_break[0]).getLeft()).id_class().booleanValue() && (var14 = this.id_protected((cb_3)AutoLeave.id_import.id_class[57])) != null) {
                this.id_class(var13, (rVi_1)var14.getLeft(), (rVi_1)var14.getRight());
                return;
            }
            if (((rrIk_1)((Pair)this.id_break[1]).getLeft()).id_class().booleanValue() && !var2 && (var15 = this.id_byte((cb_3)AutoLeave.id_import.id_class[57])) != null) {
                this.id_class(var13, (rVi_1)var15.getLeft(), (rVi_1)var15.getRight());
                return;
            }
            if (((rrIk_1)this.id_break[2]).id_class().booleanValue() && (var16 = this.id_break((cb_3)AutoLeave.id_import.id_class[57])) != null) {
                this.id_class(var13, (rVi_1)var16.getLeft(), (rVi_1)var16.getRight());
                return;
            }
            if (((rrIk_1)this.id_break[3]).id_class().booleanValue() && (var17 = this.id_class((cb_3)AutoLeave.id_import.id_class[57])) != null) {
                this.id_class(var13, (rVi_1)var17.getLeft(), (rVi_1)var17.getRight());
                return;
            }
            if (((rrIk_1)this.id_break[4]).id_class().booleanValue() && (var18 = this.id_new()) != null && this.id_class(var13, (rVi_1)var18.getLeft(), (rVi_1)var18.getRight())) {
                this.id_break[9] = false;
            }
        }
    }

    private boolean id_class(C_class var1, rVi_1 var2, rVi_1 var3) {
        this.id_else();
        boolean var4 = false;
        switch ((String)((rrIQ)this.id_break[5]).id_byte()) {
            case "\u041e\u0442\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435": {
                rrjv_3.id_class(this.id_case(), var2);
                var4 = true;
                break;
            }
            case "\u0421\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435": {
                String var7 = ((rrIv_1)this.id_break[7]).id_extends();
                if (var7 == null || var7.isEmpty()) {
                    return false;
                }
                ((cb_3)AutoLeave.id_import.id_class[57]).id_protected(var7);
                var4 = true;
                break;
            }
            case "\u041f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434": {
                if (this.id_class(var1)) break;
                return false;
            }
        }
        if (!((Boolean)this.id_break[8]).booleanValue()) {
            if (!var1.id_break().id_byte() && !var1.id_volatile().id_byte()) {
                rrfZ_2.id_break();
            }
            this.id_class(var3);
        }
        this.id_break[8] = true;
        if (var4) {
            this.id_byte(true);
        }
        return true;
    }

    private void id_class(rVi_1 var1) {
        rVi_1 var2 = rrfu_3.id_break(this).id_class(rgF_2.GRAY);
        rVi_1 var3 = var2.id_class(var1.id_case().id_class(rgF_2.GRAY));
        rrfu_3.id_class(var3);
        MinecraftAccessor.a_(var3.id_byte(), false);
    }

    @EventTarget
    public void id_class(rrFH var1) {
        this.id_else();
        if (((rrIk_1)this.id_break[4]).id_class().booleanValue() && var1.id_class().equals("\u041f\u0443\u043d\u043a\u0442 4.3.1")) {
            this.id_break[9] = true;
        }
    }

    private Pair<rVi_1, rVi_1> id_class(cb_3 var1) {
        for (rrqr_3 var3 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().o().id_new()) {
            rrqP_2 var4;
            if (!(var3 instanceof rrqP_2) || !(var4 = (rrqP_2)var3).id_case().id_class() || var4.id_finally().id_byte() != (rrqS_2)((Object)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[1])) continue;
            rVi_1 var5 = new rgN_2("\u041f\u0435\u0440\u0441\u043e\u043d\u0430\u043b ").id_class(var4.id_implements().id_case().id_break(" \u0432 \u0441\u043f\u0435\u043a\u0435"));
            return Pair.of((Object)var5, (Object)var5);
        }
        return null;
    }

    @Override
    public void id_class(boolean var1) {
        if (!this.id_instanceof()) {
            this.id_byte(false);
        } else {
            super.id_class(var1);
        }
    }

    private boolean id_class(C_class var1) {
        this.id_else();
        SL var2 = var1.id_default();
        float var3 = ((Float)((rrIm_1)this.id_break[6]).id_byte()).floatValue();
        if ((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) || (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4])) {
            PI var9 = var1.id_native().id_protected();
            if (var9 == null) {
                return false;
            }
            Pf_1 var11 = var9.id_class();
            if (!var11.id_break()) {
                return false;
            }
            int var12 = Math.round(var3 * 60.0f * 20.0f);
            ((cb_3)AutoLeave.id_import.id_class[57]).id_case("/hub");
            var2.id_class(new Sl_1(var11.id_class() + var9.id_break(), var12));
            return true;
        }
        if ((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6])) {
            Po_1 var8 = var1.P().id_break();
            if (var8 == null) {
                return false;
            }
            PK var10 = var8.id_break();
            if (!var10.id_break()) {
                return false;
            }
            long var6 = Math.round(var3 * 60000.0f);
            ((cb_3)AutoLeave.id_import.id_class[57]).id_case("/hub");
            var2.id_class(new SF(var10.id_class() + var8.id_class(), var6));
            return true;
        }
        if ((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0])) {
            String var4 = C_throws.id_byte().id_final().id_throws();
            if (var4.isEmpty()) {
                return false;
            }
            ((cb_3)AutoLeave.id_import.id_class[57]).id_case("/hub");
            long var5 = Math.round(var3 * 60000.0f);
            var2.id_class(new SF(var4, var5));
            return true;
        }
        return false;
    }

    private Pair<rVi_1, rVi_1> id_break(cb_3 var1) {
        for (rrqr_3 var3 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().o().id_new()) {
            rrqP_2 var4;
            if (!(var3 instanceof rrqP_2) || !(var4 = (rrqP_2)var3).id_case().id_class()) continue;
            rVi_1 var5 = new rgN_2("\u041f\u0435\u0440\u0441\u043e\u043d\u0430\u043b ").id_class(var4.id_implements().id_case().id_break(" \u0432 \u0441\u0435\u0442\u0438"));
            return Pair.of((Object)var5, (Object)var5);
        }
        return null;
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_else();
        super.id_throws(var1);
        this.id_break[8] = false;
        this.id_break[9] = false;
    }

    private void id_else() {
        if (this.id_break == null) {
            this.id_break = new Object[10];
            this.id_break[8] = false;
            this.id_break[9] = false;
        }
    }

    private boolean id_instanceof() {
        this.id_else();
        if (((String)((rrIQ)this.id_break[5]).id_byte()).equals("\u041f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434") && (rrfq_3)((Object)rrfp_3.id_class[1]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) && (rrfq_3)((Object)rrfp_3.id_class[1]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) && (rrfq_3)((Object)rrfp_3.id_class[1]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) && (rrfq_3)((Object)rrfp_3.id_class[1]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6])) {
            String var1 = "\u0420\u0435\u0436\u0438\u043c \"\u041f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434\" \u043d\u0435 \u0440\u0430\u0431\u043e\u0442\u0430\u0435\u0442 \u043d\u0430 \u044d\u0442\u043e\u043c \u0441\u0435\u0440\u0432\u0435\u0440\u0435";
            rrfu_3.id_byte(rrfu_3.id_class(this) + var1);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), var1, 2000));
            this.id_byte(false);
            return false;
        }
        return true;
    }

    private Pair<rVi_1, rVi_1> id_new() {
        this.id_else();
        if (((Boolean)this.id_break[9]).booleanValue()) {
            rgN_2 var1 = new rgN_2("\u0411\u0430\u043d \u0432 \u0447\u0430\u0442\u0435");
            return Pair.of((Object)var1, (Object)var1);
        }
        return null;
    }

    private Pair<rVi_1, rVi_1> id_protected(cb_3 var1) {
        this.id_else();
        if (var1.Ss() <= ((Float)((rrIm_1)((Pair)this.id_break[0]).getRight()).id_byte()).floatValue()) {
            rVi_1 var2 = new rgN_2("\u0423 \u0432\u0430\u0441 \u043c\u0430\u043b\u043e \u0425\u041f ").id_class(new rgN_2("(" + (int)var1.Ss() + ")").id_class(rgF_2.RED));
            return Pair.of((Object)var2, (Object)var2);
        }
        return null;
    }
}

