package celestial;

enum Ya_1 {
   Ya_1(String var3) {
   }

   @Override
   protected boolean id_class(rhN_2 var1, OT var2) {
      Oj_1 var3 = var1.r().id_break(var2);
      if (!var3.id_break()) {
         return false;
      } else {
         for (String var5 : var3.id_case()) {
            var1.r().id_break(var2, var5);
         }

         return true;
      }
   }

   @Override
   protected boolean id_class(rhN_2 var1, OT var2, String var3) {
      return var1.r().id_break(var2, var3);
   }
}
