/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.Qj_1;
import celestial.an_3;
import celestial.cG_2;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.rrAQ;
import celestial.rrZW;
import celestial.rrfu_3;

public class LeaveTracker
extends Module {
    public LeaveTracker() {
        super("Leave Tracker", "\u041e\u0442\u0441\u043b\u0435\u0436\u0438\u0432\u0430\u0435\u0442 \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0430\n\u0438\u0433\u0440\u043e\u043a\u043e\u0432", Category.UTIL);
    }

    @EventTarget
    public void id_class(rrAQ var1) {
        an_3 an_32 = var1.id_class();
        if (an_32 instanceof cG_2) {
            cG_2 var3 = (cG_2)an_32;
            if (var3 == (cb_3)LeaveTracker.id_import.id_class[57] || var3.sc() || ((cb_3)LeaveTracker.id_import.id_class[57]).id_implements(var3) < 100.0f || ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class(var3)) {
                return;
            }
            String var4 = rrfu_3.id_class(this);
            rgN_2 var5 = new rgN_2(String.valueOf((Object)rgF_2.GRAY) + String.valueOf(var4) + var3.id_extends() + " \u043b\u0438\u0432\u043d\u0443\u043b \u043d\u0430 " + var3.PG());
            rgN_2 var6 = new rgN_2(String.valueOf((Object)rgF_2.GRAY) + "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0447\u0442\u043e\u0431\u044b \u0441\u043a\u043e\u043f\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b");
            Runnable var7 = () -> {
                ((Qj_1)LeaveTracker.id_import.id_class[23]).id_class((int)var3.rx() + " " + (int)var3.re() + " " + (int)var3.BO());
                rrfu_3.id_byte(String.valueOf(var4) + "\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b \u0441\u043a\u043e\u043f\u0438\u0440\u043e\u0432\u0430\u043d\u044b \u0432 \u0431\u0443\u0444\u0435\u0440 \u043e\u0431\u043c\u0435\u043d\u0430");
            };
            rVi_1 var8 = rgv_3.id_class(var5, new rgy_3(rgp_3.id_class, var6), new rgl_3(var7));
            rrfu_3.id_class(var8);
        }
    }
}

