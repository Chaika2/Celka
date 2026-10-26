/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gK_2;
import celestial.ge_3;
import celestial.go_3;
import celestial.rcd_3;
import celestial.rnW_2;
import celestial.rqO_2;

public class ga_3
extends gK_2<rnW_2, ge_3> {
    public ga_3() {
        super(new rqO_2("function_tag"), ge_3.class);
    }

    @Override
    public /* synthetic */ go_3 id_class(rcd_3 rcd_32) {
        return this.id_break(rcd_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32, ge_3 ge_32) {
        rcd_32.id_class("Name", ge_32.id_class.toString());
    }

    public ge_3 id_break(rcd_3 rcd_32) {
        rqO_2 rqO_22 = new rqO_2(rcd_32.id_native("Name"));
        return new ge_3(rqO_22);
    }
}

