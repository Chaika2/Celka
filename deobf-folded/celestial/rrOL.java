package celestial;

public class rrOL extends rrMi_1 {
   public rrOL() {
      this("end_crystal");
   }

   protected rrOL(String var1) {
      super(aI_2.id_super, var1, 0.5F);
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof rrMe_1 var3)) {
         return null;
      } else if (var2.equals("cube")) {
         return var3.id_class;
      } else if (var2.equals("glass")) {
         return var3.id_break;
      } else {
         return var2.equals("base") ? var3.id_byte : null;
      }
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pV_2 var4 = var3.id_throws().get(aI_2.id_super);
      if (!(var4 instanceof pt_3 var5)) {
         rrbb_3.id_protected("Not an instance of RenderEnderCrystal: " + var4);
         return null;
      } else {
         if (var5.id_byte() == null) {
            var5 = new pt_3(var3);
         }

         if (!(var1 instanceof rrMe_1 var6)) {
            rrbb_3.id_protected("Not a EnderCrystalModel model: " + var1);
            return null;
         } else {
            pt_3 var7 = var6.id_class(var5);
            var7.id_byte = var2;
            return var7;
         }
      }
   }

   @Override
   public In_1 id_throws() {
      return new rrMe_1();
   }

   @Override
   public String[] id_case() {
      return new String[]{"cube", "glass", "base"};
   }
}
