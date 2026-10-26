package celestial;

class rrEA extends rod_3 {
   @Override
   protected int id_byte(long var1) {
      if (!this.id_class.id_class(var1)) {
         rrEG var3 = this.id_class.id_break(var1);
         if (var3 != null) {
            return var3.id_finally();
         }
      }

      return rrEx_1.id_break + 1;
   }

   public rrEA(rrEL var1) {
      super(rrEx_1.id_break + 2, 256, 256);
      this.id_class = var1;
   }

   @Override
   protected void id_class(long var1, int var3) {
      rrEG var4 = this.id_class.id_break(var1);
      int var5 = var4 == null ? rrEx_1.id_break + 1 : var4.id_finally();
      if (var5 != var3) {
         var4 = this.id_class.id_class(var1, var3, var4, var5);
         if (var4 != null) {
            this.id_class.id_private.add(var4);
         }
      }
   }

   @Override
   protected int id_break(long var1) {
      rqv_3 var3 = (rqv_3)this.id_class.id_protected.get(var1);
      if (var3 == null) {
         return Integer.MAX_VALUE;
      } else {
         return var3.isEmpty() ? Integer.MAX_VALUE : ((rrEF)var3.id_class()).id_break();
      }
   }

   public int id_break(int var1) {
      return this.id_class(var1);
   }
}
