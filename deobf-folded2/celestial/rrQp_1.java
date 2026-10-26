package celestial;

import com.mojang.authlib.exceptions.InvalidCredentialsException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQp_1 extends rrQH {
   private static int[] id_case;
   private static String[] id_catch;
   private static short[] id_private;
   private static boolean[] id_implements;
   private static byte[] id_finally;
   public Object[] id_throws;

   private static void id_char() {
      id_catch = new String[]{
         new String("gui.authme.mojang.title"),
         new String("gui.authme.mojang.field.username"),
         new String("gui.authme.mojang.field.password"),
         new String("gui.authme.mojang.button.login"),
         new String("gui.cancel"),
         new String("gui.authme.mojang.status.loggingIn"),
         new String("gui.authme.error.credentials"),
         new String("gui.authme.error.generic"),
         new String("Successfully logged in via Mojang (or legacy)!")
      };
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{15, 33, 9, 112, 4, -126, -46, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_int() {
      id_finally = new byte[]{2, 100, 2, 39, 20, 2, 100, 2, 6, 20, 2, 100, 2, 2, 59, 100, 20, 2, 2, 2, 59, 100, 20, 2, 16, 23, 16, 16, 2, 20, 7};
   }

   public rrQp_1(rrQC var1, vm_3 var2, vm_3 var3) {
      super(new rgn_3("gui.authme.mojang.title"), var2, var3);
      this.id_interface();
      Object var8 = null;
      this.id_throws[1] = var8;
      Object var9 = null;
      this.id_throws[2] = var9;
      Object var10 = null;
      this.id_throws[3] = var10;
      this.id_throws[0] = var1;
      Boolean var12 = true;
      this.id_class[3] = var12;
   }

   static {
      ntfClinit();
   }

   private void id_interface() {
      if (this.id_throws == null) {
         this.id_throws = new Object[7];
         Object[] var1 = this.id_throws;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 498612066035982819L;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_interface();
      if ((var1 == 257 || var1 == 335) && ((LF)this.id_throws[6]).id_int) {
         this.id_native();
         return true;
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_interface();
      this.id_class(var1);
      this.id_super.id_class(var1, this.id_extends, this.id_package / 2, ((Lu_1)this.id_throws[4]).id_final - 16 - 23, 16777215);
      this.id_super
         .id_break(
            var1, ((Lu_1)this.id_throws[4]).C_(), (float)((Lu_1)this.id_throws[4]).id_volatile, (float)(((Lu_1)this.id_throws[4]).id_final - 16), 10526880
         );
      this.id_super
         .id_break(
            var1, ((Lu_1)this.id_throws[5]).C_(), (float)((Lu_1)this.id_throws[5]).id_volatile, (float)(((Lu_1)this.id_throws[5]).id_final - 16), 10526880
         );
      if ((rgP_2)this.id_throws[3] != null) {
         this.id_super.id_class(var1, (rgP_2)this.id_throws[3], this.id_package / 2, ((LF)this.id_throws[6]).id_final - 20, 14540253);
      }

      super.id_class(var1, var2, var3, var4);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1321975579;
   }

   public boolean id_finally() {
      this.id_interface();
      return !((Lu_1)this.id_throws[4]).id_private().isEmpty() && !((Lu_1)this.id_throws[5]).id_private().isEmpty() ? true : id_implements[8];
   }

   private static void id_package() {
      id_private = new short[]{
         1,
         2,
         3,
         0,
         3,
         23,
         200,
         4,
         4,
         128,
         4,
         4,
         200,
         5,
         5,
         6,
         6,
         4,
         23,
         4,
         5,
         6,
         3,
         1,
         4,
         5,
         1,
         2,
         4,
         5,
         4,
         4,
         4,
         4,
         5,
         5,
         5,
         3,
         3,
         6,
         4,
         5,
         2,
         2,
         2,
         1,
         257,
         335,
         6,
         4,
         5,
         3,
         4,
         5,
         0,
         2,
         0,
         1,
         0,
         1,
         1,
         4,
         2,
         6,
         6
      };
   }

   @Override
   public void id_private() {
      this.id_interface();
      super.id_private();
      ((Lu_1)this.id_throws[4]).id_catch();
      ((Lu_1)this.id_throws[5]).id_catch();
   }

   private static void id_abstract() {
      id_case = new int[]{16777215, 10526880, 10526880, 14540253};
   }

   private static void id_final() {
      id_implements = new boolean[]{true, true, true, false, false, false, false, true, false, true, false, true, true, true, true, true, true, true};
   }

   @Override
   public void id_volatile() {
      this.id_interface();
      if ((CompletableFuture)this.id_throws[2] != null && !((CompletableFuture)this.id_throws[2]).isDone()) {
         ((CompletableFuture)this.id_throws[2]).cancel(true);
         ((ExecutorService)this.id_throws[1]).shutdownNow();
      }

      super.id_volatile();
   }

   public void id_native() {
      this.id_interface();
      if (this.id_finally()) {
         ((Lu_1)this.id_throws[4]).id_int = false;
         ((Lu_1)this.id_throws[5]).id_int = false;
         ((LF)this.id_throws[6]).id_int = false;
         rgn_3 var5 = new rgn_3("gui.authme.mojang.status.loggingIn");
         this.id_throws[3] = var5;
         ExecutorService var6 = Executors.newSingleThreadExecutor();
         this.id_throws[1] = var6;
         CompletableFuture var7 = rrQV.id_class(
               ((Lu_1)this.id_throws[4]).id_private(), ((Lu_1)this.id_throws[5]).id_private(), (ExecutorService)this.id_throws[1]
            )
            .thenAccept(
               var1 -> {
                  this.id_interface();
                  if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0])
                     .id_class(
                        new rrQz_1(
                           var1.id_byte(), var1.id_protected(), rrQV.id_class(var1.id_byte()), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[2]
                        ),
                        true,
                        true
                     )) {
                     ((rrQC)this.id_throws[0]).id_native();
                     ((Logger)QY.id_break[1]).info("Successfully logged in via Mojang (or legacy)!");
                     rrQg_1.id_class(var1);
                     ((rrQZ)((rrQu_1)((rrQN)rrQN.staticFields065bd3322daf3178a8bd0d03c4b20e54[0]).fields065bd3322daf3178a8bd0d03c4b20e54[1]).id_class[1]).id_class = ((Lu_1)this.id_throws[4])
                        .id_private();
                     Boolean var6x = true;
                     this.id_class[2] = var6x;
                  }
               }
            )
            .exceptionally(var1 -> {
               this.id_interface();
               rVi_1 var6x = new rgn_3(var1.getCause() instanceof InvalidCredentialsException ? "gui.authme.error.credentials" : id_catch[7])
                  .id_class(rgF_2.RED);
               this.id_throws[3] = var6x;
               ((Lu_1)this.id_throws[4]).id_int = true;
               ((Lu_1)this.id_throws[5]).id_int = true;
               return null;
            });
         this.id_throws[2] = var7;
      }
   }

   @Override
   public boolean E_() {
      this.id_interface();
      return !((Lu_1)this.id_throws[4]).aO_() && !((Lu_1)this.id_throws[5]).aO_() ? true : id_implements[10];
   }

   @Override
   public void v_() {
      this.id_interface();
      super.v_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      Lu_1 var5;
      Lu_1 var10001 = var5 = new Lu_1(this.id_super, this.id_package / 2 - 100, this.id_int / 2 - 39, 200, 20, new rgn_3("gui.authme.mojang.field.username"));
      this.id_throws[4] = var5;
      this.id_class(var10001);
      ((Lu_1)this.id_throws[4]).id_implements(128);
      ((Lu_1)this.id_throws[4]).id_class(var1 -> {
         this.id_interface();
         ((LF)this.id_throws[6]).id_int = this.id_finally();
      });
      ((Lu_1)this.id_throws[4]).id_byte(true);
      rrQY var6;
      rrQY var8 = var6 = new rrQY(this.id_super, this.id_package / 2 - 100, this.id_int / 2 + 6, 200, 20, new rgn_3("gui.authme.mojang.field.password"));
      this.id_throws[5] = var6;
      this.id_class(var8);
      ((Lu_1)this.id_throws[5]).id_class(var1 -> {
         this.id_interface();
         ((LF)this.id_throws[6]).id_int = this.id_finally();
      });
      LF var7;
      LF var9 = var7 = new LF(
         this.id_package / 2 - 100 - 2, this.id_int / 2 + 59, 100, 20, new rgn_3("gui.authme.mojang.button.login"), var1 -> this.id_native()
      );
      this.id_throws[6] = var7;
      this.id_class((LF)var9);
      ((LF)this.id_throws[6]).id_int = this.id_finally();
      this.id_class((LF)(new LF(this.id_package / 2 + 2, this.id_int / 2 + 59, 100, 20, new rgn_3("gui.cancel"), var1 -> this.id_volatile())));
      this.id_class((Lu_1)this.id_throws[4]);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
