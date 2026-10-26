package celestial;

public class rrOz_1 extends rrMi_1 {
   public rrOz_1() {
      super(ryW_2.goto_, "conduit", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      jz_3 var3 = jz_3.break_;
      Object var4 = var3.class_(ryW_2.goto_);
      if (!(var4 instanceof jP_2)) {
         return null;
      } else {
         if (((jW_2)var4).byte_() == null) {
            var4 = new jP_2(var3);
         }

         if (!(var1 instanceof rrMg_1 var5)) {
            rrbb_3.protected_("Not a conduit model: " + var1);
            return null;
         } else {
            return var5.class_((jW_2)var4);
         }
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof rrMg_1 var3)) {
         return null;
      } else if (var2.equals("eye")) {
         return var3.class_;
      } else if (var2.equals("wind")) {
         return var3.break_;
      } else if (var2.equals("base")) {
         return var3.byte_;
      } else {
         return var2.equals("cage") ? var3.protected_ : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new rrMg_1();
   }

   @Override
   public String[] case_() {
      return new String[]{"eye", "wind", "base", "cage"};
   }
}
