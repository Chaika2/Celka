package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sJ_2 extends C_try {
   public Object[] id_break;
   private static short[] id_throws;
   private static byte[] id_case;
   private static boolean[] id_catch;
   private static String[] id_private;

   public sJ_2(C_case var1, List<String> var2, String var3, String var4) {
      super(var1, var2.toArray(new String[id_catch[0]]));
      this.id_throws();
      this.id_break[id_throws[0]] = var3;
      this.id_break[1] = var4;
   }

   public sJ_2(C_case var1, String var2, String var3, String var4) {
      String[] var10002 = new String[1];
      var10002[id_catch[2]] = var2;
      super(var1, var10002);
      this.id_throws();
      this.id_break[id_throws[2]] = var3;
      this.id_break[1] = var4;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1640164890;
   }

   @Override
   public void id_class(String var1, C_static var2) {
      this.id_throws();
      F var10000 = ((C_case)this.id_class[id_throws[4]]).id_switch();
      String var10001 = id_private[0];
      Object[] var10002 = new Object[2];
      var10002[id_catch[3]] = (String)this.id_break[1];
      var10002[1] = var2.id_class();
      var10000.id_class(String.format(var10001, var10002));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6043478470231286798L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      this.id_throws();
      F var10000 = ((C_case)this.id_class[id_throws[6]]).id_switch();
      String var10001 = id_private[1];
      Object[] var10002 = new Object[2];
      var10002[id_catch[5]] = (String)this.id_break[1];
      var10002[1] = var2.id_class();
      return var10000.id_byte(String.format(var10001, var10002));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-110, 85, 3, 63, 72, -32, 35, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_finally() {
      id_throws = new short[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
   }

   @Override
   public List<String> id_catch() {
      this.id_throws();
      String var10000 = id_private[2];
      Object[] var10001 = new Object[1];
      var10001[id_catch[8]] = (String)this.id_break[1];
      return Collections.singletonList(String.format(var10000, var10001));
   }

   private static void id_extends() {
      id_private = new String[]{new String("%s %s"), new String("%s %s"), new String("This command is an alias, for: %s ...")};
   }

   @Override
   public String id_implements() {
      this.id_throws();
      return (String)this.id_break[id_throws[8]];
   }

   private static void id_protected() {
      id_case = new byte[]{2, 2, 2};
   }

   private static void id_native() {
      id_catch = new boolean[]{false, true, false, false, true, false, true, true, false};
   }
}
