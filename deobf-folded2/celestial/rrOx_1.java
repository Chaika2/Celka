package celestial;

public class rrOx_1 extends rrMi_1 {
   public rrOx_1() {
      super(ryW_2.id_break, "chest", 0.0F);
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

         if (!(var1 instanceof rrMV var5)) {
            rrbb_3.id_protected("Not a chest model: " + var1);
            return null;
         } else {
            return var5.id_class((jW_2)var4);
         }
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof rrMV var3)) {
         return null;
      } else if (var2.equals("lid")) {
         return var3.id_class;
      } else if (var2.equals("base")) {
         return var3.id_break;
      } else {
         return var2.equals("knob") ? var3.id_byte : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new rrMV();
   }

   @Override
   public String[] id_case() {
      return new String[]{"lid", "base", "knob"};
   }
}
