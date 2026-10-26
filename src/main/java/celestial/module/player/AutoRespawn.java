/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.player;

import celestial.Y;
import celestial.ZS;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rrAG;
import celestial.rrIv_1;
import celestial.rrtR_2;
import celestial.rrte_3;
import celestial.vm_3;
import java.util.regex.Pattern;

public class AutoRespawn
extends Module {
    public Object[] id_break;

    private boolean id_byte(String var1) {
        return !var1.isEmpty() && !var1.isBlank();
    }

    public AutoRespawn() {
        super("Auto Respawn", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0440\u0435\u0441\u043f\u0430\u0432\u043d\u0438\u0442 \u0432\u0430\u0441\n\u043f\u043e\u0441\u043b\u0435 \u0441\u043c\u0435\u0440\u0442\u0438", Category.PLAYER);
        this.id_new();
        rrIv_1 var5 = new rrIv_1("\u0421\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435 \u043f\u043e\u0441\u043b\u0435 \u0440\u0435\u0441\u043f\u0430\u0432\u043d\u0430", rrte_3.id_class((Pattern)rrtR_2.id_class[5]));
        this.id_break[0] = var5;
        this.id_class((rrIv_1)this.id_break[0]);
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_new();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) && ((Boolean)this.id_break[1]).booleanValue()) {
            if ((vm_3)AutoRespawn.id_import.id_class[73] instanceof ZS && (Integer)((cb_3)AutoRespawn.id_import.id_class[57]).id_private[13] == 1) {
                ((cb_3)AutoRespawn.id_import.id_class[57]).J();
            } else if (((cb_3)AutoRespawn.id_import.id_class[57]).Pu()) {
                int var10002 = (Integer)this.id_break[2] + 1;
                this.id_break[2] = var10002;
                if (var10002 >= 17) {
                    String var2 = ((rrIv_1)this.id_break[0]).id_extends();
                    if (this.id_byte(var2)) {
                        ((cb_3)AutoRespawn.id_import.id_class[57]).id_protected(var2);
                    }
                    this.id_break[1] = false;
                    this.id_break[2] = 0;
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrAG var1) {
        this.id_new();
        this.id_break[1] = true;
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_new();
        super.id_throws(var1);
        this.id_break[1] = false;
        this.id_break[2] = 0;
    }

    private void id_new() {
        if (this.id_break == null) {
            this.id_break = new Object[3];
            this.id_break[1] = false;
            this.id_break[2] = 0;
        }
    }
}

