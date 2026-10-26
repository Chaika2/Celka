/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package celestial.module.render;

import celestial.Ml_1;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.event.RenderEvent;
import celestial.ju_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rjV_2;
import celestial.rrAS;
import celestial.rrIm_1;
import celestial.rrQK;
import celestial.rrQo_1;
import celestial.rrjc_3;
import celestial.rrqT_2;
import celestial.rrvH;
import celestial.util.ColorHelper;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class JumpCircles
extends Module {
    public Object[] id_break;

    public JumpCircles() {
        super("Jump Circles", "\u0414\u043e\u0431\u0430\u0432\u043b\u044f\u0435\u0442 \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u044e \u043f\u0440\u044b\u0436\u043a\u0430 \u043f\u043e\u0434\n\u0432\u0430\u043c\u0438", Category.RENDER);
        rrvH var8;
        this.id_continue();
        rrIm_1 var5 = this.id_class(new rrIm_1("\u0420\u0430\u0434\u0438\u0443\u0441", Float.valueOf(1.5f), Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(0.1f)));
        this.id_break[0] = var5;
        rrIm_1 var6 = this.id_class(new rrIm_1("\u0420\u0430\u0434\u0438\u0443\u0441 \u0441\u0432\u0435\u0447\u0435\u043d\u0438\u044f", Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(0.1f)));
        this.id_break[1] = var6;
        rrIm_1 var7 = this.id_class(new rrIm_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", Float.valueOf(0.3f), Float.valueOf(0.3f), Float.valueOf(1.0f), Float.valueOf(0.1f)));
        this.id_break[2] = var7;
        this.id_break[3] = var8 = new rrvH(20);
    }

    private void id_class(Ml_1 var1, rrqT_2 var2, float var3, float var4, float var5) {
        int var7 = ColorHelper.id_class(0.0f);
        double var8 = (Double)var2.id_class[0] - id_void.id_case();
        double var10 = (Double)var2.id_class[1] - id_void.id_catch();
        double var12 = (Double)var2.id_class[2] - id_void.id_private();
        if (var4 <= 0.0f) {
            var4 = 0.0f;
        }
        float var14 = rfU_2.id_throws;
        for (float var25 = 0.0f; var25 < 360.0f; var25 += 8.0f) {
            double var21 = Math.sin((var25 - 8.0f) * var14);
            double var23 = Math.cos((var25 - 8.0f) * var14);
            double var17 = Math.sin(var25 * var14);
            double var19 = Math.cos(var25 * var14);
            double var15 = var3 - var3 / 100.0f * var5;
            int var6 = ColorHelper.id_class(var25);
            this.id_class(var1, var3, (int)var4, var6, var7, var15, var17, var19, var21, var23, var8, var10, var12);
            var15 = var3 + var3 / 100.0f * var5;
            this.id_class(var1, var3, (int)var4, var6, var7, var15, var17, var19, var21, var23, var8, var10, var12);
            this.id_class(var1, var3, (int)var4, var6, var7, (double)var3 + ((double)var3 - var15) / 8.0, var17, var19, var21, var23, var8, var10, var12);
            var7 = var6;
        }
    }

    @EventTarget
    public void id_class(RenderEvent var1) {
        this.id_continue();
        if (!((List)this.id_break[3]).isEmpty()) {
            Ml_1 var2 = var1.id_class();
            RenderSystem.depthMask(false);
            RenderSystem.disableTexture();
            RenderSystem.disableAlphaTest();
            RenderSystem.enableBlend();
            RenderSystem.blendFunc(770, 1);
            RenderSystem.enableSmoothShadeModel();
            GL11.glDisable((int)2884);
            id_strictfp.id_class(7, ju_3.id_this);
            float var3 = ((Float)((rrIm_1)this.id_break[0]).id_byte()).floatValue();
            float var4 = ((Float)((rrIm_1)this.id_break[1]).id_byte()).floatValue();
            int var5 = 255;
            Iterator var6 = ((List)this.id_break[3]).iterator();
            while (var6.hasNext()) {
                rrqT_2 var7 = (rrqT_2)var6.next();
                if (var7.id_class()) {
                    var6.remove();
                    continue;
                }
                Float var13 = Float.valueOf(rfU_2.id_class(rrQo_1.id_class((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0]), ((Float)var7.id_class[3]).floatValue(), var3, ((Float)((rrIm_1)this.id_break[2]).id_byte()).floatValue() / 10.0f), 0.0f, var3));
                var7.id_class[3] = var13;
                float var8 = 0.0f;
                if (((Float)var7.id_class[3]).floatValue() > ((Float)var7.id_class[3]).floatValue() / 6.0f) {
                    var8 = ((Float)var7.id_class[3]).floatValue() / 6.0f;
                }
                this.id_class(var2, var7, ((Float)var7.id_class[3]).floatValue(), (float)var5 - var8 * 2000.0f / var3, var4 * 20.0f);
            }
            id_default.id_break();
            GL11.glEnable((int)2884);
            RenderSystem.disableSmoothShadeModel();
            RenderSystem.blendFunc(770, 771);
            RenderSystem.disableBlend();
            RenderSystem.enableAlphaTest();
            RenderSystem.enableTexture();
            RenderSystem.depthMask(true);
        }
    }

    private void id_class(Ml_1 var1, float var2, int var3, int var4, int var5, double var6, double var8, double var10, double var12, double var14, double var16, double var18, double var20) {
        rjV_2 var22 = var1.id_byte().id_class();
        id_strictfp.id_class(var22, (float)(var16 + var12 * var6), (float)var18, (float)(var20 + var14 * var6)).id_class(var5, 0).id_class();
        id_strictfp.id_class(var22, (float)(var16 + var12 * (double)var2), (float)var18, (float)(var20 + var14 * (double)var2)).id_class(var5, var3).id_class();
        id_strictfp.id_class(var22, (float)(var16 + var8 * (double)var2), (float)var18, (float)(var20 + var10 * (double)var2)).id_class(var4, var3).id_class();
        id_strictfp.id_class(var22, (float)(var16 + var8 * var6), (float)var18, (float)(var20 + var10 * var6)).id_class(var4, 0).id_class();
    }

    @EventTarget
    public void id_class(rrAS var1) {
        this.id_continue();
        rfl_3 var2 = rrjc_3.id_break(((cb_3)JumpCircles.id_import.id_class[57]).Bs());
        double var3 = ((cb_3)JumpCircles.id_import.id_class[57]).re();
        var3 = Math.min(var3 + var2.id_throws + 0.05, var3 + 0.15);
        ((List)this.id_break[3]).add(new rrqT_2(this, ((cb_3)JumpCircles.id_import.id_class[57]).rx(), var3, ((cb_3)JumpCircles.id_import.id_class[57]).BO()));
    }

    private void id_continue() {
        if (this.id_break == null) {
            this.id_break = new Object[4];
        }
    }
}

