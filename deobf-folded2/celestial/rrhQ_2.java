package celestial;

public class rrhQ_2 extends rrMi_1 {
   public rrhQ_2() {
      super(aI_2.N, "puffer_fish_big", 0.2F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      Object var4 = var3.id_throws().get(aI_2.N);
      if (!(var4 instanceof qy_3)) {
         rrbb_3.id_protected("Not a PufferfishRenderer: " + var4);
         return null;
      } else {
         if (((pV_2)var4).id_byte() == null) {
            qy_3 var5 = new qy_3(var3);
            var5.id_byte = var2;
            var4 = var5;
         }

         qy_3 var6 = (qy_3)var4;
         if (!rrxr_3.Ea.id_protected()) {
            rrbb_3.id_protected("Model field not found: RenderPufferfish.modelBig");
            return null;
         } else {
            rrxr_3.Ea.id_class(var6, var1);
            return var6;
         }
      }
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wJ_2 var3)) {
         return null;
      } else if (var2.equals("body")) {
         return (Iq_1)rrxr_3.sI.id_class(var3, 0);
      } else if (var2.equals("fin_right")) {
         return (Iq_1)rrxr_3.sI.id_class(var3, 1);
      } else if (var2.equals("fin_left")) {
         return (Iq_1)rrxr_3.sI.id_class(var3, 2);
      } else if (var2.equals("spikes_front_top")) {
         return (Iq_1)rrxr_3.sI.id_class(var3, 3);
      } else if (var2.equals("spikes_middle_top")) {
         return (Iq_1)rrxr_3.sI.id_class(var3, 4);
      } else if (var2.equals("spikes_back_top")) {
         return (Iq_1)rrxr_3.sI.id_class(var3, 5);
      } else if (var2.equals("spikes_front_right")) {
         return (Iq_1)rrxr_3.sI.id_class(var3, 6);
      } else if (var2.equals("spikes_front_left")) {
         return (Iq_1)rrxr_3.sI.id_class(var3, 7);
      } else if (var2.equals("spikes_front_bottom")) {
         return (Iq_1)rrxr_3.sI.id_class(var3, 8);
      } else if (var2.equals("spikes_middle_bottom")) {
         return (Iq_1)rrxr_3.sI.id_class(var3, 9);
      } else if (var2.equals("spikes_back_bottom")) {
         return (Iq_1)rrxr_3.sI.id_class(var3, 10);
      } else if (var2.equals("spikes_back_right")) {
         return (Iq_1)rrxr_3.sI.id_class(var3, 11);
      } else {
         return var2.equals("spikes_back_left") ? (Iq_1)rrxr_3.sI.id_class(var3, 12) : null;
      }
   }

   @Override
   public In_1 id_throws() {
      return new wJ_2();
   }

   @Override
   public String[] id_case() {
      return new String[]{
         "body",
         "fin_right",
         "fin_left",
         "spikes_front_top",
         "spikes_middle_top",
         "spikes_back_top",
         "spikes_front_right",
         "spikes_front_left",
         "spikes_front_bottom",
         "spikes_middle_bottom",
         "spikes_back_bottom",
         "spikes_back_right",
         "spikes_back_left"
      };
   }
}
