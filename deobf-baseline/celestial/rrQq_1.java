package celestial;

import com.mojang.util.UUIDTypeAdapter;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQq_1 extends rrQH {
   private static String[] id_case;
   private static short[] id_catch;
   public Object[] id_throws;
   private static int[] id_private;
   private static byte[] id_implements;
   private static boolean[] id_finally;

   private static void id_char() {
      id_case = new String[]{
         new String("gui.authme.offline.title"),
         new String("gui.authme.offline.field.username"),
         new String("gui.authme.offline.button.login"),
         new String("gui.cancel"),
         new String("Successfully logged in offline-mode!")
      };
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-90, 23, 104, -6, 116, -115, -18, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_int() {
      id_catch = new short[]{0, 3, 23, 200, 1, 1, 1, 1, 1, 2, 2, 1, 23, 1, 0, 0, 0, 1, 2, 0, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 257, 335, 2, 1, 7, 2};
   }

   public rrQq_1(rrQC var1, vm_3 var2, vm_3 var3) {
      super(new rgn_3(id_case[0]), var2, var3);
      this.id_final();
      this.id_throws[id_catch[0]] = var1;
      Boolean var9 = id_finally[0];
      this.id_class[id_catch[1]] = var9;
   }

   static {
      ntfClinit();
   }

   private static void id_interface() {
      id_implements = new byte[]{2, 100, 2, 6, 20, 16, 2, 100, 2, 2, 26, 100, 20, 2, 2, 2, 26, 100, 20, 2, 16, 23, 16, 3};
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_final();
      if ((var1 == id_catch[30] || var1 == id_catch[31]) && ((LF)this.id_throws[id_catch[32]]).id_int) {
         this.id_finally();
         return id_finally[11];
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4957199880209339171L;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_final();
      this.id_class(var1);
      super.id_class(var1, var2, var3, var4);
      this.id_super
         .id_class(
            var1,
            this.id_extends,
            this.id_package / id_implements[19],
            ((Lu_1)this.id_throws[id_catch[26]]).id_final - id_implements[20] - id_implements[21],
            id_private[0]
         );
      this.id_super
         .id_break(
            var1,
            ((Lu_1)this.id_throws[id_catch[27]]).C_(),
            (float)((Lu_1)this.id_throws[id_catch[28]]).id_volatile,
            (float)(((Lu_1)this.id_throws[id_catch[29]]).id_final - id_implements[22]),
            id_private[1]
         );
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1534192246;
   }

   public void id_finally() {
      this.id_final();
      if (this.id_native()) {
         rqN_2 var1 = rrQg_1.id_break(((Lu_1)this.id_throws[id_catch[13]]).id_private());
         if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_catch[14]])
            .id_class(
               new rrQQ(var1.id_byte(), UUIDTypeAdapter.fromString(var1.id_break()), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[id_catch[15]]),
               id_finally[4],
               id_finally[5]
            )) {
            ((rrQC)this.id_throws[id_catch[16]]).id_native();
            ((Lu_1)this.id_throws[id_catch[17]]).id_int = id_finally[6];
            ((LF)this.id_throws[id_catch[18]]).id_int = id_finally[7];
            rrQg_1.id_class(var1);
            ((rrQv_1)((rrQu_1)((rrQN)rrQN.staticFields065bd3322daf3178a8bd0d03c4b20e54[id_catch[19]]).fields065bd3322daf3178a8bd0d03c4b20e54[id_catch[20]]).id_class[id_catch[21]])
               .id_class = ((Lu_1)this.id_throws[id_catch[22]]).id_private();
            ((Logger)QY.id_break[id_catch[23]]).info(id_case[4]);
            Boolean var6 = id_finally[8];
            this.id_class[id_catch[24]] = var6;
         }
      }
   }

   private static void id_package() {
      id_finally = new boolean[]{true, true, true, false, true, true, false, false, true, true, false, true, true};
   }

   @Override
   public void id_private() {
      this.id_final();
      super.id_private();
      ((Lu_1)this.id_throws[id_catch[33]]).id_catch();
   }

   private static void id_abstract() {
      id_private = new int[]{16777215, 10526880};
   }

   private void id_final() {
      if (this.id_throws == null) {
         this.id_throws = new Object[id_implements[23]];
         Object[] var1 = this.id_throws;
      }
   }

   public boolean id_native() {
      this.id_final();
      return !((Lu_1)this.id_throws[id_catch[25]]).id_private().isBlank() ? id_finally[9] : id_finally[10];
   }

   @Override
   public void v_() {
      this.id_final();
      super.v_();
      ((Qj_1)this.id_volatile.id_class[id_catch[2]]).id_class(id_finally[1]);
      Lu_1 var5;
      Lu_1 var10001 = var5 = new Lu_1(
         this.id_super,
         this.id_package / id_implements[0] - id_implements[1],
         this.id_int / id_implements[2] - id_implements[3],
         id_catch[3],
         id_implements[4],
         new rgn_3(id_case[1])
      );
      this.id_throws[id_catch[4]] = var5;
      this.id_class(var10001);
      ((Lu_1)this.id_throws[id_catch[5]]).id_implements(id_implements[5]);
      ((Lu_1)this.id_throws[id_catch[6]]).id_class(var1 -> {
         this.id_final();
         ((LF)this.id_throws[id_catch[35]]).id_int = this.id_native();
      });
      ((Lu_1)this.id_throws[id_catch[7]]).id_class(var0 -> var0.isEmpty() ? id_finally[12] : ((Pattern)rrtR_2.id_class[id_catch[34]]).matcher(var0).matches());
      ((Lu_1)this.id_throws[id_catch[8]]).id_byte(id_finally[2]);
      LF var6;
      LF var7 = var6 = new LF(
         this.id_package / id_implements[6] - id_implements[7] - id_implements[8],
         this.id_int / id_implements[9] + id_implements[10],
         id_implements[11],
         id_implements[12],
         new rgn_3(id_case[2]),
         var1 -> this.id_finally()
      );
      this.id_throws[id_catch[9]] = var6;
      this.id_class(var7);
      ((LF)this.id_throws[id_catch[10]]).id_int = this.id_native();
      this.id_class(
         new LF(
            this.id_package / id_implements[13] + id_implements[14],
            this.id_int / id_implements[15] + id_implements[16],
            id_implements[17],
            id_implements[18],
            new rgn_3(id_case[3]),
            var1 -> this.id_volatile()
         )
      );
      this.id_class((Lu_1)this.id_throws[id_catch[11]]);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[id_catch[12]]).id_class(id_finally[3]);
   }
}
