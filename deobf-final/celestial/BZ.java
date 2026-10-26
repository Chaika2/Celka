package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BZ extends Pv_1 {
   private static byte[] protected_;
   public static Object[] break_;
   private static short[] throws_;
   private static String[] case_;
   public Object[] byte_;
   private static boolean[] catch_;

   private static void byte_() {
      throws_ = new short[]{0, 1, 4, 0, 0, 0, 1, 4, 0, 0, 0, 5, 0, 0};
   }

   public BZ(C_class var1) {
      super(var1);
      this.protected_();
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      protected_ = new byte[]{2, 3, 4, 5};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7669122442146643559L;
   }

   @Override
   public void class_(rrLh_1 var1) {
      this.protected_();
      if (var1.protected_() == null && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
         if ((Boolean)this.byte_[0]) {
            Matcher var2 = ((Pattern)break_[0]).matcher(var1.class_());
            if (var2.find()) {
               String var3 = var2.group(1);
               String var4 = var2.group(2);
               String var5 = var2.group(3);
               String var6 = var2.group(4);
               String var7 = var2.group(5);
               ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[0]).class_((rrZr_1)rrQJ.class_[5], var6, var7, var5, var4, var3);
               MinecraftAccessor.a_("Вы были забанены за " + var6, false);
               Boolean var12 = false;
               this.byte_[0] = var12;
            }
         }
      }
   }

   @Override
   public void class_(rrFK var1) {
      this.protected_();
      super.class_(var1);
      Boolean var6 = false;
      this.byte_[0] = var6;
   }

   @Override
   public void class_(q_1 var1) {
      this.protected_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
            return;
         }

         PI var2 = ((C_class)this.class_[0]).native_().protected_();
         boolean var3 = var2 != null && var2.class_().break_() ? true : catch_[1];
         boolean var4 = ((C_class)this.class_[0]).synchronized_().class_();
         Boolean var9 = !var3 && !var4 ? catch_[3] : catch_[2];
         this.byte_[0] = var9;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 519948433;
   }

   private static void break_() {
      catch_ = new boolean[]{true, false, true, false, true, false, false, false, false, true, false, false, true};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{104, -47, 14, -121, 37, 14, -125, -37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      Object[] var0 = new Object[]{
         Pattern.compile(
            "Вы были кикнуты с сервера (.*?):[\\s\\S]*?Бан выдан: (.*)\\s+Бан от: (.*)\\s+Ваш ник: .*\\s+По причине: ([\\s\\S]*?)\\s+Разбан через: (.*)"
         )
      };
      break_ = var0;
   }

   private static void case_() {
      case_ = new String[]{
         new String(
            "Вы были кикнуты с сервера (.*?):[\\s\\S]*?Бан выдан: (.*)\\s+Бан от: (.*)\\s+Ваш ник: .*\\s+По причине: ([\\s\\S]*?)\\s+Разбан через: (.*)"
         )
      };
   }

   private void protected_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
         var1[0] = false;
      }
   }
}
