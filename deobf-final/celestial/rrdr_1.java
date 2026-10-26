package celestial;

public interface rrdr_1 {
   static rrdr_1 byte_() {
      if (!rrbb_3.rs()) {
         return null;
      } else {
         String var0 = rrMW.class_("optifine/texture.properties", "format");
         if (var0 != null) {
            String[] var1 = rrbb_3.class_(var0, "/");
            String var2 = var1[0];
            String var3 = var1.length > 1 ? var1[1] : null;
            if (var2.equals("lab-pbr")) {
               return new rrdH(var3);
            } else {
               rrbb_3.protected_("Unknown texture format: " + var0);
               return null;
            }
         } else {
            return null;
         }
      }
   }

   rrko_1 class_(rrdn_1 var1);

   String class_();

   String break_();

   boolean break_(rrdn_1 var1);
}
