/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.render;

import celestial.Aw_1;
import celestial.Hh_1;
import celestial.Ml_1;
import celestial.Qw_1;
import celestial.VZ;
import celestial.Wp_1;
import celestial.Y;
import celestial.aI_2;
import celestial.an_3;
import celestial.cG_2;
import celestial.cb_3;
import celestial.eY_2;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.iB_2;
import celestial.lD_2;
import celestial.manager.FontManager;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rAB;
import celestial.rLY;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rjV_2;
import celestial.rji_3;
import celestial.rpm_3;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrTr_1;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrfL_2;
import celestial.rrfa_3;
import celestial.rrff_3;
import celestial.rrfo_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrjZ_2;
import celestial.rrnE_2;
import celestial.rsE_2;
import celestial.rxJ_2;
import celestial.setting.CheckGroup;
import celestial.setting.Setting;
import celestial.util.ColorHelper;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.lang3.tuple.Pair;

public class Esp2D
extends Module {
    public Object[] id_break;
    public static Object[] id_byte;

    public Esp2D() {
        super("2D ESP", "WallHack \u043d\u0430 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0435\u0439", Category.RENDER);
        this.id_while();
        rrIk_1 var5 = new rrIk_1("\u0411\u043e\u043a\u0441", false);
        this.id_break[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435", true);
        this.id_break[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u041f\u0440\u0435\u0434\u043c\u0435\u0442", true);
        this.id_break[2] = var7;
        rrIk_1 var8 = new rrIk_1("\u041d\u0435\u0439\u043c\u0442\u0435\u0433", true);
        this.id_break[3] = var8;
        rrIk_1 var9 = (rrIk_1)new rrIk_1("\u041f\u0438\u043d\u0433", false).id_class(() -> ((rrIk_1)this.id_break[3]).id_class());
        this.id_break[4] = var9;
        rrIk_1 var10 = new rrIk_1("\u0411\u0440\u043e\u043d\u044e", true);
        this.id_break[5] = var10;
        rrIk_1 var11 = (rrIk_1)new rrIk_1("\u0417\u0430\u0447\u0430\u0440\u043e\u0432\u0430\u043d\u0438\u044f", true).id_class(() -> ((rrIk_1)this.id_break[5]).id_class());
        this.id_break[6] = var11;
        rrIk_1 var12 = new rrIk_1("\u042d\u0444\u0444\u0435\u043a\u0442\u044b", true);
        this.id_break[7] = var12;
        rrIk_1 var13 = new rrIk_1("\u041f\u0440\u0435\u0432\u044c\u044e \u0448\u0430\u043b\u043a\u0435\u0440\u0430", true);
        this.id_break[8] = var13;
        rrIm_1 var14 = (rrIm_1)new rrIm_1("\u0428\u0438\u0440\u0438\u043d\u0430", Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(2.0f), Float.valueOf(0.5f)).id_class(() -> {
            this.id_while();
            return ((rrIk_1)this.id_break[0]).id_class() != false || ((rrIk_1)this.id_break[1]).id_class() != false;
        });
        this.id_break[9] = var14;
        CheckGroup var15 = new CheckGroup().id_catch(true).id_case(true).id_throws(true).id_private(true).id_break(true).id_implements(false).id_byte(false).id_protected(false).id_class(true);
        this.id_break[10] = var15;
        rrfL_2 var10001 = new rrfL_2();
        rrfL_2 var16 = var10001.id_class(eY_2.id_class, eY_2.id_volatile, eY_2.id_new, eY_2.id_public, eY_2.id_this, eY_2.id_synchronized, eY_2.id_continue, eY_2.id_import, eY_2.id_implements);
        this.id_break[11] = var16;
        Int2ObjectOpenHashMap var17 = new Int2ObjectOpenHashMap();
        this.id_break[12] = var17;
        rrTr_1 var18 = new rrTr_1();
        this.id_break[13] = var18;
        Setting[] var19 = new Setting[3];
        var19[0] = new rrIc_1("\u0412\u044b\u0431\u043e\u0440 \u0446\u0435\u043b\u0435\u0439", ((CheckGroup)this.id_break[10]).id_byte());
        int var10003 = 1;
        String var10006 = "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c";
        var19[var10003] = new rrIc_1(var10006, (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[5], (rrIk_1)this.id_break[6], (rrIk_1)this.id_break[7], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[8]);
        var19[2] = (rrIm_1)this.id_break[9];
        this.id_class(var19);
    }

    private void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
        rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[7], var2, var3, var4, var5, var6, var7);
    }

    private void id_class(Ml_1 var1, iB_2 var2, rrZO var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
        boolean var15;
        String var12 = rrjZ_2.id_class(var8);
        float var13 = 0.5f;
        this.id_class(var1, var4 - var13, var5 - var13, var6 + var13 * 2.0f, var7 + var13 * 2.0f, var11, var11);
        this.id_class(var1, var4, var5 + var7 - var7 * var8, var6, var7 * var8, var9, var10);
        boolean var14 = var2.u_() < var2.SK() * 0.9f;
        boolean bl = var15 = var2 == (cb_3)Esp2D.id_import.id_class[57] || ((cb_3)Esp2D.id_import.id_class[57]).id_int(var2) < 900.0;
        if (var14 && var15) {
            var3.id_byte(var1, id_strictfp, var12, var4 + var6 / 2.0f, var5 + var7 - var7 * var8 - 3.0f, rrZF.d_, false, false);
        }
    }

    private void id_class(Ml_1 var1, rrZO var2, rgP_2 var3, float var4, float var5, float var6, float var7, int var8) {
        rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[7], var4, var5, var6, var7, var8);
        var2.id_break(var1, var3, (double)(var4 + 1.0f), (double)(var5 + 2.0f), rrZF.d_, 255);
    }

    @EventTarget(id_class=-200)
    public void id_class(rrnE_2 var1) {
        this.id_while();
        ((rrTr_1)this.id_break[13]).id_class();
        boolean var2 = ((rrIk_1)this.id_break[8]).id_class();
        if (!((Int2ObjectMap)this.id_break[12]).isEmpty() || var2 && ((rrTr_1)this.id_break[13]).id_throws()) {
            Ml_1 var3 = var1.id_class();
            rrZO var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_break();
            rjV_2 var5 = ((Hh_1)Esp2D.id_import.id_class[16]).id_volatile();
            float var6 = var1.id_break();
            if (var2 && ((rrTr_1)this.id_break[13]).id_throws()) {
                ((rrTr_1)this.id_break[13]).id_class(var5, var6);
            }
            int var7 = ColorHelper.id_class(0.0f);
            int var8 = ColorHelper.id_class(90.0f);
            int var9 = ColorHelper.id_class(180.0f);
            int var10 = ColorHelper.id_class(270.0f);
            float var11 = ((Float)((rrIm_1)this.id_break[9]).id_byte()).floatValue();
            var3.id_class();
            var4.id_break(id_strictfp);
            rrfD_2.id_throws((lD_2)rrfD_2.id_class[7]);
            boolean var12 = ((rrIk_1)this.id_break[0]).id_class();
            boolean var13 = ((rrIk_1)this.id_break[3]).id_class();
            boolean var14 = ((rrIk_1)this.id_break[4]).id_class();
            boolean var15 = ((rrIk_1)this.id_break[5]).id_class();
            boolean var16 = ((rrIk_1)this.id_break[7]).id_class();
            boolean var17 = ((rrIk_1)this.id_break[1]).id_class();
            boolean var18 = ((rrIk_1)this.id_break[2]).id_class();
            for (an_3 var20 : ((Int2ObjectMap)this.id_break[12]).values()) {
                rji_3 var21 = rrfa_3.id_class(var5, var20, var6);
                float var22 = var21.id_class();
                float var23 = var21.id_break();
                float var24 = var21.id_byte();
                float var25 = var21.id_protected();
                float var26 = var24 - var22;
                float var27 = var25 - var23;
                float var28 = 0.0f;
                float var29 = 0.0f;
                float var30 = 0.0f;
                float var31 = 0.0f;
                float var32 = 0.0f;
                rgN_2 var33 = null;
                if (rrff_3.id_class(var20)) {
                    cG_2 var38;
                    Aw_1 var40;
                    var33 = new rgN_2("");
                    var33.id_class(rrjZ_2.id_byte(var20));
                    if (var13) {
                        var29 = var4.id_class() + 2;
                    }
                    if (var20 instanceof iB_2) {
                        iB_2 var34 = (iB_2)var20;
                        float var35 = var34.Sd();
                        var32 = rrjZ_2.id_class(var34);
                        String var36 = String.valueOf((Object)rgF_2.GRAY) + " | " + String.valueOf((Object)rgF_2.RED) + (int)var34.u_() + "\u00f8";
                        Object var37 = "";
                        if (var35 > 0.0f) {
                            var37 = String.valueOf((Object)rgF_2.GRAY) + " | " + String.valueOf((Object)rgF_2.YELLOW) + (int)var35 + "\u00f9";
                        }
                        var33.id_break(var36 + (String)var37);
                    }
                    if (var14 && var20 instanceof cG_2 && (var40 = (var38 = (cG_2)var20).id_continue()) != null) {
                        var33.id_break(String.valueOf((Object)rgF_2.GRAY) + " | " + String.valueOf((Object)rgF_2.WHITE) + var40.id_byte() + "ms");
                    }
                    var28 = var4.id_break(var33.getString()) + 2.0f;
                    var30 = var22 + var26 / 2.0f - var28 / 2.0f - 1.0f;
                    var31 = var23 - var29 - 1.5f;
                }
                if (var12) {
                    this.id_class(var3, var22, var23, var24, var25, var26, var27, var11, var7, var8, var9, var10, (Integer)id_byte[0]);
                }
                if (var33 != null && var13 && !((rrTr_1)this.id_break[13]).id_class(var20.V())) {
                    this.id_class(var3, var4, var33, var30, var31, var28, var29, (Integer)id_byte[0]);
                }
                if (!(var20 instanceof iB_2)) continue;
                iB_2 var39 = (iB_2)var20;
                if (var18) {
                    this.id_class(var3, var39, var4, rpm_3.values(), var22, var24, var25);
                }
                if (var15) {
                    this.id_break(var3, var39, var4, var22, var24, var31);
                }
                if (var16) {
                    this.id_class(var3, var39, var4, var22, var23, var24);
                }
                if (!var17) continue;
                this.id_class(var3, var39, var4, var22 - var11 - 1.5f, var23, var11, var27, var32, var7, var10, (Integer)id_byte[0]);
            }
            rrfD_2.id_private((lD_2)rrfD_2.id_class[7]);
            var4.id_byte(id_strictfp);
            ((rrTr_1)this.id_break[13]).id_class(var3);
            var3.id_break();
        }
    }

    public boolean id_class(an_3 var1) {
        this.id_while();
        aI_2<?> var2 = var1.BC();
        if (var2 != aI_2.id_break && var2 != aI_2.Q) {
            return !this.aJ_() || ((rrIk_1)this.id_break[3]).id_class() == false || !((Int2ObjectMap)this.id_break[12]).containsKey(var1.V());
        }
        return true;
    }

    private void id_class(Ml_1 var1, iB_2 var2, rrZO var3, rpm_3[] var4, float var5, float var6, float var7) {
        float var8 = var5 + (var6 - var5) / 2.0f;
        float var9 = var7 + 3.0f;
        rpm_3[] var10 = var4;
        int var11 = var4.length;
        for (int var12 = 0; var12 < var11; ++var12) {
            rpm_3 var13 = var10[var12];
            rdn_3 var14 = var2.id_protected(var13);
            if (var14.id_class()) continue;
            StringBuilder var15 = new StringBuilder(var14.id_continue().id_byte());
            if (var14.id_char() > 1) {
                var15.append(" ").append((Object)rgF_2.RED).append("x").append(var14.id_char());
            }
            var3.id_byte(var1, id_strictfp, var15.toString(), var8, var9, rrZF.d_, false, false);
            var9 += 6.0f;
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_while();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            ((Int2ObjectMap)this.id_break[12]).clear();
            ((rrTr_1)this.id_break[13]).id_break();
            for (Int2ObjectMap.Entry var3 : ((gm_3)Esp2D.id_import.id_class[56]).id_return().int2ObjectEntrySet()) {
                rxJ_2 var7;
                rsE_2 var6;
                rdb_3 rdb_32;
                an_3 var4 = (an_3)var3.getValue();
                int var5 = var3.getIntKey();
                if (this.id_break(var4)) {
                    ((Int2ObjectMap)this.id_break[12]).put(var5, (Object)var4);
                }
                if (!(var4 instanceof rsE_2) || !((rdb_32 = (var6 = (rsE_2)var4).id_protected().id_break()) instanceof rxJ_2) || !((var7 = (rxJ_2)rdb_32).id_catch() instanceof Wp_1)) continue;
                ((rrTr_1)this.id_break[13]).id_class(var6);
            }
            ((rrTr_1)this.id_break[13]).id_byte();
        }
    }

    private void id_class(Ml_1 var1, iB_2 var2, rrZO var3, float var4, float var5, float var6) {
        Collection<rLY> var7 = var2.So();
        if (!var7.isEmpty()) {
            String var8 = rAB.id_break(var7);
            float var9 = var4 + (var6 - var4) + 2.0f;
            float var10 = var5 + 1.0f;
            var3.id_class(var1, var8, (double)var9, (double)var10, rrZF.d_, 10, false, false);
        }
    }

    private void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12) {
        rrfD_2.id_byte(var1, (lD_2)rrfD_2.id_class[7], var2 + var8, var3, var6 - var8 * 2.0f, var8, var9, var10);
        rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[7], var2, var3, var8, var7, var9, var12);
        rrfD_2.id_byte(var1, (lD_2)rrfD_2.id_class[7], var2 + var8, var5 - var8, var6 - var8 * 2.0f, var8, var12, var11);
        rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[7], var4 - var8, var3, var8, var7, var10, var11);
    }

    private void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13) {
        float var14 = 0.5f;
        this.id_class(var1, var2 - var14, var3 - var14, var4 + var14, var5 + var14, var6 + var14 * 2.0f, var7 + var14 * 2.0f, var8 + var14 * 2.0f, var13, var13, var13, var13);
        this.id_class(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    private void id_break(Ml_1 var1, iB_2 var2, rrZO var3, float var4, float var5, float var6) {
        this.id_while();
        ArrayList<rdn_3> var7 = new ArrayList<rdn_3>();
        rdn_3 var8 = var2.ss();
        rdn_3 var9 = var2.Sn();
        if (!var8.id_class()) {
            var7.add(var8);
        }
        for (rdn_3 var11 : var2.PV()) {
            if (var11.id_class()) continue;
            var7.add(var11);
        }
        if (!var9.id_class()) {
            var7.add(var9);
        }
        int var23 = var7.size();
        int var24 = 10;
        float var12 = var4 + (var5 - var4) / 2.0f - (float)(var24 * (var23 - 1)) / 2.0f - 4.5f;
        float var13 = var12 + (float)(var24 * (var23 - 1)) + 5.0f;
        for (int var14 = 0; var14 < var7.size(); ++var14) {
            rdn_3 var15 = (rdn_3)var7.get(var14);
            rdb_3 var16 = var15.id_break();
            float var17 = var12 + (float)(var14 * var24);
            float var18 = var6 - 9.0f;
            rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[7], var15, var17, var18, var16 == rdy_3.kL, (rrfq_3)((Object)rrfp_3.id_class[1]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[3]), 0.5f, 6.5f, 8);
            if (((rrIk_1)this.id_break[6]).id_class().booleanValue() && (rrfq_3)((Object)rrfp_3.id_class[1]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) && (rrfq_3)((Object)rrfp_3.id_class[1]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[3])) {
                Pair<String, Integer> var19 = ((rrfL_2)this.id_break[11]).id_class(var15);
                String var20 = (String)var19.getLeft();
                int var21 = (Integer)var19.getRight();
                float var22 = var18 - (float)(var21 * 5) + 1.0f;
                var3.id_class(var1, var20, (double)(var17 + 0.5f), (double)var22, rrZF.d_, 10, false, false);
            }
            if (var8.id_char() > 1) {
                var3.id_byte(var1, id_strictfp, "x" + var8.id_char(), var12 + 5.0f, var18 + 5.0f, rrZF.d_, false, false);
            }
            if (var9.id_char() <= 1) continue;
            var3.id_byte(var1, id_strictfp, "x" + var9.id_char(), var13, var18 + 5.0f, rrZF.d_, false, false);
        }
    }

    private boolean id_break(an_3 var1) {
        this.id_while();
        if (var1 == null) {
            return false;
        }
        if (var1 == (cb_3)Esp2D.id_import.id_class[57] && ((Qw_1)Esp2D.id_import.id_class[20]).id_volatile() == VZ.FIRST_PERSON) {
            return false;
        }
        if (!var1.Pu()) {
            return false;
        }
        aI_2<?> var2 = var1.BC();
        if (var2 == aI_2.id_break || var2 == aI_2.Q) {
            return false;
        }
        if (!rrff_3.id_class(var1, (CheckGroup)this.id_break[10])) {
            return false;
        }
        return rrfo_3.id_class(var1);
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_while();
        super.id_throws(var1);
        ((Int2ObjectMap)this.id_break[12]).clear();
        ((rrTr_1)this.id_break[13]).id_protected();
    }

    private void id_while() {
        if (this.id_break == null) {
            this.id_break = new Object[14];
        }
    }

    static {
        Object[] var0 = new Object[]{-1275068416};
        id_byte = var0;
    }
}

