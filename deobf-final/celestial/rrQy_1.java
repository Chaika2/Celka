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
   private static short[] case_;
   private static int[] catch_;
   public Object[] throws_;
   private static boolean[] private_;
   private static byte[] implements_;
   private static String[] finally_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, 86, -76, 82, -50, 80, 115, 118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void int_() {
      implements_ = new byte[]{2, 50, 2, 22, 100, 20, 2, 2, 32, 2, 2, 6, 4};
   }

   public rrQy_1(rrQC var1, vm_3 var2, vm_3 var3) {
      super(new rgn_3("gui.authme.mojang.title"), var2, var3);
      this.final_();
      this.throws_[0] = var1;
      ((Qj_1)import_.class_[23]).class_(false);
      Boolean var9 = true;
      this.class_[3] = var9;
   }

   static {
      ntfClinit();
   }

   private static void interface_() {
      finally_ = new String[]{
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

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6626693363781851884L;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.final_();
      this.class_(var1);
      this.super_.class_(var1, this.extends_, this.package_ / 2, this.int_ / 2 - 32, 16777215);
      if ((rgP_2)this.throws_[3] != null) {
         this.super_.class_(var1, (rgP_2)this.throws_[3], this.package_ / 2, this.int_ / 2 - 6, 14540253);
      }

      super.class_(var1, var2, var3, var4);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1721323450;
   }

   private static void finally_() {
      private_ = new boolean[]{false, true, true, true, true, true, false};
   }

   private static void package_() {
      case_ = new short[]{0, 23, 3, 3, 1, 1, 2, 3, 3, 2, 2, 2, 1, 3, 0, 3, 0, 1, 2, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1};
   }

   private void final_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[4];
         Object[] var1 = this.throws_;
      }
   }

   @Override
   public void volatile_() {
      this.final_();
      if ((CompletableFuture)this.throws_[2] != null && !((CompletableFuture)this.throws_[2]).isDone()) {
         ((CompletableFuture)this.throws_[2]).cancel(true);
         ((ExecutorService)this.throws_[1]).shutdownNow();
      }

      super.volatile_();
   }

   private static void native_() {
      catch_ = new int[]{16777215, 14540253};
   }

   @Override
   public void v_() {
      this.final_();
      super.v_();
      LF var1;
      this.class_((LF)(var1 = new LF(this.package_ / 2 - 50, this.int_ / 2 + 22, 100, 20, new rgn_3("gui.cancel"), var1x -> this.volatile_())));
      rgn_3 var6 = new rgn_3("gui.authme.microsoft.status.checkBrowser");
      this.throws_[3] = var6;
      ExecutorService var7 = Executors.newSingleThreadExecutor();
      this.throws_[1] = var7;
      CompletableFuture var8 = rrQf_1.class_(var0 -> jI_2.class_("gui.authme.microsoft.browser"), (ExecutorService)this.throws_[1])
         .thenComposeAsync(var1x -> {
            this.final_();
            rgn_3 var6x = new rgn_3("gui.authme.microsoft.status.msAccessToken");
            this.throws_[3] = var6x;
            return rrQf_1.protected_(var1x, (ExecutorService)this.throws_[1]);
         })
         .thenComposeAsync(var1x -> {
            this.final_();
            rgn_3 var6x = new rgn_3("gui.authme.microsoft.status.xboxAccessToken");
            this.throws_[3] = var6x;
            return rrQf_1.class_(var1x, (ExecutorService)this.throws_[1]);
         })
         .thenComposeAsync(var1x -> {
            this.final_();
            rgn_3 var6x = new rgn_3("gui.authme.microsoft.status.xboxXstsToken");
            this.throws_[3] = var6x;
            return rrQf_1.byte_(var1x, (ExecutorService)this.throws_[1]);
         })
         .thenComposeAsync(var1x -> {
            this.final_();
            rgn_3 var6x = new rgn_3("gui.authme.microsoft.status.mcAccessToken");
            this.throws_[3] = var6x;
            return rrQf_1.class_(var1x.get("Token"), var1x.get("uhs"), (ExecutorService)this.throws_[1]);
         })
         .thenComposeAsync(var1x -> {
            this.final_();
            rgn_3 var6x = new rgn_3("gui.authme.microsoft.status.mcProfile");
            this.throws_[3] = var6x;
            return rrQf_1.break_(var1x, (ExecutorService)this.throws_[1]);
         })
         .thenAccept(
            var1x -> {
               this.final_();
               if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0])
                  .class_(
                     new rrQW(var1x.byte_(), var1x.protected_(), rrQV.class_(var1x.byte_()), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[3]),
                     true,
                     true
                  )) {
                  ((rrQC)this.throws_[0]).native_();
                  rrQg_1.class_(var1x);
                  ((Logger)QY.break_[1]).info("Successfully logged in via Microsoft!");
                  Boolean var6x = true;
                  this.class_[2] = var6x;
               }
            }
         )
         .exceptionally(var2 -> {
            this.final_();
            rVi_1 var7x = new rgn_3(var2.getCause() instanceof ConnectTimeoutException ? "gui.authme.error.timeout" : finally_[4]).class_(rgF_2.RED);
            this.throws_[3] = var7x;
            var1.break_(new rgn_3("gui.back"));
            return null;
         });
      this.throws_[2] = var8;
   }
}
