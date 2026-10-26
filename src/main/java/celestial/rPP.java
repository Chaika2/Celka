/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rPZ;
import celestial.rPm_1;
import celestial.rTB;
import celestial.rrEm_1;
import celestial.rri_3;

public final class rPP
extends rri_3 {
    @Override
    public <E extends iB_2> void id_class(rTB<rPm_1<? super E>> rTB2, rrEm_1 rrEm_12, E e, long l) {
        rTB2.id_byte().filter(rPm_12 -> rPm_12.id_class() == rPZ.STOPPED).forEach(rPm_12 -> rPm_12.id_throws(rrEm_12, e, l));
    }
}

