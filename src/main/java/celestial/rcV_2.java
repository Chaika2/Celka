/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.RecordBuilder$AbstractStringBuilder
 */
package celestial;

import celestial.rcN_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import com.google.common.collect.Maps;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import java.util.Map;

public class rcV_2
extends RecordBuilder.AbstractStringBuilder<rcZ_2, rcd_3> {
    protected rcV_2(rcf_3 rcf_32) {
        super((DynamicOps)rcf_32);
    }

    protected /* synthetic */ Object append(String string, Object object, Object object2) {
        return this.id_class(string, (rcZ_2)object, (rcd_3)object2);
    }

    protected DataResult<rcZ_2> id_class(rcd_3 rcd_32, rcZ_2 rcZ_22) {
        if (rcZ_22 != null && rcZ_22 != rcN_2.id_break) {
            if (!(rcZ_22 instanceof rcd_3)) {
                return DataResult.error((String)("mergeToMap called with not a map: " + rcZ_22), (Object)rcZ_22);
            }
            rcd_3 rcd_33 = new rcd_3(Maps.newHashMap(((rcd_3)rcZ_22).id_private()));
            for (Map.Entry<String, rcZ_2> entry : rcd_32.id_private().entrySet()) {
                rcd_33.id_class(entry.getKey(), entry.getValue());
            }
            return DataResult.success((Object)rcd_33);
        }
        return DataResult.success((Object)rcd_32);
    }

    protected rcd_3 id_class(String string, rcZ_2 rcZ_22, rcd_3 rcd_32) {
        rcd_32.id_class(string, rcZ_22);
        return rcd_32;
    }

    protected rcd_3 id_class() {
        return new rcd_3();
    }

    protected /* synthetic */ DataResult build(Object object, Object object2) {
        return this.id_class((rcd_3)object, (rcZ_2)object2);
    }

    protected /* synthetic */ Object initBuilder() {
        return this.id_class();
    }
}

