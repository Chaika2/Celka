package celestial;

public class rrXr_1 extends rrMi_1 {
   public rrXr_1() {
      super(aI_2.i, "wither", 0.5F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      Th_1 var4 = new Th_1(var3);
      var4.id_throws = (wj_3<rSN>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof wj_3 var3)) {
         return null;
      } else {
         String var4 = "body";
         if (var2.startsWith(var4)) {
            Iq_1[] var9 = (Iq_1[])rrxr_3.id_class(var3, rrxr_3.Ew);
            if (var9 == null) {
               return null;
            } else {
               String var10 = var2.substring(var4.length());
               int var11 = rrbb_3.id_class(var10, -1);
               var11--;
               return var11 >= 0 && var11 < var9.length ? var9[var11] : null;
            }
         } else {
            String var5 = "head";
            if (var2.startsWith(var5)) {
               Iq_1[] var6 = (Iq_1[])rrxr_3.id_class(var3, rrxr_3.EI);
               if (var6 == null) {
                  return null;
               } else {
                  String var7 = var2.substring(var5.length());
                  int var8 = rrbb_3.id_class(var7, -1);
                  var8--;
                  return var8 >= 0 && var8 < var6.length ? var6[var8] : null;
               }
            } else {
               return null;
            }
         }
      }
   }

   @Override
   public In_1 id_throws() {
      return new wj_3(0.0F);
   }

   @Override
   public String[] id_case() {
      return new String[]{"body1", "body2", "body3", "head1", "head2", "head3"};
   }
}
