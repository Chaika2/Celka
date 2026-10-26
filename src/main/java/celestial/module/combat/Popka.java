/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.combat;

import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rrAG;

public class Popka
extends Module {
    public Object[] id_break;

    public Popka() {
        super("Popka", ":D", Category.COMBAT);
        this.id_this();
    }

    private void id_this() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
            this.id_break[0] = 0;
            this.id_break[1] = false;
        }
    }

    @EventTarget
    public void id_class(rrAG var1) {
        this.id_this();
        this.id_break[0] = 5;
        this.id_break[1] = true;
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_this();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) && ((Boolean)this.id_break[1]).booleanValue()) {
            ((cb_3)Popka.id_import.id_class[57]).id_protected("/warp huhu");
            this.id_break[1] = false;
        }
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_this();
        super.id_throws(var1);
        this.id_break[0] = 0;
        this.id_break[1] = false;
    }
}

