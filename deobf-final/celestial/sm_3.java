package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sm_3 extends C_try {
   public Object[] break_;
   private static boolean[] throws_;
   private static short[] case_;
   private static String[] catch_;
   private static byte[] private_;

   public sm_3(sN_2 var1, C_case var2, String[] var3, boolean... var4) {
      super(var2, var3);
      this.finally_();
      this.break_[0] = var4;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 896986854;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      this.finally_();
      var2.class_(0);
      ((C_case)this.class_[0]).r().finally_();
      if (!((boolean[])this.break_[0])[0]) {
         throw new k_1("Не на паузе");
      } else {
         ((boolean[])this.break_[0])[0] = false;
         this.case_("Возобновлено");
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7502742272629854414L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{100, 105, 71, -42, 18, -53, -92, 91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void throws_() {
      case_ = new short[4];
   }

   private void finally_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Команда \"resume\" указывает Baritone возобновить все, что он делал, когда вы в последний раз использовали команду pause.",
         "",
         "Использование:",
         "> resume"
      );
   }

   private static void extends_() {
      throws_ = new boolean[]{false, false, false, false, false, true, true, true};
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Восстанавливает баритон после паузы";
   }

   private static void protected_() {
      private_ = new byte[]{4, 2, 3};
   }

   private static void native_() {
      catch_ = new String[]{
         new String("Не на паузе"),
         new String("Возобновлено"),
         new String("Восстанавливает баритон после паузы"),
         new String("Команда \"resume\" указывает Baritone возобновить все, что он делал, когда вы в последний раз использовали команду pause."),
         new String(""),
         new String("Использование:"),
         new String("> resume")
      };
   }
}
