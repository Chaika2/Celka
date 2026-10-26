package celestial;

public class rrOd_1 extends rrMi_1 {
   public rrOd_1() {
      super(ryW_2.id_break, "chest_large", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      jz_3 var3 = jz_3.id_break;
      Object var4 = var3.id_class(ryW_2.id_break);
      if (!(var4 instanceof jr_3)) {
         return null;
      } else {
         if (((jW_2)var4).id_byte() == null) {
            var4 = new jr_3(var3);
         }

         if (!(var1 instanceof rrMj_1 var5)) {
            rrbb_3.id_protected("Not a large chest model: " + var1);
            return null;
         } else {
            return var5.id_class((jW_2)var4);
         }
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof rrMj_1 var3)) {
         return null;
      } else if (var2.equals("lid_left")) {
         return var3.id_class;
      } else if (var2.equals("base_left")) {
         return var3.id_break;
      } else if (var2.equals("knob_left")) {
         return var3.id_byte;
      } else if (var2.equals("lid_right")) {
         return var3.id_protected;
      } else if (var2.equals("base_right")) {
         return var3.id_throws;
      } else {
         return var2.equals("knob_right") ? var3.id_case : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new rrMj_1();
   }

   @Override
   public String[] id_case() {
      return new String[]{"lid_left", "base_left", "knob_left", "lid_right", "base_right", "knob_right"};
   }
}
