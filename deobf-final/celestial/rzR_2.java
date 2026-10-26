package celestial;

public class rzR_2 extends rzt_3 {
   rzR_2(rzE_2[] var1, rQz_1[] var2) {
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
            return var1[0].class_(var1[1]);
         default:
            return (var1x, var2) -> {
               for (rWV var6 : var1) {
                  if (!var6.expand(var1x, var2)) {
                     return false;
                  }
               }

               return true;
            };
      }
   }

   @Override
   public rzm_3 class_() {
      return rzM_2.catch_;
   }
}
