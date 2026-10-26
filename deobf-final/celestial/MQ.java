package celestial;

import fi.dy.masa.litematica.Litematica;
import fi.dy.masa.litematica.data.DataManager;
import java.io.File;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MQ {
   private static boolean[] class_;
   private static short[] break_;
   private static byte[] byte_;

   private static void byte_() {
      class_ = new boolean[]{true, false, true, false, true, true, true, true, false, false, false, false, true, true, false, true, true, true, true};
   }

   public static rja_3 byte_(int var0) {
      return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(var0).getOrigin();
   }

   static {
      ntfClinit();
   }

   public static rja_3 class_(Mx_1 var0, int var1) {
      int var2 = byte_(var1).b_();
      int var3 = byte_(var1).c_();
      int var4 = byte_(var1).d_();
      int var5 = var0.case_().b_();
      int var6 = var0.case_().c_();
      int var7 = var0.case_().d_();
      int var8 = (var0.throws_() - 1) * -1;
      int var9 = (var0.catch_() - 1) * -1;
      rpa_3 var11 = class_(var1);
      rqd_3 var12 = break_(var1);

      return switch (((int[])MN.class_[1])[var11.ordinal()]) {
         case 1, 2 -> {
            switch ((var11.ordinal() * 2 + var12.ordinal()) % 4) {
               case 1:
                  yield new rja_3(var2 + (var9 - var7), var3 + var6, var4 + (var8 - var5));
               case 2:
                  yield new rja_3(var2 + var5, var3 + var6, var4 + (var9 - var7));
               case 3:
                  yield new rja_3(var2 + var7, var3 + var6, var4 + var5);
               default:
                  yield new rja_3(var2 + (var8 - var5), var3 + var6, var4 + var7);
            }
         }
         default -> {
            switch (((int[])MN.class_[0])[var12.ordinal()]) {
               case 1:
                  yield new rja_3(var2 + (var9 - var7), var3 + var6, var4 + var5);
                  break;
               case 2:
                  yield new rja_3(var2 + (var8 - var5), var3 + var6, var4 + (var9 - var7));
                  break;
               case 3:
                  yield new rja_3(var2 + var7, var3 + var6, var4 + (var8 - var5));
                  break;
               default:
                  yield new rja_3(var2 + var5, var3 + var6, var4 + var7);
            }
         }
      };
   }

   public static rpa_3 class_(int var0) {
      return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(var0).getMirror();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2320463169991467613L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-82, 34, 42, 101, -97, 97, 71, -92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rja_3 class_(rja_3 var0, int var1, int var2, rpa_3 var3) {
      int var4 = var0.b_();
      int var5 = var0.d_();
      if (var3 == rpa_3.LEFT_RIGHT) {
         var5 = var2 - var0.d_();
      } else if (var3 == rpa_3.FRONT_BACK) {
         var4 = var1 - var0.b_();
      }

      return new rja_3(var4, var0.c_(), var5);
   }

   public static rja_3 class_(rja_3 var0, int var1, int var2) {
      return new rja_3(var1 - (var1 - var2) - var0.d_(), var0.c_(), var0.b_());
   }

   public static boolean class_() {
      try {
         Class.forName(Litematica.class.getName());
         return class_[0];
      } catch (NoClassDefFoundError | ClassNotFoundException var1) {
         return false;
      }
   }

   public static rqd_3 break_(int var0) {
      return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(var0).getRotation();
   }

   public static Mx_1 break_(Mx_1 var0, int var1) {
      Mx_1 var2 = var0.class_(break_(var1).ordinal() % 2 == 1 ? true : class_[8]);

      for (int var3 = 0; var3 < var0.private_(); var3++) {
         for (int var4 = 0; var4 < var0.catch_(); var4++) {
            for (int var5 = 0; var5 < var0.throws_(); var5++) {
               rja_3 var6 = new rja_3(var5, var3, var4);
               var6 = class_(var6, var0.throws_() - 1, var0.catch_() - 1, class_(var1));

               for (int var7 = 0; var7 < break_(var1).ordinal(); var7++) {
                  if (var7 % 2 == 0) {
                     var6 = class_(var6, var0.throws_() - 1, var0.catch_() - 1);
                  } else {
                     var6 = class_(var6, var0.catch_() - 1, var0.throws_() - 1);
                  }
               }

               xc_3 var11 = var0.class_(var5, var3, var4);

               try {
                  var11 = var11.class_(class_(var1)).class_(break_(var1));
               } catch (NullPointerException var9) {
               }

               var2.break_(var6.b_(), var6.c_(), var6.d_(), var11);
            }
         }
      }

      return var2;
   }

   public static boolean break_() {
      return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().size() > 0 ? true : class_[3];
   }

   private static void throws_() {
      break_ = new short[]{1, 0};
   }

   public static File throws_(int var0) {
      return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(var0).getSchematicFile();
   }

   private static int case_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -63147632;
   }

   public static String protected_(int var0) {
      return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(var0).getName();
   }

   private static void protected_() {
      byte_ = new byte[]{-1, -1, 2, 4, 2, 2};
   }
}
