package celestial;

enum Ye_1 {
   Ye_1(String var3) {
   }

   @Override
   protected boolean id_class(rhN_2 var1, OT var2) {
      Oj_1 var3 = var1.r().id_break(var2);
      if (var3.id_class()) {
         return false;
      } else {
         for (String var5 : var3.id_throws()) {
            var1.r().id_class(var2, var5);
         }

         return true;
      }
   }

   @Override
   protected boolean id_class(rhN_2 var1, OT var2, String var3) {
      return var1.r().id_class(var2, var3);
   }
}
