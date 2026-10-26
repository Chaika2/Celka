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
   private static byte[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   public static Object[] break_;
   private static short[] throws_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   public rrjp_3(String var1, BooleanSupplier var2, Runnable var3) {
      this(var1, var2, var3, null);
   }

   public rrjp_3(String var1, BooleanSupplier var2, Runnable var3, Consumer<List<ProtocolVersion>> var4) {
      this.byte_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
      this.class_[3] = var4;
   }

   static {
      ntfClinit();
   }

   public void class_(Logger var1) {
      if (((BooleanSupplier)this.class_[1]).getAsBoolean()) {
         try {
            ((Runnable)this.class_[throws_[8]]).run();
            var1.info("Loaded Platform " + (String)this.class_[throws_[9]]);
            Integer var7 = (Integer)break_[throws_[10]] + protected_[0];
            break_[throws_[11]] = var7;
         } catch (Throwable var8) {
            var1.severe("An error occurred while loading Platform " + (String)this.class_[0] + ":");
            var8.printStackTrace();
         }
      } else {
         var1.severe("Platform " + (String)this.class_[0] + " is not present");
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2078776150;
   }

   public void class_() {
      if ((Consumer)this.class_[3] != null) {
         ((Consumer)this.class_[3]).accept((List)break_[1]);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{121, -18, -14, -7, -21, 9, 127, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6035266161339642256L;
   }

   public String break_() {
      return (String)this.class_[0];
   }

   private static void throws_() {
      protected_ = new boolean[]{true, false, false, true, false, false};
   }

   private static void catch_() {
      byte_ = new byte[]{4, 2};
   }

   private static void case_() {
      throws_ = new short[]{0, 1, 2, 3, 3, 3, 1, 1, 2, 0, 0, 0, 0, 0, 0};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{0, new ArrayList()};
      break_ = var0;
   }
}
