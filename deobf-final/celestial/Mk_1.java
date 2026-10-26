package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mk_1 extends MM {
   private static short[] break_;
   private static byte[] protected_;
   private static String[] throws_;
   private static boolean[] case_;

   public Mk_1(rcd_3 var1) {
      String var2 = var1.native_("Materials");
      if (!var2.equals("Alpha")) {
         throw new IllegalStateException("bad schematic " + var2);
      } else {
         Integer var15 = var1.private_("Width");
         this.class_[0] = var15;
         Integer var16 = var1.private_("Height");
         this.class_[1] = var16;
         Integer var17 = var1.private_("Length");
         this.class_[2] = var17;
         byte[] var3 = var1.volatile_("Blocks");
         byte[] var4 = null;
         if (var1.throws_("AddBlocks")) {
            byte[] var5 = var1.volatile_("AddBlocks");
            var4 = new byte[var5.length * 2];

            for (int var6 = 0; var6 < var5.length; var6++) {
               var4[var6 * 2 + 0] = (byte)(var5[var6] >> 4 & 15);
               var4[var6 * 2 + 1] = (byte)(var5[var6] >> 0 & 15);
            }
         }

         xc_3[][][] var18 = new xc_3[this.class_[0]][this.class_[2]][this.class_[1]];
         this.byte_[0] = var18;

         for (int var19 = 0; var19 < this.class_[1]; var19++) {
            for (int var20 = 0; var20 < this.class_[2]; var20++) {
               for (int var7 = 0; var7 < this.class_[0]; var7++) {
                  int var8 = (var19 * (Integer)this.class_[2] + var20) * (Integer)this.class_[0] + var7;
                  int var9 = var3[var8] & 255;
                  if (var4 != null) {
                     var9 |= var4[var8] << 8;
                  }

                  xd_3 var10 = rVL.strictfp_.class_(rqO_2.break_(rtK_2.class_(var9)));
                  ((xc_3[][][])this.byte_[0])[var7][var20][var19] = var10.continue_();
               }
            }
         }
      }
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -588135543226542844L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1227049116;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{14, -94, 9, 44, 18, -58, 89, 43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      case_ = new boolean[]{false, false, true, false, false, false, false};
   }

   private static void catch_() {
      throws_ = new String[]{
         new String("Materials"),
         new String("Alpha"),
         new String("Width"),
         new String("Height"),
         new String("Length"),
         new String("Blocks"),
         new String("AddBlocks"),
         new String("AddBlocks")
      };
   }

   private static void case_() {
      break_ = new short[]{0, 1, 2, 0, 2, 1, 0, 1, 2, 0, 2, 0, 255, 0};
   }

   private static void private_() {
      protected_ = new byte[]{2, 2, 4, 15, 2, 15, 8};
   }
}
