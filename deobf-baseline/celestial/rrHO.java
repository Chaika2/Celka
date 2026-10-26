package celestial;

import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrHO implements Comparator<rrHJ> {
   public static Object[] id_class;
   public Object[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrHh_1()};
      id_class = var0;
   }

   public rrHO(List<rrHX> var1) {
      this.id_break();
      this.id_break[id_byte[18]] = var1;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{100, -76, -51, -64, -84, 95, -72, -53}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_class(rrHJ var1, rrHJ var2) {
      rfH_2 var3 = var1.id_break();
      rfH_2 var4 = var2.id_break();
      xc_3 var5 = var1.id_class();
      xc_3 var6 = var2.id_class();
      ComparisonChain var7 = ComparisonChain.start();

      for (rrHX var9 : (List)this.id_break[id_byte[0]]) {
         switch (((int[])rrHb_1.id_class[id_byte[1]])[var9.ordinal()]) {
            case 1:
               var7 = var7.compare(this.id_class(var6), this.id_class(var5));
               break;
            case 2:
               float var10 = var5.id_class(
                  (cb_3)MinecraftAccessor.id_import.id_class[id_byte[2]],
                  (rYB)((cb_3)MinecraftAccessor.id_import.id_class[id_byte[3]]).id_throws[id_byte[4]],
                  var3
               );
               float var11 = var6.id_class(
                  (cb_3)MinecraftAccessor.id_import.id_class[id_byte[5]],
                  (rYB)((cb_3)MinecraftAccessor.id_import.id_class[id_byte[6]]).id_throws[id_byte[7]],
                  var4
               );
               AutoTool var12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[8]]).id_private().id_for();
               if (var12.aJ_()) {
                  Pair var13 = var12.id_class(var5, var3);
                  Pair var14 = var12.id_class(var6, var4);
                  rdn_3 var15 = (rdn_3)var13.getLeft();
                  rdn_3 var16 = (rdn_3)var14.getLeft();
                  if (var15 != null && !var15.id_class()) {
                     var10 = var5.id_class(
                        (cb_3)MinecraftAccessor.id_import.id_class[id_byte[9]],
                        var15,
                        (rYB)((cb_3)MinecraftAccessor.id_import.id_class[id_byte[10]]).id_throws[id_byte[11]],
                        var3
                     );
                  }

                  if (var16 != null && !var16.id_class()) {
                     var11 = var6.id_class(
                        (cb_3)MinecraftAccessor.id_import.id_class[id_byte[12]],
                        var16,
                        (rYB)((cb_3)MinecraftAccessor.id_import.id_class[id_byte[13]]).id_throws[id_byte[14]],
                        var4
                     );
                  }
               }

               var7 = var7.compare(var11, var10);
               break;
            case 3:
               var7 = var7.compare(
                  ((cb_3)MinecraftAccessor.id_import.id_class[id_byte[15]]).id_break(var3),
                  ((cb_3)MinecraftAccessor.id_import.id_class[id_byte[16]]).id_break(var4)
               );
         }
      }

      return var7.result();
   }

   private static void id_class() {
      id_byte = new short[]{0, 1, 57, 57, 7, 57, 57, 7, 0, 57, 57, 7, 57, 57, 7, 57, 57, 0, 0};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4074299706301072164L;
   }

   public int id_class(xc_3 var1) {
      return ((Map)id_class[id_byte[17]]).getOrDefault(var1.id_break(), Integer.valueOf(id_throws[0]));
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1352951701;
   }

   private void id_break() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   private static void id_throws() {
      id_throws = new byte[]{-1};
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, true, true};
   }
}
