package celestial;

class rrEA extends rod_3 {
   @Override
   protected int byte_(long var1) {
      if (!this.class_.class_(var1)) {
         rrEG var3 = this.class_.break_(var1);
         if (var3 != null) {
            return var3.finally_();
         }
      }

      return rrEx_1.break_ + 1;
   }

   public rrEA(rrEL var1) {
      super(rrEx_1.break_ + 2, 256, 256);
      this.class_ = var1;
   }

   @Override
   protected void class_(long var1, int var3) {
      rrEG var4 = this.class_.break_(var1);
      int var5 = var4 == null ? rrEx_1.break_ + 1 : var4.finally_();
      if (var5 != var3) {
         var4 = this.class_.class_(var1, var3, var4, var5);
         if (var4 != null) {
            this.class_.private_.add(var4);
         }
      }
   }

   @Override
   protected int break_(long var1) {
      rqv_3 var3 = (rqv_3)this.class_.protected_.get(var1);
      if (var3 == null) {
         return Integer.MAX_VALUE;
      } else {
         return var3.isEmpty() ? Integer.MAX_VALUE : ((rrEF)var3.class_()).break_();
      }
   }

   public int break_(int var1) {
      return this.class_(var1);
   }
}
