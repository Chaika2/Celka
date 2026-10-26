/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fV_2;
import java.util.Collection;

public class yG_2
extends RuntimeException {
    private final Collection<fV_2> id_class;

    public yG_2(fV_2 fV_22, Collection<fV_2> collection) {
        super(String.format("Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", fV_22.id_class(), fV_22.id_break(), fV_22.id_byte()));
        this.id_class = collection;
    }

    public yG_2(fV_2 fV_22, Collection<fV_2> collection, int n, int n2, int n3, int n4) {
        super(String.format("Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?", "" + fV_22.id_class(), fV_22.id_break(), fV_22.id_byte(), n, n2, n3, n4));
        this.id_class = collection;
    }

    public Collection<fV_2> id_class() {
        return this.id_class;
    }
}

