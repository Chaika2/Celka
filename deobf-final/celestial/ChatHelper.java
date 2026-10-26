package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ChatHelper extends Module {
   private static boolean[] byte_;
   public Object[] break_;
   private static String[] protected_;
   private static byte[] throws_;
   private static short[] catch_;

   public ChatHelper() {
      super("Chat Helper", "Утилитарный модуль для чата", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.this_();
      rrIk_1 var5 = new rrIk_1("Call", true);
      this.break_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Invsee", true);
      this.break_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Ah", false);
      this.break_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Duel", false);
      this.break_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Сохранение истории", false);
      this.break_[4] = var9;
      rrHH[] var10 = new rrHH[]{new rrHC(this), new rrHy_1(this), new rrHn_1(this), new rrHl_1(this)};
      this.break_[5] = var10;
      this.class_(
         new Setting[]{
            new rrIc_1("Быстрые действия", (rrIk_1)this.break_[1], (rrIk_1)this.break_[0], (rrIk_1)this.break_[3], (rrIk_1)this.break_[2]),
            (rrIk_1)this.break_[4]
         }
      );
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3996342898382610264L;
   }

   @EventTarget
   public void class_(rrFR var1) {
      this.this_();
      if (((rrIk_1)this.break_[4]).class_()) {
         var1.class_(true);
      }
   }

   @EventTarget
   public void class_(rrLh_1 var1) {
      this.this_();
      rgP_2 var2 = var1.throws_();
      if (!(var2 instanceof rVe_1)) {
         Aw_1 var3 = var1.protected_();
         if (var3 != null && !var3.class_().equals(((cb_3)import_.class_[57]).sv())) {
            rgN_2 var4 = new rgN_2("");

            for (rrHH var8 : (rrHH[])this.break_[5]) {
               if (var8.class_()) {
                  var4.class_(var8.class_(var3)).break_(" ");
               }
            }

            rVi_1 var9 = var2.case_();
            if (var9.protected_().isEmpty()) {
               var9 = var4.class_(var9);
            } else {
               var9.class_(0, var4);
            }

            var1.class_(var9);
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 881150270;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, -113, -4, -61, 39, -75, 25, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      byte_ = new boolean[]{true, true, false, false, false, false, true, false, false, true, true, true, false, false};
   }

   private static void else_() {
      protected_ = new String[]{
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

   private static void new_() {
      throws_ = new byte[]{4, 2, 3, 2, 4, 2, 3, 6};
   }

   private static void super_() {
      catch_ = new short[]{4, 0, 1, 2, 3, 4, 5, 1, 0, 3, 2, 4, 4, 57, 5};
   }
}
