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
      super(new rgn_3(id_catch[0]), var2, var3);
      this.id_interface();
      Object var8 = null;
      this.id_throws[id_private[0]] = var8;
      Object var9 = null;
      this.id_throws[id_private[1]] = var9;
      Object var10 = null;
      this.id_throws[id_private[2]] = var10;
      this.id_throws[id_private[3]] = var1;
      Boolean var12 = id_implements[0];
      this.id_class[id_private[4]] = var12;
   }

   static {
      ntfClinit();
   }

   private void id_interface() {
      if (this.id_throws == null) {
         this.id_throws = new Object[id_finally[30]];
         Object[] var1 = this.id_throws;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 498612066035982819L;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_interface();
      if ((var1 == id_private[46] || var1 == id_private[47]) && ((LF)this.id_throws[id_private[48]]).id_int) {
         this.id_native();
         return id_implements[12];
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_interface();
      this.id_class(var1);
      this.id_super
         .id_class(
            var1,
            this.id_extends,
            this.id_package / id_finally[23],
            ((Lu_1)this.id_throws[id_private[30]]).id_final - id_finally[24] - id_finally[25],
            id_case[0]
         );
      this.id_super
         .id_break(
            var1,
            ((Lu_1)this.id_throws[id_private[31]]).C_(),
            (float)((Lu_1)this.id_throws[id_private[32]]).id_volatile,
            (float)(((Lu_1)this.id_throws[id_private[33]]).id_final - id_finally[26]),
            id_case[1]
         );
      this.id_super
         .id_break(
            var1,
            ((Lu_1)this.id_throws[id_private[34]]).C_(),
            (float)((Lu_1)this.id_throws[id_private[35]]).id_volatile,
            (float)(((Lu_1)this.id_throws[id_private[36]]).id_final - id_finally[27]),
            id_case[2]
         );
      if ((rgP_2)this.id_throws[id_private[37]] != null) {
         this.id_super
            .id_class(
               var1,
               (rgP_2)this.id_throws[id_private[38]],
               this.id_package / id_finally[28],
               ((LF)this.id_throws[id_private[39]]).id_final - id_finally[29],
               id_case[3]
            );
      }

      super.id_class(var1, var2, var3, var4);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1321975579;
   }

   public boolean id_finally() {
      this.id_interface();
      return !((Lu_1)this.id_throws[id_private[28]]).id_private().isEmpty() && !((Lu_1)this.id_throws[id_private[29]]).id_private().isEmpty()
         ? id_implements[7]
         : id_implements[8];
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
      ((Lu_1)this.id_throws[id_private[49]]).id_catch();
      ((Lu_1)this.id_throws[id_private[50]]).id_catch();
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
      if ((CompletableFuture)this.id_throws[id_private[42]] != null && !((CompletableFuture)this.id_throws[id_private[43]]).isDone()) {
         ((CompletableFuture)this.id_throws[id_private[44]]).cancel(id_implements[11]);
         ((ExecutorService)this.id_throws[id_private[45]]).shutdownNow();
      }

      super.id_volatile();
   }

   public void id_native() {
      this.id_interface();
      if (this.id_finally()) {
         ((Lu_1)this.id_throws[id_private[19]]).id_int = id_implements[4];
         ((Lu_1)this.id_throws[id_private[20]]).id_int = id_implements[5];
         ((LF)this.id_throws[id_private[21]]).id_int = id_implements[6];
         rgn_3 var5 = new rgn_3(id_catch[5]);
         this.id_throws[id_private[22]] = var5;
         ExecutorService var6 = Executors.newSingleThreadExecutor();
         this.id_throws[id_private[23]] = var6;
         CompletableFuture var7 = rrQV.id_class(
               ((Lu_1)this.id_throws[id_private[24]]).id_private(),
               ((Lu_1)this.id_throws[id_private[25]]).id_private(),
               (ExecutorService)this.id_throws[id_private[26]]
            )
            .thenAccept(
               var1 -> {
                  this.id_interface();
                  if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_private[54]])
                     .id_class(
                        new rrQz_1(
                           var1.id_byte(),
                           var1.id_protected(),
                           rrQV.id_class(var1.id_byte()),
                           (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[id_private[55]]
                        ),
                        id_implements[15],
                        id_implements[16]
                     )) {
                     ((rrQC)this.id_throws[id_private[56]]).id_native();
                     ((Logger)QY.id_break[id_private[57]]).info(id_catch[8]);
                     rrQg_1.id_class(var1);
                     ((rrQZ)((rrQu_1)((rrQN)rrQN.staticFields065bd3322daf3178a8bd0d03c4b20e54[id_private[58]]).fields065bd3322daf3178a8bd0d03c4b20e54[id_private[59]])
                           .id_class[id_private[60]])
                        .id_class = ((Lu_1)this.id_throws[id_private[61]]).id_private();
                     Boolean var6x = id_implements[17];
                     this.id_class[id_private[62]] = var6x;
                  }
               }
            )
            .exceptionally(var1 -> {
               this.id_interface();
               rVi_1 var6x = new rgn_3(var1.getCause() instanceof InvalidCredentialsException ? id_catch[6] : id_catch[7]).id_class(rgF_2.RED);
               this.id_throws[id_private[51]] = var6x;
               ((Lu_1)this.id_throws[id_private[52]]).id_int = id_implements[13];
               ((Lu_1)this.id_throws[id_private[53]]).id_int = id_implements[14];
               return null;
            });
         this.id_throws[id_private[27]] = var7;
      }
   }

   @Override
   public boolean E_() {
      this.id_interface();
      return !((Lu_1)this.id_throws[id_private[40]]).aO_() && !((Lu_1)this.id_throws[id_private[41]]).aO_() ? id_implements[9] : id_implements[10];
   }

   @Override
   public void v_() {
      this.id_interface();
      super.v_();
      ((Qj_1)this.id_volatile.id_class[id_private[5]]).id_class(id_implements[1]);
      Lu_1 var5;
      Lu_1 var10001 = var5 = new Lu_1(
         this.id_super,
         this.id_package / id_finally[0] - id_finally[1],
         this.id_int / id_finally[2] - id_finally[3],
         id_private[6],
         id_finally[4],
         new rgn_3(id_catch[1])
      );
      this.id_throws[id_private[7]] = var5;
      this.id_class(var10001);
      ((Lu_1)this.id_throws[id_private[8]]).id_implements(id_private[9]);
      ((Lu_1)this.id_throws[id_private[10]]).id_class(var1 -> {
         this.id_interface();
         ((LF)this.id_throws[id_private[64]]).id_int = this.id_finally();
      });
      ((Lu_1)this.id_throws[id_private[11]]).id_byte(id_implements[2]);
      rrQY var6;
      rrQY var8 = var6 = new rrQY(
         this.id_super,
         this.id_package / id_finally[5] - id_finally[6],
         this.id_int / id_finally[7] + id_finally[8],
         id_private[12],
         id_finally[9],
         new rgn_3(id_catch[2])
      );
      this.id_throws[id_private[13]] = var6;
      this.id_class(var8);
      ((Lu_1)this.id_throws[id_private[14]]).id_class(var1 -> {
         this.id_interface();
         ((LF)this.id_throws[id_private[63]]).id_int = this.id_finally();
      });
      LF var7;
      LF var9 = var7 = new LF(
         this.id_package / id_finally[10] - id_finally[11] - id_finally[12],
         this.id_int / id_finally[13] + id_finally[14],
         id_finally[15],
         id_finally[16],
         new rgn_3(id_catch[3]),
         var1 -> this.id_native()
      );
      this.id_throws[id_private[15]] = var7;
      this.id_class((LF)var9);
      ((LF)this.id_throws[id_private[16]]).id_int = this.id_finally();
      this.id_class(
         (LF)(new LF(
            this.id_package / id_finally[17] + id_finally[18],
            this.id_int / id_finally[19] + id_finally[20],
            id_finally[21],
            id_finally[22],
            new rgn_3(id_catch[4]),
            var1 -> this.id_volatile()
         ))
      );
      this.id_class((Lu_1)this.id_throws[id_private[17]]);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[id_private[18]]).id_class(id_implements[3]);
   }
}
