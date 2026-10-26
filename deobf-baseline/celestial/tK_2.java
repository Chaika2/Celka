package celestial;

import com.google.common.collect.ImmutableList;

public class tK_2<T extends rsi_3> extends wN_2<T> implements tR_2, tY_2 {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch;
   private final Iq_1 id_private;

   @Override
   public Iq_1 id_byte() {
      return this.id_class;
   }

   public tK_2(float var1, float var2, int var3, int var4) {
      this.id_class = new Iq_1(this).id_break(var3, var4);
      this.id_class.id_class(0.0F, 0.0F + var2, 0.0F);
      this.id_class.id_class(0, 0).id_class(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.id_break = new Iq_1(this, 32, 0).id_break(var3, var4);
      this.id_break.id_class(-4.0F, -10.0F, -4.0F, 8.0F, 12.0F, 8.0F, var1 + 0.45F);
      this.id_class.id_break(this.id_break);
      this.id_break.id_finally = false;
      Iq_1 var5 = new Iq_1(this).id_break(var3, var4);
      var5.id_class(0.0F, var2 - 2.0F, 0.0F);
      var5.id_class(24, 0).id_class(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
      this.id_class.id_break(var5);
      this.id_byte = new Iq_1(this).id_break(var3, var4);
      this.id_byte.id_class(0.0F, 0.0F + var2, 0.0F);
      this.id_byte.id_class(16, 20).id_class(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
      this.id_byte.id_class(0, 38).id_class(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.5F);
      this.id_protected = new Iq_1(this).id_break(var3, var4);
      this.id_protected.id_class(0.0F, 0.0F + var2 + 2.0F, 0.0F);
      this.id_protected.id_class(44, 22).id_class(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      Iq_1 var6 = new Iq_1(this, 44, 22).id_break(var3, var4);
      var6.id_implements = true;
      var6.id_class(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      this.id_protected.id_break(var6);
      this.id_protected.id_class(40, 38).id_class(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, var1);
      this.id_throws = new Iq_1(this, 0, 22).id_break(var3, var4);
      this.id_throws.id_class(-2.0F, 12.0F + var2, 0.0F);
      this.id_throws.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.id_case = new Iq_1(this, 0, 22).id_break(var3, var4);
      this.id_case.id_implements = true;
      this.id_case.id_class(2.0F, 12.0F + var2, 0.0F);
      this.id_case.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.id_catch = new Iq_1(this, 40, 46).id_break(var3, var4);
      this.id_catch.id_class(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.id_catch.id_class(-5.0F, 2.0F + var2, 0.0F);
      this.id_private = new Iq_1(this, 40, 46).id_break(var3, var4);
      this.id_private.id_implements = true;
      this.id_private.id_class(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.id_private.id_class(5.0F, 2.0F + var2, 0.0F);
   }

   @Override
   public void id_class(rpZ_2 var1, Ml_1 var2) {
      this.id_class(var1).id_class(var2);
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_byte, this.id_throws, this.id_case, this.id_protected, this.id_catch, this.id_private);
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
      this.id_protected.id_protected = 3.0F;
      this.id_protected.id_throws = -1.0F;
      this.id_protected.id_case = -0.75F;
      if (this.id_package) {
         this.id_catch.id_case = (float) (-Math.PI / 5);
         this.id_catch.id_catch = 0.0F;
         this.id_catch.id_private = 0.0F;
         this.id_private.id_case = (float) (-Math.PI / 5);
         this.id_private.id_catch = 0.0F;
         this.id_private.id_private = 0.0F;
         this.id_throws.id_case = -1.4137167F;
         this.id_throws.id_catch = (float) (Math.PI / 10);
         this.id_throws.id_private = 0.07853982F;
         this.id_case.id_case = -1.4137167F;
         this.id_case.id_catch = (float) (-Math.PI / 10);
         this.id_case.id_private = -0.07853982F;
      } else {
         this.id_catch.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 2.0F * var3 * 0.5F;
         this.id_catch.id_catch = 0.0F;
         this.id_catch.id_private = 0.0F;
         this.id_private.id_case = rfU_2.id_break(var2 * 0.6662F) * 2.0F * var3 * 0.5F;
         this.id_private.id_catch = 0.0F;
         this.id_private.id_private = 0.0F;
         this.id_throws.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3 * 0.5F;
         this.id_throws.id_catch = 0.0F;
         this.id_throws.id_private = 0.0F;
         this.id_case.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 * 0.5F;
         this.id_case.id_catch = 0.0F;
         this.id_case.id_private = 0.0F;
      }

      rEr_1 var7 = var1.id_throws();
      if (var7 == rEr_1.ATTACKING) {
         if (var1.ss().id_class()) {
            Iy_1.id_class(this.id_private, this.id_catch, true, this.id_final, var4);
         } else {
            Iy_1.id_class(this.id_catch, this.id_private, var1, this.id_final, var4);
         }
      } else if (var7 == rEr_1.SPELLCASTING) {
         this.id_catch.id_throws = 0.0F;
         this.id_catch.id_byte = -5.0F;
         this.id_private.id_throws = 0.0F;
         this.id_private.id_byte = 5.0F;
         this.id_catch.id_case = rfU_2.id_break(var4 * 0.6662F) * 0.25F;
         this.id_private.id_case = rfU_2.id_break(var4 * 0.6662F) * 0.25F;
         this.id_catch.id_private = (float) (Math.PI * 3.0 / 4.0);
         this.id_private.id_private = (float) (-Math.PI * 3.0 / 4.0);
         this.id_catch.id_catch = 0.0F;
         this.id_private.id_catch = 0.0F;
      } else if (var7 == rEr_1.BOW_AND_ARROW) {
         this.id_catch.id_catch = -0.1F + this.id_class.id_catch;
         this.id_catch.id_case = (float) (-Math.PI / 2) + this.id_class.id_case;
         this.id_private.id_case = -0.9424779F + this.id_class.id_case;
         this.id_private.id_catch = this.id_class.id_catch - 0.4F;
         this.id_private.id_private = (float) (Math.PI / 2);
      } else if (var7 == rEr_1.CROSSBOW_HOLD) {
         Iy_1.id_class(this.id_catch, this.id_private, this.id_class, true);
      } else if (var7 == rEr_1.CROSSBOW_CHARGE) {
         Iy_1.id_class(this.id_catch, this.id_private, var1, true);
      } else if (var7 == rEr_1.CELEBRATING) {
         this.id_catch.id_throws = 0.0F;
         this.id_catch.id_byte = -5.0F;
         this.id_catch.id_case = rfU_2.id_break(var4 * 0.6662F) * 0.05F;
         this.id_catch.id_private = 2.670354F;
         this.id_catch.id_catch = 0.0F;
         this.id_private.id_throws = 0.0F;
         this.id_private.id_byte = 5.0F;
         this.id_private.id_case = rfU_2.id_break(var4 * 0.6662F) * 0.05F;
         this.id_private.id_private = (float) (-Math.PI * 3.0 / 4.0);
         this.id_private.id_catch = 0.0F;
      }

      boolean var8 = var7 == rEr_1.CROSSED;
      this.id_protected.id_finally = var8;
      this.id_private.id_finally = !var8;
      this.id_catch.id_finally = !var8;
   }

   private Iq_1 id_class(rpZ_2 var1) {
      return var1 == rpZ_2.LEFT ? this.id_private : this.id_catch;
   }

   public Iq_1 id_break() {
      return this.id_break;
   }
}
