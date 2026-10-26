package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MW extends MM {
   private static String[] id_break;
   private static boolean[] id_protected;
   private static short[] id_throws;

   public MW(rcd_3 var1) {
      Integer var16 = var1.id_private(id_break[0]);
      this.id_class[id_throws[0]] = var16;
      Integer var17 = var1.id_private(id_break[1]);
      this.id_class[id_throws[1]] = var17;
      Integer var18 = var1.id_private(id_break[2]);
      this.id_class[id_throws[2]] = var18;
      xc_3[][][] var19 = new xc_3[this.id_class[id_throws[3]]][this.id_class[id_throws[4]]][this.id_class[id_throws[5]]];
      this.id_byte[id_throws[6]] = var19;
      Int2ObjectArrayMap var2 = new Int2ObjectArrayMap();
      rcd_3 var3 = var1.id_int(id_break[3]);

      for (String var5 : var3.id_protected()) {
         int var6 = var3.id_private(var5);
         Mz_1 var7 = Mz_1.id_break(var5);
         if (var7 == null) {
            throw new IllegalArgumentException(id_break[4]);
         }

         xc_3 var8 = var7.id_byte();
         if (var8 == null) {
            throw new IllegalArgumentException(id_break[5]);
         }

         var2.put(var6, var8);
      }

      byte[] var20 = var1.id_volatile(id_break[6]);
      int[] var21 = new int[this.id_class[id_throws[7]] * this.id_class[id_throws[8]] * this.id_class[id_throws[9]]];
      int var22 = id_protected[0];

      for (int var23 = id_protected[1]; var23 < var21.length; var23++) {
         if (var22 >= var20.length) {
            throw new IllegalArgumentException(id_break[7]);
         }

         Mm_1 var25 = Mm_1.id_class(var20, var22);
         var21[var23] = var25.id_byte();
         var22 += var25.id_break();
      }

      for (int var24 = id_protected[2]; var24 < this.id_class[id_throws[10]]; var24++) {
         for (int var26 = id_protected[3]; var26 < this.id_class[id_throws[11]]; var26++) {
            for (int var9 = id_protected[4]; var9 < this.id_class[id_throws[12]]; var9++) {
               int var10 = (var24 * (Integer)this.id_class[id_throws[13]] + var26) * (Integer)this.id_class[id_throws[14]] + var9;
               xc_3 var11 = (xc_3)var2.get(var21[var10]);
               if (var11 == null) {
                  throw new IllegalArgumentException("Invalid Palette Index " + var10);
               }

               ((xc_3[][][])this.id_byte[id_throws[15]])[var9][var26][var24] = var11;
            }
         }
      }
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -891301089;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4502983611290594672L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-102, -14, -82, -94, 12, -107, -10, 73}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_break = new String[]{
         new String("Width"),
         new String("Height"),
         new String("Length"),
         new String("Palette"),
         new String("Unable to parse palette tag"),
         new String("Unable to deserialize palette tag"),
         new String("BlockData"),
         new String("No remaining bytes in BlockData for complete schematic")
      };
   }

   private static void id_catch() {
      id_throws = new short[]{0, 1, 2, 0, 2, 1, 0, 0, 1, 2, 1, 2, 0, 2, 0, 0};
   }

   private static void id_case() {
      id_protected = new boolean[5];
   }
}
