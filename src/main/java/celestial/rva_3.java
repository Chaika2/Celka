/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.At_1;
import celestial.rka_3;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.rvi_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class rva_3
implements ruS_2<At_1> {
    private rvi_3 id_class;
    private List<rqO_2> id_break;
    private List<rqO_2> id_byte;
    private rka_3 id_protected;

    public List<rqO_2> id_byte() {
        return this.id_byte;
    }

    public rva_3(rvi_3 rvi_32, Collection<rqO_2> collection, Collection<rqO_2> collection2, rka_3 rka_32) {
        this.id_class = rvi_32;
        this.id_break = ImmutableList.copyOf(collection);
        this.id_byte = ImmutableList.copyOf(collection2);
        this.id_protected = rka_32;
    }

    public rva_3() {
    }

    public String toString() {
        return "SRecipeBookPacket(state=" + this.id_throws() + ", recipes=" + this.id_break() + ", displayedRecipes=" + this.id_byte() + ", field_244301_d=" + this.id_protected + ")";
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        int n;
        this.id_class = ruu_32.id_class(rvi_3.class);
        this.id_protected = rka_3.id_class(ruu_32);
        int n2 = ruu_32.id_case();
        this.id_break = Lists.newArrayList();
        for (n = 0; n < n2; ++n) {
            this.id_break.add(ruu_32.id_volatile());
        }
        if (this.id_class == rvi_3.INIT) {
            n2 = ruu_32.id_case();
            this.id_byte = Lists.newArrayList();
            for (n = 0; n < n2; ++n) {
                this.id_byte.add(ruu_32.id_volatile());
            }
        }
    }

    public List<rqO_2> id_break() {
        return this.id_break;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        this.id_protected.id_break(ruu_32);
        ruu_32.id_protected(this.id_break.size());
        for (rqO_2 rqO_22 : this.id_break) {
            ruu_32.id_class(rqO_22);
        }
        if (this.id_class == rvi_3.INIT) {
            ruu_32.id_protected(this.id_byte.size());
            for (rqO_2 rqO_22 : this.id_byte) {
                ruu_32.id_class(rqO_22);
            }
        }
    }

    public rvi_3 id_throws() {
        return this.id_class;
    }

    public rka_3 id_protected() {
        return this.id_protected;
    }
}

