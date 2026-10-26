/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.render;

import celestial.event.EventTarget;
import celestial.event.RenderEvent;
import celestial.gm_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rFp_1;
import celestial.rrIQ;
import celestial.rrLu_1;
import celestial.util.AnimValue;

public class TimeChanger
extends Module {
    public Object[] id_break;

    public TimeChanger() {
        super("Time Changer", "\u0418\u0437\u043c\u0435\u043d\u044f\u0435\u0442 \u0432\u0440\u0435\u043c\u044f \u0441\u0443\u0442\u043e\u043a", Category.RENDER);
        this.id_public();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "\u0417\u0430\u043a\u0430\u0442", "\u0417\u0430\u043a\u0430\u0442", "\u0414\u0435\u043d\u044c", "\u041d\u043e\u0447\u044c");
        this.id_break[0] = var5;
        AnimValue var6 = new AnimValue(0.1f, false);
        this.id_break[1] = var6;
        this.id_class((rrIQ)this.id_break[0]);
    }

    @EventTarget
    public void id_class(RenderEvent var1) {
        this.id_public();
        int var2 = this.id_return();
        ((AnimValue)this.id_break[1]).id_break(var2);
        ((gm_3)TimeChanger.id_import.id_class[56]).id_break((long)((AnimValue)this.id_break[1]).id_byte());
    }

    @EventTarget
    public void id_class(rrLu_1 var1) {
        if (var1.id_class() instanceof rFp_1) {
            var1.id_class(true);
        }
    }

    private int id_return() {
        this.id_public();
        return switch ((String)((rrIQ)this.id_break[0]).id_byte()) {
            case "\u0417\u0430\u043a\u0430\u0442" -> 13000;
            case "\u0414\u0435\u043d\u044c" -> 1000;
            case "\u041d\u043e\u0447\u044c" -> 18000;
            default -> 0;
        };
    }

    private void id_public() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
        }
    }
}

