package celestial;

public class rrOS extends rrMi_1 {
   public rrOS() {
      super(ryW_2.public_, "bed", 0.0F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      jz_3 var3 = jz_3.break_;
      Object var4 = var3.class_(ryW_2.public_);
      if (!(var4 instanceof fe_3)) {
         return null;
      } else {
         if (((jW_2)var4).byte_() == null) {
            var4 = new fe_3(var3);
         }

         if (!(var1 instanceof rrMI var5)) {
            rrbb_3.protected_("Not a BedModel: " + var1);
            return null;
         } else {
            return var5.class_((jW_2)var4);
         }
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof rrMI var3)) {
         return null;
      } else if (var2.equals("head")) {
         return var3.class_;
      } else if (var2.equals("foot")) {
         return var3.break_;
      } else {
         Iq_1[] var4 = var3.byte_;
         if (var4 != null) {
            if (var2.equals("leg1")) {
               return var4[0];
            }

            if (var2.equals("leg2")) {
               return var4[1];
            }

            if (var2.equals("leg3")) {
               return var4[2];
            }

            if (var2.equals("leg4")) {
               return var4[3];
            }
         }

         return null;
      }
   }

   @Override
   public In_1 throws_() {
      return new rrMI();
   }

   @Override
   public String[] case_() {
      return new String[]{"head", "foot", "leg1", "leg2", "leg3", "leg4"};
   }
}
