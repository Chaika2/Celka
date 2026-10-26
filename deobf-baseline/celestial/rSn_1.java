package celestial;

public class rSn_1 extends rSp_1 {
   private static final ay_3 id_break = new ay_3().id_class(64.0);
   private rLC id_byte;
   private rjU_2 id_protected;
   private boolean id_throws;

   @Override
   public void id_byte() {
      this.id_byte = null;
      this.id_protected = null;
   }

   public rSn_1(rSu_1 var1) {
      super(var1);
   }

   private void id_class(rhd_3 var1) {
      this.id_class.L().id_class(rST.id_break);
      this.id_class.L().id_break(rST.id_break).id_class(var1);
   }

   @Override
   public void id_class(rSa_1 var1, rfH_2 var2, rye_3 var3, rhd_3 var4) {
      if (var4 != null && !((rhx_3)var4.id_implements[18]).id_class) {
         this.id_class(var4);
      }
   }

   @Override
   public void id_break() {
      double var1 = this.id_protected == null ? 0.0 : this.id_protected.id_protected(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
      if (var1 < 100.0 || var1 > 22500.0 || (Boolean)this.id_class.id_throws[23] || (Boolean)this.id_class.id_throws[24]) {
         this.id_finally();
      }
   }

   private void id_finally() {
      if (this.id_byte != null && this.id_byte.id_byte()) {
         rfH_2 var1 = ((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, new rfH_2(rUs_1.id_class));
         int var2 = this.id_class.n() == null ? 0 : this.id_class.n().id_byte();
         if (this.id_class.Sa().nextInt(var2 + 3) == 0) {
            this.id_class.L().id_class(rST.id_byte);
            return;
         }

         double var3 = 64.0;
         rhd_3 var5 = ((rYB)this.id_class.id_throws[7]).id_class(id_break, (double)var1.b_(), (double)var1.c_(), (double)var1.d_());
         if (var5 != null) {
            var3 = var1.id_class(var5.Ps(), true) / 512.0;
         }

         if (var5 != null
            && !((rhx_3)var5.id_implements[18]).id_class
            && (this.id_class.Sa().nextInt(rfU_2.id_class((int)var3) + 2) == 0 || this.id_class.Sa().nextInt(var2 + 2) == 0)) {
            this.id_class(var5);
            return;
         }
      }

      if (this.id_byte == null || this.id_byte.id_byte()) {
         int var6 = this.id_class.id_catch();
         int var7 = var6;
         if (this.id_class.Sa().nextInt(8) == 0) {
            this.id_throws = !this.id_throws;
            var7 = var6 + 6;
         }

         if (this.id_throws) {
            var7++;
         } else {
            var7--;
         }

         if (this.id_class.n() != null && this.id_class.n().id_byte() >= 0) {
            var7 %= 12;
            if (var7 < 0) {
               var7 += 12;
            }
         } else {
            var7 -= 12;
            var7 &= 7;
            var7 += 12;
         }

         this.id_byte = this.id_class.id_class(var6, var7, (rLq_1)null);
         if (this.id_byte != null) {
            this.id_byte.id_class();
         }
      }

      this.id_extends();
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
   public rST<rSn_1> id_protected() {
      return rST.id_class;
   }
}
