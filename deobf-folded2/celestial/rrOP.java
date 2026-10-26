package celestial;

public class rrOP extends rrMi_1 {
   public rrOP() {
      super(ryW_2.id_super, "banner", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      jz_3 var3 = jz_3.id_break;
      Object var4 = var3.id_class(ryW_2.id_super);
      if (!(var4 instanceof fD_2)) {
         return null;
      } else {
         if (((jW_2)var4).id_byte() == null) {
            var4 = new fD_2(var3);
         }

         if (!(var1 instanceof rrMw_1 var5)) {
            rrbb_3.id_protected("Not a banner model: " + var1);
            return null;
         } else {
            return var5.id_class((jW_2)var4);
         }
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof rrMw_1 var3)) {
         return null;
      } else if (var2.equals("slate")) {
         return var3.id_class;
      } else if (var2.equals("stand")) {
         return var3.id_break;
      } else {
         return var2.equals("top") ? var3.id_byte : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new rrMw_1();
   }

   @Override
   public String[] id_case() {
      return new String[]{"slate", "stand", "top"};
   }
}
