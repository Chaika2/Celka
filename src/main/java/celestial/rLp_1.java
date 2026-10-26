/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rLp_1
extends Enum<rLp_1> {
    public static final /* enum */ rLp_1 BLOCKED = new rLp_1(-1.0f);
    public static final /* enum */ rLp_1 OPEN = new rLp_1(0.0f);
    public static final /* enum */ rLp_1 WALKABLE = new rLp_1(0.0f);
    public static final /* enum */ rLp_1 WALKABLE_DOOR = new rLp_1(0.0f);
    public static final /* enum */ rLp_1 TRAPDOOR = new rLp_1(0.0f);
    public static final /* enum */ rLp_1 FENCE = new rLp_1(-1.0f);
    public static final /* enum */ rLp_1 LAVA = new rLp_1(-1.0f);
    public static final /* enum */ rLp_1 WATER = new rLp_1(8.0f);
    public static final /* enum */ rLp_1 WATER_BORDER = new rLp_1(8.0f);
    public static final /* enum */ rLp_1 RAIL = new rLp_1(0.0f);
    public static final /* enum */ rLp_1 UNPASSABLE_RAIL = new rLp_1(-1.0f);
    public static final /* enum */ rLp_1 DANGER_FIRE = new rLp_1(8.0f);
    public static final /* enum */ rLp_1 DAMAGE_FIRE = new rLp_1(16.0f);
    public static final /* enum */ rLp_1 DANGER_CACTUS = new rLp_1(8.0f);
    public static final /* enum */ rLp_1 DAMAGE_CACTUS = new rLp_1(-1.0f);
    public static final /* enum */ rLp_1 DANGER_OTHER = new rLp_1(8.0f);
    public static final /* enum */ rLp_1 DAMAGE_OTHER = new rLp_1(-1.0f);
    public static final /* enum */ rLp_1 DOOR_OPEN = new rLp_1(0.0f);
    public static final /* enum */ rLp_1 DOOR_WOOD_CLOSED = new rLp_1(-1.0f);
    public static final /* enum */ rLp_1 DOOR_IRON_CLOSED = new rLp_1(-1.0f);
    public static final /* enum */ rLp_1 BREACH = new rLp_1(4.0f);
    public static final /* enum */ rLp_1 LEAVES = new rLp_1(-1.0f);
    public static final /* enum */ rLp_1 STICKY_HONEY = new rLp_1(8.0f);
    public static final /* enum */ rLp_1 COCOA = new rLp_1(0.0f);
    private final float priority;
    private static final /* synthetic */ rLp_1[] $VALUES;

    private rLp_1(float f) {
        this.priority = f;
    }

    static {
        $VALUES = rLp_1.id_break();
    }

    public static rLp_1[] values() {
        return (rLp_1[])$VALUES.clone();
    }

    public static rLp_1 valueOf(String string) {
        return Enum.valueOf(rLp_1.class, string);
    }

    public float id_class() {
        return this.priority;
    }

    private static /* synthetic */ rLp_1[] id_break() {
        return new rLp_1[]{BLOCKED, OPEN, WALKABLE, WALKABLE_DOOR, TRAPDOOR, FENCE, LAVA, WATER, WATER_BORDER, RAIL, UNPASSABLE_RAIL, DANGER_FIRE, DAMAGE_FIRE, DANGER_CACTUS, DAMAGE_CACTUS, DANGER_OTHER, DAMAGE_OTHER, DOOR_OPEN, DOOR_WOOD_CLOSED, DOOR_IRON_CLOSED, BREACH, LEAVES, STICKY_HONEY, COCOA};
    }
}

