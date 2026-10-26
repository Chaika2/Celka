package celestial;

public class rrhN_2 extends rrMi_1 {
   public rrhN_2() {
      super(aI_2.N, "puffer_fish_medium", 0.2F);
   }

   @Override
   public rrMa_1 class_(In_1 var1, float var2) {
      pg_3 var3 = QY.instanceof_().case_();
      Object var4 = var3.throws_().get(aI_2.N);
      if (!(var4 instanceof qy_3)) {
         rrbb_3.protected_("Not a PufferfishRenderer: " + var4);
         return null;
      } else {
         if (((pV_2)var4).byte_() == null) {
            qy_3 var5 = new qy_3(var3);
            var5.byte_ = var2;
            var4 = var5;
         }

         qy_3 var6 = (qy_3)var4;
         if (!rrxr_3.Ee.protected_()) {
            rrbb_3.protected_("Model field not found: RenderPufferfish.modelMedium");
            return null;
         } else {
            rrxr_3.Ee.class_(var6, var1);
            return var6;
         }
      }
   }

   @Override
   public Iq_1 class_(In_1 var1, String var2) {
      if (!(var1 instanceof wx_3 var3)) {
         return null;
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.sj.class_(var3, 0);
      } else if (var2.equals("fin_right")) {
         return (Iq_1)rrxr_3.sj.class_(var3, 1);
      } else if (var2.equals("fin_left")) {
         return (Iq_1)rrxr_3.sj.class_(var3, 2);
      } else if (var2.equals("spikes_front_top")) {
         return (Iq_1)rrxr_3.sj.class_(var3, 3);
      } else if (var2.equals("spikes_back_top")) {
         return (Iq_1)rrxr_3.sj.class_(var3, 4);
      } else if (var2.equals("spikes_front_right")) {
         return (Iq_1)rrxr_3.sj.class_(var3, 5);
      } else if (var2.equals("spikes_back_right")) {
         return (Iq_1)rrxr_3.sj.class_(var3, 6);
      } else if (var2.equals("spikes_back_left")) {
         return (Iq_1)rrxr_3.sj.class_(var3, 7);
      } else if (var2.equals("spikes_front_left")) {
         return (Iq_1)rrxr_3.sj.class_(var3, 8);
      } else if (var2.equals("spikes_back_bottom")) {
         return (Iq_1)rrxr_3.sj.class_(var3, 9);
      } else {
         return var2.equals("spikes_front_bottom") ? (Iq_1)rrxr_3.sj.class_(var3, 10) : null;
      }
   }

   @Override
   public In_1 throws_() {
      return new wx_3();
   }

   @Override
   public String[] case_() {
      return new String[]{
         "body",
         "fin_right",
         "fin_left",
         "spikes_front_top",
         "spikes_back_top",
         "spikes_front_right",
         "spikes_back_right",
         "spikes_back_left",
         "spikes_front_left",
         "spikes_back_bottom",
         "spikes_front_bottom"
      };
   }
}
