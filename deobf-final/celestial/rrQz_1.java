package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQz_1 implements AutoCloseable, rrQx_1 {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;
   private static byte[] protected_;
   private static String[] throws_;

   @Override
   public CompletableFuture<Void> byte_() {
      ExecutorService var5 = Executors.newSingleThreadExecutor();
      this.class_[4] = var5;
      return rrQV.class_((String)this.class_[0], (String)this.class_[1], (ExecutorService)this.class_[4]).thenAccept(var1 -> {
         rrQg_1.class_(var1);
         ((Logger)QY.break_[1]).info("Successfully logged in via Mojang (or legacy)!");
         ((ExecutorService)this.class_[4]).shutdownNow();
      }).exceptionally(var1 -> {
         ((ExecutorService)this.class_[4]).shutdownNow();
         return null;
      });
   }

   public rrQz_1(String var1, String var2, UUID var3, rrQd_1 var4) {
      this.catch_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
      this.class_[3] = var4;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrQz_1 var2 = (rrQz_1)var1;
         return Objects.equals((String)this.class_[0], (String)var2.class_[0]);
      } else {
         return break_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((String)this.class_[0]);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 654526881;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5794330955810359832L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{24, 46, 102, 76, -41, 91, 95, -80}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public String class_() {
      return (String)this.class_[0];
   }

   @Override
   public void close() throws Exception {
      ((ExecutorService)this.class_[4]).shutdownNow();
   }

   @Override
   public rrQd_1 break_() {
      return (rrQd_1)this.class_[3];
   }

   public ExecutorService throws_() {
      return (ExecutorService)this.class_[4];
   }

   private static void finally_() {
      throws_ = new String[]{new String("Successfully logged in via Mojang (or legacy)!")};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
      }
   }

   private static void extends_() {
      protected_ = new byte[]{5};
   }

   public String case_() {
      return (String)this.class_[1];
   }

   private static void implements_() {
      break_ = new boolean[]{true, false, true, false};
   }

   @Override
   public UUID protected_() {
      return (UUID)this.class_[2];
   }

   private static void private_() {
      byte_ = new short[]{4, 0, 1, 4, 4, 0, 0, 0, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 1, 4};
   }
}
