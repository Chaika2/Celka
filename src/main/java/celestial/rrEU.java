/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rcd_3;
import celestial.rqO_2;
import celestial.rrEe_1;
import celestial.rrEi_1;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class rrEU {
    private final Map<String, rrEe_1> id_class = Maps.newHashMap();
    private final rrEi_1 id_break;

    private /* synthetic */ rrEe_1 id_byte(String string, String string2) {
        return this.id_class(string, string2);
    }

    public rrEU(rrEi_1 rrEi_12) {
        this.id_break = rrEi_12;
    }

    public Stream<rqO_2> id_class() {
        return this.id_class.entrySet().stream().flatMap(entry -> ((rrEe_1)entry.getValue()).id_break((String)entry.getKey()));
    }

    private static String id_class(String string) {
        return "command_storage_" + string;
    }

    public rcd_3 id_class(rqO_2 rqO_22) {
        String string;
        String string2 = rqO_22.id_byte();
        rrEe_1 rrEe_12 = this.id_break.id_break(() -> this.id_byte(string2, string = rrEU.id_class(string2)), string);
        return rrEe_12 != null ? rrEe_12.id_class(rqO_22.id_break()) : new rcd_3();
    }

    public void id_class(rqO_2 rqO_22, rcd_3 rcd_32) {
        String string = rqO_22.id_byte();
        String string2 = rrEU.id_class(string);
        this.id_break.id_class(() -> this.id_class(string, string2), string2).id_class(rqO_22.id_break(), rcd_32);
    }

    private rrEe_1 id_class(String string, String string2) {
        rrEe_1 rrEe_12 = new rrEe_1(string2);
        this.id_class.put(string, rrEe_12);
        return rrEe_12;
    }
}

