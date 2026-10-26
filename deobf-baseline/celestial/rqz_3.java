package celestial;

public abstract class rqz_3 extends rrsw_3 {
   protected rqz_3(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected int id_class(long var1, long var3, int var5) {
      int var6 = var5;

      for (int var7 = -1; var7 <= 1; var7++) {
         for (int var8 = -1; var8 <= 1; var8++) {
            for (int var9 = -1; var9 <= 1; var9++) {
               long var10 = rjh_3.id_class(var1, var7, var8, var9);
               if (var10 == var1) {
                  var10 = Long.MAX_VALUE;
               }

               if (var10 != var3) {
                  int var12 = this.id_break(var10, var1, this.id_byte(var10));
                  if (var6 > var12) {
                     var6 = var12;
                  }

                  if (var6 == 0) {
                     return var6;
                  }
               }
            }
         }
      }

      return var6;
   }

   @Override
   protected void id_class(long var1, int var3, boolean var4) {
      for (int var5 = -1; var5 <= 1; var5++) {
         for (int var6 = -1; var6 <= 1; var6++) {
            for (int var7 = -1; var7 <= 1; var7++) {
               long var8 = rjh_3.id_class(var1, var5, var6, var7);
               if (var8 != var1) {
                  this.id_break(var1, var8, var3, var4);
               }
            }
         }
      }
   }

   @Override
   protected boolean id_class(long var1) {
      return var1 == Long.MAX_VALUE;
   }

   public void id_break(long var1, int var3, boolean var4) {
      this.id_class(Long.MAX_VALUE, var1, var3, var4);
   }

   protected abstract int id_break(long var1);

   @Override
   protected int id_break(long var1, long var3, int var5) {
      return var1 == Long.MAX_VALUE ? this.id_break(var3) : var5 + 1;
   }
}
