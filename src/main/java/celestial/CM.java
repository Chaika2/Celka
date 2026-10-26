/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CL;
import celestial.gm_3;
import celestial.rLQ;
import java.util.Objects;

public class CM
extends CL {
    private int id_class;
    private final int id_break;

    public CM(gm_3 gm_32, double d, double d2, double d3) {
        super(gm_32, d, d2, d3, 0.0, 0.0, 0.0);
        this.id_break = 8;
    }

    @Override
    public void id_case() {
        for (int i = 0; i < 6; ++i) {
            double d = this.id_catch + (this.id_continue.nextDouble() - this.id_continue.nextDouble()) * 4.0;
            double d2 = this.id_private + (this.id_continue.nextDouble() - this.id_continue.nextDouble()) * 4.0;
            double d3 = this.id_implements + (this.id_continue.nextDouble() - this.id_continue.nextDouble()) * 4.0;
            float f = this.id_class;
            Objects.requireNonNull(this);
            this.id_byte.id_class(rLQ.id_return, d, d2, d3, (double)(f / 8.0f), 0.0, 0.0);
        }
        ++this.id_class;
        Objects.requireNonNull(this);
        if (this.id_class == 8) {
            this.id_finally();
        }
    }
}

