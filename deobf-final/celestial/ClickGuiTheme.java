package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ClickGuiTheme extends rrtN_2 {
   private static float[] break_;
   private static short[] byte_;
   public static Object[] class_;
   private static String[] protected_;
   private static int[] native_;
   private static boolean[] volatile_;
   private static byte[] final_;

   @Override
   public String byte_() {
      return "Настройка";
   }

   public ClickGuiTheme(ClickGuiScreen var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, () -> 140.0F, () -> 14.0F);
      rrIF var8 = new rrIF("Открыть меню", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[124]).class_(false);
      class_[0] = var8;
      rrIQ var9 = new rrIQ("Цвет", "Клиентский", "Клиентский", "Кастомный").class_("change_mode", (var1x, var2x) -> {
         if (!(Boolean)var2x.getRight() && ((String)var2x.getLeft()).equals("Клиентский") && !var1x.byte_().equals("Клиентский")) {
            rrZt_1.class_(var1, (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[6]);
         }

         ThemeType var7 = ThemeType.class_(var1x.byte_());
         class_[7] = var7;
      });
      class_[1] = var9;
      rrIz_1 var10 = new rrIz_1("Первый цвет", -4299265).break_().class_(() -> ((rrIQ)class_[1]).byte_().equals("Кастомный"));
      class_[3] = var10;
      rrIz_1 var11 = new rrIz_1("Второй цвет", -12708504).break_().class_(() -> ((rrIQ)class_[1]).byte_().equals("Кастомный"));
      class_[4] = var11;
      rrIm_1 var12 = new rrIm_1("Скорость цвета", 3.0F, 1.0F, 5.0F, 1.0F);
      class_[2] = var12;
      rrIk_1 var13 = new rrIk_1("Смешивание цветов", false);
      class_[9] = var13;
      ((rrIm_1)class_[2]).class_("change_speed", (var0, var1x) -> {
         Integer var6 = (int)(((rrIm_1)class_[2]).native_() + 5.0F - (Float)var1x.getLeft());
         class_[8] = var6;
      });
      rrIk_1 var14 = new rrIk_1("Размытие", true);
      class_[5] = var14;
      rrIk_1 var15 = new rrIk_1("Свечение", true);
      class_[6] = var15;
      this.class_(
         new Setting[]{
            (rrIQ)class_[1], (rrIz_1)class_[3], (rrIz_1)class_[4], (rrIm_1)class_[2], (rrIk_1)class_[9], (rrIk_1)class_[5], (rrIk_1)class_[6], (rrIF)class_[0]
         }
      );
      this.switch_();
   }

   static {
      ntfClinit();
   }

   private static void B() {
      byte_ = new short[]{124, 0, 1, 3, 4, 2, 9, 2, 5, 6, 1, 3, 4, 2, 9, 5, 6, 0, 1, 2, 5, 6, 2, 8, 1, 1, 6, 7};
   }

   private static void this_() {
      final_ = new byte[]{2, 8, 2, 3, 4, 5, 6, 7, 7, 7, 8, 10, 8};
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.class_(var1, var2, var3, var4, var5);
      this.interface_().class_(var1, () -> {
      }, var2, var3, var4, false, var5);
   }

   public static boolean class_() {
      return ((rrIk_1)class_[6]).class_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3055291115569308007L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-107, 126, 119, 49, 84, 80, -97, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1236689905;
   }

   public static rrIm_1 break_() {
      return (rrIm_1)class_[2];
   }

   public static boolean throws_() {
      return ((rrIk_1)class_[5]).class_();
   }

   @Override
   public String catch_() {
      return "GuiSettingPopUp";
   }

   public static String case_() {
      return ((rrIQ)class_[1]).byte_();
   }

   private static void package_() {
      break_ = new float[]{3.0F, 1.0F, 5.0F, 1.0F, 5.0F, 14.0F, 140.0F};
   }

   private static void return_() {
      volatile_ = new boolean[]{false, false, true, false, true, true, false, true, false, false, false, false};
   }

   private static void super_() {
      protected_ = new String[]{
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

   private static void throw_() {
      Object[] var0 = new Object[10];
      var0[7] = Enum.valueOf(ThemeType.class, "CLIENT");
      var0[8] = 7;
      class_ = var0;
   }

   private static void try_() {
      native_ = new int[]{-4299265, -12708504};
   }

   @Override
   public boolean protected_() {
      return false;
   }
}
