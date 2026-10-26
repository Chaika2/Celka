package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQQ implements rrQx_1 {
   private static boolean[] break_;
   public Object[] class_;
   private static String[] byte_;
   private static short[] protected_;
   private static byte[] throws_;

   @Override
   public CompletableFuture<Void> byte_() {
      return CompletableFuture.runAsync(() -> {
         rqN_2 var1 = rrQg_1.break_((String)this.class_[0]);
         rrQg_1.class_(var1);
         ((Logger)QY.break_[1]).info("Successfully logged in offline-mode!");
      });
   }

   public rrQQ(String var1, UUID var2, rrQd_1 var3) {
      this.catch_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrQQ var2 = (rrQQ)var1;
         return Objects.equals((String)this.class_[0], (String)var2.class_[0]);
      } else {
         return break_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((String)this.class_[0]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5637517887135397765L;
   }

   @Override
   public String class_() {
      return (String)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 162408847;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, -26, 83, -8, -40, 118, 15, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rrQd_1 break_() {
      return (rrQd_1)this.class_[2];
   }

   private static void throws_() {
      throws_ = new byte[]{3};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      break_ = new boolean[]{true, false, true, false};
   }

   private static void implements_() {
      protected_ = new short[]{0, 0, 0, 0, 1, 2, 0, 1, 2, 0, 1};
   }

   @Override
   public UUID protected_() {
      return (UUID)this.class_[1];
   }

   private static void private_() {
      byte_ = new String[]{new String("Successfully logged in offline-mode!")};
   }
}
