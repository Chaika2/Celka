package celestial;

public class rSf_1 extends rSp_1 {
   private boolean id_break;
   private rLC id_byte;
   private rjU_2 id_protected;

   @Override
   public void id_byte() {
      this.id_break = true;
      this.id_byte = null;
      this.id_protected = null;
   }

   public rSf_1(rSu_1 var1) {
      super(var1);
   }

   @Override
   public void id_break() {
      if (!this.id_break && this.id_byte != null) {
         rfH_2 var1 = ((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.id_class);
         if (!var1.id_class(this.id_class.Ps(), 10.0)) {
            this.id_class.L().id_class(rST.id_class);
         }
      } else {
         this.id_break = false;
         this.id_finally();
      }
   }

   private void id_finally() {
      int var1 = this.id_class.id_catch();
      rjU_2 var2 = this.id_class.id_byte(1.0F);
      int var3 = this.id_class.id_continue(-var2.id_break * 40.0, 105.0, -var2.id_protected * 40.0);
      if (this.id_class.n() != null && this.id_class.n().id_byte() > 0) {
         var3 %= 12;
         if (var3 < 0) {
            var3 += 12;
         }
      } else {
         var3 -= 12;
         var3 &= 7;
         var3 += 12;
      }

      this.id_byte = this.id_class.id_class(var1, var3, (rLq_1)null);
      this.id_extends();
   }

   private void id_extends() {
      if (this.id_byte != null) {
         this.id_byte.id_class();
         if (!this.id_byte.id_byte()) {
            rfH_2 var1 = this.id_byte.id_catch();
            this.id_byte.id_class();

            double var2;
            do {
               var2 = (double)((float)var1.c_() + this.id_class.Sa().nextFloat() * 20.0F);
            } while (var2 < (double)var1.c_());

            this.id_protected = new rjU_2((double)var1.b_(), var2, (double)var1.d_());
         }
      }
   }

   @Override
   public rjU_2 id_case() {
      return this.id_protected;
   }

   @Override
   public rST<rSf_1> id_protected() {
      return rST.id_throws;
   }
}
