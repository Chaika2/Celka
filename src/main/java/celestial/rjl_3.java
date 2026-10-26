/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
package celestial;

import celestial.rjC_2;
import celestial.rjp_3;
import celestial.rpB_2;
import celestial.rqR_2;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;

public final class rjl_3
extends rjC_2 {
    private final DoubleList id_break;
    private final DoubleList id_byte;
    private final DoubleList id_protected;

    protected rjl_3(rjp_3 rjp_32, double[] dArray, double[] dArray2, double[] dArray3) {
        this(rjp_32, (DoubleList)DoubleArrayList.wrap((double[])Arrays.copyOf(dArray, rjp_32.id_break() + 1)), (DoubleList)DoubleArrayList.wrap((double[])Arrays.copyOf(dArray2, rjp_32.id_byte() + 1)), (DoubleList)DoubleArrayList.wrap((double[])Arrays.copyOf(dArray3, rjp_32.id_protected() + 1)));
    }

    public rjl_3(rjp_3 rjp_32, DoubleList doubleList, DoubleList doubleList2, DoubleList doubleList3) {
        super(rjp_32);
        int n = rjp_32.id_break() + 1;
        int n2 = rjp_32.id_byte() + 1;
        int n3 = rjp_32.id_protected() + 1;
        if (n != doubleList.size() || n2 != doubleList2.size() || n3 != doubleList3.size()) {
            throw rqR_2.id_byte(new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape."));
        }
        this.id_break = doubleList;
        this.id_byte = doubleList2;
        this.id_protected = doubleList3;
    }

    @Override
    protected DoubleList id_class(rpB_2 rpB_22) {
        switch (rpB_22) {
            case X: {
                return this.id_break;
            }
            case Y: {
                return this.id_byte;
            }
            case Z: {
                return this.id_protected;
            }
        }
        throw new IllegalArgumentException();
    }
}

