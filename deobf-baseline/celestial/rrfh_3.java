package celestial;

import com.google.common.collect.Multimap;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrfh_3 {
   private static boolean[] booleansf0292b9e212f30cb8a14c2d16461fd94;
   public static Object[] staticFieldsf0292b9e212f30cb8a14c2d16461fd94;
   private static String[] stringsf0292b9e212f30cb8a14c2d16461fd94;
   private static double[] doublesf0292b9e212f30cb8a14c2d16461fd94;
   private static short[] shortsf0292b9e212f30cb8a14c2d16461fd94;
   private static byte[] bytesf0292b9e212f30cb8a14c2d16461fd94;
   public Object[] fieldsf0292b9e212f30cb8a14c2d16461fd94;

   private static void id_byte() {
      doublesf0292b9e212f30cb8a14c2d16461fd94 = new double[]{
         -4.0, 7.0, 0.1, 3.0, 2.0, 2.0, 4.0, -3.0, 2.0, 4.0, 0.1, 0.1, 2.0, -4.0, 2.0, -4.0, 5.0, 2.0, 0.15, 0.15, 1.5, 1.5, 2.5, 0.1
      };
   }

   private rrfh_3(rrfS_2... var3) {
      this.id_private();
      this.fieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[1]] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, -1, 104, 109, -44, -123, -17, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrfS_2[] id_class() {
      return (rrfS_2[])this.fieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[3]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1544992507;
   }

   public static rrfh_3 id_class(rdn_3 var0) {
      if (var0.id_break() != rdy_3.kL) {
         return null;
      } else {
         rrfh_3[] var1 = (rrfh_3[])staticFieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[2]];
         int var2 = var1.length;

         for (int var3 = booleansf0292b9e212f30cb8a14c2d16461fd94[0]; var3 < var2; var3++) {
            rrfh_3 var4 = var1[var3];
            rrfS_2[] var5 = var4.id_class();
            if (var5.length != 0) {
               boolean var6 = booleansf0292b9e212f30cb8a14c2d16461fd94[1];
               rrfS_2[] var7 = var5;
               int var8 = var5.length;

               for (int var9 = booleansf0292b9e212f30cb8a14c2d16461fd94[2]; var9 < var8; var9++) {
                  rrfS_2 var10 = var7[var9];
                  iJ_2 var11 = var10.id_class();
                  ix_3 var12 = var10.id_byte();
                  rXQ var13 = var10.id_break();
                  Multimap var14 = var0.id_class(var13);
                  if (var14.size() != var5.length) {
                     var6 = booleansf0292b9e212f30cb8a14c2d16461fd94[3];
                     break;
                  }

                  if (!var14.containsKey(var11)) {
                     var6 = booleansf0292b9e212f30cb8a14c2d16461fd94[7];
                     break;
                  }

                  boolean var15 = booleansf0292b9e212f30cb8a14c2d16461fd94[4];

                  for (Entry var17 : var14.entries()) {
                     iJ_2 var18 = (iJ_2)var17.getKey();
                     ix_3 var19 = (ix_3)var17.getValue();
                     if (var19.id_byte() == var12.id_byte() && var19.id_protected() == var12.id_protected() && var18.equals(var11)) {
                        var15 = booleansf0292b9e212f30cb8a14c2d16461fd94[5];
                        break;
                     }
                  }

                  if (!var15) {
                     var6 = booleansf0292b9e212f30cb8a14c2d16461fd94[6];
                     break;
                  }
               }

               if (var6) {
                  return var4;
               }
            }
         }

         return null;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5884103556670802466L;
   }

   private static void id_break() {
      shortsf0292b9e212f30cb8a14c2d16461fd94 = new short[]{9, 0, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};
   }

   private static void id_throws() {
      stringsf0292b9e212f30cb8a14c2d16461fd94 = new String[]{
         new String("PUNISHER"),
         new String(""),
         new String(""),
         new String(""),
         new String("DESTROYER"),
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String("DISCORD"),
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String("TYRANT"),
         new String(""),
         new String(""),
         new String(""),
         new String("RAGE"),
         new String(""),
         new String(""),
         new String("WHIRLWIND"),
         new String(""),
         new String(""),
         new String(""),
         new String("DARKNESS"),
         new String(""),
         new String(""),
         new String("DEMON"),
         new String(""),
         new String("")
      };
   }

   private static void id_catch() {
      booleansf0292b9e212f30cb8a14c2d16461fd94 = new boolean[]{
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true
      };
   }

   private static void id_case() {
      Object[] var0 = new Object[10];
      String var10004 = stringsf0292b9e212f30cb8a14c2d16461fd94[0];
      rrfS_2[] var2 = new rrfS_2[]{
         new rrfS_2(
            iQ_2.id_class,
            new ix_3(new UUID(-9212241506230515135L, -4621443875574229328L), stringsf0292b9e212f30cb8a14c2d16461fd94[1], -4.0, id_3.ADDITION),
            rXQ.OFFHAND
         ),
         new rrfS_2(iQ_2.id_case, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[2], 7.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_protected, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[3], 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND)
      };
      var0[0] = new rrfh_3(var2);
      var10004 = stringsf0292b9e212f30cb8a14c2d16461fd94[4];
      rrfS_2[] var3 = new rrfS_2[]{
         new rrfS_2(iQ_2.id_case, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[5], 3.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_finally, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[6], 2.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_implements, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[7], 2.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_class, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[8], 4.0, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[1] = new rrfh_3(var3);
      var10004 = stringsf0292b9e212f30cb8a14c2d16461fd94[9];
      rrfS_2[] var4 = new rrfS_2[]{
         new rrfS_2(iQ_2.id_implements, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[10], -3.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_class, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[11], 2.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_case, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[12], 4.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_protected, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[13], 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_private, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[14], 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND)
      };
      var0[2] = new rrfh_3(var4);
      var10004 = stringsf0292b9e212f30cb8a14c2d16461fd94[15];
      rrfS_2[] var5 = new rrfS_2[]{
         new rrfS_2(iQ_2.id_implements, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[16], 2.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_class, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[17], -4.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_case, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[18], 2.0, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[3] = new rrfh_3(var5);
      var10004 = stringsf0292b9e212f30cb8a14c2d16461fd94[19];
      rrfS_2[] var6 = new rrfS_2[]{
         new rrfS_2(iQ_2.id_class, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[20], -4.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_case, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[21], 5.0, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[4] = new rrfh_3(var6);
      var10004 = stringsf0292b9e212f30cb8a14c2d16461fd94[22];
      rrfS_2[] var7 = new rrfS_2[]{
         new rrfS_2(iQ_2.id_class, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[23], 2.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_protected, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[24], 0.15, id_3.MULTIPLY_BASE), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_private, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[25], 0.15, id_3.MULTIPLY_BASE), rXQ.OFFHAND)
      };
      var0[5] = new rrfh_3(var7);
      var10004 = stringsf0292b9e212f30cb8a14c2d16461fd94[26];
      rrfS_2[] var8 = new rrfS_2[]{
         new rrfS_2(iQ_2.id_implements, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[27], 1.5, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_class, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[28], 1.5, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[6] = new rrfh_3(var8);
      var10004 = stringsf0292b9e212f30cb8a14c2d16461fd94[29];
      rrfS_2[] var9 = new rrfS_2[]{
         new rrfS_2(iQ_2.id_case, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[30], 2.5, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.id_private, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[31], 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND)
      };
      var0[7] = new rrfh_3(var9);
      var0[8] = new rrfh_3[]{
         (rrfh_3)var0[0], (rrfh_3)var0[1], (rrfh_3)var0[2], (rrfh_3)var0[3], (rrfh_3)var0[4], (rrfh_3)var0[5], (rrfh_3)var0[6], (rrfh_3)var0[7]
      };
      var0[9] = new rrfh_3[]{
         (rrfh_3)var0[0], (rrfh_3)var0[1], (rrfh_3)var0[2], (rrfh_3)var0[3], (rrfh_3)var0[4], (rrfh_3)var0[5], (rrfh_3)var0[6], (rrfh_3)var0[7]
      };
      staticFieldsf0292b9e212f30cb8a14c2d16461fd94 = var0;
   }

   private static void id_implements() {
      bytesf0292b9e212f30cb8a14c2d16461fd94 = new byte[]{
         8, 2, 3, 4, 5, 6, 7, 3, 2, 4, 2, 3, 2, 5, 2, 3, 4, 2, 3, 3, 2, 3, 4, 2, 4, 5, 3, 2, 5, 6, 2, 6, 7, 2, 7, 9, 8, 10
      };
   }

   private void id_private() {
      if (this.fieldsf0292b9e212f30cb8a14c2d16461fd94 == null) {
         this.fieldsf0292b9e212f30cb8a14c2d16461fd94 = new Object[1];
      }
   }
}
