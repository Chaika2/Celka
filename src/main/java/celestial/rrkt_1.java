/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXC;
import celestial.rrXf_1;
import celestial.rrXj_1;
import celestial.rrXt_1;
import celestial.rrXw_1;
import celestial.rrkA;
import celestial.rrkC;
import celestial.rrkF;
import celestial.rrkL;
import celestial.rrkl_1;
import celestial.rrky_1;

public final class rrkt_1
extends Enum<rrkt_1> {
    public static final /* enum */ rrkt_1 BOOL = new rrkt_1();
    public static final /* enum */ rrkt_1 INT = new rrkt_1();
    public static final /* enum */ rrkt_1 FLOAT = new rrkt_1();
    public static final /* enum */ rrkt_1 VEC2 = new rrkt_1();
    public static final /* enum */ rrkt_1 VEC3 = new rrkt_1();
    public static final /* enum */ rrkt_1 VEC4 = new rrkt_1();
    private static final /* synthetic */ rrkt_1[] $VALUES;

    static {
        $VALUES = rrkt_1.id_class();
    }

    public static rrkt_1[] values() {
        return (rrkt_1[])$VALUES.clone();
    }

    public static rrkt_1 valueOf(String string) {
        return Enum.valueOf(rrkt_1.class, string);
    }

    private void id_class(rrXj_1 rrXj_12, rrkC rrkC2) {
        float[] fArray = rrXj_12.id_class();
        if (fArray.length != 3) {
            throw new RuntimeException("Value length is not 3, length: " + fArray.length);
        }
        rrkC2.id_class(fArray[0], fArray[1], fArray[2]);
    }

    private void id_class(rrXj_1 rrXj_12, rrkl_1 rrkl_12) {
        float[] fArray = rrXj_12.id_class();
        if (fArray.length != 4) {
            throw new RuntimeException("Value length is not 4, length: " + fArray.length);
        }
        rrkl_12.id_class(fArray[0], fArray[1], fArray[2], fArray[3]);
    }

    public boolean id_class(rrXC rrXC2) {
        switch (this) {
            case BOOL: {
                return rrXC2 == rrXC.BOOL;
            }
            case INT: {
                return rrXC2 == rrXC.FLOAT;
            }
            case FLOAT: {
                return rrXC2 == rrXC.FLOAT;
            }
            case VEC2: 
            case VEC3: 
            case VEC4: {
                return rrXC2 == rrXC.FLOAT_ARRAY;
            }
        }
        throw new RuntimeException("Unknown uniform type: " + this);
    }

    private static /* synthetic */ rrkt_1[] id_class() {
        return new rrkt_1[]{BOOL, INT, FLOAT, VEC2, VEC3, VEC4};
    }

    private void id_class(rrXf_1 rrXf_12, rrkF rrkF2) {
        float f = rrXf_12.id_class();
        rrkF2.id_class(f);
    }

    public void id_class(rrXt_1 rrXt_12, rrky_1 rrky_12) {
        switch (this) {
            case BOOL: {
                this.id_class((rrXw_1)rrXt_12, (rrkL)rrky_12);
                return;
            }
            case INT: {
                this.id_class((rrXf_1)rrXt_12, (rrkL)rrky_12);
                return;
            }
            case FLOAT: {
                this.id_class((rrXf_1)rrXt_12, (rrkF)rrky_12);
                return;
            }
            case VEC2: {
                this.id_class((rrXj_1)rrXt_12, (rrkA)rrky_12);
                return;
            }
            case VEC3: {
                this.id_class((rrXj_1)rrXt_12, (rrkC)rrky_12);
                return;
            }
            case VEC4: {
                this.id_class((rrXj_1)rrXt_12, (rrkl_1)rrky_12);
                return;
            }
        }
        throw new RuntimeException("Unknown uniform type: " + this);
    }

    public rrky_1 id_class(String string) {
        switch (this) {
            case BOOL: {
                return new rrkL(string);
            }
            case INT: {
                return new rrkL(string);
            }
            case FLOAT: {
                return new rrkF(string);
            }
            case VEC2: {
                return new rrkA(string);
            }
            case VEC3: {
                return new rrkC(string);
            }
            case VEC4: {
                return new rrkl_1(string);
            }
        }
        throw new RuntimeException("Unknown uniform type: " + this);
    }

    private void id_class(rrXw_1 rrXw_12, rrkL rrkL2) {
        boolean bl = rrXw_12.id_break();
        int n = bl ? 1 : 0;
        rrkL2.id_break(n);
    }

    private void id_class(rrXf_1 rrXf_12, rrkL rrkL2) {
        int n = (int)rrXf_12.id_class();
        rrkL2.id_break(n);
    }

    private void id_class(rrXj_1 rrXj_12, rrkA rrkA2) {
        float[] fArray = rrXj_12.id_class();
        if (fArray.length != 2) {
            throw new RuntimeException("Value length is not 2, length: " + fArray.length);
        }
        rrkA2.id_class(fArray[0], fArray[1]);
    }

    public static rrkt_1 id_break(String string) {
        rrkt_1[] rrkt_1Array = rrkt_1.values();
        for (int i = 0; i < rrkt_1Array.length; ++i) {
            rrkt_1 rrkt_12 = rrkt_1Array[i];
            if (!rrkt_12.name().toLowerCase().equals(string)) continue;
            return rrkt_12;
        }
        return null;
    }
}

