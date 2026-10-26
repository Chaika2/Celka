/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.ao_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rHb_1;
import celestial.rrAe_1;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrnb_3;
import celestial.rsG_2;

public class MinecraftOptimizer
extends Module {
    public Object[] id_break;
    public static Object[] id_byte;

    public MinecraftOptimizer() {
        super("Minecraft Optimizer", "\u041e\u043f\u0442\u0438\u043c\u0438\u0437\u0438\u0440\u0443\u0435\u0442 \u043c\u0430\u0439\u043d\u043a\u0440\u0430\u0444\u0442", Category.UTIL);
        this.id_return();
        rrIk_1 var5 = new rrIk_1("\u0411\u0430\u043d\u043d\u0435\u0440\u044b", true);
        this.id_break[0] = var5;
        rrIk_1 var6 = new rrIk_1("\u0420\u0430\u043c\u043a\u0438", false);
        this.id_break[1] = var6;
        this.id_class(new rrIc_1("\u0423\u0431\u0438\u0440\u0430\u0442\u044c", (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1]));
    }

    @EventTarget
    public void id_class(rrAe_1 var1) {
        var1.id_class(true);
    }

    @EventTarget
    public void id_class(rrnb_3 var1) {
        this.id_return();
        ao_3 var2 = var1.id_class();
        if (((rrIk_1)this.id_break[0]).id_class().booleanValue() && var2 instanceof rHb_1) {
            var1.id_class(true);
        } else if (((rrIk_1)this.id_break[1]).id_class().booleanValue() && var2 instanceof rsG_2) {
            var1.id_class(true);
        }
    }

    private void id_return() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
        }
    }

    @Override
    public String id_final() {
        return "Optimizer";
    }

    static {
        Object[] var0 = new Object[]{"Optimizer"};
        id_byte = var0;
    }
}

