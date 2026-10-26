/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package celestial.module.util;

import celestial.Ml_1;
import celestial.PX;
import celestial.cb_3;
import celestial.cm_3;
import celestial.event.EventTarget;
import celestial.event.RenderEvent;
import celestial.ju_3;
import celestial.lD_2;
import celestial.manager.FontManager;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rqR_2;
import celestial.rql_3;
import celestial.rqy_3;
import celestial.rrAM;
import celestial.rrAo_1;
import celestial.rrFj_1;
import celestial.rrTA;
import celestial.rrTT;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrfu_3;
import celestial.rrnB_2;
import celestial.rryE;
import celestial.util.ColorHelper;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class TestFunc
extends Module {
    private static double[] id_throws = new double[6];
    public Object[] id_break;
    public static Object[] id_byte;

    public TestFunc() {
        super("Test Func", "Test :)", Category.UTIL);
        ArrayList var7;
        ArrayList var6;
        ArrayList var5;
        this.id_goto();
        this.id_break[0] = var5 = new ArrayList();
        this.id_break[1] = var6 = new ArrayList();
        this.id_break[2] = var7 = new ArrayList();
        this.id_break[4] = -1L;
    }

    private void id_this() {
        this.id_goto();
        this.id_break[3] = 0;
        this.id_break[4] = -1L;
        ((List)this.id_break[0]).clear();
        ((List)this.id_break[1]).clear();
        ((List)this.id_break[2]).clear();
        ((List)id_byte[0]).clear();
    }

    @EventTarget
    public void id_class(rrnB_2 var1) {
        this.id_goto();
        Ml_1 var2 = var1.id_class();
        rrZO var3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_break();
        float var4 = id_import.id_else().id_final() / 2.0f + 45.0f;
        var2.id_class();
        var3.id_break(id_strictfp);
        rrfD_2.id_throws((lD_2)rrfD_2.id_class[7]);
        for (rryE var6 : (List)id_byte[0]) {
            rrfD_2.id_class(var2, (lD_2)rrfD_2.id_class[7], ((Float)var6.id_class[1]).floatValue(), var4 + ((Float)var6.id_class[2]).floatValue(), 5.0f, 1.0f, -1);
            if (!(Math.abs(((Float)var6.id_class[2]).floatValue()) > 3.0f)) continue;
            String var10000 = "%.1f";
            String var7 = String.format(var10000, Float.valueOf(Math.abs(((Float)var6.id_class[2]).floatValue())));
            var3.id_class(var2, id_strictfp, var7, (double)((Float)var6.id_class[1]).floatValue(), (double)(var4 + ((Float)var6.id_class[2]).floatValue() + (float)(((Float)var6.id_class[2]).floatValue() > 0.0f ? 5 : -5)), Color.RED.getRGB(), false, false);
        }
        rrfD_2.id_private((lD_2)rrfD_2.id_class[7]);
        var3.id_byte(id_strictfp);
        var2.id_break();
        int var9 = 40;
        ((cm_3)TestFunc.id_import.id_class[15]).id_class(var2, "Hit count: " + (Integer)this.id_break[3], (int)(id_import.id_else().id_volatile() / 2.0f), var9, -1);
        var9 += 15;
        if ((Long)this.id_break[4] != -1L) {
            long var13 = rqR_2.id_break() - (Long)this.id_break[4];
            Duration var20 = Duration.ofMillis(var13);
            rqy_3[] var25 = new rqy_3[]{rqy_3.HOURS, rqy_3.MINUTES, rqy_3.SECONDS};
            String var8 = "Duration: " + rql_3.id_class(var20, var25);
            ((cm_3)TestFunc.id_import.id_class[15]).id_class(var2, var8, (int)(id_import.id_else().id_volatile() / 2.0f), var9, -1);
            var9 += 15;
        }
        if (!((List)this.id_break[1]).isEmpty()) {
            float var14 = (float)((List)this.id_break[1]).stream().mapToDouble(Float::doubleValue).average().orElse(id_throws[0]);
            float var16 = (float)((List)this.id_break[1]).stream().mapToDouble(Float::doubleValue).max().orElse(id_throws[1]);
            float var18 = (float)((List)this.id_break[1]).stream().mapToDouble(Float::doubleValue).min().orElse(id_throws[2]);
            cm_3 var21 = (cm_3)TestFunc.id_import.id_class[15];
            var21.id_class(var2, String.format("Average yaw speed: %.2f", Float.valueOf(var14)), (int)(id_import.id_else().id_volatile() / 2.0f), var9, -1);
            var21 = (cm_3)TestFunc.id_import.id_class[15];
            var21.id_class(var2, String.format("Max yaw speed: %.2f | Min yaw speed: %.2f", Float.valueOf(var16), Float.valueOf(var18)), (int)(id_import.id_else().id_volatile() / 2.0f), var9 += 15, -1);
            var9 += 15;
        }
        if (!((List)this.id_break[2]).isEmpty()) {
            float var15 = (float)((List)this.id_break[2]).stream().mapToDouble(Float::doubleValue).average().orElse(id_throws[3]);
            float var17 = (float)((List)this.id_break[2]).stream().mapToDouble(Float::doubleValue).max().orElse(id_throws[4]);
            float var19 = (float)((List)this.id_break[2]).stream().mapToDouble(Float::doubleValue).min().orElse(id_throws[5]);
            cm_3 var23 = (cm_3)TestFunc.id_import.id_class[15];
            var23.id_class(var2, String.format("Average pitch speed: %.2f", Float.valueOf(var15)), (int)(id_import.id_else().id_volatile() / 2.0f), var9, -1);
            var23 = (cm_3)TestFunc.id_import.id_class[15];
            var23.id_class(var2, String.format("Max pitch speed: %.2f | Min pitch speed: %.2f", Float.valueOf(var17), Float.valueOf(var19)), (int)(id_import.id_else().id_volatile() / 2.0f), var9 += 15, -1);
        }
    }

    @EventTarget
    public void id_class(rrAM var1) {
        this.id_this();
    }

    @EventTarget
    public void id_class(RenderEvent var1) {
        if (!((List)rrTT.id_break[1]).isEmpty()) {
            double var2 = id_void.id_case();
            double var4 = id_void.id_catch();
            double var6 = id_void.id_private();
            Ml_1 var8 = var1.id_class();
            var8.id_class();
            RenderSystem.enableBlend();
            RenderSystem.disableTexture();
            RenderSystem.disableDepthTest();
            RenderSystem.disableCull();
            RenderSystem.blendFunc(770, 771);
            RenderSystem.lineWidth(5.0f);
            GL11.glEnable((int)2848);
            GL11.glHint((int)3154, (int)4354);
            GL11.glPointSize((float)5.0f);
            id_strictfp.id_class(0, ju_3.id_this);
            rjV_2 var9 = var8.id_byte().id_class();
            for (rrTA var11 : (List)rrTT.id_break[1]) {
                rjU_2 var12 = var11.rr();
                int var13 = ColorHelper.id_class(255, 0, 0, 255);
                id_strictfp.id_class(var9, (float)(var12.id_break - var2), (float)(var12.id_byte - var4), (float)(var12.id_protected - var6)).id_class(var13).id_class();
            }
            id_default.id_break();
            if ((rrTA)rrTT.id_break[2] != null) {
                id_strictfp.id_class(0, ju_3.id_this);
                rrTA var14 = (rrTA)rrTT.id_break[2];
                rjU_2 var15 = var14.rr();
                int var16 = ColorHelper.id_class(0, 0, 255, 255);
                id_strictfp.id_class(var9, (float)(var15.id_break - var2), (float)(var15.id_byte - var4), (float)(var15.id_protected - var6)).id_class(var16).id_class();
                id_default.id_break();
            }
            RenderSystem.enableDepthTest();
            RenderSystem.enableTexture();
            RenderSystem.disableBlend();
            RenderSystem.enableCull();
            RenderSystem.lineWidth(1.0f);
            var8.id_break();
        }
    }

    @EventTarget
    public void id_class(rrFj_1 var1) {
        this.id_goto();
        this.id_break[3] = (Integer)this.id_break[3] + 1;
        if ((Long)this.id_break[4] == -1L) {
            this.id_break[4] = rqR_2.id_break();
        }
    }

    @EventTarget
    public void id_class(rrAo_1 var1) {
        this.id_goto();
        float var2 = var1.id_throws();
        float var3 = var1.id_this();
        if (!(var3 > 0.0f) || var2 > 0.0f) {
            // empty if block
        }
        if (var3 > 0.0f && (Integer)this.id_break[3] > 0) {
            ((List)this.id_break[1]).add(Float.valueOf(Math.abs(var3)));
        }
        if (var2 > 0.0f) {
            if ((Integer)this.id_break[3] > 0) {
                ((List)this.id_break[2]).add(Float.valueOf(Math.abs(var2)));
            }
            float var4 = var1.id_continue();
            float var5 = ((List)id_byte[0]).isEmpty() ? 0.0f : ((Float)((rryE)((List)TestFunc.id_byte[0]).get((int)(((List)TestFunc.id_byte[0]).size() - 1))).id_class[1]).floatValue();
            float var6 = var4 - ((cb_3)TestFunc.id_import.id_class[57]).b();
            int var7 = 5;
            ((List)id_byte[0]).add(new rryE(var4, var5 + (float)var7, var6));
            if (var5 + (float)(var7 * 2) > id_import.id_else().id_volatile()) {
                ((List)id_byte[0]).clear();
            }
        }
        if (((List)this.id_break[0]).size() > 300) {
            StringBuilder var8 = new StringBuilder();
            for (PX var11 : (List)this.id_break[0]) {
                var8.append("new Rotation(").append(var11.id_throws()).append("F, ").append(var11.id_protected()).append("F), ");
            }
            String var10 = var8.toString();
            rrfu_3.id_byte("First 300 rotations");
            System.out.println(var10);
            ((List)this.id_break[0]).clear();
        }
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_this();
    }

    private void id_goto() {
        if (this.id_break == null) {
            this.id_break = new Object[5];
            this.id_break[3] = 0;
            this.id_break[4] = 0L;
        }
    }

    private static void id_else() {
        id_throws = new double[6];
    }

    static {
        Object[] var0 = new Object[]{new ArrayList()};
        id_byte = var0;
    }
}

