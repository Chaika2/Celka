package celestial;

public class rrOE extends rrMi_1 {
   public rrOE() {
      super(ryW_2.interface_, "bell", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      jz_3 var3 = jz_3.break_;
      Object var4 = var3.class_(ryW_2.interface_);
      if (!(var4 instanceof fa_3)) {
         return null;
      } else {
         if (((jW_2)var4).byte_() == null) {
            var4 = new fa_3(var3);
         }

         if (!(var1 instanceof rrMf_1 var5)) {
            rrbb_3.protected_("Not a bell model: " + var1);
            return null;
         } else {
            return var5.class_((jW_2)var4);
         }
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof rrMf_1 var3)) {
         return null;
      } else {
         return var2.equals("body") ? var3.class_ : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new rrMf_1();
   }

   @Override
   public String[] case_() {
      return new String[]{"body"};
   }
}
