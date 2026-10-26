/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.player;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.jI_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rVi_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rrAY;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrLK;
import celestial.rrLn_1;
import celestial.rrfH_2;
import celestial.rrfZ_2;
import celestial.rrfo_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import celestial.rrwg_3;
import celestial.rvs_3;
import celestial.setting.ButtonSetting;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.Pair;

public class ItemsDelay
extends Module {
    public Object[] id_break;

    private float id_char() {
        this.id_public();
        return ((Float)((rrIm_1)((Pair)this.id_break[3]).getRight()).id_byte()).floatValue();
    }

    private int id_byte(rdn_3 var1) {
        rdb_3 var2 = var1.id_break();
        return !var2.id_super() && var2 != rdy_3.hi && var2 != rdy_3.WF && var2 != rdy_3.JA ? 0 : var2.id_break(var2.id_continue());
    }

    public ItemsDelay() {
        super("Items Delay", "\u0421\u0442\u0430\u0432\u0438\u0442 \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u0443 \u043d\u0430 \u043f\u0440\u0435\u0434\u043c\u0435\u0442 \u043f\u043e\u0441\u043b\u0435\n\u0435\u0433\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f", Category.PLAYER);
        Pair var9;
        Pair var8;
        Pair var7;
        Pair var6;
        Pair var5;
        this.id_public();
        this.id_break[0] = var5 = rrwg_3.id_class(new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", true), new rrIm_1("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u0432 \u0441\u0435\u043a\u0443\u043d\u0434\u0430\u0445", Float.valueOf(14.0f), Float.valueOf(1.5f), Float.valueOf(60.0f), Float.valueOf(0.5f)));
        this.id_break[1] = var6 = rrwg_3.id_class(new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", true), new rrIm_1("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u0432 \u0441\u0435\u043a\u0443\u043d\u0434\u0430\u0445", Float.valueOf(5.0f), Float.valueOf(0.1f), Float.valueOf(60.0f), Float.valueOf(0.5f)));
        this.id_break[2] = var7 = rrwg_3.id_class(new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", true), new rrIm_1("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u0432 \u0441\u0435\u043a\u0443\u043d\u0434\u0430\u0445", Float.valueOf(5.0f), Float.valueOf(0.1f), Float.valueOf(60.0f), Float.valueOf(0.5f)));
        this.id_break[3] = var8 = rrwg_3.id_class(new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", true), new rrIm_1("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u0432 \u0441\u0435\u043a\u0443\u043d\u0434\u0430\u0445", Float.valueOf(5.0f), Float.valueOf(0.1f), Float.valueOf(60.0f), Float.valueOf(0.5f)));
        this.id_break[4] = var9 = rrwg_3.id_class(new rrIk_1("\u0412\u043a\u043b\u044e\u0447\u0435\u043d\u043e", true), new rrIm_1("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u0432 \u0441\u0435\u043a\u0443\u043d\u0434\u0430\u0445", Float.valueOf(5.0f), Float.valueOf(1.5f), Float.valueOf(60.0f), Float.valueOf(0.5f)));
        rrIk_1 var10 = (rrIk_1)new rrIk_1("\u041a\u043e\u043c\u043f\u0435\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u0443", false).id_class(() -> (rrfq_3)((Object)((Object)rrfp_3.id_class[1])) != (rrfq_3)((Object)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2])));
        this.id_break[5] = var10;
        rrIk_1 var11 = new rrIk_1("\u0422\u043e\u043b\u044c\u043a\u043e \u0432 \u041f\u0412\u041f", false);
        this.id_break[6] = var11;
        ButtonSetting b1 = new ButtonSetting(this, "ReallyWorld", () -> {
            this.id_public();
            ((rrIk_1)this.id_break[6]).id_class(true, false, true);
            ((rrIk_1)this.id_break[5]).id_class(false, false, true);
            ((rrIm_1)((Pair)this.id_break[0]).getRight()).id_class(Float.valueOf(14.0f), false, true);
            ((rrIm_1)((Pair)this.id_break[2]).getRight()).id_class(Float.valueOf(5.0f), false, true);
        });
        ButtonSetting b2 = new ButtonSetting(this, "Funtime", () -> {
            this.id_public();
            ((rrIk_1)((Pair)this.id_break[3]).getLeft()).id_class(true, false, true);
            ((rrIm_1)((Pair)this.id_break[3]).getRight()).id_class(Float.valueOf(20.0f), false, true);
            ((rrIk_1)this.id_break[5]).id_class(true, false, true);
            ((rrIk_1)this.id_break[6]).id_class(true, false, true);
            ((rrIk_1)((Pair)this.id_break[0]).getLeft()).id_class(false, false, true);
            ((rrIk_1)((Pair)this.id_break[2]).getLeft()).id_class(false, false, true);
            ((rrIk_1)((Pair)this.id_break[1]).getLeft()).id_class(false, false, true);
            ((rrIk_1)((Pair)this.id_break[4]).getLeft()).id_class(false, false, true);
        });
        this.id_class(new GroupSetting("\u0410\u0432\u0442\u043e. \u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u0438", b1, b2), new GroupSetting("\u042d\u043d\u0434\u0435\u0440 \u0436\u0435\u043c\u0447\u0443\u0433\u0438", (Setting)((Pair)this.id_break[0]).getLeft(), (Setting)((Pair)this.id_break[0]).getRight()), new GroupSetting("\u0417\u0430\u0447\u0430\u0440. \u0437\u043e\u043b\u043e\u0442\u044b\u0435 \u044f\u0431\u043b\u043e\u043a\u0438", (Setting)((Pair)this.id_break[1]).getLeft(), (Setting)((Pair)this.id_break[1]).getRight()), new GroupSetting("\u0417\u043e\u043b\u043e\u0442\u044b\u0435 \u044f\u0431\u043b\u043e\u043a\u0438", (Setting)((Pair)this.id_break[2]).getLeft(), (Setting)((Pair)this.id_break[2]).getRight()), new GroupSetting("\u0417\u0435\u043b\u044c\u0435 \u0438\u0441\u0446\u0435\u043b\u0435\u043d\u0438\u044f", (Setting)((Pair)this.id_break[3]).getLeft(), (Setting)((Pair)this.id_break[3]).getRight()), new GroupSetting("\u0425\u043e\u0440\u0443\u0441", (Setting)((Pair)this.id_break[4]).getLeft(), (Setting)((Pair)this.id_break[4]).getRight()), new GroupSetting("\u0414\u0440\u0443\u0433\u043e\u0435", (rrIk_1)this.id_break[5], (rrIk_1)this.id_break[6]));
    }

    private boolean id_this() {
        this.id_public();
        return ((rrIk_1)((Pair)this.id_break[0]).getLeft()).id_class();
    }

    private boolean id_interface() {
        this.id_public();
        return ((rrIk_1)((Pair)this.id_break[2]).getLeft()).id_class();
    }

    private rVi_1 id_class(rdn_3 var1, float var2) {
        rVi_1 var3 = var1.id_this() ? var1.id_continue().id_case().id_class(rgF_2.RED) : new rgN_2(jI_2.id_class("ru_ru", var1.id_finally(), new Object[0])).id_class(rgF_2.RED);
        return rrfu_3.id_break(this).id_class(rgF_2.GRAY).id_break("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u043a\u043e\u043c\u043f\u0435\u043d\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u0430").id_break("\n\u0422\u0435\u043f\u0435\u0440\u044c \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435 ").id_class(var3).id_break(" \u0434\u043e\u0441\u0442\u0443\u043f\u043d\u043e \u043d\u0430 " + String.valueOf((Object)rgF_2.RED) + var2 + "\u0441" + String.valueOf((Object)rgF_2.GRAY) + " \u0431\u044b\u0441\u0442\u0440\u0435\u0435");
    }

    @EventTarget
    public void id_class(rrAY var1) {
        if (this.id_goto()) {
            rdn_3 var2 = var1.id_break();
            rdb_3 var3 = var2.id_break();
            if (this.id_this() && var3 == rdy_3.Jm) {
                if (rrfo_3.id_class(var2)) {
                    var1.id_class(true);
                }
            } else if (this.id_interface() && var3 == rdy_3.hy) {
                if (rrfo_3.id_class(var2)) {
                    var1.id_class(true);
                }
            } else if (this.id_try() && var3 == rdy_3.hp) {
                if (rrfo_3.id_class(var2)) {
                    var1.id_class(true);
                }
            } else if (this.id_while() && rrfH_2.id_break(var2)) {
                if (rrfo_3.id_class(var2)) {
                    var1.id_class(true);
                }
            } else if (this.id_else() && var3 == rdy_3.kO && rrfo_3.id_class(var2)) {
                var1.id_class(true);
            }
        }
    }

    @EventTarget
    public void id_class(rrLK var1) {
        if (this.id_goto()) {
            rdn_3 var2 = var1.id_class();
            rdb_3 var3 = var2.id_break();
            if (this.id_try() && var3 == rdy_3.hp) {
                this.id_class(var2, (rdn_3 var0) -> var0.id_break() == rdy_3.hp, this.id_super());
            } else if (this.id_interface() && var3 == rdy_3.hy) {
                this.id_class(var2, (rdn_3 var0) -> var0.id_break() == rdy_3.hy, this.id_instanceof());
            } else if (this.id_while() && rrfH_2.id_break(var2)) {
                this.id_class(var2, (rdn_3 var0) -> rrfH_2.id_break(var0), this.id_char());
            } else if (this.id_else() && var3 == rdy_3.kO) {
                this.id_class(var2, (rdn_3 var0) -> var0.id_break() == rdy_3.kO, this.id_import());
            }
        }
    }

    @EventTarget
    public void id_class(rrLn_1 var1) {
        rvs_3 var2 = var1.id_class();
        rdb_3 var3 = var2.id_break();
        int var4 = var2.id_byte();
        if (var4 != 0) {
            int var6;
            rdn_3 var5 = var3.id_continue();
            if (this.id_goto() && this.id_this() && var3 == rdy_3.Jm) {
                this.id_class(var5, (rdn_3 var0) -> var0.id_break() == rdy_3.Jm, this.id_continue());
            }
            if (this.id_throws(var5) && !rrfo_3.id_class(var5) && (var6 = this.id_byte(var5)) > 0 && var4 > var6) {
                int var7 = var2.id_byte();
                var2.id_class(var4 - var6);
                float var8 = (float)(var7 - var2.id_byte()) / 20.0f;
                rrfu_3.id_class(this.id_class(var5, var8));
            }
        }
    }

    private void id_class(rdn_3 var1, Predicate<rdn_3> var2, float var3) {
        int var5;
        int var4 = (int)(var3 * 20.0f);
        if (this.id_throws(var1) && (var5 = this.id_byte(var1)) > 0 && var4 > var5) {
            int var6 = var4;
            float var7 = (float)(var6 - (var4 -= var5)) / 20.0f;
            rrfu_3.id_class(this.id_class(var1, var7));
        }
        ((cb_3)ItemsDelay.id_import.id_class[57]).r().id_class(var1, var2, var4);
    }

    private void id_class(rdn_3 var1) {
        ((cb_3)ItemsDelay.id_import.id_class[57]).r().id_break(var1);
    }

    private boolean id_throws(rdn_3 var1) {
        this.id_public();
        if (!((rrIk_1)this.id_break[5]).id_class().booleanValue()) {
            return false;
        }
        return (rrfq_3)((Object)rrfp_3.id_class[1]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) || var1.id_break() != rdy_3.Jd;
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        if ((cb_3)ItemsDelay.id_import.id_class[57] != null) {
            ((cb_3)ItemsDelay.id_import.id_class[57]).r().id_break();
        }
    }

    private boolean id_goto() {
        this.id_public();
        return ((rrIk_1)this.id_break[6]).id_class() == false || rrfZ_2.id_byte();
    }

    private float id_continue() {
        this.id_public();
        return ((Float)((rrIm_1)((Pair)this.id_break[0]).getRight()).id_byte()).floatValue();
    }

    private boolean id_else() {
        this.id_public();
        return ((rrIk_1)((Pair)this.id_break[4]).getLeft()).id_class();
    }

    private float id_import() {
        this.id_public();
        return ((Float)((rrIm_1)((Pair)this.id_break[4]).getRight()).id_byte()).floatValue();
    }

    private float id_instanceof() {
        this.id_public();
        return ((Float)((rrIm_1)((Pair)this.id_break[2]).getRight()).id_byte()).floatValue();
    }

    private float id_super() {
        this.id_public();
        return ((Float)((rrIm_1)((Pair)this.id_break[1]).getRight()).id_byte()).floatValue();
    }

    private boolean id_try() {
        this.id_public();
        return ((rrIk_1)((Pair)this.id_break[1]).getLeft()).id_class();
    }

    private boolean id_while() {
        this.id_public();
        return ((rrIk_1)((Pair)this.id_break[3]).getLeft()).id_class();
    }

    private void id_public() {
        if (this.id_break == null) {
            this.id_break = new Object[7];
        }
    }
}

