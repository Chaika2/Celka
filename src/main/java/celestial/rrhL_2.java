/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.TD;
import celestial.aI_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.qt_3;
import celestial.rrMa_1;
import celestial.rrbb_3;
import celestial.rrhu_3;
import celestial.wc_3;
import celestial.wu_3;
import java.util.Iterator;
import java.util.List;

public class rrhL_2
extends rrhu_3 {
    public rrhL_2() {
        super(aI_2.Z, "sheep_wool", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        TD tD;
        qt_3 qt_32;
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pV_2 pV_22 = pg_32.id_throws().get(aI_2.Z);
        if (!(pV_22 instanceof qt_3)) {
            rrbb_3.id_protected("Not a RenderSheep: " + pV_22);
            return null;
        }
        if (pV_22.id_byte() == null) {
            qt_32 = new qt_3(pg_32);
            qt_32.id_throws = new wc_3();
            qt_32.id_byte = 0.7f;
            pV_22 = qt_32;
        }
        qt_32 = (qt_3)pV_22;
        List list = qt_32.id_throws();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            tD = iterator.next();
            if (!(tD instanceof TD)) continue;
            iterator.remove();
        }
        tD = new TD(qt_32);
        tD.id_class = (wu_3)in_1;
        qt_32.id_class(tD);
        return qt_32;
    }

    @Override
    public In_1 id_throws() {
        return new wu_3();
    }
}

