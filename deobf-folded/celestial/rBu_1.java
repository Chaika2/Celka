package celestial;

public abstract class rBu_1 extends rBk_1 {
   protected is_3 id_protected;
   protected rfH_2 id_throws = rfH_2.id_protected;
   protected boolean id_case;
   private boolean id_class;
   private float id_break;
   private float id_byte;

   @Override
   public void id_byte() {
      this.id_class = false;
      this.id_break = (float)((double)this.id_throws.b_() + 0.5 - this.id_protected.rx());
      this.id_byte = (float)((double)this.id_throws.d_() + 0.5 - this.id_protected.BO());
   }

   public rBu_1(is_3 var1) {
      this.id_protected = var1;
      if (!rpc_3.id_class(var1)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   @Override
   public boolean id_class() {
      if (!rpc_3.id_class(this.id_protected)) {
         return false;
      } else if (!(Boolean)this.id_protected.id_throws[23]) {
         return false;
      } else {
         rLA var1 = (rLA)this.id_protected.id_public();
         rLC var2 = var1.id_finally();
         if (var2 != null && !var2.id_byte() && var1.id_throws()) {
            for (int var3 = 0; var3 < Math.min(var2.id_case() + 2, var2.id_throws()); var3++) {
               rLq_1 var4 = var2.id_class(var3);
               this.id_throws = new rfH_2(var4.id_class, var4.id_break + 1, var4.id_byte);
               if (!(this.id_protected.id_class((double)this.id_throws.b_(), this.id_protected.re(), (double)this.id_throws.d_()) > 2.25)) {
                  this.id_case = dN_2.id_class((rYB)this.id_protected.id_throws[7], this.id_throws);
                  if (this.id_case) {
                     return true;
                  }
               }
            }

            this.id_throws = this.id_protected.Bs().id_final();
            this.id_case = dN_2.id_class((rYB)this.id_protected.id_throws[7], this.id_throws);
            return this.id_case;
         } else {
            return false;
         }
      }
   }

   protected void id_class(boolean var1) {
      if (this.id_case) {
         xc_3 var2 = ((rYB)this.id_protected.id_throws[7]).id_byte(this.id_throws);
         if (var2.id_break() instanceof dN_2) {
            ((dN_2)var2.id_break()).id_class((rYB)this.id_protected.id_throws[7], var2, this.id_throws, var1);
         }
      }
   }

   @Override
   public boolean id_break() {
      return !this.id_class;
   }

   @Override
   public void id_throws() {
      float var1 = (float)((double)this.id_throws.b_() + 0.5 - this.id_protected.rx());
      float var2 = (float)((double)this.id_throws.d_() + 0.5 - this.id_protected.BO());
      float var3 = this.id_break * var1 + this.id_byte * var2;
      if (var3 < 0.0F) {
         this.id_class = true;
      }
   }

   protected boolean id_catch() {
      if (!this.id_case) {
         return false;
      } else {
         xc_3 var1 = ((rYB)this.id_protected.id_throws[7]).id_byte(this.id_throws);
         if (!(var1.id_break() instanceof dN_2)) {
            this.id_case = false;
            return false;
         } else {
            return var1.id_byte(dN_2.id_final);
         }
      }
   }
}
