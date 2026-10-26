package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrqB_2 implements MinecraftAccessor {
   private static byte[] bytesf6ef226fb34a300d9c0c9540d4f17aea;
   private static short[] shortsf6ef226fb34a300d9c0c9540d4f17aea;
   public static Object[] staticFieldsf6ef226fb34a300d9c0c9540d4f17aea;
   public Object[] fieldsf6ef226fb34a300d9c0c9540d4f17aea;
   private static String[] stringsf6ef226fb34a300d9c0c9540d4f17aea;
   private static boolean[] booleansf6ef226fb34a300d9c0c9540d4f17aea;

   private static void id_byte() {
      stringsf6ef226fb34a300d9c0c9540d4f17aea = new String[]{
         new String(" "),
         new String("d."),
         new String("-"),
         new String("OWNER"),
         new String("owner"),
         new String("создатель"),
         new String("основатель"),
         new String("владелец"),
         new String("DEVELOPER"),
         new String("developer"),
         new String("разработчик"),
         new String("ADMIN"),
         new String("staff"),
         new String("admin"),
         new String("administrator"),
         new String("админ"),
         new String("администратор"),
         new String("з.адм"),
         new String("MODER"),
         new String("moder"),
         new String("moderator"),
         new String("модератор"),
         new String("YOUTUBE"),
         new String("yt"),
         new String("youtube"),
         new String("ютубер"),
         new String("HELPER"),
         new String("helper"),
         new String("хелпер"),
         new String("CURATOR"),
         new String("curator"),
         new String("куратор"),
         new String("AGENT"),
         new String("агент"),
         new String("SUPPORT"),
         new String("support"),
         new String("саппорт"),
         new String("поддержка"),
         new String("сотрудник"),
         new String("TRAINEE"),
         new String("trainee"),
         new String("стажёр"),
         new String("стажер"),
         new String("стᴀжᴇр"),
         new String("UNIQUE"),
         new String("unique")
      };
   }

   private rrqB_2(String... var3) {
      this.id_implements();
      this.fieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[1]] = var3;
   }

   static {
      ntfClinit();
   }

   public static rrqB_2 id_class(Aw_1 var0, String var1, String var2) {
      if (var1.equalsIgnoreCase(id_import.id_while().id_byte().toLowerCase())) {
         return null;
      } else {
         for (String var4 : ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[shortsf6ef226fb34a300d9c0c9540d4f17aea[2]]).id_byte()) {
            if (var1.equalsIgnoreCase(var4.toLowerCase())) {
               return (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[3]];
            }
         }

         String var19 = var2.toLowerCase();

         for (String var5 : ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[shortsf6ef226fb34a300d9c0c9540d4f17aea[4]]).id_byte()) {
            if (var19.contains(var5.toLowerCase())) {
               return (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[5]];
            }
         }

         String[] var21 = var19.split(stringsf6ef226fb34a300d9c0c9540d4f17aea[0]);
         if (var21.length < booleansf6ef226fb34a300d9c0c9540d4f17aea[0]) {
            return null;
         } else {
            rrqB_2[] var22 = (rrqB_2[])staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[6]];
            int var6 = var22.length;

            for (int var7 = booleansf6ef226fb34a300d9c0c9540d4f17aea[1]; var7 < var6; var7++) {
               rrqB_2 var8 = var22[var7];
               if (var8 != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[7]]) {
                  String[] var9 = var8.id_break();
                  int var10 = var9.length;

                  for (int var11 = booleansf6ef226fb34a300d9c0c9540d4f17aea[2]; var11 < var10; var11++) {
                     String var12 = var9[var11];
                     String[] var13 = var21;
                     int var14 = var21.length;

                     for (int var15 = booleansf6ef226fb34a300d9c0c9540d4f17aea[3]; var15 < var14; var15++) {
                        String var16 = var13[var15];
                        if (var16.contains(var12)
                           && (
                              var8 != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[8]]
                                 || !var16.startsWith(stringsf6ef226fb34a300d9c0c9540d4f17aea[1])
                           )) {
                           rnB_2 var17 = var0.id_implements();
                           if (var17 == null) {
                              return null;
                           }

                           String var18 = var17.id_class();
                           if (!var18.contains(stringsf6ef226fb34a300d9c0c9540d4f17aea[2])) {
                              return var8;
                           }
                        }
                     }
                  }
               }
            }

            return null;
         }
      }
   }

   public static int id_class(rrqB_2 var0) {
      return var0.ordinal();
   }

   public boolean id_class() {
      return this != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[9]]
            && this != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[10]]
            && this != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[11]]
            && this != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[12]]
            && this != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[13]]
            && this != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[14]]
         ? booleansf6ef226fb34a300d9c0c9540d4f17aea[5]
         : booleansf6ef226fb34a300d9c0c9540d4f17aea[4];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1124488866;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4703764257869630041L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-111, 37, 86, 64, 14, -25, 52, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String[] id_break() {
      return (String[])this.fieldsf6ef226fb34a300d9c0c9540d4f17aea[shortsf6ef226fb34a300d9c0c9540d4f17aea[15]];
   }

   private static void id_throws() {
      shortsf6ef226fb34a300d9c0c9540d4f17aea = new short[]{12, 0, 0, 10, 0, 10, 11, 10, 5, 0, 1, 2, 3, 6, 10, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   }

   private static void id_catch() {
      booleansf6ef226fb34a300d9c0c9540d4f17aea = new boolean[]{
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true
      };
   }

   private static void id_case() {
      Object[] var0 = new Object[13];
      String var10004 = stringsf6ef226fb34a300d9c0c9540d4f17aea[3];
      String[] var2 = new String[]{
         stringsf6ef226fb34a300d9c0c9540d4f17aea[4],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[5],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[6],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[7]
      };
      var0[0] = new rrqB_2(var2);
      var10004 = stringsf6ef226fb34a300d9c0c9540d4f17aea[8];
      String[] var3 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[9], stringsf6ef226fb34a300d9c0c9540d4f17aea[10]};
      var0[1] = new rrqB_2(var3);
      var10004 = stringsf6ef226fb34a300d9c0c9540d4f17aea[11];
      String[] var4 = new String[]{
         stringsf6ef226fb34a300d9c0c9540d4f17aea[12],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[13],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[14],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[15],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[16],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[17]
      };
      var0[2] = new rrqB_2(var4);
      var10004 = stringsf6ef226fb34a300d9c0c9540d4f17aea[18];
      String[] var5 = new String[]{
         stringsf6ef226fb34a300d9c0c9540d4f17aea[19], stringsf6ef226fb34a300d9c0c9540d4f17aea[20], stringsf6ef226fb34a300d9c0c9540d4f17aea[21]
      };
      var0[3] = new rrqB_2(var5);
      var10004 = stringsf6ef226fb34a300d9c0c9540d4f17aea[22];
      String[] var6 = new String[]{
         stringsf6ef226fb34a300d9c0c9540d4f17aea[23], stringsf6ef226fb34a300d9c0c9540d4f17aea[24], stringsf6ef226fb34a300d9c0c9540d4f17aea[25]
      };
      var0[4] = new rrqB_2(var6);
      var10004 = stringsf6ef226fb34a300d9c0c9540d4f17aea[26];
      String[] var7 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[27], stringsf6ef226fb34a300d9c0c9540d4f17aea[28]};
      var0[5] = new rrqB_2(var7);
      var10004 = stringsf6ef226fb34a300d9c0c9540d4f17aea[29];
      String[] var8 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[30], stringsf6ef226fb34a300d9c0c9540d4f17aea[31]};
      var0[6] = new rrqB_2(var8);
      var10004 = stringsf6ef226fb34a300d9c0c9540d4f17aea[32];
      String[] var9 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[33]};
      var0[7] = new rrqB_2(var9);
      var10004 = stringsf6ef226fb34a300d9c0c9540d4f17aea[34];
      String[] var10 = new String[]{
         stringsf6ef226fb34a300d9c0c9540d4f17aea[35],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[36],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[37],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[38]
      };
      var0[8] = new rrqB_2(var10);
      var10004 = stringsf6ef226fb34a300d9c0c9540d4f17aea[39];
      String[] var11 = new String[]{
         stringsf6ef226fb34a300d9c0c9540d4f17aea[40],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[41],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[42],
         stringsf6ef226fb34a300d9c0c9540d4f17aea[43]
      };
      var0[9] = new rrqB_2(var11);
      var10004 = stringsf6ef226fb34a300d9c0c9540d4f17aea[44];
      String[] var12 = new String[]{stringsf6ef226fb34a300d9c0c9540d4f17aea[45]};
      var0[10] = new rrqB_2(var12);
      var0[11] = new rrqB_2[]{
         (rrqB_2)var0[0],
         (rrqB_2)var0[1],
         (rrqB_2)var0[2],
         (rrqB_2)var0[3],
         (rrqB_2)var0[4],
         (rrqB_2)var0[5],
         (rrqB_2)var0[6],
         (rrqB_2)var0[7],
         (rrqB_2)var0[8],
         (rrqB_2)var0[9],
         (rrqB_2)var0[10]
      };
      var0[12] = new rrqB_2[]{
         (rrqB_2)var0[0],
         (rrqB_2)var0[1],
         (rrqB_2)var0[2],
         (rrqB_2)var0[3],
         (rrqB_2)var0[4],
         (rrqB_2)var0[5],
         (rrqB_2)var0[6],
         (rrqB_2)var0[7],
         (rrqB_2)var0[8],
         (rrqB_2)var0[9],
         (rrqB_2)var0[10]
      };
      staticFieldsf6ef226fb34a300d9c0c9540d4f17aea = var0;
   }

   private void id_implements() {
      if (this.fieldsf6ef226fb34a300d9c0c9540d4f17aea == null) {
         this.fieldsf6ef226fb34a300d9c0c9540d4f17aea = new Object[1];
      }
   }

   private static void id_private() {
      bytesf6ef226fb34a300d9c0c9540d4f17aea = new byte[]{
         11,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         4,
         2,
         3,
         2,
         2,
         6,
         2,
         3,
         4,
         5,
         2,
         3,
         3,
         2,
         3,
         4,
         3,
         2,
         4,
         5,
         2,
         5,
         6,
         2,
         6,
         7,
         7,
         8,
         4,
         2,
         3,
         8,
         9,
         4,
         2,
         3,
         9,
         10,
         10,
         12,
         11,
         13
      };
   }
}
