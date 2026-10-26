package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoAuth extends Module {
   public static Object[] break_;
   public Object[] byte_;
   private static byte[] protected_;
   private static boolean[] throws_;
   private static short[] catch_;
   private static float[] private_;
   private static String[] implements_;

   private void byte_(String var1) {
      String[] var2 = var1.split(" ");

      for (String var6 : var2) {
         if (((Set)break_[2]).contains(var6)) {
            this.super_();
            break;
         }

         if (((Set)break_[1]).contains(var6)) {
            this.return_();
            break;
         }
      }
   }

   public AutoAuth() {
      super("Auto Auth", "Автоматически регистрируется\nи авторизируется на сервере", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.else_();
      rrIv_1 var5 = new rrIv_1("Пароль", "qwerty123", rrte_3.class_((Pattern)rrtR_2.class_[8])).class_(80.0F);
      this.byte_[0] = var5;
      this.class_((rrIv_1)this.byte_[0]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new short[]{4, 8, 0, 0, 57, 2, 1, 0, 57, 57, 0, 0, 0, 57, 0};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6004689058799502909L;
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rFu_1 var2) {
         rFm_1 var5 = var2.break_();
         rgP_2 var4 = var2.byte_();
         if (var4 == null) {
            return;
         }

         if ((cb_3)import_.class_[57] == null || import_.finally_() || import_.S() == null) {
            return;
         }

         if (var5 == rFm_1.TITLE || var5 == rFm_1.SUBTITLE || var5 == rFm_1.ACTIONBAR) {
            this.byte_(var4.byte_().toLowerCase());
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1639085265;
   }

   @EventTarget
   public void class_(rrLO var1) {
      String var2 = var1.protected_().toLowerCase();
      if (!import_.finally_() && import_.S() != null) {
         this.byte_(var2);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{33, 65, -11, 125, 95, -94, 116, -91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void goto_() {
      implements_ = new String[]{
         new String("Auto Auth"),
         new String("Автоматически регистрируется\nи авторизируется на сервере"),
         new String("Пароль"),
         new String("qwerty123"),
         new String(" "),
         new String("/register"),
         new String("/reg"),
         new String("/login"),
         new String("/l")
      };
   }

   private static void continue_() {
      protected_ = new byte[]{2, 3};
   }

   private void else_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
      }
   }

   private static void new_() {
      Object[] var0 = new Object[]{new HashSet(), Set.of("/register", "/reg"), Set.of("/login", "/l")};
      break_ = var0;
   }

   private void return_() {
      this.else_();
      String var1 = ((rrIv_1)this.byte_[0]).extends_();
      if (var1.isEmpty()) {
         var1 = ((rrIv_1)this.byte_[0]).final_();
      }

      ((cb_3)import_.class_[57]).case_("/register " + var1 + " " + var1);
      ((Set)break_[0]).add(new rrHc_1(import_.while_().byte_(), import_.S().break_, var1));
   }

   private void super_() {
      this.else_();

      for (rrHc_1 var2 : (Set)break_[0]) {
         String var3 = var2.byte_();
         String var4 = var2.break_();
         if (import_.while_().byte_().equalsIgnoreCase(var3) && var4.equals(import_.S().break_)) {
            String var5 = var2.class_();
            if (!rql_3.break_(var5)) {
               ((cb_3)import_.class_[57]).case_("/login " + var5);
            }

            return;
         }
      }

      ((cb_3)import_.class_[57]).case_("/login " + ((rrIv_1)this.byte_[0]).extends_());
   }

   private static void while_() {
      private_ = new float[]{80.0F};
   }

   private static void public_() {
      throws_ = new boolean[]{false, false, true, true};
   }
}
