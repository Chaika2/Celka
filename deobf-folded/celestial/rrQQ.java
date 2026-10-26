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
   private static boolean[] id_break;
   public Object[] id_class;
   private static String[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;

   @Override
   public CompletableFuture<Void> id_byte() {
      return CompletableFuture.runAsync(() -> {
         rqN_2 var1 = rrQg_1.id_break((String)this.id_class[id_protected[9]]);
         rrQg_1.id_class(var1);
         ((Logger)QY.id_break[1]).info(id_byte[0]);
      });
   }

   public rrQQ(String var1, UUID var2, rrQd_1 var3) {
      this.id_catch();
      this.id_class[id_protected[6]] = var1;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
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
         return Objects.equals((String)this.id_class[id_protected[0]], (String)var2.id_class[id_protected[1]]);
      } else {
         return id_break[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[1];
      var10000[id_break[3]] = (String)this.id_class[id_protected[2]];
      return Objects.hash(var10000);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5637517887135397765L;
   }

   @Override
   public String id_class() {
      return (String)this.id_class[id_protected[3]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 162408847;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, -26, 83, -8, -40, 118, 15, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rrQd_1 id_break() {
      return (rrQd_1)this.id_class[2];
   }

   private static void id_throws() {
      id_throws = new byte[]{3};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_break = new boolean[]{true, false, true, false};
   }

   private static void id_implements() {
      id_protected = new short[]{0, 0, 0, 0, 1, 2, 0, 1, 2, 0, 1};
   }

   @Override
   public UUID id_protected() {
      return (UUID)this.id_class[1];
   }

   private static void id_private() {
      id_byte = new String[]{new String("Successfully logged in offline-mode!")};
   }
}
