package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ChatHelper extends Module {
   private static boolean[] id_byte;
   public Object[] id_break;
   private static String[] id_protected;
   private static byte[] id_throws;
   private static short[] id_catch;

   public ChatHelper() {
      super("Chat Helper", "Утилитарный модуль для чата", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_this();
      rrIk_1 var5 = new rrIk_1("Call", true);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Invsee", true);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Ah", false);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Duel", false);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Сохранение истории", false);
      this.id_break[4] = var9;
      rrHH[] var10 = new rrHH[]{new rrHC(this), new rrHy_1(this), new rrHn_1(this), new rrHl_1(this)};
      this.id_break[5] = var10;
      this.id_class(
         new Setting[]{
            new rrIc_1("Быстрые действия", (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[2]),
            (rrIk_1)this.id_break[4]
         }
      );
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3996342898382610264L;
   }

   @EventTarget
   public void id_class(rrFR var1) {
      this.id_this();
      if (((rrIk_1)this.id_break[4]).id_class()) {
         var1.id_class(true);
      }
   }

   @EventTarget
   public void id_class(rrLh_1 var1) {
      this.id_this();
      rgP_2 var2 = var1.id_throws();
      if (!(var2 instanceof rVe_1)) {
         Aw_1 var3 = var1.id_protected();
         if (var3 != null && !var3.id_class().equals(((cb_3)id_import.id_class[57]).sv())) {
            rgN_2 var4 = new rgN_2("");

            for (rrHH var8 : (rrHH[])this.id_break[5]) {
               if (var8.id_class()) {
                  var4.id_class(var8.id_class(var3)).id_break(" ");
               }
            }

            rVi_1 var9 = var2.id_case();
            if (var9.id_protected().isEmpty()) {
               var9 = var4.id_class(var9);
            } else {
               var9.id_class(0, var4);
            }

            var1.id_class(var9);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 881150270;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, -113, -4, -61, 39, -75, 25, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_byte = new boolean[]{true, true, false, false, false, false, true, false, false, true, true, true, false, false};
   }

   private static void id_else() {
      id_protected = new String[]{
         new String("Chat Helper"),
         new String("Утилитарный модуль для чата"),
         new String("Call"),
         new String("Invsee"),
         new String("Ah"),
         new String("Duel"),
         new String("Сохранение истории"),
         new String("Быстрые действия"),
         new String(""),
         new String(" ")
      };
   }

   private static void id_new() {
      id_throws = new byte[]{4, 2, 3, 2, 4, 2, 3, 6};
   }

   private static void id_super() {
      id_catch = new short[]{4, 0, 1, 2, 3, 4, 5, 1, 0, 3, 2, 4, 4, 57, 5};
   }
}
