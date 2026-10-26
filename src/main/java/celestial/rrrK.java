/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rfH_2;
import celestial.rpa_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rrPl_1;
import celestial.rrPt_1;
import celestial.rrrD;
import celestial.rrrR;
import celestial.rrrU;
import celestial.rrrY;
import celestial.rrra_1;
import celestial.rrre_1;
import celestial.rrrg_1;
import celestial.rrro_1;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class rrrK {
    private final rrPt_1 id_class;
    private final Random id_break;
    private int id_byte;
    private int id_protected;

    private void id_byte(List<rrrY> list, rrro_1 rrro_12) {
        rrro_12.id_break = rrro_12.id_break.id_class(rrro_12.id_class.id_class(rpr_3.SOUTH), -1);
        list.add(new rrrY(this.id_class, "wall_corner", rrro_12.id_break, rrro_12.id_class));
        rrro_12.id_break = rrro_12.id_break.id_class(rrro_12.id_class.id_class(rpr_3.SOUTH), -7);
        rrro_12.id_break = rrro_12.id_break.id_class(rrro_12.id_class.id_class(rpr_3.WEST), -6);
        rrro_12.id_class = rrro_12.id_class.id_class(rqd_3.CLOCKWISE_90);
    }

    public rrrK(rrPt_1 rrPt_12, Random random) {
        this.id_class = rrPt_12;
        this.id_break = random;
    }

    public void id_class(rfH_2 rfH_22, rqd_3 rqd_32, List<rrrY> list, rrrR rrrR2) {
        int n;
        rrro_1 rrro_12 = new rrro_1();
        rrro_12.id_break = rfH_22;
        rrro_12.id_class = rqd_32;
        rrro_12.id_byte = "wall_flat";
        rrro_1 rrro_13 = new rrro_1();
        this.id_class(list, rrro_12);
        rrro_13.id_break = rrro_12.id_break.id_break(8);
        rrro_13.id_class = rrro_12.id_class;
        rrro_13.id_byte = "wall_window";
        if (!list.isEmpty()) {
            // empty if block
        }
        rrre_1 rrre_12 = rrrR2.id_break;
        rrre_1 rrre_13 = rrrR2.id_byte;
        this.id_byte = rrrR2.id_throws + 1;
        this.id_protected = rrrR2.id_case + 1;
        int n2 = rrrR2.id_throws + 1;
        int n3 = rrrR2.id_case;
        this.id_class(list, rrro_12, rrre_12, rpr_3.SOUTH, this.id_byte, this.id_protected, n2, n3);
        this.id_class(list, rrro_13, rrre_12, rpr_3.SOUTH, this.id_byte, this.id_protected, n2, n3);
        rrro_1 rrro_14 = new rrro_1();
        rrro_14.id_break = rrro_12.id_break.id_break(19);
        rrro_14.id_class = rrro_12.id_class;
        rrro_14.id_byte = "wall_window";
        boolean bl = false;
        for (int i = 0; i < rrre_13.id_byte && !bl; ++i) {
            for (n = rrre_13.id_break - 1; n >= 0 && !bl; --n) {
                if (!rrrR.id_class(rrre_13, n, i)) continue;
                rrro_14.id_break = rrro_14.id_break.id_class(rqd_32.id_class(rpr_3.SOUTH), 8 + (i - this.id_protected) * 8);
                rrro_14.id_break = rrro_14.id_break.id_class(rqd_32.id_class(rpr_3.EAST), (n - this.id_byte) * 8);
                this.id_break(list, rrro_14);
                this.id_class(list, rrro_14, rrre_13, rpr_3.SOUTH, n, i, n, i);
                bl = true;
            }
        }
        this.id_class(list, rfH_22.id_break(16), rqd_32, rrre_12, rrre_13);
        this.id_class(list, rfH_22.id_break(27), rqd_32, rrre_13, (rrre_1)null);
        if (!list.isEmpty()) {
            // empty if block
        }
        rrrD[] rrrDArray = new rrrD[]{new rrrg_1(), new rrrU(), new rrra_1()};
        for (n = 0; n < 3; ++n) {
            Object object;
            rfH_2 rfH_23 = rfH_22.id_break(8 * n + (n == 2 ? 3 : 0));
            rrre_1 rrre_14 = rrrR2.id_protected[n];
            rrre_1 rrre_15 = n == 2 ? rrre_13 : rrre_12;
            String string = n == 0 ? "carpet_south_1" : "carpet_south_2";
            String string2 = n == 0 ? "carpet_west_1" : "carpet_west_2";
            for (int i = 0; i < rrre_15.id_byte; ++i) {
                for (int j = 0; j < rrre_15.id_break; ++j) {
                    if (rrre_15.id_class(j, i) != 1) continue;
                    object = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 8 + (i - this.id_protected) * 8);
                    object = ((rfH_2)object).id_class(rqd_32.id_class(rpr_3.EAST), (j - this.id_byte) * 8);
                    list.add(new rrrY(this.id_class, "corridor_floor", (rfH_2)object, rqd_32));
                    if (rrre_15.id_class(j, i - 1) == 1 || (rrre_14.id_class(j, i - 1) & 0x800000) == 0x800000) {
                        list.add(new rrrY(this.id_class, "carpet_north", ((rfH_2)object).id_class(rqd_32.id_class(rpr_3.EAST), 1).id_final(), rqd_32));
                    }
                    if (rrre_15.id_class(j + 1, i) == 1 || (rrre_14.id_class(j + 1, i) & 0x800000) == 0x800000) {
                        list.add(new rrrY(this.id_class, "carpet_east", ((rfH_2)object).id_class(rqd_32.id_class(rpr_3.SOUTH), 1).id_class(rqd_32.id_class(rpr_3.EAST), 5).id_final(), rqd_32));
                    }
                    if (rrre_15.id_class(j, i + 1) == 1 || (rrre_14.id_class(j, i + 1) & 0x800000) == 0x800000) {
                        list.add(new rrrY(this.id_class, string, ((rfH_2)object).id_class(rqd_32.id_class(rpr_3.SOUTH), 5).id_class(rqd_32.id_class(rpr_3.WEST), 1), rqd_32));
                    }
                    if (rrre_15.id_class(j - 1, i) != 1 && (rrre_14.id_class(j - 1, i) & 0x800000) != 0x800000) continue;
                    list.add(new rrrY(this.id_class, string2, ((rfH_2)object).id_class(rqd_32.id_class(rpr_3.WEST), 1).id_class(rqd_32.id_class(rpr_3.NORTH), 1), rqd_32));
                }
            }
            String string3 = n == 0 ? "indoors_wall_1" : "indoors_wall_2";
            String string4 = n == 0 ? "indoors_door_1" : "indoors_door_2";
            object = Lists.newArrayList();
            for (int i = 0; i < rrre_15.id_byte; ++i) {
                for (int j = 0; j < rrre_15.id_break; ++j) {
                    Object object2;
                    Object object32;
                    boolean bl2;
                    boolean bl3 = bl2 = n == 2 && rrre_15.id_class(j, i) == 3;
                    if (rrre_15.id_class(j, i) != 2 && !bl2) continue;
                    int n4 = rrre_14.id_class(j, i);
                    int n5 = n4 & 0xF0000;
                    int n6 = n4 & 0xFFFF;
                    bl2 = bl2 && (n4 & 0x800000) == 0x800000;
                    object.clear();
                    if ((n4 & 0x200000) == 0x200000) {
                        for (Object object32 : rpb_3.HORIZONTAL) {
                            if (rrre_15.id_class(j + ((rpr_3)object32).id_implements(), i + ((rpr_3)object32).id_extends()) != 1) continue;
                            object.add(object32);
                        }
                    }
                    Object object4 = null;
                    if (!object.isEmpty()) {
                        object4 = (rpr_3)object.get(this.id_break.nextInt(object.size()));
                    } else if ((n4 & 0x100000) == 0x100000) {
                        object4 = rpr_3.UP;
                    }
                    object32 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 8 + (i - this.id_protected) * 8);
                    object32 = ((rfH_2)object32).id_class(rqd_32.id_class(rpr_3.EAST), -1 + (j - this.id_byte) * 8);
                    if (rrrR.id_class(rrre_15, j - 1, i) && !rrrR2.id_class(rrre_15, j - 1, i, n, n6)) {
                        list.add(new rrrY(this.id_class, object4 == rpr_3.WEST ? string4 : string3, (rfH_2)object32, rqd_32));
                    }
                    if (rrre_15.id_class(j + 1, i) == 1 && !bl2) {
                        object2 = ((rfH_2)object32).id_class(rqd_32.id_class(rpr_3.EAST), 8);
                        list.add(new rrrY(this.id_class, object4 == rpr_3.EAST ? string4 : string3, (rfH_2)object2, rqd_32));
                    }
                    if (rrrR.id_class(rrre_15, j, i + 1) && !rrrR2.id_class(rrre_15, j, i + 1, n, n6)) {
                        object2 = ((rfH_2)object32).id_class(rqd_32.id_class(rpr_3.SOUTH), 7);
                        object2 = ((rfH_2)object2).id_class(rqd_32.id_class(rpr_3.EAST), 7);
                        list.add(new rrrY(this.id_class, object4 == rpr_3.SOUTH ? string4 : string3, (rfH_2)object2, rqd_32.id_class(rqd_3.CLOCKWISE_90)));
                    }
                    if (rrre_15.id_class(j, i - 1) == 1 && !bl2) {
                        object2 = ((rfH_2)object32).id_class(rqd_32.id_class(rpr_3.NORTH), 1);
                        object2 = ((rfH_2)object2).id_class(rqd_32.id_class(rpr_3.EAST), 7);
                        list.add(new rrrY(this.id_class, object4 == rpr_3.NORTH ? string4 : string3, (rfH_2)object2, rqd_32.id_class(rqd_3.CLOCKWISE_90)));
                    }
                    if (n5 == 65536) {
                        this.id_class(list, (rfH_2)object32, rqd_32, (rpr_3)object4, rrrDArray[n]);
                        continue;
                    }
                    if (n5 == 131072 && object4 != null) {
                        object2 = rrrR2.id_break(rrre_15, j, i, n, n6);
                        boolean bl4 = (n4 & 0x400000) == 0x400000;
                        this.id_class(list, (rfH_2)object32, rqd_32, (rpr_3)object2, (rpr_3)object4, rrrDArray[n], bl4);
                        continue;
                    }
                    if (n5 == 262144 && object4 != null && object4 != rpr_3.UP) {
                        object2 = ((rpr_3)object4).id_catch();
                        if (!rrrR2.id_class(rrre_15, j + ((rpr_3)object2).id_implements(), i + ((rpr_3)object2).id_extends(), n, n6)) {
                            object2 = ((rpr_3)object2).id_case();
                        }
                        this.id_class(list, (rfH_2)object32, rqd_32, (rpr_3)object2, (rpr_3)object4, rrrDArray[n]);
                        continue;
                    }
                    if (n5 != 262144 || object4 != rpr_3.UP) continue;
                    this.id_class(list, (rfH_2)object32, rqd_32, rrrDArray[n]);
                }
            }
        }
    }

    private void id_class(List<rrrY> list, rfH_2 rfH_22, rqd_3 rqd_32, rrrD rrrD2) {
        rfH_2 rfH_23 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 1);
        list.add(new rrrY(this.id_class, rrrD2.id_throws(this.id_break), rfH_23, rqd_32, rpa_3.NONE));
    }

    private void id_class(List<rrrY> list, rfH_2 rfH_22, rqd_3 rqd_32, rpr_3 rpr_32, rrrD rrrD2) {
        rqd_3 rqd_33 = rqd_3.NONE;
        String string = rrrD2.id_class(this.id_break);
        if (rpr_32 != rpr_3.EAST) {
            if (rpr_32 == rpr_3.NORTH) {
                rqd_33 = rqd_33.id_class(rqd_3.COUNTERCLOCKWISE_90);
            } else if (rpr_32 == rpr_3.WEST) {
                rqd_33 = rqd_33.id_class(rqd_3.CLOCKWISE_180);
            } else if (rpr_32 == rpr_3.SOUTH) {
                rqd_33 = rqd_33.id_class(rqd_3.CLOCKWISE_90);
            } else {
                string = rrrD2.id_break(this.id_break);
            }
        }
        rfH_2 rfH_23 = rrPl_1.id_class(new rfH_2(1, 0, 0), rpa_3.NONE, rqd_33, 7, 7);
        rqd_33 = rqd_33.id_class(rqd_32);
        rfH_23 = rfH_23.id_class(rqd_32);
        rfH_2 rfH_24 = rfH_22.id_break(rfH_23.b_(), 0, rfH_23.d_());
        list.add(new rrrY(this.id_class, string, rfH_24, rqd_33));
    }

    private void id_class(List<rrrY> list, rfH_2 rfH_22, rqd_3 rqd_32, rpr_3 rpr_32, rpr_3 rpr_33, rrrD rrrD2, boolean bl) {
        if (rpr_33 == rpr_3.EAST && rpr_32 == rpr_3.SOUTH) {
            rfH_2 rfH_23 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 1);
            list.add(new rrrY(this.id_class, rrrD2.id_class(this.id_break, bl), rfH_23, rqd_32));
        } else if (rpr_33 == rpr_3.EAST && rpr_32 == rpr_3.NORTH) {
            rfH_2 rfH_24 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 1);
            rfH_24 = rfH_24.id_class(rqd_32.id_class(rpr_3.SOUTH), 6);
            list.add(new rrrY(this.id_class, rrrD2.id_class(this.id_break, bl), rfH_24, rqd_32, rpa_3.LEFT_RIGHT));
        } else if (rpr_33 == rpr_3.WEST && rpr_32 == rpr_3.NORTH) {
            rfH_2 rfH_25 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 7);
            rfH_25 = rfH_25.id_class(rqd_32.id_class(rpr_3.SOUTH), 6);
            list.add(new rrrY(this.id_class, rrrD2.id_class(this.id_break, bl), rfH_25, rqd_32.id_class(rqd_3.CLOCKWISE_180)));
        } else if (rpr_33 == rpr_3.WEST && rpr_32 == rpr_3.SOUTH) {
            rfH_2 rfH_26 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 7);
            list.add(new rrrY(this.id_class, rrrD2.id_class(this.id_break, bl), rfH_26, rqd_32, rpa_3.FRONT_BACK));
        } else if (rpr_33 == rpr_3.SOUTH && rpr_32 == rpr_3.EAST) {
            rfH_2 rfH_27 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 1);
            list.add(new rrrY(this.id_class, rrrD2.id_class(this.id_break, bl), rfH_27, rqd_32.id_class(rqd_3.CLOCKWISE_90), rpa_3.LEFT_RIGHT));
        } else if (rpr_33 == rpr_3.SOUTH && rpr_32 == rpr_3.WEST) {
            rfH_2 rfH_28 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 7);
            list.add(new rrrY(this.id_class, rrrD2.id_class(this.id_break, bl), rfH_28, rqd_32.id_class(rqd_3.CLOCKWISE_90)));
        } else if (rpr_33 == rpr_3.NORTH && rpr_32 == rpr_3.WEST) {
            rfH_2 rfH_29 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 7);
            rfH_29 = rfH_29.id_class(rqd_32.id_class(rpr_3.SOUTH), 6);
            list.add(new rrrY(this.id_class, rrrD2.id_class(this.id_break, bl), rfH_29, rqd_32.id_class(rqd_3.CLOCKWISE_90), rpa_3.FRONT_BACK));
        } else if (rpr_33 == rpr_3.NORTH && rpr_32 == rpr_3.EAST) {
            rfH_2 rfH_210 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 1);
            rfH_210 = rfH_210.id_class(rqd_32.id_class(rpr_3.SOUTH), 6);
            list.add(new rrrY(this.id_class, rrrD2.id_class(this.id_break, bl), rfH_210, rqd_32.id_class(rqd_3.COUNTERCLOCKWISE_90)));
        } else if (rpr_33 == rpr_3.SOUTH && rpr_32 == rpr_3.NORTH) {
            rfH_2 rfH_211 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 1);
            rfH_211 = rfH_211.id_class(rqd_32.id_class(rpr_3.NORTH), 8);
            list.add(new rrrY(this.id_class, rrrD2.id_break(this.id_break, bl), rfH_211, rqd_32));
        } else if (rpr_33 == rpr_3.NORTH && rpr_32 == rpr_3.SOUTH) {
            rfH_2 rfH_212 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 7);
            rfH_212 = rfH_212.id_class(rqd_32.id_class(rpr_3.SOUTH), 14);
            list.add(new rrrY(this.id_class, rrrD2.id_break(this.id_break, bl), rfH_212, rqd_32.id_class(rqd_3.CLOCKWISE_180)));
        } else if (rpr_33 == rpr_3.WEST && rpr_32 == rpr_3.EAST) {
            rfH_2 rfH_213 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 15);
            list.add(new rrrY(this.id_class, rrrD2.id_break(this.id_break, bl), rfH_213, rqd_32.id_class(rqd_3.CLOCKWISE_90)));
        } else if (rpr_33 == rpr_3.EAST && rpr_32 == rpr_3.WEST) {
            rfH_2 rfH_214 = rfH_22.id_class(rqd_32.id_class(rpr_3.WEST), 7);
            rfH_214 = rfH_214.id_class(rqd_32.id_class(rpr_3.SOUTH), 6);
            list.add(new rrrY(this.id_class, rrrD2.id_break(this.id_break, bl), rfH_214, rqd_32.id_class(rqd_3.COUNTERCLOCKWISE_90)));
        } else if (rpr_33 == rpr_3.UP && rpr_32 == rpr_3.EAST) {
            rfH_2 rfH_215 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 15);
            list.add(new rrrY(this.id_class, rrrD2.id_byte(this.id_break), rfH_215, rqd_32.id_class(rqd_3.CLOCKWISE_90)));
        } else if (rpr_33 == rpr_3.UP && rpr_32 == rpr_3.SOUTH) {
            rfH_2 rfH_216 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), 1);
            rfH_216 = rfH_216.id_class(rqd_32.id_class(rpr_3.NORTH), 0);
            list.add(new rrrY(this.id_class, rrrD2.id_byte(this.id_break), rfH_216, rqd_32));
        }
    }

    private void id_class(List<rrrY> list, rfH_2 rfH_22, rqd_3 rqd_32, rpr_3 rpr_32, rpr_3 rpr_33, rrrD rrrD2) {
        int n = 0;
        int n2 = 0;
        rqd_3 rqd_33 = rqd_32;
        rpa_3 rpa_32 = rpa_3.NONE;
        if (rpr_33 == rpr_3.EAST && rpr_32 == rpr_3.SOUTH) {
            n = -7;
        } else if (rpr_33 == rpr_3.EAST && rpr_32 == rpr_3.NORTH) {
            n = -7;
            n2 = 6;
            rpa_32 = rpa_3.LEFT_RIGHT;
        } else if (rpr_33 == rpr_3.NORTH && rpr_32 == rpr_3.EAST) {
            n = 1;
            n2 = 14;
            rqd_33 = rqd_32.id_class(rqd_3.COUNTERCLOCKWISE_90);
        } else if (rpr_33 == rpr_3.NORTH && rpr_32 == rpr_3.WEST) {
            n = 7;
            n2 = 14;
            rqd_33 = rqd_32.id_class(rqd_3.COUNTERCLOCKWISE_90);
            rpa_32 = rpa_3.LEFT_RIGHT;
        } else if (rpr_33 == rpr_3.SOUTH && rpr_32 == rpr_3.WEST) {
            n = 7;
            n2 = -8;
            rqd_33 = rqd_32.id_class(rqd_3.CLOCKWISE_90);
        } else if (rpr_33 == rpr_3.SOUTH && rpr_32 == rpr_3.EAST) {
            n = 1;
            n2 = -8;
            rqd_33 = rqd_32.id_class(rqd_3.CLOCKWISE_90);
            rpa_32 = rpa_3.LEFT_RIGHT;
        } else if (rpr_33 == rpr_3.WEST && rpr_32 == rpr_3.NORTH) {
            n = 15;
            n2 = 6;
            rqd_33 = rqd_32.id_class(rqd_3.CLOCKWISE_180);
        } else if (rpr_33 == rpr_3.WEST && rpr_32 == rpr_3.SOUTH) {
            n = 15;
            rpa_32 = rpa_3.FRONT_BACK;
        }
        rfH_2 rfH_23 = rfH_22.id_class(rqd_32.id_class(rpr_3.EAST), n);
        rfH_23 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), n2);
        list.add(new rrrY(this.id_class, rrrD2.id_protected(this.id_break), rfH_23, rqd_33, rpa_32));
    }

    private void id_class(List<rrrY> list, rfH_2 rfH_22, rqd_3 rqd_32, rrre_1 rrre_12, rrre_1 rrre_13) {
        rfH_2 rfH_23;
        boolean bl;
        rfH_2 rfH_24;
        int n;
        int n2;
        for (n2 = 0; n2 < rrre_12.id_byte; ++n2) {
            for (n = 0; n < rrre_12.id_break; ++n) {
                rfH_24 = rfH_22.id_class(rqd_32.id_class(rpr_3.SOUTH), 8 + (n2 - this.id_protected) * 8);
                rfH_24 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), (n - this.id_byte) * 8);
                boolean bl2 = bl = rrre_13 != null && rrrR.id_class(rrre_13, n, n2);
                if (!rrrR.id_class(rrre_12, n, n2) || bl) continue;
                list.add(new rrrY(this.id_class, "roof", rfH_24.id_break(3), rqd_32));
                if (!rrrR.id_class(rrre_12, n + 1, n2)) {
                    rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), 6);
                    list.add(new rrrY(this.id_class, "roof_front", rfH_23, rqd_32));
                }
                if (!rrrR.id_class(rrre_12, n - 1, n2)) {
                    rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), 0);
                    rfH_23 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 7);
                    list.add(new rrrY(this.id_class, "roof_front", rfH_23, rqd_32.id_class(rqd_3.CLOCKWISE_180)));
                }
                if (!rrrR.id_class(rrre_12, n, n2 - 1)) {
                    rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.WEST), 1);
                    list.add(new rrrY(this.id_class, "roof_front", rfH_23, rqd_32.id_class(rqd_3.COUNTERCLOCKWISE_90)));
                }
                if (rrrR.id_class(rrre_12, n, n2 + 1)) continue;
                rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), 6);
                rfH_23 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 6);
                list.add(new rrrY(this.id_class, "roof_front", rfH_23, rqd_32.id_class(rqd_3.CLOCKWISE_90)));
            }
        }
        if (rrre_13 != null) {
            for (n2 = 0; n2 < rrre_12.id_byte; ++n2) {
                for (n = 0; n < rrre_12.id_break; ++n) {
                    rfH_24 = rfH_22.id_class(rqd_32.id_class(rpr_3.SOUTH), 8 + (n2 - this.id_protected) * 8);
                    rfH_24 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), (n - this.id_byte) * 8);
                    bl = rrrR.id_class(rrre_13, n, n2);
                    if (!rrrR.id_class(rrre_12, n, n2) || !bl) continue;
                    if (!rrrR.id_class(rrre_12, n + 1, n2)) {
                        rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), 7);
                        list.add(new rrrY(this.id_class, "small_wall", rfH_23, rqd_32));
                    }
                    if (!rrrR.id_class(rrre_12, n - 1, n2)) {
                        rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.WEST), 1);
                        rfH_23 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 6);
                        list.add(new rrrY(this.id_class, "small_wall", rfH_23, rqd_32.id_class(rqd_3.CLOCKWISE_180)));
                    }
                    if (!rrrR.id_class(rrre_12, n, n2 - 1)) {
                        rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.WEST), 0);
                        rfH_23 = rfH_23.id_class(rqd_32.id_class(rpr_3.NORTH), 1);
                        list.add(new rrrY(this.id_class, "small_wall", rfH_23, rqd_32.id_class(rqd_3.COUNTERCLOCKWISE_90)));
                    }
                    if (!rrrR.id_class(rrre_12, n, n2 + 1)) {
                        rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), 6);
                        rfH_23 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 7);
                        list.add(new rrrY(this.id_class, "small_wall", rfH_23, rqd_32.id_class(rqd_3.CLOCKWISE_90)));
                    }
                    if (!rrrR.id_class(rrre_12, n + 1, n2)) {
                        if (!rrrR.id_class(rrre_12, n, n2 - 1)) {
                            rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), 7);
                            rfH_23 = rfH_23.id_class(rqd_32.id_class(rpr_3.NORTH), 2);
                            list.add(new rrrY(this.id_class, "small_wall_corner", rfH_23, rqd_32));
                        }
                        if (!rrrR.id_class(rrre_12, n, n2 + 1)) {
                            rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), 8);
                            rfH_23 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 7);
                            list.add(new rrrY(this.id_class, "small_wall_corner", rfH_23, rqd_32.id_class(rqd_3.CLOCKWISE_90)));
                        }
                    }
                    if (rrrR.id_class(rrre_12, n - 1, n2)) continue;
                    if (!rrrR.id_class(rrre_12, n, n2 - 1)) {
                        rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.WEST), 2);
                        rfH_23 = rfH_23.id_class(rqd_32.id_class(rpr_3.NORTH), 1);
                        list.add(new rrrY(this.id_class, "small_wall_corner", rfH_23, rqd_32.id_class(rqd_3.COUNTERCLOCKWISE_90)));
                    }
                    if (rrrR.id_class(rrre_12, n, n2 + 1)) continue;
                    rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.WEST), 1);
                    rfH_23 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 8);
                    list.add(new rrrY(this.id_class, "small_wall_corner", rfH_23, rqd_32.id_class(rqd_3.CLOCKWISE_180)));
                }
            }
        }
        for (n2 = 0; n2 < rrre_12.id_byte; ++n2) {
            for (n = 0; n < rrre_12.id_break; ++n) {
                rfH_2 rfH_25;
                rfH_24 = rfH_22.id_class(rqd_32.id_class(rpr_3.SOUTH), 8 + (n2 - this.id_protected) * 8);
                rfH_24 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), (n - this.id_byte) * 8);
                boolean bl3 = bl = rrre_13 != null && rrrR.id_class(rrre_13, n, n2);
                if (!rrrR.id_class(rrre_12, n, n2) || bl) continue;
                if (!rrrR.id_class(rrre_12, n + 1, n2)) {
                    rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), 6);
                    if (!rrrR.id_class(rrre_12, n, n2 + 1)) {
                        rfH_25 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 6);
                        list.add(new rrrY(this.id_class, "roof_corner", rfH_25, rqd_32));
                    } else if (rrrR.id_class(rrre_12, n + 1, n2 + 1)) {
                        rfH_25 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 5);
                        list.add(new rrrY(this.id_class, "roof_inner_corner", rfH_25, rqd_32));
                    }
                    if (!rrrR.id_class(rrre_12, n, n2 - 1)) {
                        list.add(new rrrY(this.id_class, "roof_corner", rfH_23, rqd_32.id_class(rqd_3.COUNTERCLOCKWISE_90)));
                    } else if (rrrR.id_class(rrre_12, n + 1, n2 - 1)) {
                        rfH_25 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), 9);
                        rfH_25 = rfH_25.id_class(rqd_32.id_class(rpr_3.NORTH), 2);
                        list.add(new rrrY(this.id_class, "roof_inner_corner", rfH_25, rqd_32.id_class(rqd_3.CLOCKWISE_90)));
                    }
                }
                if (rrrR.id_class(rrre_12, n - 1, n2)) continue;
                rfH_23 = rfH_24.id_class(rqd_32.id_class(rpr_3.EAST), 0);
                rfH_23 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 0);
                if (!rrrR.id_class(rrre_12, n, n2 + 1)) {
                    rfH_25 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 6);
                    list.add(new rrrY(this.id_class, "roof_corner", rfH_25, rqd_32.id_class(rqd_3.CLOCKWISE_90)));
                } else if (rrrR.id_class(rrre_12, n - 1, n2 + 1)) {
                    rfH_25 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 8);
                    rfH_25 = rfH_25.id_class(rqd_32.id_class(rpr_3.WEST), 3);
                    list.add(new rrrY(this.id_class, "roof_inner_corner", rfH_25, rqd_32.id_class(rqd_3.COUNTERCLOCKWISE_90)));
                }
                if (!rrrR.id_class(rrre_12, n, n2 - 1)) {
                    list.add(new rrrY(this.id_class, "roof_corner", rfH_23, rqd_32.id_class(rqd_3.CLOCKWISE_180)));
                    continue;
                }
                if (!rrrR.id_class(rrre_12, n - 1, n2 - 1)) continue;
                rfH_25 = rfH_23.id_class(rqd_32.id_class(rpr_3.SOUTH), 1);
                list.add(new rrrY(this.id_class, "roof_inner_corner", rfH_25, rqd_32.id_class(rqd_3.CLOCKWISE_180)));
            }
        }
    }

    private void id_class(List<rrrY> list, rrro_1 rrro_12) {
        rpr_3 rpr_32 = rrro_12.id_class.id_class(rpr_3.WEST);
        list.add(new rrrY(this.id_class, "entrance", rrro_12.id_break.id_class(rpr_32, 9), rrro_12.id_class));
        rrro_12.id_break = rrro_12.id_break.id_class(rrro_12.id_class.id_class(rpr_3.SOUTH), 16);
    }

    private void id_class(List<rrrY> list, rrro_1 rrro_12, rrre_1 rrre_12, rpr_3 rpr_32, int n, int n2, int n3, int n4) {
        int n5 = n;
        int n6 = n2;
        rpr_3 rpr_33 = rpr_32;
        do {
            if (!rrrR.id_class(rrre_12, n5 + rpr_32.id_implements(), n6 + rpr_32.id_extends())) {
                this.id_byte(list, rrro_12);
                rpr_32 = rpr_32.id_catch();
                if (n5 == n3 && n6 == n4 && rpr_33 == rpr_32) continue;
                this.id_break(list, rrro_12);
                continue;
            }
            if (rrrR.id_class(rrre_12, n5 + rpr_32.id_implements(), n6 + rpr_32.id_extends()) && rrrR.id_class(rrre_12, n5 + rpr_32.id_implements() + rpr_32.id_private().id_implements(), n6 + rpr_32.id_extends() + rpr_32.id_private().id_extends())) {
                this.id_protected(list, rrro_12);
                n5 += rpr_32.id_implements();
                n6 += rpr_32.id_extends();
                rpr_32 = rpr_32.id_private();
                continue;
            }
            if ((n5 += rpr_32.id_implements()) == n3 && (n6 += rpr_32.id_extends()) == n4 && rpr_33 == rpr_32) continue;
            this.id_break(list, rrro_12);
        } while (n5 != n3 || n6 != n4 || rpr_33 != rpr_32);
    }

    private void id_break(List<rrrY> list, rrro_1 rrro_12) {
        list.add(new rrrY(this.id_class, rrro_12.id_byte, rrro_12.id_break.id_class(rrro_12.id_class.id_class(rpr_3.EAST), 7), rrro_12.id_class));
        rrro_12.id_break = rrro_12.id_break.id_class(rrro_12.id_class.id_class(rpr_3.SOUTH), 8);
    }

    private void id_protected(List<rrrY> list, rrro_1 rrro_12) {
        rrro_12.id_break = rrro_12.id_break.id_class(rrro_12.id_class.id_class(rpr_3.SOUTH), 6);
        rrro_12.id_break = rrro_12.id_break.id_class(rrro_12.id_class.id_class(rpr_3.EAST), 8);
        rrro_12.id_class = rrro_12.id_class.id_class(rqd_3.COUNTERCLOCKWISE_90);
    }
}

