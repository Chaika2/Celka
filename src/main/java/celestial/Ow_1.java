/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Functions
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.OI;
import celestial.OT;
import celestial.Ot_1;
import celestial.rqO_2;
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ow_1 {
    private static final Logger id_class = LogManager.getLogger();
    private final Map<rqO_2, OT> id_break = Maps.newHashMap();
    private final Set<OT> id_byte = Sets.newLinkedHashSet();
    private final Set<OT> id_protected = Sets.newLinkedHashSet();
    private OI id_throws;

    public Collection<OT> id_byte() {
        return this.id_break.values();
    }

    public void id_class(OI oI) {
        this.id_throws = oI;
        if (oI != null) {
            for (OT oT : this.id_byte) {
                oI.id_class(oT);
            }
            for (OT oT : this.id_protected) {
                oI.id_byte(oT);
            }
        }
    }

    public OT id_class(rqO_2 rqO_22) {
        return this.id_break.get(rqO_22);
    }

    private void id_class(OT oT) {
        for (OT oT2 : oT.id_throws()) {
            this.id_class(oT2);
        }
        id_class.info("Forgot about advancement {}", (Object)oT.id_private());
        this.id_break.remove(oT.id_private());
        if (oT.id_break() == null) {
            this.id_byte.remove(oT);
            if (this.id_throws != null) {
                this.id_throws.id_break(oT);
            }
        } else {
            this.id_protected.remove(oT);
            if (this.id_throws != null) {
                this.id_throws.id_protected(oT);
            }
        }
    }

    public void id_class(Map<rqO_2, Ot_1> map) {
        Function function = Functions.forMap(this.id_break, (Object)null);
        while (!map.isEmpty()) {
            boolean bl = false;
            Iterator<Map.Entry<rqO_2, Ot_1>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<rqO_2, Ot_1> entry = iterator.next();
                rqO_2 object = entry.getKey();
                Ot_1 ot_1 = (Ot_1)entry.getValue();
                if (!ot_1.id_class((java.util.function.Function<rqO_2, OT>)function)) continue;
                OT oT = ot_1.id_break(object);
                this.id_break.put(object, oT);
                bl = true;
                iterator.remove();
                if (oT.id_break() == null) {
                    this.id_byte.add(oT);
                    if (this.id_throws == null) continue;
                    this.id_throws.id_class(oT);
                    continue;
                }
                this.id_protected.add(oT);
                if (this.id_throws == null) continue;
                this.id_throws.id_byte(oT);
            }
            if (bl) continue;
            for (Map.Entry entry : map.entrySet()) {
                id_class.error("Couldn't load advancement {}: {}", entry.getKey(), entry.getValue());
            }
        }
        id_class.info("Loaded {} advancements", (Object)this.id_break.size());
    }

    public void id_class() {
        this.id_break.clear();
        this.id_byte.clear();
        this.id_protected.clear();
        if (this.id_throws != null) {
            this.id_throws.id_class();
        }
    }

    public void id_class(Set<rqO_2> set) {
        for (rqO_2 rqO_22 : set) {
            OT oT = this.id_break.get(rqO_22);
            if (oT == null) {
                id_class.warn("Told to remove advancement {} but I don't know what that is", (Object)rqO_22);
                continue;
            }
            this.id_class(oT);
        }
    }

    public Iterable<OT> id_break() {
        return this.id_byte;
    }
}

