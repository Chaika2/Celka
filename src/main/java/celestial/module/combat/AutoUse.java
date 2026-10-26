/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.combat;

import celestial.V;
import celestial.event.EventTarget;
import celestial.j_1;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rrlV_2;
import celestial.rrlf_3;
import celestial.rrlg_3;
import java.util.ArrayList;
import java.util.List;

public class AutoUse
extends Module {
    public Object[] id_break;

    public AutoUse() {
        super("Auto Use", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\n\u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u0432 \u043d\u0443\u0436\u043d\u044b\u0439 \u043c\u043e\u043c\u0435\u043d\u0442", Category.PLAYER);
        ArrayList var5;
        this.id_super();
        this.id_break[0] = var5 = new ArrayList();
        this.id_break(new rrlV_2(this));
        this.id_break(new rrlf_3(this));
    }

    @Override
    public void id_class(boolean var1) {
        this.id_super();
        for (rrlg_3 var3 : (List)this.id_break[0]) {
            var3.aI_();
        }
        super.id_class(var1);
    }

    public boolean id_class(rrlg_3 var1) {
        this.id_super();
        for (rrlg_3 var3 : (List)this.id_break[0]) {
            if (var1 == var3 || var3.id_throws()) continue;
            return true;
        }
        return false;
    }

    @EventTarget
    public void id_class(j_1 var1) {
        this.id_super();
        if (var1.id_class() == (V)((Object)V.staticFields30e1cd8580ce39faa61be3646b7cc079[0])) {
            for (rrlg_3 var3 : (List)this.id_break[0]) {
                var3.id_protected();
            }
        }
    }

    public <T extends rrlg_3> void id_break(T var1) {
        this.id_super();
        ((List)this.id_break[0]).add(var1);
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_super();
        for (rrlg_3 var3 : (List)this.id_break[0]) {
            var3.aK_();
            var3.id_protected();
        }
        super.id_throws(var1);
    }

    private void id_super() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }
}

