/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.movement;

import celestial.Qw_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rLD;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rmD_2;
import celestial.rrAB;
import celestial.rrAl_1;
import celestial.rrAo_1;
import celestial.rrLW;
import celestial.rrLz_1;
import celestial.rrQX;
import celestial.rrfZ_2;
import celestial.rrlX_2;
import celestial.rrnZ_2;
import celestial.rrvT;

public class Strafe
extends Module
implements rrnZ_2 {
    public Object[] id_break;

    public Strafe() {
        super("Strafe", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u043d\u0435 \u0437\u0430\u043c\u0435\u0434\u043b\u044f\u0442\u044c\u0441\u044f \u043f\u0440\u0438\n\u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0438 \u0432 \u0441\u0442\u043e\u0440\u043e\u043d\u044b", Category.MOVEMENT);
        this.id_while();
        rrlX_2 var5 = new rrlX_2(this);
        this.id_break[0] = var5;
    }

    public boolean id_this() {
        this.id_while();
        return (Boolean)this.id_break[3];
    }

    @EventTarget
    public void id_class(rrLW var1) {
        this.id_while();
        ((rrlX_2)this.id_break[0]).id_class(var1);
    }

    @EventTarget
    public void id_class(rrAl_1 var1) {
        this.id_while();
        if (var1.id_class() < 10.0f) {
            this.id_break[3] = true;
        }
    }

    @EventTarget
    public void id_class(rrAo_1 var1) {
        this.id_while();
        if (((Boolean)this.id_break[2]).booleanValue() && rmD_2.id_break != (Boolean)this.id_break[1]) {
            var1.id_protected(!rmD_2.id_break);
        }
        ((rrlX_2)this.id_break[0]).id_class(var1);
    }

    @EventTarget
    public void id_class(rrAB var1) {
        this.id_while();
        if (((Boolean)this.id_break[2]).booleanValue()) {
            var1.id_class(true);
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_while();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            ((Qw_1)Strafe.id_import.id_class[20]).Pr = false;
            this.id_break[2] = this.id_throw();
            if (((Boolean)this.id_break[3]).booleanValue() && (Integer)((cb_3)Strafe.id_import.id_class[57]).id_throws[41] % 6 == 0) {
                this.id_break[3] = false;
                ((rrlX_2)this.id_break[0]).id_class(0.0);
            }
        }
    }

    @Override
    public void id_class(boolean var1) {
        this.id_while();
        super.id_class(var1);
        ((rrlX_2)this.id_break[0]).id_class(0.15f);
    }

    @Override
    public void id_class() {
        this.id_byte(false);
    }

    @EventTarget
    public void id_class(rrLz_1 var1) {
        this.id_while();
        if (((Boolean)this.id_break[2]).booleanValue()) {
            var1.id_class(((rrlX_2)this.id_break[0]).id_class(var1));
        } else {
            ((rrlX_2)this.id_break[0]).id_class(0.0);
        }
    }

    @Override
    public void id_throws(boolean var1) {
        super.id_throws(var1);
        if ((cb_3)Strafe.id_import.id_class[57] != null) {
            rjU_2 var2 = ((cb_3)Strafe.id_import.id_class[57]).rv();
            var2.id_break *= 0.7;
            var2.id_protected *= 0.7;
        }
    }

    public void id_case(boolean var1) {
        this.id_while();
        this.id_break[1] = var1;
    }

    public boolean id_continue() {
        this.id_while();
        return (Boolean)this.id_break[1];
    }

    public boolean id_new() {
        this.id_while();
        return (Boolean)this.id_break[2];
    }

    public rrlX_2 id_super() {
        this.id_while();
        return (rrlX_2)this.id_break[0];
    }

    private boolean id_throw() {
        this.id_while();
        rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private();
        if ((cb_3)Strafe.id_import.id_class[57] == null || (gm_3)Strafe.id_import.id_class[56] == null) {
            return false;
        }
        if (((Boolean)this.id_break[3]).booleanValue()) {
            return false;
        }
        if (var1.id_strictfp().aJ_() || var1.K().aJ_()) {
            return false;
        }
        if (var1.B().aJ_() && ((Boolean)((cb_3)Strafe.id_import.id_class[57]).id_throws[23]).booleanValue()) {
            return false;
        }
        if (rrfZ_2.id_protected()) {
            return false;
        }
        if (((rhx_3)((cb_3)Strafe.id_import.id_class[57]).id_implements[18]).id_break) {
            return false;
        }
        if (((cb_3)Strafe.id_import.id_class[57]).id_break(rLD.id_goto)) {
            return false;
        }
        if (((cb_3)Strafe.id_import.id_class[57]).h()) {
            return false;
        }
        if (((cb_3)Strafe.id_import.id_class[57]).Sy()) {
            return false;
        }
        return !((cb_3)Strafe.id_import.id_class[57]).PZ();
    }

    private void id_while() {
        if (this.id_break == null) {
            this.id_break = new Object[4];
            this.id_break[1] = false;
            this.id_break[2] = false;
            this.id_break[3] = false;
        }
    }
}

