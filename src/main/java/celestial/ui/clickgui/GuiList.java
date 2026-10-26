/*
 * Decompiled with CFR 0.152.
 */
package celestial.ui.clickgui;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrtF_2;
import celestial.rrtI_2;
import celestial.rrtN_2;
import celestial.rrtm_3;
import celestial.rrtn_3;
import celestial.rrtu_3;
import celestial.rrtw_3;
import celestial.rruv_1;
import celestial.rrwB_2;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GuiList
extends rrtw_3 {
    public Object[] id_throws;

    public GuiList(rrtN_2 var1, rrIc_1 var2, float var3, float var4, float var5, float var6) {
        super(var1, var2, var3, var4, var5, var6);
        ArrayList var13;
        this.id_instanceof();
        this.id_throws[0] = var13 = new ArrayList();
        for (rrIk_1 var8 : var2.id_class()) {
            ((List)this.id_throws[0]).add(new rrwB_2(var8));
        }
    }

    @Override
    public void id_class(Ml_1 var1, rrtI_2 var2, int var3, int var4) {
        this.id_instanceof();
        float var5 = var2.id_break();
        float var6 = var2.id_byte();
        float var7 = var2.id_throws();
        float var8 = var2.id_class();
        AnimValue var9 = this.id_return();
        float var10 = var9.id_byte();
        int var11 = (int)(255.0f * var10);
        GuiList.id_class(var1, this, var5, var6, var7, var8);
        rrtF_2.id_class(var1, (rrtm_3)this, var5 + var7 - 4.0f, var6 + 4.5f, 1.0f, 180.0f + var10 * 180.0f, rrZF.d_, 255);
        float var12 = 10.0f * var10 + 3.0f;
        for (rrwB_2 var14 : this.id_while()) {
            float var15 = var5 + 2.0f;
            float var16 = var6 + var12;
            var14.id_throws().id_class(var14.id_case().id_private());
            var14.id_break().id_class(var14.id_protected());
            float var17 = var14.id_throws().id_byte();
            float var18 = var14.id_break().id_byte();
            if (!this.id_return().id_case()) continue;
            int var19 = ColorHelper.id_class(rrZF.n_, rrZF.d_, var18);
            rrZO var20 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally();
            var14.id_class(new rruv_1(var5, var16 - 3.0f, var7, var20.id_class() + 6));
            rrtF_2.id_protected(var1, this, var20, var14.id_byte(), var15, var16, var19, (int)((float)var11 * var10 * var17));
            Float var25 = Float.valueOf(var12 += 10.0f * var10 * var17);
            this.id_throws[1] = var25;
        }
        this.id_class(var1, var5, var6);
    }

    @Override
    public boolean id_class(rrtu_3 var1, rrtI_2 var2, float var3, float var4, int var5, int var6, int var7) {
        if (!this.id_return().id_case()) {
            return false;
        }
        for (rrwB_2 var9 : this.id_while()) {
            if (var7 != 0 || !var9.id_class().id_break(var5, var6)) continue;
            var9.id_case().id_class(!var9.id_protected(), false, true);
            return true;
        }
        return false;
    }

    private void id_class(Ml_1 var1, float var2, float var3) {
        List<rrIk_1> var4 = this.id_while().stream().filter(rrwB_2::id_protected).map(rrwB_2::id_case).sorted(Comparator.comparingInt(var0 -> -((int)((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally().id_break(var0.id_throws())))).toList();
        String var5 = var4.isEmpty() ? "\u041d\u0435\u0442\u0443 :(" : var4.get(0).id_throws();
        rrtF_2.id_class(var1, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally(), var5, var2 + 2.0f, var3 + 3.0f, rrZF.d_, this.id_class(255));
    }

    @Override
    public float id_class(float var1, float var2) {
        this.id_instanceof();
        return ((Float)this.id_throws[1]).floatValue() - 2.0f;
    }

    private static int id_break(int var0) {
        return Integer.rotateLeft(var0, 16) ^ 0x310375B3;
    }

    private void id_instanceof() {
        if (this.id_throws == null) {
            Object[] var1 = this.id_throws = new Object[2];
            var1[1] = Float.valueOf(0.0f);
        }
    }

    public List<rrwB_2> id_while() {
        this.id_instanceof();
        return ((List)this.id_throws[0]).stream().filter(var0 -> var0.id_case().id_private() || var0.id_throws().id_case()).toList();
    }

    @Override
    public float id_public() {
        this.id_instanceof();
        rrZO var1 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally();
        return (float)(((List)this.id_throws[0]).stream().mapToDouble(var1x -> var1.id_break(var1x.id_byte())).max().orElse(0.0) + 10.0);
    }

    @Override
    public List<? extends rrtn_3> id_protected() {
        return this.id_while();
    }
}

