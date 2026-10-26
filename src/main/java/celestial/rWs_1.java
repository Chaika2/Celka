/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Oo_1;
import celestial.rWB;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rhN_2;
import celestial.rkU_2;
import celestial.rka_3;
import celestial.rkw_3;
import celestial.rqO_2;
import celestial.rqX_2;
import celestial.rva_3;
import celestial.rvi_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rWs_1
extends rkU_2 {
    private static final Logger id_byte = LogManager.getLogger();

    public void id_class(rhN_2 rhN_22) {
        rhN_22.id_class.id_class(new rva_3(rvi_3.INIT, this.id_class, this.id_break, this.id_break()));
    }

    private void id_class(rcy_3 rcy_32, Consumer<rkw_3<?>> consumer, rWB rWB2) {
        for (int i = 0; i < rcy_32.size(); ++i) {
            String string = rcy_32.id_implements(i);
            try {
                rqO_2 rqO_22 = new rqO_2(string);
                Optional<rkw_3<?>> optional = rWB2.id_class(rqO_22);
                if (!optional.isPresent()) {
                    id_byte.error("Tried to load unrecognized recipe: {} removed now.", (Object)rqO_22);
                    continue;
                }
                consumer.accept(optional.get());
                continue;
            }
            catch (rqX_2 rqX_22) {
                id_byte.error("Tried to load improperly formatted recipe: {} removed now.", (Object)string);
            }
        }
    }

    public rcd_3 id_class() {
        rcd_3 rcd_32 = new rcd_3();
        this.id_break().id_break(rcd_32);
        rcy_3 rcy_32 = new rcy_3();
        for (Object object : this.id_class) {
            rcy_32.add(rca_3.id_class(((rqO_2)object).toString()));
        }
        rcd_32.id_class("recipes", rcy_32);
        rcy_3 rcy_33 = new rcy_3();
        for (rqO_2 rqO_22 : this.id_break) {
            rcy_33.add(rca_3.id_class(rqO_22.toString()));
        }
        rcd_32.id_class("toBeDisplayed", rcy_33);
        return rcd_32;
    }

    public void id_class(rcd_3 rcd_32, rWB rWB2) {
        this.id_class(rka_3.id_class(rcd_32));
        rcy_3 rcy_32 = rcd_32.id_protected("recipes", 8);
        this.id_class(rcy_32, this::id_class, rWB2);
        rcy_3 rcy_33 = rcd_32.id_protected("toBeDisplayed", 8);
        this.id_class(rcy_33, this::id_case, rWB2);
    }

    private void id_class(rvi_3 rvi_32, rhN_2 rhN_22, List<rqO_2> list) {
        rhN_22.id_class.id_class(new rva_3(rvi_32, list, Collections.emptyList(), this.id_break()));
    }

    public int id_class(Collection<rkw_3<?>> collection, rhN_2 rhN_22) {
        ArrayList arrayList = Lists.newArrayList();
        int n = 0;
        for (rkw_3<?> rkw_32 : collection) {
            rqO_2 rqO_22 = rkw_32.id_case();
            if (this.id_class.contains(rqO_22) || rkw_32.id_implements()) continue;
            this.id_class(rqO_22);
            this.id_protected(rqO_22);
            arrayList.add(rqO_22);
            Oo_1.id_case.id_class(rhN_22, rkw_32);
            ++n;
        }
        this.id_class(rvi_3.ADD, rhN_22, arrayList);
        return n;
    }

    public int id_break(Collection<rkw_3<?>> collection, rhN_2 rhN_22) {
        ArrayList arrayList = Lists.newArrayList();
        int n = 0;
        for (rkw_3<?> rkw_32 : collection) {
            rqO_2 rqO_22 = rkw_32.id_case();
            if (!this.id_class.contains(rqO_22)) continue;
            this.id_byte(rqO_22);
            arrayList.add(rqO_22);
            ++n;
        }
        this.id_class(rvi_3.REMOVE, rhN_22, arrayList);
        return n;
    }
}

