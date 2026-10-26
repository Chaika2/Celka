/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rqj_3;
import celestial.rrre_1;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class rrrR {
    private final Random id_class;
    public final rrre_1 id_break;
    public final rrre_1 id_byte;
    public final rrre_1[] id_protected;
    public final int id_throws;
    public final int id_case;

    public rrrR(Random random) {
        this.id_class = random;
        int n = 11;
        this.id_throws = 7;
        this.id_case = 4;
        this.id_break = new rrre_1(11, 11, 5);
        this.id_break.id_class(this.id_throws, this.id_case, this.id_throws + 1, this.id_case + 1, 3);
        this.id_break.id_class(this.id_throws - 1, this.id_case, this.id_throws - 1, this.id_case + 1, 2);
        this.id_break.id_class(this.id_throws + 2, this.id_case - 2, this.id_throws + 3, this.id_case + 3, 5);
        this.id_break.id_class(this.id_throws + 1, this.id_case - 2, this.id_throws + 1, this.id_case - 1, 1);
        this.id_break.id_class(this.id_throws + 1, this.id_case + 2, this.id_throws + 1, this.id_case + 3, 1);
        this.id_break.id_class(this.id_throws - 1, this.id_case - 1, 1);
        this.id_break.id_class(this.id_throws - 1, this.id_case + 2, 1);
        this.id_break.id_class(0, 0, 11, 1, 5);
        this.id_break.id_class(0, 9, 11, 11, 5);
        this.id_class(this.id_break, this.id_throws, this.id_case - 2, rpr_3.WEST, 6);
        this.id_class(this.id_break, this.id_throws, this.id_case + 3, rpr_3.WEST, 6);
        this.id_class(this.id_break, this.id_throws - 2, this.id_case - 1, rpr_3.WEST, 3);
        this.id_class(this.id_break, this.id_throws - 2, this.id_case + 2, rpr_3.WEST, 3);
        while (this.id_class(this.id_break)) {
        }
        this.id_protected = new rrre_1[3];
        this.id_protected[0] = new rrre_1(11, 11, 5);
        this.id_protected[1] = new rrre_1(11, 11, 5);
        this.id_protected[2] = new rrre_1(11, 11, 5);
        this.id_class(this.id_break, this.id_protected[0]);
        this.id_class(this.id_break, this.id_protected[1]);
        this.id_protected[0].id_class(this.id_throws + 1, this.id_case, this.id_throws + 1, this.id_case + 1, 0x800000);
        this.id_protected[1].id_class(this.id_throws + 1, this.id_case, this.id_throws + 1, this.id_case + 1, 0x800000);
        this.id_byte = new rrre_1(this.id_break.id_break, this.id_break.id_byte, 5);
        this.id_class();
        this.id_class(this.id_byte, this.id_protected[2]);
    }

    private void id_class(rrre_1 rrre_12, int n, int n2, rpr_3 rpr_32, int n3) {
        if (n3 > 0) {
            rpr_3 rpr_33;
            rrre_12.id_class(n, n2, 1);
            rrre_12.id_class(n + rpr_32.id_implements(), n2 + rpr_32.id_extends(), 0, 1);
            for (int i = 0; i < 8; ++i) {
                rpr_33 = rpr_3.id_break(this.id_class.nextInt(4));
                if (rpr_33 == rpr_32.id_case() || rpr_33 == rpr_3.EAST && this.id_class.nextBoolean()) continue;
                int n4 = n + rpr_32.id_implements();
                int n5 = n2 + rpr_32.id_extends();
                if (rrre_12.id_class(n4 + rpr_33.id_implements(), n5 + rpr_33.id_extends()) != 0 || rrre_12.id_class(n4 + rpr_33.id_implements() * 2, n5 + rpr_33.id_extends() * 2) != 0) continue;
                this.id_class(rrre_12, n + rpr_32.id_implements() + rpr_33.id_implements(), n2 + rpr_32.id_extends() + rpr_33.id_extends(), rpr_33, n3 - 1);
                break;
            }
            rpr_3 rpr_34 = rpr_32.id_catch();
            rpr_33 = rpr_32.id_private();
            rrre_12.id_class(n + rpr_34.id_implements(), n2 + rpr_34.id_extends(), 0, 2);
            rrre_12.id_class(n + rpr_33.id_implements(), n2 + rpr_33.id_extends(), 0, 2);
            rrre_12.id_class(n + rpr_32.id_implements() + rpr_34.id_implements(), n2 + rpr_32.id_extends() + rpr_34.id_extends(), 0, 2);
            rrre_12.id_class(n + rpr_32.id_implements() + rpr_33.id_implements(), n2 + rpr_32.id_extends() + rpr_33.id_extends(), 0, 2);
            rrre_12.id_class(n + rpr_32.id_implements() * 2, n2 + rpr_32.id_extends() * 2, 0, 2);
            rrre_12.id_class(n + rpr_34.id_implements() * 2, n2 + rpr_34.id_extends() * 2, 0, 2);
            rrre_12.id_class(n + rpr_33.id_implements() * 2, n2 + rpr_33.id_extends() * 2, 0, 2);
        }
    }

    private boolean id_class(rrre_1 rrre_12) {
        boolean bl = false;
        for (int i = 0; i < rrre_12.id_byte; ++i) {
            for (int j = 0; j < rrre_12.id_break; ++j) {
                if (rrre_12.id_class(j, i) != 0) continue;
                int n = 0;
                n += rrrR.id_class(rrre_12, j + 1, i) ? 1 : 0;
                n += rrrR.id_class(rrre_12, j - 1, i) ? 1 : 0;
                n += rrrR.id_class(rrre_12, j, i + 1) ? 1 : 0;
                if ((n += rrrR.id_class(rrre_12, j, i - 1) ? 1 : 0) >= 3) {
                    rrre_12.id_class(j, i, 2);
                    bl = true;
                    continue;
                }
                if (n != 2) continue;
                int n2 = 0;
                n2 += rrrR.id_class(rrre_12, j + 1, i + 1) ? 1 : 0;
                n2 += rrrR.id_class(rrre_12, j - 1, i + 1) ? 1 : 0;
                n2 += rrrR.id_class(rrre_12, j + 1, i - 1) ? 1 : 0;
                if ((n2 += rrrR.id_class(rrre_12, j - 1, i - 1) ? 1 : 0) > 1) continue;
                rrre_12.id_class(j, i, 2);
                bl = true;
            }
        }
        return bl;
    }

    private void id_class() {
        int n;
        int n2;
        ArrayList arrayList = Lists.newArrayList();
        rrre_1 rrre_12 = this.id_protected[1];
        for (int i = 0; i < this.id_byte.id_byte; ++i) {
            for (n2 = 0; n2 < this.id_byte.id_break; ++n2) {
                int n3 = rrre_12.id_class(n2, i);
                n = n3 & 0xF0000;
                if (n != 131072 || (n3 & 0x200000) != 0x200000) continue;
                arrayList.add(new rqj_3<Integer, Integer>(n2, i));
            }
        }
        if (arrayList.isEmpty()) {
            this.id_byte.id_class(0, 0, this.id_byte.id_break, this.id_byte.id_byte, 5);
        } else {
            rqj_3 rqj_32 = (rqj_3)arrayList.get(this.id_class.nextInt(arrayList.size()));
            n2 = rrre_12.id_class((Integer)rqj_32.id_class(), (Integer)rqj_32.id_break());
            rrre_12.id_class((Integer)rqj_32.id_class(), (Integer)rqj_32.id_break(), n2 | 0x400000);
            rpr_3 rpr_32 = this.id_break(this.id_break, (Integer)rqj_32.id_class(), (Integer)rqj_32.id_break(), 1, n2 & 0xFFFF);
            n = (Integer)rqj_32.id_class() + rpr_32.id_implements();
            int n4 = (Integer)rqj_32.id_break() + rpr_32.id_extends();
            for (int i = 0; i < this.id_byte.id_byte; ++i) {
                for (int j = 0; j < this.id_byte.id_break; ++j) {
                    if (!rrrR.id_class(this.id_break, j, i)) {
                        this.id_byte.id_class(j, i, 5);
                        continue;
                    }
                    if (j == (Integer)rqj_32.id_class() && i == (Integer)rqj_32.id_break()) {
                        this.id_byte.id_class(j, i, 3);
                        continue;
                    }
                    if (j != n || i != n4) continue;
                    this.id_byte.id_class(j, i, 3);
                    this.id_protected[2].id_class(j, i, 0x800000);
                }
            }
            ArrayList arrayList2 = Lists.newArrayList();
            for (rpr_3 rpr_33 : rpb_3.HORIZONTAL) {
                if (this.id_byte.id_class(n + rpr_33.id_implements(), n4 + rpr_33.id_extends()) != 0) continue;
                arrayList2.add(rpr_33);
            }
            if (arrayList2.isEmpty()) {
                this.id_byte.id_class(0, 0, this.id_byte.id_break, this.id_byte.id_byte, 5);
                rrre_12.id_class((Integer)rqj_32.id_class(), (Integer)rqj_32.id_break(), n2);
            } else {
                rpr_3 rpr_34 = (rpr_3)arrayList2.get(this.id_class.nextInt(arrayList2.size()));
                this.id_class(this.id_byte, n + rpr_34.id_implements(), n4 + rpr_34.id_extends(), rpr_34, 4);
                while (this.id_class(this.id_byte)) {
                }
            }
        }
    }

    private void id_class(rrre_1 rrre_12, rrre_1 rrre_13) {
        int n;
        ArrayList arrayList = Lists.newArrayList();
        for (n = 0; n < rrre_12.id_byte; ++n) {
            for (int i = 0; i < rrre_12.id_break; ++i) {
                if (rrre_12.id_class(i, n) != 2) continue;
                arrayList.add(new rqj_3<Integer, Integer>(i, n));
            }
        }
        Collections.shuffle(arrayList, this.id_class);
        n = 10;
        for (rqj_3 rqj_32 : arrayList) {
            int n2;
            int n3 = (Integer)rqj_32.id_class();
            if (rrre_13.id_class(n3, n2 = ((Integer)rqj_32.id_break()).intValue()) != 0) continue;
            int n4 = n3;
            int n5 = n3;
            int n6 = n2;
            int n7 = n2;
            int n8 = 65536;
            if (rrre_13.id_class(n3 + 1, n2) == 0 && rrre_13.id_class(n3, n2 + 1) == 0 && rrre_13.id_class(n3 + 1, n2 + 1) == 0 && rrre_12.id_class(n3 + 1, n2) == 2 && rrre_12.id_class(n3, n2 + 1) == 2 && rrre_12.id_class(n3 + 1, n2 + 1) == 2) {
                n5 = n3 + 1;
                n7 = n2 + 1;
                n8 = 262144;
            } else if (rrre_13.id_class(n3 - 1, n2) == 0 && rrre_13.id_class(n3, n2 + 1) == 0 && rrre_13.id_class(n3 - 1, n2 + 1) == 0 && rrre_12.id_class(n3 - 1, n2) == 2 && rrre_12.id_class(n3, n2 + 1) == 2 && rrre_12.id_class(n3 - 1, n2 + 1) == 2) {
                n4 = n3 - 1;
                n7 = n2 + 1;
                n8 = 262144;
            } else if (rrre_13.id_class(n3 - 1, n2) == 0 && rrre_13.id_class(n3, n2 - 1) == 0 && rrre_13.id_class(n3 - 1, n2 - 1) == 0 && rrre_12.id_class(n3 - 1, n2) == 2 && rrre_12.id_class(n3, n2 - 1) == 2 && rrre_12.id_class(n3 - 1, n2 - 1) == 2) {
                n4 = n3 - 1;
                n6 = n2 - 1;
                n8 = 262144;
            } else if (rrre_13.id_class(n3 + 1, n2) == 0 && rrre_12.id_class(n3 + 1, n2) == 2) {
                n5 = n3 + 1;
                n8 = 131072;
            } else if (rrre_13.id_class(n3, n2 + 1) == 0 && rrre_12.id_class(n3, n2 + 1) == 2) {
                n7 = n2 + 1;
                n8 = 131072;
            } else if (rrre_13.id_class(n3 - 1, n2) == 0 && rrre_12.id_class(n3 - 1, n2) == 2) {
                n4 = n3 - 1;
                n8 = 131072;
            } else if (rrre_13.id_class(n3, n2 - 1) == 0 && rrre_12.id_class(n3, n2 - 1) == 2) {
                n6 = n2 - 1;
                n8 = 131072;
            }
            int n9 = this.id_class.nextBoolean() ? n4 : n5;
            int n10 = this.id_class.nextBoolean() ? n6 : n7;
            int n11 = 0x200000;
            if (!rrre_12.id_break(n9, n10, 1)) {
                n9 = n9 == n4 ? n5 : n4;
                int n12 = n10 = n10 == n6 ? n7 : n6;
                if (!rrre_12.id_break(n9, n10, 1)) {
                    int n13 = n10 = n10 == n6 ? n7 : n6;
                    if (!rrre_12.id_break(n9, n10, 1)) {
                        n9 = n9 == n4 ? n5 : n4;
                        int n14 = n10 = n10 == n6 ? n7 : n6;
                        if (!rrre_12.id_break(n9, n10, 1)) {
                            n11 = 0;
                            n9 = n4;
                            n10 = n6;
                        }
                    }
                }
            }
            for (int i = n6; i <= n7; ++i) {
                for (int j = n4; j <= n5; ++j) {
                    if (j == n9 && i == n10) {
                        rrre_13.id_class(j, i, 0x100000 | n11 | n8 | n);
                        continue;
                    }
                    rrre_13.id_class(j, i, n8 | n);
                }
            }
            ++n;
        }
    }

    public boolean id_class(rrre_1 rrre_12, int n, int n2, int n3, int n4) {
        return (this.id_protected[n3].id_class(n, n2) & 0xFFFF) == n4;
    }

    public static boolean id_class(rrre_1 rrre_12, int n, int n2) {
        int n3 = rrre_12.id_class(n, n2);
        return n3 == 1 || n3 == 2 || n3 == 3 || n3 == 4;
    }

    public rpr_3 id_break(rrre_1 rrre_12, int n, int n2, int n3, int n4) {
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            if (!this.id_class(rrre_12, n + rpr_32.id_implements(), n2 + rpr_32.id_extends(), n3, n4)) continue;
            return rpr_32;
        }
        return null;
    }
}

