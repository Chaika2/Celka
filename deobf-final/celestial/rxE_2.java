package celestial;

import java.util.function.Supplier;

public enum rxE_2 implements rdB_2 {
   LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, rqn_3.boolean_, 0.0F, 0.0F, () -> rkg_3.class_(rdy_3.ha)),
   CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, rqn_3.static_, 0.0F, 0.0F, () -> rkg_3.class_(rdy_3.Ox)),
   IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, rqn_3.strictfp_, 0.0F, 0.0F, () -> rkg_3.class_(rdy_3.Ox)),
   GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, rqn_3.const_, 0.0F, 0.0F, () -> rkg_3.class_(rdy_3.Od)),
   DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, rqn_3.import_, 2.0F, 0.0F, () -> rkg_3.class_(rdy_3.OJ)),
   TURTLE("turtle", 25, new int[]{2, 5, 6, 2}, 9, rqn_3.for_, 0.0F, 0.0F, () -> rkg_3.class_(rdy_3.OE)),
   NETHERITE("netherite", 37, new int[]{3, 6, 8, 3}, 15, rqn_3.transient_, 3.0F, 0.1F, () -> rkg_3.class_(rdy_3.Ok));

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
   public rkg_3 byte_() {
      return this.repairMaterial.class_();
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
   public int class_(rXQ var1) {
      return MAX_DAMAGE_ARRAY[var1.break_()] * this.maxDamageFactor;
   }

   @Override
   public int class_() {
      return this.enchantability;
   }

   @Override
   public int break_(rXQ var1) {
      return this.damageReductionAmountArray[var1.break_()];
   }

   @Override
   public rqA_2 break_() {
      return this.soundEvent;
   }

   @Override
   public float throws_() {
      return this.toughness;
   }

   @Override
   public float case_() {
      return this.knockbackResistance;
   }

   @Override
   public String protected_() {
      return this.name;
   }
}
