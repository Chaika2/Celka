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
         new rrIk_1(id_private[4], false),
         (new rrIk_1(id_private[5], false)).id_class(() -> !((rrIk_1)id_byte[id_catch[37]]).id_class() ? true : id_protected[40]),
         (new rrIk_1(id_private[6], true)).id_class(() -> !((rrIk_1)id_byte[id_catch[36]]).id_class() ? true : id_protected[38]),
         (new rrIk_1(id_private[7], false)).id_class(() -> !((rrIk_1)id_byte[id_catch[35]]).id_class() ? true : id_protected[36]),
         (new rrIk_1(id_private[8], false)).id_class(() -> !((rrIk_1)id_byte[id_catch[34]]).id_class() ? true : id_protected[34]),
         (new rrIk_1(id_private[9], true)).id_class(() -> !((rrIk_1)id_byte[id_catch[33]]).id_class() ? true : id_protected[32]),
         (new rrIk_1(id_private[10], true)).id_class(() -> !((rrIk_1)id_byte[id_catch[32]]).id_class() ? true : id_protected[30]),
         (new rrIk_1(id_private[11], true)).id_class(() -> !((rrIk_1)id_byte[id_catch[31]]).id_class() ? true : id_protected[28]),
         (new rrIk_1(id_private[12], true)).id_class(() -> !((rrIk_1)id_byte[id_catch[30]]).id_class() ? true : id_protected[26]),
         (new rrIk_1(id_private[13], false)).id_class(() -> !((rrIk_1)id_byte[id_catch[29]]).id_class() ? true : id_protected[24]),
         (new rrIk_1(id_private[14], true)).id_class(() -> !((rrIk_1)id_byte[id_catch[28]]).id_class() ? true : id_protected[22]),
         (new rrIk_1(id_private[15], true)).id_class(() -> !((rrIk_1)id_byte[id_catch[27]]).id_class() ? true : id_protected[20]),
         (new rrIk_1(id_private[16], true)).id_class(() -> !((rrIk_1)id_byte[id_catch[26]]).id_class() ? true : id_protected[18]),
         (new rrIk_1(id_private[17], true)).id_class(() -> !((rrIk_1)id_byte[id_catch[25]]).id_class() ? true : id_protected[16]),
         (new rrIk_1(id_private[18], false)).id_class(() -> !((rrIk_1)id_byte[id_catch[24]]).id_class() ? true : id_protected[14]),
         (new rrIk_1(id_private[19], false)).id_class(() -> !((rrIk_1)id_byte[id_catch[23]]).id_class() ? true : id_protected[12])
      };
      id_byte = var0;
   }

   public NoInteract() {
      super(id_private[0], id_private[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.id_while();
      rrIk_1 var5 = new rrIk_1(id_private[2], id_protected[0]);
      this.id_break[id_catch[1]] = var5;
      Setting[] var10001 = new Setting[2];
      byte var10003 = id_protected[1];
      String var10006 = id_private[3];
      rrIk_1[] var10007 = new rrIk_1[16];
      var10007[id_protected[2]] = (rrIk_1)id_byte[id_catch[2]];
      var10007[1] = (rrIk_1)id_byte[1];
      var10007[2] = (rrIk_1)id_byte[2];
      var10007[3] = (rrIk_1)id_byte[3];
      var10007[4] = (rrIk_1)id_byte[4];
      var10007[5] = (rrIk_1)id_byte[5];
      var10007[6] = (rrIk_1)id_byte[6];
      var10007[7] = (rrIk_1)id_byte[7];
      var10007[8] = (rrIk_1)id_byte[8];
      var10007[9] = (rrIk_1)id_byte[9];
      var10007[10] = (rrIk_1)id_byte[10];
      var10007[11] = (rrIk_1)id_byte[11];
      var10007[12] = (rrIk_1)id_byte[12];
      var10007[13] = (rrIk_1)id_byte[13];
      var10007[14] = (rrIk_1)id_byte[14];
      var10007[15] = (rrIk_1)id_byte[15];
      var10001[var10003] = new rrIc_1(var10006, var10007);
      var10001[1] = (rrIk_1)this.id_break[id_catch[18]];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrAR var1) {
      this.id_while();
      if (!((rrIk_1)this.id_break[id_catch[19]]).id_class() || rrfZ_2.id_byte()) {
         rdn_3 var2 = var1.id_class();
         rdb_3 var3 = var2.id_break();
         if (var3 != rdy_3.dJ) {
            if (var3 instanceof rxJ_2 var4 && var4.id_catch() instanceof Wp_1) {
               return;
            }

            if (((rrIk_1)id_byte[id_catch[20]]).id_class()) {
               var1.id_class(true);
            } else {
               xd_3 var9 = var1.id_protected();
               rrlA_2[] var5 = rrlA_2.values();
               int var6 = var5.length;

               for (int var7 = id_protected[6]; var7 < var6; var7++) {
                  rrlA_2 var8 = var5[var7];
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
      if (!((rrIk_1)this.id_break[id_catch[21]]).id_class() || rrfZ_2.id_byte()) {
         if (((rrIk_1)id_byte[id_catch[22]]).id_class()) {
            var1.id_class(true);
         } else {
            iB_2 var2 = var1.id_break();
            rrln_3[] var3 = rrln_3.values();
            int var4 = var3.length;

            for (int var5 = id_protected[9]; var5 < var4; var5++) {
               rrln_3 var6 = var3[var5];
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
