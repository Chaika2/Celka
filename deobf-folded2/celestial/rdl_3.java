package celestial;

import java.util.function.Supplier;

public enum rdl_3 implements rdG_2 {
   WOOD(0, 59, 2.0F, 0.0F, 15, () -> rkg_3.id_class(rlc_3.id_byte)),
   STONE(1, 131, 4.0F, 1.0F, 5, () -> rkg_3.id_class(rlc_3.b)),
   IRON(2, 250, 6.0F, 2.0F, 14, () -> rkg_3.id_class(rdy_3.Ox)),
   DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> rkg_3.id_class(rdy_3.OJ)),
   GOLD(0, 32, 12.0F, 0.0F, 22, () -> rkg_3.id_class(rdy_3.Od)),
   NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> rkg_3.id_class(rdy_3.Ok));

   private final int harvestLevel;
   private final int maxUses;
   private final float efficiency;
   private final float attackDamage;
   private final int enchantability;
   private final rpo_3<rkg_3> repairMaterial;

   @Override
   public float id_byte() {
      return this.attackDamage;
   }

   private rdl_3(int var3, int var4, float var5, float var6, int var7, Supplier<rkg_3> var8) {
      this.harvestLevel = var3;
      this.maxUses = var4;
      this.efficiency = var5;
      this.attackDamage = var6;
      this.enchantability = var7;
      this.repairMaterial = new rpo_3<>(var8);
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
}
