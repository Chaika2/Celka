package celestial;

import com.google.common.collect.ImmutableList;
import java.util.function.Function;

public class tW_2<T extends iB_2> extends tX_2<T> implements tR_2, tY_2 {
   public Iq_1 id_class;
   public Iq_1 id_break;
   public Iq_1 id_byte;
   public Iq_1 id_protected;
   public Iq_1 id_throws;
   public Iq_1 id_case;
   public Iq_1 id_catch;
   public tQ_2 id_private = tQ_2.EMPTY;
   public tQ_2 id_implements = tQ_2.EMPTY;
   public boolean id_finally;
   public float id_extends;

   @Override
   public Iq_1 id_byte() {
      return this.id_class;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void id_byte(T var1) {
      switch (this.id_private) {
         case EMPTY:
            this.id_throws.id_catch = 0.0F;
            break;
         case BLOCK:
            this.id_throws.id_case = this.id_throws.id_case * 0.5F - 0.9424779F;
            this.id_throws.id_catch = (float) (Math.PI / 6);
            break;
         case ITEM:
            this.id_throws.id_case = this.id_throws.id_case * 0.5F - (float) (Math.PI / 10);
            this.id_throws.id_catch = 0.0F;
            break;
         case THROW_SPEAR:
            this.id_throws.id_case = this.id_throws.id_case * 0.5F - (float) Math.PI;
            this.id_throws.id_catch = 0.0F;
            break;
         case BOW_AND_ARROW:
            this.id_protected.id_catch = -0.1F + this.id_class.id_catch - 0.4F;
            this.id_throws.id_catch = 0.1F + this.id_class.id_catch;
            this.id_protected.id_case = (float) (-Math.PI / 2) + this.id_class.id_case;
            this.id_throws.id_case = (float) (-Math.PI / 2) + this.id_class.id_case;
            break;
         case CROSSBOW_CHARGE:
            Iy_1.id_class(this.id_protected, this.id_throws, var1, false);
            break;
         case CROSSBOW_HOLD:
            Iy_1.id_class(this.id_protected, this.id_throws, this.id_class, false);
      }
   }

   public tW_2(float var1) {
      this(HU::id_protected, var1, 0.0F, 64, 32);
   }

   protected tW_2(float var1, float var2, int var3, int var4) {
      this(HU::id_protected, var1, var2, var3, var4);
   }

   public tW_2(Function<rqO_2, HU> var1, float var2, float var3, int var4, int var5) {
      super(var1, true, 16.0F, 0.0F, 2.0F, 2.0F, 24.0F);
      this.id_return = var4;
      this.id_public = var5;
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var2);
      this.id_class.id_class(0.0F, 0.0F + var3, 0.0F);
      this.id_break = new Iq_1(this, 32, 0);
      this.id_break.id_class(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var2 + 0.5F);
      this.id_break.id_class(0.0F, 0.0F + var3, 0.0F);
      this.id_byte = new Iq_1(this, 16, 16);
      this.id_byte.id_class(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var2);
      this.id_byte.id_class(0.0F, 0.0F + var3, 0.0F);
      this.id_protected = new Iq_1(this, 40, 16);
      this.id_protected.id_class(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.id_protected.id_class(-5.0F, 2.0F + var3, 0.0F);
      this.id_throws = new Iq_1(this, 40, 16);
      this.id_throws.id_implements = true;
      this.id_throws.id_class(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.id_throws.id_class(5.0F, 2.0F + var3, 0.0F);
      this.id_case = new Iq_1(this, 0, 16);
      this.id_case.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.id_case.id_class(-1.9F, 12.0F + var3, 0.0F);
      this.id_catch = new Iq_1(this, 0, 16);
      this.id_catch.id_implements = true;
      this.id_catch.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.id_catch.id_class(1.9F, 12.0F + var3, 0.0F);
   }

   private float id_class(float var1) {
      return -65.0F * var1 + var1 * var1;
   }

   @Override
   public void id_class(rpZ_2 var1, Ml_1 var2) {
      this.id_class(var1).id_class(var2);
   }

   public void id_class(tW_2<T> var1) {
      super.id_class(var1);
      var1.id_private = this.id_private;
      var1.id_implements = this.id_implements;
      var1.id_finally = this.id_finally;
      var1.id_class.id_class(this.id_class);
      var1.id_break.id_class(this.id_break);
      var1.id_byte.id_class(this.id_byte);
      var1.id_protected.id_class(this.id_protected);
      var1.id_throws.id_class(this.id_throws);
      var1.id_case.id_class(this.id_case);
      var1.id_catch.id_class(this.id_catch);
   }

   protected rpZ_2 id_class(T var1) {
      rpZ_2 var2 = var1.Su();
      return (rpm_3)var1.id_private[6] == rpm_3.MAIN_HAND ? var2 : var2.id_class();
   }

   protected Iq_1 id_class(rpZ_2 var1) {
      return var1 == rpZ_2.LEFT ? this.id_throws : this.id_protected;
   }

   @Override
   protected Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class);
   }

