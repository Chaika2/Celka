/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rUJ;
import celestial.rUX;
import celestial.rrBR;
import celestial.rrBo_1;
import celestial.rrSQ;
import celestial.rrSl_1;
import celestial.rrSu_1;

public interface rKL<R> {
    default public R id_byte(int n) {
        return this.id_class(rUX.id_class(0, n));
    }

    default public R id_class() {
        return this.id_class(rrSu_1.id_catch.id_break(rrSQ.id_break));
    }

    default public R id_class(rUX rUX2) {
        return this.id_class(rrSu_1.id_byte.id_break(new rUJ(rUX2)));
    }

    default public R id_class(int n) {
        return this.id_class(rrSu_1.id_break.id_break(new rrBR(n)));
    }

    public R id_class(rrBo_1<?> var1);

    default public R id_break(int n) {
        return this.id_class(rUX.id_class(n));
    }

    default public R id_protected(int n) {
        return this.id_class(rrSu_1.id_native.id_break(new rrSl_1(0, 0, n)));
    }
}

