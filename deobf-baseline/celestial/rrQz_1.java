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
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;
   private static String[] id_throws;

   @Override
   public CompletableFuture<Void> id_byte() {
      ExecutorService var5 = Executors.newSingleThreadExecutor();
      this.id_class[id_byte[0]] = var5;
      return rrQV.id_class((String)this.id_class[id_byte[1]], (String)this.id_class[id_byte[2]], (ExecutorService)this.id_class[id_byte[3]])
         .thenAccept(var1 -> {
            rrQg_1.id_class(var1);
            ((Logger)QY.id_break[id_byte[18]]).info(id_throws[0]);
            ((ExecutorService)this.id_class[id_byte[19]]).shutdownNow();
         })
         .exceptionally(var1 -> {
            ((ExecutorService)this.id_class[id_byte[17]]).shutdownNow();
            return null;
         });
   }

   public rrQz_1(String var1, String var2, UUID var3, rrQd_1 var4) {
      this.id_catch();
      this.id_class[id_byte[13]] = var1;
      this.id_class[id_byte[14]] = var2;
      this.id_class[id_byte[15]] = var3;
      this.id_class[id_byte[16]] = var4;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_break[0];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrQz_1 var2 = (rrQz_1)var1;
         return Objects.equals((String)this.id_class[id_byte[5]], (String)var2.id_class[id_byte[6]]);
      } else {
         return id_break[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[id_break[2]];
      var10000[id_break[3]] = (String)this.id_class[id_byte[7]];
      return Objects.hash(var10000);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 654526881;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5794330955810359832L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{24, 46, 102, 76, -41, 91, 95, -80}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public String id_class() {
      return (String)this.id_class[id_byte[8]];
   }

   @Override
   public void close() throws Exception {
      ((ExecutorService)this.id_class[id_byte[4]]).shutdownNow();
   }

   @Override
   public rrQd_1 id_break() {
      return (rrQd_1)this.id_class[id_byte[11]];
   }

   public ExecutorService id_throws() {
      return (ExecutorService)this.id_class[id_byte[12]];
   }

   private static void id_finally() {
      id_throws = new String[]{new String("Successfully logged in via Mojang (or legacy)!")};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_extends() {
      id_protected = new byte[]{5};
   }

   public String id_case() {
      return (String)this.id_class[id_byte[9]];
   }

   private static void id_implements() {
      id_break = new boolean[]{true, false, true, false};
   }

   @Override
   public UUID id_protected() {
      return (UUID)this.id_class[id_byte[10]];
   }

   private static void id_private() {
      id_byte = new short[]{4, 0, 1, 4, 4, 0, 0, 0, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 1, 4};
   }
}
