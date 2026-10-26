package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrNX {
   public Object[] fields24872387b8fc307e802ef34c708a7fa8;
   private static short[] shorts24872387b8fc307e802ef34c708a7fa8;
   private static String[] strings24872387b8fc307e802ef34c708a7fa8;
   public static Object[] staticFields24872387b8fc307e802ef34c708a7fa8;
   private static boolean[] booleans24872387b8fc307e802ef34c708a7fa8;
   private static byte[] bytes24872387b8fc307e802ef34c708a7fa8;

   private static void id_byte() {
      shorts24872387b8fc307e802ef34c708a7fa8 = new short[]{15, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
   }

   private rrNX(String var3) {
      this.id_case();
      this.fields24872387b8fc307e802ef34c708a7fa8[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-125, -43, -99, -52, 9, 82, 60, -102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_class() {
      return (String)this.fields24872387b8fc307e802ef34c708a7fa8[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8395297185493172526L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1160835528;
   }

   private static void id_throws() {
      strings24872387b8fc307e802ef34c708a7fa8 = new String[]{
         new String("WEAPON"),
         new String("Оружие"),
         new String("ARMOR"),
         new String("Броня"),
         new String("ELYTRA"),
         new String("Элитры"),
         new String("TOOL"),
         new String("Инструменты"),
         new String("TALISMAN"),
         new String("Талисманы"),
         new String("SPHERE"),
         new String("Сферы"),
         new String("SPAWN_EGGS"),
         new String("Яйца призыва"),
         new String("BOOK"),
         new String("Книги"),
         new String("ARROW"),
         new String("Стрелы"),
         new String("POTION"),
         new String("Зелья"),
         new String("LOCKPICK"),
         new String("Отмычки"),
         new String("SIGNAL_FIRE"),
         new String("Мисты"),
         new String("TRAP_SKINS"),
         new String("Скины на трапку"),
         new String("CHUNK_LOADERS"),
         new String("Прогрузчики чанков"),
         new String("OTHER"),
         new String("Другое")
      };
   }

   private static void id_catch() {
      bytes24872387b8fc307e802ef34c708a7fa8 = new byte[]{
         15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 16
      };
   }

   private void id_case() {
      if (this.fields24872387b8fc307e802ef34c708a7fa8 == null) {
         this.fields24872387b8fc307e802ef34c708a7fa8 = new Object[1];
         Object[] var1 = this.fields24872387b8fc307e802ef34c708a7fa8;
      }
   }

   private static void id_protected() {
      booleans24872387b8fc307e802ef34c708a7fa8 = new boolean[]{false, true, false, false, true, true, true};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{
         new rrNX("Оружие"),
         new rrNX("Броня"),
         new rrNX("Элитры"),
         new rrNX("Инструменты"),
         new rrNX("Талисманы"),
         new rrNX("Сферы"),
         new rrNX("Яйца призыва"),
         new rrNX("Книги"),
         new rrNX("Стрелы"),
         new rrNX("Зелья"),
         new rrNX("Отмычки"),
         new rrNX("Мисты"),
         new rrNX("Скины на трапку"),
         new rrNX("Прогрузчики чанков"),
         new rrNX("Другое"),
         null
      };
      var0[15] = new rrNX[]{
         (rrNX)var0[0],
         (rrNX)var0[1],
         (rrNX)var0[2],
         (rrNX)var0[3],
         (rrNX)var0[4],
         (rrNX)var0[5],
         (rrNX)var0[6],
         (rrNX)var0[7],
         (rrNX)var0[8],
         (rrNX)var0[9],
         (rrNX)var0[10],
         (rrNX)var0[11],
         (rrNX)var0[12],
         (rrNX)var0[13],
         (rrNX)var0[14]
      };
      staticFields24872387b8fc307e802ef34c708a7fa8 = var0;
   }
}
