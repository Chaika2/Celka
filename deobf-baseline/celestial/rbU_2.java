package celestial;

import java.util.EnumSet;

class rbU_2 extends rBk_1 {
   private final rbo_3 id_class;
   private boolean id_break;

   @Override
   public void id_byte() {
      if ((rYB)this.id_class.id_throws[7] instanceof rrEm_1 var1) {
         this.id_break = false;
         this.id_class.id_public().id_final();
         rfH_2 var2 = this.id_class.Bs();
         rrrZ var3 = (double)var1.id_int.nextFloat() >= 0.5 ? rrrZ.id_volatile : rrrZ.id_implements;
         rfH_2 var4 = var1.id_class(var3, var2, 50, false);
         if (var4 == null) {
            rrrZ var5 = var3.equals(rrrZ.id_volatile) ? rrrZ.id_implements : rrrZ.id_volatile;
            rfH_2 var6 = var1.id_class(var5, var2, 50, false);
            if (var6 == null) {
               this.id_break = true;
               return;
            }

            this.id_class.id_implements(var6);
         } else {
            this.id_class.id_implements(var4);
         }

         var1.id_class(this.id_class, (byte)38);
      }
   }

   rbU_2(rbo_3 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      return this.id_class.L() && this.id_class.PA() >= 100;
   }

   @Override
   public boolean id_break() {
      rfH_2 var1 = this.id_class.id_throws();
      return !new rfH_2((double)var1.b_(), this.id_class.re(), (double)var1.d_()).id_class(this.id_class.Ps(), 4.0)
         && !this.id_break
         && this.id_class.PA() >= 100;
   }

   @Override
   public void id_throws() {
      rYB var1 = (rYB)this.id_class.id_throws[7];
      if (this.id_class.sx() || this.id_class.id_public().id_native()) {
         rjU_2 var2 = rjU_2.id_class((rja_3)this.id_class.id_throws());
         rjU_2 var3 = iX_2.id_class(this.id_class, 16, 1, var2, (float) (Math.PI / 8));
         if (var3 == null) {
            var3 = iX_2.id_break(this.id_class, 8, 4, var2);
         }

         if (var3 != null) {
            rfH_2 var4 = new rfH_2(var3);
            if (!var1.id_break(var4).id_class(rlG_2.id_break) || !var1.id_byte(var4).id_class(var1, var4, rLT.WATER)) {
               var3 = iX_2.id_break(this.id_class, 8, 5, var2);
            }
         }

         if (var3 == null) {
            this.id_break = true;
            return;
         }

         this.id_class.id_continue().id_class(var3.id_break, var3.id_byte, var3.id_protected, (float)(this.id_class.S() + 20), (float)this.id_class.r());
         this.id_class.id_public().id_class(var3.id_break, var3.id_byte, var3.id_protected, 1.3);
         if (var1.id_int.nextInt(80) == 0) {
            var1.id_class(this.id_class, (byte)38);
         }
      }
   }

   @Override
   public void id_protected() {
      rfH_2 var1 = this.id_class.id_throws();
      if (new rfH_2((double)var1.b_(), this.id_class.re(), (double)var1.d_()).id_class(this.id_class.Ps(), 4.0) || this.id_break) {
         this.id_class.id_this(false);
      }
   }

   @Override
   public boolean J_() {
      return false;
   }
}
