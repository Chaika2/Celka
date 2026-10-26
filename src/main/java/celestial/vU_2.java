/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LL;
import celestial.mN_2;
import celestial.rVi_1;
import celestial.rgP_2;
import celestial.vK_2;
import java.util.Objects;
import java.util.Optional;

public class vU_2
extends LF {
    public final /* synthetic */ vK_2 id_class;

    public vU_2(vK_2 vK_22, int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL) {
        this.id_class = vK_22;
        super(n, n2, n3, n4, rgP_22, lL);
    }

    @Override
    protected rVi_1 A_() {
        return Objects.equals(this.id_class.id_int, Optional.of(mN_2.id_break)) ? super.A_().id_break(". ").id_class(vK_2.id_protected) : super.A_();
    }

    @Override
    public rgP_2 C_() {
        return super.C_().id_case().id_break(" ").id_class(this.id_class.id_int.map(mN_2::id_class).orElse(vK_2.id_byte));
    }
}

