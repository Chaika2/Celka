/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.XC;
import celestial.XF;
import celestial.Xh_1;
import celestial.hT_2;
import celestial.rLi_1;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rlb_3;
import celestial.rpL_2;
import com.google.common.collect.Lists;
import java.util.List;

public class XX {
    private final List<hT_2> id_class = Lists.newArrayList();
    private final List<hT_2> id_break = Lists.newArrayList();
    private rdb_3 id_byte;
    private rlb_3<rdb_3> id_protected;
    private XF id_throws = XF.id_throws;
    private XF id_case = XF.id_throws;
    private rLi_1 id_catch;
    private XC id_private = XC.id_class;

    private XX() {
    }

    public XX id_class(rlb_3<rdb_3> rlb_32) {
        this.id_protected = rlb_32;
        return this;
    }

    public XX id_class(rcd_3 rcd_32) {
        this.id_private = new XC(rcd_32);
        return this;
    }

    public XX id_class(hT_2 hT_22) {
        this.id_class.add(hT_22);
        return this;
    }

    public XX id_class(rpL_2 rpL_22) {
        this.id_byte = rpL_22.id_case();
        return this;
    }

    public static XX id_class() {
        return new XX();
    }

    public Xh_1 id_break() {
        return new Xh_1(this.id_protected, this.id_byte, this.id_throws, this.id_case, this.id_class.toArray(hT_2.id_break), this.id_break.toArray(hT_2.id_break), this.id_catch, this.id_private);
    }
}

