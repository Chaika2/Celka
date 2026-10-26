/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHF;
import celestial.rZM;
import celestial.rmU_2;
import celestial.rmf_3;

public class rmp_3 {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;
    public static final /* synthetic */ int[] id_byte;
    public static final /* synthetic */ int[] id_protected;

    static {
        id_protected = new int[rmf_3.values().length];
        try {
            rmp_3.id_protected[rmf_3.PERFORM_RESPAWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_protected[rmf_3.REQUEST_STATS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_byte = new int[rmU_2.values().length];
        try {
            rmp_3.id_byte[rmU_2.PRESS_SHIFT_KEY.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_byte[rmU_2.RELEASE_SHIFT_KEY.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_byte[rmU_2.START_SPRINTING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_byte[rmU_2.STOP_SPRINTING.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_byte[rmU_2.STOP_SLEEPING.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_byte[rmU_2.START_RIDING_JUMP.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_byte[rmU_2.STOP_RIDING_JUMP.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_byte[rmU_2.OPEN_INVENTORY.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_byte[rmU_2.START_FALL_FLYING.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_break = new int[rZM.values().length];
        try {
            rmp_3.id_break[rZM.SWAP_ITEM_WITH_OFFHAND.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_break[rZM.DROP_ITEM.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_break[rZM.DROP_ALL_ITEMS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_break[rZM.RELEASE_USE_ITEM.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_break[rZM.START_DESTROY_BLOCK.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_break[rZM.ABORT_DESTROY_BLOCK.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_break[rZM.STOP_DESTROY_BLOCK.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[rHF.values().length];
        try {
            rmp_3.id_class[rHF.SEQUENCE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_class[rHF.AUTO.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rmp_3.id_class[rHF.REDSTONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

