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
   public static Object[] class_;
   public Object[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrHh_1()};
      class_ = var0;
   }

   public rrHO(List<rrHX> var1) {
      this.break_();
      this.break_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{100, -76, -51, -64, -84, 95, -72, -53}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int class_(rrHJ var1, rrHJ var2) {
      rfH_2 var3 = var1.break_();
      rfH_2 var4 = var2.break_();
      xc_3 var5 = var1.class_();
      xc_3 var6 = var2.class_();
      ComparisonChain var7 = ComparisonChain.start();

      for (rrHX var9 : (List)this.break_[0]) {
         switch (((int[])rrHb_1.class_[1])[var9.ordinal()]) {
            case 1:
               var7 = var7.compare(this.class_(var6), this.class_(var5));
               break;
            case 2:
               float var10 = var5.class_((cb_3)MinecraftAccessor.import_.class_[57], (rYB)((cb_3)MinecraftAccessor.import_.class_[57]).throws_[7], var3);
               float var11 = var6.class_((cb_3)MinecraftAccessor.import_.class_[57], (rYB)((cb_3)MinecraftAccessor.import_.class_[57]).throws_[7], var4);
               AutoTool var12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().for_();
               if (var12.aJ_()) {
                  Pair var13 = var12.class_(var5, var3);
                  Pair var14 = var12.class_(var6, var4);
                  rdn_3 var15 = (rdn_3)var13.getLeft();
                  rdn_3 var16 = (rdn_3)var14.getLeft();
                  if (var15 != null && !var15.class_()) {
                     var10 = var5.class_((cb_3)MinecraftAccessor.import_.class_[57], var15, (rYB)((cb_3)MinecraftAccessor.import_.class_[57]).throws_[7], var3);
                  }

                  if (var16 != null && !var16.class_()) {
                     var11 = var6.class_((cb_3)MinecraftAccessor.import_.class_[57], var16, (rYB)((cb_3)MinecraftAccessor.import_.class_[57]).throws_[7], var4);
                  }
               }

               var7 = var7.compare(var11, var10);
               break;
            case 3:
               var7 = var7.compare(((cb_3)MinecraftAccessor.import_.class_[57]).break_(var3), ((cb_3)MinecraftAccessor.import_.class_[57]).break_(var4));
         }
      }

      return var7.result();
   }

   private static void class_() {
      byte_ = new short[]{0, 1, 57, 57, 7, 57, 57, 7, 0, 57, 57, 7, 57, 57, 7, 57, 57, 0, 0};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4074299706301072164L;
   }

   public int class_(xc_3 var1) {
      return ((Map)class_[0]).getOrDefault(var1.break_(), -1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1352951701;
   }

   private void break_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }

   private static void throws_() {
      throws_ = new byte[]{-1};
   }

   private static void protected_() {
      protected_ = new boolean[]{false, true, true};
   }
}
