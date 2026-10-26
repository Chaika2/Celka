package celestial;

public class rSH extends rSp_1 {
   private static final ay_3 id_break = new ay_3().id_class(128.0);
   private rLC id_byte;
   private rjU_2 id_protected;

   @Override
   public void id_byte() {
      this.id_byte = null;
      this.id_protected = null;
   }

   public rSH(rSu_1 var1) {
      super(var1);
   }

   @Override
   public void id_break() {
      double var1 = this.id_protected == null ? 0.0 : this.id_protected.id_protected(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
      if (var1 < 100.0 || var1 > 22500.0 || (Boolean)this.id_class.id_throws[23] || (Boolean)this.id_class.id_throws[24]) {
         this.id_finally();
      }
   }

   private void id_finally() {
      if (this.id_byte == null || this.id_byte.id_byte()) {
         int var1 = this.id_class.id_catch();
         rfH_2 var2 = ((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.id_class);
         rhd_3 var3 = ((rYB)this.id_class.id_throws[7]).id_class(id_break, (double)var2.b_(), (double)var2.c_(), (double)var2.d_());
         int var4;
         if (var3 != null) {
            rjU_2 var5 = new rjU_2(var3.rx(), 0.0, var3.BO()).id_protected();
            var4 = this.id_class.id_continue(-var5.id_break * 40.0, 105.0, -var5.id_protected * 40.0);
         } else {
            var4 = this.id_class.id_continue(40.0, (double)var2.c_(), 0.0);
         }

         rLq_1 var6 = new rLq_1(var2.b_(), var2.c_(), var2.d_());
         this.id_byte = this.id_class.id_class(var1, var4, var6);
         if (this.id_byte != null) {
            this.id_byte.id_class();
         }
      }

      this.id_extends();
      if (this.id_byte != null && this.id_byte.id_byte()) {
         this.id_class.L().id_class(rST.id_protected);
      }
   }

   private void id_extends() {
      if (this.id_byte != null && !this.id_byte.id_byte()) {
         rfH_2 var1 = this.id_byte.id_catch();
         this.id_byte.id_class();
         double var2 = (double)var1.b_();
         double var4 = (double)var1.d_();

         double var6;
         do {
            var6 = (double)((float)var1.c_() + this.id_class.Sa().nextFloat() * 20.0F);
         } while (var6 < (double)var1.c_());

         this.id_protected = new rjU_2(var2, var6, var4);
      }
   }

   @Override
   public rjU_2 id_case() {
      return this.id_protected;
   }

   @Override
   public rST<rSH> id_protected() {
      return rST.id_byte;
   }
}
