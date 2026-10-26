package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum ThemeType {
   private static boolean[] booleans5969a4913d2033e8a6ff59f1ab73faf8;
   public Object[] fields5969a4913d2033e8a6ff59f1ab73faf8;
   public static Object[] staticFields5969a4913d2033e8a6ff59f1ab73faf8;
   private static byte[] bytes5969a4913d2033e8a6ff59f1ab73faf8;
   private static String[] strings5969a4913d2033e8a6ff59f1ab73faf8;
   private static short[] shorts5969a4913d2033e8a6ff59f1ab73faf8;

   private static void id_byte() {
      shorts5969a4913d2033e8a6ff59f1ab73faf8 = new short[]{2, 0, 1, 0, 0, 0, 8, 3, 4, 9, 0, 8, 9, 0, 1};
   }

   private ThemeType(Function<Integer, Integer> var3) {
      this.id_private();
      this.fields5969a4913d2033e8a6ff59f1ab73faf8[shorts5969a4913d2033e8a6ff59f1ab73faf8[5]] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -329084632;
   }

   public static ThemeType id_class(String var0) {
      byte var2 = bytes5969a4913d2033e8a6ff59f1ab73faf8[0];
      switch (var0.hashCode()) {
         case -1463517642:
            if (var0.equals(strings5969a4913d2033e8a6ff59f1ab73faf8[1])) {
               var2 = booleans5969a4913d2033e8a6ff59f1ab73faf8[1];
            }
            break;
         case 1992409501:
            if (var0.equals(strings5969a4913d2033e8a6ff59f1ab73faf8[0])) {
               var2 = booleans5969a4913d2033e8a6ff59f1ab73faf8[0];
            }
      }
      return switch (var2) {
         case 0 -> (ThemeType)staticFields5969a4913d2033e8a6ff59f1ab73faf8[shorts5969a4913d2033e8a6ff59f1ab73faf8[1]];
         case 1 -> (ThemeType)staticFields5969a4913d2033e8a6ff59f1ab73faf8[shorts5969a4913d2033e8a6ff59f1ab73faf8[2]];
         default -> (ThemeType)staticFields5969a4913d2033e8a6ff59f1ab73faf8[shorts5969a4913d2033e8a6ff59f1ab73faf8[3]];
      };
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8938758608791855950L;
   }

   public Function<Integer, Integer> id_class() {
      return (Function<Integer, Integer>)this.fields5969a4913d2033e8a6ff59f1ab73faf8[shorts5969a4913d2033e8a6ff59f1ab73faf8[4]];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-56, -118, 79, 105, -12, 55, 17, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      booleans5969a4913d2033e8a6ff59f1ab73faf8 = new boolean[]{false, true, false, true, false, false, true, true, true};
   }

   private static void id_throws() {
      strings5969a4913d2033e8a6ff59f1ab73faf8 = new String[]{new String("Клиентский"), new String("Кастомный"), new String("CLIENT"), new String("CUSTOM")};
   }

   private static void id_case() {
      bytes5969a4913d2033e8a6ff59f1ab73faf8 = new byte[]{-1, 2, 2, 3};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{
         new ThemeType(
            var0x -> {
               rrvP var1 = ((ThemeManager)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[shorts5969a4913d2033e8a6ff59f1ab73faf8[10]]).id_break();
               return ColorHelper.id_class(
                  (Integer)ClickGuiTheme.id_class[shorts5969a4913d2033e8a6ff59f1ab73faf8[11]],
                  var0x,
                  var1.id_class(),
                  var1.id_break(),
                  ((rrIk_1)ClickGuiTheme.id_class[shorts5969a4913d2033e8a6ff59f1ab73faf8[12]]).id_class()
               );
            }
         ),
         new ThemeType(
            var0x -> ColorHelper.id_class(
                  (Integer)ClickGuiTheme.id_class[shorts5969a4913d2033e8a6ff59f1ab73faf8[6]],
                  var0x,
                  ((rrIz_1)ClickGuiTheme.id_class[shorts5969a4913d2033e8a6ff59f1ab73faf8[7]]).id_byte(),
                  ((rrIz_1)ClickGuiTheme.id_class[shorts5969a4913d2033e8a6ff59f1ab73faf8[8]]).id_byte(),
                  ((rrIk_1)ClickGuiTheme.id_class[shorts5969a4913d2033e8a6ff59f1ab73faf8[9]]).id_class()
               )
         ),
         null
      };
      var0[2] = new ThemeType[]{(ThemeType)var0[0], (ThemeType)var0[1]};
      staticFields5969a4913d2033e8a6ff59f1ab73faf8 = var0;
   }

   private void id_private() {
      if (this.fields5969a4913d2033e8a6ff59f1ab73faf8 == null) {
         this.fields5969a4913d2033e8a6ff59f1ab73faf8 = new Object[booleans5969a4913d2033e8a6ff59f1ab73faf8[8]];
         Object[] var1 = this.fields5969a4913d2033e8a6ff59f1ab73faf8;
      }
   }
}
