/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hh_1;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.an_3;
import celestial.rYB;
import celestial.rjC_2;
import celestial.rqR_2;
import celestial.yD_2;
import celestial.yX_2;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class yo_3
implements yD_2 {
    private final QY id_class;
    private double id_break = Double.MIN_VALUE;
    private List<rjC_2> id_byte = Collections.emptyList();

    public yo_3(QY qY) {
        this.id_class = qY;
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        Object object;
        double d4 = rqR_2.id_byte();
        if (d4 - this.id_break > 1.0E8) {
            this.id_break = d4;
            object = ((Hh_1)this.id_class.id_class[16]).id_finally().id_catch();
            this.id_byte = ((rYB)((an_3)object).id_throws[7]).id_byte((an_3)object, ((an_3)object).rN().id_class(6.0), an_32 -> true).collect(Collectors.toList());
        }
        object = hx_1.getBuffer(HU.id_return());
        for (rjC_2 rjC_22 : this.id_byte) {
            yX_2.id_class(ml_1, (Ok_1)object, rjC_22, -d, -d2, -d3, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
}

