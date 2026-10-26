/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.Fu_1;
import celestial.Qw_1;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rJY;
import celestial.rXa_1;
import celestial.rrIm_1;
import celestial.rrfC_2;
import celestial.rrfw_3;
import celestial.rrns_3;
import celestial.vm_3;

public class ItemScroller
extends Module {
    public Object[] id_break;

    public ItemScroller() {
        super("Item Scroller", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0431\u044b\u0441\u0442\u0440\u043e \u0437\u0430\u0431\u0438\u0440\u0430\u0442\u044c \u0438\u043b\u0438\n\u043f\u0435\u0440\u0435\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u0442\u044c \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b", Category.UTIL);
        this.id_return();
        rrIm_1 var5 = new rrIm_1("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(100.0f), Float.valueOf(10.0f));
        this.id_break[0] = var5;
        rrfw_3 var6 = new rrfw_3();
        this.id_break[1] = var6;
        this.id_class((rrIm_1)this.id_break[0]);
    }

    @EventTarget
    public void id_class(rrns_3 var1) {
        this.id_return();
        Fu_1<?> var2 = var1.id_class();
        rJY var3 = var2.id_int();
        if (var3 != null && var3.id_break() && ((rrfw_3)this.id_break[1]).id_class(((Float)((rrIm_1)this.id_break[0]).id_byte()).floatValue())) {
            if (vm_3.id_synchronized() && rrfC_2.id_break(0)) {
                var2.id_class(var3, var3.id_protected, 0, rXa_1.QUICK_MOVE);
            } else if (vm_3.id_else() && rrfC_2.id_break(((Qw_1)ItemScroller.id_import.id_class[20]).N.id_int().id_break())) {
                var2.id_class(var3, var3.id_protected, 1, rXa_1.THROW);
            }
            ((rrfw_3)this.id_break[1]).id_class();
        }
    }

    private void id_return() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
        }
    }
}

