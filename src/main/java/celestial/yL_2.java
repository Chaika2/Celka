/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue
 */
package celestial;

import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.yF_2;
import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

public class yL_2 {
    private static final int id_class = (int)Math.pow(16.0, 0.0);
    private static final int id_break = (int)Math.pow(16.0, 1.0);
    private static final int id_byte = (int)Math.pow(16.0, 2.0);
    private static final rpr_3[] id_protected = rpr_3.values();
    private final BitSet id_throws = new BitSet(4096);
    private static final int[] id_case = rqR_2.id_class(new int[1352], nArray -> {
        boolean bl = false;
        int n = 15;
        int n2 = 0;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    if (i != 0 && i != 15 && j != 0 && j != 15 && k != 0 && k != 15) continue;
                    nArray[n2++] = yL_2.id_class(i, j, k);
                }
            }
        }
    });
    private int id_catch = 4096;

    public void id_class(rfH_2 rfH_22) {
        this.id_throws.set(yL_2.id_break(rfH_22), true);
        --this.id_catch;
    }

    private Set<rpr_3> id_class(int n) {
        EnumSet<rpr_3> enumSet = EnumSet.noneOf(rpr_3.class);
        IntArrayFIFOQueue intArrayFIFOQueue = new IntArrayFIFOQueue(384);
        intArrayFIFOQueue.enqueue(n);
        this.id_throws.set(n, true);
        while (!intArrayFIFOQueue.isEmpty()) {
            int n2 = intArrayFIFOQueue.dequeueInt();
            this.id_class(n2, enumSet);
            for (rpr_3 rpr_32 : id_protected) {
                int n3 = this.id_class(n2, rpr_32);
                if (n3 < 0 || this.id_throws.get(n3)) continue;
                this.id_throws.set(n3, true);
                intArrayFIFOQueue.enqueue(n3);
            }
        }
        return enumSet;
    }

    private int id_class(int n, rpr_3 rpr_32) {
        switch (rpr_32) {
            case DOWN: {
                if ((n >> 8 & 0xF) == 0) {
                    return -1;
                }
                return n - id_byte;
            }
            case UP: {
                if ((n >> 8 & 0xF) == 15) {
                    return -1;
                }
                return n + id_byte;
            }
            case NORTH: {
                if ((n >> 4 & 0xF) == 0) {
                    return -1;
                }
                return n - id_break;
            }
            case SOUTH: {
                if ((n >> 4 & 0xF) == 15) {
                    return -1;
                }
                return n + id_break;
            }
            case WEST: {
                if ((n >> 0 & 0xF) == 0) {
                    return -1;
                }
                return n - id_class;
            }
            case EAST: {
                if ((n >> 0 & 0xF) == 15) {
                    return -1;
                }
                return n + id_class;
            }
        }
        return -1;
    }

    private void id_class(int n, Set<rpr_3> set) {
        int n2 = n >> 0 & 0xF;
        if (n2 == 0) {
            set.add(rpr_3.WEST);
        } else if (n2 == 15) {
            set.add(rpr_3.EAST);
        }
        int n3 = n >> 8 & 0xF;
        if (n3 == 0) {
            set.add(rpr_3.DOWN);
        } else if (n3 == 15) {
            set.add(rpr_3.UP);
        }
        int n4 = n >> 4 & 0xF;
        if (n4 == 0) {
            set.add(rpr_3.NORTH);
        } else if (n4 == 15) {
            set.add(rpr_3.SOUTH);
        }
    }

    private static int id_class(int n, int n2, int n3) {
        return n << 0 | n2 << 8 | n3 << 4;
    }

    public yF_2 id_class() {
        yF_2 yF_22 = new yF_2();
        if (4096 - this.id_catch < 256) {
            yF_22.id_class(true);
        } else if (this.id_catch == 0) {
            yF_22.id_class(false);
        } else {
            for (int n : id_case) {
                if (this.id_throws.get(n)) continue;
                yF_22.id_class(this.id_class(n));
            }
        }
        return yF_22;
    }

    private static int id_break(rfH_2 rfH_22) {
        return yL_2.id_class(rfH_22.b_() & 0xF, rfH_22.c_() & 0xF, rfH_22.d_() & 0xF);
    }
}

