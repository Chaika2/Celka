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
      this.id_class[id_protected[0]] = var5;
      return rrQf_1.id_class(var0 -> jI_2.id_class(id_byte[3]), (ExecutorService)this.id_class[id_protected[1]])
         .thenComposeAsync(var1 -> rrQf_1.id_protected(var1, (ExecutorService)this.id_class[id_protected[22]]))
         .thenComposeAsync(var1 -> rrQf_1.id_class(var1, (ExecutorService)this.id_class[id_protected[21]]))
         .thenComposeAsync(var1 -> rrQf_1.id_byte(var1, (ExecutorService)this.id_class[id_protected[20]]))
         .thenComposeAsync(var1 -> rrQf_1.id_class(var1.get(id_byte[1]), var1.get(id_byte[2]), (ExecutorService)this.id_class[id_protected[19]]))
         .thenComposeAsync(var1 -> rrQf_1.id_break(var1, (ExecutorService)this.id_class[id_protected[18]]))
         .thenAccept(var1 -> {
            rrQg_1.id_class(var1);
            ((Logger)QY.id_break[id_protected[16]]).info(id_byte[0]);
            ((ExecutorService)this.id_class[id_protected[17]]).shutdownNow();
         })
         .exceptionally(var1 -> {
            ((ExecutorService)this.id_class[id_protected[15]]).shutdownNow();
            return null;
         });
   }

   public rrQW(String var1, String var2, UUID var3, rrQd_1 var4) {
      this.id_implements();
      this.id_class[id_protected[11]] = var1;
      this.id_class[id_protected[12]] = var2;
      this.id_class[id_protected[13]] = var3;
      this.id_class[id_protected[14]] = var4;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_throws[0];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrQW var2 = (rrQW)var1;
         return Objects.equals((String)this.id_class[id_protected[3]], (String)var2.id_class[id_protected[4]]);
      } else {
         return id_throws[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[id_throws[2]];
      var10000[id_throws[3]] = (String)this.id_class[id_protected[5]];
      return Objects.hash(var10000);
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
      return (String)this.id_class[id_protected[6]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5469656806315892186L;
   }

   @Override
   public void close() throws Exception {
      ((ExecutorService)this.id_class[id_protected[2]]).shutdownNow();
   }

   @Override
   public rrQd_1 id_break() {
      return (rrQd_1)this.id_class[id_protected[9]];
   }

   public ExecutorService id_throws() {
      return (ExecutorService)this.id_class[id_protected[10]];
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
      return (String)this.id_class[id_protected[7]];
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   @Override
   public UUID id_protected() {
      return (UUID)this.id_class[id_protected[8]];
   }

   private static void id_private() {
      id_throws = new boolean[]{true, false, true, false, false};
   }
}
