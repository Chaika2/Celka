package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NoInteract extends Module {
   private static boolean[] protected_;
   private static byte[] throws_;
   private static short[] catch_;
   public Object[] break_;
   public static Object[] byte_;
   private static String[] private_;

   private static void char_() {
      private_ = new String[]{
         new String("No Interact"),
         new String("Не дает нажимать ПКМ по\nвыбранным объектам"),
         new String("Только в ПВП"),
         new String("Выбор"),
         new String("Все объекты"),
         new String("Игроки"),
         new String("Армор стенды"),
         new String("Сундуки"),
         new String("Бочки"),
         new String("Двери"),
         new String("Воронки"),
         new String("Кнопки"),
         new String("Раздатчики"),
         new String("Нотные блоки"),
         new String("Верстаки"),
         new String("Люки"),
         new String("Печки"),
         new String("Калитки"),
         new String("Наковальни"),
         new String("Рычаги")
      };
   }

   private static void long_() {
      Object[] var0 = new Object[]{
         new rrIk_1("Все объекты", false),
         (new rrIk_1("Игроки", false)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[40]),
         (new rrIk_1("Армор стенды", true)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[38]),
         (new rrIk_1("Сундуки", false)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[36]),
         (new rrIk_1("Бочки", false)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[34]),
         (new rrIk_1("Двери", true)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[32]),
         (new rrIk_1("Воронки", true)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[30]),
         (new rrIk_1("Кнопки", true)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[28]),
         (new rrIk_1("Раздатчики", true)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[26]),
         (new rrIk_1("Нотные блоки", false)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[24]),
         (new rrIk_1("Верстаки", true)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[22]),
         (new rrIk_1("Люки", true)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[20]),
         (new rrIk_1("Печки", true)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[18]),
         (new rrIk_1("Калитки", true)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[16]),
         (new rrIk_1("Наковальни", false)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[14]),
         (new rrIk_1("Рычаги", false)).class_(() -> !((rrIk_1)byte_[0]).class_() ? true : protected_[12])
      };
      byte_ = var0;
   }

   public NoInteract() {
      super("No Interact", "Не дает нажимать ПКМ по\nвыбранным объектам", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.while_();
      rrIk_1 var5 = new rrIk_1("Только в ПВП", false);
      this.break_[0] = var5;
      this.class_(
         new Setting[]{
            new rrIc_1(
               "Выбор",
               (rrIk_1)byte_[0],
               (rrIk_1)byte_[1],
               (rrIk_1)byte_[2],
               (rrIk_1)byte_[3],
               (rrIk_1)byte_[4],
               (rrIk_1)byte_[5],
               (rrIk_1)byte_[6],
               (rrIk_1)byte_[7],
               (rrIk_1)byte_[8],
               (rrIk_1)byte_[9],
               (rrIk_1)byte_[10],
               (rrIk_1)byte_[11],
               (rrIk_1)byte_[12],
               (rrIk_1)byte_[13],
               (rrIk_1)byte_[14],
               (rrIk_1)byte_[15]
            ),
            (rrIk_1)this.break_[0]
         }
      );
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrAR var1) {
      this.while_();
      if (!((rrIk_1)this.break_[0]).class_() || rrfZ_2.byte_()) {
         rdn_3 var2 = var1.class_();
         rdb_3 var3 = var2.break_();
         if (var3 != rdy_3.dJ) {
            if (var3 instanceof rxJ_2 var4 && var4.catch_() instanceof Wp_1) {
               return;
            }

            if (((rrIk_1)byte_[0]).class_()) {
               var1.class_(true);
            } else {
               xd_3 var9 = var1.protected_();

               for (rrlA_2 var8 : rrlA_2.values()) {
                  if (var8.class_().get() && var8.break_().isInstance(var9)) {
                     var1.class_(true);
                     break;
                  }
               }
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 566998773;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1407049068346945494L;
   }

   @EventTarget
   public void class_(rrLe_1 var1) {
      this.while_();
      if (!((rrIk_1)this.break_[0]).class_() || rrfZ_2.byte_()) {
         if (((rrIk_1)byte_[0]).class_()) {
            var1.class_(true);
         } else {
            iB_2 var2 = var1.break_();

            for (rrln_3 var6 : rrln_3.values()) {
               if (var6.break_().get() && var6.class_().test(var2)) {
                  var1.class_(true);
                  break;
               }
            }
         }
      }
   }

   private static void short_() {
      throws_ = new byte[]{2, 16, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-34, -128, -76, -5, 105, -53, 116, 68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void else_() {
      catch_ = new short[]{3, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   }

   private static void new_() {
      protected_ = new boolean[]{
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
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
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         true
      };
   }

   private void while_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }
}
