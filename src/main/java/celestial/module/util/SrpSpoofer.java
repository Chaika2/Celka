/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.Aq_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rZN;
import celestial.rZQ;
import celestial.rrLZ;
import celestial.rrfu_3;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.ruS_2;

public class SrpSpoofer
extends Module {
    public Object[] id_break;

    public SrpSpoofer() {
        super("SRP Spoofer", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u0440\u0435\u0441\u0443\u0440\u0441\u043f\u0430\u043a \u043d\u0430 \u0441\u0435\u0440\u0432\u0435\u0440\u0430\u0445\n\u0433\u0434\u0435 \u044d\u0442\u043e \u0437\u0430\u043f\u0440\u0435\u0449\u0435\u043d\u043e", Category.UTIL);
        this.id_new();
    }

    @EventTarget
    public void id_class(rrLZ var1) {
        rZQ var2;
        this.id_new();
        ruS_2<?> ruS_22 = var1.id_class();
        if (ruS_22 instanceof rZQ && (var2 = (rZQ)ruS_22).id_break() == rZN.DECLINED) {
            var2.id_class(rZN.ACCEPTED);
            this.id_break[0] = true;
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_new();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) && ((Boolean)this.id_break[0]).booleanValue()) {
            this.id_return();
            this.id_continue();
            this.id_break[0] = false;
        }
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_new();
        super.id_throws(var1);
        this.id_break[0] = false;
    }

    private void id_continue() {
        String var1 = "\u0420\u0435\u0441\u0443\u0440\u0441\u043f\u0430\u043a \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u043f\u043e\u0434\u043c\u0435\u043d\u0451\u043d";
        rrfu_3.id_byte(rrfu_3.id_class(this) + var1);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtQ_2(this.id_final(), var1, 3000));
    }

    private void id_new() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
            this.id_break[0] = false;
        }
    }

    private void id_return() {
        ((Aq_1)((cb_3)SrpSpoofer.id_import.id_class[57]).id_break[0]).id_class(rZN.SUCCESSFULLY_LOADED);
    }
}

