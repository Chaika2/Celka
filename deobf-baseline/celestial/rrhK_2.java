package celestial;

public class rrhK_2 extends rrhu_3 {
   public rrhK_2() {
      super(aI_2.o, "turtle", 0.7F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      TB var4 = new TB(var3);
      var4.id_throws = (wt_3<rON>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wk_3)) {
         return null;
      } else {
         wt_3 var3 = (wt_3)var1;
         return var2.equals("body2") ? (Iq_1)rrxr_3.En.id_class(var3) : super.id_class(var1, var2);
      }
   }

   @Override
   public In_1 id_throws() {
      return new wt_3(0.0F);
   }

   @Override
   public String[] id_case() {
      String[] var1 = super.id_case();
      return (String[])rrbb_3.id_class((Object[])var1, (Object)"body2");
   }
}
