/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.FI;
import celestial.FM;
import celestial.Fb_1;
import celestial.LL;
import celestial.cb_3;
import celestial.rJT;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rZM;
import celestial.rZb_1;
import celestial.rfH_2;
import celestial.rgn_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rrfY_2;
import celestial.vm_3;
import java.util.List;
import java.util.function.Predicate;

public class Ff_1
extends FI {
    private void id_byte(int n) {
        ((Ax_1)Ff_1.id_import.id_class[55]).id_class(n > 35 && n <= 45 ? n - 36 : n);
    }

    public Ff_1(Fb_1<?> fb_1, int n, int n2, int n3, int n4, LL lL) {
        super(fb_1, n, n2, n3, n4, new rgn_3("container.action.drop_all"), lL);
    }

    @Override
    public boolean id_extends() {
        Object t = this.id_native().G_();
        List<rJY> list = ((rJr_1)t).id_class((Predicate<rJY>)null);
        return rrfY_2.id_class(list, false);
    }

    @Override
    public FM id_implements() {
        return FM.DROP_ALL;
    }

    @Override
    public void id_private() {
        Fb_1<?> fb_1 = this.id_native();
        if (fb_1.id_package() != this.id_implements()) {
            return;
        }
        Object t = fb_1.G_();
        for (int i = 0; i < ((rJr_1)t).id_extends().size() && (vm_3)Ff_1.id_import.id_class[73] == fb_1; ++i) {
            rJY rJY2 = ((rJT)((cb_3)Ff_1.id_import.id_class[57]).id_implements[3]).id_class(i);
            if (!rJY2.id_break()) continue;
            if (i < 9) {
                ((Ax_1)Ff_1.id_import.id_class[55]).id_class(((rJr_1)t).id_case, i, 1, rXa_1.THROW, true);
                continue;
            }
            this.id_final();
            this.id_byte(i);
        }
        this.id_final();
        this.id_byte(36);
        if (!((cb_3)Ff_1.id_import.id_class[57]).Sn().id_class()) {
            if (!((cb_3)Ff_1.id_import.id_class[57]).id_native()) {
                ((Aq_1)((cb_3)Ff_1.id_import.id_class[57]).id_break[0]).id_break(new rZb_1(rZM.DROP_ALL_ITEMS, rfH_2.id_protected, rpr_3.DOWN));
            }
            this.id_final();
            ((Ax_1)Ff_1.id_import.id_class[55]).id_class(((rJr_1)t).id_case, 45, 1, rXa_1.THROW, true);
        }
        fb_1.id_class(null);
        fb_1.id_class((FM)null);
    }

    private void id_final() {
        ((Aq_1)((cb_3)Ff_1.id_import.id_class[57]).id_break[0]).id_break(new rZb_1(rZM.DROP_ALL_ITEMS, rfH_2.id_protected, rpr_3.DOWN));
        ((cb_3)Ff_1.id_import.id_class[57]).id_class(rpm_3.MAIN_HAND, false);
    }
}

