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
   private static byte[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   private static boolean[] id_throws;

   @Override
   public CompletableFuture<Void> id_byte() {
      ExecutorService var5 = Executors.newSingleThreadExecutor();
      this.id_class[4] = var5;
      return rrQf_1.id_class(var0 -> jI_2.id_class("gui.authme.microsoft.browser"), (ExecutorService)this.id_class[4])
         .thenComposeAsync(var1 -> rrQf_1.id_protected(var1, (ExecutorService)this.id_class[4]))
         .thenComposeAsync(var1 -> rrQf_1.id_class(var1, (ExecutorService)this.id_class[4]))
         .thenComposeAsync(var1 -> rrQf_1.id_byte(var1, (ExecutorService)this.id_class[4]))
         .thenComposeAsync(var1 -> rrQf_1.id_class(var1.get("Token"), var1.get("uhs"), (ExecutorService)this.id_class[4]))
         .thenComposeAsync(var1 -> rrQf_1.id_break(var1, (ExecutorService)this.id_class[4]))
         .thenAccept(var1 -> {
            rrQg_1.id_class(var1);
            ((Logger)QY.id_break[1]).info("Successfully logged in via Microsoft!");
            ((ExecutorService)this.id_class[4]).shutdownNow();
         })
         .exceptionally(var1 -> {
            ((ExecutorService)this.id_class[4]).shutdownNow();
            return null;
         });
   }

   public rrQW(String var1, String var2, UUID var3, rrQd_1 var4) {
      this.id_implements();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
      this.id_class[3] = var4;
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
         return Objects.equals((String)this.id_class[0], (String)var2.id_class[0]);
      } else {
         return id_throws[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((String)this.id_class[0]);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{71, -44, -79, -3, 51, 31, 80, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2102987980;
   }

   @Override
   public String id_class() {
      return (String)this.id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5469656806315892186L;
   }

   @Override
   public void close() throws Exception {
      ((ExecutorService)this.id_class[4]).shutdownNow();
   }

   @Override
   public rrQd_1 id_break() {
      return (rrQd_1)this.id_class[3];
   }

   public ExecutorService id_throws() {
      return (ExecutorService)this.id_class[4];
   }

   private static void id_finally() {
      id_byte = new String[]{
         new String("Successfully logged in via Microsoft!"), new String("Token"), new String("uhs"), new String("gui.authme.microsoft.browser")
      };
   }

   private static void id_catch() {
      id_break = new byte[]{5};
   }

   private static void id_extends() {
      id_protected = new short[]{4, 4, 4, 0, 0, 0, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 1, 4, 4, 4, 4, 4, 4};
   }

   public String id_case() {
      return (String)this.id_class[1];
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         Object[] var1 = this.id_class;
      }
   }

   @Override
   public UUID id_protected() {
      return (UUID)this.id_class[2];
   }

   private static void id_private() {
      id_throws = new boolean[]{true, false, true, false, false};
   }
}
