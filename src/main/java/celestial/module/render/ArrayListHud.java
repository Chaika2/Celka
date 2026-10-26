/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.render;

import celestial.Ml_1;
import celestial.OH;
import celestial.Qw_1;
import celestial.event.EventTarget;
import celestial.lD_2;
import celestial.manager.FontManager;
import celestial.module.Category;
import celestial.module.Module;
import celestial.module.render.Esp2D;
import celestial.module.render.Hud;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrLP;
import celestial.rrQX;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrnB_2;
import celestial.rrqA_2;
import celestial.rrqL_2;
import celestial.setting.Setting;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class ArrayListHud
extends Module {
    public static Object[] id_break;
    public Object[] id_byte;

    public ArrayListHud() {
        super("Array List", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0441\u043f\u0438\u0441\u043e\u043a \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u043d\u044b\u0445\n\u043c\u043e\u0434\u0443\u043b\u0435\u0439", Category.RENDER);
        ArrayList var5;
        this.id_continue();
        this.id_byte[0] = var5 = new ArrayList();
        rrIk_1 var6 = new rrIk_1("Combat", true);
        this.id_byte[1] = var6;
        rrIk_1 var7 = new rrIk_1("Movement", true);
        this.id_byte[2] = var7;
        rrIk_1 var8 = new rrIk_1("Render", false);
        this.id_byte[3] = var8;
        rrIk_1 var9 = new rrIk_1("Player", true);
        this.id_byte[4] = var9;
        rrIk_1 var10 = new rrIk_1("Util", true);
        this.id_byte[5] = var10;
        rrIk_1 var11 = new rrIk_1("\u0421\u0432\u0435\u0447\u0435\u043d\u0438\u0435", true);
        this.id_byte[6] = var11;
        rrIk_1 var12 = (rrIk_1)new rrIk_1("\u041c\u0430\u043b\u0435\u043d\u044c\u043a\u0438\u0435 \u0431\u0443\u043a\u0432\u044b", false).id_class("lowercase", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_continue();
            Boolean var3 = (Boolean)var2.getLeft();
            ((List)this.id_byte[0]).forEach(var1x -> var1x.id_break(var3));
            this.id_else();
        });
        this.id_byte[7] = var12;
        rrIm_1 var13 = new rrIm_1("\u0421\u043c\u0435\u0449\u0435\u043d\u0438\u0435", Float.valueOf(2.0f), Float.valueOf(0.0f), Float.valueOf(10.0f), Float.valueOf(1.0f));
        this.id_byte[8] = var13;
        this.id_class(new rrIc_1("\u041a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u0438", (rrIk_1)this.id_byte[1], (rrIk_1)this.id_byte[2], (rrIk_1)this.id_byte[3], (rrIk_1)this.id_byte[4], (rrIk_1)this.id_byte[5]), (rrIk_1)this.id_byte[7], (rrIk_1)this.id_byte[6], (rrIm_1)this.id_byte[8]);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(new OH<Object>(rrLP.class, var1 -> this.id_class((rrLP)var1)));
    }

    public void id_class(rrLP var1) {
        this.id_continue();
        for (Module var3 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().g()) {
            ((List)this.id_byte[0]).add(new rrqA_2(this, var3));
        }
        this.id_else();
    }

    @EventTarget
    public void id_class(rrnB_2 var1) {
        this.id_continue();
        if (!((Qw_1)ArrayListHud.id_import.id_class[20]).R && !((List)this.id_byte[0]).isEmpty()) {
            float var2 = 10.0f;
            float var3 = ((Float)((rrIm_1)this.id_byte[8]).id_byte()).floatValue();
            float var4 = ((Float)((rrIm_1)this.id_byte[8]).id_byte()).floatValue() + 5.0f;
            Ml_1 var5 = var1.id_class();
            float var6 = id_const.id_volatile();
            float var10 = var2 / 2.5f;
            int var12 = ColorHelper.id_class(0.0f);
            ArrayList<rrqA_2> var13 = new ArrayList<rrqA_2>();
            for (rrqA_2 var15 : (List)this.id_byte[0]) {
                var15.id_class(this.id_class((Module)var15.id_class[0]));
                if (!((AnimValue)var15.id_class[1]).id_case()) continue;
                var13.add(var15);
            }
            var5.id_class();
            if (((rrIk_1)this.id_byte[6]).id_class().booleanValue()) {
                for (rrqA_2 var24 : var13) {
                    float var8 = ((Float)var24.id_class[3]).floatValue();
                    float var7 = var6 + 120.0f - var8 - var4;
                    int var11 = ColorHelper.id_class(-var3);
                    float var9 = var8 + 4.0f;
                    rrfD_2.id_class(var5, var7 -= 120.0f * var24.id_byte(), var3, var9 + 2.0f, var2 + 1.0f, 12, var11);
                    var3 += var2 * var24.id_byte();
                }
                var3 = ((Float)((rrIm_1)this.id_byte[8]).id_byte()).floatValue();
            }
            rrfD_2.id_throws((lD_2)id_break[0]);
            ((rrZO)id_break[1]).id_break(id_strictfp);
            for (rrqA_2 var25 : var13) {
                float var19 = ((Float)var25.id_class[3]).floatValue();
                float var17 = var6 + 120.0f - var19 - var4;
                int var21 = ColorHelper.id_class(-var3);
                float var20 = var19 + 4.0f;
                rrfD_2.id_class(var5, (lD_2)id_break[0], var17 -= 120.0f * var25.id_byte(), var3, var20, var2, ColorHelper.id_break(rrZF.n_, (int)(225.0f * var25.id_byte())));
                rrfD_2.id_class(var5, (lD_2)id_break[0], var17 + var20, var3, 0.5f, var2, var12, var21);
                var12 = var21;
                ((rrZO)id_break[1]).id_break(var5, id_strictfp, (String)var25.id_class[2], var17 + 2.0f, var3 + var10, var21, false, false);
                var3 += var2 * var25.id_byte();
            }
            rrfD_2.id_private((lD_2)id_break[0]);
            ((rrZO)id_break[1]).id_byte(id_strictfp);
            var5.id_break();
        }
    }

    private boolean id_class(Module var1) {
        this.id_continue();
        if (!var1.aJ_()) {
            return false;
        }
        switch (((int[])rrqL_2.id_class[0])[var1.id_int().ordinal()]) {
            case 1: {
                return ((rrIk_1)this.id_byte[1]).id_class();
            }
            case 2: {
                return ((rrIk_1)this.id_byte[2]).id_class();
            }
            case 3: {
                return ((rrIk_1)this.id_byte[3]).id_class() != false || var1 instanceof Hud || var1 instanceof Esp2D;
            }
            case 4: {
                return ((rrIk_1)this.id_byte[4]).id_class();
            }
            case 5: {
                return ((rrIk_1)this.id_byte[5]).id_class();
            }
        }
        return false;
    }

    private void id_continue() {
        if (this.id_byte == null) {
            this.id_byte = new Object[9];
        }
    }

    private void id_else() {
        this.id_continue();
        ((List)this.id_byte[0]).sort(Comparator.comparingDouble(var0 -> -var0.id_protected()));
    }

    static {
        Object[] var0 = new Object[]{new lD_2(256), FontManager.id_class("montserrat", 13.0f, false), Float.valueOf(-1.0842022E-19f), 120};
        id_break = var0;
    }
}

