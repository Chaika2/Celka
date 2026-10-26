/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package celestial.module.combat;

import celestial.Aq_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rZX;
import celestial.rrFj_1;
import celestial.rrfQ_2;
import celestial.rrfu_3;
import celestial.rrjA_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public class Criticals
extends Module {
    public Criticals() {
        super("Criticals", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0432\u0441\u0435\u0433\u0434\u0430 \u0431\u0438\u0442\u044c\n\u043a\u0440\u0438\u0442\u0438\u0447\u0435\u0441\u043a\u0430\u043c\u0438 \u0443\u0434\u0430\u0440\u0430\u043c\u0438", Category.COMBAT);
    }

    @EventTarget
    public void id_class(q_1 var1) {
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) && !this.id_return()) {
            this.id_byte(false);
        }
    }

    @Override
    public void id_class(boolean var1) {
        if (!this.id_return()) {
            this.id_byte(false);
        } else {
            super.id_class(var1);
        }
    }

    @EventTarget
    public void id_class(rrFj_1 var1) {
        if (!((cb_3)Criticals.id_import.id_class[57]).BL()) {
            float var2 = ((Float)((cb_3)Criticals.id_import.id_class[57]).id_throws[15]).floatValue() + rrfQ_2.id_byte(-0.0015f, 0.00105f);
            float var3 = ((Float)((cb_3)Criticals.id_import.id_class[57]).id_throws[16]).floatValue() + rrfQ_2.id_byte(-0.0015f, 0.00105f);
            double var4 = ((cb_3)Criticals.id_import.id_class[57]).re() - (double)rrfQ_2.id_byte(3.5E-5f, 6.5E-5f);
            ((Aq_1)((cb_3)Criticals.id_import.id_class[57]).id_break[0]).id_break(new rZX(((cb_3)Criticals.id_import.id_class[57]).rx(), var4, ((cb_3)Criticals.id_import.id_class[57]).BO(), var2, var3, false));
        }
    }

    public boolean id_new() {
        return this.aJ_() && (cb_3)Criticals.id_import.id_class[57] != null && !((cb_3)Criticals.id_import.id_class[57]).BL();
    }

    private boolean id_return() {
        if (rrjA_2.id_protected().id_throws().id_throws(ProtocolVersion.v1_17_1)) {
            String var1 = "\u041d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0432\u0435\u0440\u0441\u0438\u044e 1.17.1 \u0438\u043b\u0438 \u0432\u044b\u0448\u0435";
            rrfu_3.id_byte(rrfu_3.id_class(this) + var1);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), var1, 2000));
            return false;
        }
        return true;
    }
}

