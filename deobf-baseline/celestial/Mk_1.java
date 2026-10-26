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
      String var2 = var1.id_native(id_throws[0]);
      if (!var2.equals(id_throws[1])) {
         throw new IllegalStateException("bad schematic " + var2);
      } else {
         Integer var15 = var1.id_private(id_throws[2]);
         this.id_class[id_break[0]] = var15;
         Integer var16 = var1.id_private(id_throws[3]);
         this.id_class[id_break[1]] = var16;
         Integer var17 = var1.id_private(id_throws[4]);
         this.id_class[id_break[2]] = var17;
         byte[] var3 = var1.id_volatile(id_throws[5]);
         byte[] var4 = null;
         if (var1.id_throws(id_throws[6])) {
            byte[] var5 = var1.id_volatile(id_throws[7]);
            var4 = new byte[var5.length * id_protected[0]];

            for (int var6 = id_case[0]; var6 < var5.length; var6++) {
               var4[var6 * id_protected[1] + id_case[1]] = (byte)(var5[var6] >> id_protected[2] & id_protected[3]);
               var4[var6 * id_protected[4] + id_case[2]] = (byte)(var5[var6] >> id_case[3] & id_protected[5]);
            }
         }

         xc_3[][][] var18 = new xc_3[this.id_class[id_break[3]]][this.id_class[id_break[4]]][this.id_class[id_break[5]]];
         this.id_byte[id_break[6]] = var18;

         for (int var19 = id_case[4]; var19 < this.id_class[id_break[7]]; var19++) {
            for (int var20 = id_case[5]; var20 < this.id_class[id_break[8]]; var20++) {
               for (int var7 = id_case[6]; var7 < this.id_class[id_break[9]]; var7++) {
                  int var8 = (var19 * (Integer)this.id_class[id_break[10]] + var20) * (Integer)this.id_class[id_break[11]] + var7;
                  int var9 = var3[var8] & id_break[12];
                  if (var4 != null) {
                     var9 |= var4[var8] << id_protected[6];
                  }

                  xd_3 var10 = rVL.id_strictfp.id_class(rqO_2.id_break(rtK_2.id_class(var9)));
                  ((xc_3[][][])this.id_byte[id_break[13]])[var7][var20][var19] = var10.id_continue();
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
