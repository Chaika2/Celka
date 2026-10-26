/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package celestial.module.movement;

import celestial.Aq_1;
import celestial.Ml_1;
import celestial.Qw_1;
import celestial.VZ;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.event.RenderEvent;
import celestial.ju_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rLS;
import celestial.rZL;
import celestial.rZO;
import celestial.rZr_1;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.rmI_2;
import celestial.rmJ_2;
import celestial.rmT_2;
import celestial.rmV_2;
import celestial.rmu_3;
import celestial.rrAl_1;
import celestial.rrFj_1;
import celestial.rrIQ;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrLZ;
import celestial.rrfa_3;
import celestial.rrfw_3;
import celestial.ruS_2;
import celestial.yX_2;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayDeque;
import java.util.Queue;
import org.lwjgl.opengl.GL11;

public class Blink
extends Module {
    private static double[] id_catch = new double[3];
    public Object[] id_break;

    public Blink() {
        super("Blink", "\u0417\u0430\u043c\u0435\u0434\u043b\u044f\u0435\u0442 \u043f\u0430\u043a\u0435\u0442\u044b \u043e\u0442\u043f\u0440\u0430\u0432\u043b\u044f\u0435\u043c\u044b\u0435\n\u043d\u0430 \u0441\u0435\u0440\u0432\u0435\u0440", Category.PLAYER);
        ArrayDeque var5;
        this.id_else();
        this.id_break[0] = var5 = new ArrayDeque();
        rrfw_3 var6 = new rrfw_3();
        this.id_break[1] = var6;
        rrIQ var7 = new rrIQ("\u0420\u0435\u0436\u0438\u043c \u0437\u0430\u043c\u0435\u0434\u043b\u0435\u043d\u0438\u044f", "Normal", "Normal", "Delay");
        this.id_break[3] = var7;
        rrIm_1 var8 = (rrIm_1)new rrIm_1("\u0414\u043b\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c", Float.valueOf(0.5f), Float.valueOf(0.1f), Float.valueOf(5.0f), Float.valueOf(0.1f)).id_class(() -> {
            this.id_else();
            return ((String)((rrIQ)this.id_break[3]).id_byte()).equals("Delay");
        });
        this.id_break[4] = var8;
        rrIk_1 var9 = new rrIk_1("\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c \u043d\u0430\u0441\u0442\u043e\u044f\u0449\u0443\u044e\n\u043f\u043e\u0437\u0438\u0446\u0438\u044e", true);
        this.id_break[5] = var9;
        this.id_class((rrIQ)this.id_break[3], (rrIm_1)this.id_break[4], (rrIk_1)this.id_break[5]);
    }

    @EventTarget
    public void id_class(RenderEvent var1) {
        this.id_else();
        if (((rrIk_1)this.id_break[5]).id_class().booleanValue() && (rjU_2)this.id_break[2] != null && ((Qw_1)Blink.id_import.id_class[20]).id_volatile() != VZ.FIRST_PERSON) {
            Ml_1 var2 = var1.id_class();
            rfl_3 var3 = ((cb_3)Blink.id_import.id_class[57]).a_(((cb_3)Blink.id_import.id_class[57]).Pb()).id_class((rjU_2)this.id_break[2]);
            double var4 = id_void.id_case();
            double var6 = id_void.id_catch();
            double var8 = id_void.id_private();
            var2.id_class();
            GL11.glEnable((int)2848);
            RenderSystem.disableDepthTest();
            RenderSystem.disableTexture();
            RenderSystem.disableLighting();
            RenderSystem.depthMask(false);
            RenderSystem.disableAlphaTest();
            RenderSystem.blendFunc(770, 771);
            RenderSystem.enableBlend();
            RenderSystem.lineWidth(1.5f);
            id_strictfp.id_class(1, ju_3.id_this);
            yX_2.id_class(var2, id_strictfp, var3.id_protected(-var4, -var6, -var8), 1.0f, 1.0f, 1.0f, 1.0f);
            id_default.id_break();
            RenderSystem.disableBlend();
            RenderSystem.depthMask(true);
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
            RenderSystem.enableAlphaTest();
            GL11.glDisable((int)2848);
            rrfa_3.id_class();
            var2.id_break();
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_else();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) && ((String)((rrIQ)this.id_break[3]).id_byte()).equals("Delay") && ((rrfw_3)this.id_break[1]).id_class(((Float)((rrIm_1)this.id_break[4]).id_byte()).floatValue() * 1000.0f)) {
            this.id_continue();
        }
    }

    @EventTarget
    public void id_class(rrAl_1 var1) {
        this.id_else();
        rjU_2 var6 = new rjU_2(var1.id_break(), var1.id_extends(), var1.id_catch());
        this.id_break[2] = var6;
    }

    @EventTarget
    public void id_class(rrFj_1 var1) {
        this.id_continue();
    }

    @EventTarget
    public void id_class(rrLZ var1) {
        this.id_else();
        ruS_2<?> var2 = var1.id_class();
        if (!(var2 == null || var2 instanceof rmT_2 || var2 instanceof rmV_2 || var2 instanceof rZr_1 || var2 instanceof rZL || var2 instanceof rmJ_2 || var2 instanceof rLS || var2 instanceof rmu_3 || var2 instanceof rmI_2 || var2.getClass().getSimpleName().startsWith("S"))) {
            ((Queue)this.id_break[0]).add(var2);
            var1.id_class(true);
        }
    }

    @Override
    public void id_class(boolean var1) {
        this.id_else();
        super.id_class(var1);
        if ((cb_3)Blink.id_import.id_class[57] != null) {
            rjU_2 var6 = ((cb_3)Blink.id_import.id_class[57]).Ps();
            this.id_break[2] = var6;
        }
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_continue();
    }

    private void id_continue() {
        this.id_else();
        ((rrfw_3)this.id_break[1]).id_class();
        while (!((Queue)this.id_break[0]).isEmpty()) {
            rZO var2;
            ruS_2 var1 = (ruS_2)((Queue)this.id_break[0]).poll();
            if (var1 instanceof rZO && (var2 = (rZO)var1).id_byte()) {
                rjU_2 var7 = new rjU_2(var2.id_class(id_catch[0]), var2.id_break(id_catch[1]), var2.id_byte(id_catch[2]));
                this.id_break[2] = var7;
            }
            ((Aq_1)((cb_3)Blink.id_import.id_class[57]).id_break[0]).id_break(var1);
        }
    }

    private void id_else() {
        if (this.id_break == null) {
            this.id_break = new Object[6];
        }
    }

    private static void id_public() {
        id_catch = new double[3];
    }
}

