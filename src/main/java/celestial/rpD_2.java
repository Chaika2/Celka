/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rpU_2;
import celestial.rrLa_1;
import celestial.rrLi_1;
import celestial.ryY_2;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;

public class rpD_2
implements ryY_2 {
    private final Map<rdb_3, rpU_2> id_class = Maps.newHashMap();
    private int id_break;

    protected void id_byte(rdb_3 rdb_32) {
    }

    public void id_class() {
        ++this.id_break;
        if (!this.id_class.isEmpty()) {
            Iterator<Map.Entry<rdb_3, rpU_2>> iterator = this.id_class.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<rdb_3, rpU_2> entry = iterator.next();
                if (entry.getValue().id_break > this.id_break) continue;
                iterator.remove();
                this.id_byte(entry.getKey());
            }
        }
    }

    public void id_class(rdb_3 rdb_32, int n) {
        this.id_class.put(rdb_32, new rpU_2(this.id_break, this.id_break + n));
        this.id_break(rdb_32, n);
        rrLa_1.id_break(rdb_32.id_continue(), rrLi_1.id_class(n));
    }

    public boolean id_class(rdb_3 rdb_32) {
        return this.id_class(rdb_32, 0.0f) > 0.0f;
    }

    public boolean id_class(rdb_3 ... rdb_3Array) {
        for (rdb_3 rdb_32 : rdb_3Array) {
            if (!this.id_class(rdb_32)) continue;
            return true;
        }
        return false;
    }

    public float id_class(rdb_3 rdb_32, float f) {
        if (rdb_32 == rdy_3.id_class || this.id_class.isEmpty()) {
            return 0.0f;
        }
        rpU_2 rpU_22 = this.id_class.get(rdb_32);
        if (rpU_22 != null) {
            float f2 = rpU_22.id_break - rpU_22.id_class;
            float f3 = (float)rpU_22.id_break - ((float)this.id_break + f);
            return rfU_2.id_class(f3 / f2, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    protected void id_break(rdb_3 rdb_32, int n) {
    }

    public void id_break(rdb_3 rdb_32) {
        this.id_class.remove(rdb_32);
        this.id_byte(rdb_32);
        rrLa_1.id_break(rdb_32.id_continue(), rrLi_1.id_class());
    }

    public int id_protected(rdb_3 rdb_32) {
        if (rdb_32 == rdy_3.id_class || this.id_class.isEmpty()) {
            return 0;
        }
        rpU_2 rpU_22 = this.id_class.get(rdb_32);
        if (rpU_22 != null) {
            return rpU_22.id_break - this.id_break;
        }
        return 0;
    }
}

