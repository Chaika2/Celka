/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rnX_2;
import celestial.rpr_3;

public class qk_3 {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;

    static {
        id_break = new int[rnX_2.values().length];
        try {
            qk_3.id_break[rnX_2.ALWAYS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            qk_3.id_break[rnX_2.NEVER.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            qk_3.id_break[rnX_2.HIDE_FOR_OTHER_TEAMS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            qk_3.id_break[rnX_2.HIDE_FOR_OWN_TEAM.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[rpr_3.values().length];
        try {
            qk_3.id_class[rpr_3.SOUTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            qk_3.id_class[rpr_3.WEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            qk_3.id_class[rpr_3.NORTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            qk_3.id_class[rpr_3.EAST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

