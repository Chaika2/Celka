package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mk_1 extends MM {
   private static short[] id_break;
   private static byte[] id_protected;
   private static String[] id_throws;
   private static boolean[] id_case;

   public Mk_1(rcd_3 var1) {
      String var2 = var1.id_native("Materials");
      if (!var2.equals("Alpha")) {
         throw new IllegalStateException("bad schematic " + var2);
      } else {
         Integer var15 = var1.id_private("Width");
         this.id_class[0] = var15;
         Integer var16 = var1.id_private("Height");
         this.id_class[1] = var16;
         Integer var17 = var1.id_private("Length");
         this.id_class[2] = var17;
         byte[] var3 = var1.id_volatile("Blocks");
         byte[] var4 = null;
         if (var1.id_throws("AddBlocks")) {
            byte[] var5 = var1.id_volatile("AddBlocks");
            var4 = new byte[var5.length * 2];

            for (int var6 = 0; var6 < var5.length; var6++) {
               var4[var6 * 2 + 0] = (byte)(var5[var6] >> 4 & 15);
               var4[var6 * 2 + 1] = (byte)(var5[var6] >> 0 & 15);
            }
         }

         xc_3[][][] var18 = new xc_3[this.id_class[0]][this.id_class[2]][this.id_class[1]];
         this.id_byte[0] = var18;

         for (int var19 = 0; var19 < this.id_class[1]; var19++) {
            for (int var20 = 0; var20 < this.id_class[2]; var20++) {
               for (int var7 = 0; var7 < this.id_class[0]; var7++) {
                  int var8 = (var19 * (Integer)this.id_class[2] + var20) * (Integer)this.id_class[0] + var7;
                  int var9 = var3[var8] & 255;
                  if (var4 != null) {
                     var9 |= var4[var8] << 8;
                  }

                  xd_3 var10 = rVL.id_strictfp.id_class(rqO_2.id_break(rtK_2.id_class(var9)));
                  ((xc_3[][][])this.id_byte[0])[var7][var20][var19] = var10.id_continue();
               }
            }
         }
      }
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -588135543226542844L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1227049116;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{14, -94, 9, 44, 18, -58, 89, 43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_case = new boolean[]{false, false, true, false, false, false, false};
   }

   private static void id_catch() {
      id_throws = new String[]{
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

   private static void id_case() {
      id_break = new short[]{0, 1, 2, 0, 2, 1, 0, 1, 2, 0, 2, 0, 255, 0};
   }

   private static void id_private() {
      id_protected = new byte[]{2, 2, 4, 15, 2, 15, 8};
   }
}
