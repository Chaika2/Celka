/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.render;

import celestial.Ml_1;
import celestial.Qw_1;
import celestial.VZ;
import celestial.an_3;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.iB_2;
import celestial.ju_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rfo_3;
import celestial.rjG_2;
import celestial.rrAa_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrIz_1;
import celestial.rrQX;
import celestial.rrZF;
import celestial.rrfD_2;
import celestial.rrnB_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class Crosshair
extends Module {
    public Object[] id_break;

    public Crosshair() {
        super("Crosshair", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u043a\u0430\u0441\u0442\u043e\u043c\u0438\u0437\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0432\u0430\u0448\n\u043f\u0440\u0438\u0446\u0435\u043b", Category.RENDER);
        this.id_new();
        rrIz_1 var5 = new rrIz_1("\u0426\u0432\u0435\u0442 \u043f\u0440\u0438\u0446\u0435\u043b\u0430", -1).id_break();
        this.id_break[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u041f\u043e\u0434\u0441\u0432\u0435\u0442\u043a\u0430 \u044d\u043d\u0442\u0438\u0442\u0438", false);
        this.id_break[1] = var6;
        rrIz_1 var7 = (rrIz_1)new rrIz_1("\u0426\u0432\u0435\u0442 \u043f\u043e\u0434\u0441\u0432\u0435\u0442\u043a\u0438", -65536).id_break().id_class(() -> {
            this.id_new();
            return ((rrIk_1)this.id_break[1]).id_class();
        });
        this.id_break[2] = var7;
        rrIk_1 var8 = new rrIk_1("\u0423\u0447\u0438\u0442\u044b\u0432\u0430\u0442\u044c \u043a\u0443\u043b\u0434\u0430\u0443\u043d", false);
        this.id_break[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u0422\u043e\u0447\u043a\u0430 \u043f\u043e \u0441\u0435\u0440\u0435\u0434\u0438\u043d\u0435", false);
        this.id_break[4] = var9;
        rrIm_1 var10 = new rrIm_1("\u0420\u0430\u0434\u0438\u0443\u0441", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(6.0f), Float.valueOf(0.5f));
        this.id_break[5] = var10;
        rrIm_1 var11 = new rrIm_1("\u0414\u043b\u0438\u043d\u0430", Float.valueOf(4.0f), Float.valueOf(0.5f), Float.valueOf(6.0f), Float.valueOf(0.5f));
        this.id_break[6] = var11;
        this.id_class((rrIz_1)this.id_break[0], (rrIk_1)this.id_break[1], (rrIz_1)this.id_break[2], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[3], (rrIm_1)this.id_break[5], (rrIm_1)this.id_break[6]);
    }

    @EventTarget(id_class=-100)
    public void id_class(rrnB_2 var1) {
        this.id_new();
        Ml_1 var2 = var1.id_class();
        if (!((Qw_1)Crosshair.id_import.id_class[20]).R && (((Qw_1)Crosshair.id_import.id_class[20]).id_volatile() == VZ.FIRST_PERSON || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_())) {
            rfo_3 var11;
            an_3 var14;
            rjG_2 var12;
            float var3 = id_const.id_volatile() / 2.0f;
            float var4 = id_const.id_final() / 2.0f;
            float var5 = ((Float)((rrIm_1)this.id_break[5]).id_byte()).floatValue();
            boolean var6 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().a().aJ_();
            float var7 = var5 + (((rrIk_1)this.id_break[3]).id_class() != false ? (1.0f - ((cb_3)Crosshair.id_import.id_class[57]).id_class(0.5f, var6)) * 10.0f : 0.0f);
            float var8 = ((Float)((rrIm_1)this.id_break[6]).id_byte()).floatValue();
            int var9 = (Integer)((rrIz_1)this.id_break[0]).id_byte();
            int var10 = rrZF.e_;
            if (((rrIk_1)this.id_break[1]).id_class().booleanValue() && (var12 = (rjG_2)Crosshair.id_import.id_class[64]) instanceof rfo_3 && (var14 = (var11 = (rfo_3)var12).id_class()) instanceof iB_2) {
                var9 = (Integer)((rrIz_1)this.id_break[2]).id_byte();
            }
            var2.id_class();
            RenderSystem.disableTexture();
            RenderSystem.enableSmoothShadeModel();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            id_strictfp.id_class(7, ju_3.id_this);
            float var13 = 0.5f;
            if (((rrIk_1)this.id_break[4]).id_class().booleanValue()) {
                rrfD_2.id_class(var2, var3 - var13, var4 - var13, 1.0f + var13 * 2.0f, 1.0f + var13 * 2.0f, var10);
                rrfD_2.id_class(var2, var3, var4, 1.0f, 1.0f, var9);
            }
            rrfD_2.id_class(var2, var3 - (var7 + var8 - 1.0f) - var13, var4 - var13, var8 + var13 * 2.0f, 1.0f + var13 * 2.0f, var10);
            rrfD_2.id_class(var2, var3 - var13, var4 - (var7 + var8 - 1.0f) - var13, 1.0f + var13 * 2.0f, var8 + var13 * 2.0f, var10);
            rrfD_2.id_class(var2, var3 + var7 - var13, var4 - var13, var8 + var13 * 2.0f, 1.0f + var13 * 2.0f, var10);
            rrfD_2.id_class(var2, var3 - var13, var4 + var7 - var13, 1.0f + var13 * 2.0f, var8 + var13 * 2.0f, var10);
            rrfD_2.id_class(var2, var3 - (var7 + var8 - 1.0f), var4, var8, 1.0f, var9);
            rrfD_2.id_class(var2, var3, var4 - (var7 + var8 - 1.0f), 1.0f, var8, var9);
            rrfD_2.id_class(var2, var3 + var7, var4, var8, 1.0f, var9);
            rrfD_2.id_class(var2, var3, var4 + var7, 1.0f, var8, var9);
            id_default.id_break();
            RenderSystem.disableBlend();
            RenderSystem.disableSmoothShadeModel();
            RenderSystem.enableTexture();
            var2.id_break();
        }
    }

    @EventTarget
    public void id_class(rrAa_1 var1) {
        var1.id_class(true);
    }

    private void id_new() {
        if (this.id_break == null) {
            this.id_break = new Object[7];
        }
    }
}

