package celestial;

public class rrOd_1 extends rrMi_1 {
   public rrOd_1() {
      super(ryW_2.break_, "chest_large", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      jz_3 var3 = jz_3.break_;
      Object var4 = var3.class_(ryW_2.break_);
      if (!(var4 instanceof jr_3)) {
         return null;
      } else {
         if (((jW_2)var4).byte_() == null) {
            var4 = new jr_3(var3);
         }

         if (!(var1 instanceof rrMj_1 var5)) {
            rrbb_3.protected_("Not a large chest model: " + var1);
            return null;
         } else {
            return var5.class_((jW_2)var4);
         }
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof rrMj_1 var3)) {
         return null;
      } else if (var2.equals("lid_left")) {
         return var3.class_;
      } else if (var2.equals("base_left")) {
         return var3.break_;
      } else if (var2.equals("knob_left")) {
         return var3.byte_;
      } else if (var2.equals("lid_right")) {
         return var3.protected_;
      } else if (var2.equals("base_right")) {
         return var3.throws_;
      } else {
         return var2.equals("knob_right") ? var3.case_ : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new rrMj_1();
   }

   @Override
   public String[] case_() {
      return new String[]{"lid_left", "base_left", "knob_left", "lid_right", "base_right", "knob_right"};
   }
}
