/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JS;
import celestial.Js_1;
import celestial.rQM;
import celestial.rQQ;
import celestial.rQz_1;
import celestial.xd_3;

public class rQO
implements rQQ {
    private final xd_3 id_class;
    private JS id_break = JS.id_class;

    public rQO(xd_3 xd_32) {
        this.id_class = xd_32;
    }

    public rQO id_class(Js_1 js_1) {
        this.id_break = js_1.id_break();
        return this;
    }

    @Override
    public rQz_1 build() {
        return new rQM(this.id_class, this.id_break);
    }
}

