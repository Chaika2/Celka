/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXu_1;
import celestial.rYB;
import celestial.rjC_2;
import celestial.rjw_3;
import celestial.xd_3;

public interface rHI
extends rXu_1 {
    public static final rjC_2 id_class = xd_3.id_class(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
    public static final rjC_2 id_break = xd_3.id_class(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
    public static final rjC_2 c_ = rjw_3.id_class(id_class, id_break);

    default public rjC_2 id_byte() {
        return c_;
    }

    public double id_instanceof();

    public double id_throw();

    public double id_try();

    public rYB id_while();
}

