/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.cm_3;
import celestial.fY_2;
import celestial.rAc_1;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.uG_2;
import celestial.uM_2;
import celestial.uQ_2;
import celestial.uc_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ub_3
implements AutoCloseable {
    public static final Logger id_break = LogManager.getLogger();
    public static final rqO_2 id_class = new rqO_2("minecraft", "missing");
    private final uG_2 id_byte;
    public final Map<rqO_2, uG_2> id_protected = Maps.newHashMap();
    public final fY_2 id_throws;
    private Map<rqO_2, rqO_2> id_case = ImmutableMap.of();
    private final rAc_1 id_catch = new uM_2(this);

    public ub_3(fY_2 fY_22) {
        this.id_throws = fY_22;
        this.id_byte = rqR_2.id_class(new uG_2(fY_22, id_class), uG_22 -> uG_22.id_class(Lists.newArrayList((Object[])new uc_3[]{new uQ_2()})));
    }

    public void id_class(Map<rqO_2, rqO_2> map) {
        this.id_case = map;
    }

    public cm_3 id_class() {
        return new cm_3(rqO_22 -> this.id_protected.getOrDefault(this.id_case.getOrDefault(rqO_22, (rqO_2)rqO_22), this.id_byte));
    }

    @Override
    public void close() {
        this.id_protected.values().forEach(uG_2::close);
        this.id_byte.close();
    }

    public rAc_1 id_break() {
        return this.id_catch;
    }
}

