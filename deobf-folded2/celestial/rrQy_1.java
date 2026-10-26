package celestial;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.logging.log4j.Logger;

public class rrQy_1 extends rrQH {
   private static short[] id_case;
   private static int[] id_catch;
   public Object[] id_throws;
   private static boolean[] id_private;
   private static byte[] id_implements;
   private static String[] id_finally;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, 86, -76, 82, -50, 80, 115, 118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_int() {
      id_implements = new byte[]{2, 50, 2, 22, 100, 20, 2, 2, 32, 2, 2, 6, 4};
   }

   public rrQy_1(rrQC var1, vm_3 var2, vm_3 var3) {
      super(new rgn_3("gui.authme.mojang.title"), var2, var3);
      this.id_final();
      this.id_throws[0] = var1;
      ((Qj_1)id_import.id_class[23]).id_class(false);
      Boolean var9 = true;
      this.id_class[3] = var9;
   }

   static {
      ntfClinit();
   }

   private static void id_interface() {
      id_finally = new String[]{
         new String("gui.authme.mojang.title"),
         new String("gui.cancel"),
         new String("gui.authme.microsoft.status.checkBrowser"),
         new String("gui.authme.error.timeout"),
         new String("gui.authme.error.generic"),
         new String("gui.back"),
         new String("Successfully logged in via Microsoft!"),
         new String("gui.authme.microsoft.status.mcProfile"),
         new String("gui.authme.microsoft.status.mcAccessToken"),
         new String("Token"),
         new String("uhs"),
         new String("gui.authme.microsoft.status.xboxXstsToken"),
         new String("gui.authme.microsoft.status.xboxAccessToken"),
         new String("gui.authme.microsoft.status.msAccessToken"),
         new String("gui.authme.microsoft.browser")
      };
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6626693363781851884L;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_final();
      this.id_class(var1);
      this.id_super.id_class(var1, this.id_extends, this.id_package / 2, this.id_int / 2 - 32, 16777215);
      if ((rgP_2)this.id_throws[3] != null) {
         this.id_super.id_class(var1, (rgP_2)this.id_throws[3], this.id_package / 2, this.id_int / 2 - 6, 14540253);
      }

      super.id_class(var1, var2, var3, var4);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1721323450;
   }

   private static void id_finally() {
      id_private = new boolean[]{false, true, true, true, true, true, false};
   }

   private static void id_package() {
      id_case = new short[]{0, 23, 3, 3, 1, 1, 2, 3, 3, 2, 2, 2, 1, 3, 0, 3, 0, 1, 2, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1};
   }

   private void id_final() {
      if (this.id_throws == null) {
         this.id_throws = new Object[4];
         Object[] var1 = this.id_throws;
      }
   }

   @Override
   public void id_volatile() {
      this.id_final();
      if ((CompletableFuture)this.id_throws[2] != null && !((CompletableFuture)this.id_throws[2]).isDone()) {
         ((CompletableFuture)this.id_throws[2]).cancel(true);
         ((ExecutorService)this.id_throws[1]).shutdownNow();
      }

      super.id_volatile();
   }

   private static void id_native() {
      id_catch = new int[]{16777215, 14540253};
   }

   @Override
   public void v_() {
      this.id_final();
      super.v_();
      LF var1;
      this.id_class((LF)(var1 = new LF(this.id_package / 2 - 50, this.id_int / 2 + 22, 100, 20, new rgn_3("gui.cancel"), var1x -> this.id_volatile())));
      rgn_3 var6 = new rgn_3("gui.authme.microsoft.status.checkBrowser");
      this.id_throws[3] = var6;
      ExecutorService var7 = Executors.newSingleThreadExecutor();
      this.id_throws[1] = var7;
      CompletableFuture var8 = rrQf_1.id_class(var0 -> jI_2.id_class("gui.authme.microsoft.browser"), (ExecutorService)this.id_throws[1])
         .thenComposeAsync(var1x -> {
            this.id_final();
            rgn_3 var6x = new rgn_3("gui.authme.microsoft.status.msAccessToken");
            this.id_throws[3] = var6x;
            return rrQf_1.id_protected(var1x, (ExecutorService)this.id_throws[1]);
         })
         .thenComposeAsync(var1x -> {
            this.id_final();
            rgn_3 var6x = new rgn_3("gui.authme.microsoft.status.xboxAccessToken");
            this.id_throws[3] = var6x;
            return rrQf_1.id_class(var1x, (ExecutorService)this.id_throws[1]);
         })
         .thenComposeAsync(var1x -> {
            this.id_final();
            rgn_3 var6x = new rgn_3("gui.authme.microsoft.status.xboxXstsToken");
            this.id_throws[3] = var6x;
            return rrQf_1.id_byte(var1x, (ExecutorService)this.id_throws[1]);
         })
         .thenComposeAsync(var1x -> {
            this.id_final();
            rgn_3 var6x = new rgn_3("gui.authme.microsoft.status.mcAccessToken");
            this.id_throws[3] = var6x;
            return rrQf_1.id_class(var1x.get("Token"), var1x.get("uhs"), (ExecutorService)this.id_throws[1]);
         })
         .thenComposeAsync(var1x -> {
            this.id_final();
            rgn_3 var6x = new rgn_3("gui.authme.microsoft.status.mcProfile");
            this.id_throws[3] = var6x;
            return rrQf_1.id_break(var1x, (ExecutorService)this.id_throws[1]);
         })
         .thenAccept(
            var1x -> {
               this.id_final();
               if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0])
                  .id_class(
                     new rrQW(
                        var1x.id_byte(), var1x.id_protected(), rrQV.id_class(var1x.id_byte()), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[3]
                     ),
                     true,
                     true
                  )) {
                  ((rrQC)this.id_throws[0]).id_native();
                  rrQg_1.id_class(var1x);
                  ((Logger)QY.id_break[1]).info("Successfully logged in via Microsoft!");
                  Boolean var6x = true;
                  this.id_class[2] = var6x;
               }
            }
         )
         .exceptionally(var2 -> {
            this.id_final();
            rVi_1 var7x = new rgn_3(var2.getCause() instanceof ConnectTimeoutException ? "gui.authme.error.timeout" : id_finally[4]).id_class(rgF_2.RED);
            this.id_throws[3] = var7x;
            var1.id_break(new rgn_3("gui.back"));
            return null;
         });
      this.id_throws[2] = var8;
   }
}
