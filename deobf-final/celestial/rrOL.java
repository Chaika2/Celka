package celestial;

public class rrOL extends rrMi_1 {
   public rrOL() {
      this("end_crystal");
   }

   protected rrOL(String var1) {
      super(aI_2.super_, var1, 0.5F);
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof rrMe_1 var3)) {
         return null;
      } else if (var2.equals("cube")) {
         return var3.class_;
      } else if (var2.equals("glass")) {
         return var3.break_;
      } else {
         return var2.equals("base") ? var3.byte_ : null;
      }
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      pV_2 var4 = var3.throws_().get(aI_2.super_);
      if (!(var4 instanceof pt_3 var5)) {
         rrbb_3.protected_("Not an instance of RenderEnderCrystal: " + var4);
         return null;
      } else {
         if (var5.byte_() == null) {
            var5 = new pt_3(var3);
         }

         if (!(var1 instanceof rrMe_1 var6)) {
            rrbb_3.protected_("Not a EnderCrystalModel model: " + var1);
            return null;
         } else {
            pt_3 var7 = var6.class_(var5);
            var7.byte_ = var2;
            return var7;
         }
      }
   }

   @Override
   public In_1 throws_() {
      return new rrMe_1();
   }

   @Override
   public String[] case_() {
      return new String[]{"cube", "glass", "base"};
   }
}
