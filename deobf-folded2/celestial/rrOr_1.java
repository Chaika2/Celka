package celestial;

public class rrOr_1 extends rrOG {
   public rrOr_1() {
      super(aI_2.id_break, "armor_stand", 0.0F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pQ_2 var4 = new pQ_2(var3);
      var4.id_throws = (tJ_2)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof tx_3 var3)) {
         return null;
      } else if (var2.equals("right")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.SF, 0);
      } else if (var2.equals("left")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.SF, 1);
      } else if (var2.equals("waist")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.SF, 2);
      } else {
         return var2.equals("base") ? (Iq_1)rrxr_3.id_class(var3, rrxr_3.SF, 3) : super.id_class(var3, var2);
      }
   }

   @Override
   public In_1 id_throws() {
      return new tx_3();
   }

   @Override
   public String[] id_case() {
      String[] var1 = super.id_case();
      return (String[])rrbb_3.id_class((Object[])var1, (Object[])(new String[]{"right", "left", "waist", "base"}));
   }
}
