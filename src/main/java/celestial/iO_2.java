/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class iO_2
extends Enum<iO_2> {
    public static final /* enum */ iO_2 NATURAL = new iO_2();
    public static final /* enum */ iO_2 CHUNK_GENERATION = new iO_2();
    public static final /* enum */ iO_2 SPAWNER = new iO_2();
    public static final /* enum */ iO_2 STRUCTURE = new iO_2();
    public static final /* enum */ iO_2 BREEDING = new iO_2();
    public static final /* enum */ iO_2 MOB_SUMMONED = new iO_2();
    public static final /* enum */ iO_2 JOCKEY = new iO_2();
    public static final /* enum */ iO_2 EVENT = new iO_2();
    public static final /* enum */ iO_2 CONVERSION = new iO_2();
    public static final /* enum */ iO_2 REINFORCEMENT = new iO_2();
    public static final /* enum */ iO_2 TRIGGERED = new iO_2();
    public static final /* enum */ iO_2 BUCKET = new iO_2();
    public static final /* enum */ iO_2 SPAWN_EGG = new iO_2();
    public static final /* enum */ iO_2 COMMAND = new iO_2();
    public static final /* enum */ iO_2 DISPENSER = new iO_2();
    public static final /* enum */ iO_2 PATROL = new iO_2();
    private static final /* synthetic */ iO_2[] $VALUES;

    static {
        $VALUES = iO_2.id_class();
    }

    public static iO_2[] values() {
        return (iO_2[])$VALUES.clone();
    }

    public static iO_2 valueOf(String string) {
        return Enum.valueOf(iO_2.class, string);
    }

    private static /* synthetic */ iO_2[] id_class() {
        return new iO_2[]{NATURAL, CHUNK_GENERATION, SPAWNER, STRUCTURE, BREEDING, MOB_SUMMONED, JOCKEY, EVENT, CONVERSION, REINFORCEMENT, TRIGGERED, BUCKET, SPAWN_EGG, COMMAND, DISPENSER, PATROL};
    }
}

