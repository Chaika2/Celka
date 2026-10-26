/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVL;
import celestial.rmb_3;
import celestial.rsp_3;
import celestial.ruu_3;

public class ruK_2
implements rmb_3<rsp_3> {
    @Override
    public rsp_3 id_class(rsp_3 rsp_32) {
        return rsp_32;
    }

    @Override
    public rsp_3 id_class(ruu_3 ruu_32) {
        return new rsp_3(rVL.X.id_class(ruu_32.id_case()), rVL.J.id_class(ruu_32.id_case()), ruu_32.id_case());
    }

    @Override
    public void id_class(ruu_3 ruu_32, rsp_3 rsp_32) {
        ruu_32.id_protected(rVL.X.id_class(rsp_32.id_class()));
        ruu_32.id_protected(rVL.J.id_class(rsp_32.id_break()));
        ruu_32.id_protected(rsp_32.id_byte());
    }

    @Override
    public /* synthetic */ Object id_break(ruu_3 ruu_32) {
        return this.id_class(ruu_32);
    }
}

