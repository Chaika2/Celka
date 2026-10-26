/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.render;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrIm_1;

public class ItemPhysics
extends Module {
    public Object[] id_break;

    public ItemPhysics() {
        super("Item Physics", "\u0420\u0435\u0430\u043b\u0438\u0441\u0442\u0438\u0447\u043d\u0430\u044f \u0444\u0438\u0437\u0438\u043a\u0430 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432", Category.RENDER);
        this.id_this();
        rrIm_1 var5 = new rrIm_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0432\u0440\u0430\u0449\u0435\u043d\u0438\u044f", Float.valueOf(5.0f), Float.valueOf(2.0f), Float.valueOf(7.0f), Float.valueOf(0.1f));
        this.id_break[0] = var5;
        this.id_class((rrIm_1)this.id_break[0]);
    }

    private void id_this() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }

    public float id_new() {
        this.id_this();
        return ((Float)((rrIm_1)this.id_break[0]).id_byte()).floatValue();
    }
}

