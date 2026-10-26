/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IG;
import celestial.IM;
import celestial.rje_3;
import celestial.rpr_3;
import java.util.Map;

public class IS {
    public final rje_3 id_class;
    public final rje_3 id_break;
    public final Map<rpr_3, IG> id_byte;
    public final IM id_protected;
    public final boolean id_throws;

    public IS(rje_3 rje_32, rje_3 rje_33, Map<rpr_3, IG> map, IM iM, boolean bl) {
        this.id_class = rje_32;
        this.id_break = rje_33;
        this.id_byte = map;
        this.id_protected = iM;
        this.id_throws = bl;
        this.id_class();
    }

    private void id_class() {
        for (Map.Entry<rpr_3, IG> entry : this.id_byte.entrySet()) {
            float[] fArray = this.id_class(entry.getKey());
            entry.getValue().id_protected.id_class(fArray);
        }
    }

    private float[] id_class(rpr_3 rpr_32) {
        switch (rpr_32) {
            case DOWN: {
                return new float[]{this.id_class.id_class(), 16.0f - this.id_break.id_byte(), this.id_break.id_class(), 16.0f - this.id_class.id_byte()};
            }
            case UP: {
                return new float[]{this.id_class.id_class(), this.id_class.id_byte(), this.id_break.id_class(), this.id_break.id_byte()};
            }
            default: {
                return new float[]{16.0f - this.id_break.id_class(), 16.0f - this.id_break.id_break(), 16.0f - this.id_class.id_class(), 16.0f - this.id_class.id_break()};
            }
            case SOUTH: {
                return new float[]{this.id_class.id_class(), 16.0f - this.id_break.id_break(), this.id_break.id_class(), 16.0f - this.id_class.id_break()};
            }
            case WEST: {
                return new float[]{this.id_class.id_byte(), 16.0f - this.id_break.id_break(), this.id_break.id_byte(), 16.0f - this.id_class.id_break()};
            }
            case EAST: 
        }
        return new float[]{16.0f - this.id_break.id_byte(), 16.0f - this.id_break.id_break(), 16.0f - this.id_class.id_byte(), 16.0f - this.id_class.id_break()};
    }
}

