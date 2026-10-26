package celestial;

import fi.dy.masa.litematica.Litematica;
import fi.dy.masa.litematica.data.DataManager;
import java.io.File;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MQ {
   private static boolean[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;

   private static void id_byte() {
      id_class = new boolean[]{true, false, true, false, true, true, true, true, false, false, false, false, true, true, false, true, true, true, true};
   }

   public static rja_3 id_byte(int var0) {
      return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(var0).getOrigin();
   }

   static {
      ntfClinit();
   }

   public static rja_3 id_class(Mx_1 var0, int var1) {
      int var2 = id_byte(var1).b_();
      int var3 = id_byte(var1).c_();
      int var4 = id_byte(var1).d_();
      int var5 = var0.id_case().b_();
      int var6 = var0.id_case().c_();
      int var7 = var0.id_case().d_();
      int var8 = (var0.id_throws() - id_class[4]) * id_byte[0];
      int var9 = (var0.id_catch() - id_class[5]) * id_byte[1];
      rpa_3 var11 = id_class(var1);
      rqd_3 var12 = id_break(var1);

      return switch (((int[])MN.id_class[id_break[0]])[var11.ordinal()]) {
         case 1, 2 -> {
            switch ((var11.ordinal() * id_byte[2] + var12.ordinal()) % id_byte[3]) {
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
            switch (((int[])MN.id_class[id_break[1]])[var12.ordinal()]) {
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

   public static rpa_3 id_class(int var0) {
      return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(var0).getMirror();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2320463169991467613L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-82, 34, 42, 101, -97, 97, 71, -92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rja_3 id_class(rja_3 var0, int var1, int var2, rpa_3 var3) {
      int var4 = var0.b_();
      int var5 = var0.d_();
      if (var3 == rpa_3.LEFT_RIGHT) {
         var5 = var2 - var0.d_();
      } else if (var3 == rpa_3.FRONT_BACK) {
         var4 = var1 - var0.b_();
      }

      return new rja_3(var4, var0.c_(), var5);
   }

   public static rja_3 id_class(rja_3 var0, int var1, int var2) {
      return new rja_3(var1 - (var1 - var2) - var0.d_(), var0.c_(), var0.b_());
   }

   public static boolean id_class() {
      try {
         Class.forName(Litematica.class.getName());
         return id_class[0];
      } catch (NoClassDefFoundError | ClassNotFoundException var1) {
         return id_class[1];
      }
   }

   public static rqd_3 id_break(int var0) {
      return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(var0).getRotation();
   }

   public static Mx_1 id_break(Mx_1 var0, int var1) {
      Mx_1 var2 = var0.id_class(id_break(var1).ordinal() % id_byte[4] == id_class[6] ? id_class[7] : id_class[8]);

      for (int var3 = id_class[9]; var3 < var0.id_private(); var3++) {
         for (int var4 = id_class[10]; var4 < var0.id_catch(); var4++) {
            for (int var5 = id_class[11]; var5 < var0.id_throws(); var5++) {
               rja_3 var6 = new rja_3(var5, var3, var4);
               var6 = id_class(var6, var0.id_throws() - id_class[12], var0.id_catch() - id_class[13], id_class(var1));

               for (int var7 = id_class[14]; var7 < id_break(var1).ordinal(); var7++) {
                  if (var7 % id_byte[5] == 0) {
                     var6 = id_class(var6, var0.id_throws() - id_class[15], var0.id_catch() - id_class[16]);
                  } else {
                     var6 = id_class(var6, var0.id_catch() - id_class[17], var0.id_throws() - id_class[18]);
                  }
               }

               xc_3 var11 = var0.id_class(var5, var3, var4);

               try {
                  var11 = var11.id_class(id_class(var1)).id_class(id_break(var1));
               } catch (NullPointerException var9) {
               }

               var2.id_break(var6.b_(), var6.c_(), var6.d_(), var11);
            }
         }
      }

      return var2;
   }

   public static boolean id_break() {
      return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().size() > 0 ? id_class[2] : id_class[3];
   }

   private static void id_throws() {
      id_break = new short[]{1, 0};
   }

   public static File id_throws(int var0) {
      return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(var0).getSchematicFile();
   }

   private static int id_case(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -63147632;
   }

   public static String id_protected(int var0) {
      return DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(var0).getName();
   }

   private static void id_protected() {
      id_byte = new byte[]{-1, -1, 2, 4, 2, 2};
   }
}
