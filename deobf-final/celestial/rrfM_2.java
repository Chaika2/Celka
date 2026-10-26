package celestial;

import com.google.common.collect.Multimap;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrfM_2 {
   ;
   private static short[] shorts869ba89e075331349de8f9288d544af1;
   public Object[] fields869ba89e075331349de8f9288d544af1;
   private static boolean[] booleans869ba89e075331349de8f9288d544af1;
   private static double[] doubles869ba89e075331349de8f9288d544af1;
   private static byte[] bytes869ba89e075331349de8f9288d544af1;
   public static Object[] staticFields869ba89e075331349de8f9288d544af1;
   private static String[] strings869ba89e075331349de8f9288d544af1;

   private static void byte_() {
      shorts869ba89e075331349de8f9288d544af1 = new short[]{9, 0, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};
   }

   private rrfM_2(rrfS_2... var3) {
      this.throws_();
      this.fields869ba89e075331349de8f9288d544af1[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-120, -30, 12, 90, -84, -113, 113, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 207823688;
   }

   public rrfS_2[] class_() {
      return (rrfS_2[])this.fields869ba89e075331349de8f9288d544af1[0];
   }

   public static rrfM_2 class_(rdn_3 var0) {
      if (var0.break_() != rdy_3.dJ) {
         return null;
      } else {
         for (rrfM_2 var4 : (rrfM_2[])staticFields869ba89e075331349de8f9288d544af1[8]) {
            rrfS_2[] var5 = var4.class_();
            if (var5.length != 0) {
               boolean var6 = booleans869ba89e075331349de8f9288d544af1[1];

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
                     var6 = booleans869ba89e075331349de8f9288d544af1[7];
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
      return Long.rotateLeft(var0, 32) ^ 7530841505675674479L;
   }

   private void throws_() {
      if (this.fields869ba89e075331349de8f9288d544af1 == null) {
         this.fields869ba89e075331349de8f9288d544af1 = new Object[1];
      }
   }

   private static void catch_() {
      booleans869ba89e075331349de8f9288d544af1 = new boolean[]{
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
      bytes869ba89e075331349de8f9288d544af1 = new byte[]{
         8, 2, 3, 4, 5, 6, 7, 5, 2, 3, 4, 2, 2, 4, 2, 3, 2, 3, 3, 2, 3, 4, 2, 4, 5, 2, 5, 6, 2, 6, 7, 3, 2, 7, 9, 8, 10
      };
   }

   private static void implements_() {
      doubles869ba89e075331349de8f9288d544af1 = new double[]{
         1.5, -4.0, 2.5, 0.07, 0.13, 2.0, 0.15, 1.0, 4.0, 0.1, 0.1, -2.0, -2.0, 6.0, 2.0, 4.0, 2.0, 2.0, 2.0, 1.0, 2.5, -0.15, 2.5
      };
   }

   private static void protected_() {
      strings869ba89e075331349de8f9288d544af1 = new String[]{
         new String("CHAOS"),
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String("SATIRE"),
         new String(""),
         new String(""),
         new String("BEAST"),
         new String(""),
         new String(""),
         new String(""),
         new String(""),
         new String("ARES"),
         new String(""),
         new String(""),
         new String(""),
         new String("HYDRA"),
         new String(""),
         new String(""),
         new String("ICARUS"),
         new String(""),
         new String(""),
         new String("ERID"),
         new String(""),
         new String(""),
         new String("TITAN"),
         new String(""),
         new String(""),
         new String("")
      };
   }

   private static void private_() {
      Object[] var0 = new Object[10];
      rrfS_2[] var2 = new rrfS_2[]{
         new rrfS_2(iQ_2.implements_, new ix_3(new UUID(-9212241506230515135L, -4621443875574229328L), "", 1.5, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.class_, new ix_3("", -4.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.case_, new ix_3("", 2.5, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.protected_, new ix_3("", 0.07, id_3.MULTIPLY_BASE), rXQ.OFFHAND),
         new rrfS_2(iQ_2.private_, new ix_3("", 0.13, id_3.MULTIPLY_BASE), rXQ.OFFHAND)
      };
      var0[0] = new rrfM_2(var2);
      rrfS_2[] var3 = new rrfS_2[]{
         new rrfS_2(iQ_2.case_, new ix_3("", 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.private_, new ix_3("", 0.15, id_3.MULTIPLY_BASE), rXQ.OFFHAND)
      };
      var0[1] = new rrfM_2(var3);
      rrfS_2[] var4 = new rrfS_2[]{
         new rrfS_2(iQ_2.implements_, new ix_3("", 1.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.class_, new ix_3("", 4.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.protected_, new ix_3("", 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND),
         new rrfS_2(iQ_2.private_, new ix_3("", 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND)
      };
      var0[2] = new rrfM_2(var4);
      rrfS_2[] var5 = new rrfS_2[]{
         new rrfS_2(iQ_2.implements_, new ix_3("", -2.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.class_, new ix_3("", -2.0, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.case_, new ix_3("", 6.0, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[3] = new rrfM_2(var5);
      rrfS_2[] var6 = new rrfS_2[]{
         new rrfS_2(iQ_2.implements_, new ix_3("", 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.class_, new ix_3("", 4.0, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[4] = new rrfM_2(var6);
      rrfS_2[] var7 = new rrfS_2[]{
         new rrfS_2(iQ_2.class_, new ix_3("", 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.case_, new ix_3("", 2.0, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[5] = new rrfM_2(var7);
      rrfS_2[] var8 = new rrfS_2[]{
         new rrfS_2(iQ_2.class_, new ix_3("", 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.extends_, new ix_3("", 1.0, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[6] = new rrfM_2(var8);
      rrfS_2[] var9 = new rrfS_2[]{
         new rrfS_2(iQ_2.implements_, new ix_3("", 2.5, id_3.ADDITION), rXQ.OFFHAND),
         new rrfS_2(iQ_2.protected_, new ix_3("", -0.15, id_3.MULTIPLY_BASE), rXQ.OFFHAND),
         new rrfS_2(iQ_2.finally_, new ix_3("", 2.5, id_3.ADDITION), rXQ.OFFHAND)
      };
      var0[7] = new rrfM_2(var9);
      var0[8] = new rrfM_2[]{
         (rrfM_2)var0[0], (rrfM_2)var0[1], (rrfM_2)var0[2], (rrfM_2)var0[3], (rrfM_2)var0[4], (rrfM_2)var0[5], (rrfM_2)var0[6], (rrfM_2)var0[7]
      };
      var0[9] = new rrfM_2[]{
         (rrfM_2)var0[0], (rrfM_2)var0[1], (rrfM_2)var0[2], (rrfM_2)var0[3], (rrfM_2)var0[4], (rrfM_2)var0[5], (rrfM_2)var0[6], (rrfM_2)var0[7]
      };
      staticFields869ba89e075331349de8f9288d544af1 = var0;
   }
}
