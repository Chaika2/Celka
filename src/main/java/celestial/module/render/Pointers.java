/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 *  org.lwjgl.opengl.GL11
 */
package celestial.module.render;

import celestial.Fu_1;
import celestial.Ml_1;
import celestial.Y;
import celestial.an_3;
import celestial.cG_2;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.iB_2;
import celestial.lD_2;
import celestial.manager.FontManager;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rSi_1;
import celestial.rVr_1;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.rrIQ;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrIz_1;
import celestial.rrQX;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrZW;
import celestial.rrfD_2;
import celestial.rrff_3;
import celestial.rrjZ_2;
import celestial.rrnB_2;
import celestial.setting.CheckGroup;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import celestial.vm_3;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.awt.Color;
import java.util.Set;
import org.lwjgl.opengl.GL11;

public class Pointers
extends Module {
    public Object[] id_break;
    public static Object[] id_byte;

    private rrZO id_byte(String var1) {
        return var1.equals("\u041f\u0438\u043a\u0441\u0435\u043b\u044c\u043d\u044b\u0439") ? ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_break() : ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_implements();
    }

    public Pointers() {
        super("Pointers", "\u0420\u0438\u0441\u0443\u0435\u0442 \u0441\u0442\u0440\u0435\u043b\u043a\u0438 \u043a \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u044f\u043c", Category.RENDER);
        this.id_else();
        CheckGroup var5 = new CheckGroup().id_catch(true).id_case(false).id_throws(true).id_private(true).id_break(false).id_implements(false).id_byte(false).id_protected(false).id_class(true);
        this.id_break[0] = var5;
        rrIQ var6 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "\u041a\u043b\u0438\u0435\u043d\u0442\u0441\u043a\u0438\u0439", "\u041a\u043b\u0438\u0435\u043d\u0442\u0441\u043a\u0438\u0439", "\u0418\u043d\u0434\u0438\u043a\u0430\u0442\u043e\u0440");
        this.id_break[1] = var6;
        rrIz_1 var7 = (rrIz_1)new rrIz_1("\u0426\u0432\u0435\u0442 \u0434\u0440\u0443\u0437\u0435\u0439", Color.GREEN.getRGB()).id_break().id_class(() -> {
            this.id_else();
            return ((CheckGroup)this.id_break[0]).id_implements();
        });
        this.id_break[2] = var7;
        rrIQ var8 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "\u041e\u0431\u044b\u0447\u043d\u044b\u0439", "\u041e\u0431\u044b\u0447\u043d\u044b\u0439", "\u041f\u0438\u043a\u0441\u0435\u043b\u044c\u043d\u044b\u0439");
        this.id_break[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435", true);
        this.id_break[4] = var9;
        rrIk_1 var10 = new rrIk_1("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044e", true);
        this.id_break[5] = var10;
        rrIk_1 var11 = new rrIk_1("\u041d\u0438\u043a", true);
        this.id_break[6] = var11;
        rrIm_1 var12 = new rrIm_1("\u0420\u0430\u0437\u043c\u0435\u0440", Float.valueOf(7.0f), Float.valueOf(5.0f), Float.valueOf(10.0f), Float.valueOf(1.0f));
        this.id_break[7] = var12;
        rrIm_1 var13 = new rrIm_1("\u0420\u0430\u0434\u0438\u0443\u0441", Float.valueOf(100.0f), Float.valueOf(50.0f), Float.valueOf(150.0f), Float.valueOf(5.0f));
        this.id_break[8] = var13;
        rrIk_1 var14 = new rrIk_1("\u0421\u0432\u0435\u0447\u0435\u043d\u0438\u0435", true);
        this.id_break[9] = var14;
        ObjectOpenHashSet var15 = new ObjectOpenHashSet();
        this.id_break[10] = var15;
        AnimValue var16 = new AnimValue(0.5f, false);
        this.id_break[11] = var16;
        this.id_class(new GroupSetting("\u0426\u0435\u043b\u0438", new Setting[]{new rrIc_1("\u0412\u044b\u0431\u043e\u0440", ((CheckGroup)this.id_break[0]).id_byte())}), new GroupSetting("\u0414\u043e\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f", new Setting[]{new rrIc_1("\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c", (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[6], (rrIk_1)this.id_break[5])}), new GroupSetting("\u0426\u0432\u0435\u0442\u0430", (rrIQ)this.id_break[1], (rrIz_1)this.id_break[2]), new GroupSetting("\u0428\u0440\u0438\u0444\u0442\u044b", new Setting[]{(rrIQ)this.id_break[3]}), new GroupSetting("\u0414\u0440\u0443\u0433\u043e\u0435", (rrIm_1)this.id_break[7], (rrIm_1)this.id_break[8], (rrIk_1)this.id_break[9]));
    }

    private float id_this() {
        this.id_else();
        vm_3 var2 = (vm_3)Pointers.id_import.id_class[74];
        if (var2 instanceof Fu_1) {
            Fu_1 var1 = (Fu_1)var2;
            int var5 = var1.id_synchronized;
            int var3 = var1.id_return;
            int var4 = (int)id_import.id_else().id_return();
            return (float)Math.max(var5, var3) + (float)(var4 - 1) * 100.0f;
        }
        return ((Float)((rrIm_1)this.id_break[8]).id_byte()).floatValue();
    }

    private rVr_1 id_class(an_3 var1) {
        cG_2 var2;
        this.id_else();
        if (var1 instanceof cG_2 && ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class(var2 = (cG_2)var1)) {
            int var3 = (Integer)((rrIz_1)this.id_break[2]).id_byte();
            return new rVr_1(var3, var3, var3, var3);
        }
        if (((String)((rrIQ)this.id_break[1]).id_byte()).equals("\u0418\u043d\u0434\u0438\u043a\u0430\u0442\u043e\u0440")) {
            int var4 = ColorHelper.id_break(ColorHelper.id_class(var1), 0.5f);
            return var1 instanceof rSi_1 ? new rVr_1(-6606593, -6606593, -6606593, -6606593) : new rVr_1(var4, var4, var4, var4);
        }
        return new rVr_1(ColorHelper.id_class(0.0f), ColorHelper.id_class(90.0f), ColorHelper.id_class(180.0f), ColorHelper.id_class(270.0f));
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_else();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            ((Set)this.id_break[10]).clear();
            ObjectSet var2 = ((gm_3)Pointers.id_import.id_class[56]).id_return().int2ObjectEntrySet();
            for (Int2ObjectMap.Entry var4 : var2) {
                an_3 var5 = (an_3)var4.getValue();
                if (!this.id_class(var5, (CheckGroup)this.id_break[0])) continue;
                ((Set)this.id_break[10]).add(var5);
            }
            this.id_break[12] = Float.valueOf(this.id_this());
        }
    }

    private void id_class(Ml_1 var1, rrZO var2, an_3 var3, float var4, float var5, float var6) {
        this.id_else();
        float var7 = var4 / 2.0f;
        if (((rrIk_1)this.id_break[5]).id_class().booleanValue()) {
            String var8 = (int)Math.abs(((cb_3)Pointers.id_import.id_class[57]).id_implements(var3)) + "m";
            var2.id_class(var1, id_strictfp, var8, var5, var6 + var7 + 5.0f, rrZF.d_);
        }
        if (((rrIk_1)this.id_break[6]).id_class().booleanValue()) {
            var2.id_class(var1, id_strictfp, ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_break(var3.id_extends()), var5, var6 - var7 - 6.0f, rrZF.d_);
        }
    }

    @EventTarget
    public void id_class(rrnB_2 var1) {
        this.id_else();
        if (!((Set)this.id_break[10]).isEmpty()) {
            Ml_1 var2 = var1.id_class();
            float var3 = var1.id_break();
            ((AnimValue)this.id_break[11]).id_break(((Float)this.id_break[12]).floatValue());
            float var4 = ((AnimValue)this.id_break[11]).id_byte();
            float var5 = ((Float)((rrIm_1)this.id_break[7]).id_byte()).floatValue();
            float var6 = (float)id_const.id_extends() / 4.0f;
            float var7 = (float)id_const.id_native() / 4.0f;
            rrZO var8 = this.id_byte((String)((rrIQ)this.id_break[3]).id_byte());
            rrfD_2.id_byte((lD_2)rrfD_2.id_class[7]);
            rrfD_2.id_throws((lD_2)rrfD_2.id_class[8]);
            var8.id_break(id_strictfp);
            id_import.A().id_class((rqO_2)id_byte[0]);
            float var9 = ((Float)((cb_3)Pointers.id_import.id_class[57]).id_throws[15]).floatValue() * ((float)Math.PI / 180);
            float var10 = rfU_2.id_break(var9);
            float var11 = rfU_2.id_class(var9);
            float var12 = -var5 / 2.0f;
            for (an_3 var14 : (Set)this.id_break[10]) {
                float var15 = (float)(rrjZ_2.id_protected(var14, var3) - rrjZ_2.id_protected((cb_3)Pointers.id_import.id_class[57], var3));
                float var16 = (float)(rrjZ_2.id_byte(var14, var3) - rrjZ_2.id_byte((cb_3)Pointers.id_import.id_class[57], var3));
                float var17 = -(var16 * var10 - var15 * var11);
                float var18 = -(var15 * var10 + var16 * var11);
                float var19 = (float)(Math.atan2(var17, var18) * (double)57.29578f);
                float var20 = (float)Math.toRadians(var19);
                float var21 = var4 / 2.0f;
                float var22 = var21 * rfU_2.id_break(var20) + var6;
                float var23 = var21 * rfU_2.id_class(var20) + var7;
                var2.id_class();
                var2.id_class((double)var22, (double)var23, 0.0);
                this.id_class(var2, var8, var14, var5, 0.0f, 0.0f);
                if (var14 instanceof iB_2) {
                    iB_2 var24 = (iB_2)var14;
                    if (((rrIk_1)this.id_break[4]).id_class().booleanValue()) {
                        this.id_class(var2, var24, var5, 0.0f, var12);
                    }
                }
                var2.id_class(rje_3.id_case.id_byte(var19 + 90.0f));
                this.id_class(var2, var14, var5);
                var2.id_break();
            }
            boolean var25 = ((rrIk_1)this.id_break[9]).id_class();
            if (var25) {
                GL11.glBlendFunc((int)770, (int)1);
            }
            rrfD_2.id_catch((lD_2)rrfD_2.id_class[7]);
            if (var25) {
                GL11.glBlendFunc((int)770, (int)771);
            }
            rrfD_2.id_private((lD_2)rrfD_2.id_class[8]);
            var8.id_byte(id_strictfp);
        }
    }

    private void id_class(Ml_1 var1, an_3 var2, float var3) {
        rVr_1 var4 = this.id_class(var2);
        rrfD_2.id_break(var1, (lD_2)rrfD_2.id_class[7], var3, var4.id_class(), var4.id_break(), var4.id_byte(), var4.id_byte());
    }

    private void id_class(Ml_1 var1, iB_2 var2, float var3, float var4, float var5) {
        float var6 = rrjZ_2.id_class(var2);
        float var7 = var3 / 2.0f;
        float var8 = var4 - var7 - 5.0f;
        float var9 = 1.0f;
        float var10 = var3 + 2.0f;
        float var11 = var10 * var6;
        rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[8], var8 - 0.5f, var5 - 0.5f, var9 + 1.0f, var10 + 1.0f, ColorHelper.id_break(rrZF.e_, Math.min(225, 80)));
        rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[8], var8, var5 + var10 - var11, var9, var11, ColorHelper.id_break(ColorHelper.id_class(var2), 0.5f));
    }

    private boolean id_class(an_3 var1, CheckGroup var2) {
        return var1 != null && var1 != (cb_3)Pointers.id_import.id_class[57] && var1.Pu() ? rrff_3.id_class(var1, var2) : false;
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_else();
        super.id_throws(var1);
        ((Set)this.id_break[10]).clear();
    }

    private void id_else() {
        if (this.id_break == null) {
            this.id_break = new Object[13];
            this.id_break[12] = Float.valueOf(0.0f);
        }
    }

    static {
        Object[] var0 = new Object[]{new rqO_2("celestial/images/pointer.png")};
        id_byte = var0;
    }
}

