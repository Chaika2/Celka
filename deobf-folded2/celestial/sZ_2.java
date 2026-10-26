package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sZ_2 extends C_try {
   private static byte[] id_throws;
   private static String[] id_case;
   public Object[] id_break;
   private static short[] id_catch;
   private static boolean[] id_private;

   public sZ_2(sN_2 var1, C_case var2, String[] var3, boolean... var4) {
      super(var2, var3);
      this.id_native();
      this.id_break[0] = var4;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4840223691288192337L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -351172050;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      this.id_native();
      var2.id_class(0);
      this.id_case(String.format("Баритон %s паузе", ((boolean[])this.id_break[0])[0] ? "на" : id_case[2]));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-26, -59, -54, -22, -68, -22, 45, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void id_throws() {
      id_case = new String[]{
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

   private static void id_finally() {
      id_throws = new byte[]{4, 2, 3};
   }

   @Override
   public List<String> id_catch() {
      return Arrays.asList(
         "Команда \"pauses\" сообщает вам, приостановлен ли в данный момент Baritone с помощью команды pause.", "", "Использование:", "> paused"
      );
   }

   private static void id_extends() {
      id_catch = new short[2];
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return "Сообщает вам, если баритон находится в состоянии паузы";
   }

   private static void id_protected() {
      id_private = new boolean[]{false, true, false, false, false, true, true, true};
   }

   private void id_native() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }
}
