package celestial;

import java.util.Random;

class rbV_2 extends rBk_1 {
   private final rbf_3 id_class;
   private rhd_3 id_break;
   private rfH_2 id_byte;
   private int id_protected;

   @Override
   public void id_byte() {
      if (this.id_byte != null) {
         this.id_class.id_public(false);
         this.id_class.id_public().id_class((double)this.id_byte.b_(), (double)this.id_byte.c_(), (double)this.id_byte.d_(), 1.1F);
      }
   }

   public rbV_2(rbf_3 var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class() {
      if (!this.id_class.sZ()) {
         return false;
      } else if (this.id_class.sL()) {
         return false;
      } else {
         iB_2 var1 = this.id_class.sF();
         if (var1 instanceof rhd_3) {
            this.id_break = (rhd_3)var1;
            if (!var1.Sc()) {
               return false;
            }

            if (this.id_class.id_int(this.id_break) > 100.0) {
               return false;
            }

            rfH_2 var2 = this.id_break.Bs();
            xc_3 var3 = ((rYB)this.id_class.id_throws[7]).id_byte(var2);
            if (var3.id_break().id_class(rls_3.id_short)) {
               this.id_byte = var3.id_protected(xb_3.p).map(var1x -> var2.id_break(var1x.id_case())).orElseGet(() -> new rfH_2(var2));
               return !this.id_catch();
            }
         }

         return false;
      }
   }

   @Override
   public boolean id_break() {
      return this.id_class.sZ() && !this.id_class.sL() && this.id_break != null && this.id_break.Sc() && this.id_byte != null && !this.id_catch();
   }

   @Override
   public void id_throws() {
      if (this.id_break != null && this.id_byte != null) {
         this.id_class.id_public(false);
         this.id_class.id_public().id_class((double)this.id_byte.b_(), (double)this.id_byte.c_(), (double)this.id_byte.d_(), 1.1F);
         if (this.id_class.id_int(this.id_break) < 2.5) {
            this.id_protected++;
            if (this.id_protected > 16) {
               this.id_class.id_this(true);
               this.id_class.id_else(false);
            } else {
               this.id_class.id_class(this.id_break, 45.0F, 45.0F);
               this.id_class.id_else(true);
            }
         } else {
            this.id_class.id_this(false);
         }
      }
   }

   private boolean id_catch() {
      for (rbf_3 var2 : ((rYB)this.id_class.id_throws[7]).id_class(rbf_3.class, new rfl_3(this.id_byte).id_class(2.0))) {
         if (var2 != this.id_class && (var2.sJ() || var2.sx())) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void id_protected() {
      this.id_class.id_this(false);
      float var1 = ((rYB)this.id_class.id_throws[7]).id_protected(1.0F);
      if (this.id_break.su() >= 100 && (double)var1 > 0.77 && (double)var1 < 0.8 && (double)((rYB)this.id_class.id_throws[7]).id_long().nextFloat() < 0.7) {
         this.id_private();
      }

      this.id_protected = 0;
      this.id_class.id_else(false);
      this.id_class.id_public().id_final();
   }

   private void id_private() {
      Random var1 = this.id_class.Sa();
      rfw_3 var2 = new rfw_3();
      var2.id_class(this.id_class.Bs());
      this.id_class
         .id_class((double)(var2.b_() + var1.nextInt(11) - 5), (double)(var2.c_() + var1.nextInt(5) - 2), (double)(var2.d_() + var1.nextInt(11) - 5), false);
      var2.id_class(this.id_class.Bs());
      rzL_2 var3 = ((rYB)this.id_class.id_throws[7]).id_const().o().id_class(rzl_3.W);
      rzP_2 var4 = new rzP_2((rrEm_1)((rYB)this.id_class.id_throws[7]))
         .id_class(rzQ_2.id_case, this.id_class.Ps())
         .id_class(rzQ_2.id_class, this.id_class)
         .id_class(var1);

      for (rdn_3 var6 : var3.id_class(var4.id_class(rzz_3.id_catch))) {
         ((rYB)this.id_class.id_throws[7])
            .a_(
               new rsE_2(
                  (rYB)this.id_class.id_throws[7],
                  (double)var2.b_() - (double)rfU_2.id_class((Float)this.id_class.id_private[23] * (float) (Math.PI / 180.0)),
                  (double)var2.c_(),
                  (double)var2.d_() + (double)rfU_2.id_break((Float)this.id_class.id_private[23] * (float) (Math.PI / 180.0)),
                  var6
               )
            );
      }
   }
}
