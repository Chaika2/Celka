/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.C_class;
import celestial.C_throws;
import celestial.PI;
import celestial.Pf_1;
import celestial.Sl_1;
import celestial.Y;
import celestial.aI_2;
import celestial.an_3;
import celestial.bE_2;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.iB_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rrFK;
import celestial.rrIk_1;
import celestial.rrLM;
import celestial.rrfZ_2;
import celestial.rrfu_3;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import celestial.util.MinecraftAccessor;
import java.util.HashMap;

public class BaseFinder
extends Module {
    public Object[] id_break;

    public BaseFinder() {
        super("Base Finder", "\u0423\u0442\u0438\u043b\u0438\u0442\u0430\u0440\u043d\u044b\u0439 \u043c\u043e\u0434\u0443\u043b\u044c \u0434\u043b\u044f \u043f\u043e\u0438\u0441\u043a\u0430\n\u0431\u0430\u0437", Category.UTIL);
        this.id_goto();
        rrIk_1 var5 = new rrIk_1("\u0421\u0443\u043d\u0434\u0443\u043a\u0438", true);
        this.id_break[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0428\u0430\u043b\u043a\u0435\u0440\u0430", true);
        this.id_break[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u0411\u043e\u0447\u043a\u0438", true);
        this.id_break[2] = var7;
        rrIk_1 var8 = new rrIk_1("\u041d\u0430\u043a\u043e\u0432\u0430\u043b\u044c\u043d\u0438", false);
        this.id_break[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u0421\u0442\u043e\u043b\u044b \u0437\u0430\u0447\u0430\u0440\u043e\u0432\u0430\u043d\u0438\u044f", false);
        this.id_break[4] = var9;
        rrIk_1 var10 = new rrIk_1("\u041f\u0435\u0447\u043a\u0438", false);
        this.id_break[5] = var10;
        rrIk_1 var11 = new rrIk_1("\u0418\u0437\u0431\u0435\u0433\u0430\u0442\u044c \u0432\u0440\u0430\u0436\u0434\u0435\u0431\u043d\u044b\u0445\n\u0441\u0443\u0449\u0435\u0441\u0442\u0432", true);
        this.id_break[6] = var11;
        this.id_class(new GroupSetting("\u0422\u0440\u0438\u0433\u0433\u0435\u0440\u044b", (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[5]), new GroupSetting("\u0414\u0440\u0443\u0433\u043e\u0435", new Setting[]{(rrIk_1)this.id_break[6]}));
    }

    public void id_class(int var1) {
        Pf_1 var4;
        C_class var2 = C_throws.id_byte();
        PI var3 = var2.id_native().id_protected();
        if (var3 != null && (var4 = var3.id_class()) != (Pf_1)((Object)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[2])) {
            ((cb_3)BaseFinder.id_import.id_class[57]).id_case("/hub");
            var2.id_default().id_class(new Sl_1(var4.id_class() + var3.id_break(), var1));
        }
    }

    @EventTarget
    public void id_class(rrLM var1) {
        this.id_byte(false);
    }

    @Override
    public void id_class(boolean var1) {
        this.id_goto();
        super.id_class(var1);
        HashMap<bE_2, rrIk_1> var2 = new HashMap<bE_2, rrIk_1>();
        var2.put((bE_2)((Object)bE_2.staticFields41d67a8911663c568d38045d1ac26747[0]), (rrIk_1)this.id_break[0]);
        var2.put((bE_2)((Object)bE_2.staticFields41d67a8911663c568d38045d1ac26747[1]), (rrIk_1)this.id_break[1]);
        var2.put((bE_2)((Object)bE_2.staticFields41d67a8911663c568d38045d1ac26747[4]), (rrIk_1)this.id_break[2]);
        var2.put((bE_2)((Object)bE_2.staticFields41d67a8911663c568d38045d1ac26747[2]), (rrIk_1)this.id_break[3]);
        var2.put((bE_2)((Object)bE_2.staticFields41d67a8911663c568d38045d1ac26747[3]), (rrIk_1)this.id_break[4]);
        var2.put((bE_2)((Object)bE_2.staticFields41d67a8911663c568d38045d1ac26747[5]), (rrIk_1)this.id_break[5]);
        C_throws.id_byte().id_volatile().id_class(() -> this.id_super(), var2);
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_goto();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) && ((rrIk_1)this.id_break[6]).id_class().booleanValue() && !rrfZ_2.id_byte() && ((cb_3)BaseFinder.id_import.id_class[57]).Pu() && this.id_super()) {
            boolean var2 = false;
            for (an_3 var4 : ((gm_3)BaseFinder.id_import.id_class[56]).id_byte()) {
                iB_2 var5;
                if (!(var4 instanceof iB_2) || !(var5 = (iB_2)var4).BC().id_throws().id_private() || var5.BC().equals(aI_2.id_else) || !(var5.id_int((cb_3)BaseFinder.id_import.id_class[57]) <= 100.0) || !var5.Pu() || !var5.id_while((cb_3)BaseFinder.id_import.id_class[57])) continue;
                var2 = true;
                break;
            }
            if (var2) {
                this.id_class(120);
                rrfu_3.id_byte(rrfu_3.id_class(this) + "\u041d\u0430\u0439\u0434\u0435\u043d\u043e \u0432\u0440\u0430\u0436\u0434\u0435\u0431\u043d\u043e\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u043e, \u043f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434\u0438\u043c");
            }
        }
    }

    public void id_class(rVi_1 var1) {
        rVi_1 var2 = rrfu_3.id_break(this).id_class(rgF_2.GRAY).id_class(var1);
        rrfu_3.id_class(var2);
        MinecraftAccessor.a_(var2.id_byte(), false);
    }

    @EventTarget
    public void id_class(rrFK var1) {
        this.id_byte(false);
    }

    private static int id_break(int var0) {
        return Integer.rotateLeft(var0, 16) ^ 0xE4E9002A;
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        if (this.aJ_()) {
            C_throws.id_byte().id_volatile().id_private();
        }
    }

    private void id_goto() {
        if (this.id_break == null) {
            this.id_break = new Object[7];
        }
    }

    public void id_new() {
        if (this.aJ_()) {
            String var1 = rrfu_3.id_class(this) + "\u0414\u043e\u0441\u0442\u0438\u0433\u043d\u0443\u0442\u0430 \u0433\u0440\u0430\u043d\u0438\u0446\u0430 \u043c\u0438\u0440\u0430";
            rrfu_3.id_byte(var1);
            MinecraftAccessor.a_(var1, false);
            this.id_byte(true);
        }
    }

    private boolean id_super() {
        Pf_1 var2;
        if (C_throws.id_byte().id_default().id_throws()) {
            return false;
        }
        PI var1 = C_throws.id_byte().id_native().id_protected();
        return var1 == null || (var2 = var1.id_class()) != null && var2.id_break();
    }
}

