/*
 * Decompiled with CFR 0.152.
 */
package celestial.ui.hud;

import celestial.FP;
import celestial.Ml_1;
import celestial.cb_3;
import celestial.iB_2;
import celestial.manager.FontManager;
import celestial.module.combat.AttackAura;
import celestial.module.combat.TriggerBot;
import celestial.module.player.StreamerMode;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rql_3;
import celestial.rrFA;
import celestial.rrFC;
import celestial.rrQK;
import celestial.rrQX;
import celestial.rrZF;
import celestial.rrfD_2;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrtu_3;
import celestial.rrvT;
import celestial.rrvj_1;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import celestial.vm_3;

public class TargetHud
extends rrvj_1 {
    public Object[] id_byte = new Object[5];
    public static Object[] id_protected = new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), 5, 2, Float.valueOf(0.0f), 5};

    public TargetHud() {
        super("Target HUD", () -> Float.valueOf(100.0f), () -> Float.valueOf(33.0f));
        rrFC var5 = new rrFC();
        this.id_byte[0] = var5;
        rrFA var6 = new rrFA();
        this.id_byte[1] = var6;
        AnimValue var7 = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0]), 0.4f, false);
        this.id_byte[2] = var7;
        AnimValue var8 = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0]), 0.4f, false);
        this.id_byte[3] = var8;
    }

    private void s() {
        if (this.id_byte == null) {
            this.id_byte = new Object[5];
        }
    }

    private void id_class(Ml_1 var1, iB_2 var2, float var3, float var4, float var5, int var6) {
        boolean var7 = (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]);
        StreamerMode var8 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws();
        String var9 = var8.id_break(var2.id_extends());
        FontManager.INSTANCE.id_case().id_class(var1, var9, var3, var4, var6, var5 * 0.5f + 2.0f);
        FontManager.INSTANCE.id_native().id_break(var1, this.id_class(var2, var7), var3, var4 + 11.0f, var6, false, false);
    }

    @Override
    public boolean id_class() {
        return true;
    }

    private String id_class(iB_2 var1, boolean var2) {
        this.s();
        if (var2 && var1 != (cb_3)TargetHud.id_import.id_class[57] && var1.Pp()) {
            return "HP: \u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u043e";
        }
        StringBuilder var3 = new StringBuilder("HP: ").append(rql_3.id_class(((AnimValue)this.id_byte[2]).id_byte()));
        if (var1.Sd() > 0.0f && !var2) {
            var3.append((Object)rgF_2.GRAY).append(" + ").append((Object)rgF_2.YELLOW).append(rql_3.id_class(((AnimValue)this.id_byte[3]).id_byte())).append(" AB");
        }
        return var3.toString();
    }

    @Override
    public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
        iB_2 var7;
        this.s();
        super.id_class(var1, var2, var3, var4, var5);
        iB_2 var6 = this.id_while();
        iB_2 iB_22 = var7 = var6 != null ? var6 : (iB_2)this.id_byte[4];
        if (var7 != null) {
            ((rrFA)this.id_byte[1]).id_class(var7);
            ((AnimValue)this.id_byte[2]).id_break(var7.u_());
            ((AnimValue)this.id_byte[3]).id_break(var7.Sd());
            float var8 = this.id_long();
            float var9 = this.id_default() + this.id_implements();
            float var10 = this.id_abstract() - 8.0f - 4.0f;
            ((rrFA)this.id_byte[1]).id_class(var1, var9, var10, var8);
            this.id_class(var1, var7);
        }
    }

    private void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10) {
        rrfD_2.id_class(var1, var2, var3, var4 - 1.0f, 5.0f, 2.0f, 2.0f, 2.0f, 2.0f, ColorHelper.id_class(35, var10));
        if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().w().id_goto()) {
            rrfD_2.id_class(var1, var2 - 1.0f, var3 - 2.0f, var5 + 1.0f, 10.0f, 2.0f, 4.0f, var6, var7, var8, var9);
        }
        float var11 = !(var5 < 4.0f) && !(var5 > var4 - 2.0f) ? 0.0f : 2.0f;
        rrfD_2.id_break(var1, var2, var3, var5 - 1.0f, 5.0f, 2.0f, var11, var11, 2.0f, var6, var7, var8, var9);
    }

    private void id_class(Ml_1 var1, iB_2 var2) {
        this.s();
        float var3 = this.id_default();
        float var4 = this.id_abstract();
        float var5 = this.id_implements();
        float var6 = this.id_long();
        int var7 = (int)rfU_2.id_class(255.0f * var6, 0.0f, 255.0f);
        int var8 = Math.min(var7, 225);
        int var9 = ColorHelper.id_break(rrZF.d_, var7);
        int var10 = ColorHelper.id_class(0.0f, var8);
        int var11 = ColorHelper.id_class(90.0f, var8);
        int var12 = ColorHelper.id_class(270.0f, var8);
        int var13 = ColorHelper.id_class(180.0f, var8);
        int var14 = 28;
        float var15 = var3 + (float)var14 + 4.0f;
        float var16 = var4 + 5.0f;
        float var17 = var3 + (float)var14 + 5.0f;
        float var18 = var5 - (float)var14 - 9.0f;
        float var19 = var2.SK();
        float var20 = Math.min(((AnimValue)this.id_byte[2]).id_byte(), var19) / var19 * var18;
        rrfD_2.id_class(var1, var3, var4, var5, 33.0f, var8, var10, var11, var12, var13, false);
        this.id_class(var1, var2, var15, var16, var5, var9);
        ((rrFC)this.id_byte[0]).id_class(var1, var2, var3 + 2.0f, var4 + 2.5f, var14, var14, 2.5f, (float)((Integer)var2.id_private[10]).intValue() / 20.0f, var7);
        this.id_class(var1, var17, var4 + (float)var14 - 5.0f, var18, var20, var10, var11, var12, var13, var7);
    }

    @Override
    public boolean id_package() {
        return this.id_while() != null;
    }

    public iB_2 id_while() {
        this.s();
        if ((vm_3)TargetHud.id_import.id_class[73] instanceof FP) {
            cb_3 var9;
            cb_3 var10000 = var9 = (cb_3)TargetHud.id_import.id_class[57];
            this.id_byte[4] = var9;
            return var10000;
        }
        rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private();
        AttackAura var2 = var1.E();
        TriggerBot var3 = var1.id_long();
        iB_2 var4 = var2.id_native();
        if (var4 == null) {
            var4 = var3.id_native();
        }
        if (var4 != null) {
            this.id_byte[4] = var4;
        }
        return var4;
    }

    @Override
    public boolean id_protected() {
        return false;
    }

    @Override
    public void ar_() {
        this.s();
        super.ar_();
        ((rrFA)this.id_byte[1]).id_break();
    }

    @Override
    public float au_() {
        this.s();
        return ((rrFA)this.id_byte[1]).id_class() ? 10.0f : 0.0f;
    }
}

