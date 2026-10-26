package celestial;

public class rrhY_2 extends rrMi_1 {
   public rrhY_2() {
      super(aI_2.Y, "tropical_fish_a", 0.2F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      Object var4 = var3.throws_().get(aI_2.Y);
      if (!(var4 instanceof TP)) {
         rrbb_3.protected_("Not a TropicalFishRenderer: " + var4);
         return null;
      } else {
         if (((pV_2)var4).byte_() == null) {
            TP var5 = new TP(var3);
            var5.byte_ = var2;
            var4 = var5;
         }

         TP var6 = (TP)var4;
         if (!rrxr_3.GG.protected_()) {
            rrbb_3.protected_("Model field not found: RenderTropicalFish.modelA");
            return null;
         } else {
            rrxr_3.GG.class_(var6, var1);
            return var6;
         }
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wq_3 var3)) {
         return null;
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.Ev.class_(var3, 0);
      } else if (var2.equals("tail")) {
         return (Iq_1)rrxr_3.Ev.class_(var3, 1);
      } else if (var2.equals("fin_right")) {
         return (Iq_1)rrxr_3.Ev.class_(var3, 2);
      } else if (var2.equals("fin_left")) {
         return (Iq_1)rrxr_3.Ev.class_(var3, 3);
      } else {
         return var2.equals("fin_top") ? (Iq_1)rrxr_3.Ev.class_(var3, 4) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new wq_3(0.0F);
   }

   @Override
   public String[] case_() {
      return new String[]{"body", "tail", "fin_right", "fin_left", "fin_top"};
   }
}
