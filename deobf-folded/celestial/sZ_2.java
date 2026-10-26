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
      this.id_break[id_catch[0]] = var4;
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
      var2.id_class(id_private[0]);
      String var10001 = id_case[0];
      Object[] var10002 = new Object[1];
      var10002[id_private[2]] = ((boolean[])this.id_break[id_catch[1]])[id_private[3]] ? id_case[1] : id_case[2];
      this.id_case(String.format(var10001, var10002));
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
      String[] var10000 = new String[4];
      var10000[id_private[4]] = id_case[4];
      var10000[1] = id_case[5];
      var10000[2] = id_case[6];
      var10000[3] = id_case[7];
      return Arrays.asList(var10000);
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
      return id_case[3];
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
