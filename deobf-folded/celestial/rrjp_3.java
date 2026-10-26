package celestial;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjp_3 {
   private static byte[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   public static Object[] id_break;
   private static short[] id_throws;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
      }
   }

   public rrjp_3(String var1, BooleanSupplier var2, Runnable var3) {
      this(var1, var2, var3, null);
   }

   public rrjp_3(String var1, BooleanSupplier var2, Runnable var3, Consumer<List<ProtocolVersion>> var4) {
      this.id_byte();
      this.id_class[id_throws[0]] = var1;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
      this.id_class[3] = var4;
   }

   static {
      ntfClinit();
   }

   public void id_class(Logger var1) {
      if (((BooleanSupplier)this.id_class[1]).getAsBoolean()) {
         try {
            ((Runnable)this.id_class[2]).run();
            var1.info("Loaded Platform " + (String)this.id_class[id_throws[9]]);
            Integer var7 = (Integer)id_break[id_throws[10]] + 1;
            id_break[id_throws[11]] = var7;
         } catch (Throwable var8) {
            var1.severe("An error occurred while loading Platform " + (String)this.id_class[id_throws[12]] + ":");
            var8.printStackTrace();
         }
      } else {
         var1.severe("Platform " + (String)this.id_class[id_throws[13]] + " is not present");
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2078776150;
   }

   public void id_class() {
      if ((Consumer)this.id_class[3] != null) {
         ((Consumer)this.id_class[3]).accept((List)id_break[1]);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{121, -18, -14, -7, -21, 9, 127, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6035266161339642256L;
   }

   public String id_break() {
      return (String)this.id_class[id_throws[14]];
   }

   private static void id_throws() {
      id_protected = new boolean[]{true, false, false, true, false, false};
   }

   private static void id_catch() {
      id_byte = new byte[]{4, 2};
   }

   private static void id_case() {
      id_throws = new short[]{0, 1, 2, 3, 3, 3, 1, 1, 2, 0, 0, 0, 0, 0, 0};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{0, new ArrayList()};
      id_break = var0;
   }
}
