package celestial;

public abstract class rod_3 extends rrsw_3 {
   protected rod_3(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected int id_class(long var1, long var3, int var5) {
      int var6 = var5;
      rfj_3 var7 = new rfj_3(var1);
      int var8 = var7.id_break;
      int var9 = var7.id_byte;

      for (int var10 = -1; var10 <= 1; var10++) {
         for (int var11 = -1; var11 <= 1; var11++) {
            long var12 = rfj_3.id_class(var8 + var10, var9 + var11);
            if (var12 == var1) {
               var12 = rfj_3.id_class;
            }

            if (var12 != var3) {
               int var14 = this.id_break(var12, var1, this.id_byte(var12));
               if (var6 > var14) {
                  var6 = var14;
               }

               if (var6 == 0) {
                  return var6;
               }
            }
         }
      }

      return var6;
   }

   @Override
   protected void id_class(long var1, int var3, boolean var4) {
      rfj_3 var5 = new rfj_3(var1);
      int var6 = var5.id_break;
      int var7 = var5.id_byte;

      for (int var8 = -1; var8 <= 1; var8++) {
         for (int var9 = -1; var9 <= 1; var9++) {
            long var10 = rfj_3.id_class(var6 + var8, var7 + var9);
            if (var10 != var1) {
               this.id_break(var1, var10, var3, var4);
            }
         }
      }
   }

   @Override
   protected boolean id_class(long var1) {
      return var1 == rfj_3.id_class;
   }

   public void id_break(long var1, int var3, boolean var4) {
      this.id_class(rfj_3.id_class, var1, var3, var4);
   }

   protected abstract int id_break(long var1);

   @Override
   protected int id_break(long var1, long var3, int var5) {
      return var1 == rfj_3.id_class ? this.id_break(var3) : var5 + 1;
   }
}
