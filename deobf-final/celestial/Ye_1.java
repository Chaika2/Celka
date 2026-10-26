package celestial;

enum Ye_1 {
   Ye_1(String var3) {
   }

   @Override
   protected boolean class_(rhN_2 var1, OT var2) {
      Oj_1 var3 = var1.r().break_(var2);
      if (var3.class_()) {
         return false;
      } else {
         for (String var5 : var3.throws_()) {
            var1.r().class_(var2, var5);
         }

         return true;
      }
   }

   @Override
   protected boolean class_(rhN_2 var1, OT var2, String var3) {
      return var1.r().class_(var2, var3);
   }
}
