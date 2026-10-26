/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.render;

import celestial.Ml_1;
import celestial.Qw_1;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rpZ_2;
import celestial.rrAi_1;
import celestial.rrIQ;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrLl_1;
import celestial.rrQX;
import celestial.rrqj_3;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;

public class SwingAnimations
extends Module {
    public Object[] id_break;

    public SwingAnimations() {
        super("Swing Animations", "\u0418\u0437\u043c\u0435\u043d\u044f\u0435\u0442 \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432\n\u0432 \u0440\u0443\u043a\u0430\u0445", Category.RENDER);
        this.id_new();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Type 1", "Type 1", "Type 2", "Default");
        this.id_break[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0422\u043e\u043b\u044c\u043a\u043e \u0441 AttackAura", false);
        this.id_break[1] = var6;
        rrIm_1 var7 = (rrIm_1)new rrIm_1("\u0421\u0438\u043b\u0430", Float.valueOf(70.0f), Float.valueOf(10.0f), Float.valueOf(100.0f), Float.valueOf(10.0f)).id_class(() -> {
            this.id_new();
            return !((String)((rrIQ)this.id_break[0]).id_byte()).equals("Default");
        });
        this.id_break[2] = var7;
        rrIm_1 var8 = new rrIm_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", Float.valueOf(7.0f), Float.valueOf(1.0f), Float.valueOf(10.0f), Float.valueOf(1.0f));
        this.id_break[3] = var8;
        rrIm_1 var9 = new rrIm_1("X \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430", Float.valueOf(0.0f), Float.valueOf(-1.5f), Float.valueOf(1.5f), Float.valueOf(0.1f));
        this.id_break[4] = var9;
        rrIm_1 var10 = new rrIm_1("Y \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430", Float.valueOf(0.0f), Float.valueOf(-1.5f), Float.valueOf(1.5f), Float.valueOf(0.1f));
        this.id_break[5] = var10;
        rrIm_1 var11 = new rrIm_1("Z \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430", Float.valueOf(0.0f), Float.valueOf(-1.5f), Float.valueOf(1.5f), Float.valueOf(0.1f));
        this.id_break[6] = var11;
        rrIm_1 var12 = new rrIm_1("X \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430", Float.valueOf(0.0f), Float.valueOf(-1.5f), Float.valueOf(1.5f), Float.valueOf(0.1f));
        this.id_break[7] = var12;
        rrIm_1 var13 = new rrIm_1("Y \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430", Float.valueOf(0.0f), Float.valueOf(-1.5f), Float.valueOf(1.5f), Float.valueOf(0.1f));
        this.id_break[8] = var13;
        rrIm_1 var14 = new rrIm_1("Z \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430", Float.valueOf(0.0f), Float.valueOf(-1.5f), Float.valueOf(1.5f), Float.valueOf(0.1f));
        this.id_break[9] = var14;
        this.id_class(new GroupSetting("\u0410\u043d\u0438\u043c\u0430\u0446\u0438\u044f", (rrIQ)this.id_break[0], (rrIm_1)this.id_break[2], (rrIm_1)this.id_break[3]), new GroupSetting("\u041f\u043e\u0437\u0438\u0446\u0438\u044f \u043f\u0440\u0430\u0432\u043e\u0439 \u0440\u0443\u043a\u0438", (rrIm_1)this.id_break[7], (rrIm_1)this.id_break[8], (rrIm_1)this.id_break[9]), new GroupSetting("\u041f\u043e\u0437\u0438\u0446\u0438\u044f \u043b\u0435\u0432\u043e\u0439 \u0440\u0443\u043a\u0438", (rrIm_1)this.id_break[4], (rrIm_1)this.id_break[5], (rrIm_1)this.id_break[6]), new GroupSetting("\u0414\u0440\u0443\u0433\u043e\u0435", new Setting[]{(rrIk_1)this.id_break[1]}));
    }

    private void id_class(Ml_1 var1, float var2, float var3) {
        this.id_new();
        float var4 = rfU_2.id_byte(var2);
        var1.id_class(rje_3.id_protected.id_byte(var3 * (45.0f + rfU_2.id_class(var2 * var2 * (float)Math.PI) / 4.0f * -20.0f)));
        var1.id_class(rje_3.id_case.id_byte(var3 * rfU_2.id_class(var4 * (float)Math.PI) * -20.0f));
        var1.id_class(rje_3.id_break.id_byte(rfU_2.id_class(var4 * (float)Math.PI) * -((Float)((rrIm_1)this.id_break[2]).id_byte()).floatValue()));
        var1.id_class(rje_3.id_protected.id_byte(var3 * -45.0f));
    }

    @EventTarget
    public void id_class(rrAi_1 var1) {
        this.id_new();
        if (this.id_continue()) {
            Ml_1 var2 = var1.id_break();
            rpZ_2 var3 = var1.id_class();
            float var4 = var1.id_catch();
            byte var5 = (byte)(var3 == rpZ_2.RIGHT ? 1 : -1);
            block0 : switch (((int[])rrqj_3.id_class[1])[var1.id_throws().ordinal()]) {
                case 1: {
                    switch (((int[])rrqj_3.id_class[0])[var3.ordinal()]) {
                        case 1: {
                            var2.id_class(((Float)((rrIm_1)this.id_break[7]).id_byte()).floatValue(), ((Float)((rrIm_1)this.id_break[8]).id_byte()).floatValue(), ((Float)((rrIm_1)this.id_break[9]).id_byte()).floatValue());
                            return;
                        }
                        case 2: {
                            var2.id_class(((Float)((rrIm_1)this.id_break[4]).id_byte()).floatValue(), ((Float)((rrIm_1)this.id_break[5]).id_byte()).floatValue(), ((Float)((rrIm_1)this.id_break[6]).id_byte()).floatValue());
                            return;
                        }
                    }
                    return;
                }
                case 2: {
                    if (var3 != ((Qw_1)SwingAnimations.id_import.id_class[20]).id_continue) break;
                    switch ((String)((rrIQ)this.id_break[0]).id_byte()) {
                        case "Type 1": {
                            this.id_class(var1, var2, var5);
                            this.id_class(var2, var4, (float)var5);
                            break block0;
                        }
                        case "Type 2": {
                            this.id_class(var1, var2, var5);
                            this.id_break(var2, var4, var5);
                        }
                    }
                }
            }
        }
    }

    private void id_class(rrAi_1 var1, Ml_1 var2, int var3) {
        var1.id_class(true);
        var2.id_class((float)var3 * 0.56f, -0.52f, -0.72f);
    }

    @EventTarget
    public void id_class(rrLl_1 var1) {
        this.id_new();
        if (this.id_continue()) {
            float var2 = ((rrIm_1)this.id_break[3]).id_native() - ((Float)((rrIm_1)this.id_break[3]).id_byte()).floatValue() + ((rrIm_1)this.id_break[3]).id_class();
            var1.id_class(var2 * 2.0f);
        }
    }

    private void id_break(Ml_1 var1, float var2, float var3) {
        this.id_new();
        var1.id_class(rje_3.id_protected.id_byte(var3 * 90.0f));
        var1.id_class(rje_3.id_case.id_byte(var3 * -60.0f));
        var1.id_class(rje_3.id_break.id_byte(-60.0f - 40.0f * (float)Math.sin((double)var2 * Math.PI / 2.0 * 2.0) * ((Float)((rrIm_1)this.id_break[2]).id_byte()).floatValue() / 50.0f));
        var1.id_class(rje_3.id_break.id_byte(var3 * -20.0f));
    }

    private boolean id_continue() {
        this.id_new();
        return ((rrIk_1)this.id_break[1]).id_class() == false || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().E().aJ_();
    }

    private void id_new() {
        if (this.id_break == null) {
            this.id_break = new Object[10];
        }
    }
}

