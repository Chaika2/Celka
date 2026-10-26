package celestial;

public class rrxh_3 {
   public static final int class_ = 0;
   public static final int break_ = 1;
   public static final int byte_ = 2;
   public static final int protected_ = 3;
   public static final int throws_ = 4;
   public static final int case_ = 5;
   public static final int catch_ = 6;
   public static final int private_ = 7;
   public static final int implements_ = 8;
   public static final int finally_ = 1;

   public static void class_(float var0) {
      MT.protected_();
      MT.package_();
      MT.break_(770, 1);
      MT.protected_(1.0F, 1.0F, 1.0F, var0);
   }

   public static void class_(int var0, float var1) {
      switch (var0) {
         case 0:
            MT.protected_();
            MT.package_();
            MT.break_(770, 771);
            MT.protected_(1.0F, 1.0F, 1.0F, var1);
            break;
         case 1:
            MT.protected_();
            MT.package_();
            MT.break_(770, 1);
            MT.protected_(1.0F, 1.0F, 1.0F, var1);
            break;
         case 2:
            MT.protected_();
            MT.package_();
            MT.break_(775, 0);
            MT.protected_(var1, var1, var1, 1.0F);
            break;
         case 3:
            MT.protected_();
            MT.package_();
            MT.break_(774, 771);
            MT.protected_(var1, var1, var1, var1);
            break;
         case 4:
            MT.protected_();
            MT.package_();
            MT.break_(1, 1);
            MT.protected_(var1, var1, var1, 1.0F);
            break;
         case 5:
            MT.protected_();
            MT.package_();
            MT.break_(0, 769);
            MT.protected_(var1, var1, var1, 1.0F);
            break;
         case 6:
            MT.protected_();
            MT.package_();
            MT.break_(1, 769);
            MT.protected_(var1, var1, var1, 1.0F);
            break;
         case 7:
            MT.protected_();
            MT.package_();
            MT.break_(774, 768);
            MT.protected_(var1, var1, var1, 1.0F);
            break;
         case 8:
            MT.throws_();
            MT.final_();
            MT.protected_(1.0F, 1.0F, 1.0F, var1);
      }

      MT.import_();
   }

   public static int class_(String var0) {
      if (var0 == null) {
         return 1;
      } else {
         var0 = var0.toLowerCase().trim();
         if (var0.equals("alpha")) {
            return 0;
         } else if (var0.equals("add")) {
            return 1;
         } else if (var0.equals("subtract")) {
            return 2;
         } else if (var0.equals("multiply")) {
            return 3;
         } else if (var0.equals("dodge")) {
            return 4;
         } else if (var0.equals("burn")) {
            return 5;
         } else if (var0.equals("screen")) {
            return 6;
         } else if (var0.equals("overlay")) {
            return 7;
         } else if (var0.equals("replace")) {
            return 8;
         } else {
            rrbb_3.protected_("Unknown blend: " + var0);
            return 1;
         }
      }
   }
}
