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

public class rrQW implements AutoCloseable, rrQx_1 {
   private static byte[] break_;
   private static String[] byte_;
   private static short[] protected_;
   public Object[] class_;
   private static boolean[] throws_;

   @Override
   public CompletableFuture<Void> byte_() {
      ExecutorService var5 = Executors.newSingleThreadExecutor();
      this.class_[4] = var5;
      return rrQf_1.class_(var0 -> jI_2.class_("gui.authme.microsoft.browser"), (ExecutorService)this.class_[4])
         .thenComposeAsync(var1 -> rrQf_1.protected_(var1, (ExecutorService)this.class_[4]))
         .thenComposeAsync(var1 -> rrQf_1.class_(var1, (ExecutorService)this.class_[4]))
         .thenComposeAsync(var1 -> rrQf_1.byte_(var1, (ExecutorService)this.class_[4]))
         .thenComposeAsync(var1 -> rrQf_1.class_(var1.get("Token"), var1.get("uhs"), (ExecutorService)this.class_[4]))
         .thenComposeAsync(var1 -> rrQf_1.break_(var1, (ExecutorService)this.class_[4]))
         .thenAccept(var1 -> {
            rrQg_1.class_(var1);
            ((Logger)QY.break_[1]).info("Successfully logged in via Microsoft!");
            ((ExecutorService)this.class_[4]).shutdownNow();
         })
         .exceptionally(var1 -> {
            ((ExecutorService)this.class_[4]).shutdownNow();
            return null;
         });
   }

   public rrQW(String var1, String var2, UUID var3, rrQd_1 var4) {
      this.implements_();
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
         rrQW var2 = (rrQW)var1;
         return Objects.equals((String)this.class_[0], (String)var2.class_[0]);
      } else {
         return throws_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((String)this.class_[0]);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{71, -44, -79, -3, 51, 31, 80, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2102987980;
   }

   @Override
   public String class_() {
      return (String)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5469656806315892186L;
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
      byte_ = new String[]{
         new String("Successfully logged in via Microsoft!"), new String("Token"), new String("uhs"), new String("gui.authme.microsoft.browser")
      };
   }

   private static void catch_() {
      break_ = new byte[]{5};
   }

   private static void extends_() {
      protected_ = new short[]{4, 4, 4, 0, 0, 0, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 1, 4, 4, 4, 4, 4, 4};
   }

   public String case_() {
      return (String)this.class_[1];
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
      }
   }

   @Override
   public UUID protected_() {
      return (UUID)this.class_[2];
   }

   private static void private_() {
      throws_ = new boolean[]{true, false, true, false, false};
   }
}
