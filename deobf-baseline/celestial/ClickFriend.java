package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ClickFriend extends Module {
   private static short[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_break;
   private static String[] id_throws;
   private static float[] id_catch;

   public ClickFriend() {
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_byte[0]]);
      this.id_new();
      rrIF var5 = new rrIF(id_throws[2], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_byte[1]]);
      this.id_break[id_byte[2]] = var5;
      Setting[] var10001 = new Setting[id_protected[0]];
      var10001[id_protected[1]] = (rrIF)this.id_break[id_byte[3]];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new float[]{128.0F};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2109532796250302310L;
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_new();
      if (var1.id_break() == ((rrIF)this.id_break[id_byte[4]]).id_finally().id_byte()) {
         if (Ph_1.id_class(((cb_3)id_import.id_class[id_byte[5]]).id_goto(), id_catch[0], id_protected[2], var0 -> {
            if (var0 instanceof rhd_3 var1x && !var1x.sc() && var1x.Pu()) {
               return id_protected[4];
            }

            return id_protected[5];
         }) instanceof cG_2 var3) {
            if (var3 == this.O()) {
               return;
            }

            if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_byte[6]]).id_class(var3)) {
               ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_byte[7]]).id_byte(var3.id_extends());
            } else {
               ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_byte[8]]).id_class(new rrZk_1(var3.id_extends()), id_protected[3]);
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -254441626;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{49, -113, -73, -93, 51, 111, 84, 51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_protected = new boolean[]{true, false, true, true, true, false, true};
   }

   private static void id_else() {
      id_throws = new String[]{new String("Click Friend"), new String("Добавляет или удаляет игрока из\nдрузей на клавишу"), new String("Клавиша")};
   }

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   private static void id_super() {
      id_byte = new short[]{4, 3, 0, 0, 0, 57, 0, 0, 0};
   }
}
