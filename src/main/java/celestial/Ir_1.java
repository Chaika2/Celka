/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.IP;
import celestial.IU;
import celestial.fS_2;
import celestial.rpY_2;
import com.google.common.collect.Maps;
import java.io.Reader;
import java.util.List;
import java.util.Map;

public class Ir_1 {
    private final Map<String, IU> id_class = Maps.newLinkedHashMap();
    private fS_2 id_break;

    public fS_2 id_byte() {
        return this.id_break;
    }

    public Ir_1(List<Ir_1> list) {
        Ir_1 ir_1 = null;
        for (Ir_1 ir_12 : list) {
            if (ir_12.id_break()) {
                this.id_class.clear();
                ir_1 = ir_12;
            }
            this.id_class.putAll(ir_12.id_class);
        }
        if (ir_1 != null) {
            this.id_break = ir_1.id_break;
        }
    }

    public Ir_1(Map<String, IU> map, fS_2 fS_22) {
        this.id_break = fS_22;
        this.id_class.putAll(map);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Ir_1) {
            Ir_1 ir_1 = (Ir_1)object;
            if (this.id_class.equals(ir_1.id_class)) {
                return this.id_break() ? this.id_break.equals(ir_1.id_break) : !ir_1.id_break();
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.id_class.hashCode() + (this.id_break() ? this.id_break.hashCode() : 0);
    }

    public Map<String, IU> id_class() {
        return this.id_class;
    }

    public static Ir_1 id_class(IP iP, Reader reader) {
        return rpY_2.id_class(iP.id_class, reader, Ir_1.class);
    }

    public boolean id_break() {
        return this.id_break != null;
    }
}

