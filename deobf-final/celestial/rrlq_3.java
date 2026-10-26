package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlq_3 extends rrTF<AutoAccept> {
   public static Object[] class_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static byte[] case_;
   private static String[] catch_;
   public Object[] break_;

   private void byte_(String var1) {
      ((cb_3)import_.class_[57]).case_("/duel team accept " + var1);
   }

   private void byte_() {
      ((cb_3)import_.class_[57]).case_("/duel cancel");
   }

   public rrlq_3(AutoAccept var1) {
      super(var1);
      this.private_();
      rrIk_1 var6 = new rrIk_1("Включено", true).class_("enabled", (var1x, var2) -> {
         this.private_();
         Object var7x = null;
         this.break_[2] = var7x;
      });
      this.break_[0] = var6;
      rrIk_1 var7 = new rrIk_1("Только от друзей", true);
      this.break_[1] = var7;
      var1.class_(new GroupSetting("Запрос в команду", (rrIk_1)this.break_[0], (rrIk_1)this.break_[1]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrFo_1 var1) {
      this.private_();
      if (var1.break_() instanceof Fc_1 var3) {
         String var4 = var3.new_().byte_().toLowerCase();
         if (this.break_(var4)) {
            Object var9 = null;
            this.break_[2] = var9;
         }
      }
   }

   private boolean class_(rrLO var1, String var2) {
      this.private_();
      if (((rrIk_1)this.break_[1]).class_()) {
         return var1.class_() != null ? false : ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).break_(var2);
      } else {
         return byte_[11];
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -850556619;
   }

   @EventTarget
   public void class_(rrLO var1) {
      this.private_();
      if (((rrIk_1)this.break_[0]).class_() && var1.class_() == null) {
         String var2 = var1.protected_();

         for (Pattern var6 : (Pattern[])class_[0]) {
            Matcher var7 = var6.matcher(var2);
            if (var7.find()) {
               String var8 = var7.group(1);
               if (this.class_(var1, var8)) {
                  uj_3 var9 = ((cq_3)import_.class_[19]).extends_();
                  if (var9.class_("поиск", "дуэли")) {
                     this.byte_();
                  }

                  this.byte_(var8);
                  rrlT_2 var14 = (rrlT_2)rrlT_2.staticFields8894b88cba4233cc950e42483f078233[0];
                  this.break_[2] = var14;
               }
               break;
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4187382438245985888L;
   }

   @EventTarget
   public void class_(rrAZ var1) {
      this.private_();
      if ((rrlT_2)this.break_[2] == (rrlT_2)rrlT_2.staticFields8894b88cba4233cc950e42483f078233[0] && var1.class_() instanceof Fc_1 var3) {
         String var4 = var3.new_().byte_().toLowerCase();
         rXe_1 var5 = var3.G_();
         if (this.break_(var4)) {
            ((rqr_3)((cb_3)import_.class_[57]).break_[17]).finally_ = true;
            List var6 = var5.class_(var1x -> this.class_(var1x.class_()));
            if (!var6.isEmpty()) {
               ((Ax_1)import_.class_[55]).class_(var5.case_, ((rJY)var6.get(0)).protected_, 2, rXa_1.CLONE);
            }
         }
      }
   }

   private static void class_() {
      Object[] var0 = new Object[1];
      Pattern[] var2 = new Pattern[]{Pattern.compile("\\[⚔] Игрок (.*) приглашает вас (.*)", 0)};
      var0[0] = var2;
      class_ = var0;
   }

   private boolean class_(rdn_3 var1) {
      return var1 != null && !var1.class_() ? var1.continue_().byte_().equalsIgnoreCase("[подтвердить]") : byte_[12];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, -119, 77, 55, -81, 122, -1, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new boolean[]{true, true, false, true, false, true, false, true, true, false, false, true, false, true, false, false, true};
   }

   private boolean break_(String var1) {
      return var1.contains("приглашение в команду");
   }

   private static void throws_() {
      protected_ = new short[]{0, 1, 0, 1, 0, 0, 19, 0, 2, 2, 2, 0, 57, 17, 55, 1, 0, 57, 57, 2, 2};
   }

   private static void case_() {
      catch_ = new String[]{
         new String("Включено"),
         new String("enabled"),
         new String("Только от друзей"),
         new String("Запрос в команду"),
         new String("поиск"),
         new String("дуэли"),
         new String("приглашение в команду"),
         new String("/duel cancel"),
         new String("[подтвердить]"),
         new String("\\[⚔] Игрок (.*) приглашает вас (.*)")
      };
   }

   private static void protected_() {
      case_ = new byte[]{2, 2, 2, 3};
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
      }
   }

   @Override
   public boolean aK_() {
      this.private_();
      Object var5 = null;
      this.break_[2] = var5;
      return super.aK_();
   }
}
