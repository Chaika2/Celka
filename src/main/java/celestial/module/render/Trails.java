/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.render;

import celestial.Ml_1;
import celestial.Qw_1;
import celestial.VZ;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.event.RenderEvent;
import celestial.ju_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rfU_2;
import celestial.rhx_3;
import celestial.rjV_2;
import celestial.rqR_2;
import celestial.rrfa_3;
import celestial.rrqR_2;
import celestial.util.ColorHelper;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trails
extends Module {
    public Object[] id_break;

    public Trails() {
        super("Trails", "\u041e\u0441\u0442\u0430\u0432\u043b\u044f\u0435\u0442 \u0441\u043b\u0435\u0434 \u0437\u0430 \u0432\u0430\u043c\u0438", Category.RENDER);
        ArrayList var5;
        this.id_this();
        this.id_break[0] = var5 = new ArrayList();
    }

    private void id_this() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }

    @EventTarget
    public void id_class(RenderEvent var1) {
        boolean var2;
        this.id_this();
        boolean bl = var2 = ((Qw_1)Trails.id_import.id_class[20]).id_volatile() == VZ.FIRST_PERSON;
        if (!var2) {
            Ml_1 var3 = var1.id_class();
            float var4 = var1.id_byte();
            double var5 = (Double)((cb_3)Trails.id_import.id_class[57]).id_throws[34] + (((cb_3)Trails.id_import.id_class[57]).rx() - (Double)((cb_3)Trails.id_import.id_class[57]).id_throws[34]) * (double)var4;
            double var7 = (Double)((cb_3)Trails.id_import.id_class[57]).id_throws[35] + (((cb_3)Trails.id_import.id_class[57]).re() - (Double)((cb_3)Trails.id_import.id_class[57]).id_throws[35]) * (double)var4 + 0.05;
            double var9 = (Double)((cb_3)Trails.id_import.id_class[57]).id_throws[36] + (((cb_3)Trails.id_import.id_class[57]).BO() - (Double)((cb_3)Trails.id_import.id_class[57]).id_throws[36]) * (double)var4;
            ((List)this.id_break[0]).add(new rrqR_2(var5, var7, var9));
            rrqR_2 var13 = null;
            boolean var14 = true;
            int var16 = 0;
            var3.id_class();
            RenderSystem.enableSmoothShadeModel();
            RenderSystem.enableBlend();
            RenderSystem.disableCull();
            RenderSystem.enableDepthTest();
            RenderSystem.blendFunc(770, 771);
            RenderSystem.disableAlphaTest();
            RenderSystem.depthMask(false);
            RenderSystem.disableTexture();
            rjV_2 var17 = var3.id_byte().id_class();
            id_strictfp.id_class(7, ju_3.id_this);
            Iterator var18 = ((List)this.id_break[0]).iterator();
            long var19 = rqR_2.id_break();
            float var21 = ((cb_3)Trails.id_import.id_class[57]).Bm();
            if (((cb_3)Trails.id_import.id_class[57]).x() && !((rhx_3)((cb_3)Trails.id_import.id_class[57]).id_implements[18]).id_break) {
                var21 *= 0.8f;
            }
            float var22 = var21 * 0.01f;
            double var23 = id_void.id_case();
            double var25 = id_void.id_catch();
            double var27 = id_void.id_private();
            while (var18.hasNext()) {
                float var35;
                rrqR_2 var29 = (rrqR_2)var18.next();
                if (var19 - (Long)var29.id_class[4] > 300L) {
                    var18.remove();
                    continue;
                }
                int var15 = ColorHelper.id_class(((Float)var29.id_class[3]).floatValue(), (int)((float)(255 * (255 - Math.round(((Float)var29.id_class[3]).floatValue()))) / 220.0f));
                float var30 = (float)((Double)var29.id_class[0] - var23);
                float var31 = (float)((Double)var29.id_class[1] - var25);
                float var32 = (float)((Double)var29.id_class[2] - var27);
                float var33 = var14 ? 0.0f : (float)((Double)var13.id_class[0] - var23);
                float var34 = var14 ? 0.0f : (float)((Double)var13.id_class[1] - var25);
                float f = var35 = var14 ? 0.0f : (float)((Double)var13.id_class[2] - var27);
                if (var14) {
                    id_strictfp.id_class(var17, var30, var31, var32).id_class(var15).id_class();
                    id_strictfp.id_class(var17, var30, var31 + var21, var32).id_class(var15).id_class();
                } else {
                    id_strictfp.id_class(var17, var33, var34, var35).id_class(var16).id_class();
                    id_strictfp.id_class(var17, var33, var34 + var21, var35).id_class(var16).id_class();
                }
                id_strictfp.id_class(var17, var30, var31 + var21, var32).id_class(var15).id_class();
                id_strictfp.id_class(var17, var30, var31, var32).id_class(var15).id_class();
                if (var14) {
                    id_strictfp.id_class(var17, var30, var31, var32).id_class(var15).id_class();
                    id_strictfp.id_class(var17, var30, var31 + var22, var32).id_class(var15).id_class();
                } else {
                    id_strictfp.id_class(var17, var33, var34, var35).id_class(var16).id_class();
                    id_strictfp.id_class(var17, var33, var34 + var22, var35).id_class(var16).id_class();
                }
                id_strictfp.id_class(var17, var30, var31 + var22, var32).id_class(var15).id_class();
                id_strictfp.id_class(var17, var30, var31, var32).id_class(var15).id_class();
                double var11 = var31 + var21 - var22;
                if (var14) {
                    id_strictfp.id_class(var17, var30, var31 + var21, var32).id_class(var15).id_class();
                    id_strictfp.id_class(var17, var30, (float)var11, var32).id_class(var15).id_class();
                } else {
                    id_strictfp.id_class(var17, var33, var34 + var21, var35).id_class(var16).id_class();
                    id_strictfp.id_class(var17, var33, var34 + var21 - var22, var35).id_class(var16).id_class();
                }
                id_strictfp.id_class(var17, var30, (float)var11, var32).id_class(var15).id_class();
                id_strictfp.id_class(var17, var30, var31 + var21, var32).id_class(var15).id_class();
                var14 = false;
                var13 = var29;
                var16 = var15;
                Float var40 = Float.valueOf(rfU_2.id_class((float)(var19 - (Long)var29.id_class[4]) / 250.0f, 0.0f, 1.0f) * 255.0f);
                var29.id_class[3] = var40;
            }
            id_default.id_break();
            RenderSystem.enableAlphaTest();
            RenderSystem.enableCull();
            RenderSystem.depthMask(true);
            RenderSystem.disableBlend();
            RenderSystem.enableTexture();
            RenderSystem.disableSmoothShadeModel();
            var3.id_break();
            rrfa_3.id_class();
        }
    }
}

