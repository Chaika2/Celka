/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCR;
import celestial.rpa_3;
import celestial.rqd_3;

public class dW_2 {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;
    public static final /* synthetic */ int[] id_byte;

    static {
        id_byte = new int[rpa_3.values().length];
        try {
            dW_2.id_byte[rpa_3.LEFT_RIGHT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dW_2.id_byte[rpa_3.FRONT_BACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_break = new int[rqd_3.values().length];
        try {
            dW_2.id_break[rqd_3.CLOCKWISE_180.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dW_2.id_break[rqd_3.COUNTERCLOCKWISE_90.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dW_2.id_break[rqd_3.CLOCKWISE_90.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[rCR.values().length];
        try {
            dW_2.id_class[rCR.ASCENDING_EAST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dW_2.id_class[rCR.ASCENDING_WEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dW_2.id_class[rCR.ASCENDING_NORTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dW_2.id_class[rCR.ASCENDING_SOUTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dW_2.id_class[rCR.SOUTH_EAST.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dW_2.id_class[rCR.SOUTH_WEST.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dW_2.id_class[rCR.NORTH_WEST.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dW_2.id_class[rCR.NORTH_EAST.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dW_2.id_class[rCR.NORTH_SOUTH.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dW_2.id_class[rCR.EAST_WEST.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

