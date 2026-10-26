package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sJ_2 extends C_try {
   public Object[] break_;
   private static short[] throws_;
   private static byte[] case_;
   private static boolean[] catch_;
   private static String[] private_;

   public sJ_2(C_case var1, List<String> var2, String var3, String var4) {
      super(var1, var2.toArray(new String[0]));
      this.throws_();
      this.break_[0] = var3;
      this.break_[1] = var4;
   }

   public sJ_2(C_case var1, String var2, String var3, String var4) {
      super(var1, var2);
      this.throws_();
      this.break_[0] = var3;
      this.break_[1] = var4;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1640164890;
   }

   @Override
   public void class_(String var1, C_static var2) {
      this.throws_();
      ((C_case)this.class_[0]).switch_().class_(String.format("%s %s", (String)this.break_[1], var2.class_()));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6043478470231286798L;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      this.throws_();
      return ((C_case)this.class_[0]).switch_().byte_(String.format("%s %s", (String)this.break_[1], var2.class_()));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-110, 85, 3, 63, 72, -32, 35, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void finally_() {
      throws_ = new short[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
   }

   @Override
   public List<String> catch_() {
      this.throws_();
      return Collections.singletonList(String.format("This command is an alias, for: %s ...", (String)this.break_[1]));
   }

   private static void extends_() {
      private_ = new String[]{new String("%s %s"), new String("%s %s"), new String("This command is an alias, for: %s ...")};
   }

   @Override
   public String implements_() {
      this.throws_();
      return (String)this.break_[0];
   }

   private static void protected_() {
      case_ = new byte[]{2, 2, 2};
   }

   private static void native_() {
      catch_ = new boolean[]{false, true, false, false, true, false, true, true, false};
   }
}
