package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sg_3 extends C_try {
   private static short[] id_break;
   private static boolean[] id_throws;
   private static byte[] id_case;
   private static String[] id_catch;

   public sg_3(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_throws[1]] = id_catch[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1158356882;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 81525537217817591L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(id_throws[2]);
      rc_3 var3 = ((C_case)this.id_class[id_break[0]]).id_import();
      rP_2 var4;
      if ((var4 = var3.id_private()) == null) {
         throw new k_1(id_catch[1]);
      } else {
         if (var4 instanceof rG_2) {
            var4 = (rP_2)((rG_2)var4).id_class[id_break[1]];
         } else {
            var4 = new rG_2(var4);
         }

         var3.id_break(var4);
         String var10001 = id_catch[2];
         Object[] var10002 = new Object[1];
         var10002[id_throws[4]] = var4.toString();
         this.id_case(String.format(var10001, var10002));
      }
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-87, -116, -39, -33, -108, -30, 38, 77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_case = new byte[]{4, 2, 3};
   }

   private static void id_finally() {
      id_throws = new boolean[]{true, false, false, true, false, false, true};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[4];
      var10000[id_throws[5]] = id_catch[4];
      var10000[1] = id_catch[5];
      var10000[2] = id_catch[6];
      var10000[3] = id_catch[7];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_break = new short[2];
   }

   @Override
   public String id_implements() {
      return id_catch[3];
   }

   private static void id_protected() {
      id_catch = new String[]{
         new String("invert"),
         new String("No goal"),
         new String("Goal: %s"),
         new String("Run away from the current goal"),
         new String("The invert command tells Baritone to head away from the current goal rather than towards it."),
         new String(""),
         new String("Usage:"),
         new String("> invert - Invert the current goal.")
      };
   }
}
