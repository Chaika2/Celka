package celestial;

public class rrOi_1 extends rrMi_1 {
   public rrOi_1() {
      super(aI_2.id_double, "magma_cube", 0.5F);
   }

   @Override
   public rrMa_1 id_class(In_1 var1, float var2) {
      pg_3 var3 = QY.id_instanceof().id_case();
      qQ_2 var4 = new qQ_2(var3);
      var4.id_throws = (ti_3<rEa_1>)var1;
      var4.id_byte = var2;
      return var4;
   }

   @Override
   public Iq_1 id_class(In_1 var1, String var2) {
      if (!(var1 instanceof ti_3 var3)) {
         return null;
      } else if (var2.equals("core")) {
         return (Iq_1)rrxr_3.id_class(var3, rrxr_3.sC);
      } else {
         String var4 = "segment";
         if (var2.startsWith(var4)) {
            Iq_1[] var5 = (Iq_1[])rrxr_3.id_class(var3, rrxr_3.sl);
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
      return new ti_3();
   }

   @Override
   public String[] id_case() {
      return new String[]{"core", "segment1", "segment2", "segment3", "segment4", "segment5", "segment6", "segment7", "segment8"};
   }
}
