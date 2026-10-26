/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpB_2;
import celestial.rqd_3;

public class kt_3 {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;

    static {
        id_break = new int[rqd_3.values().length];
        try {
            kt_3.id_break[rqd_3.COUNTERCLOCKWISE_90.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            kt_3.id_break[rqd_3.CLOCKWISE_90.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[rpB_2.values().length];
        try {
            kt_3.id_class[rpB_2.Z.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            kt_3.id_class[rpB_2.X.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

