package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sZ_2 extends C_try {
   private static byte[] throws_;
   private static String[] case_;
   public Object[] break_;
   private static short[] catch_;
   private static boolean[] private_;

   public sZ_2(sN_2 var1, C_case var2, String[] var3, boolean... var4) {
      super(var2, var3);
      this.native_();
      this.break_[0] = var4;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4840223691288192337L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -351172050;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      this.native_();
      var2.class_(0);
      this.case_(String.format("Баритон %s паузе", ((boolean[])this.break_[0])[0] ? "на" : case_[2]));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-26, -59, -54, -22, -68, -22, 45, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void throws_() {
      case_ = new String[]{
         new String("Баритон %s паузе"),
         new String("на"),
         new String("не на"),
         new String("Сообщает вам, если баритон находится в состоянии паузы"),
         new String("Команда \"pauses\" сообщает вам, приостановлен ли в данный момент Baritone с помощью команды pause."),
         new String(""),
         new String("Использование:"),
         new String("> paused")
      };
   }

   private static void finally_() {
      throws_ = new byte[]{4, 2, 3};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Команда \"pauses\" сообщает вам, приостановлен ли в данный момент Baritone с помощью команды pause.", "", "Использование:", "> paused"
      );
   }

   private static void extends_() {
      catch_ = new short[2];
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Сообщает вам, если баритон находится в состоянии паузы";
   }

   private static void protected_() {
      private_ = new boolean[]{false, true, false, false, false, true, true, true};
   }

   private void native_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }
}
