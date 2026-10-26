/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.player;

import celestial.Ax_1;
import celestial.Ph_1;
import celestial.Y;
import celestial.an_3;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.iB_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rdy_3;
import celestial.rhp_3;
import celestial.rpm_3;
import celestial.rrfH_2;
import celestial.ryZ_2;

public class AutoFish
extends Module {
    public Object[] id_break;

    private void id_byte(rpm_3 var1) {
        this.id_this();
        if (this.id_return() && !((Boolean)this.id_break[0]).booleanValue() && (rhp_3)((cb_3)AutoFish.id_import.id_class[57]).id_implements[29] != null && ((rhp_3)((cb_3)AutoFish.id_import.id_class[57]).id_implements[29]).id_implements()) {
            this.id_class(var1);
            this.id_break[0] = true;
        }
    }

    public AutoFish() {
        super("Auto Fish", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043b\u043e\u0432\u0438\u0442 \u0440\u044b\u0431\u0443 \u0437\u0430 \u0432\u0430\u0441", Category.UTIL);
        this.id_this();
    }

    private void id_this() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
            this.id_break[0] = false;
            this.id_break[1] = 0;
        }
    }

    private void id_class(rpm_3 var1) {
        ryZ_2 var2 = ((Ax_1)AutoFish.id_import.id_class[55]).id_class(var1);
        if (var2 == ryZ_2.SUCCESS) {
            ((cb_3)AutoFish.id_import.id_class[57]).id_class(var1);
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        rpm_3 var2;
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) && (var2 = rrfH_2.id_class((iB_2)((cb_3)AutoFish.id_import.id_class[57]), rdy_3.Xd)) != null) {
            this.id_byte(var2);
            this.id_break(var2);
        }
    }

    private void id_break(rpm_3 var1) {
        this.id_this();
        if (this.id_return() && ((Boolean)this.id_break[0]).booleanValue()) {
            this.id_break[1] = (Integer)this.id_break[1] + 1;
            if ((Integer)this.id_break[1] >= 5) {
                this.id_class(var1);
                this.id_goto();
            }
        }
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        this.id_goto();
    }

    private void id_goto() {
        this.id_this();
        this.id_break[1] = 0;
        this.id_break[0] = false;
    }

    private boolean id_return() {
        an_3 var1 = Ph_1.id_class(((cb_3)AutoFish.id_import.id_class[57]).rO(), 20.0f, false, null);
        return var1 == null;
    }
}

