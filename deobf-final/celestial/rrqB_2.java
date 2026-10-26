package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrqB_2 implements MinecraftAccessor {
   ;
   private static byte[] bytesf6ef226fb34a300d9c0c9540d4f17aea;
   private static short[] shortsf6ef226fb34a300d9c0c9540d4f17aea;
   public static Object[] staticFieldsf6ef226fb34a300d9c0c9540d4f17aea;
   public Object[] fieldsf6ef226fb34a300d9c0c9540d4f17aea;
   private static String[] stringsf6ef226fb34a300d9c0c9540d4f17aea;
   private static boolean[] booleansf6ef226fb34a300d9c0c9540d4f17aea;

   private static void byte_() {
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
      this.implements_();
      this.fieldsf6ef226fb34a300d9c0c9540d4f17aea[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static rrqB_2 class_(Aw_1 var0, String var1, String var2) {
      if (var1.equalsIgnoreCase(import_.while_().byte_().toLowerCase())) {
         return null;
      } else {
         for (String var4 : ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).byte_()) {
            if (var1.equalsIgnoreCase(var4.toLowerCase())) {
               return (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10];
            }
         }

         String var19 = var2.toLowerCase();

         for (String var5 : ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).byte_()) {
            if (var19.contains(var5.toLowerCase())) {
               return (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10];
            }
         }

         String[] var21 = var19.split(" ");
         if (var21.length < 1) {
            return null;
         } else {
            for (rrqB_2 var8 : (rrqB_2[])staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[11]) {
               if (var8 != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10]) {
                  for (String var12 : var8.break_()) {
                     for (String var16 : var21) {
                        if (var16.contains(var12) && (var8 != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[5] || !var16.startsWith("d."))) {
                           rnB_2 var17 = var0.implements_();
                           if (var17 == null) {
                              return null;
                           }

                           String var18 = var17.class_();
                           if (!var18.contains("-")) {
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

   public static int class_(rrqB_2 var0) {
      return var0.ordinal();
   }

   public boolean class_() {
      return this != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[0]
            && this != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[1]
            && this != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[2]
            && this != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[3]
            && this != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[6]
            && this != (rrqB_2)staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10]
         ? booleansf6ef226fb34a300d9c0c9540d4f17aea[5]
         : booleansf6ef226fb34a300d9c0c9540d4f17aea[4];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1124488866;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4703764257869630041L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-111, 37, 86, 64, 14, -25, 52, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String[] break_() {
      return (String[])this.fieldsf6ef226fb34a300d9c0c9540d4f17aea[0];
   }

   private static void throws_() {
      shortsf6ef226fb34a300d9c0c9540d4f17aea = new short[]{12, 0, 0, 10, 0, 10, 11, 10, 5, 0, 1, 2, 3, 6, 10, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   }

   private static void catch_() {
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

   private static void case_() {
      Object[] var0 = new Object[13];
      String[] var2 = new String[]{"owner", "создатель", "основатель", "владелец"};
      var0[0] = new rrqB_2(var2);
      String[] var3 = new String[]{"developer", "разработчик"};
      var0[1] = new rrqB_2(var3);
      String[] var4 = new String[]{"staff", "admin", "administrator", "админ", "администратор", "з.адм"};
      var0[2] = new rrqB_2(var4);
      String[] var5 = new String[]{"moder", "moderator", "модератор"};
      var0[3] = new rrqB_2(var5);
      String[] var6 = new String[]{"yt", "youtube", "ютубер"};
      var0[4] = new rrqB_2(var6);
      String[] var7 = new String[]{"helper", "хелпер"};
      var0[5] = new rrqB_2(var7);
      String[] var8 = new String[]{"curator", "куратор"};
      var0[6] = new rrqB_2(var8);
      String[] var9 = new String[]{"агент"};
      var0[7] = new rrqB_2(var9);
      String[] var10 = new String[]{"support", "саппорт", "поддержка", "сотрудник"};
      var0[8] = new rrqB_2(var10);
      String[] var11 = new String[]{"trainee", "стажёр", "стажер", "стᴀжᴇр"};
      var0[9] = new rrqB_2(var11);
      String[] var12 = new String[]{"unique"};
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

   private void implements_() {
      if (this.fieldsf6ef226fb34a300d9c0c9540d4f17aea == null) {
         this.fieldsf6ef226fb34a300d9c0c9540d4f17aea = new Object[1];
      }
   }

   private static void private_() {
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
