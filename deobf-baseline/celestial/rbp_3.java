package celestial;

class rbp_3 extends rbq_3 {
   rbp_3(rbF_2 var1) {
      super(var1);
      this.id_class = var1;
   }

   @Override
   public void id_throws() {
      if (rbF_2.id_package(this.id_class).nextInt(30) == 0) {
         for (int var1 = 1; var1 <= 2; var1++) {
            rfH_2 var2 = this.id_class.Bs().id_catch(var1);
            xc_3 var3 = ((rYB)this.id_class.id_throws[7]).id_byte(var2);
            xd_3 var4 = var3.id_break();
            boolean var5 = false;
            rCm_1 var6 = null;
            if (var4.id_class(rls_3.z)) {
               if (var4 instanceof dO_2) {
                  dO_2 var7 = (dO_2)var4;
                  if (!var7.id_implements(var3)) {
                     var5 = true;
                     var6 = var7.id_break();
                  }
               } else if (var4 instanceof zO_2) {
                  int var8 = var3.id_byte(zO_2.id_volatile);
                  if (var8 < 7) {
                     var5 = true;
                     var6 = zO_2.id_volatile;
                  }
               } else if (var4 == xu_3.XJ) {
                  int var9 = var3.id_byte(zz_3.id_volatile);
                  if (var9 < 3) {
                     var5 = true;
                     var6 = zz_3.id_volatile;
                  }
               }

               if (var5) {
                  ((rYB)this.id_class.id_throws[7]).id_byte(2005, var2, 0);
                  ((rYB)this.id_class.id_throws[7]).id_break(var2, var3.id_class(var6, Integer.valueOf(var3.id_byte(var6) + 1)));
                  this.id_class.sl();
               }
            }
         }
      }
   }

   @Override
   public boolean id_catch() {
      if (this.id_class.sn() >= 10) {
         return false;
      } else {
         return rbF_2.id_final(this.id_class).nextFloat() < 0.3F ? false : this.id_class.sc() && this.id_class.sH();
      }
   }

   @Override
   public boolean id_private() {
      return this.id_catch();
   }
}
