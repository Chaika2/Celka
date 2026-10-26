package celestial;

public class rrOn_1 extends rrMi_1 {
   public rrOn_1() {
      super(aI_2.id_synchronized, "endermite", 0.3F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      pj_3 var4 = new pj_3(var3);
      var4.id_throws = (ty_3<rEL>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof ty_3 var3)) {
         return null;
      } else {
         String var4 = "body";
         if (var2.startsWith(var4)) {
            Iq_1[] var5 = (Iq_1[])rrxr_3.id_class(var3, rrxr_3.Se);
            if (var5 == null) {
               return null;
            } else {
               String var6 = var2.substring(var4.length());
               int var7 = rrbb_3.id_class(var6, -1);
               var7--;
               return var7 >= 0 && var7 < var5.length ? var5[var7] : null;
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public In_1 id_throws() {
      return new ty_3();
   }

   @Override
   public String[] id_case() {
      return new String[]{"body1", "body2", "body3", "body4"};
   }
}
