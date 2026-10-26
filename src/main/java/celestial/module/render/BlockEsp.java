/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 *  org.lwjgl.opengl.GL11
 */
package celestial.module.render;

import celestial.C_class;
import celestial.Ml_1;
import celestial.Y;
import celestial.an_3;
import celestial.ao_3;
import celestial.event.EventTarget;
import celestial.event.RenderEvent;
import celestial.gm_3;
import celestial.ju_3;
import celestial.jz_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rHM;
import celestial.rHU;
import celestial.rHw_1;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rrIk_1;
import celestial.rrIz_1;
import celestial.rrLp_1;
import celestial.rrLq_1;
import celestial.rrfD_2;
import celestial.rrfu_3;
import celestial.rrjQ_2;
import celestial.rrjc_3;
import celestial.rrnW_2;
import celestial.rrqD_2;
import celestial.rrqK_2;
import celestial.rrqU_2;
import celestial.rrqY_2;
import celestial.rrqe_3;
import celestial.rsJ_2;
import celestial.ryO_2;
import celestial.ryr_3;
import celestial.rys_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.yX_2;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.IntSupplier;
import org.lwjgl.opengl.GL11;

public class BlockEsp
extends Module
implements rrqe_3 {
    public Object[] id_break;
    public static Object[] id_byte;

    public BlockEsp() {
        super("Block ESP", "WallHack \u043d\u0430 \u0431\u043b\u043e\u043a\u0438", Category.RENDER);
        HashSet var6;
        CopyOnWriteArraySet var5;
        this.id_super();
        this.id_break[1] = var5 = new CopyOnWriteArraySet();
        this.id_break[2] = var6 = new HashSet();
        ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).id_class(this);
        this.id_class((rrIk_1)id_byte[0], (rrIz_1)id_byte[7], (rrIk_1)id_byte[1], (rrIz_1)id_byte[8], (rrIk_1)id_byte[2], (rrIz_1)id_byte[9], (rrIk_1)id_byte[3], (rrIz_1)id_byte[10], (rrIk_1)id_byte[4], (rrIz_1)id_byte[11], (rrIk_1)id_byte[5], (rrIz_1)id_byte[12], (rrIk_1)id_byte[6], (rrIz_1)id_byte[13]);
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_super();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            if (((Set)this.id_break[1]).isEmpty()) {
                return;
            }
            ((Set)this.id_break[1]).removeIf(var0 -> ((gm_3)BlockEsp.id_import.id_class[56]).id_byte(var0.id_protected()).id_break() != var0.id_break().id_break());
        }
    }

    @EventTarget
    public void id_class(RenderEvent var1) {
        this.id_super();
        Ml_1 var2 = var1.id_class();
        float var3 = var1.id_byte();
        var2.id_class();
        GL11.glEnable((int)2848);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableBlend();
        RenderSystem.lineWidth(1.5f);
        RenderSystem.disableTexture();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        id_strictfp.id_class(1, ju_3.id_this);
        double var4 = id_void.id_case();
        double var6 = id_void.id_catch();
        double var8 = id_void.id_private();
        ObjectSet var10 = ((gm_3)BlockEsp.id_import.id_class[56]).id_return().int2ObjectEntrySet();
        for (Int2ObjectMap.Entry var12 : var10) {
            an_3 var13 = (an_3)var12.getValue();
            rfH_2 var14 = var13.Bs();
            if (!this.id_class(var13) || !this.id_class(var13.rN())) continue;
            IntSupplier var15 = ((rrqK_2)((Object)this.id_break[0])).id_class();
            rrfD_2.id_class(var2, (float)((double)var14.b_() - var4), (float)((double)var14.c_() - var6), (float)((double)var14.d_() - var8), var15.getAsInt());
        }
        for (ryO_2 var26 : ((gm_3)BlockEsp.id_import.id_class[56]).id_case) {
            rfl_3 var22;
            xc_3 var20;
            rjC_2 var21;
            rfH_2 var28 = var26.id_char();
            double var30 = var28.b_();
            double var16 = var28.c_();
            double var18 = var28.d_();
            if (!this.id_class(var26) || (var21 = rrjc_3.id_class(var26, var28, var20 = var26.id_abstract(), var3)) == null || !this.id_class(var22 = var21.id_class().id_protected(var30, var16, var18))) continue;
            IntSupplier var23 = ((rrqK_2)((Object)this.id_break[0])).id_class();
            rrfD_2.id_class(var2, var22.id_protected(-var4, -var6, -var8), var23.getAsInt());
        }
        for (rrqD_2 var27 : (Set)this.id_break[1]) {
            rjU_2 var29 = var27.id_byte();
            double var31 = var29.id_class();
            double var32 = var29.id_break();
            double var33 = var29.id_byte();
            rfl_3 var34 = null;
            xd_3 var35 = var27.id_break().id_break();
            if (var35 == xu_3.bD) {
                ryO_2 ryO_22 = ((gm_3)BlockEsp.id_import.id_class[56]).id_class(var27.id_protected());
                if (ryO_22 instanceof ryr_3) {
                    ryr_3 var37 = (ryr_3)ryO_22;
                    var34 = var37.id_class(var37.id_abstract(), var3).id_protected(var31, var32, var33);
                }
            } else {
                var34 = rrjc_3.id_class(var35.id_continue(), var27.id_protected()).id_protected(var31, var32, var33);
            }
            if (var34 == null || !this.id_class(var34)) continue;
            rrfD_2.id_class(var2, var34.id_protected(-var4, -var6, -var8), var27.id_break().id_class());
        }
        id_default.id_break();
        RenderSystem.enableTexture();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask(true);
        RenderSystem.disableBlend();
        GL11.glDisable((int)2848);
        var2.id_break();
    }

    @Override
    public void id_class(rrqU_2 var1, boolean var2) {
        this.id_super();
        if (var2) {
            ((Set)this.id_break[1]).clear();
        }
    }

    private boolean id_class(ao_3 var1) {
        rys_3 var2;
        rfH_2 var3;
        this.id_super();
        if (((rrIk_1)id_byte[0]).id_class().booleanValue() && var1 instanceof rHU) {
            rrqK_2 var8 = (rrqK_2)((Object)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[0]);
            this.id_break[0] = var8;
            return true;
        }
        if (((rrIk_1)id_byte[1]).id_class().booleanValue() && var1 instanceof ryr_3) {
            rrqK_2 var9 = (rrqK_2)((Object)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[1]);
            this.id_break[0] = var9;
            return true;
        }
        if (((rrIk_1)id_byte[2]).id_class().booleanValue() && var1 instanceof rHw_1) {
            rrqK_2 var10 = (rrqK_2)((Object)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[2]);
            this.id_break[0] = var10;
            return true;
        }
        if (((rrIk_1)id_byte[3]).id_class().booleanValue() && var1 instanceof rHM) {
            rrqK_2 var11 = (rrqK_2)((Object)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[6]);
            this.id_break[0] = var11;
            return true;
        }
        if (((rrIk_1)id_byte[4]).id_class().booleanValue() && var1 instanceof rsJ_2) {
            rrqK_2 var12 = (rrqK_2)((Object)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[3]);
            this.id_break[0] = var12;
            return true;
        }
        if (((rrIk_1)id_byte[5]).id_class().booleanValue() && var1 instanceof jz_3) {
            rrqK_2 var13 = (rrqK_2)((Object)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[4]);
            this.id_break[0] = var13;
            return true;
        }
        if (((rrIk_1)id_byte[6]).id_class().booleanValue() && var1 instanceof rys_3 && !((Set)this.id_break[2]).contains(var3 = (var2 = (rys_3)var1).id_char()) && rrjQ_2.id_class(var3)) {
            rrqK_2 var14 = (rrqK_2)((Object)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[5]);
            this.id_break[0] = var14;
            return true;
        }
        return false;
    }

    @Override
    public void id_class(boolean var1) {
        super.id_class(var1);
        ((yX_2)BlockEsp.id_import.id_class[8]).id_throws();
        if (var1) {
            rrfu_3.id_byte(rrfu_3.id_class(this) + "\u0412\u044b \u043c\u043e\u0436\u0435\u0442\u0435 \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0441\u0432\u043e\u0439 \u0431\u043b\u043e\u043a \u0447\u0435\u0440\u0435\u0437 \u043a\u043e\u043c\u0430\u043d\u0434\u0443 '" + (String)C_class.id_instanceof().id_protected.id_class[0] + "blockesp'");
        }
    }

    private boolean id_class(rfl_3 var1) {
        return ((yX_2)BlockEsp.id_import.id_class[8]).id_static().id_class(var1);
    }

    @EventTarget
    public void id_class(rrLp_1 var1) {
        rfH_2 var2;
        this.id_super();
        if (var1.id_case() == (rrLq_1)((Object)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2]) && rrjQ_2.id_class(var2 = var1.id_class())) {
            ((Set)this.id_break[2]).add(var2);
        }
    }

    @EventTarget
    public void id_class(rrnW_2 var1) {
        this.id_super();
        for (rrqU_2 var3 : ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).id_byte()) {
            if (var1.id_class() != var3.id_break()) continue;
            ((Set)this.id_break[1]).add(new rrqD_2(var3, var1.id_break(), var1.id_byte()));
            break;
        }
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_super();
        super.id_throws(var1);
        ((Set)this.id_break[1]).clear();
        ((Set)this.id_break[2]).clear();
    }

    @Override
    public void id_new() {
        this.id_super();
        ((Set)this.id_break[1]).clear();
    }

    private void id_super() {
        if (this.id_break == null) {
            this.id_break = new Object[3];
        }
    }

    static {
        Object[] var0 = new Object[14];
        var0[0] = new rrIk_1("\u0421\u043f\u0430\u0432\u043d\u0435\u0440\u0430", true);
        var0[1] = new rrIk_1("\u0428\u0430\u043b\u043a\u0435\u0440\u044b", false);
        var0[2] = new rrIk_1("\u0421\u0443\u043d\u0434\u0443\u043a\u0438", false);
        var0[3] = new rrIk_1("\u0411\u043e\u0447\u043a\u0438", false);
        var0[4] = new rrIk_1("\u0412\u0430\u0433\u043e\u043d\u0435\u0442\u043a\u0438", false);
        var0[5] = new rrIk_1("\u0414\u0438\u0441\u043f\u0435\u043d\u0441\u0435\u0440\u044b", false);
        var0[6] = new rrIk_1("\u041f\u043e\u0434\u0430\u0440\u043a\u0438", false);
        var0[7] = new rrIz_1("\u0426\u0432\u0435\u0442 \u0441\u043f\u0430\u0432\u043d\u0435\u0440\u043e\u0432", -65281);
        var0[8] = new rrIz_1("\u0426\u0432\u0435\u0442 \u0448\u0430\u043b\u043a\u0435\u0440\u043e\u0432", -65281).id_class(((rrIk_1)var0[1])::id_class);
        var0[9] = new rrIz_1("\u0426\u0432\u0435\u0442 \u0441\u0443\u043d\u0434\u0443\u043a\u043e\u0432", -65281).id_class(((rrIk_1)var0[2])::id_class);
        var0[10] = new rrIz_1("\u0426\u0432\u0435\u0442 \u0431\u043e\u0447\u0435\u043a", -65281).id_class(((rrIk_1)var0[3])::id_class);
        var0[11] = new rrIz_1("\u0426\u0432\u0435\u0442 \u0432\u0430\u0433\u043e\u043d\u0435\u0442\u043e\u043a", -65281).id_class(((rrIk_1)var0[4])::id_class);
        var0[12] = new rrIz_1("\u0426\u0432\u0435\u0442 \u0434\u0438\u0441\u043f\u0435\u043d\u0441\u0435\u0440\u043e\u0432", -65281).id_class(((rrIk_1)var0[5])::id_class);
        var0[13] = new rrIz_1("\u0426\u0432\u0435\u0442 \u043f\u043e\u0434\u0430\u0440\u043a\u043e\u0432", -65281).id_class(((rrIk_1)var0[6])::id_class);
        id_byte = var0;
    }
}

