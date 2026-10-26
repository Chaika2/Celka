/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.riF_2;
import celestial.riO_2;
import celestial.riW_2;
import celestial.riX_2;
import celestial.riZ_2;
import celestial.ric_3;
import celestial.rid_3;
import celestial.rih_3;
import celestial.rik_3;
import celestial.rim_3;
import celestial.riu_3;
import celestial.riv_3;
import celestial.riz_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class rix_3
extends riW_2 {
    private riz_3 id_int;
    private riz_3 id_new;
    private final List<riW_2> id_continue = Lists.newArrayList();

    private void id_byte(rRI rRI2, Random random, rfi_3 rfi_32) {
        if (this.id_class(rfi_32, 21, 21, 36, 36)) {
            this.id_class(rRI2, rfi_32, 21, 0, 22, 36, 0, 36, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 21, 1, 22, 36, 23, 36);
            for (int i = 0; i < 4; ++i) {
                this.id_class(rRI2, rfi_32, 21 + i, 13 + i, 21 + i, 36 - i, 13 + i, 21 + i, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 21 + i, 13 + i, 36 - i, 36 - i, 13 + i, 36 - i, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 21 + i, 13 + i, 22 + i, 21 + i, 13 + i, 35 - i, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 36 - i, 13 + i, 22 + i, 36 - i, 13 + i, 35 - i, id_break, id_break, false);
            }
            this.id_class(rRI2, rfi_32, 25, 16, 25, 32, 16, 32, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 25, 17, 25, 25, 19, 25, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 32, 17, 25, 32, 19, 25, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 25, 17, 32, 25, 19, 32, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 32, 17, 32, 32, 19, 32, id_break, id_break, false);
            this.id_class(rRI2, id_break, 26, 20, 26, rfi_32);
            this.id_class(rRI2, id_break, 27, 21, 27, rfi_32);
            this.id_class(rRI2, id_throws, 27, 20, 27, rfi_32);
            this.id_class(rRI2, id_break, 26, 20, 31, rfi_32);
            this.id_class(rRI2, id_break, 27, 21, 30, rfi_32);
            this.id_class(rRI2, id_throws, 27, 20, 30, rfi_32);
            this.id_class(rRI2, id_break, 31, 20, 31, rfi_32);
            this.id_class(rRI2, id_break, 30, 21, 30, rfi_32);
            this.id_class(rRI2, id_throws, 30, 20, 30, rfi_32);
            this.id_class(rRI2, id_break, 31, 20, 26, rfi_32);
            this.id_class(rRI2, id_break, 30, 21, 27, rfi_32);
            this.id_class(rRI2, id_throws, 30, 20, 27, rfi_32);
            this.id_class(rRI2, rfi_32, 28, 21, 27, 29, 21, 27, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 27, 21, 28, 27, 21, 29, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 28, 21, 30, 29, 21, 30, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 30, 21, 28, 30, 21, 29, id_class, id_class, false);
        }
    }

    public rix_3(Random random, int n, int n2, rpr_3 rpr_32) {
        super(raF_2.id_default, 0);
        Object object222;
        this.id_class(rpr_32);
        rpr_3 rpr_33 = this.id_implements();
        this.id_final = rpr_33.id_final() == rpB_2.Z ? new rfi_3(n, 39, n2, n + 58 - 1, 61, n2 + 58 - 1) : new rfi_3(n, 39, n2, n + 58 - 1, 61, n2 + 58 - 1);
        List<riz_3> list = this.id_class(random);
        this.id_int.id_protected = true;
        this.id_continue.add(new riO_2(rpr_33, this.id_int));
        this.id_continue.add(new rid_3(rpr_33, this.id_new));
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new rim_3());
        arrayList.add(new riv_3());
        arrayList.add(new riF_2());
        arrayList.add(new riu_3());
        arrayList.add(new riZ_2());
        arrayList.add(new riX_2());
        arrayList.add(new rih_3());
        block0: for (riz_3 riz_32 : list) {
            if (riz_32.id_protected || riz_32.id_break()) continue;
            for (Object object222 : arrayList) {
                if (!object222.id_class(riz_32)) continue;
                this.id_continue.add(object222.id_class(rpr_33, riz_32, random));
                continue block0;
            }
        }
        int n3 = this.id_final.id_break;
        int n4 = this.id_class(9, 22);
        int n5 = this.id_break(9, 22);
        for (riW_2 object3 : this.id_continue) {
            object3.id_catch().id_class(n4, n3, n5);
        }
        object222 = rfi_3.id_class(this.id_class(1, 1), this.id_class(1), this.id_break(1, 1), this.id_class(23, 21), this.id_class(8), this.id_break(23, 21));
        rfi_3 rfi_32 = rfi_3.id_class(this.id_class(34, 1), this.id_class(1), this.id_break(34, 1), this.id_class(56, 21), this.id_class(8), this.id_break(56, 21));
        rfi_3 rfi_33 = rfi_3.id_class(this.id_class(22, 22), this.id_class(13), this.id_break(22, 22), this.id_class(35, 35), this.id_class(17), this.id_break(35, 35));
        int n6 = random.nextInt();
        this.id_continue.add(new ric_3(rpr_33, (rfi_3)object222, n6++));
        this.id_continue.add(new ric_3(rpr_33, rfi_32, n6++));
        this.id_continue.add(new rik_3(rpr_33, rfi_33));
    }

    public rix_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_default, rcd_32);
    }

    private void id_class(rRI rRI2, Random random, rfi_3 rfi_32) {
        if (this.id_class(rfi_32, 22, 5, 35, 17)) {
            this.id_class(rRI2, rfi_32, 25, 0, 0, 32, 8, 20);
            for (int i = 0; i < 4; ++i) {
                this.id_class(rRI2, rfi_32, 24, 2, 5 + i * 4, 24, 4, 5 + i * 4, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 22, 4, 5 + i * 4, 23, 4, 5 + i * 4, id_break, id_break, false);
                this.id_class(rRI2, id_break, 25, 5, 5 + i * 4, rfi_32);
                this.id_class(rRI2, id_break, 26, 6, 5 + i * 4, rfi_32);
                this.id_class(rRI2, id_throws, 26, 5, 5 + i * 4, rfi_32);
                this.id_class(rRI2, rfi_32, 33, 2, 5 + i * 4, 33, 4, 5 + i * 4, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 34, 4, 5 + i * 4, 35, 4, 5 + i * 4, id_break, id_break, false);
                this.id_class(rRI2, id_break, 32, 5, 5 + i * 4, rfi_32);
                this.id_class(rRI2, id_break, 31, 6, 5 + i * 4, rfi_32);
                this.id_class(rRI2, id_throws, 31, 5, 5 + i * 4, rfi_32);
                this.id_class(rRI2, rfi_32, 27, 6, 5 + i * 4, 30, 6, 5 + i * 4, id_class, id_class, false);
            }
        }
    }

    private void id_class(boolean bl, int n, rRI rRI2, Random random, rfi_3 rfi_32) {
        int n2 = 24;
        if (this.id_class(rfi_32, n, 0, n + 23, 20)) {
            int n3;
            int n4;
            this.id_class(rRI2, rfi_32, n + 0, 0, 0, n + 24, 0, 20, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, n + 0, 1, 0, n + 24, 10, 20);
            for (n4 = 0; n4 < 4; ++n4) {
                this.id_class(rRI2, rfi_32, n + n4, n4 + 1, n4, n + n4, n4 + 1, 20, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n + n4 + 7, n4 + 5, n4 + 7, n + n4 + 7, n4 + 5, 20, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n + 17 - n4, n4 + 5, n4 + 7, n + 17 - n4, n4 + 5, 20, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n + 24 - n4, n4 + 1, n4, n + 24 - n4, n4 + 1, 20, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n + n4 + 1, n4 + 1, n4, n + 23 - n4, n4 + 1, n4, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n + n4 + 8, n4 + 5, n4 + 7, n + 16 - n4, n4 + 5, n4 + 7, id_break, id_break, false);
            }
            this.id_class(rRI2, rfi_32, n + 4, 4, 4, n + 6, 4, 20, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, n + 7, 4, 4, n + 17, 4, 6, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, n + 18, 4, 4, n + 20, 4, 20, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, n + 11, 8, 11, n + 13, 8, 20, id_class, id_class, false);
            this.id_class(rRI2, id_protected, n + 12, 9, 12, rfi_32);
            this.id_class(rRI2, id_protected, n + 12, 9, 15, rfi_32);
            this.id_class(rRI2, id_protected, n + 12, 9, 18, rfi_32);
            n4 = n + (bl ? 19 : 5);
            int n5 = n + (bl ? 5 : 19);
            for (n3 = 20; n3 >= 5; n3 -= 3) {
                this.id_class(rRI2, id_protected, n4, 5, n3, rfi_32);
            }
            for (n3 = 19; n3 >= 7; n3 -= 3) {
                this.id_class(rRI2, id_protected, n5, 5, n3, rfi_32);
            }
            for (n3 = 0; n3 < 4; ++n3) {
                int n6 = bl ? n + 24 - (17 - n3 * 3) : n + 17 - n3 * 3;
                this.id_class(rRI2, id_protected, n6, 5, 5, rfi_32);
            }
            this.id_class(rRI2, id_protected, n5, 5, 5, rfi_32);
            this.id_class(rRI2, rfi_32, n + 11, 1, 12, n + 13, 7, 12, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, n + 12, 1, 11, n + 12, 7, 13, id_class, id_class, false);
        }
    }

    private List<riz_3> id_class(Random random) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        riz_3[] riz_3Array = new riz_3[75];
        for (n7 = 0; n7 < 5; ++n7) {
            for (n6 = 0; n6 < 4; ++n6) {
                n5 = 0;
                n4 = rix_3.id_break(n7, 0, n6);
                riz_3Array[n4] = new riz_3(n4);
            }
        }
        for (n7 = 0; n7 < 5; ++n7) {
            for (n6 = 0; n6 < 4; ++n6) {
                n5 = 1;
                n4 = rix_3.id_break(n7, 1, n6);
                riz_3Array[n4] = new riz_3(n4);
            }
        }
        for (n7 = 1; n7 < 4; ++n7) {
            for (n6 = 0; n6 < 2; ++n6) {
                n5 = 2;
                n4 = rix_3.id_break(n7, 2, n6);
                riz_3Array[n4] = new riz_3(n4);
            }
        }
        this.id_int = riz_3Array[id_private];
        for (n7 = 0; n7 < 5; ++n7) {
            for (n6 = 0; n6 < 5; ++n6) {
                for (n5 = 0; n5 < 3; ++n5) {
                    n4 = rix_3.id_break(n7, n5, n6);
                    if (riz_3Array[n4] == null) continue;
                    for (rpr_3 object : rpr_3.values()) {
                        int n8;
                        n3 = n7 + object.id_implements();
                        n2 = n5 + object.id_finally();
                        n = n6 + object.id_extends();
                        if (n3 < 0 || n3 >= 5 || n < 0 || n >= 5 || n2 < 0 || n2 >= 3 || riz_3Array[n8 = rix_3.id_break(n3, n2, n)] == null) continue;
                        if (n == n6) {
                            riz_3Array[n4].id_class(object, riz_3Array[n8]);
                            continue;
                        }
                        riz_3Array[n4].id_class(object.id_case(), riz_3Array[n8]);
                    }
                }
            }
        }
        riz_3 riz_32 = new riz_3(1003);
        riz_3 riz_33 = new riz_3(1001);
        riz_3 riz_34 = new riz_3(1002);
        riz_3Array[id_implements].id_class(rpr_3.UP, riz_32);
        riz_3Array[id_finally].id_class(rpr_3.SOUTH, riz_33);
        riz_3Array[id_extends].id_class(rpr_3.SOUTH, riz_34);
        riz_32.id_protected = true;
        riz_33.id_protected = true;
        riz_34.id_protected = true;
        this.id_int.id_throws = true;
        this.id_new = riz_3Array[rix_3.id_break(random.nextInt(4), 0, 2)];
        this.id_new.id_protected = true;
        this.id_new.id_break[rpr_3.EAST.id_byte()].id_protected = true;
        this.id_new.id_break[rpr_3.NORTH.id_byte()].id_protected = true;
        this.id_new.id_break[rpr_3.EAST.id_byte()].id_break[rpr_3.NORTH.id_byte()].id_protected = true;
        this.id_new.id_break[rpr_3.UP.id_byte()].id_protected = true;
        this.id_new.id_break[rpr_3.EAST.id_byte()].id_break[rpr_3.UP.id_byte()].id_protected = true;
        this.id_new.id_break[rpr_3.NORTH.id_byte()].id_break[rpr_3.UP.id_byte()].id_protected = true;
        this.id_new.id_break[rpr_3.EAST.id_byte()].id_break[rpr_3.NORTH.id_byte()].id_break[rpr_3.UP.id_byte()].id_protected = true;
        ArrayList arrayList = Lists.newArrayList();
        for (riz_3 riz_35 : riz_3Array) {
            if (riz_35 == null) continue;
            riz_35.id_class();
            arrayList.add(riz_35);
        }
        riz_32.id_class();
        Collections.shuffle(arrayList, random);
        int n9 = 1;
        for (riz_3 riz_35 : arrayList) {
            int n10 = 0;
            for (n3 = 0; n10 < 2 && n3 < 5; ++n3) {
                n2 = random.nextInt(6);
                if (!riz_35.id_byte[n2]) continue;
                n = rpr_3.id_class(n2).id_case().id_byte();
                riz_35.id_byte[n2] = false;
                riz_35.id_break[n2].id_byte[n] = false;
                if (riz_35.id_class(n9++) && riz_35.id_break[n2].id_class(n9++)) {
                    ++n10;
                    continue;
                }
                riz_35.id_byte[n2] = true;
                riz_35.id_break[n2].id_byte[n] = true;
            }
        }
        arrayList.add(riz_32);
        arrayList.add(riz_33);
        arrayList.add(riz_34);
        return arrayList;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n;
        int n2 = Math.max(rRI2.id_short(), 64) - this.id_final.id_break;
        this.id_class(rRI2, rfi_32, 0, 0, 0, 58, n2, 58);
        this.id_class(false, 0, rRI2, random, rfi_32);
        this.id_class(true, 33, rRI2, random, rfi_32);
        this.id_class(rRI2, random, rfi_32);
        this.id_break(rRI2, random, rfi_32);
        this.id_byte(rRI2, random, rfi_32);
        this.id_protected(rRI2, random, rfi_32);
        this.id_throws(rRI2, random, rfi_32);
        this.id_case(rRI2, random, rfi_32);
        for (n = 0; n < 7; ++n) {
            int n3 = 0;
            while (n3 < 7) {
                if (n3 == 0 && n == 3) {
                    n3 = 6;
                }
                int n4 = n * 9;
                int n5 = n3 * 9;
                for (int i = 0; i < 4; ++i) {
                    for (int j = 0; j < 4; ++j) {
                        this.id_class(rRI2, id_break, n4 + i, 0, n5 + j, rfi_32);
                        this.id_break(rRI2, id_break, n4 + i, -1, n5 + j, rfi_32);
                    }
                }
                if (n != 0 && n != 6) {
                    n3 += 6;
                    continue;
                }
                ++n3;
            }
        }
        for (n = 0; n < 5; ++n) {
            this.id_class(rRI2, rfi_32, -1 - n, 0 + n * 2, -1 - n, -1 - n, 23, 58 + n);
            this.id_class(rRI2, rfi_32, 58 + n, 0 + n * 2, -1 - n, 58 + n, 23, 58 + n);
            this.id_class(rRI2, rfi_32, 0 - n, 0 + n * 2, -1 - n, 57 + n, 23, -1 - n);
            this.id_class(rRI2, rfi_32, 0 - n, 0 + n * 2, 58 + n, 57 + n, 23, 58 + n);
        }
        for (riW_2 riW_22 : this.id_continue) {
            if (!riW_22.id_catch().id_class(rfi_32)) continue;
            riW_22.id_class(rRI2, rrrA2, rKd_12, random, rfi_32, rfj_32, rfH_22);
        }
        return true;
    }

    private void id_break(rRI rRI2, Random random, rfi_3 rfi_32) {
        if (this.id_class(rfi_32, 15, 20, 42, 21)) {
            int n;
            this.id_class(rRI2, rfi_32, 15, 0, 21, 42, 0, 21, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 26, 1, 21, 31, 3, 21);
            this.id_class(rRI2, rfi_32, 21, 12, 21, 36, 12, 21, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 17, 11, 21, 40, 11, 21, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 16, 10, 21, 41, 10, 21, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 15, 7, 21, 42, 9, 21, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 16, 6, 21, 41, 6, 21, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 17, 5, 21, 40, 5, 21, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 21, 4, 21, 36, 4, 21, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 22, 3, 21, 26, 3, 21, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 31, 3, 21, 35, 3, 21, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 23, 2, 21, 25, 2, 21, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 32, 2, 21, 34, 2, 21, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 28, 4, 20, 29, 4, 21, id_break, id_break, false);
            this.id_class(rRI2, id_break, 27, 3, 21, rfi_32);
            this.id_class(rRI2, id_break, 30, 3, 21, rfi_32);
            this.id_class(rRI2, id_break, 26, 2, 21, rfi_32);
            this.id_class(rRI2, id_break, 31, 2, 21, rfi_32);
            this.id_class(rRI2, id_break, 25, 1, 21, rfi_32);
            this.id_class(rRI2, id_break, 32, 1, 21, rfi_32);
            for (n = 0; n < 7; ++n) {
                this.id_class(rRI2, id_byte, 28 - n, 6 + n, 21, rfi_32);
                this.id_class(rRI2, id_byte, 29 + n, 6 + n, 21, rfi_32);
            }
            for (n = 0; n < 4; ++n) {
                this.id_class(rRI2, id_byte, 28 - n, 9 + n, 21, rfi_32);
                this.id_class(rRI2, id_byte, 29 + n, 9 + n, 21, rfi_32);
            }
            this.id_class(rRI2, id_byte, 28, 12, 21, rfi_32);
            this.id_class(rRI2, id_byte, 29, 12, 21, rfi_32);
            for (n = 0; n < 3; ++n) {
                this.id_class(rRI2, id_byte, 22 - n * 2, 8, 21, rfi_32);
                this.id_class(rRI2, id_byte, 22 - n * 2, 9, 21, rfi_32);
                this.id_class(rRI2, id_byte, 35 + n * 2, 8, 21, rfi_32);
                this.id_class(rRI2, id_byte, 35 + n * 2, 9, 21, rfi_32);
            }
            this.id_class(rRI2, rfi_32, 15, 13, 21, 42, 15, 21);
            this.id_class(rRI2, rfi_32, 15, 1, 21, 15, 6, 21);
            this.id_class(rRI2, rfi_32, 16, 1, 21, 16, 5, 21);
            this.id_class(rRI2, rfi_32, 17, 1, 21, 20, 4, 21);
            this.id_class(rRI2, rfi_32, 21, 1, 21, 21, 3, 21);
            this.id_class(rRI2, rfi_32, 22, 1, 21, 22, 2, 21);
            this.id_class(rRI2, rfi_32, 23, 1, 21, 24, 1, 21);
            this.id_class(rRI2, rfi_32, 42, 1, 21, 42, 6, 21);
            this.id_class(rRI2, rfi_32, 41, 1, 21, 41, 5, 21);
            this.id_class(rRI2, rfi_32, 37, 1, 21, 40, 4, 21);
            this.id_class(rRI2, rfi_32, 36, 1, 21, 36, 3, 21);
            this.id_class(rRI2, rfi_32, 33, 1, 21, 34, 1, 21);
            this.id_class(rRI2, rfi_32, 35, 1, 21, 35, 2, 21);
        }
    }

    private void id_throws(rRI rRI2, Random random, rfi_3 rfi_32) {
        int n;
        if (this.id_class(rfi_32, 7, 21, 13, 50)) {
            this.id_class(rRI2, rfi_32, 7, 0, 21, 13, 0, 50, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 7, 1, 21, 13, 10, 50);
            this.id_class(rRI2, rfi_32, 11, 8, 21, 13, 8, 53, id_class, id_class, false);
            for (n = 0; n < 4; ++n) {
                this.id_class(rRI2, rfi_32, n + 7, n + 5, 21, n + 7, n + 5, 54, id_break, id_break, false);
            }
            for (n = 21; n <= 45; n += 3) {
                this.id_class(rRI2, id_protected, 12, 9, n, rfi_32);
            }
        }
        if (this.id_class(rfi_32, 44, 21, 50, 54)) {
            this.id_class(rRI2, rfi_32, 44, 0, 21, 50, 0, 50, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 44, 1, 21, 50, 10, 50);
            this.id_class(rRI2, rfi_32, 44, 8, 21, 46, 8, 53, id_class, id_class, false);
            for (n = 0; n < 4; ++n) {
                this.id_class(rRI2, rfi_32, 50 - n, n + 5, 21, 50 - n, n + 5, 54, id_break, id_break, false);
            }
            for (n = 21; n <= 45; n += 3) {
                this.id_class(rRI2, id_protected, 45, 9, n, rfi_32);
            }
        }
        if (this.id_class(rfi_32, 8, 44, 49, 54)) {
            this.id_class(rRI2, rfi_32, 14, 0, 44, 43, 0, 50, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 14, 1, 44, 43, 10, 50);
            for (n = 12; n <= 45; n += 3) {
                this.id_class(rRI2, id_protected, n, 9, 45, rfi_32);
                this.id_class(rRI2, id_protected, n, 9, 52, rfi_32);
                if (n != 12 && n != 18 && n != 24 && n != 33 && n != 39 && n != 45) continue;
                this.id_class(rRI2, id_protected, n, 9, 47, rfi_32);
                this.id_class(rRI2, id_protected, n, 9, 50, rfi_32);
                this.id_class(rRI2, id_protected, n, 10, 45, rfi_32);
                this.id_class(rRI2, id_protected, n, 10, 46, rfi_32);
                this.id_class(rRI2, id_protected, n, 10, 51, rfi_32);
                this.id_class(rRI2, id_protected, n, 10, 52, rfi_32);
                this.id_class(rRI2, id_protected, n, 11, 47, rfi_32);
                this.id_class(rRI2, id_protected, n, 11, 50, rfi_32);
                this.id_class(rRI2, id_protected, n, 12, 48, rfi_32);
                this.id_class(rRI2, id_protected, n, 12, 49, rfi_32);
            }
            for (n = 0; n < 3; ++n) {
                this.id_class(rRI2, rfi_32, 8 + n, 5 + n, 54, 49 - n, 5 + n, 54, id_class, id_class, false);
            }
            this.id_class(rRI2, rfi_32, 11, 8, 54, 46, 8, 54, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 14, 8, 44, 43, 8, 53, id_class, id_class, false);
        }
    }

    private void id_case(rRI rRI2, Random random, rfi_3 rfi_32) {
        int n;
        if (this.id_class(rfi_32, 14, 21, 20, 43)) {
            this.id_class(rRI2, rfi_32, 14, 0, 21, 20, 0, 43, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 14, 1, 22, 20, 14, 43);
            this.id_class(rRI2, rfi_32, 18, 12, 22, 20, 12, 39, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 18, 12, 21, 20, 12, 21, id_break, id_break, false);
            for (n = 0; n < 4; ++n) {
                this.id_class(rRI2, rfi_32, n + 14, n + 9, 21, n + 14, n + 9, 43 - n, id_break, id_break, false);
            }
            for (n = 23; n <= 39; n += 3) {
                this.id_class(rRI2, id_protected, 19, 13, n, rfi_32);
            }
        }
        if (this.id_class(rfi_32, 37, 21, 43, 43)) {
            this.id_class(rRI2, rfi_32, 37, 0, 21, 43, 0, 43, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 37, 1, 22, 43, 14, 43);
            this.id_class(rRI2, rfi_32, 37, 12, 22, 39, 12, 39, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 37, 12, 21, 39, 12, 21, id_break, id_break, false);
            for (n = 0; n < 4; ++n) {
                this.id_class(rRI2, rfi_32, 43 - n, n + 9, 21, 43 - n, n + 9, 43 - n, id_break, id_break, false);
            }
            for (n = 23; n <= 39; n += 3) {
                this.id_class(rRI2, id_protected, 38, 13, n, rfi_32);
            }
        }
        if (this.id_class(rfi_32, 15, 37, 42, 43)) {
            this.id_class(rRI2, rfi_32, 21, 0, 37, 36, 0, 43, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 21, 1, 37, 36, 14, 43);
            this.id_class(rRI2, rfi_32, 21, 12, 37, 36, 12, 39, id_class, id_class, false);
            for (n = 0; n < 4; ++n) {
                this.id_class(rRI2, rfi_32, 15 + n, n + 9, 43 - n, 42 - n, n + 9, 43 - n, id_break, id_break, false);
            }
            for (n = 21; n <= 36; n += 3) {
                this.id_class(rRI2, id_protected, n, 13, 38, rfi_32);
            }
        }
    }

    private void id_protected(rRI rRI2, Random random, rfi_3 rfi_32) {
        int n;
        if (this.id_class(rfi_32, 0, 21, 6, 58)) {
            this.id_class(rRI2, rfi_32, 0, 0, 21, 6, 0, 57, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 0, 1, 21, 6, 7, 57);
            this.id_class(rRI2, rfi_32, 4, 4, 21, 6, 4, 53, id_class, id_class, false);
            for (n = 0; n < 4; ++n) {
                this.id_class(rRI2, rfi_32, n, n + 1, 21, n, n + 1, 57 - n, id_break, id_break, false);
            }
            for (n = 23; n < 53; n += 3) {
                this.id_class(rRI2, id_protected, 5, 5, n, rfi_32);
            }
            this.id_class(rRI2, id_protected, 5, 5, 52, rfi_32);
            for (n = 0; n < 4; ++n) {
                this.id_class(rRI2, rfi_32, n, n + 1, 21, n, n + 1, 57 - n, id_break, id_break, false);
            }
            this.id_class(rRI2, rfi_32, 4, 1, 52, 6, 3, 52, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 5, 1, 51, 5, 3, 53, id_class, id_class, false);
        }
        if (this.id_class(rfi_32, 51, 21, 58, 58)) {
            this.id_class(rRI2, rfi_32, 51, 0, 21, 57, 0, 57, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 51, 1, 21, 57, 7, 57);
            this.id_class(rRI2, rfi_32, 51, 4, 21, 53, 4, 53, id_class, id_class, false);
            for (n = 0; n < 4; ++n) {
                this.id_class(rRI2, rfi_32, 57 - n, n + 1, 21, 57 - n, n + 1, 57 - n, id_break, id_break, false);
            }
            for (n = 23; n < 53; n += 3) {
                this.id_class(rRI2, id_protected, 52, 5, n, rfi_32);
            }
            this.id_class(rRI2, id_protected, 52, 5, 52, rfi_32);
            this.id_class(rRI2, rfi_32, 51, 1, 52, 53, 3, 52, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 52, 1, 51, 52, 3, 53, id_class, id_class, false);
        }
        if (this.id_class(rfi_32, 0, 51, 57, 57)) {
            this.id_class(rRI2, rfi_32, 7, 0, 51, 50, 0, 57, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 7, 1, 51, 50, 10, 57);
            for (n = 0; n < 4; ++n) {
                this.id_class(rRI2, rfi_32, n + 1, n + 1, 57 - n, 56 - n, n + 1, 57 - n, id_break, id_break, false);
            }
        }
    }
}

