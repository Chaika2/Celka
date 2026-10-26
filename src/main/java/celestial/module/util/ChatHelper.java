/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.Aw_1;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rrFR;
import celestial.rrHC;
import celestial.rrHH;
import celestial.rrHl_1;
import celestial.rrHn_1;
import celestial.rrHy_1;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrLh_1;
import celestial.setting.Setting;

public class ChatHelper
extends Module {
    public Object[] id_break;

    public ChatHelper() {
        super("Chat Helper", "\u0423\u0442\u0438\u043b\u0438\u0442\u0430\u0440\u043d\u044b\u0439 \u043c\u043e\u0434\u0443\u043b\u044c \u0434\u043b\u044f \u0447\u0430\u0442\u0430", Category.UTIL);
        rrHH[] var10;
        this.id_this();
        rrIk_1 var5 = new rrIk_1("Call", true);
        this.id_break[0] = var5;
        rrIk_1 var6 = new rrIk_1("Invsee", true);
        this.id_break[1] = var6;
        rrIk_1 var7 = new rrIk_1("Ah", false);
        this.id_break[2] = var7;
        rrIk_1 var8 = new rrIk_1("Duel", false);
        this.id_break[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u0421\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u0438\u0435 \u0438\u0441\u0442\u043e\u0440\u0438\u0438", false);
        this.id_break[4] = var9;
        this.id_break[5] = var10 = new rrHH[]{new rrHC(this), new rrHy_1(this), new rrHn_1(this), new rrHl_1(this)};
        Setting[] var11 = new Setting[2];
        int var10003 = 0;
        String var10006 = "\u0411\u044b\u0441\u0442\u0440\u044b\u0435 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f";
        var11[var10003] = new rrIc_1(var10006, (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[2]);
        var11[1] = (rrIk_1)this.id_break[4];
        this.id_class(var11);
    }

    private void id_this() {
        if (this.id_break == null) {
            this.id_break = new Object[6];
        }
    }

    @EventTarget
    public void id_class(rrFR var1) {
        this.id_this();
        if (((rrIk_1)this.id_break[4]).id_class().booleanValue()) {
            var1.id_class(true);
        }
    }

    @EventTarget
    public void id_class(rrLh_1 var1) {
        Aw_1 var3;
        this.id_this();
        rgP_2 var2 = var1.id_throws();
        if (!(var2 instanceof rVe_1) && (var3 = var1.id_protected()) != null && !var3.id_class().equals((Object)((cb_3)ChatHelper.id_import.id_class[57]).sv())) {
            rgN_2 var4 = new rgN_2("");
            for (rrHH var8 : (rrHH[])this.id_break[5]) {
                if (!var8.id_class()) continue;
                var4.id_class(var8.id_class(var3)).id_break(" ");
            }
            rVi_1 var9 = var2.id_case();
            if (var9.id_protected().isEmpty()) {
                var9 = var4.id_class(var9);
            } else {
                var9.id_class(0, var4);
            }
            var1.id_class(var9);
        }
    }
}

