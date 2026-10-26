package celestial;

public class rrhV_2 extends rrMi_1 {
   public rrhV_2() {
      super(ryW_2.byte_, "trapped_chest", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      jz_3 var3 = jz_3.break_;
      Object var4 = var3.class_(ryW_2.byte_);
      if (!(var4 instanceof jr_3)) {
         return null;
      } else {
         if (((jW_2)var4).byte_() == null) {
            var4 = new jr_3(var3);
         }

         if (!(var1 instanceof rrMV var5)) {
            rrbb_3.protected_("Not a chest model: " + var1);
            return null;
         } else {
            return var5.class_((jW_2)var4);
         }
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof rrMV var3)) {
         return null;
      } else if (var2.equals("lid")) {
         return var3.class_;
      } else if (var2.equals("base")) {
         return var3.break_;
      } else {
         return var2.equals("knob") ? var3.byte_ : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new rrMV();
   }

   @Override
   public String[] case_() {
      return new String[]{"lid", "base", "knob"};
   }
}
