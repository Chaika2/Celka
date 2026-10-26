package celestial;

public class rrOE extends rrMi_1 {
   public rrOE() {
      super(ryW_2.id_interface, "bell", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      jz_3 var3 = jz_3.id_break;
      Object var4 = var3.id_class(ryW_2.id_interface);
      if (!(var4 instanceof fa_3)) {
         return null;
      } else {
         if (((jW_2)var4).id_byte() == null) {
            var4 = new fa_3(var3);
         }

         if (!(var1 instanceof rrMf_1 var5)) {
            rrbb_3.id_protected("Not a bell model: " + var1);
            return null;
         } else {
            return var5.id_class((jW_2)var4);
         }
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof rrMf_1 var3)) {
         return null;
      } else {
         return var2.equals("body") ? var3.id_class : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new rrMf_1();
   }

   @Override
   public String[] id_case() {
      return new String[]{"body"};
   }
}
