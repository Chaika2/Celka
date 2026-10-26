package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sv_3 extends C_try {
   private static short[] throws_;
   public Object[] break_;
   private static byte[] case_;
   private static boolean[] catch_;
   private static String[] private_;

   public sv_3(sN_2 var1, C_case var2, String[] var3, boolean... var4) {
      super(var2, var3);
      this.extends_();
      this.break_[0] = var4;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      this.extends_();
      var2.class_(0);
      if (((boolean[])this.break_[0])[0]) {
         ((boolean[])this.break_[0])[0] = false;
      }

      ((C_case)this.class_[0]).this_().break_();
      this.case_("Отменяем все процессы баритона");
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1172970469;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -92671664518403371L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{49, 99, 119, 53, -105, 61, 113, 7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void throws_() {
      catch_ = new boolean[]{false, false, false, false, false, true, true, true};
   }

   private static void finally_() {
      throws_ = new short[4];
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList("Команда \"cancel\" отменяет все активные процессы баритона", "", "Использование:", "> cancel");
   }

   private void extends_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Отменяет все активные процессы баритона";
   }

   private static void protected_() {
      private_ = new String[]{
         new String("Отменяем все процессы баритона"),
         new String("Отменяет все активные процессы баритона"),
         new String("Команда \"cancel\" отменяет все активные процессы баритона"),
         new String(""),
         new String("Использование:"),
         new String("> cancel")
      };
   }

   private static void native_() {
      case_ = new byte[]{4, 2, 3};
   }
}
