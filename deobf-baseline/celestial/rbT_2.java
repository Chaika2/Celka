package celestial;

import java.util.EnumSet;
import java.util.Optional;
import java.util.function.Predicate;

class rbT_2 extends rbq_3 {
   private final Predicate<xc_3> id_byte;
   private int id_protected;
   private int id_throws;
   private boolean id_case;
   private rjU_2 id_catch;
   private int id_private;

   @Override
   public void id_byte() {
      this.id_protected = 0;
      this.id_private = 0;
      this.id_throws = 0;
      this.id_case = true;
      this.id_class.sJ();
   }

   rbT_2(rbF_2 var1) {
      super(var1);
      this.id_class = var1;
      this.id_byte = var0 -> {
         if (var0.id_class(rls_3.id_const)) {
            return var0.id_class(xu_3.Gr) ? var0.id_byte(du_3.id_volatile) == rCf_1.UPPER : true;
         } else {
            return var0.id_class(rls_3.id_import);
         }
      };
      this.id_protected = 0;
      this.id_throws = 0;
      this.id_private = 0;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   private Optional<rfH_2> id_class(Predicate<xc_3> var1, double var2) {
      rfH_2 var4 = this.id_class.Bs();
      rfw_3 var5 = new rfw_3();

      for (int var6 = 0; (double)var6 <= var2; var6 = var6 > 0 ? -var6 : 1 - var6) {
         for (int var7 = 0; (double)var7 < var2; var7++) {
            for (int var8 = 0; var8 <= var7; var8 = var8 > 0 ? -var8 : 1 - var8) {
               for (int var9 = var8 < var7 && var8 > -var7 ? var7 : 0; var9 <= var7; var9 = var9 > 0 ? -var9 : 1 - var9) {
                  var5.id_class(var4, var8, var6 - 1, var9);
                  if (var4.id_class(var5, var2) && var1.test(((rYB)this.id_class.id_throws[7]).id_byte(var5))) {
                     return Optional.of(var5);
                  }
               }
            }
         }
      }

      return Optional.empty();
   }

   @Override
   public void id_throws() {
      this.id_private++;
      if (this.id_private > 600) {
         this.id_class.id_char = null;
      } else {
         rjU_2 var1 = rjU_2.id_protected(this.id_class.id_char).id_break(0.0, 0.6F, 0.0);
         if (var1.id_case(this.id_class.Ps()) > 1.0) {
            this.id_catch = var1;
            this.id_volatile();
         } else {
            if (this.id_catch == null) {
               this.id_catch = var1;
            }

            boolean var2 = this.id_class.Ps().id_case(this.id_catch) <= 0.1;
            boolean var3 = true;
            if (!var2 && this.id_private > 600) {
               this.id_class.id_char = null;
            } else {
               if (var2) {
                  boolean var4 = rbF_2.id_this(this.id_class).nextInt(25) == 0;
                  if (var4) {
                     this.id_catch = new rjU_2(var1.id_class() + (double)this.id_final(), var1.id_break(), var1.id_byte() + (double)this.id_final());
                     rbF_2.id_else(this.id_class).id_final();
                  } else {
                     var3 = false;
                  }

                  this.id_class.id_continue().id_class(var1.id_class(), var1.id_break(), var1.id_byte());
               }

               if (var3) {
                  this.id_volatile();
               }

               this.id_protected++;
               if (rbF_2.id_synchronized(this.id_class).nextFloat() < 0.05F && this.id_protected > this.id_throws + 60) {
                  this.id_throws = this.id_protected;
                  this.id_class.id_class(rqn_3.T, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   private boolean id_finally() {
      return this.id_protected > 400;
   }

   @Override
   public boolean id_catch() {
      if (this.id_class.id_interface > 0) {
         return false;
      } else if (this.id_class.sc()) {
         return false;
      } else if (((rYB)this.id_class.id_throws[7]).s()) {
         return false;
      } else if (rbF_2.id_int(this.id_class).nextFloat() < 0.7F) {
         return false;
      } else {
         Optional var1 = this.id_package();
         if (var1.isPresent()) {
            this.id_class.id_char = (rfH_2)var1.get();
            rbF_2.id_new(this.id_class)
               .id_class((double)this.id_class.id_char.b_() + 0.5, (double)this.id_class.id_char.c_() + 0.5, (double)this.id_class.id_char.d_() + 0.5, 1.2F);
            return true;
         } else {
            return false;
         }
      }
   }

   boolean id_extends() {
      return this.id_case;
   }

   private Optional<rfH_2> id_package() {
      return this.id_class(this.id_byte, 5.0);
   }

   @Override
   public void id_protected() {
      if (this.id_finally()) {
         this.id_class.id_this(true);
      }

      this.id_case = false;
      rbF_2.id_super(this.id_class).id_final();
      this.id_class.id_interface = 200;
   }

   @Override
   public boolean id_private() {
      if (!this.id_case) {
         return false;
      } else if (!this.id_class.n()) {
         return false;
      } else if (((rYB)this.id_class.id_throws[7]).s()) {
         return false;
      } else if (this.id_finally()) {
         return rbF_2.id_continue(this.id_class).nextFloat() < 0.2F;
      } else if ((Integer)this.id_class.id_throws[41] % 20 == 0 && !this.id_class.id_volatile(this.id_class.id_char)) {
         this.id_class.id_char = null;
         return false;
      } else {
         return true;
      }
   }

   private float id_final() {
      return (rbF_2.id_return(this.id_class).nextFloat() * 2.0F - 1.0F) * 0.33333334F;
   }

   private void id_volatile() {
      this.id_class.id_super().id_class(this.id_catch.id_class(), this.id_catch.id_break(), this.id_catch.id_byte(), 0.35F);
   }

   void id_native() {
      this.id_case = false;
   }
}
