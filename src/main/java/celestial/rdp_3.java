/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rWB;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rkw_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rqO_2;
import celestial.rym_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rdp_3
extends rdb_3 {
    private static final Logger id_class = LogManager.getLogger();

    public rdp_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rcd_3 rcd_32 = rdn_32.id_package();
        if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
            rhd_32.id_class(rpm_32, rdn_3.id_break);
        }
        if (rcd_32 != null && rcd_32.id_byte("Recipes", 9)) {
            if (!rYB2.id_continue) {
                rcy_3 rcy_32 = rcd_32.id_protected("Recipes", 8);
                ArrayList arrayList = Lists.newArrayList();
                rWB rWB2 = rYB2.id_const().V();
                for (int i = 0; i < rcy_32.size(); ++i) {
                    String string = rcy_32.id_implements(i);
                    Optional<rkw_3<?>> optional = rWB2.id_class(new rqO_2(string));
                    if (!optional.isPresent()) {
                        id_class.error("Invalid recipe: {}", (Object)string);
                        return rym_3.id_protected(rdn_32);
                    }
                    arrayList.add(optional.get());
                }
                rhd_32.id_break(arrayList);
                rhd_32.id_class(rlB_2.id_byte.id_break(this));
            }
            return rym_3.id_class(rdn_32, rYB2.id_import());
        }
        id_class.error("Tag not valid: {}", (Object)rcd_32);
        return rym_3.id_protected(rdn_32);
    }
}

