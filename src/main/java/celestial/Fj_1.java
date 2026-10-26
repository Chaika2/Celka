/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.FI;
import celestial.FM;
import celestial.Fb_1;
import celestial.LL;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rgn_3;
import java.util.List;
import java.util.function.Predicate;

public class Fj_1
extends FI {
    public Fj_1(Fb_1<?> fb_1, int n, int n2, int n3, int n4, LL lL) {
        super(fb_1, n, n2, n3, n4, new rgn_3("container.action.put_all"), lL);
    }

    @Override
    public boolean id_extends() {
        Object t = this.id_native().G_();
        List<rJY> list = ((rJr_1)t).id_class((Predicate<rJY>)null);
        for (int i = list.size(); i < ((rJr_1)t).id_throws.size(); ++i) {
            rJY rJY2 = ((rJr_1)t).id_throws.get(i);
            if (!rJY2.id_break()) continue;
            return true;
        }
        return false;
    }

    @Override
    public FM id_implements() {
        return FM.PUT_ALL;
    }

    @Override
    public void id_private() {
        Fb_1<?> fb_1 = this.id_native();
        if (fb_1.id_package() != this.id_implements()) {
            return;
        }
        Object t = fb_1.G_();
        List<rJY> list = ((rJr_1)t).id_class((Predicate<rJY>)null);
        for (int i = list.size(); i < ((rJr_1)t).id_throws.size(); ++i) {
            rJY rJY2 = ((rJr_1)t).id_throws.get(i);
            if (!rJY2.id_break() || !rJY2.id_class(rJY2.id_class())) continue;
            ((Ax_1)Fj_1.id_import.id_class[55]).id_class(((rJr_1)t).id_case, rJY2.id_protected, 0, rXa_1.QUICK_MOVE, false);
        }
        fb_1.id_class((FM)null);
    }
}

