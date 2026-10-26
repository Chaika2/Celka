/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrdX
extends Enum<rrdX> {
    public static final /* enum */ rrdX NONE = new rrdX();
    public static final /* enum */ rrdX SKY = new rrdX();
    public static final /* enum */ rrdX SUNSET = new rrdX();
    public static final /* enum */ rrdX CUSTOM_SKY = new rrdX();
    public static final /* enum */ rrdX SUN = new rrdX();
    public static final /* enum */ rrdX MOON = new rrdX();
    public static final /* enum */ rrdX STARS = new rrdX();
    public static final /* enum */ rrdX VOID = new rrdX();
    public static final /* enum */ rrdX TERRAIN_SOLID = new rrdX();
    public static final /* enum */ rrdX TERRAIN_CUTOUT_MIPPED = new rrdX();
    public static final /* enum */ rrdX TERRAIN_CUTOUT = new rrdX();
    public static final /* enum */ rrdX ENTITIES = new rrdX();
    public static final /* enum */ rrdX BLOCK_ENTITIES = new rrdX();
    public static final /* enum */ rrdX DESTROY = new rrdX();
    public static final /* enum */ rrdX OUTLINE = new rrdX();
    public static final /* enum */ rrdX DEBUG = new rrdX();
    public static final /* enum */ rrdX HAND_SOLID = new rrdX();
    public static final /* enum */ rrdX TERRAIN_TRANSLUCENT = new rrdX();
    public static final /* enum */ rrdX TRIPWIRE = new rrdX();
    public static final /* enum */ rrdX PARTICLES = new rrdX();
    public static final /* enum */ rrdX CLOUDS = new rrdX();
    public static final /* enum */ rrdX RAIN_SNOW = new rrdX();
    public static final /* enum */ rrdX WORLD_BORDER = new rrdX();
    public static final /* enum */ rrdX HAND_TRANSLUCENT = new rrdX();
    private static final /* synthetic */ rrdX[] $VALUES;

    static {
        $VALUES = rrdX.id_class();
    }

    public static rrdX[] values() {
        return (rrdX[])$VALUES.clone();
    }

    public static rrdX valueOf(String string) {
        return Enum.valueOf(rrdX.class, string);
    }

    private static /* synthetic */ rrdX[] id_class() {
        return new rrdX[]{NONE, SKY, SUNSET, CUSTOM_SKY, SUN, MOON, STARS, VOID, TERRAIN_SOLID, TERRAIN_CUTOUT_MIPPED, TERRAIN_CUTOUT, ENTITIES, BLOCK_ENTITIES, DESTROY, OUTLINE, DEBUG, HAND_SOLID, TERRAIN_TRANSLUCENT, TRIPWIRE, PARTICLES, CLOUDS, RAIN_SNOW, WORLD_BORDER, HAND_TRANSLUCENT};
    }
}

