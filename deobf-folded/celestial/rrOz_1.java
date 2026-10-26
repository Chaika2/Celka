package celestial;

public class rrOz_1 extends rrMi_1 {
   public rrOz_1() {
      super(ryW_2.id_goto, "conduit", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      jz_3 var3 = jz_3.id_break;
      Object var4 = var3.id_class(ryW_2.id_goto);
      if (!(var4 instanceof jP_2)) {
         return null;
      } else {
         if (((jW_2)var4).id_byte() == null) {
            var4 = new jP_2(var3);
         }

         if (!(var1 instanceof rrMg_1 var5)) {
            rrbb_3.id_protected("Not a conduit model: " + var1);
            return null;
         } else {
            return var5.id_class((jW_2)var4);
         }
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof rrMg_1 var3)) {
         return null;
      } else if (var2.equals("eye")) {
         return var3.id_class;
      } else if (var2.equals("wind")) {
         return var3.id_break;
      } else if (var2.equals("base")) {
         return var3.id_byte;
      } else {
         return var2.equals("cage") ? var3.id_protected : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new rrMg_1();
   }

   @Override
   public String[] id_case() {
      return new String[]{"eye", "wind", "base", "cage"};
   }
}
