/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.AM;
import celestial.Aq_1;
import celestial.OT;
import celestial.Oj_1;
import celestial.Ow_1;
import celestial.QY;
import celestial.rZI;
import celestial.rZc_1;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ab_1 {
    private static final Logger id_class = LogManager.getLogger();
    private final QY id_break;
    private final Ow_1 id_byte = new Ow_1();
    private final Map<OT, Oj_1> id_protected = Maps.newHashMap();
    private AM id_throws;
    private OT id_case;

    public Ab_1(QY qY) {
        this.id_break = qY;
    }

    public void id_class(OT oT, boolean bl) {
        Aq_1 aq_1 = this.id_break.id_void();
        if (aq_1 != null && oT != null && bl) {
            aq_1.id_class(rZc_1.id_class(oT));
        }
        if (this.id_case != oT) {
            this.id_case = oT;
            if (this.id_throws != null) {
                this.id_throws.id_throws(oT);
            }
        }
    }

    public void id_class(AM aM) {
        this.id_throws = aM;
        this.id_byte.id_class(aM);
        if (aM != null) {
            for (Map.Entry<OT, Oj_1> entry : this.id_protected.entrySet()) {
                aM.id_class(entry.getKey(), entry.getValue());
            }
            aM.id_throws(this.id_case);
        }
    }

    public void id_class(rZI rZI2) {
        if (rZI2.id_throws()) {
            this.id_byte.id_class();
            this.id_protected.clear();
        }
        this.id_byte.id_class(rZI2.id_byte());
        this.id_byte.id_class(rZI2.id_break());
        for (Map.Entry<rqO_2, Oj_1> entry : rZI2.id_protected().entrySet()) {
            OT oT = this.id_byte.id_class(entry.getKey());
            if (oT != null) {
                Oj_1 oj_1 = entry.getValue();
                oj_1.id_class(oT.id_case(), oT.id_implements());
                this.id_protected.put(oT, oj_1);
                if (this.id_throws == null) continue;
                this.id_throws.id_class(oT, oj_1);
                continue;
            }
            id_class.warn("Server informed client about progress for unknown advancement {}", (Object)entry.getKey());
        }
    }

    public Ow_1 id_class() {
        return this.id_byte;
    }
}

