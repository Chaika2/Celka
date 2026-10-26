package celestial;

public class rrxh_3 {
   public static final int id_class = 0;
   public static final int id_break = 1;
   public static final int id_byte = 2;
   public static final int id_protected = 3;
   public static final int id_throws = 4;
   public static final int id_case = 5;
   public static final int id_catch = 6;
   public static final int id_private = 7;
   public static final int id_implements = 8;
   public static final int id_finally = 1;

   public static void id_class(float var0) {
      MT.id_protected();
      MT.id_package();
      MT.id_break(770, 1);
      MT.id_protected(1.0F, 1.0F, 1.0F, var0);
   }

   public static void id_class(int var0, float var1) {
      switch (var0) {
         case 0:
            MT.id_protected();
            MT.id_package();
            MT.id_break(770, 771);
            MT.id_protected(1.0F, 1.0F, 1.0F, var1);
            break;
         case 1:
            MT.id_protected();
            MT.id_package();
            MT.id_break(770, 1);
            MT.id_protected(1.0F, 1.0F, 1.0F, var1);
            break;
         case 2:
            MT.id_protected();
            MT.id_package();
            MT.id_break(775, 0);
            MT.id_protected(var1, var1, var1, 1.0F);
            break;
         case 3:
            MT.id_protected();
            MT.id_package();
            MT.id_break(774, 771);
            MT.id_protected(var1, var1, var1, var1);
            break;
         case 4:
            MT.id_protected();
            MT.id_package();
            MT.id_break(1, 1);
            MT.id_protected(var1, var1, var1, 1.0F);
            break;
         case 5:
            MT.id_protected();
            MT.id_package();
            MT.id_break(0, 769);
            MT.id_protected(var1, var1, var1, 1.0F);
            break;
         case 6:
            MT.id_protected();
            MT.id_package();
            MT.id_break(1, 769);
            MT.id_protected(var1, var1, var1, 1.0F);
            break;
         case 7:
            MT.id_protected();
            MT.id_package();
            MT.id_break(774, 768);
            MT.id_protected(var1, var1, var1, 1.0F);
            break;
         case 8:
            MT.id_throws();
            MT.id_final();
            MT.id_protected(1.0F, 1.0F, 1.0F, var1);
      }

      MT.id_import();
   }

   public static int id_class(String var0) {
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
            rrbb_3.id_protected("Unknown blend: " + var0);
            return 1;
         }
      }
   }
}