   public void id_class(T var1, float var2, float var3, float var4) {
      this.id_extends = var1.id_synchronized(var4);
      super.id_class(var1, var2, var3, var4);
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var7 = var1.BD() > 4;
      boolean var8 = var1.rP();
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      if (var7) {
         this.id_class.id_case = (float) (-Math.PI / 4);
      } else if (this.id_extends > 0.0F) {
         if (var8) {
            this.id_class.id_case = this.id_class(this.id_extends, this.id_class.id_case, (float) (-Math.PI / 4));
         } else {
            this.id_class.id_case = this.id_class(this.id_extends, this.id_class.id_case, var6 * (float) (Math.PI / 180.0));
         }
      } else {
         this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
      }

      this.id_byte.id_catch = 0.0F;
      this.id_protected.id_throws = 0.0F;
      this.id_protected.id_byte = -5.0F;
      this.id_throws.id_throws = 0.0F;
      this.id_throws.id_byte = 5.0F;
      float var9 = 1.0F;
      if (var7) {
         var9 = (float)var1.rv().id_catch();
         var9 /= 0.2F;
         var9 = var9 * var9 * var9;
      }

      if (var9 < 1.0F) {
         var9 = 1.0F;
      }

      this.id_protected.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 2.0F * var3 * 0.5F / var9;
      this.id_throws.id_case = rfU_2.id_break(var2 * 0.6662F) * 2.0F * var3 * 0.5F / var9;
      this.id_protected.id_private = 0.0F;
      this.id_throws.id_private = 0.0F;
      this.id_case.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3 / var9;
      this.id_catch.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 / var9;
      this.id_case.id_catch = 0.0F;
      this.id_catch.id_catch = 0.0F;
      this.id_case.id_private = 0.0F;
      this.id_catch.id_private = 0.0F;
      if (this.id_package) {
         this.id_protected.id_case += (float) (-Math.PI / 5);
         this.id_throws.id_case += (float) (-Math.PI / 5);
         this.id_case.id_case = -1.4137167F;
         this.id_case.id_catch = (float) (Math.PI / 10);
         this.id_case.id_private = 0.07853982F;
         this.id_catch.id_case = -1.4137167F;
         this.id_catch.id_catch = (float) (-Math.PI / 10);
         this.id_catch.id_private = -0.07853982F;
      }

      this.id_protected.id_catch = 0.0F;
      this.id_throws.id_catch = 0.0F;
      boolean var10 = var1.Su() == rpZ_2.RIGHT;
      boolean var11 = var10 ? this.id_private.id_class() : this.id_implements.id_class();
      if (var10 != var11) {
         this.id_byte((T)var1);
         this.id_break((T)var1);
      } else {
         this.id_break((T)var1);
         this.id_byte((T)var1);
      }

      this.id_class((T)var1, var4);
      if (this.id_finally) {
         this.id_byte.id_case = 0.5F;
         this.id_protected.id_case += 0.4F;
         this.id_throws.id_case += 0.4F;
         this.id_case.id_throws = 4.0F;
         this.id_catch.id_throws = 4.0F;
         this.id_case.id_protected = 12.2F;
         this.id_catch.id_protected = 12.2F;
         this.id_class.id_protected = 4.2F;
         this.id_byte.id_protected = 3.2F;
         this.id_throws.id_protected = 5.2F;
         this.id_protected.id_protected = 5.2F;
      } else {
         this.id_byte.id_case = 0.0F;
         this.id_case.id_throws = 0.1F;
         this.id_catch.id_throws = 0.1F;
         this.id_case.id_protected = 12.0F;
         this.id_catch.id_protected = 12.0F;
         this.id_class.id_protected = 0.0F;
         this.id_byte.id_protected = 0.0F;
         this.id_throws.id_protected = 2.0F;
         this.id_protected.id_protected = 2.0F;
      }

      Iy_1.id_class(this.id_protected, this.id_throws, var4);
      if (this.id_extends > 0.0F) {
         float var12 = var2 % 26.0F;
         rpZ_2 var13 = this.id_class((T)var1);
         float var14 = var13 == rpZ_2.RIGHT && this.id_final > 0.0F ? 0.0F : this.id_extends;
         float var15 = var13 == rpZ_2.LEFT && this.id_final > 0.0F ? 0.0F : this.id_extends;
         if (var12 < 14.0F) {
            this.id_throws.id_case = this.id_class(var15, this.id_throws.id_case, 0.0F);
            this.id_protected.id_case = rfU_2.id_catch(var14, this.id_protected.id_case, 0.0F);
            this.id_throws.id_catch = this.id_class(var15, this.id_throws.id_catch, (float) Math.PI);
            this.id_protected.id_catch = rfU_2.id_catch(var14, this.id_protected.id_catch, (float) Math.PI);
            this.id_throws.id_private = this.id_class(
               var15, this.id_throws.id_private, (float) Math.PI + 1.8707964F * this.id_class(var12) / this.id_class(14.0F)
            );
            this.id_protected.id_private = rfU_2.id_catch(
               var14, this.id_protected.id_private, (float) Math.PI - 1.8707964F * this.id_class(var12) / this.id_class(14.0F)
            );
         } else if (var12 >= 14.0F && var12 < 22.0F) {
            float var20 = (var12 - 14.0F) / 8.0F;
            this.id_throws.id_case = this.id_class(var15, this.id_throws.id_case, (float) (Math.PI / 2) * var20);
            this.id_protected.id_case = rfU_2.id_catch(var14, this.id_protected.id_case, (float) (Math.PI / 2) * var20);
            this.id_throws.id_catch = this.id_class(var15, this.id_throws.id_catch, (float) Math.PI);
            this.id_protected.id_catch = rfU_2.id_catch(var14, this.id_protected.id_catch, (float) Math.PI);
            this.id_throws.id_private = this.id_class(var15, this.id_throws.id_private, 5.012389F - 1.8707964F * var20);
            this.id_protected.id_private = rfU_2.id_catch(var14, this.id_protected.id_private, 1.2707963F + 1.8707964F * var20);
         } else if (var12 >= 22.0F && var12 < 26.0F) {
            float var16 = (var12 - 22.0F) / 4.0F;
            this.id_throws.id_case = this.id_class(var15, this.id_throws.id_case, (float) (Math.PI / 2) - (float) (Math.PI / 2) * var16);
            this.id_protected.id_case = rfU_2.id_catch(var14, this.id_protected.id_case, (float) (Math.PI / 2) - (float) (Math.PI / 2) * var16);
            this.id_throws.id_catch = this.id_class(var15, this.id_throws.id_catch, (float) Math.PI);
            this.id_protected.id_catch = rfU_2.id_catch(var14, this.id_protected.id_catch, (float) Math.PI);
            this.id_throws.id_private = this.id_class(var15, this.id_throws.id_private, (float) Math.PI);
            this.id_protected.id_private = rfU_2.id_catch(var14, this.id_protected.id_private, (float) Math.PI);
         }

         float var21 = 0.3F;
         float var17 = 0.33333334F;
         this.id_catch.id_case = rfU_2.id_catch(this.id_extends, this.id_catch.id_case, 0.3F * rfU_2.id_break(var2 * 0.33333334F + (float) Math.PI));
         this.id_case.id_case = rfU_2.id_catch(this.id_extends, this.id_case.id_case, 0.3F * rfU_2.id_break(var2 * 0.33333334F));
      }

      this.id_break.id_class(this.id_class);
   }

