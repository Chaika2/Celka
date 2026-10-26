package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrIA {
   private static String[] stringse25fceafd9d23d67b8a30b04e4e147ad;
   private static byte[] bytese25fceafd9d23d67b8a30b04e4e147ad;
   public Object[] fieldse25fceafd9d23d67b8a30b04e4e147ad;
   private static boolean[] booleanse25fceafd9d23d67b8a30b04e4e147ad;
   private static short[] shortse25fceafd9d23d67b8a30b04e4e147ad;
   public static Object[] staticFieldse25fceafd9d23d67b8a30b04e4e147ad;

   private rrIA(String var3, boolean var4) {
      this.id_protected();
      this.fieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[1]] = var3;
      Boolean var10 = var4;
      this.fieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[2]] = var10;
   }

   static {
      ntfClinit();
   }

   public String id_class() {
      return (String)this.fieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[3]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8662682207457841835L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1580245402;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-52, 99, 31, 36, 102, 99, 119, -34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_break() {
      return (Boolean)this.fieldse25fceafd9d23d67b8a30b04e4e147ad[shortse25fceafd9d23d67b8a30b04e4e147ad[4]];
   }

   private static void id_throws() {
      bytese25fceafd9d23d67b8a30b04e4e147ad = new byte[]{9, 2, 3, 4, 5, 6, 7, 8, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 2, 10};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{
         new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[1], true),
         new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[3], false),
         new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[5], false),
         new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[7], false),
         new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[9], false),
         new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[11], true),
         new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[13], true),
         new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[15], false),
         new rrIA(stringse25fceafd9d23d67b8a30b04e4e147ad[17], false),
         null
      };
      var0[9] = new rrIA[]{
         (rrIA)var0[0], (rrIA)var0[1], (rrIA)var0[2], (rrIA)var0[3], (rrIA)var0[4], (rrIA)var0[5], (rrIA)var0[6], (rrIA)var0[7], (rrIA)var0[8]
      };
      staticFieldse25fceafd9d23d67b8a30b04e4e147ad = var0;
   }

   private static void id_case() {
      stringse25fceafd9d23d67b8a30b04e4e147ad = new String[]{
         new String("PLAYERS"),
         new String("Игроки"),
         new String("NAKED_PLAYERS"),
         new String("Голые игроки"),
         new String("FRIENDS"),
         new String("Друзья"),
         new String("MONSTERS"),
         new String("Монстры"),
         new String("ANIMALS"),
         new String("Животные"),
         new String("INVISIBLES"),
         new String("Невидимые"),
         new String("ITEMS"),
         new String("Предметы"),
         new String("BOTS"),
         new String("Боты"),
         new String("ENDER_PEARLS"),
         new String("Эндер-пёрлы")
      };
   }

   private static void id_implements() {
      shortse25fceafd9d23d67b8a30b04e4e147ad = new short[]{9, 0, 1, 0, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
   }

   private void id_protected() {
      if (this.fieldse25fceafd9d23d67b8a30b04e4e147ad == null) {
         this.fieldse25fceafd9d23d67b8a30b04e4e147ad = new Object[bytese25fceafd9d23d67b8a30b04e4e147ad[23]];
         Object[] var1 = this.fieldse25fceafd9d23d67b8a30b04e4e147ad;
         var1[booleanse25fceafd9d23d67b8a30b04e4e147ad[15]] = booleanse25fceafd9d23d67b8a30b04e4e147ad[16];
      }
   }

   private static void id_private() {
      booleanse25fceafd9d23d67b8a30b04e4e147ad = new boolean[]{
         false, true, false, true, false, true, false, true, false, false, false, true, true, false, false, true, false
      };
   }
}
