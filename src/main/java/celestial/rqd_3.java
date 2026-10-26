/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rjg_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqR_2;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class rqd_3
extends Enum<rqd_3> {
    public static final /* enum */ rqd_3 NONE = new rqd_3(rjg_3.IDENTITY);
    public static final /* enum */ rqd_3 CLOCKWISE_90 = new rqd_3(rjg_3.ROT_90_Y_NEG);
    public static final /* enum */ rqd_3 CLOCKWISE_180 = new rqd_3(rjg_3.ROT_180_FACE_XZ);
    public static final /* enum */ rqd_3 COUNTERCLOCKWISE_90 = new rqd_3(rjg_3.ROT_90_Y_POS);
    private final rjg_3 orientation;
    private static final /* synthetic */ rqd_3[] $VALUES;

    private rqd_3(rjg_3 rjg_32) {
        this.orientation = rjg_32;
    }

    static {
        $VALUES = rqd_3.id_break();
    }

    public static rqd_3[] values() {
        return (rqd_3[])$VALUES.clone();
    }

    public static rqd_3 valueOf(String string) {
        return Enum.valueOf(rqd_3.class, string);
    }

    public int id_class(int n, int n2) {
        switch (this) {
            case CLOCKWISE_90: {
                return (n + n2 / 4) % n2;
            }
            case CLOCKWISE_180: {
                return (n + n2 / 2) % n2;
            }
            case COUNTERCLOCKWISE_90: {
                return (n + n2 * 3 / 4) % n2;
            }
        }
        return n;
    }

    public rpr_3 id_class(rpr_3 rpr_32) {
        if (rpr_32.id_final() == rpB_2.Y) {
            return rpr_32;
        }
        switch (this) {
            case CLOCKWISE_90: {
                return rpr_32.id_catch();
            }
            case CLOCKWISE_180: {
                return rpr_32.id_case();
            }
            case COUNTERCLOCKWISE_90: {
                return rpr_32.id_private();
            }
        }
        return rpr_32;
    }

    public static rqd_3 id_class(Random random) {
        return rqR_2.id_class(rqd_3.values(), random);
    }

    public rqd_3 id_class(rqd_3 rqd_32) {
        switch (rqd_32) {
            case CLOCKWISE_180: {
                switch (this) {
                    case NONE: {
                        return CLOCKWISE_180;
                    }
                    case CLOCKWISE_90: {
                        return COUNTERCLOCKWISE_90;
                    }
                    case CLOCKWISE_180: {
                        return NONE;
                    }
                    case COUNTERCLOCKWISE_90: {
                        return CLOCKWISE_90;
                    }
                }
            }
            case COUNTERCLOCKWISE_90: {
                switch (this) {
                    case NONE: {
                        return COUNTERCLOCKWISE_90;
                    }
                    case CLOCKWISE_90: {
                        return NONE;
                    }
                    case CLOCKWISE_180: {
                        return CLOCKWISE_90;
                    }
                    case COUNTERCLOCKWISE_90: {
                        return CLOCKWISE_180;
                    }
                }
            }
            case CLOCKWISE_90: {
                switch (this) {
                    case NONE: {
                        return CLOCKWISE_90;
                    }
                    case CLOCKWISE_90: {
                        return CLOCKWISE_180;
                    }
                    case CLOCKWISE_180: {
                        return COUNTERCLOCKWISE_90;
                    }
                    case COUNTERCLOCKWISE_90: {
                        return NONE;
                    }
                }
            }
        }
        return this;
    }

    public rjg_3 id_class() {
        return this.orientation;
    }

    public static List<rqd_3> id_break(Random random) {
        ArrayList arrayList = Lists.newArrayList((Object[])rqd_3.values());
        Collections.shuffle(arrayList, random);
        return arrayList;
    }

    private static /* synthetic */ rqd_3[] id_break() {
        return new rqd_3[]{NONE, CLOCKWISE_90, CLOCKWISE_180, COUNTERCLOCKWISE_90};
    }
}

