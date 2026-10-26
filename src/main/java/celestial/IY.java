/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.IF;
import celestial.IJ;
import celestial.IR;
import celestial.Ik_1;
import celestial.fj_3;
import celestial.rpr_3;
import celestial.wK_2;
import celestial.we_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class IY {
    private final List<wK_2> id_class = Lists.newArrayList();
    private final Map<rpr_3, List<wK_2>> id_break = Maps.newEnumMap(rpr_3.class);
    private final IF id_byte;
    private final boolean id_protected;
    private fj_3 id_throws;
    private final boolean id_case;
    private final boolean id_catch;
    private final Ik_1 id_private;

    public IY(we_3 we_32, IF iF, boolean bl) {
        this(we_32.id_break(), we_32.id_byte().id_class(), bl, we_32.id_catch(), iF);
    }

    private IY(boolean bl, boolean bl2, boolean bl3, Ik_1 ik_1, IF iF) {
        for (rpr_3 rpr_32 : rpr_3.values()) {
            this.id_break.put(rpr_32, Lists.newArrayList());
        }
        this.id_byte = iF;
        this.id_protected = bl;
        this.id_case = bl2;
        this.id_catch = bl3;
        this.id_private = ik_1;
    }

    public IY id_class(fj_3 fj_32) {
        this.id_throws = fj_32;
        return this;
    }

    public IJ id_class() {
        if (this.id_throws == null) {
            throw new RuntimeException("Missing particle!");
        }
        return new IR(this.id_class, this.id_break, this.id_protected, this.id_case, this.id_catch, this.id_throws, this.id_private, this.id_byte);
    }

    public IY id_class(wK_2 wK_22) {
        this.id_class.add(wK_22);
        return this;
    }

    public IY id_class(rpr_3 rpr_32, wK_2 wK_22) {
        this.id_break.get(rpr_32).add(wK_22);
        return this;
    }
}

