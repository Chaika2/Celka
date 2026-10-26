package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NoInteract extends Module {
   private static boolean[] id_protected;
   private static byte[] id_throws;
   private static short[] id_catch;
   public Object[] id_break;
   public static Object[] id_byte;
   private static String[] id_private;

   private static void id_char() {
      id_private = new String[]{
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

   private static void id_long() {
      Object[] var0 = new Object[]{
         new rrIk_1("Все объекты", false),
         (new rrIk_1("Игроки", false)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[40]),
         (new rrIk_1("Армор стенды", true)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[38]),
         (new rrIk_1("Сундуки", false)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[36]),
         (new rrIk_1("Бочки", false)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[34]),
         (new rrIk_1("Двери", true)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[32]),
         (new rrIk_1("Воронки", true)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[30]),
         (new rrIk_1("Кнопки", true)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[28]),
         (new rrIk_1("Раздатчики", true)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[26]),
         (new rrIk_1("Нотные блоки", false)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[24]),
         (new rrIk_1("Верстаки", true)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[22]),
         (new rrIk_1("Люки", true)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[20]),
         (new rrIk_1("Печки", true)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[18]),
         (new rrIk_1("Калитки", true)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[16]),
         (new rrIk_1("Наковальни", false)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[14]),
         (new rrIk_1("Рычаги", false)).id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : id_protected[12])
      };
      id_byte = var0;
   }

   public NoInteract() {
      super("No Interact", "Не дает нажимать ПКМ по\nвыбранным объектам", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.id_while();
      rrIk_1 var5 = new rrIk_1("Только в ПВП", false);
      this.id_break[0] = var5;
      this.id_class(
         new Setting[]{
            new rrIc_1(
               "Выбор",
               (rrIk_1)id_byte[0],
               (rrIk_1)id_byte[1],
               (rrIk_1)id_byte[2],
               (rrIk_1)id_byte[3],
               (rrIk_1)id_byte[4],
               (rrIk_1)id_byte[5],
               (rrIk_1)id_byte[6],
               (rrIk_1)id_byte[7],
               (rrIk_1)id_byte[8],
               (rrIk_1)id_byte[9],
               (rrIk_1)id_byte[10],
               (rrIk_1)id_byte[11],
               (rrIk_1)id_byte[12],
               (rrIk_1)id_byte[13],
               (rrIk_1)id_byte[14],
               (rrIk_1)id_byte[15]
            ),
            (rrIk_1)this.id_break[0]
         }
      );
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrAR var1) {
      this.id_while();
      if (!((rrIk_1)this.id_break[0]).id_class() || rrfZ_2.id_byte()) {
         rdn_3 var2 = var1.id_class();
         rdb_3 var3 = var2.id_break();
         if (var3 != rdy_3.dJ) {
            if (var3 instanceof rxJ_2 var4 && var4.id_catch() instanceof Wp_1) {
               return;
            }

            if (((rrIk_1)id_byte[0]).id_class()) {
               var1.id_class(true);
            } else {
               xd_3 var9 = var1.id_protected();

               for (rrlA_2 var8 : rrlA_2.values()) {
                  if (var8.id_class().get() && var8.id_break().isInstance(var9)) {
                     var1.id_class(true);
                     break;
                  }
               }
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 566998773;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1407049068346945494L;
   }

   @EventTarget
   public void id_class(rrLe_1 var1) {
      this.id_while();
      if (!((rrIk_1)this.id_break[0]).id_class() || rrfZ_2.id_byte()) {
         if (((rrIk_1)id_byte[0]).id_class()) {
            var1.id_class(true);
         } else {
            iB_2 var2 = var1.id_break();

            for (rrln_3 var6 : rrln_3.values()) {
               if (var6.id_break().get() && var6.id_class().test(var2)) {
                  var1.id_class(true);
                  break;
               }
            }
         }
      }
   }

   private static void id_short() {
      id_throws = new byte[]{2, 16, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-34, -128, -76, -5, 105, -53, 116, 68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_else() {
      id_catch = new short[]{3, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   }

   private static void id_new() {
      id_protected = new boolean[]{
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

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }
}
