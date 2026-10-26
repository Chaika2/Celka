package celestial;

public interface rEo_1 {
   int n();

   static boolean id_class(iB_2 var0, iB_2 var1) {
      float var2 = (float)var0.id_class(iQ_2.id_case);
      float var3;
      if (!var0.n_() && (int)var2 > 0) {
         var3 = var2 / 2.0F + (float)((rYB)var0.id_throws[7]).id_int.nextInt((int)var2);
      } else {
         var3 = var2;
      }

      boolean var4 = var1.id_break(rye_3.id_byte(var0), var3);
      if (var4) {
         var0.id_class(var0, var1);
         if (!var0.n_()) {
            id_break(var0, var1);
         }
      }

      return var4;
   }

   static void id_break(iB_2 var0, iB_2 var1) {
      double var2 = var0.id_class(iQ_2.id_catch);
      double var4 = var1.id_class(iQ_2.id_byte);
      double var6 = var2 - var4;
      if (!(var6 <= 0.0)) {
         double var8 = var1.rx() - var0.rx();
         double var10 = var1.BO() - var0.BO();
         float var12 = (float)(((rYB)var0.id_throws[7]).id_int.nextInt(21) - 10);
         double var13 = var6 * (double)(((rYB)var0.id_throws[7]).id_int.nextFloat() * 0.5F + 0.2F);
         rjU_2 var15 = new rjU_2(var8, 0.0, var10).id_protected().id_class(var13).id_break(var12);
         double var16 = var6 * (double)((rYB)var0.id_throws[7]).id_int.nextFloat() * 0.5;
         var1.id_implements(var15.id_break, var16, var15.id_protected);
         Boolean var22 = true;
         var1.id_throws[25] = var22;
      }
   }
}
