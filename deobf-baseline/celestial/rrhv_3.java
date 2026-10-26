package celestial;

public class rrhv_3 extends rrMi_1 {
   public rrhv_3() {
      super(aI_2.m, "salmon", 0.3F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qT_2 var4 = new qT_2(var3);
      var4.id_throws = (wQ_2<rOV>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wQ_2 var3)) {
         return null;
      } else if (var2.equals("body_front")) {
         return (Iq_1)rrxr_3.sa.id_class(var3, 0);
      } else if (var2.equals("body_back")) {
         return (Iq_1)rrxr_3.sa.id_class(var3, 1);
      } else if (var2.equals("head")) {
         return (Iq_1)rrxr_3.sa.id_class(var3, 2);
      } else {
         if (var2.equals("fin_back_1")) {
            Iq_1 var4 = (Iq_1)rrxr_3.sa.id_class(var3, 0);
            if (var4 != null) {
               return var4.id_class(0);
            }
         }

         if (var2.equals("fin_back_2")) {
            Iq_1 var5 = (Iq_1)rrxr_3.sa.id_class(var3, 1);
            if (var5 != null) {
               return var5.id_class(1);
            }
         }

         if (var2.equals("tail")) {
            Iq_1 var6 = (Iq_1)rrxr_3.sa.id_class(var3, 1);
            if (var6 != null) {
               return var6.id_class(0);
            }
         }

         if (var2.equals("fin_right")) {
            return (Iq_1)rrxr_3.sa.id_class(var3, 3);
         } else {
            return var2.equals("fin_left") ? (Iq_1)rrxr_3.sa.id_class(var3, 4) : null;
         }
      }
   }

   @Override
   public In_1 id_throws() {
      return new wQ_2();
   }

   @Override
   public String[] id_case() {
      return new String[]{"body_front", "body_back", "head", "fin_back_1", "fin_back_2", "tail", "fin_right", "fin_left"};
   }
}