   protected float id_class(float var1, float var2, float var3) {
      float var4 = (var3 - var2) % (float) (Math.PI * 2);
      if (var4 < (float) -Math.PI) {
         var4 += (float) (Math.PI * 2);
      }

      if (var4 >= (float) Math.PI) {
         var4 -= (float) (Math.PI * 2);
      }

      return var2 + var1 * var4;
   }

   protected void id_class(T var1, float var2) {
      if (!(this.id_final <= 0.0F)) {
         rpZ_2 var3 = this.id_class((T)var1);
         Iq_1 var4 = this.id_class(var3);
         float var5 = this.id_final;
         this.id_byte.id_catch = rfU_2.id_class(rfU_2.id_byte(var5) * (float) (Math.PI * 2)) * 0.2F;
         if (var3 == rpZ_2.LEFT) {
            this.id_byte.id_catch *= -1.0F;
         }

         this.id_protected.id_throws = rfU_2.id_class(this.id_byte.id_catch) * 5.0F;
         this.id_protected.id_byte = -rfU_2.id_break(this.id_byte.id_catch) * 5.0F;
         this.id_throws.id_throws = -rfU_2.id_class(this.id_byte.id_catch) * 5.0F;
         this.id_throws.id_byte = rfU_2.id_break(this.id_byte.id_catch) * 5.0F;
         this.id_protected.id_catch = this.id_protected.id_catch + this.id_byte.id_catch;
         this.id_throws.id_catch = this.id_throws.id_catch + this.id_byte.id_catch;
         this.id_throws.id_case = this.id_throws.id_case + this.id_byte.id_catch;
         var5 = 1.0F - this.id_final;
         var5 *= var5;
         var5 *= var5;
         var5 = 1.0F - var5;
         float var6 = rfU_2.id_class(var5 * (float) Math.PI);
         float var7 = rfU_2.id_class(this.id_final * (float) Math.PI) * -(this.id_class.id_case - 0.7F) * 0.75F;
         var4.id_case = (float)((double)var4.id_case - ((double)var6 * 1.2 + (double)var7));
         var4.id_catch = var4.id_catch + this.id_byte.id_catch * 2.0F;
         var4.id_private = var4.id_private + rfU_2.id_class(this.id_final * (float) Math.PI) * -0.4F;
      }
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return ImmutableList.of(this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_break);
   }

