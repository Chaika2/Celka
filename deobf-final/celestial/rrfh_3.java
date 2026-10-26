package celestial;

import com.google.common.collect.Multimap;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrfh_3 {
   ;
   private static boolean[] booleansf0292b9e212f30cb8a14c2d16461fd94;
   public static Object[] staticFieldsf0292b9e212f30cb8a14c2d16461fd94;
   private static String[] stringsf0292b9e212f30cb8a14c2d16461fd94;
   private static double[] doublesf0292b9e212f30cb8a14c2d16461fd94;
   private static short[] shortsf0292b9e212f30cb8a14c2d16461fd94;
   private static byte[] bytesf0292b9e212f30cb8a14c2d16461fd94;
   public Object[] fieldsf0292b9e212f30cb8a14c2d16461fd94;

   private static void byte_() {
      doublesf0292b9e212f30cb8a14c2d16461fd94 = new double[]{
         -4.0, 7.0, 0.1, 3.0, 2.0, 2.0, 4.0, -3.0, 2.0, 4.0, 0.1, 0.1, 2.0, -4.0, 2.0, -4.0, 5.0, 2.0, 0.15, 0.15, 1.5, 1.5, 2.5, 0.1
      };
   }

   private rrfh_3(rrfS_2... var3) {
      this.private_();
      this.fieldsf0292b9e212f30cb8a14c2d16461fd94[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, -1, 104, 109, -44, -123, -17, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrfS_2[] class_() {
      return (rrfS_2[])this.fieldsf0292b9e212f30cb8a14c2d16461fd94[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1544992507;
   }

   public static rrfh_3 class_(rdn_3 var0) {
      if (var0.break_() != rdy_3.kL) {
         return null;
      } else {
         for (rrfh_3 var4 : (rrfh_3[])staticFieldsf0292b9e212f30cb8a14c2d16461fd94[8]) {
            rrfS_2[] var5 = var4.class_();
            if (var5.length != 0) {
               boolean var6 = booleansf0292b9e212f30cb8a14c2d16461fd94[1];

               for (rrfS_2 var10 : var5) {
                  iJ_2 var11 = var10.class_();
                  ix_3 var12 = var10.byte_();
                  rXQ var13 = var10.break_();
                  Multimap var14 = var0.class_(var13);
                  if (var14.size() != var5.length) {
                     var6 = false;
                     break;
                  }

                  if (!var14.containsKey(var11)) {
                     var6 = booleansf0292b9e212f30cb8a14c2d16461fd94[7];
                     break;
                  }

                  boolean var15 = false;

                  for (Entry var17 : var14.entries()) {
                     iJ_2 var18 = (iJ_2)var17.getKey();
                     ix_3 var19 = (ix_3)var17.getValue();
                     if (var19.byte_() == var12.byte_() && var19.protected_() == var12.protected_() && var18.equals(var11)) {
                        var15 = true;
                        break;
                     }
                  }

                  if (!var15) {
                     var6 = false;
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

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5884103556670802466L;
   }

   private static void break_() {
      shortsf0292b9e212f30cb8a14c2d16461fd94 = new short[]{9, 0, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};
   }

   private static void throws_() {
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

   private static void catch_() {
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

   private static void case_() {
      Object[] var0 = new Object[10];
      rrfS_2[] var2 = new rrfS_2[]{
         new rrfS_2(iQ_2.class_, new ix_3(new UUID(-9212241506230515135L, -4621443875574229328L), "", -4.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.case_, new ix_3("", 7.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.protected_, new ix_3("", 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND)
      };
      var0[0] = new rrfh_3(var2);
      rrfS_2[] var3 = new rrfS_2[]{
         new rrfS_2(iQ_2.case_, new ix_3("", 3.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.finally_, new ix_3("", 2.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.implements_, new ix_3("", 2.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.class_, new ix_3("", 4.0, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[1] = new rrfh_3(var3);
      rrfS_2[] var4 = new rrfS_2[]{
         new rrfS_2(iQ_2.implements_, new ix_3("", -3.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.class_, new ix_3("", 2.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.case_, new ix_3("", 4.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.protected_, new ix_3("", 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND),
         new rrfS_2(iQ_2.private_, new ix_3("", 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND)
      };
      var0[2] = new rrfh_3(var4);
      rrfS_2[] var5 = new rrfS_2[]{
         new rrfS_2(iQ_2.implements_, new ix_3("", 2.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.class_, new ix_3("", -4.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.case_, new ix_3("", 2.0, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[3] = new rrfh_3(var5);
      rrfS_2[] var6 = new rrfS_2[]{
         new rrfS_2(iQ_2.class_, new ix_3("", -4.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.case_, new ix_3("", 5.0, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[4] = new rrfh_3(var6);
      rrfS_2[] var7 = new rrfS_2[]{
         new rrfS_2(iQ_2.class_, new ix_3("", 2.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.protected_, new ix_3("", 0.15, id_3.MULTIPLY_BASE), rXQ.OFFHAND),
         new rrfS_2(iQ_2.private_, new ix_3("", 0.15, id_3.MULTIPLY_BASE), rXQ.OFFHAND)
      };
      var0[5] = new rrfh_3(var7);
      rrfS_2[] var8 = new rrfS_2[]{
         new rrfS_2(iQ_2.implements_, new ix_3("", 1.5, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.class_, new ix_3("", 1.5, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[6] = new rrfh_3(var8);
      rrfS_2[] var9 = new rrfS_2[]{
         new rrfS_2(iQ_2.case_, new ix_3("", 2.5, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.private_, new ix_3("", 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND)
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

   private static void implements_() {
      bytesf0292b9e212f30cb8a14c2d16461fd94 = new byte[]{
         8, 2, 3, 4, 5, 6, 7, 3, 2, 4, 2, 3, 2, 5, 2, 3, 4, 2, 3, 3, 2, 3, 4, 2, 4, 5, 3, 2, 5, 6, 2, 6, 7, 2, 7, 9, 8, 10
      };
   }

   private void private_() {
      if (this.fieldsf0292b9e212f30cb8a14c2d16461fd94 == null) {
         this.fieldsf0292b9e212f30cb8a14c2d16461fd94 = new Object[1];
      }
   }
}
