package celestial;

import java.util.List;

class rGX extends rGb_1 {
   @Override
   public void id_byte() {
   }

   rGX(rGB var1) {
      super(var1);
      this.id_break = var1;
   }

   @Override
   public boolean id_class() {
      return this.id_break.I_() != null && this.id_break.id_super == rGS.SWOOP;
   }

   @Override
   public boolean id_break() {
      iB_2 var1 = this.id_break.I_();
      if (var1 == null) {
         return false;
      } else if (!var1.BM()) {
         return false;
      } else if (!(var1 instanceof rhd_3) || !((rhd_3)var1).id_native() && !((rhd_3)var1).id_implements()) {
         if (!this.id_class()) {
            return false;
         } else {
            if ((Integer)this.id_break.id_throws[41] % 20 == 0) {
               List var2 = ((rYB)this.id_break.id_throws[7]).id_class(rbf_3.class, this.id_break.rN().id_class(16.0), rpJ_2.id_class);
               if (!var2.isEmpty()) {
                  for (rbf_3 var4 : var2) {
                     var4.sc();
                  }

                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void id_throws() {
      iB_2 var1 = this.id_break.I_();
      this.id_break.id_break = new rjU_2(var1.rx(), var1.id_byte(0.5), var1.BO());
      if (this.id_break.rN().id_class(0.2F).id_byte(var1.rN())) {
         this.id_break.id_public(var1);
         this.id_break.id_super = rGS.CIRCLE;
         if (!this.id_break.BF()) {
            ((rYB)this.id_break.id_throws[7]).id_byte(1039, this.id_break.Bs(), 0);
         }
      } else if ((Boolean)this.id_break.id_throws[23] || (Integer)this.id_break.id_private[10] > 0) {
         this.id_break.id_super = rGS.CIRCLE;
      }
   }

   @Override
   public void id_protected() {
      this.id_break.id_byte((iB_2)null);
      this.id_break.id_super = rGS.CIRCLE;
   }
}
