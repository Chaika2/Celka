package celestial;

public class rrOP extends rrMi_1 {
   public rrOP() {
      super(ryW_2.super_, "banner", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      jz_3 var3 = jz_3.break_;
      Object var4 = var3.class_(ryW_2.super_);
      if (!(var4 instanceof fD_2)) {
         return null;
      } else {
         if (((jW_2)var4).byte_() == null) {
            var4 = new fD_2(var3);
         }

         if (!(var1 instanceof rrMw_1 var5)) {
            rrbb_3.protected_("Not a banner model: " + var1);
            return null;
         } else {
            return var5.class_((jW_2)var4);
         }
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof rrMw_1 var3)) {
         return null;
      } else if (var2.equals("slate")) {
         return var3.class_;
      } else if (var2.equals("stand")) {
         return var3.break_;
      } else {
         return var2.equals("top") ? var3.byte_ : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new rrMw_1();
   }

   @Override
   public String[] case_() {
      return new String[]{"slate", "stand", "top"};
   }
}
