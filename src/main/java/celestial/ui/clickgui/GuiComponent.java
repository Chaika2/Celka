/*
 * Decompiled with CFR 0.152.
 */
package celestial.ui.clickgui;

import celestial.Ml_1;
import celestial.module.Category;
import celestial.rdn_3;
import celestial.rrZN;
import celestial.rrZT;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.util.MinecraftAccessor;

public abstract class GuiComponent
implements MinecraftAccessor {
    public rdn_3 id_byte() {
        return null;
    }

    public boolean id_class(char var1, int var2) {
        return false;
    }

    public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
        rrZT var7;
        rrZN rrZN2 = this.id_class();
        boolean var6 = rrZN2 instanceof rrZT && (var7 = (rrZT)((Object)rrZN2)).id_case().id_finally();
        return this.id_protected().id_break(var2, var3) && !var6;
    }

    public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
    }

    public boolean id_class(int var1, int var2, int var3) {
        return false;
    }

    public void id_class(Category var1, Category var2) {
    }

    public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
        return true;
    }

    public abstract rrZN id_class();

    public void id_break(int var1, int var2, int var3) {
    }

    public void id_break(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
    }

    public abstract rruv_1 id_protected();

    public void id_final() {
    }

    public void am_() {
    }

    public void an_() {
    }

    public void al_() {
    }
}

