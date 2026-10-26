package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ClickGuiTheme extends rrtN_2 {
   private static float[] id_break;
   private static short[] id_byte;
   public static Object[] id_class;
   private static String[] id_protected;
   private static int[] id_native;
   private static boolean[] id_volatile;
   private static byte[] id_final;

   @Override
   public String id_byte() {
      return id_protected[13];
   }

   public ClickGuiTheme(ClickGuiScreen var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, () -> 140.0F, () -> 14.0F);
      rrIF var8 = new rrIF(id_protected[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[124]).id_class(id_volatile[0]);
      id_class[id_byte[1]] = var8;
      String var10002 = id_protected[1];
      String var10003 = id_protected[2];
      String[] var10004 = new String[2];
      var10004[id_volatile[1]] = id_protected[3];
      var10004[1] = id_protected[4];
      rrIQ var9 = new rrIQ(var10002, var10003, var10004).id_class(id_protected[5], (var1x, var2x) -> {
         if (!(Boolean)var2x.getRight() && ((String)var2x.getLeft()).equals(id_protected[17]) && !var1x.id_byte().equals(id_protected[18])) {
            rrZt_1.id_class(var1, (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[6]);
         }

         ThemeType var7 = ThemeType.id_class(var1x.id_byte());
         id_class[7] = var7;
      });
      id_class[1] = var9;
      rrIz_1 var10 = new rrIz_1(id_protected[6], -4299265).id_break().id_class(() -> ((rrIQ)id_class[1]).id_byte().equals(id_protected[16]));
      id_class[3] = var10;
      rrIz_1 var11 = new rrIz_1(id_protected[7], -12708504).id_break().id_class(() -> ((rrIQ)id_class[1]).id_byte().equals(id_protected[15]));
      id_class[4] = var11;
      rrIm_1 var12 = new rrIm_1(id_protected[8], 3.0F, 1.0F, 5.0F, 1.0F);
      id_class[2] = var12;
      rrIk_1 var13 = new rrIk_1(id_protected[9], id_volatile[3]);
      id_class[9] = var13;
      ((rrIm_1)id_class[2]).id_class(id_protected[10], (var0, var1x) -> {
         Integer var6 = (int)(((rrIm_1)id_class[2]).id_native() + 5.0F - (Float)var1x.getLeft());
         id_class[8] = var6;
      });
      rrIk_1 var14 = new rrIk_1(id_protected[11], true);
      id_class[5] = var14;
      rrIk_1 var15 = new rrIk_1(id_protected[12], true);
      id_class[6] = var15;
      Setting[] var10001 = new Setting[8];
      var10001[id_volatile[6]] = (rrIQ)id_class[1];
      var10001[1] = (rrIz_1)id_class[3];
      var10001[2] = (rrIz_1)id_class[4];
      var10001[3] = (rrIm_1)id_class[2];
      var10001[4] = (rrIk_1)id_class[9];
      var10001[5] = (rrIk_1)id_class[5];
      var10001[6] = (rrIk_1)id_class[6];
      var10001[7] = (rrIF)id_class[id_byte[17]];
      this.id_class(var10001);
      this.id_switch();
   }

   static {
      ntfClinit();
   }

   private static void B() {
      id_byte = new short[]{124, 0, 1, 3, 4, 2, 9, 2, 5, 6, 1, 3, 4, 2, 9, 5, 6, 0, 1, 2, 5, 6, 2, 8, 1, 1, 6, 7};
   }

   private static void id_this() {
      id_final = new byte[]{2, 8, 2, 3, 4, 5, 6, 7, 7, 7, 8, 10, 8};
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.id_class(var1, var2, var3, var4, var5);
      this.id_interface().id_class(var1, () -> {
      }, var2, var3, var4, id_volatile[8], var5);
   }

   public static boolean id_class() {
      return ((rrIk_1)id_class[6]).id_class();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3055291115569308007L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-107, 126, 119, 49, 84, 80, -97, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1236689905;
   }

   public static rrIm_1 id_break() {
      return (rrIm_1)id_class[2];
   }

   public static boolean id_throws() {
      return ((rrIk_1)id_class[5]).id_class();
   }

   @Override
   public String id_catch() {
      return id_protected[14];
   }

   public static String id_case() {
      return ((rrIQ)id_class[1]).id_byte();
   }

   private static void id_package() {
      id_break = new float[]{3.0F, 1.0F, 5.0F, 1.0F, 5.0F, 14.0F, 140.0F};
   }

   private static void id_return() {
      id_volatile = new boolean[]{false, false, true, false, true, true, false, true, false, false, false, false};
   }

   private static void id_super() {
      id_protected = new String[]{
         new String("Открыть меню"),
         new String("Цвет"),
         new String("Клиентский"),
         new String("Клиентский"),
         new String("Кастомный"),
         new String("change_mode"),
         new String("Первый цвет"),
         new String("Второй цвет"),
         new String("Скорость цвета"),
         new String("Смешивание цветов"),
         new String("change_speed"),
         new String("Размытие"),
         new String("Свечение"),
         new String("Настройка"),
         new String("GuiSettingPopUp"),
         new String("Кастомный"),
         new String("Кастомный"),
         new String("Клиентский"),
         new String("Клиентский")
      };
   }

   private static void id_throw() {
      Object[] var0 = new Object[10];
      var0[7] = Enum.valueOf(ThemeType.class, "CLIENT");
      var0[8] = 7;
      id_class = var0;
   }

   private static void id_try() {
      id_native = new int[]{-4299265, -12708504};
   }

   @Override
   public boolean id_protected() {
      return id_volatile[9];
   }
}
