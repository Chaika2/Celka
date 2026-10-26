/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  org.apache.commons.lang3.mutable.MutableObject
 */
package celestial;

import celestial.kW_2;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rVL;
import celestial.reJ_2;
import celestial.reN_2;
import celestial.reQ_2;
import celestial.reW_2;
import celestial.reZ_2;
import celestial.rek_3;
import celestial.rel_3;
import celestial.rem_3;
import celestial.reu_3;
import celestial.rev_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjw_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPp_1;
import celestial.rrPt_1;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableObject;

public final class rez_3 {
    private final rVL<reu_3> id_class;
    private final int id_break;
    private final reN_2 id_byte;
    private final rKd_1 id_protected;
    private final rrPt_1 id_throws;
    private final List<? super rel_3> id_case;
    private final Random id_catch;
    public final Deque<reQ_2> id_private = Queues.newArrayDeque();

    public rez_3(rVL<reu_3> rVL2, int n, reN_2 reN_22, rKd_1 rKd_12, rrPt_1 rrPt_12, List<? super rel_3> list, Random random) {
        this.id_class = rVL2;
        this.id_break = n;
        this.id_byte = reN_22;
        this.id_protected = rKd_12;
        this.id_throws = rrPt_12;
        this.id_case = list;
        this.id_catch = random;
    }

