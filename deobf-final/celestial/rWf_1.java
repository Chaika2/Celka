package celestial;

public class rWf_1 extends rzt_3 {
   rWf_1(rzE_2[] var1, rQz_1[] var2) {
      super(var1, var2);
   }

   @Override
   protected rWV class_(rWV[] var1) {
      switch (var1.length) {
         case 0:
            return break_;
         case 1:
            return var1[0];
         case 2:
            rWV var2 = var1[0];
            rWV var3 = var1[1];
            return (var2x, var3x) -> {
               var2.expand(var2x, var3x);
               var3.expand(var2x, var3x);
               return true;
            };
         default:
            return (var1x, var2x) -> {
               for (rWV var6 : var1) {
                  var6.expand(var1x, var2x);
               }

               return true;
            };
      }
   }

   @Override
   public rzm_3 class_() {
      return rzM_2.private_;
   }
}
