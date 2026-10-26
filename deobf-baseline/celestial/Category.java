package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Category {
   private static short[] shortse67813cd60183787b1de54ac6b91c916;
   private static boolean[] booleanse67813cd60183787b1de54ac6b91c916;
   private static byte[] bytese67813cd60183787b1de54ac6b91c916;
   public static Object[] staticFieldse67813cd60183787b1de54ac6b91c916;
   private static String[] stringse67813cd60183787b1de54ac6b91c916;
   public Object[] fieldse67813cd60183787b1de54ac6b91c916;

   public rqO_2 id_byte() {
      return (rqO_2)this.fieldse67813cd60183787b1de54ac6b91c916[shortse67813cd60183787b1de54ac6b91c916[8]];
   }

   private Category(String var3, String var4, String var5) {
      this.id_finally();
      this.fieldse67813cd60183787b1de54ac6b91c916[shortse67813cd60183787b1de54ac6b91c916[1]] = var3;
      this.fieldse67813cd60183787b1de54ac6b91c916[shortse67813cd60183787b1de54ac6b91c916[2]] = var4;
      this.fieldse67813cd60183787b1de54ac6b91c916[shortse67813cd60183787b1de54ac6b91c916[3]] = var5;
      rqO_2 var13 = new rqO_2("celestial/images/category/" + var4 + ".png");
      this.fieldse67813cd60183787b1de54ac6b91c916[shortse67813cd60183787b1de54ac6b91c916[4]] = var13;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3600156721038959069L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1983107440;
   }

   public String id_class() {
      return (String)this.fieldse67813cd60183787b1de54ac6b91c916[shortse67813cd60183787b1de54ac6b91c916[7]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, 51, 43, -26, 119, 76, 80, 1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_break() {
      return (String)this.fieldse67813cd60183787b1de54ac6b91c916[shortse67813cd60183787b1de54ac6b91c916[6]];
   }

   private static void id_throws() {
      booleanse67813cd60183787b1de54ac6b91c916 = new boolean[]{false, true, false, false, true, true};
   }

   private void id_finally() {
      if (this.fieldse67813cd60183787b1de54ac6b91c916 == null) {
         this.fieldse67813cd60183787b1de54ac6b91c916 = new Object[bytese67813cd60183787b1de54ac6b91c916[23]];
         Object[] var1 = this.fieldse67813cd60183787b1de54ac6b91c916;
      }
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{
         new Category(stringse67813cd60183787b1de54ac6b91c916[1], stringse67813cd60183787b1de54ac6b91c916[2], stringse67813cd60183787b1de54ac6b91c916[3]),
         new Category(stringse67813cd60183787b1de54ac6b91c916[5], stringse67813cd60183787b1de54ac6b91c916[6], stringse67813cd60183787b1de54ac6b91c916[7]),
         new Category(stringse67813cd60183787b1de54ac6b91c916[9], stringse67813cd60183787b1de54ac6b91c916[10], stringse67813cd60183787b1de54ac6b91c916[11]),
         new Category(stringse67813cd60183787b1de54ac6b91c916[13], stringse67813cd60183787b1de54ac6b91c916[14], stringse67813cd60183787b1de54ac6b91c916[15]),
         new Category(stringse67813cd60183787b1de54ac6b91c916[17], stringse67813cd60183787b1de54ac6b91c916[18], stringse67813cd60183787b1de54ac6b91c916[19]),
         new Category(stringse67813cd60183787b1de54ac6b91c916[21], stringse67813cd60183787b1de54ac6b91c916[22], stringse67813cd60183787b1de54ac6b91c916[23]),
         new Category(stringse67813cd60183787b1de54ac6b91c916[25], stringse67813cd60183787b1de54ac6b91c916[26], stringse67813cd60183787b1de54ac6b91c916[27]),
         new Category(stringse67813cd60183787b1de54ac6b91c916[29], stringse67813cd60183787b1de54ac6b91c916[30], stringse67813cd60183787b1de54ac6b91c916[31]),
         new Category(stringse67813cd60183787b1de54ac6b91c916[33], stringse67813cd60183787b1de54ac6b91c916[34], stringse67813cd60183787b1de54ac6b91c916[35]),
         null
      };
      var0[9] = new Category[]{
         (Category)var0[0],
         (Category)var0[1],
         (Category)var0[2],
         (Category)var0[3],
         (Category)var0[4],
         (Category)var0[5],
         (Category)var0[6],
         (Category)var0[7],
         (Category)var0[8]
      };
      staticFieldse67813cd60183787b1de54ac6b91c916 = var0;
   }

   private static void id_extends() {
      bytese67813cd60183787b1de54ac6b91c916 = new byte[]{9, 2, 3, 4, 5, 6, 7, 8, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 4, 10};
   }

   private static void id_case() {
      shortse67813cd60183787b1de54ac6b91c916 = new short[]{9, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 4, 5, 6, 7, 8};
   }

   private static void id_implements() {
      stringse67813cd60183787b1de54ac6b91c916 = new String[]{
         new String("COMBAT"),
         new String("Combat"),
         new String("combat"),
         new String("Основные"),
         new String("MOVEMENT"),
         new String("Movement"),
         new String("movement"),
         new String("Основные"),
         new String("RENDER"),
         new String("Render"),
         new String("render"),
         new String("Основные"),
         new String("PLAYER"),
         new String("Player"),
         new String("player"),
         new String("Основные"),
         new String("UTIL"),
         new String("Util"),
         new String("util"),
         new String("Основные"),
         new String("CONFIGS"),
         new String("Configs"),
         new String("configs"),
         new String("Другие"),
         new String("THEMES"),
         new String("Themes"),
         new String("themes"),
         new String("Другие"),
         new String("AUTOBUY_ITEMS"),
         new String("Items"),
         new String("autobuy_items"),
         new String("Авто. покупка"),
         new String("AUTOBUY_HISTORY"),
         new String("History"),
         new String("autobuy_history"),
         new String("Авто. покупка")
      };
   }

   public String id_protected() {
      return (String)this.fieldse67813cd60183787b1de54ac6b91c916[shortse67813cd60183787b1de54ac6b91c916[5]];
   }
}
