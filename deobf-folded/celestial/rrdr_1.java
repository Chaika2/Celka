package celestial;

public interface rrdr_1 {
   static rrdr_1 id_byte() {
      if (!rrbb_3.rs()) {
         return null;
      } else {
         String var0 = rrMW.id_class("optifine/texture.properties", "format");
         if (var0 != null) {
            String[] var1 = rrbb_3.id_class(var0, "/");
            String var2 = var1[0];
            String var3 = var1.length > 1 ? var1[1] : null;
            if (var2.equals("lab-pbr")) {
               return new rrdH(var3);
            } else {
               rrbb_3.id_protected("Unknown texture format: " + var0);
               return null;
            }
         } else {
            return null;
         }
      }
   }

   rrko_1 id_class(rrdn_1 var1);

   String id_class();

   String id_break();

   boolean id_break(rrdn_1 var1);
}
