/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package celestial.module.render;

import celestial.Ml_1;
import celestial.Qw_1;
import celestial.an_3;
import celestial.event.EventTarget;
import celestial.iB_2;
import celestial.ju_3;
import celestial.lD_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rXQ;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhQ_2;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rrAV;
import celestial.rrfD_2;
import celestial.rrxL_2;
import celestial.rxS_2;
import celestial.tp_3;
import celestial.util.ColorHelper;
import celestial.wh_3;
import com.mojang.blaze3d.systems.RenderSystem;
import org.lwjgl.opengl.GL11;

public class ChinaHat
extends Module {
    public static Object[] id_break;
    private static double[] id_implements;

    public ChinaHat() {
        super("China Hat", "\u041a\u0438\u0442\u0430\u0439\u0441\u043a\u0430\u044f \u0448\u043b\u044f\u043f\u043a\u0430 \u043d\u0430\u0434 \u0433\u043e\u043b\u043e\u0432\u043e\u0439", Category.RENDER);
    }

    @EventTarget
    public void id_class(rrAV var1) {
        tp_3<?> tp_32 = var1.id_class();
        if (tp_32 instanceof wh_3) {
            wh_3 var2 = (wh_3)tp_32;
            Ml_1 var19 = var1.id_break();
            an_3 var4 = var1.id_protected();
            rfl_3 var5 = var4.rN();
            double var6 = var5.id_protected - var5.id_class;
            float var8 = this.id_class(var4);
            var19.id_class();
            var2.id_class.id_class(var19);
            rrxL_2.id_break();
            RenderSystem.enableBlend();
            RenderSystem.enableDepthTest();
            RenderSystem.disableCull();
            RenderSystem.disableTexture();
            RenderSystem.defaultBlendFunc();
            RenderSystem.enableSmoothShadeModel();
            RenderSystem.lineWidth(2.0f);
            GL11.glEnable((int)2848);
            GL11.glHint((int)3154, (int)4354);
            var19.id_class(id_implements[0], (double)var8, id_implements[1]);
            var19.id_class(rje_3.id_throws.id_byte(180.0f));
            var19.id_class(rje_3.id_protected.id_byte(90.0f));
            rjV_2 var9 = var19.id_byte().id_class();
            ((lD_2)rrfD_2.id_class[7]).id_class(5, ju_3.id_this);
            ((lD_2)rrfD_2.id_class[8]).id_class(2, ju_3.id_this);
            int var17 = ColorHelper.id_class(0.0f);
            for (int var18 = 0; var18 <= 180; ++var18) {
                float var10 = (float)var18 * ((Float)id_break[0]).floatValue();
                int var11 = var18 * 4;
                float var12 = (float)((double)rfU_2.id_class(var10) * var6);
                float var13 = 0.0f;
                float var14 = (float)((double)rfU_2.id_break(var10) * var6);
                int var15 = ColorHelper.id_class((float)var11, 100);
                ((lD_2)rrfD_2.id_class[7]).id_class(var9, var12, var13, var14).id_class(var15).id_class();
                ((lD_2)rrfD_2.id_class[7]).id_class(var9, 0.0f, 0.3f, 0.0f).id_class(var17).id_class();
                int var16 = ColorHelper.id_class((float)var11, 255);
                ((lD_2)rrfD_2.id_class[8]).id_class(var9, var12, var13, var14).id_class(var16).id_class();
            }
            id_default.id_class((lD_2)rrfD_2.id_class[7]);
            RenderSystem.depthMask(false);
            id_default.id_class((lD_2)rrfD_2.id_class[8]);
            RenderSystem.depthMask(true);
            RenderSystem.enableCull();
            RenderSystem.enableTexture();
            RenderSystem.disableSmoothShadeModel();
            GL11.glDisable((int)2848);
            var19.id_break();
        }
    }

    private float id_class(an_3 var1) {
        iB_2 var3;
        float var2 = -0.38f;
        if (var1 instanceof iB_2 && (var3 = (iB_2)var1).id_class(rXQ.HEAD).id_break() instanceof rxS_2) {
            var2 -= 0.11f;
        }
        if (((Qw_1)ChinaHat.id_import.id_class[20]).id_break(rhQ_2.HAT)) {
            var2 -= 0.025f;
        }
        return var2;
    }

    private static void id_else() {
        id_implements = new double[2];
    }

    static {
        id_implements = new double[2];
        Object[] var0 = new Object[]{Float.valueOf(-1.0842022E-19f)};
        id_break = var0;
    }
}