   private void id_break(T var1) {
      switch (this.id_implements) {
         case EMPTY:
            this.id_protected.id_catch = 0.0F;
            break;
         case BLOCK:
            this.id_protected.id_case = this.id_protected.id_case * 0.5F - 0.9424779F;
            this.id_protected.id_catch = (float) (-Math.PI / 6);
            break;
         case ITEM:
            this.id_protected.id_case = this.id_protected.id_case * 0.5F - (float) (Math.PI / 10);
            this.id_protected.id_catch = 0.0F;
            break;
         case THROW_SPEAR:
            this.id_protected.id_case = this.id_protected.id_case * 0.5F - (float) Math.PI;
            this.id_protected.id_catch = 0.0F;
            break;
         case BOW_AND_ARROW:
            this.id_protected.id_catch = -0.1F + this.id_class.id_catch;
            this.id_throws.id_catch = 0.1F + this.id_class.id_catch + 0.4F;
            this.id_protected.id_case = (float) (-Math.PI / 2) + this.id_class.id_case;
            this.id_throws.id_case = (float) (-Math.PI / 2) + this.id_class.id_case;
            break;
         case CROSSBOW_CHARGE:
            Iy_1.id_class(this.id_protected, this.id_throws, var1, true);
            break;
         case CROSSBOW_HOLD:
            Iy_1.id_class(this.id_protected, this.id_throws, this.id_class, true);
      }
   }

   public void b_(boolean var1) {
      this.id_class.id_finally = var1;
      this.id_break.id_finally = var1;
      this.id_byte.id_finally = var1;
      this.id_protected.id_finally = var1;
      this.id_throws.id_finally = var1;
      this.id_case.id_finally = var1;
      this.id_catch.id_finally = var1;
   }
}
