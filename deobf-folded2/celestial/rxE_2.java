package celestial;

import java.util.function.Supplier;

public enum rxE_2 implements rdB_2 {
   LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, rqn_3.id_boolean, 0.0F, 0.0F, () -> rkg_3.id_class(rdy_3.ha)),
   CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, rqn_3.id_static, 0.0F, 0.0F, () -> rkg_3.id_class(rdy_3.Ox)),
   IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, rqn_3.id_strictfp, 0.0F, 0.0F, () -> rkg_3.id_class(rdy_3.Ox)),
   GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, rqn_3.id_const, 0.0F, 0.0F, () -> rkg_3.id_class(rdy_3.Od)),
   DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, rqn_3.id_import, 2.0F, 0.0F, () -> rkg_3.id_class(rdy_3.OJ)),
   TURTLE("turtle", 25, new int[]{2, 5, 6, 2}, 9, rqn_3.id_for, 0.0F, 0.0F, () -> rkg_3.id_class(rdy_3.OE)),
   NETHERITE("netherite", 37, new int[]{3, 6, 8, 3}, 15, rqn_3.id_transient, 3.0F, 0.1F, () -> rkg_3.id_class(rdy_3.Ok));

   private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
   private final String name;
   private final int maxDamageFactor;
   private final int[] damageReductionAmountArray;
   private final int enchantability;
   private final rqA_2 soundEvent;
   private final float toughness;
   private final float knockbackResistance;
   private final rpo_3<rkg_3> repairMaterial;

   @Override
   public rkg_3 id_byte() {
      return this.repairMaterial.id_class();
   }

   private rxE_2(String var3, int var4, int[] var5, int var6, rqA_2 var7, float var8, float var9, Supplier<rkg_3> var10) {
      this.name = var3;
      this.maxDamageFactor = var4;
      this.damageReductionAmountArray = var5;
      this.enchantability = var6;
      this.soundEvent = var7;
      this.toughness = var8;
      this.knockbackResistance = var9;
      this.repairMaterial = new rpo_3<>(var10);
   }

   @Override
   public int id_class(rXQ var1) {
      return MAX_DAMAGE_ARRAY[var1.id_break()] * this.maxDamageFactor;
   }

   @Override
   public int id_class() {
      return this.enchantability;
   }

   @Override
   public int id_break(rXQ var1) {
      return this.damageReductionAmountArray[var1.id_break()];
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
}
