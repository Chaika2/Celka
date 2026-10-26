package celestial;

class rbp_3 extends rbq_3 {
   rbp_3(rbF_2 var1) {
      super(var1);
      this.class_ = var1;
   }

   @Override
   public void throws_() {
      if (rbF_2.package_(this.class_).nextInt(30) == 0) {
         for (int var1 = 1; var1 <= 2; var1++) {
            rfH_2 var2 = this.class_.Bs().catch_(var1);
            xc_3 var3 = ((rYB)this.class_.throws_[7]).byte_(var2);
            xd_3 var4 = var3.break_();
            boolean var5 = false;
            rCm_1 var6 = null;
            if (var4.class_(rls_3.z)) {
               if (var4 instanceof dO_2) {
                  dO_2 var7 = (dO_2)var4;
                  if (!var7.implements_(var3)) {
                     var5 = true;
                     var6 = var7.break_();
                  }
               } else if (var4 instanceof zO_2) {
                  int var8 = var3.byte_(zO_2.volatile_);
                  if (var8 < 7) {
                     var5 = true;
                     var6 = zO_2.volatile_;
                  }
               } else if (var4 == xu_3.XJ) {
                  int var9 = var3.byte_(zz_3.volatile_);
                  if (var9 < 3) {
                     var5 = true;
                     var6 = zz_3.volatile_;
                  }
               }

               if (var5) {
                  ((rYB)this.class_.throws_[7]).byte_(2005, var2, 0);
                  ((rYB)this.class_.throws_[7]).break_(var2, var3.class_(var6, Integer.valueOf(var3.byte_(var6) + 1)));
                  this.class_.sl();
               }
            }
         }
      }
   }

   @Override
   public boolean catch_() {
      if (this.class_.sn() >= 10) {
         return false;
      } else {
         return rbF_2.final_(this.class_).nextFloat() < 0.3F ? false : this.class_.sc() && this.class_.sH();
      }
   }

   @Override
   public boolean private_() {
      return this.catch_();
   }
}