    public void id_class(rel_3 rel_32, MutableObject<rjC_2> mutableObject, int n, int n2, boolean bl) {
        rev_3 rev_32 = rel_32.id_break();
        rfH_2 rfH_22 = rel_32.id_byte();
        rqd_3 rqd_32 = rel_32.id_class();
        rem_3 rem_32 = rev_32.id_byte();
        boolean bl2 = rem_32 == rem_3.RIGID;
        MutableObject<rjC_2> mutableObject2 = new MutableObject<rjC_2>();
        rfi_3 rfi_32 = rel_32.id_catch();
        int n3 = rfi_32.id_break;
        block0: for (rrPp_1 rrPp_13 : rev_32.id_class(this.id_throws, rfH_22, rqd_32, this.id_catch)) {
            rpr_3 rpr_32 = kW_2.id_private(rrPp_13.id_break);
            rfH_2 rfH_23 = rrPp_13.id_class;
            rfH_2 rfH_24 = rfH_23.id_break(rpr_32);
            int n4 = rfH_23.c_() - n3;
            int n5 = -1;
            rqO_2 rqO_22 = new rqO_2(rrPp_13.id_byte.id_native("pool"));
            Optional<reu_3> optional = this.id_class.id_break(rqO_22);
            if (optional.isPresent() && (optional.get().id_byte() != 0 || Objects.equals(rqO_22, reZ_2.id_class.id_class()))) {
                rqO_2 rqO_23 = optional.get().id_class();
                Optional<reu_3> optional2 = this.id_class.id_break(rqO_23);
                if (optional2.isPresent() && (optional2.get().id_byte() != 0 || Objects.equals(rqO_23, reZ_2.id_class.id_class()))) {
                    rev_3 rev_33;
                    int n6;
                    MutableObject<rjC_2> mutableObject3;
                    boolean bl3 = rfi_32.id_break(rfH_24);
                    if (bl3) {
                        mutableObject3 = mutableObject2;
                        n6 = n3;
                        if (mutableObject2.getValue() == null) {
                            mutableObject2.setValue((Object)rjw_3.id_class(rfl_3.id_class(rfi_32)));
                        }
                    } else {
                        mutableObject3 = mutableObject;
                        n6 = n;
                    }
                    ArrayList arrayList = Lists.newArrayList();
                    if (n2 != this.id_break) {
                        arrayList.addAll(optional.get().id_break(this.id_catch));
                    }
                    arrayList.addAll(optional2.get().id_break(this.id_catch));
                    Iterator iterator = arrayList.iterator();
                    while (iterator.hasNext() && (rev_33 = (rev_3)iterator.next()) != reJ_2.id_break) {
                        for (rqd_3 rqd_33 : rqd_3.id_break(this.id_catch)) {
                            List<rrPp_1> list = rev_33.id_class(this.id_throws, rfH_2.id_protected, rqd_33, this.id_catch);
                            rfi_3 rfi_33 = rev_33.id_class(this.id_throws, rfH_2.id_protected, rqd_33);
                            int n7 = bl && rfi_33.id_throws() <= 16 ? list.stream().mapToInt(rrPp_12 -> {
                                if (!rfi_33.id_break(rrPp_12.id_class.id_break(kW_2.id_private(rrPp_12.id_break)))) {
                                    return 0;
                                }
                                rqO_2 rqO_22 = new rqO_2(rrPp_12.id_byte.id_native("pool"));
                                Optional<reu_3> optional = this.id_class.id_break(rqO_22);
                                Optional<Integer> optional2 = optional.flatMap(reu_32 -> this.id_class.id_break(reu_32.id_class()));
                                int n = optional.map(reu_32 -> reu_32.id_class(this.id_throws)).orElse(0);
                                int n2 = optional2.map(reu_32 -> reu_32.id_class(this.id_throws)).orElse(0);
                                return Math.max(n, n2);
                            }).max().orElse(0) : 0;
                            for (rrPp_1 rrPp_14 : list) {
                                int n8;
                                int n9;
                                int n10;
                                if (!kW_2.id_class(rrPp_13, rrPp_14)) continue;
                                rfH_2 rfH_25 = rrPp_14.id_class;
                                rfH_2 rfH_26 = new rfH_2(rfH_24.b_() - rfH_25.b_(), rfH_24.c_() - rfH_25.c_(), rfH_24.d_() - rfH_25.d_());
                                rfi_3 rfi_34 = rev_33.id_class(this.id_throws, rfH_26, rqd_33);
                                int n11 = rfi_34.id_break;
                                rem_3 rem_33 = rev_33.id_byte();
                                boolean bl4 = rem_33 == rem_3.RIGID;
                                int n12 = rfH_25.c_();
                                int n13 = n4 - n12 + kW_2.id_private(rrPp_13.id_break).id_finally();
                                if (bl2 && bl4) {
                                    n10 = n3 + n13;
                                } else {
                                    if (n5 == -1) {
                                        n5 = this.id_protected.id_break(rfH_23.b_(), rfH_23.d_(), rKv_1.WORLD_SURFACE_WG);
                                    }
                                    n10 = n5 - n12;
                                }
                                int n14 = n10 - n11;
                                rfi_3 rfi_35 = rfi_34.id_break(0, n14, 0);
                                rfH_2 rfH_27 = rfH_26.id_break(0, n14, 0);
                                if (n7 > 0) {
                                    n9 = Math.max(n7 + 1, rfi_35.id_throws - rfi_35.id_break);
                                    rfi_35.id_throws = rfi_35.id_break + n9;
                                }
                                if (rjw_3.id_byte((rjC_2)mutableObject3.getValue(), rjw_3.id_class(rfl_3.id_class(rfi_35).id_break(0.25)), rjN_2.id_byte)) continue;
                                mutableObject3.setValue((Object)rjw_3.id_break((rjC_2)mutableObject3.getValue(), rjw_3.id_class(rfl_3.id_class(rfi_35)), rjN_2.id_throws));
                                n9 = rel_32.id_protected();
                                int n15 = bl4 ? n9 - n13 : rev_33.id_protected();
                                rel_3 rel_33 = this.id_byte.create(this.id_throws, rev_33, rfH_27, n15, rqd_33, rfi_35);
                                if (bl2) {
                                    n8 = n3 + n4;
                                } else if (bl4) {
                                    n8 = n10 + n12;
                                } else {
                                    if (n5 == -1) {
                                        n5 = this.id_protected.id_break(rfH_23.b_(), rfH_23.d_(), rKv_1.WORLD_SURFACE_WG);
                                    }
                                    n8 = n5 + n13 / 2;
                                }
                                rel_32.id_class(new rek_3(rfH_24.b_(), n8 - n4 + n9, rfH_24.d_(), n13, rem_33));
                                rel_33.id_class(new rek_3(rfH_23.b_(), n8 - n12 + n15, rfH_23.d_(), -n13, rem_32));
                                this.id_case.add(rel_33);
                                if (n2 + 1 > this.id_break) continue block0;
                                this.id_private.addLast(new reQ_2(rel_33, mutableObject3, n6, n2 + 1));
                                continue block0;
                            }
                        }
                    }
                    continue;
                }
                reW_2.id_class.warn("Empty or none existent fallback pool: {}", (Object)rqO_23);
                continue;
            }
            reW_2.id_class.warn("Empty or none existent pool: {}", (Object)rqO_22);
        }
    }
}

