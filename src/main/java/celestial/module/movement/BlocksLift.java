/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.movement;

import celestial.Aq_1;
import celestial.QP;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rZO;
import celestial.rqr_3;
import celestial.rrIQ;
import celestial.rrIU;
import celestial.rrfj_3;
import celestial.rrfw_3;
import celestial.rrnZ_2;

public class BlocksLift
extends Module
implements rrnZ_2 {
    public Object[] id_break;

    public BlocksLift() {
        super("Blocks Lift", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u043f\u043e\u0434\u043d\u0438\u043c\u0430\u0442\u044c\u0441\u044f \u0432 \u0431\u043b\u043e\u043a\u0430\u0445", Category.MOVEMENT);
        this.id_super();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Packet", "Packet", "Glide", "Matrix");
        this.id_break[0] = var5;
        rrfw_3 var6 = new rrfw_3();
        this.id_break[1] = var6;
        this.id_class((rrIQ)this.id_break[0]);
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_super();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            switch ((String)((rrIQ)this.id_break[0]).id_byte()) {
                case "Glide": {
                    if (!((cb_3)BlocksLift.id_import.id_class[57]).BW() || ((cb_3)BlocksLift.id_import.id_class[57]).id_class(QP.id_class) || !((rqr_3)((cb_3)BlocksLift.id_import.id_class[57]).id_break[17]).id_private) break;
                    if ((Integer)((cb_3)BlocksLift.id_import.id_class[57]).id_throws[41] % 2 == 0) {
                        ((Aq_1)((cb_3)BlocksLift.id_import.id_class[57]).id_break[0]).id_class(new rZO(true));
                    }
                    if (((cb_3)BlocksLift.id_import.id_class[57]).BL()) {
                        ((cb_3)BlocksLift.id_import.id_class[57]).sl();
                        break;
                    }
                    ((cb_3)BlocksLift.id_import.id_class[57]).rv().id_break = 0.0;
                    ((cb_3)BlocksLift.id_import.id_class[57]).rv().id_protected = 0.0;
                    ((cb_3)BlocksLift.id_import.id_class[57]).rv().id_byte = -0.01;
                    break;
                }
                case "Packet": {
                    if (((cb_3)BlocksLift.id_import.id_class[57]).BW() && !((cb_3)BlocksLift.id_import.id_class[57]).BL() && !((cb_3)BlocksLift.id_import.id_class[57]).id_class(QP.id_class) && ((rqr_3)((cb_3)BlocksLift.id_import.id_class[57]).id_break[17]).id_private) {
                        rrfj_3.id_class(true);
                        if (((rrfw_3)this.id_break[1]).id_class(150.0)) {
                            ((cb_3)BlocksLift.id_import.id_class[57]).rv().id_byte = 0.42;
                            ((Aq_1)((cb_3)BlocksLift.id_import.id_class[57]).id_break[0]).id_break(new rZO(true));
                        }
                        if (((rrfw_3)this.id_break[1]).id_class(300.0)) {
                            ((rrfw_3)this.id_break[1]).id_class();
                        }
                        this.id_break[2] = true;
                        break;
                    }
                    if (!((Boolean)this.id_break[2]).booleanValue()) break;
                    this.id_break[2] = false;
                    break;
                }
                case "Matrix": {
                    if (!((cb_3)BlocksLift.id_import.id_class[57]).BW() || !((rqr_3)((cb_3)BlocksLift.id_import.id_class[57]).id_break[17]).id_private) break;
                    rrIU.id_class();
                    ((cb_3)BlocksLift.id_import.id_class[57]).rv().id_byte = 0.42;
                    if ((Integer)((cb_3)BlocksLift.id_import.id_class[57]).id_throws[41] % 2 != 0) break;
                    ((Aq_1)((cb_3)BlocksLift.id_import.id_class[57]).id_break[0]).id_class(new rZO(true));
                }
            }
        }
    }

    @Override
    public void id_class() {
        this.id_byte(false);
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_super();
        super.id_throws(var1);
        this.id_break[2] = false;
        ((rrfw_3)this.id_break[1]).id_class();
    }

    private void id_super() {
        if (this.id_break == null) {
            this.id_break = new Object[3];
            this.id_break[2] = false;
        }
    }
}

