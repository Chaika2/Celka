/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rcd_3;
import celestial.rqO_2;
import celestial.rrGc_1;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class rrEe_1
extends rrGc_1 {
    private final Map<String, rcd_3> id_class = Maps.newHashMap();

    @Override
    public rcd_3 id_byte(rcd_3 rcd_32) {
        rcd_3 rcd_34 = new rcd_3();
        this.id_class.forEach((string, rcd_33) -> rcd_34.id_class((String)string, rcd_33.id_catch()));
        rcd_32.id_class("contents", rcd_34);
        return rcd_32;
    }

    public rrEe_1(String string) {
        super(string);
    }

    public void id_class(String string, rcd_3 rcd_32) {
        if (rcd_32.id_case()) {
            this.id_class.remove(string);
        } else {
            this.id_class.put(string, rcd_32);
        }
        this.id_byte();
    }

    public rcd_3 id_class(String string) {
        rcd_3 rcd_32 = this.id_class.get(string);
        return rcd_32 != null ? rcd_32 : new rcd_3();
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        rcd_3 rcd_33 = rcd_32.id_int("contents");
        for (String string : rcd_33.id_protected()) {
            this.id_class.put(string, rcd_33.id_int(string));
        }
    }

    public Stream<rqO_2> id_break(String string) {
        return this.id_class.keySet().stream().map(string2 -> new rqO_2(string, (String)string2));
    }
}

