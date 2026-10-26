package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class KeepSprint extends Module {
   private static boolean[] id_byte;
   private static String[] id_protected;
   private static short[] id_throws;
   private static byte[] id_catch;
   public Object[] id_break;

   public KeepSprint() {
      super("Keep Sprint", "Не дает сбросить спринт при\nударе", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.id_this();
      rrIQ var5 = new rrIQ("Режим", "Vanilla", "Vanilla", "SpookyTime");
      this.id_break[0] = var5;
      this.id_class((rrIQ)this.id_break[0]);
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 552228411;
   }

   @EventTarget
   public void id_class(rrFt_1 var1) {
      this.id_this();
      String var2 = ((rrIQ)this.id_break[0]).id_byte();
      if (var2.equals("Vanilla")) {
         var1.id_class(true);
      } else if (var2.equals("SpookyTime")) {
         var1.id_break(true);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2347592205399617715L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{125, -125, -122, 114, 6, -96, 59, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_protected = new String[]{
         new String("Keep Sprint"),
         new String("Не дает сбросить спринт при\nударе"),
         new String("Режим"),
         new String("Vanilla"),
         new String("Vanilla"),
         new String("SpookyTime"),
         new String("Vanilla"),
         new String("SpookyTime")
      };
   }

   private static void id_else() {
      id_byte = new boolean[]{false, true, true, true, true};
   }

   private static void id_new() {
      id_catch = new byte[]{2};
   }

   private static void id_super() {
      id_throws = new short[4];
   }
}
