package celestial;

public class rrho_3 extends rrMi_1 {
   public rrho_3() {
      super(aI_2.Y, "tropical_fish_b", 0.2F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      Object var4 = var3.id_throws().get(aI_2.Y);
      if (!(var4 instanceof TP)) {
         rrbb_3.id_protected("Not a TropicalFishRenderer: " + var4);
         return null;
      } else {
         if (((pV_2)var4).id_byte() == null) {
            TP var5 = new TP(var3);
            var5.id_byte = var2;
            var4 = var5;
         }

         TP var6 = (TP)var4;
         if (!rrxr_3.Gb.id_protected()) {
            rrbb_3.id_protected("Model field not found: RenderTropicalFish.modelB");
            return null;
         } else {
            rrxr_3.Gb.id_class(var6, var1);
            return var6;
         }
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wT_2 var3)) {
         return null;
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.EL.id_class(var3, 0);
      } else if (var2.equals("tail")) {
         return (Iq_1)rrxr_3.EL.id_class(var3, 1);
      } else if (var2.equals("fin_right")) {
         return (Iq_1)rrxr_3.EL.id_class(var3, 2);
      } else if (var2.equals("fin_left")) {
         return (Iq_1)rrxr_3.EL.id_class(var3, 3);
      } else if (var2.equals("fin_top")) {
         return (Iq_1)rrxr_3.EL.id_class(var3, 4);
      } else {
         return var2.equals("fin_bottom") ? (Iq_1)rrxr_3.EL.id_class(var3, 5) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new wT_2(0.0F);
   }

   @Override
   public String[] id_case() {
      return new String[]{"body", "tail", "fin_right", "fin_left", "fin_top", "fin_bottom"};
   }
}
