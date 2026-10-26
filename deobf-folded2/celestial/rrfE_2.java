package celestial;

import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrfE_2 {
   private static String[] stringsa1105bf70a073ebb8e16d8de80edaccd;
   private static boolean[] booleansa1105bf70a073ebb8e16d8de80edaccd;
   public static Object[] staticFieldsa1105bf70a073ebb8e16d8de80edaccd;
   private static byte[] bytesa1105bf70a073ebb8e16d8de80edaccd;
   public Object[] fieldsa1105bf70a073ebb8e16d8de80edaccd;
   private static short[] shortsa1105bf70a073ebb8e16d8de80edaccd;

   private static void id_byte() {
      Object[] var0 = new Object[8];
      staticFieldsa1105bf70a073ebb8e16d8de80edaccd = var0;
      rLY[] var3 = new rLY[]{new rLY(rLD.id_break, 800, 2, false, true, true, null), new rLY(rLD.id_this, 800, 2), new rLY(rLD.id_super, 800, 2)};
      rrfE_2 var2 = new rrfE_2(var3);
      Map var10002 = var2.id_class();
      rrfq_3 var10003 = Enum.valueOf(rrfq_3.class, "SPOOKY_TIME");
      rLY[] var4 = new rLY[]{new rLY(rLD.id_break, 100, 2), new rLY(rLD.id_this, 100, 2), new rLY(rLD.id_super, 100, 2)};
      var10002.put(var10003, var4);
      var0[0] = var2;
      rLY[] var6 = new rLY[]{new rLY(rLD.id_catch, 0, 1), new rLY(rLD.id_break, 480, 2)};
      rrfE_2 var5 = new rrfE_2(var6);
      var10002 = var5.id_class();
      var10003 = Enum.valueOf(rrfq_3.class, "SPOOKY_TIME");
      rLY[] var7 = new rLY[]{new rLY(rLD.id_catch, 1, 1), new rLY(rLD.id_break, 60, 2)};
      var10002.put(var10003, var7);
      var0[1] = var5;
      rLY[] var9 = new rLY[]{
         new rLY(rLD.id_continue, 480, 2), new rLY(rLD.id_package, 320, 0), new rLY(rLD.id_protected, 320, 0), new rLY(rLD.id_implements, 800, 0)
      };
      rrfE_2 var8 = new rrfE_2(var9);
      var10002 = var8.id_class();
      var10003 = Enum.valueOf(rrfq_3.class, "SPOOKY_TIME");
      rLY[] var10 = new rLY[]{
         new rLY(rLD.id_continue, 60, 2), new rLY(rLD.id_package, 40, 0), new rLY(rLD.id_protected, 40, 0), new rLY(rLD.id_implements, 100, 0)
      };
      var10002.put(var10003, var10);
      var0[2] = var8;
      rLY[] var12 = new rLY[]{new rLY(rLD.id_break, 800, 9), new rLY(rLD.id_protected, 320, 2)};
      rrfE_2 var11 = new rrfE_2(var12);
      var10002 = var11.id_class();
      var10003 = Enum.valueOf(rrfq_3.class, "SPOOKY_TIME");
      rLY[] var13 = new rLY[]{new rLY(rLD.id_break, 100, 8), new rLY(rLD.id_protected, 40, 2)};
      var10002.put(var10003, var13);
      var0[3] = var11;
      rLY[] var15 = new rLY[]{new rLY(rLD.id_class, 800, 4), new rLY(rLD.id_byte, 800, 2), new rLY(rLD.id_package, 480, 0)};
      rrfE_2 var14 = new rrfE_2(var15);
      var10002 = var14.id_class();
      var10003 = Enum.valueOf(rrfq_3.class, "SPOOKY_TIME");
      rLY[] var16 = new rLY[]{new rLY(rLD.id_class, 100, 4), new rLY(rLD.id_byte, 100, 2), new rLY(rLD.id_package, 60, 0)};
      var10002.put(var10003, var16);
      var0[4] = var14;
      rLY[] var18 = new rLY[]{new rLY(rLD.id_break, 1120, 4), new rLY(rLD.id_continue, 1120, 0), new rLY(rLD.id_case, 0, 0)};
      rrfE_2 var17 = new rrfE_2(var18);
      var10002 = var17.id_class();
      var10003 = Enum.valueOf(rrfq_3.class, "SPOOKY_TIME");
      rLY[] var19 = new rLY[]{new rLY(rLD.id_break, 140, 4), new rLY(rLD.id_continue, 140, 0), new rLY(rLD.id_case, 1, 0)};
      var10002.put(var10003, var19);
      var0[5] = var17;
      var0[6] = new rrfE_2[]{(rrfE_2)var0[0], (rrfE_2)var0[1], (rrfE_2)var0[2], (rrfE_2)var0[3], (rrfE_2)var0[4], (rrfE_2)var0[5]};
      var0[7] = new rrfE_2[]{(rrfE_2)var0[0], (rrfE_2)var0[1], (rrfE_2)var0[2], (rrfE_2)var0[3], (rrfE_2)var0[4], (rrfE_2)var0[5]};
   }

   private rrfE_2(rLY[] var3) {
      this.id_throws();
      EnumMap var8 = new EnumMap<>(rrfq_3.class);
      this.fieldsa1105bf70a073ebb8e16d8de80edaccd[1] = var8;
      this.fieldsa1105bf70a073ebb8e16d8de80edaccd[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 141268781;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4167774020214420484L;
   }

   public Map<rrfq_3, rLY[]> id_class() {
      return (Map<rrfq_3, rLY[]>)this.fieldsa1105bf70a073ebb8e16d8de80edaccd[1];
   }

   private static boolean id_class(rLY var0, rLY var1) {
      return var0.id_class() == var1.id_class() && var0.id_break() == var1.id_break() && var0.id_byte() == var1.id_byte()
         ? true
         : booleansa1105bf70a073ebb8e16d8de80edaccd[7];
   }

   public static rrfE_2 id_class(rdn_3 var0) {
      if (var0.id_break() != rdy_3.kz) {
         return null;
      } else {
         List var1 = rAB.id_class(var0);

         for (rrfE_2 var5 : (rrfE_2[])staticFieldsa1105bf70a073ebb8e16d8de80edaccd[6]) {
            rLY[] var6 = var5.id_break();
            if (var6.length == var1.size()) {
               boolean var7 = booleansa1105bf70a073ebb8e16d8de80edaccd[1];

               for (rLY var9 : var1) {
                  boolean var10 = false;

                  for (rLY var14 : var6) {
                     if (id_class(var9, var14)) {
                        var10 = true;
                        break;
                     }
                  }

                  if (!var10) {
                     var7 = false;
                     break;
                  }
               }

               if (var7) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{66, 82, 67, 68, 99, 25, 45, -68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rLY[] id_break() {
      rrfq_3 var1 = (rrfq_3)rrfp_3.id_class[1];
      if (var1 != null) {
         rLY[] var2 = (rLY[])((Map)this.fieldsa1105bf70a073ebb8e16d8de80edaccd[1]).get(var1);
         if (var2 != null) {
            return var2;
         }
      }

      return (rLY[])this.fieldsa1105bf70a073ebb8e16d8de80edaccd[0];
   }

   private void id_throws() {
      if (this.fieldsa1105bf70a073ebb8e16d8de80edaccd == null) {
         this.fieldsa1105bf70a073ebb8e16d8de80edaccd = new Object[2];
      }
   }

   private static void id_catch() {
      stringsa1105bf70a073ebb8e16d8de80edaccd = new String[]{
         new String("AGONIZING_ARROW"),
         new String("ZEUS_ARROW"),
         new String("BLOODY_ARROW"),
         new String("ICING_ARROW"),
         new String("LIGHT_ARROW"),
         new String("THERAPY_ARROW")
      };
   }

   private static void id_case() {
      bytesa1105bf70a073ebb8e16d8de80edaccd = new byte[]{
         6,
         2,
         3,
         4,
         5,
         3,
         2,
         2,
         2,
         2,
         2,
         2,
         2,
         4,
         2,
         2,
         3,
         2,
         3,
         2,
         9,
         2,
         3,
         4,
         3,
         4,
         2,
         2,
         4,
         5,
         3,
         4,
         2,
         5,
         7,
         6,
         4,
         3,
         100,
         2,
         100,
         2,
         2,
         100,
         2,
         4,
         2,
         60,
         2,
         2,
         4,
         4,
         60,
         2,
         40,
         2,
         40,
         3,
         100,
         3,
         4,
         2,
         100,
         8,
         40,
         2,
         4,
         4,
         3,
         100,
         4,
         100,
         2,
         2,
         60,
         5,
         4,
         3,
         4,
         2,
         2,
         8
      };
   }

   private static void id_implements() {
      shortsa1105bf70a073ebb8e16d8de80edaccd = new short[]{
         7, 1, 1, 0, 6, 1, 1, 0, 0, 1, 2, 3, 4, 5, 800, 800, 800, 480, 480, 320, 320, 800, 800, 320, 800, 800, 480, 1120, 1120, 140, 140
      };
   }

   private static void id_private() {
      booleansa1105bf70a073ebb8e16d8de80edaccd = new boolean[]{
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
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
         false
      };
   }
}
