/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXQ;
import celestial.rdB_2;
import celestial.rdy_3;
import celestial.rkg_3;
import celestial.rpo_3;
import celestial.rqA_2;
import celestial.rqn_3;
import java.util.function.Supplier;

public final class rxE_2
extends Enum<rxE_2>
implements rdB_2 {
    public static final /* enum */ rxE_2 LEATHER = new rxE_2("leather", 5, new int[]{1, 2, 3, 1}, 15, rqn_3.id_boolean, 0.0f, 0.0f, () -> rkg_3.id_class(rdy_3.ha));
    public static final /* enum */ rxE_2 CHAIN = new rxE_2("chainmail", 15, new int[]{1, 4, 5, 2}, 12, rqn_3.id_static, 0.0f, 0.0f, () -> rkg_3.id_class(rdy_3.Ox));
    public static final /* enum */ rxE_2 IRON = new rxE_2("iron", 15, new int[]{2, 5, 6, 2}, 9, rqn_3.id_strictfp, 0.0f, 0.0f, () -> rkg_3.id_class(rdy_3.Ox));
    public static final /* enum */ rxE_2 GOLD = new rxE_2("gold", 7, new int[]{1, 3, 5, 2}, 25, rqn_3.id_const, 0.0f, 0.0f, () -> rkg_3.id_class(rdy_3.Od));
    public static final /* enum */ rxE_2 DIAMOND = new rxE_2("diamond", 33, new int[]{3, 6, 8, 3}, 10, rqn_3.id_import, 2.0f, 0.0f, () -> rkg_3.id_class(rdy_3.OJ));
    public static final /* enum */ rxE_2 TURTLE = new rxE_2("turtle", 25, new int[]{2, 5, 6, 2}, 9, rqn_3.id_for, 0.0f, 0.0f, () -> rkg_3.id_class(rdy_3.OE));
    public static final /* enum */ rxE_2 NETHERITE = new rxE_2("netherite", 37, new int[]{3, 6, 8, 3}, 15, rqn_3.id_transient, 3.0f, 0.1f, () -> rkg_3.id_class(rdy_3.Ok));
    private static final int[] MAX_DAMAGE_ARRAY;
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final rqA_2 soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final rpo_3<rkg_3> repairMaterial;
    private static final /* synthetic */ rxE_2[] $VALUES;

    @Override
    public rkg_3 id_byte() {
        return this.repairMaterial.id_class();
    }

    private rxE_2(String string2, int n2, int[] nArray, int n3, rqA_2 rqA_22, float f, float f2, Supplier<rkg_3> supplier) {
        this.name = string2;
        this.maxDamageFactor = n2;
        this.damageReductionAmountArray = nArray;
        this.enchantability = n3;
        this.soundEvent = rqA_22;
        this.toughness = f;
        this.knockbackResistance = f2;
        this.repairMaterial = new rpo_3<rkg_3>(supplier);
    }

    static {
        $VALUES = rxE_2.id_final();
        MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    }

    public static rxE_2[] values() {
        return (rxE_2[])$VALUES.clone();
    }

    public static rxE_2 valueOf(String string) {
        return Enum.valueOf(rxE_2.class, string);
    }

    @Override
    public int id_class(rXQ rXQ2) {
        return MAX_DAMAGE_ARRAY[rXQ2.id_break()] * this.maxDamageFactor;
    }

    @Override
    public int id_class() {
        return this.enchantability;
    }

    @Override
    public int id_break(rXQ rXQ2) {
        return this.damageReductionAmountArray[rXQ2.id_break()];
    }

    @Override
    public rqA_2 id_break() {
        return this.soundEvent;
    }

    @Override
    public float id_throws() {
        return this.toughness;
    }

    @Override
    public float id_case() {
        return this.knockbackResistance;
    }

    @Override
    public String id_protected() {
        return this.name;
    }

    private static /* synthetic */ rxE_2[] id_final() {
        return new rxE_2[]{LEATHER, CHAIN, IRON, GOLD, DIAMOND, TURTLE, NETHERITE};
    }
}

