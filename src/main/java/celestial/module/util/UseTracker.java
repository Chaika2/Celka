/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.Y;
import celestial.an_3;
import celestial.cG_2;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.jI_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rAB;
import celestial.rLY;
import celestial.rVi_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rhd_3;
import celestial.rqA_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rrLu_1;
import celestial.rrff_3;
import celestial.rrfu_3;
import celestial.rrjZ_2;
import celestial.rryO;
import celestial.ruS_2;
import celestial.rvt_3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UseTracker
extends Module {
    public Object[] id_break;

    public UseTracker() {
        super("Use Tracker", "\u041e\u0442\u0441\u043b\u0435\u0436\u0438\u0432\u0430\u0435\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435\n\u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432", Category.UTIL);
        HashSet var5;
        this.id_public();
        this.id_break[0] = var5 = new HashSet();
    }

    private void id_this() {
        this.id_public();
        Iterator var1 = ((Set)this.id_break[0]).iterator();
        if (var1.hasNext()) {
            rryO var2 = (rryO)var1.next();
            var2.id_class(true);
        }
    }

    private void id_class(rhd_3 var1, rdn_3 var2) {
        rgN_2 var3 = new rgN_2("");
        var3.id_class(rgF_2.GRAY).id_class(rrjZ_2.id_byte((an_3)var1)).id_break(" \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043b ").id_class(this.id_class(var2).id_break(rgF_2.RED));
        rrfu_3.id_class(var3);
    }

    private rVi_1 id_class(rdn_3 var1) {
        if (var1.id_this()) {
            rVi_1 var2 = new rgN_2("(").id_break(rgF_2.GOLD).id_break(jI_2.id_class("ru_ru", var1.id_finally(), new Object[0])).id_break(")");
            return var1.id_continue().id_case().id_break(" ").id_class(var2);
        }
        return new rgN_2(jI_2.id_class("ru_ru", var1.id_finally(), new Object[0]));
    }

    @EventTarget
    public void id_class(rrLu_1 var1) {
        rvt_3 var3;
        rqA_2 var4;
        ruS_2<?> ruS_22 = var1.id_class();
        if (ruS_22 instanceof rvt_3 && (var4 = (var3 = (rvt_3)ruS_22).id_break()) == rqn_3.hn) {
            this.id_this();
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_public();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            for (cG_2 var3 : ((gm_3)UseTracker.id_import.id_class[56]).id_continue()) {
                if (!rrff_3.id_class(var3)) continue;
                rdn_3 var4 = var3.sX();
                int var5 = var3.SH();
                if (var4.id_class() || var5 != 2) continue;
                if (var4.id_break() == rdy_3.JA) {
                    this.id_break(var3, var4);
                    continue;
                }
                ((Set)this.id_break[0]).add(new rryO(var3, var4));
            }
            Iterator var6 = ((Set)this.id_break[0]).iterator();
            while (var6.hasNext()) {
                rryO var7 = (rryO)var6.next();
                rhd_3 var8 = var7.id_protected();
                rdn_3 var9 = var7.id_class();
                if (rqR_2.id_break() - var7.id_break() > 300L) {
                    var6.remove();
                    continue;
                }
                if (!var7.id_byte()) continue;
                this.id_class(var8, var9);
                var6.remove();
            }
        }
    }

    private void id_break(rhd_3 var1, rdn_3 var2) {
        rgN_2 var3 = new rgN_2("");
        rgN_2 var4 = new rgN_2("\n");
        var3.id_class(rgF_2.GRAY).id_class(rrjZ_2.id_byte((an_3)var1)).id_break(" \u0432\u044b\u043f\u0438\u043b ").id_class(this.id_class(var2).id_break(rgF_2.RED));
        List<rLY> var5 = rAB.id_class(var2);
        if (!var5.isEmpty()) {
            boolean var6 = false;
            for (int var7 = 0; var7 < var5.size(); ++var7) {
                rLY var8 = var5.get(var7);
                if (var8.id_break() <= 0) continue;
                var4.id_break(String.valueOf((Object)rgF_2.GRAY) + " \u2022 ").id_break(String.valueOf((Object)rgF_2.RED) + rAB.id_class(var8, rgF_2.GRAY));
                if (var7 != var5.size() - 1) {
                    var4.id_break("\n");
                }
                var6 = true;
            }
            if (var6) {
                var3.id_class(var4);
            }
        }
        rrfu_3.id_class(var3);
    }

    private void id_public() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }
}

