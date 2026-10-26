/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdG_2;
import celestial.rdy_3;
import celestial.rkg_3;
import celestial.rlc_3;
import celestial.rpo_3;
import java.util.function.Supplier;

public final class rdl_3
extends Enum<rdl_3>
implements rdG_2 {
    public static final /* enum */ rdl_3 WOOD = new rdl_3(0, 59, 2.0f, 0.0f, 15, () -> rkg_3.id_class(rlc_3.id_byte));
    public static final /* enum */ rdl_3 STONE = new rdl_3(1, 131, 4.0f, 1.0f, 5, () -> rkg_3.id_class(rlc_3.b));
    public static final /* enum */ rdl_3 IRON = new rdl_3(2, 250, 6.0f, 2.0f, 14, () -> rkg_3.id_class(rdy_3.Ox));
    public static final /* enum */ rdl_3 DIAMOND = new rdl_3(3, 1561, 8.0f, 3.0f, 10, () -> rkg_3.id_class(rdy_3.OJ));
    public static final /* enum */ rdl_3 GOLD = new rdl_3(0, 32, 12.0f, 0.0f, 22, () -> rkg_3.id_class(rdy_3.Od));
    public static final /* enum */ rdl_3 NETHERITE = new rdl_3(4, 2031, 9.0f, 4.0f, 15, () -> rkg_3.id_class(rdy_3.Ok));
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final rpo_3<rkg_3> repairMaterial;
    private static final /* synthetic */ rdl_3[] $VALUES;

    @Override
    public float id_byte() {
        return this.attackDamage;
    }

    private rdl_3(int n2, int n3, float f, float f2, int n4, Supplier<rkg_3> supplier) {
        this.harvestLevel = n2;
        this.maxUses = n3;
        this.efficiency = f;
        this.attackDamage = f2;
        this.enchantability = n4;
        this.repairMaterial = new rpo_3<rkg_3>(supplier);
    }

    static {
        $VALUES = rdl_3.id_volatile();
    }

    public static rdl_3[] values() {
        return (rdl_3[])$VALUES.clone();
    }

    public static rdl_3 valueOf(String string) {
        return Enum.valueOf(rdl_3.class, string);
    }

    @Override
    public int id_class() {
        return this.maxUses;
    }

    @Override
    public float id_break() {
        return this.efficiency;
    }

    @Override
    public int id_throws() {
        return this.enchantability;
    }

    @Override
    public rkg_3 id_case() {
        return this.repairMaterial.id_class();
    }

    @Override
    public int id_protected() {
        return this.harvestLevel;
    }

    private static /* synthetic */ rdl_3[] id_volatile() {
        return new rdl_3[]{WOOD, STONE, IRON, DIAMOND, GOLD, NETHERITE};
    }
}

