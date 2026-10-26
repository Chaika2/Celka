/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rKm_1
extends Enum<rKm_1> {
    public static final /* enum */ rKm_1 RAW_GENERATION = new rKm_1();
    public static final /* enum */ rKm_1 LAKES = new rKm_1();
    public static final /* enum */ rKm_1 LOCAL_MODIFICATIONS = new rKm_1();
    public static final /* enum */ rKm_1 UNDERGROUND_STRUCTURES = new rKm_1();
    public static final /* enum */ rKm_1 SURFACE_STRUCTURES = new rKm_1();
    public static final /* enum */ rKm_1 STRONGHOLDS = new rKm_1();
    public static final /* enum */ rKm_1 UNDERGROUND_ORES = new rKm_1();
    public static final /* enum */ rKm_1 UNDERGROUND_DECORATION = new rKm_1();
    public static final /* enum */ rKm_1 VEGETAL_DECORATION = new rKm_1();
    public static final /* enum */ rKm_1 TOP_LAYER_MODIFICATION = new rKm_1();
    private static final /* synthetic */ rKm_1[] $VALUES;

    static {
        $VALUES = rKm_1.id_class();
    }

    public static rKm_1[] values() {
        return (rKm_1[])$VALUES.clone();
    }

    public static rKm_1 valueOf(String string) {
        return Enum.valueOf(rKm_1.class, string);
    }

    private static /* synthetic */ rKm_1[] id_class() {
        return new rKm_1[]{RAW_GENERATION, LAKES, LOCAL_MODIFICATIONS, UNDERGROUND_STRUCTURES, SURFACE_STRUCTURES, STRONGHOLDS, UNDERGROUND_ORES, UNDERGROUND_DECORATION, VEGETAL_DECORATION, TOP_LAYER_MODIFICATION};
    }
}

